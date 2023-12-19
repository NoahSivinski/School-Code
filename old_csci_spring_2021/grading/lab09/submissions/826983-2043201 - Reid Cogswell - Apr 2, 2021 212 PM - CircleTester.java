/*
 * CircleTester.java
 * Author:  Reid Cogswell
 * Submission Date:  04-02-2021
 *
 * Purpose: Tests the Circle class 
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
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);

		circle1.setRadius(-2.0); 

		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		circle1.setX(-3.0);
		circle1.setY(4.0);

		System.out.println("name: " + circle1.getName());
		System.out.println("center: " + "(" + circle1.getX() + "," + circle1.getY() + ")");
		System.out.println("radius: " + circle1.getRadius());

		circle2.setRadius(5.3);

		System.out.println("center: " + "(" + circle2.getX() + "," + circle2.getY() + ")");
		System.out.println("radius: ");

		System.out.println("diameter: " + circle1.diameter());
		System.out.println("area: " + circle1.area());
		System.out.println("perimeter: " + circle1.perimeter());

		System.out.println("diameter: " + circle2.diameter());
		System.out.println("area: " + circle2.area());
		System.out.println("perimeter: " + circle2.perimeter());

		if (circle1.isUnitCircle())
		{
			System.out.println(" Circle 1 is an unit circle");
		}

		if (circle2.isUnitCircle())
		{
			System.out.println("Circle 2 is an unit circle");
		}

		if (Math.abs(circle1.compareTo(circle2)) < 2) 
			System.out.println("PASSED: compareTo");
		else 
			System.out.println("FAILED: compareTo");

		if (Math.abs(circle1.area()) > 0)
			System.out.println("PASSED: area for circle 1 not a point");
		else
			System.out.println("FAILED: area for circle 1 is a point");
		if (Math.abs(circle2.area()) > 0)
			System.out.println("PASSED: area for circle 2 not a point");
		else
			System.out.println("FAILED: area for circle 2 is a point");

		if (circle1.distance(circle2) > 0) 
			System.out.println("PASSED: distance");
		else
			System.out.println("FAILED: distance");

		System.out.println(circle1.equals(circle2));
		System.out.println(circle1.isSmaller(circle2));
		System.out.println(circle2.distance(circle1)); 
		System.out.println(circle1.intersects(circle2)); 
		



	}

}
