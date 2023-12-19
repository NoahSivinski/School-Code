//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
/*
 * CircleTester.java
 * Author:  Angel Marsh 
 * Submission Date:  April 2, 2021
 *
 * Purpose: The purpose of this program is to serve as a client
 * that tests the functionality of the objects in the Circle class.
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
		System.out.println("circle1=\n" + circle1);
		System.out.println("circle2=\n" + circle2);

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
		System.out.println("name: " + circle1.getName());
		System.out.println("center: " + "(" + circle1.getX() + ", " + circle1.getY() + ")");
		System.out.println("radius: " + circle1.getRadius());

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println("name: " + circle2.getName());
		System.out.println("center: " + "(" + circle2.getX() + ", " + circle2.getY() + ")");
		System.out.println("radius: " + circle2.getRadius());

		// print circle1 diameter, area and perimeter
		System.out.println("Circle 1:");
		System.out.println("diameter: " + circle1.diameter());
		System.out.println("area: " + circle1.area());
		System.out.println("perimeter: " + circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("Circle 2:");
		System.out.println("diameter: " + circle2.diameter());
		System.out.println("area: " + circle2.area());
		System.out.println("perimeter: " + circle2.perimeter());

		// display whether circle1 is a unit circle
		System.out.println(circle1.isUnitCircle());

		// display whether circle2 is a unit circle
		System.out.println(circle2.isUnitCircle());

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.

		// equals:
		// first test case for equals() method
		circle1.setRadius(2.0);
		circle2.setRadius(2.0);
		// the radii are equal but the x & y values aren't; false is returned
		if (!circle1.equals(circle2)) {
			System.out.println("PASSED: Equals");
		} else {
			System.out.println("FAILED: Equals");
		}
		// second test case for equals() method
		circle1.setX(2.0);
		circle2.setX(2.0);
		// the radii & x-values are equal but the y values aren't; false is returned
		if (!circle1.equals(circle2)) {
			System.out.println("PASSED: Equals");
		} else {
			System.out.println("FAILED: Equals");
		}
		// third test case for equals() method
		circle1.setY(2.0);
		circle2.setY(2.0);
		// the radii & the x and y-values are equal; true is returned
		if (circle1.equals(circle2)) {
			System.out.println("PASSED: Equals");
		} else {
			System.out.println("FAILED: Equals");
		}
		// fourth test case for the equals() method
		// the x-values are equal but the y-values & radii aren't; false is returned
		circle1.setX(7.0);
		circle2.setX(7.0);
		circle1.setY(1.0);
		circle2.setY(2.0);
		circle1.setRadius(5.0);
		circle2.setRadius(8.0);
		if (!circle1.equals(circle2)) {
			System.out.println("PASSED: Equals");
		} else {
			System.out.println("FAILED: Equals");
		}
		// fifth test case for the equals() method
		// the x & y-values are equal but the radii aren't; false is returned
		circle1.setX(7.0);
		circle2.setX(7.0);
		circle1.setY(2.0);
		circle2.setY(2.0);
		circle1.setRadius(5.0);
		circle2.setRadius(8.0);
		if (!circle1.equals(circle2)) {
			System.out.println("PASSED: Equals");
		} else {
			System.out.println("FAILED: Equals");
		}
		// sixth test case for the equals() method
		// none of the values are equal; false is returned
		circle1.setX(7.0);
		circle2.setX(4.0);
		circle1.setY(2.0);
		circle2.setY(1.0);
		circle1.setRadius(5.0);
		circle2.setRadius(8.0);
		if (!circle1.equals(circle2)) {
			System.out.println("PASSED: Equals");
		} else {
			System.out.println("FAILED: Equals");
		}
		// seventh test case for the equals() method
		// the y-values & the radii are equal but the x-values aren't; false is returned
		circle1.setY(2.0);
		circle2.setY(2.0);
		circle1.setRadius(5.0);
		circle2.setRadius(5.0);
		if (!circle1.equals(circle2)) {
			System.out.println("PASSED: Equals");
		} else {
			System.out.println("FAILED: Equals");
		}
		// eighth test for the equals() method
		// the x-values & the radii are equal but the y-values aren't; false is returned
		circle1.setX(2.0);
		circle2.setX(2.0);
		circle1.setY(4.0);
		circle2.setY(11.0);
		if (!circle1.equals(circle2)) {
			System.out.println("PASSED: Equals");
		} else {
			System.out.println("FAILED: Equals");
		}

		// distance:
		// first test case for the distance() method
		// the distance between the centers of the two circles is zero and 0 is returned
		circle1.setX(10.0);
		circle2.setX(10.0);
		circle1.setY(20.0);
		circle2.setY(20.0);
		if (Math.abs(circle1.distance(circle2) - 0) < THRESHOLD) {
			System.out.println("PASSED: Distance");
		} else {
			System.out.println("FAILED: Distance");
		}
		// second test case for the distance() method
		// the distance between the centers of the two circles is a positive number
		circle1.setX(-1.0);
		circle2.setX(2.0);
		circle1.setY(-5.0);
		circle2.setY(10.0);
		if (circle1.distance(circle2) > 0) {
			System.out.println("PASSED: Distance");
		} else {
			System.out.println("FAILED: Distance");
		}
		// third test case for the distance() method
		// the distance between the Circle 1 and Circle 2 = the distance between Circle
		// 2 and Circle 1
		circle1.setX(3.0);
		circle2.setX(6.0);
		circle1.setY(0.0);
		circle2.setY(4.0);
		if (Math.abs(circle1.distance(circle2) - circle2.distance(circle1)) < THRESHOLD) {
			System.out.println("PASSED: Distance");
		} else {
			System.out.println("FAILED: Distance");
		}

		// isSmaller:
		// first test case for isSmaller() method
		// Circle 1 < Circle 2 & true is returned
		circle1.setRadius(1.0);
		circle2.setRadius(2.0);
		if (circle1.isSmaller(circle2)) {
			System.out.println("PASSED: Is Smaller");
		} else {
			System.out.println("FAILED: Is Smaller");
		}
		// second test case for isSmaller() method
		// if Circle 1 < Circle 2, Circle 1's area < Circle 2's area
		if (circle1.area() < circle2.area()) {
			System.out.println("PASSED: Is Smaller");
		} else {
			System.out.println("FAILED: Is Smaller");
		}
		// third test case for isSmaller() method
		// if Circle 1 < Circle 2, Circle 1's perimeter < Circle 2's perimeter
		if (circle1.perimeter() < circle2.perimeter()) {
			System.out.println("PASSED: Is Smaller");
		} else {
			System.out.println("FAILED: Is Smaller");
		}
		// fourth test case for isSmaller() method
		// if Circle 1 radius = Circle 2 radius & false is returned
		circle1.setRadius(2.0);
		circle2.setRadius(2.0);
		if (!circle1.isSmaller(circle2)) {
			System.out.println("PASSED: Is Smaller");
		} else {
			System.out.println("FAILED: Is Smaller");
		}
		// fifth test case for isSmaller() method
		// if Circle 1 = Circle 2, Circle 1's area = Circle 2's area
		if (Math.abs(circle1.area() - circle2.area()) < THRESHOLD) {
			System.out.println("PASSED: Is Smaller");
		} else {
			System.out.println("FAILED: Is Smaller");
		}
		// sixth test case for isSmaller() method
		// if Circle 1 = Circle 2, Circle 1's perimeter = Circle 2's perimeter
		if (Math.abs(circle1.perimeter() - circle2.perimeter()) < THRESHOLD) {
			System.out.println("PASSED: Is Smaller");
		} else {
			System.out.println("FAILED: Is Smaller");
		}
		// seventh test case for isSmaller() method
		// Circle 1 > Circle 2 & false is returned
		circle1.setRadius(2.0);
		circle2.setRadius(1.0);
		if (!circle1.isSmaller(circle2)) {
			System.out.println("PASSED: Is Smaller");
		} else {
			System.out.println("FAILED: Is Smaller");
		}
		// eighth test case for isSmaller() method
		// if Circle 1 > Circle 2, Circle 1's area > Circle 2's area
		if (circle1.area() > circle2.area()) {
			System.out.println("PASSED: Is Smaller");
		} else {
			System.out.println("FAILED: Is Smaller");
		}
		// ninth test case for isSmaller() method
		// if Circle 1 > Circle 2, Circle 1's perimeter > Circle 2's perimeter
		if (circle1.perimeter() > circle2.perimeter()) {
			System.out.println("PASSED: Is Smaller");
		} else {
			System.out.println("FAILED: Is Smaller");
		}

		// compare to:
		// first test case for the compareTo() method
		// Circle 1 > Circle 2 & 1 is returned
		circle1.setRadius(5.0);
		circle2.setRadius(1.0);
		if (Math.abs(circle1.compareTo(circle2) - 1) < THRESHOLD) {
			System.out.println("PASSED: Compare To");
		} else {
			System.out.println("FAILED: Compare To");
		}
		// second test case for the compareTo() method
		// Circle 1 < Circle 2 & -1 is returned
		circle1.setRadius(3.0);
		circle2.setRadius(4.0);
		if (Math.abs(circle1.compareTo(circle2) + 1) < THRESHOLD) {
			System.out.println("PASSED: Compare To");
		} else {
			System.out.println("FAILED: Compare To");
		}
		// third test case for the compareTo() method
		// Circle 1 = Circle 2 & 0 is returned
		circle1.setRadius(6.0);
		circle2.setRadius(6.0);
		if (Math.abs(circle1.compareTo(circle2) - 0) < THRESHOLD) {
			System.out.println("PASSED: Compare To");
		} else {
			System.out.println("FAILED: Compare To");
		}

		// intersects:
		// first test case for intersects() method
		// distance < sum of radii & true is returned
		circle1.setX(1.0);
		circle2.setX(2.0);
		circle1.setY(4.0);
		circle2.setY(2.0);
		circle1.setRadius(99.0);
		circle2.setRadius(99.0);
		if (circle1.intersects(circle2)) {
			System.out.println("PASSED: Intersects");
		} else {
			System.out.println("FAILED: Intersects");
		}
		// second test case for intersects() method
		// distance > sum of radii & false is returned
		circle1.setX(0.0);
		circle2.setX(10.0);
		circle1.setY(20.0);
		circle2.setY(5.0);
		circle1.setRadius(1.0);
		circle2.setRadius(1.0);
		if (!circle1.intersects(circle2)) {
			System.out.println("PASSED: Intersects");
		} else {
			System.out.println("FAILED: Intersects");
		}
		// third test case for intersects() method
		// distance = sum of the radii & false is returned
		circle1.setX(4.0);
		circle2.setX(8.0);
		circle1.setY(9.0);
		circle2.setY(9.0);
		circle1.setRadius(2.0);
		circle2.setRadius(2.0);
		if (!circle1.intersects(circle2)) {
			System.out.println("PASSED: Intersects");
		} else {
			System.out.println("FAILED: Intersects");
		}
	}

}