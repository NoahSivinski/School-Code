/*
 * CircleTester.java
 * Author:  Alice Szymkiewicz 
 * Submission Date:  04/2/2021
 *
 * Purpose: 
 * 
 * This class contains a driver program to test out the 
 * Circle class. This class will print out the name, center 
 * and radius of circle1 and circle2 with set radius values. 
 * With circle2 set to the radius of 5.3, the program prints 
 * out the diameter, area, and perimeter of circle 1 and 2. 
 * This class uses the Circle class methods to print out and 
 * test such values. There is a circle 3 declared as
 * well in this class to add a third test for Circle class. 
 * This program also prints out if the circles pass the comparing,
 * if unit circle, and intersecting tests.  
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
		
		System.out.println("circle1 information \n" + circle1);
		System.out.println();
		System.out.println("circle2 information \n" + circle2);

		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0);

		// This is a unit test. It is best to have tests output pass or fail instead of
		// just a bunch of values.
		// Notice how the double comparison is done
		if (Math.abs(2 - circle1.getRadius()) < THRESHOLD)
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
		// the method toString, why?
		System.out.println();
		System.out.println("center of circle1: (" + circle1.getX() + ", " + circle1.getY() + ")\nradius of circle1: " + circle1.getRadius());
		
		System.out.println();
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println("center of circle2: (" + circle2.getX() + ", " + circle2.getY() + ")\nradius of circle2: " + circle2.getRadius());
		System.out.println();
		
		// print circle1 diameter, area and perimeter
		System.out.println("diameter of circle1: " + circle1.diameter() + "\narea of circle1: " + circle1.area() + "\nperimeter of circle1: "
				+ circle1.perimeter());
		System.out.println();
		
		// print circle2 diameter, area and perimeter
		System.out.println("diameter of circle2: " + circle2.diameter() + "\narea of circle2: " + circle2.area() + "\nperimeter of circle2: "
				+ circle2.perimeter());
		System.out.println();
		
		// display whether circle1 is a unit circle
		System.out.println(circle1.getName() + " is a unit circle: " + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle	
		System.out.println(circle2.getName() + " is a unit circle: " + circle2.isUnitCircle());
		
		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.
		Circle circle3 = new Circle();
		circle3.setName("circle3");
		circle3.setRadius(1);
		circle3.setX(0);
		circle3.setY(0);
		
		// isUnitCircle tester
		if (circle3.isUnitCircle()) {
			System.out.println("circle3 PASS: isUnitCircle");
		} 
		else {
			System.out.println("circle3 FAIL: isUnitCircle");
		}
		System.out.println();

		circle1.setX(0);
		circle1.setY(0);
		circle1.setRadius(1);
		
		// equals method tester
		if (circle1.equals(circle3)) {
			System.out.println("circle1 PASS: equals");
		} 
		else {
			System.out.println("circle1 FAIL: equals");
		}

		// first compareTo method tester
		if (circle3.compareTo(circle1) == 0) {
			System.out.println("circle3 PASS: compareTo circle1");
		} 
		else {
			System.out.println("circle3 FAIL: compareTo circle1");
		}

		// isSmaller tester
		circle3.setRadius(5);
		if (circle1.isSmaller(circle3)) {
			System.out.println("circle1 PASS: isSmaller circle3");
		} 
		else {
			System.out.println("circle1 FAIL: isSmaller circle3");
		}
		System.out.println();

		// second compareTo tester
		if (circle3.compareTo(circle1) == 1) {
			System.out.println("circle3 compareTo circle1 equals 1 PASS: compareTo");
		} 
		else {
			System.out.println("circle3 compareTo circle1 equals 1 FAIL: compareTo");
		}

		// third compareTo tester
		if (circle1.compareTo(circle3) == -1) {
			System.out.println("circle1 compareTo circle3 equals -1 PASS: compareTo");
		} 
		else {
			System.out.println("circle1 compareTo circle3 equals -1 FAIL: compareTo");
		}
		System.out.println();
		
		if (circle1.intersects(circle2)) {
			System.out.println("circle1 intersects circle2 PASS: intersects");
		} 
		else {
			System.out.println("circle1 intersects circle2 PASS FAIL: intersects");
		}

		System.out.println();
		System.out.println("Distance: " + circle1.distance(circle2) + " and sum of radius is: " + circle1.getRadius()
				+ " and " + circle2.getRadius());
	}

}