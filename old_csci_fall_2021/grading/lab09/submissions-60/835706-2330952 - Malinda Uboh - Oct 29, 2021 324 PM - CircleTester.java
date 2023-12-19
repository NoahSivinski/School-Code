/*
 * Circle.java
 * Author: Malinda Uboh
 * Submission Date: 10/29/2021
 *
 * Purpose: This program was created for testing. 
 * This program contains a driver program to 
 * test out the objects created in the
 * Circle.java file. Using the objects 
 * and methods created in Circle.java, 
 * this program can create various circles 
 * and have them interact with each other
 * in various ways. 
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

		// create two new circle objects and set their data
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

		// print out sting representation of each new circle object
		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);

		// test that negative value will not change the value of the circle's radius.
		circle1.setRadius(-2.0);

		// Use unit test to test output
		if (Math.abs(2 - circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		// reset circle 1
		circle1.setX(-3.0);
		circle1.setY(4.0);

		// re-print sting representation of circle 1
		System.out.println("circle1=" + circle1);

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print out sting representation of circle 2
		System.out.println("circle2=" + circle2);
		System.out.println();

		// print out circle1 diameter, area and perimeter
		System.out.println("circle1 diameter=" + circle1.diameter());
		System.out.println("circle1 area=" + circle1.area());
		System.out.println("circle1 perimeter=" + circle1.perimeter());
		System.out.println();

		// print out circle2 diameter, area and perimeter
		System.out.println("circle2 diameter=" + circle2.diameter());
		System.out.println("circle2 area=" + circle2.area());
		System.out.println("circle2 perimeter=" + circle2.perimeter());
		System.out.println();

		// display whether circle1 is a unit circle
		System.out.println("circle1 is a Unit circle. " + circle1.isUnitCircle());

		// display whether circle2 is a unit circle
		System.out.println("circle2 is a Unit circle. " + circle2.isUnitCircle());

		// First test case: testing new primary circle object with circle1 object
		Circle primaryCircle = new Circle();
		System.out.println();
		System.out.println("Test One: Primary Circle");
		primaryCircle.setX(-3.0);
		primaryCircle.setY(4.0);
		primaryCircle.setName("Primary Circle");
		primaryCircle.setRadius(2.0);

		if (Math.abs(-3 - primaryCircle.getX()) < THRESHOLD)
			System.out.println("PASSED: Set X");
		else
			System.out.println("FAILED: Set X");

		if (Math.abs(4 - primaryCircle.getY()) < THRESHOLD)
			System.out.println("PASSED: Set Y");
		else
			System.out.println("FAILED: Set Y");

		if (Math.abs(2 - primaryCircle.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		primaryCircle.setRadius(-2.0);

		if (Math.abs(2 - primaryCircle.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius (negative)");
		else
			System.out.println("FAILED: Set Radius (negative)");

		if (Math.abs(4 - primaryCircle.diameter()) < THRESHOLD)
			System.out.println("PASSED: Set diameter()");
		else
			System.out.println("FAILED: Set diameter()");

		if (Math.abs(12.566370614359172 - primaryCircle.area()) < THRESHOLD)
			System.out.println("PASSED: Set area()");
		else
			System.out.println("FAILED: Set area()");

		if (Math.abs(12.566370614359172 - primaryCircle.perimeter()) < THRESHOLD)
			System.out.println("PASSED: Set perimeter()");
		else
			System.out.println("FAILED: Set perimeter()");

		if (primaryCircle.isUnitCircle())
			System.out.println("PASSED: isUnitCircle()");

		else
			System.out.println("FAILED: isUnitCircle()");

		if (primaryCircle.equals(circle1))
			System.out.println("PASSED: equals()");

		else
			System.out.println("FAILED: equals()");

		if (primaryCircle.intersects(circle1))
			System.out.println("PASSED: intersects()");

		else
			System.out.println("FAILED: intersects()");

		if (primaryCircle.isSmaller(circle1))
			System.out.println("PASSED: isSmaller()");

		else
			System.out.println("FAILED: isSmaller()");

		if (Math.abs(0 - primaryCircle.compareTo(circle1)) < THRESHOLD)
			System.out.println("PASSED: compareTo()");
		else
			System.out.println("FAILED: compareTo()");

		if (Math.abs(0 - primaryCircle.distance(circle1)) < THRESHOLD)
			System.out.println("PASSED: distance()");
		else
			System.out.println("FAILED: distance()");

		// second test case: testing new secondary circle object with circle2 object
		Circle secondaryCircle = new Circle();
		System.out.println();
		System.out.println("Test Two: Secondary Circle");
		secondaryCircle.setX(0.0);
		secondaryCircle.setY(0.0);
		secondaryCircle.setName("Secondary Circle");
		secondaryCircle.setRadius(1.0);

		if (Math.abs(0 - secondaryCircle.getX()) < THRESHOLD)
			System.out.println("PASSED: Set X");
		else
			System.out.println("FAILED: Set X");

		if (Math.abs(0 - secondaryCircle.getY()) < THRESHOLD)
			System.out.println("PASSED: Set Y");
		else
			System.out.println("FAILED: Set Y");

		if (Math.abs(1 - secondaryCircle.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		secondaryCircle.setRadius(-1.0);

		if (Math.abs(1 - secondaryCircle.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius (negative)");
		else
			System.out.println("FAILED: Set Radius (negative)");

		if (Math.abs(2 - secondaryCircle.diameter()) < THRESHOLD)
			System.out.println("PASSED: Set diameter()");
		else
			System.out.println("FAILED: Set diameter()");

		if (Math.abs(3.141592653589793 - secondaryCircle.area()) < THRESHOLD)
			System.out.println("PASSED: Set area()");
		else
			System.out.println("FAILED: Set area()");

		if (Math.abs(6.283185307179586 - secondaryCircle.perimeter()) < THRESHOLD)
			System.out.println("PASSED: Set perimeter()");
		else
			System.out.println("FAILED: Set perimeter()");

		if (secondaryCircle.isUnitCircle())
			System.out.println("PASSED: isUnitCircle()");

		else
			System.out.println("FAILED: isUnitCircle()");

		if (secondaryCircle.equals(circle2))
			System.out.println("PASSED: equals()");

		else
			System.out.println("FAILED: equals()");

		if (secondaryCircle.intersects(circle2))
			System.out.println("PASSED: intersects()");

		else
			System.out.println("FAILED: intersects()");

		if (secondaryCircle.isSmaller(circle2))
			System.out.println("PASSED: isSmaller()");

		else
			System.out.println("FAILED: isSmaller()");

		if (Math.abs(-1 - secondaryCircle.compareTo(circle1)) < THRESHOLD)
			System.out.println("PASSED: compareTo()");
		else
			System.out.println("FAILED: compareTo()");

		if (Math.abs(2.23606797749979 - secondaryCircle.distance(circle2)) < THRESHOLD)
			System.out.println("PASSED: distance()");
		else
			System.out.println("FAILED: distance()");

		// Third test case: testing new tertiary circle object with circle2 object
		Circle tertiaryCircle = new Circle();
		System.out.println();
		System.out.println("Test Three: Tertiary Circle");
		tertiaryCircle.setX(6.0);
		tertiaryCircle.setY(8.0);
		tertiaryCircle.setName("Tertiary Circle");
		tertiaryCircle.setRadius(1.0);

		if (Math.abs(6 - tertiaryCircle.getX()) < THRESHOLD)
			System.out.println("PASSED: Set X");
		else
			System.out.println("FAILED: Set X");

		if (Math.abs(8 - tertiaryCircle.getY()) < THRESHOLD)
			System.out.println("PASSED: Set Y");
		else
			System.out.println("FAILED: Set Y");

		if (Math.abs(1 - tertiaryCircle.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		tertiaryCircle.setRadius(-1.0);

		if (Math.abs(1 - tertiaryCircle.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius (negative)");
		else
			System.out.println("FAILED: Set Radius (negative)");

		if (Math.abs(2.0 - tertiaryCircle.diameter()) < THRESHOLD)
			System.out.println("PASSED: Set diameter()");
		else
			System.out.println("FAILED: Set diameter()");

		if (Math.abs(3.141592653589793 - tertiaryCircle.area()) < THRESHOLD)
			System.out.println("PASSED: Set area()");
		else
			System.out.println("FAILED: Set area()");

		if (Math.abs(6.283185307179586 - tertiaryCircle.perimeter()) < THRESHOLD)
			System.out.println("PASSED: Set perimeter()");
		else
			System.out.println("FAILED: Set perimeter()");

		if (tertiaryCircle.isUnitCircle())
			System.out.println("PASSED: isUnitCircle()");

		else
			System.out.println("FAILED: isUnitCircle()");

		if (tertiaryCircle.equals(circle2))
			System.out.println("PASSED: equals()");

		else
			System.out.println("FAILED: equals()");

		if (tertiaryCircle.intersects(circle2))
			System.out.println("PASSED: intersects()");

		else
			System.out.println("FAILED: intersects()");

		if (tertiaryCircle.isSmaller(circle2))
			System.out.println("PASSED: isSmaller()");

		else
			System.out.println("FAILED: isSmaller()");
		
		if (Math.abs(-1 - tertiaryCircle.compareTo(circle1)) < THRESHOLD)
			System.out.println("PASSED: compareTo()");
		else
			System.out.println("FAILED: compareTo()");

		if (Math.abs(8.06225774829855 - tertiaryCircle.distance(circle2)) < THRESHOLD)
			System.out.println("PASSED: distance()");
		else
			System.out.println("FAILED: distance()");

	}

}
