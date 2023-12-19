/*
 * Circle.java
 * Author:  Nazha Erakat
 * Submission Date:  4/2/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program tests both circles and will go through multiple tests.  
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
		System.out.println("circle1=\n" + circle1);

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println("circle2=\n" + circle2);

		// print circle1 diameter, area and perimeter

		System.out.println("diameter: " + circle1.getDiameter() + "\narea: " + circle1.getArea() + "\nperimeter: "
				+ circle1.getPerimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("diameter: " + circle2.getDiameter() + "\narea: " + circle2.getArea() + "\nperimeter: "
				+ circle2.getPerimeter());

		System.out.println();
		// display whether circle1 is a unit circle
		boolean valid = circle1.isUnitCircle();
		System.out.println("Is circle 1 a unit circle? (true or false): " + valid);

		// display whether circle2 is a unit circle
		valid = circle2.isUnitCircle();
		System.out.println("Is circle 2 a unit circle? (true or false): " + valid);

		System.out.println();
		

		// distance test
		// test 1
		if (circle1.distance(circle2) > 0) {
			System.out.println("Distance Test 1: PASSED");
		} else if (circle1.distance(circle2) <= 0) {
			System.out.println("Distance Test 1: FAILED");
		}
		// test 2
		if (circle1.distance(circle2) > THRESHOLD) {
			System.out.println("Distance Test 2: PASSED");
		} else if (circle1.distance(circle2) < THRESHOLD) {
			System.out.println("Distance Test 2: FAILED");
		}
		// test 3
		if (circle1.distance(circle2) >= 1) {
			System.out.println("Distance Test 3: PASSED");
		} else if (circle1.distance(circle2) < 1) {
			System.out.println("Distance Test 3: FAILED");
		}

		System.out.println();

		// diameter test
		// test 1
		if (circle1.isSmaller(circle2) == true) {
			System.out.println("Diameter Test 1: PASSED");
		} else if (!(circle1.isSmaller(circle2)) == false) {
			System.out.println("Diameter Test 1: FAILED");
		}
		// test 2
		if (circle1.getDiameter() < circle2.getDiameter()) {
			System.out.println("Diameter Test 2: PASSED");
		} else if (circle1.getDiameter() > circle2.getDiameter()) {
			System.out.println("Diameter Test 2: FAILED");
		}
		// test 3
		if (!(circle2.isSmaller(circle1)) == true) {
			System.out.println("Diameter Test 3: PASSED");
		} else if (circle2.isSmaller(circle1) == false) {
			System.out.println("Diameter Test 3: FAILED");
		}

		System.out.println();

		// equals test
		// test 1
		if ((circle1.getX() - circle2.getX() < THRESHOLD) && (circle1.getY() - circle2.getY() < THRESHOLD)
				&& (circle1.getRadius() - circle2.getRadius() < THRESHOLD)) {
			System.out.println("Equals Test 1: FAILED");
		} else if ((circle1.getX() - circle2.getX() > THRESHOLD) && (circle1.getY() - circle2.getY() > THRESHOLD)
				&& (circle1.getRadius() - circle2.getRadius() > THRESHOLD)) {
			System.out.println("Equals Test 1: PASSED");
		}
		// test 2
		if (((circle1.getX() + circle2.getX() < THRESHOLD) && (circle1.getY() + circle2.getY() < THRESHOLD)
				&& (circle1.getRadius() + circle2.getRadius() < THRESHOLD))) {
			System.out.println("Equals Test 2: FAILED");
		} else if ((circle1.getX() + circle2.getX() > THRESHOLD) && (circle1.getY() + circle2.getY() > THRESHOLD)
				&& (circle1.getRadius() + circle2.getRadius() > THRESHOLD)) {
			System.out.println("Equals Test 2: PASSED");
		}
		// test 3
		if ((circle1.getX() / circle2.getX() < THRESHOLD) && (circle1.getY() / circle2.getY() < THRESHOLD)
				&& (circle1.getRadius() / circle2.getRadius() < THRESHOLD)) {
			System.out.println("Equals Test 3: PASSED");
		} else if ((circle1.getX() * circle2.getX() < THRESHOLD) && (circle1.getY() * circle2.getY() < THRESHOLD)
				&& (circle1.getRadius() * circle2.getRadius() < THRESHOLD));
		{
			System.out.println("Equals Test 3: FAILED");
		}
		
		System.out.println();

		// compare to test
		// test 1
		if (circle1.isSmaller(circle2)) {
			System.out.println("CompareTo Test 1: PASSED");
		} else {
			System.out.println("CompareTo Test 1: FAILED");
		}

		// test 2
		if (!(circle1.isSmaller(circle2))) {
			System.out.println("CompareTo Test 2: FAILED");
		} else if (!(circle2.isSmaller(circle1))) {
			System.out.println("CompareTo Test 2: PASSED");
		}
		// test 3
		if ((circle1.getDiameter() > circle2.getDiameter())) {
			System.out.println("CompareTo Test 3: FAILED");
		} else if ((circle1.getDiameter() < circle2.getDiameter())) {
			System.out.println("CompareTo Test 3: PASSED");
		}
		System.out.println();

		// intersects test
		// test 1
		if (circle1.distance(circle2) < (circle1.getRadius() + circle2.getRadius())) {
			System.out.println("Intersects Test 1: PASSED");
		} else if (circle1.distance(circle2) > (circle1.getRadius() + circle2.getRadius())) {
			System.out.println("Intersects Test 1: FAILED");
		}
		// test 2
		if (circle2.distance(circle1) < (circle1.getRadius() + circle2.getRadius())) {
			System.out.println("Intersects Test 2: PASSED");
		} else if (!(circle1.distance(circle2) < (circle1.getRadius() + circle2.getRadius()))) {
			System.out.println("Intersects Test 2: FAILED");
		}
		// test 3
		if (circle1.distance(circle2) == (circle1.getRadius() + circle2.getRadius())) {
			System.out.println("Intersects Test 3: FAILED");
		} else if (!(circle1.distance(circle2) == (circle1.getRadius() + circle2.getRadius()))) {
			System.out.println("Intersects Test 3: PASSED");
		}

	}

}