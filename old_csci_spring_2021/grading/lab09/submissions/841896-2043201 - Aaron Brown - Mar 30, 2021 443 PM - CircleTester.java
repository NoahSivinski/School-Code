/*
 * CircleTester.java
 * Author: Aaron Brown
 * Submission Date: 03/30/2021
 *
 * Purpose: This file in the Circle class is used to test the methods
 * created in the Circle.java file. The beginning makes sure that the
 * getter and setter methods work properly, and prints out the the
 * perimeter, area, diameter of the circles. The end makes sure that
 * isUnitCircle, equals, isSmaller, compareTo, intersects, and distance
 * methods pass at least 3 unit tests.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */
public class CircleTester {
public static final double THRESHOLD = 0.000000001;
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		//Notice how the double comparison is done
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		System.out.println("circle1 = "+circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2 = "+circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println(circle1.diameter());
		System.out.println(circle1.area());
		System.out.println(circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println(circle2.diameter());
		System.out.println(circle2.area());
		System.out.println(circle2.perimeter());
		// display whether circle1 is a unit circle
		if(circle1.isUnitCircle()) System.out.println("Circle1 is a unit circle!");
		else System.out.println("Circle1 is not a unit circle.");
		// display whether circle2 is a unit circle
		if(circle2.isUnitCircle()) System.out.println("Circle2 is a unit circle!");
		else System.out.println("Circle2 is not a unit circle.");
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		// The following is a unit test for the equals method that should return passed.
		circle1.setRadius(2);
		circle2.setRadius(2);
		circle1.setX(1);
		circle2.setX(1);
		circle1.setY(1);
		circle2.setY(1);
		if(circle1.equals(circle2)) System.out.println("Equals test passed.");
		else System.out.println("Equals test failed.");
		
		// The following unit test for the equals method checks with different radius values.
		circle1.setRadius(3);
		if(circle1.equals(circle2)) System.out.println("Equals test failed.");
		else System.out.println("Equals test passed.");
		
		// The following unit test has the same radius but different x values
		// and checks the equals method.
		circle1.setRadius(2);
		circle1.setX(3);
		if(circle1.equals(circle2)) System.out.println("Equals test failed.");
		else System.out.println("Equals test passed.");
		
		/* The following sets the distance to where if the method 
		 * is set up properly the value returned should equal 4.
		 */
		circle1.setX(8);
		circle2.setX(8);
		circle1.setY(5);
		circle2.setY(1);
		if(Math.abs(circle1.distance(circle2)) - 4 < THRESHOLD)
			System.out.println("Distance test passed.");
		else System.out.println("Distance test failed.");
		
		/* The following tests the distance with values that should return
		 * the square root of 2 as the distance.
		 */
		circle1.setX(2);
		circle2.setX(2);
		circle1.setY(1);
		circle2.setY(1);
		if(Math.abs(circle1.distance(circle2)) - (Math.sqrt(2.0)) < THRESHOLD)
			System.out.println("Distance test passed.");
		else System.out.println("Distance test failed.");
		
		/* The following tests the distance with values that should return
		 * the square root of 477770 as the distance.
		 */
		circle1.setX(89);
		circle2.setX(72);
		circle1.setY(782);
		circle2.setY(91);
		if(Math.abs(circle1.distance(circle2)) - (Math.sqrt(477770)) < THRESHOLD)
			System.out.println("Distance test passed.");
		else System.out.println("Distance test failed.");
		
		/* The following test of the isSmaller method should be passed
		 * since the diameter of the first circle will equal 12.4 and the
		 * other circle will be 15.6.
		 */
		circle1.setRadius(6.2);
		circle2.setRadius(7.8);
		if(circle1.isSmaller(circle2))
			System.out.println("isSmaller test passed.");
		else System.out.println("isSmaller test failed.");
		
		/* The following test of the isSmaller method should pass
		 * when the first circle is bigger than the second circle.
		 */
		circle1.setRadius(7.9);
		circle2.setRadius(7.8);
		if(circle1.isSmaller(circle2))
			System.out.println("isSmaller test failed.");
		else System.out.println("isSmaller test passed.");
		
		/* The following test of the isSmaller method should pass
		 * when the first circle is the same size as the second circle.
		 */
		circle1.setRadius(7.8);
		circle2.setRadius(7.8);
		if(circle1.isSmaller(circle2))
			System.out.println("isSmaller test failed.");
		else System.out.println("isSmaller test passed.");
		
		/* The following test of the compareTo method should pass
		 * when the first circle is the same size as the second circle.
		 */
		circle1.setRadius(7.8);
		circle2.setRadius(7.8);
		if(circle1.compareTo(circle2) == 0)
			System.out.println("compareTo test passed.");
		else System.out.println("compareTo test failed.");
		
		/* The following test of the compareTo method should pass
		 * when the first circle is bigger than the second circle.
		 */
		circle1.setRadius(7.9);
		circle2.setRadius(7.8);
		if(circle1.compareTo(circle2) == 1)
			System.out.println("compareTo test passed.");
		else System.out.println("compareTo test failed.");
		
		/* The following test of the compareTo method should pass
		 * when the first circle is bigger than the second circle.
		 */
		circle1.setRadius(7.8);
		circle2.setRadius(7.9);
		if(circle1.compareTo(circle2) == -1)
			System.out.println("compareTo test passed.");
		else System.out.println("compareTo test failed.");
		
		/* The following test of the intersects method should pass
		 * when the circles intersect by the labs definition.
		 */
		circle1.setX(5);
		circle2.setX(3);
		circle1.setY(4);
		circle2.setY(2);
		circle1.setRadius(2);
		circle2.setRadius(2);
		if(circle1.intersects(circle2))
			System.out.println("Intersects test passed.");
		else System.out.println("Intersects test failed.");
		
		/* The following test of the intersects method should pass
		 * when the circles do not intersect by the labs definition.
		 */
		circle1.setX(5);
		circle2.setX(3);
		circle1.setY(4);
		circle2.setY(2);
		circle1.setRadius(1);
		circle2.setRadius(1);
		if(circle1.intersects(circle2))
			System.out.println("Intersects test failed.");
		else System.out.println("Intersects test passed.");
		
		/* The following test of the intersects method should pass
		 * when the circles have the same distance as the sum of their
		 * radii.
		 */
		circle1.setX(8);
		circle2.setX(8);
		circle1.setY(5);
		circle2.setY(1);
		circle1.setRadius(2);
		circle2.setRadius(2);
		if(circle1.intersects(circle2))
			System.out.println("Intersects test failed.");
		else System.out.println("Intersects test passed.");
	}
}
