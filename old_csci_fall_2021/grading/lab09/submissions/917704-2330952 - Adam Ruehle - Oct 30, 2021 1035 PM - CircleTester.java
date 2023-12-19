/*
 * [CSCI1301].java
 * Author:  Adam Ruehle 
 * Submission Date:  Oct. 30, 2021
 *
 * Purpose: The purpose of this program is to test the
 * Circle class using many different x, y, and radius
 * values for the circle1 and circle2 objects.
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

//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle. Use the default constructor
//  in the Circle class to create Circle objects. 
// 
//*******************************************************
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
		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);

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
		System.out.println("circle1=" + circle1);

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println("circle2=" + circle2);

		// print circle1 diameter, area and perimeter
		System.out.println("cirlce1 diameter: " + circle1.diameter());
		System.out.println("circle1 area: " + circle1.area());
		System.out.println("circle1 perimeter: " + circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("cirlce2 diameter: " + circle2.diameter());
		System.out.println("circle2 area: " + circle2.area());
		System.out.println("circle2 perimeter: " + circle2.perimeter());

		// display whether circle1 is a unit circle
		System.out.print("Is circle1 a unit circle? ");
		if (circle1.isUnitCircle()) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		// display whether circle2 is a unit circle
		System.out.print("Is circle2 a unit circle? ");
		if (circle2.isUnitCircle()) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.

		// Equals method test
		circle1.setX(1);
		circle1.setY(0);
		circle1.setRadius(2.0);
		circle2.setX(0);
		circle2.setY(0);
		circle2.setRadius(1.0);

		System.out.println();
		if (circle1.equals(circle2)) {
			System.out.println("PASSED: equals");
		} else {
			System.out.println("FAILED: equals");
		}

		circle1.setX(0);
		if (circle1.equals(circle2)) {
			System.out.println("FAILED: equals");
		} else {
			System.out.println("PASSED: equals");
		}

		circle1.setRadius(1.0);
		if (circle1.equals(circle2)) {
			System.out.println("PASSED: equals");
		} else {
			System.out.println("FAILED: equals");
		}

		// Distance method testing
		System.out.println();
		if (circle1.distance(circle2) <= THRESHOLD) {
			System.out.println("PASSED: distance");
		} else {
			System.out.println("FAILED: distance");
		}

		circle1.setX(3);
		if (Math.abs(circle1.distance(circle2)) <= THRESHOLD) {
			System.out.println("PASSED: distance");
		} else {
			System.out.println("FAILED: distance");
		}

		circle1.setX(-5);
		if (Math.abs(circle1.distance(circle2)) <= THRESHOLD) {
			System.out.println("PASSED: distance");
		} else {
			System.out.println("FAILED: distance");
		}

		// isSmaller Method Testing
		System.out.println();
		if (circle1.isSmaller(circle2)) {
			System.out.println("FAILED: isSmaller");
		} else {
			System.out.println("PASSED: isSmaller");
		}

		circle2.setRadius(30);
		if (circle1.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller");
		} else {
			System.out.println("FAILED: isSmaller");
		}

		circle1.setRadius(50);
		if (circle1.isSmaller(circle2)) {
			System.out.println("FAILED: isSmaller");
		} else {
			System.out.println("PASSED: isSmaller");
		}

		// compareTo Method Testing
		// Circle1 radius = 50. Circle 2 radius = 30.
		System.out.println();
		circle2.setRadius(10);
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("PASSED: compareTo");
		} else {
			System.out.println("FAILED: compareTo");
		}

		circle1.setRadius(10);
		if (circle1.compareTo(circle2) == 0) {
			System.out.println("PASSED: compareTo");
		} else {
			System.out.println("FAILED: compareTo");
		}
		circle1.setRadius(5);
		if (circle1.compareTo(circle2) == -1) {
			System.out.println("PASSED: compareTo");
		} else {
			System.out.println("FAILED: compareTo");
		}

		// intersects Method Testing
		// Circle1 (x, y) = (-5, 0). Circle2 (x, y) = (0, 0)
		circle1.setRadius(1);
		circle2.setRadius(2);
		System.out.println();
		System.out.println("Distance between circle1 and circle2: " + circle1.distance(circle2));
		double addRadius = circle1.getRadius() + circle2.getRadius();
		System.out.println("Sum of radius circle1 and circle2: " + addRadius);
		if (circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects");
		} else {
			System.out.println("FAILED: intersects");
		}

		circle1.setRadius(5);
		circle2.setRadius(1);
		System.out.println();
		System.out.println("Distance circle 1 and circle2: " + circle1.distance(circle2));
		addRadius = circle1.getRadius() + circle2.getRadius();
		System.out.println("Sum of radius circle1 and circle2: " + addRadius);
		if (circle1.intersects(circle2)) {
			System.out.println("FAILED: intersects");
		} else {
			System.out.println("PASSED: intersects");
		}

		circle1.setX(3);
		circle1.setY(1);
		System.out.println();
		System.out.println("Distance circle1 and circle2: " + circle1.distance(circle2));
		addRadius = circle1.getRadius() + circle2.getRadius();
		System.out.println("Sum of radius circle1 and circle2: " + addRadius);
		if (circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects");
		} else {
			System.out.println("FAILED: intersects");
		}

	}

}
