//*******************************************************
// CircleTester.java
/*
 * Author:  Toluwani Biobaku
 * Submission Date:  [Submission date here]
 *
 * Purpose: This lab introduces us to fundamental concepts of Object Oriented Programming (OOP), arguably the dominant programming paradigm in use today. In the paradigm, a program consists of component parts (objects) that are independent of each other and that interact in order to achieve a desired result. 
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
		System.out.println("circle1=" + circle1);

		// print circle1 characteristics (center and radius), use a statement similar
		// to the previous println statements. Note that is not necessary to call
		// the method toString, why?

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		System.out.println("circle2=" + circle2);

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements

		// print circle1 diameter, area and perimeter
		System.out.println("circle1: ");
		System.out.println("diameter: " + circle1.diameter() + ", " + "area: " + circle1.area() + ", " + "perimeter: "
				+ circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("circle2: ");
		System.out.println("diameter: " + circle2.diameter() + ", " + "area: " + circle2.area() + ", " + "perimeter: "
				+ circle2.perimeter());

		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle())
			System.out.println("Circle1 is a unit circle");
		else
			System.out.println("Circle1 is not a unit circle");

		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle())
			System.out.println("Circle2 is a unit circle");
		else
			System.out.println("Circle2 is not a unit circle");

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.

		System.out.println("Test for Boolean Equals");
		boolean actual = circle1.equals(circle2);
		boolean expected = true;

		if (!actual) {
			System.out.println("PASSED: Boolean Equals");
		} else {
			System.out.println("FAILED: Boolean is not Equals");
		}
		circle1.setX(2);
		circle2.setX(3);

		System.out.println("Test for Boolean Equals");
		boolean actual1 = circle1.equals(circle2);
		boolean expected1 = true;

		if (!actual1) {
			System.out.println("PASSED: Boolean is Equals");
		} else {
			System.out.println("FAILED: Boolean is not Equals");
		}
		circle1.setY(6);
		circle2.setY(3);

		System.out.println("Test for Boolean Equals");
		boolean actual2 = circle1.equals(circle2);
		boolean expected2 = false;

		if (!actual2) {
			System.out.println("PASSED: Boolean is Equals");
		} else {
			System.out.println("FAILED: Boolean is not Equals");
		}

		
		System.out.println("Test for Double Distance");

		double actual3 = circle1.distance(circle2);
		double expected3 = 3.1622776601683795;

		if (Math.abs(actual3 - expected3) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		circle1.setX(1);
		circle2.setY(7);
		circle1.setY(2);
		circle2.setX(4);

		System.out.println("Test for Double Distance");

		double actual4 = circle1.distance(circle2);
		double expected4 = 5.830951894845301;

		if (Math.abs(actual4 - expected4) < THRESHOLD)
			System.out.println("PASSED: Double Distance");
		else
			System.out.println("FAILED: Set Radius");

		circle1.setX(4);
		circle2.setY(3);
		circle1.setY(1);
		circle2.setX(7);
		System.out.println(circle1.distance(circle2));
		
		System.out.println("Test for Double Distance");

		double actual5 = circle1.distance(circle2);
		double expected5 = 3.605551275463989;

		if (Math.abs(actual5 - expected5) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		

		System.out.println("Test for Boolean isSmaller");
		boolean actual6 = circle1.isSmaller(circle2);
		boolean expected6 = false;

		circle2.setRadius(5);
		circle1.setRadius(2);

		if (actual6) {
			System.out.println("PASSED: Boolean isSmaller");
		} 
		else {
			System.out.println("FAILED: Boolean is not isSmaller");
		}

		System.out.println("Test for Boolean isSmaller");
		boolean actual7 = circle1.isSmaller(circle2);
		boolean expected7 = false;

		circle2.setRadius(1);
		circle1.setRadius(4);

		if (actual7) {
			System.out.println("PASSED: Boolean isSmaller");
		} 
		else {
			System.out.println("FAILED: Boolean is not isSmaller");
		}
		
		System.out.println("Test for Boolean isSmaller");
		boolean actual8 = circle2.isSmaller(circle1);
		boolean expected8 = true;

		circle2.setRadius(8);
		circle1.setRadius(2);

		if (actual8) {
			System.out.println("PASSED: Boolean isSmaller");
		} 
		else {
			System.out.println("FAILED: Boolean is not isSmaller");
		}

		
		System.out.println("Test for int comapreTo");

		int actual9 = circle1.compareTo(circle2);
		int expected9 = -1;

		if (Math.abs(actual9 - expected9) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		System.out.println("Test for int comapreTo");

		int actual10 = circle2.compareTo(circle1);
		int expected10 = 1;
		
		circle1.setX(3);
		circle2.setX(5);

		if (Math.abs(actual10 - expected10) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		System.out.println("Test for int comapreTo");
		
		circle1.setRadius(2);
		circle2.setRadius(2);
		
		int actual11 = circle2.compareTo(circle1);
		int expected11 = 0;

		System.out.println(circle2.compareTo(circle1));
		
		if (Math.abs(actual11 - expected11) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		circle1.setRadius(0);
		circle2.setRadius(0);
		circle1.setX(1);
		circle2.setY(2);
		circle1.setY(2);
		circle2.setX(1);
		
		boolean actual12 = circle1.intersects(circle2);
		boolean expected12 = true;

		if (!actual12) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED: Boolean is not isSmaller");
		}

		circle1.setRadius(2);
		circle2.setRadius(4);
		circle1.setX(4);
		circle2.setY(6);
		circle1.setY(2);
		circle2.setX(1);

		boolean actual13 = circle1.intersects(circle2);
		boolean expected13 = true;

		if (actual13) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED: Boolean is not isSmaller");
		}

		circle1.setRadius(1);
		circle2.setRadius(1);
		circle1.setX(1);
		circle2.setY(2);
		circle1.setY(2);
		circle2.setX(3);
		
		boolean actual14 = circle1.intersects(circle2);
		boolean expected14 = false;

		if (!actual14) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED: Boolean is not isSmaller");
		}
	}
}
