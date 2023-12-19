/*
 * CircleTester.java
 * Author:  Dominique Coney 
 * Submission Date:  April 4, 2021
 *
 * Purpose: The purpose of this program is to implement and test for each of the methods in the Circle.java program.
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
		System.out.println("circle1= "+circle1);
		System.out.println("circle2= "+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		//Notice how the double comparison is done
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
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
		//the method toString, why?
		System.out.println(circle1);

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println(circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Circle1 Diameter = " + circle1.diameter());
		System.out.println("Circle1 Area = " + circle1.area());
		System.out.println("Circle1 Perimeter = " + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Circle2 Diameter = " + circle2.diameter());
		System.out.println("Circle2 Area = " + circle2.area());
		System.out.println("Circle2 Perimeter = " + circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Is Circle1 a unit circle? " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Is Circle2 a unit circle? " + circle2.isUnitCircle());
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		// Test 1 Set Below
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(6.0);
		circle2.setY(3.0);
		circle2.setRadius(1);
		System.out.println("circle1= "+circle1);
		System.out.println("circle2= "+circle2);
		
		if (Math.abs(circle2.getRadius() - circle1.getRadius()) < THRESHOLD) {
			if (Math.abs(circle2.getX() - circle1.getX()) < THRESHOLD) {
				if (Math.abs(circle2.getY() - circle2.getY()) < THRESHOLD) {
					System.out.println("PASSED Equality Test: Circle 1 is equal to Circle 2.");
				}
			}
		}
		else {
			System.out.println("FAILED Equality Test: Circle 1 is not equal to Circle 2.");
	}
		 System.out.println("Distance: " + Math.sqrt(Math.pow(circle1.getX() - circle2.getX(), 2) + Math.pow(circle1.getY() - circle2.getY(), 2)));

		if (circle1.diameter() < circle2.diameter()) {
			System.out.println("PASSED isSmaller Test: Circle 1 is smaller than Circle 2.");
		}
		else {
			System.out.println("FAILED isSmaller Test: Circle 1 is larger than Circle 2.");
		}
		if (circle1.diameter() > circle2.diameter()) {
			System.out.println("PASSED compareTo Test: Circle 1 is larger than Circle 2");
		}
		else {
			System.out.println("FAILED compareTo Test: Circle 1 is smaller than Circle 2");
	}

		if (circle1.getRadius() - circle2.getRadius() < circle1.distance(circle2)
				&& circle1.distance(circle2) < circle1.getRadius() + circle2.getRadius()) {
			System.out.println("PASSED Intersection Test: Circle 1 intersects Circle 2.");
		}
		else {
			System.out.println("FAILED Intersection Test: Circle 1 does not intersect Circle 2.");	
		}
		
		//Test 2 Below
		circle1.setName("Circle 1");
		circle1.setX(2.0);
		circle1.setY(4.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(4.0);
		circle2.setRadius(2);
		System.out.println("circle1= "+circle1);
		System.out.println("circle2= "+circle2);
		
		if (Math.abs(circle2.getRadius() - circle1.getRadius()) < THRESHOLD) {
			if (Math.abs(circle2.getX() - circle1.getX()) < THRESHOLD) {
				if (Math.abs(circle2.getY() - circle2.getY()) < THRESHOLD) {
					System.out.println("PASSED Equality Test: Circle 1 is equal to Circle 2.");
				}
			}
		}
		else {
			System.out.println("FAILED Equality Test: Circle 1 is not equal to Circle 2.");
	}
		 System.out.println("Distance: " + Math.sqrt(Math.pow(circle1.getX() - circle2.getX(), 2) + Math.pow(circle1.getY() - circle2.getY(), 2)));

		if (circle1.diameter() < circle2.diameter()) {
			System.out.println("PASSED isSmaller Test: Circle 1 is smaller than Circle 2.");
		}
		else {
			System.out.println("FAILED isSmaller Test: Circle 1 is larger than Circle 2.");
		}
		if (circle1.diameter() > circle2.diameter()) {
			System.out.println("PASSED compareTo Test: Circle 1 is larger than Circle 2");
		}
		else {
			System.out.println("FAILED compareTo Test: Circle 1 is smaller than Circle 2");
	}

		if (circle1.getRadius() - circle2.getRadius() < circle1.distance(circle2)
				&& circle1.distance(circle2) < circle1.getRadius() + circle2.getRadius()) {
			System.out.println("PASSED Intersection Test: Circle 1 intersects Circle 2.");
		}
		else {
			System.out.println("FAILED Intersection Test: Circle 1 does not intersect Circle 2.");	
		}
//Test 3 Below
		circle1.setName("Circle 1");
		circle1.setX(2.0);
		circle1.setY(0.0);
		circle1.setRadius(3);
		circle2.setName("Circle 2");
		circle2.setX(4.0);
		circle2.setY(3.0);
		circle2.setRadius(5);
		System.out.println("circle1= "+circle1);
		System.out.println("circle2= "+circle2);
		
		if (Math.abs(circle2.getRadius() - circle1.getRadius()) < THRESHOLD) {
			if (Math.abs(circle2.getX() - circle1.getX()) < THRESHOLD) {
				if (Math.abs(circle2.getY() - circle2.getY()) < THRESHOLD) {
					System.out.println("PASSED Equality Test: Circle 1 is equal to Circle 2.");
				}
			}
		}
		else {
			System.out.println("FAILED Equality Test: Circle 1 is not equal to Circle 2.");
	}
		 System.out.println("Distance: " + Math.sqrt(Math.pow(circle1.getX() - circle2.getX(), 2) + Math.pow(circle1.getY() - circle2.getY(), 2)));

		if (circle1.diameter() < circle2.diameter()) {
			System.out.println("PASSED isSmaller Test: Circle 1 is smaller than Circle 2.");
		}
		else {
			System.out.println("FAILED isSmaller Test: Circle 1 is larger than Circle 2.");
		}
		if (circle1.diameter() > circle2.diameter()) {
			System.out.println("PASSED compareTo Test: Circle 1 is larger than Circle 2");
		}
		else {
			System.out.println("FAILED compareTo Test: Circle 1 is smaller than Circle 2");
	}

		if (circle1.getRadius() - circle2.getRadius() < circle1.distance(circle2)
				&& circle1.distance(circle2) < circle1.getRadius() + circle2.getRadius()) {
			System.out.println("PASSED Intersection Test: Circle 1 intersects Circle 2.");
		}
		else {
			System.out.println("FAILED Intersection Test: Circle 1 does not intersect Circle 2.");	
		}
}
}