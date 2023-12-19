/*
 * CircleTester.java
 * Author:  William Malonda
 * Submission Date:  April 2, 2021
 *
 * Purpose: The program CircleTester.java works in conjunction with Circle.java and uses methods and 
 * objects from Circle.java to test how the objects function. 
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
		System.out.print(circle1.toString());

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println(circle2.toString());

		// print circle1 diameter, area and perimeter
		System.out.println("circle1");
		System.out.println("diameter: " + circle1.diameter());
		System.out.println("area: " + circle1.area());
		System.out.println("perimeter: " + circle1.perimeter() + "\n");

		// print circle2 diameter, area and perimeter
		System.out.println("circle2");
		System.out.println("diameter: " + circle2.diameter());
		System.out.println("area: " + circle2.area());
		System.out.println("perimeter: " + circle2.perimeter() + "\n");

		// display whether circle1 is a unit circle
		System.out.println("Is circle1 a unit circle? " + circle1.isUnitCircle());

		// display whether circle2 is a unit circle
		System.out.println("Is circle2 a unit circle? " + circle2.isUnitCircle());

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.

		//Tests setting name for circle1
		circle1.setName("Hello");
		System.out.println("\n" + circle1.getName());
		if (circle1.getName() == "Hello") {
			System.out.println("PASSED: Set Name");
		} else {
			System.out.println("FAILED: Set Name");
		}

		//Tests setting values for x and y for circle2
		circle2.setX(4.0);
		circle2.setY(7.0);
		System.out.println("\n" + circle2.getX());
		System.out.println(circle2.getY());
		if (Math.abs(4 - circle2.getX()) < THRESHOLD && Math.abs(7 - circle2.getY()) < THRESHOLD) {
			System.out.println("PASSED: Set x and y");
		} else {
			System.out.println("FAILED: Set x and y");
		}

		//Tests setting values for x and y for circle1
		circle1.setX(10.0);
		circle1.setY(3.0);
		System.out.println("\n" + circle1.getX());
		System.out.println(circle1.getY());
		if (Math.abs(10 - circle1.getX()) < THRESHOLD && Math.abs(3 - circle1.getY()) < THRESHOLD) {
			System.out.println("PASSED: Set x and y");
		} else {
			System.out.println("FAILED: Set x and y");
		}
	}
}