/*
 * CircleTester.java
 * Author:  Samir Hadi Cisneros 
 * Submission Date:  02 March 2021
 *
 * Purpose: This program works in conjucntion with the previously written Circle.Java class to test the methods used there.
 * This program prints out the values of diameter, area, and perimeter of each circle and tells you if the inputted values pass or fail.
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
 * 
 * I agree
 */


//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
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

		System.out.println("circle1=diameter: " + circle1.diameter() + "\narea: " + circle1.area() + "\nperimeter: "
				+ circle1.perimeter());

		// print circle2 diameter, area and perimeter

		System.out.println("circle2=diameter: " + circle2.diameter() + "\narea: " + circle2.area() + "\nperimeter: "
				+ circle2.perimeter());

		// display whether circle1 is a unit circle

		if (circle1.isUnitCircle() == true) {
			System.out.println("circle1 is a unit circle");
		} else {
			System.out.println("circle1 is not a unit circle");
		}

		// display whether circle2 is a unit circle

		if (circle2.isUnitCircle() == true) {
			System.out.println("circle2 is a unit circle\n");
		} else {
			System.out.println("circle2 is not a unit cirlce\n");
		}

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.

		// Tests for equals method
		// #1
		if (circle1.equals(circle2)) {
			System.out.println("PASSED: Equals");
		} else {
			System.out.println("FAILED: Equals");
		}
		// #2
		if (circle2.equals(circle1)) {
			System.out.println("PASSED: Equals");
		} else {
			System.out.println("FAILED: Equals");
		}
		// #3
		circle2.setRadius(2);
		circle2.setX(-3.0);
		circle2.setY(4.0);
		if (circle1.equals(circle2)) {
			System.out.println("PASSED: Equals");
		} else {
			System.out.println("FAILED: Equals");
		}

		// Tests for distance method
		// #1
		System.out.println("Distance is " + circle1.distance(circle2));
		// #2
		circle2.setX(2.0);
		circle2.setY(8.0);
		System.out.println("Distance is " + circle2.distance(circle1));
		// #3
		circle1.setX(5.0);
		circle1.setY(3.0);
		System.out.println("Distance is " + circle1.distance(circle2));

		// Tests for isSmaller method
		// #1
		if (circle1.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller");
		} else {
			System.out.println("FAILED: isSmaller");
		}
		// #2
		circle1.setRadius(1.0);
		if (circle1.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller");
		} else {
			System.out.println("FAILED: isSmaller");
		}
		// #3
		circle2.setRadius(0.5);
		if (circle2.isSmaller(circle1)) {
			System.out.println("PASSED: isSmaller");
		} else {
			System.out.println("FAILED: isSmaller");
		}

		// Tests for compareTo method
		// #1
		System.out.println("CompareTo is " + circle1.compareTo(circle2));
		// #2
		circle1.setRadius(1.0);
		circle2.setRadius(4.0);
		System.out.println("CompareTo is " + circle1.compareTo(circle2));
		// #3
		circle2.setRadius(1.0);
		System.out.println("CompareTo is " + circle2.compareTo(circle1));

		// Tests for intersects method
		// #1
		if (circle1.intersects(circle2)) {
			System.out.println("PASSED: Intersects");
		} else {
			System.out.println("FAILED: Intersects");
		}
		// #2
		circle1.setX(1.0);
		circle1.setY(1.0);
		circle2.setX(1.0);
		circle2.setY(1.0);
		if (circle1.intersects(circle2)) {
			System.out.println("PASSED: Intersects");
		} else {
			System.out.println("FAILED: Intersects");
		}
		// #3
		circle1.setX(2.0);
		circle1.setY(1.0);
		circle2.setX(5.0);
		circle2.setY(1.0);
		if (circle2.intersects(circle1)) {
			System.out.println("PASSED: Intersects");
		} else {
			System.out.println("FAILED: Intersects");
		}

	}

}