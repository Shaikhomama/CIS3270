package edu.gsu.cis3270.Chapter4;

/*
 * (Geography: estimate areas ) Find the GPS locations for Atlanta, Georgia;
 * Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from
 * www.gps-data-team.com/map/ and compute the estimated area enclosed by these
 * four cities. (Hint: Use the formula in Programming Exercise 4.2 to compute the
 * distance between two cities. Divide the polygon into two triangles and use the
 * formula in Programming Exercise 2.19 to compute the area of a triangle.
 */
public class Chap4_3 {
	//d = radius * arccos(sin(x1 ) * sin(x2 ) + cos(x1 ) * cos(x2 ) * cos(y1 - y2 ))
	//below is a function for the above formula, it computes the distance between 2 cities
	public static double distanceBtwnTwoCities(double radius, double x1, double y1, double x2, double y2) {
		double distanceBtwn2points = radius * Math.cos(Math.sin(Math.toRadians(x1))) * Math.sin(Math.toRadians(x2))
        		+ Math.cos(Math.toRadians(x1)) *Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1-y2));
		return distanceBtwn2points;
	}
	// checks if the triangle is real
	public static boolean isTriangle(double side1, double side2, double side3) {
		return( (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2));
	}
	// computes area
	public static double area(double side1, double side2, double side3 ) {
		double s = (side1 + side2 + side3) / 2.0;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
	}
	
	public static void main(String[] args) {

        double AtlantaGaX = 33.7489954;
        double AtlantaGaY = -84.3879824;
        
        double OrlandoFlX = 28.5383355;
        double OrlandoFlY = -81.3792364999;
        
        double SavannahGaX = 32.0835407;
        double SavannahGaY = -81.09983419999998;
       
        double CharlotteNcX = 35.2270869;
        double CharlotteNcY = -80.84312669999997;
        
        final double AVG_EARTH_RADIUS = 6371.01;
        
        // divide into two triangles
        
        double triangle1_sideAB = distanceBtwnTwoCities(AVG_EARTH_RADIUS, AtlantaGaX, AtlantaGaY, OrlandoFlX, OrlandoFlY);
        double triangle1_sideBC = distanceBtwnTwoCities(AVG_EARTH_RADIUS, OrlandoFlX, OrlandoFlY, SavannahGaX, SavannahGaY);
        double triangle1_sideCA = distanceBtwnTwoCities(AVG_EARTH_RADIUS, SavannahGaX, SavannahGaY, AtlantaGaX, AtlantaGaY);
        
        double triangle2_sideAB = distanceBtwnTwoCities(AVG_EARTH_RADIUS, CharlotteNcX, CharlotteNcY, AtlantaGaX, AtlantaGaY);
        double triangle2_sideBC = distanceBtwnTwoCities(AVG_EARTH_RADIUS, AtlantaGaX, AtlantaGaY, OrlandoFlX, OrlandoFlY);
        double triangle2_sideCA = distanceBtwnTwoCities(AVG_EARTH_RADIUS, OrlandoFlX, OrlandoFlY, CharlotteNcX, CharlotteNcY);
        
        //compute the area of the triangles if they are real
        // tests if the triangles are real using the function isTriangle
        boolean triangle1 = isTriangle(triangle1_sideAB, triangle1_sideBC, triangle1_sideCA);
        boolean triangle2 = isTriangle(triangle2_sideAB, triangle2_sideBC, triangle2_sideCA);
        
        double triangle1_area = area(triangle1_sideAB, triangle1_sideBC, triangle1_sideCA);
        double triangle2_area = area(triangle2_sideAB, triangle2_sideBC, triangle2_sideCA);
        
        if (triangle1 && triangle2) {
        	System.out.printf("Triangle No.1's sides: %f , %f , %f : Area = %f\n", triangle1_sideAB, triangle1_sideBC, triangle1_sideCA, triangle1_area);
        	System.out.printf("Triangle No.1's sides: %f , %f , %f : Area = %f\n",triangle2_sideAB, triangle2_sideBC, triangle2_sideCA, triangle2_area);
        	double total_area = triangle1_area + triangle2_area;
        	System.out.println("The total area is " + total_area);
        }
        else {
        	System.out.println("The points are incorect");
        }
        }
}