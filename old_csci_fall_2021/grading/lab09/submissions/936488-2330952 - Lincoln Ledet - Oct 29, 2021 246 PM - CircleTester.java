
/*********************************************************
 * CircleTester.java 
 * Author: Lincoln Ledet 
 * Submission Date: 10/29/21 
 * Lab 09 � Classes and Methods
 * 
 * Purpose: A client to test the functionality of objects // of the class
 * Circle. Use the default constructor // in the Circle class to create Circle
 * objects.
 * 
 * 
 * * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither received nor given
 * inappropriate assistance. I have not copied or modified code from any source
 * other than the course webpage or the course textbook. I recognize that any
 * unauthorized assistance or plagiarism will be handled in accordance with the
 * University of Georgia's Academic Honesty Policy and the policies of this
 * course. I recognize that my work is based on an assignment created by the
 * Department of Computer Science at the University of Georgia. Any publishing
 * or posting of source code for this assignment is strictly prohibited unless
 * you have written consent from the Department of Computer Science at the
 * University of Georgia.
 */
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
		// System.out.println(circle1.get);
		System.out.println(
				"circle1=\ncenter: (" + circle1.getX() + "," + circle1.getY() + ") \nradius: " + circle1.getRadius());

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		System.out.println("circle2=" + circle2);// im assuming this satisfies part 3b of the assignment.

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		System.out.println(
				"circle2=\ncenter: (" + circle2.getX() + "," + circle2.getY() + ") \nradius: " + circle2.getRadius());
		// second println statements

		// print circle1 diameter, area and perimeter
		System.out.println("circle1=\ndiameter: " + circle1.diameter() + "\narea:" + circle1.area() + "\nperimeter: "
				+ circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("circle2=\ndiameter: " + circle2.diameter() + "\narea:" + circle2.area() + "\nperimeter: "
				+ circle2.perimeter());

		// display whether circle1 is a unit circle
		System.out.println("circle1 unit circle status: " + circle1.isUnitCircle());

		// display whether circle2 is a unit circle
		System.out.println("circle2 unit circle status: " + circle2.isUnitCircle());

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.

		// testing circle.equals method

		// case 1 (same circle)
		System.out.println();
		System.out.println("Test Case 1 ");
		circle1.setX(-3.0);
		circle1.setY(4.0);
		circle1.setRadius(1);
		circle2.setX(-3.0);
		circle2.setY(4.0);
		circle2.setRadius(1);
		System.out.println("circle1 equales circle2: " + circle1.equals(circle2));// should be true
		if (circle1.equals(circle2) == true) {
			System.out.println("PASSED: equals");
		} else {
			System.out.println("fail");
		}
		System.out.println("circle1s distance to circle2: " + circle1.distance(circle2));// should be true
		if (circle1.distance(circle2) == 0) {
			System.out.println("PASSED: distance");
		} else {
			System.out.println("fail");
		}
		System.out.println("is circle 1 smaller then circle 2:  " + circle1.isSmaller(circle2));// should be false
		if (circle1.isSmaller(circle2)) {
			System.out.println("fail");
		} else {
			System.out.println("PASSED: isSmaller");
		}
		System.out.println("compareTo output: " + circle1.compareTo(circle2));// should be 0
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("fail");
		} else if (circle1.compareTo(circle2) == -1) {
			System.out.println("fail");
		} else if (circle1.compareTo(circle2) == 0) {
			System.out.println("PASSED: compareTo");
		}
		System.out.println("Do circle1 and circle2 intersect " + circle1.intersects(circle2));// should be true
		if (circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects");
		} else {
			System.out.println("fail");
		}

		// case 2 (different circle, should be false)
		System.out.println();
		System.out.println("Test Case 2 ");
		circle1.setX(3.0);
		circle1.setY(6.0);
		circle1.setRadius(6);
		circle2.setX(-3.1);
		circle2.setY(9.0);
		circle2.setRadius(4);
		System.out.println("circle1 equales circle2: " + circle1.equals(circle2));// should be false
		if (circle1.equals(circle2) == false) {
			System.out.println("PASSED: equals");
		} else {
			System.out.println("fail");
		}
		System.out.println("circle1s distance to circle2: " + circle1.distance(circle2));
		if (circle1.distance(circle2) == 6.797793759742936) {
			System.out.println("PASSED: distance");
		} else {
			System.out.println("fail");
		}
		System.out.println("is circle 1 smaller then circle 2:  " + circle1.isSmaller(circle2));// should be false
		if (circle1.isSmaller(circle2)) {
			System.out.println("fail");
		} else {
			System.out.println("PASSED: isSmaller");
		}
		System.out.println("compareTo output: " + circle1.compareTo(circle2));// should be 1
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("PASSED: compareTo");
		} else if (circle1.compareTo(circle2) == -1) {
			System.out.println("fail");
		} else if (circle1.compareTo(circle2) == 0) {
			System.out.println("fail");
		}
		System.out.println("Do circle1 and circle2 intersect " + circle1.intersects(circle2));// should be true
		if (circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects");
		} else {
			System.out.println("fail");
		}

		// case 3 (different circle, should be false)
		System.out.println();
		System.out.println("Test Case 3 ");
		circle1.setX(1.0);
		circle1.setY(4.0);
		circle1.setRadius(2);
		circle2.setX(-3.0);
		circle2.setY(4.0);
		circle2.setRadius(1);
		System.out.println("circle1 equales circle2: " + circle1.equals(circle2));// should be false
		if (circle1.equals(circle2) == false) {
			System.out.println("PASSED: equals");
		} else {
			System.out.println("fail");
		}
		System.out.println("circle1s distance to circle2: " + circle1.distance(circle2));
		if (circle1.distance(circle2) == 4) {
			System.out.println("PASSED: distance");
		} else {
			System.out.println("fail");
		}
		System.out.println("is circle 1 smaller then circle 2:  " + circle1.isSmaller(circle2));// should be false
		if (circle1.isSmaller(circle2)) {
			System.out.println("fail");
		} else {
			System.out.println("PASSED: isSmaller");
		}
		System.out.println("compareTo output: " + circle1.compareTo(circle2));// should be 1
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("PASSED: compareTo");
		} else if (circle1.compareTo(circle2) == -1) {
			System.out.println("fail");
		} else if (circle1.compareTo(circle2) == 0) {
			System.out.println("fail");
		}
		System.out.println("Do circle1 and circle2 intersect " + circle1.intersects(circle2));// should be true
		if (circle1.intersects(circle2)) {
			System.out.println("fail");
		} else {
			System.out.println("PASSED: intersects");
		}

	}

}