/*
 * CircleTester.java
 * Author: Everett Wayman
 * Submission Date: 04/02/21
 *
 * Purpose: This program tests the functionality of objects of 
 * the class Circle by using different methods created. These methods
 * compare different circles.
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

		// Circles 1 and 2 created with variables.
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

		// Printing out the properties of each circle
		System.out.println("circle1=" + circle1);
		System.out.println();

		System.out.println("circle2=" + circle2);
		System.out.println();

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
		System.out.println("circle1=" + circle1);
		System.out.println();

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println("circle2=" + circle2);
		System.out.println();

		// print circle1 diameter, area and perimeter
		System.out.println("Circle1 diameter = " + circle1.diameter());
		System.out.println("Circle1 area = " + circle1.area());
		System.out.println("Circle1 perimeter = " + circle1.perimeter());
		System.out.println();

		// print circle2 diameter, area and perimeter
		System.out.println("Circle2 diameter = " + circle2.diameter());
		System.out.println("Circle2 area = " + circle2.area());
		System.out.println("Circle2 perimeter = " + circle2.perimeter());
		System.out.println();

		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle() == true) {
			System.out.println("circle1 is a unit circle");
		} else {
			System.out.println("circle1 is not a unit circle");
		}

		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle() == true) {
			System.out.println("circle2 is a unit circle");
		} else {
			System.out.println("circle2 is not a unit circle");
		}

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.

		// Here I give the circles new properties.
		System.out.println();
		System.out.println("Testing equals method:");
		circle1.setX(1.0);
		circle1.setY(1.0);
		circle1.setRadius(2);

		circle2.setX(1.0);
		circle2.setY(1.0);
		circle2.setRadius(2);

		// Because I have set the circles centers and radius to match each other I
		// I expect them to equal each other.
		if (circle1.equals(circle2)) {
			System.out.println("PASSED: Circle1 equals Circle2");
		} else {
			System.out.println("FAILED: Circle1 does not equal Circle2");
		}

		// The center of the second circle is changed so I expect them to no longer
		// equal each other.
		circle2.setX(2.0);
		if (circle1.equals(circle2)) {
			System.out.println("FAILED: Circle1 equals Circle2");
		} else {
			System.out.println("PASSED: Circle1 does not equal Circle2");
		}

		// I now change the first circles center so I expect them to match again.
		circle1.setX(2.0);
		if (circle1.equals(circle2)) {
			System.out.println("PASSED: Circle1 equals Circle2");
		} else {
			System.out.println("FAILED: Circle1 does not equal Circle2");
		}

		System.out.println();
		System.out.println("Testing distance method:");

		// Circle 2 is moved 2 units to the right so I expect the distance between the
		// circles
		// to 2 units.
		circle2.setX(4.0);
		if (Math.abs(2.0 - circle1.distance(circle2)) < THRESHOLD) {
			System.out.println("PASSED: Circle1 is 2 units from Circle 2");
		} else {
			System.out.println("FAILED: Circle1 is not 2 units from Circle 2");
		}

		// Here I test if the circles are 5 untis away from each other. I expect
		// the circles to not be 5 units away from each other.
		if (Math.abs(5.0 - circle1.distance(circle2)) < THRESHOLD) {
			System.out.println("FAILED: Circle1 is 5 units from Circle 2");
		} else {
			System.out.println("PASSED: Circle1 is not 5 units from Circle 2");
		}

		// Here I move the second circle up 3 and I expect a distance of 3.605551275
		// units
		// between the circles.
		circle2.setY(4.0);
		if (Math.abs(3.605551275 - circle1.distance(circle2)) < THRESHOLD) {
			System.out.println("PASSED: Circle1 is around 3.61 units from Circle 2");
		} else {
			System.out.println("FAILED: Circle1 is not around 3.61 units from Circle 2");
		}

		System.out.println();
		System.out.println("Testing isSmaller method:");

		// Here I made the radius of the second circle larger so I expect to program to
		// say that the first circle is smaller.
		circle2.setRadius(4.0);
		if (circle1.isSmaller(circle2)) {
			System.out.println("PASSED: Circle1 is smaller than Circle2");
		} else {
			System.out.println("FAILED: Circle2 is smaller than Circle1");
		}

		// Here I made the radius of the second circle smaller so I expect to program to
		// say that the first circle is larger than the second circle.
		circle2.setRadius(1.0);
		if (circle1.isSmaller(circle2)) {
			System.out.println("FAILED: Circle1 is smaller than Circle2");
		} else {
			System.out.println("PASSED: Circle2 is smaller than Circle1");
		}

		// Here I change the first radius to a smaller radius than the second one so I
		// expect the program to return that the first one is smaller.
		circle1.setRadius(0.9);
		if (circle1.isSmaller(circle2)) {
			System.out.println("PASSED: Circle1 is smaller than Circle2");
		} else {
			System.out.println("FAILED: Circle2 is smaller than Circle1");
		}

		System.out.println();
		System.out.println("Testing compareTo method:");

		// Here I change the circle properties again.
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(3);

		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(2);

		// The first circle's radius is larger than the second so I expect the
		// size of the first circle to be larger.
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("PASSED: Circle1 size is larger than Circle2");
		} else {
			System.out.println("FAILED: Circle1 size is not larger than Circle2");
		}

		// The first circle's radius is smaller than the second so I expect the
		// size of the first circle to be smaller.
		circle1.setRadius(1);
		if (circle1.compareTo(circle2) == -1) {
			System.out.println("PASSED: Circle1 size is smaller than Circle2");
		} else {
			System.out.println("FAILED: Circle1 size is not smaller than Circle2");
		}

		// Here the circles radius are the same therefore I expect the size of the
		// circles
		// to be the same.
		circle1.setRadius(2);
		if (circle1.compareTo(circle2) == 0) {
			System.out.println("PASSED: Circle1 size is equal to Circle2");
		} else {
			System.out.println("FAILED: Circle1 size is not equal to Circle2");
		}

		System.out.println();
		System.out.println("Testing intersects method:");

		// Here I change the circle properties again.
		circle1.setX(2.0);
		circle1.setY(0.0);
		circle1.setRadius(2);

		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(2);

		// I expect the circles to intersect.
		if (circle1.intersects(circle2)) {
			System.out.println("PASSED: Circle1 intersects Circle2");
		} else {
			System.out.println("FAILED: Circle1 does not intersect Circle2");
		}

		// I expect the circles to not intersect because the x value of circle1 is too
		// far away from the second one.
		circle1.setX(5.0);
		if (circle1.intersects(circle2)) {
			System.out.println("FAILED: Circle1 intersects Circle2");
		} else {
			System.out.println("PASSED: Circle1 does not intersect Circle2");
		}

		// Here I change the x of the circle2 to be closer to circle1 so I expect the
		// the circles to intersect.
		circle2.setX(3.0);
		if (circle1.intersects(circle2)) {
			System.out.println("PASSED: Circle1 intersects Circle2");
		} else {
			System.out.println("FAILED: Circle1 does not intersect Circle2");
		}

	}

}
