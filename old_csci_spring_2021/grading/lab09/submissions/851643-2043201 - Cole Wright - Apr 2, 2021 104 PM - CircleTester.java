//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
//*CircleTester.java\

/* Author: Cole Wright 
// * Submission Date:  4/2/21
// *
// * Purpose: A brief paragraph description of the
// *This code works with the Circle Tester to create circles and describe their aspects given the radius, x, 
//*y, etc. input. This code contains many tests to compare the two circles
//*made. The Circle Tester tests these formulas to ensure they are giving the correct output.
//* The use of multiple classes and methods is needed many times throughout this code.
//*Object oriented programminmg abilities of the coder are tested and must be used to get the correct code. 
//*Variables, classes,objects, and methods are needed for these codes.
//* Statement of Academic Honesty:
//*
//* The following code represents my own work. I have neither
//* received nor given inappropriate assistance. I have not copied
//* or modified code from any source other than the course webpage
//* or the course textbook. I recognize that any unauthorized
//* assistance or plagiarism will be handled in accordance with
//* the University of Georgia's Academic Honesty Policy and the
//* policies of this course. I recognize that my work is based
// * on an assignment created by the Department of Computer
//* Science at the University of Georgia. Any publishing 
//* or posting of source code for this assignment is strictly
//* prohibited unless you have written consent from the Department
//* of Computer Science at the University of Georgia.  
//*/
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
		circle1.setRadius(-2.0);

		if (Math.abs(2 - circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		circle1.setX(-3.0);
		circle1.setY(4.0);

		System.out.println("circle1=" + circle1);

		circle2.setRadius(5.3);

		System.out.println("circle2=" + circle2);

		System.out.println("diameter=" + circle1.diameter() + ", " + "area: " + circle1.area() + "," + " perimeter: "
				+ circle1.perimeter());

		System.out.println("diameter=" + circle2.diameter() + ", " + "area: " + circle2.area() + "," + " perimeter: "
				+ circle2.perimeter());

		System.out.println("Circle 1 is " + circle1.isUnitCircle());

		System.out.println("Circle 2 is " + circle2.isUnitCircle());

	
		// Equals method testing
		
		circle1.setRadius(6.0);
		circle2.setRadius(6.0);
		circle1.setX(1);
		circle2.setX(1);
		circle1.setY(1);
		circle2.setY(1);

		if (circle1.equals(circle2) == true) {
			System.out.println("PASSED: equals");
		} else {
			System.out.println("FAILED: equals");
		}
		
		circle1.setRadius(7.0);
		circle2.setRadius(6.0);
		circle1.setX(1);
		circle2.setX(1);
		circle1.setY(1);
		circle2.setY(1);

		if (circle1.equals(circle2) == true) {
			System.out.println("FAILED: equals");
		} else {
			System.out.println("PASSED: equals");
		}
		
		circle1.setRadius(7.0);
		circle2.setRadius(7.0);
		circle1.setX(1);
		circle2.setX(1);
		circle1.setY(2);
		circle2.setY(1);
		if (circle1.equals(circle2) == true) {
			System.out.println("FAILED: equals");
		} else {
			System.out.println("PASSED: equals");
		}
	
		circle1.setRadius(7.0);
		circle2.setRadius(7.0);
		circle1.setX(1);
		circle2.setX(1);
		circle1.setY(1);
		circle2.setY(2);
		if (circle1.equals(circle2) == true) {
			System.out.println("FAILED: equals");
		} else {
			System.out.println("PASSED: equals");
		}
		// isSmaller tests
		
		circle1.setRadius(1);
		circle2.setRadius(2);
		if (circle1.isSmaller(circle2) == true) {
			System.out.println("PASSED: isSmaller");
		} else {
			System.out.println("FAILED: isSmaller");
		}
	
		circle1.setRadius(2);
		circle2.setRadius(1);
		if (circle2.isSmaller(circle1) == true) {
			System.out.println("PASSED: isSmaller");
		} else {
			System.out.println("FAILED: isSmaller");
		}
	
		circle1.setRadius(2);
		circle2.setRadius(3);
		if (circle2.isSmaller(circle1) == true) {
			System.out.println("FAILED: isSmaller");
		} else {
			System.out.println("PASSED: isSmaller");
		}

		// distance testing
		
		circle1.setX(0);
		circle2.setX(0);
		circle1.setY(0);
		circle2.setY(0);
		if (circle1.distance(circle2) == 0) {
			System.out.println("PASSED: distance");
		} else {
			System.out.println("FAILED: distance");
		}
		
		circle1.setX(3);
		circle2.setX(1);
		circle1.setY(3);
		circle2.setY(1);
		if (circle1.distance(circle2) == Math.sqrt(8)) {
			System.out.println("PASSED: distance");
		} else {
			System.out.println("FAILED: distance");
		}

		
		circle1.setX(1);
		circle2.setX(4);
		circle1.setY(1);
		circle2.setY(4);
		if (circle1.distance(circle2) == Math.sqrt(18)) {
			System.out.println("PASSED: distance");
		} else {
			System.out.println("FAILED: distance");
		}

		// compareTo tests
	
		circle1.setRadius(3);
		circle2.setRadius(4);
		if (circle1.compareTo(circle2) == -1) {
			System.out.println("PASSED: compareTo");
		} else {
			System.out.println("FAILED: compareTo");
		}
		
		circle1.setRadius(4);
		circle2.setRadius(3);
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("PASSED: compareTo");
		} else {
			System.out.println("FAILED: compareTo");
		}
		
		circle1.setRadius(3);
		circle2.setRadius(3);
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("FAILED: compareTo");
		} else {
			System.out.println("PASSED: compareTo");
		}

		// intersects testing
		
		circle1.setX(1);
		circle2.setX(4);
		circle1.setY(1);
		circle2.setY(4);
		circle1.setRadius(5);
		circle2.setRadius(5);
		if (circle1.intersects(circle2) == true) {
			System.out.println("PASSED: intersects");
		} else {
			System.out.println("FAILED: intersects");
		}
	
		circle1.setX(1);
		circle2.setX(4);
		circle1.setY(1);
		circle2.setY(4);
		circle1.setRadius(2);
		circle2.setRadius(1);
		if (circle1.intersects(circle2) == true) {
			System.out.println("FAILED: intersects");
		} else {
			System.out.println("PASSED: intersects");
		}
	
		circle1.setX(1);
		circle2.setX(4);
		circle1.setY(1);
		circle2.setY(4);
		circle1.setRadius(2);
		circle2.setRadius(1);
		if (circle1.intersects(circle2) == false) {
			System.out.println("PASSED: intersects");
		} else {
			System.out.println("FAILED: intersects");
		}
	}
}