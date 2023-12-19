/*
 * CSCI1301.java
 * Author:  Olivia Richardson
 * Submission Date:  2 April 2021
 *
 * Purpose: This program uses a skeleton code that has defined the basic
 * class and method structure that is used throughout the program so
 * that the classes function as intended. This program contains objects that are independent of the
 * other objects but still are able to interact with each other 
 * because they are in different methods within the same main method
 * within the same class within the same paradigm. There is a testing
 * program to illustrate how all the components interact with each
 * other. This lab uses access modifiers, instance variables/ fields, 
 * methods which return values and void methods, methods calling other
 * methods, accessor and mutator methods, and the equals() method.
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
	public static final double THRESHOLD = 0.000000001; // margin of error

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2.0);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1.0);
		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);

		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.

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
		System.out.println("\n" + circle1); // "\n" being used to make outputs easier to read

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println(circle2);

		// print circle1 diameter, area and perimeter
		System.out.println("\nCircle 1 Diameter, Area, and Perimeter:"); // "\n" being used to make outputs easier to
																			// read
		System.out.println("Diameter: " + circle1.diameter());
		System.out.println("Area: " + circle1.area());
		System.out.println("Perimeter: " + circle1.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Is Circle 1 a unit circle (true/false)? " + circle1.isUnitCircle());

		// print circle2 diameter, area and perimeter
		System.out.println("\nCircle 2 Diameter, Area, and Perimeter:"); // "\n" being used to make outputs easier to
																			// read
		System.out.println("Diameter: " + circle2.diameter());
		System.out.println("Area: " + circle2.area());
		System.out.println("Perimeter: " + circle2.perimeter());
		// display whether circle2 is a unit circle
		System.out.println("Is Circle 2 a unit circle (true/false)? " + circle2.isUnitCircle());

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases for each method you write. It is best to write proper unit
		// tests which print
		// pass, fail for each test instead of just dumping values to the screen.
		
		// new circle test objects & variables & methods used for all tests
		Circle circleTest1 = new Circle();
		Circle circleTest2 = new Circle();

		// Test 1
		System.out.println("\n---Test 1 Getting Started---");
		// new circle test objects & variables & methods used for all tests
		circleTest1.setName("Circle Test Case 1");
		circleTest1.setX(3);
		circleTest1.setY(90);
		circleTest1.setRadius(8);
		circleTest2.setName("Circle Test Case 2");
		circleTest2.setX(0.0);
		circleTest2.setY(0.0);
		circleTest2.setRadius(1);
		
		//Printing out circleTest1 variables
		System.out.println("\n" + circleTest1);
		System.out.println("Diameter of Circle Test 1: " + circleTest1.diameter());
		System.out.println("Perimeter of Circle Test 1: " + circleTest1.perimeter());
		System.out.println("Area of Circle Test 1: " + circleTest1.area());

		//resetting circleTest1 radius
		circleTest1.setRadius(-24.0);
		
		// unit test to determine if the radius is acceptable for circleTest1
		if (Math.abs(8 - circleTest1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");	
		//Printing out circleTest2 variables
		System.out.println("\n" + circleTest2);
		System.out.println("Diameter of Circle Test 2: " + circleTest2.diameter());
		System.out.println("Perimeter of Circle Test 2: " + circleTest2.perimeter());
		System.out.println("Area of Circle Test 2: " + circleTest2.area());
		

		//resetting circleTest2 radius
		circleTest2.setRadius(-100.0);

		// unit test to determine if the radius is acceptable for circleTest2
		if (Math.abs(1 - circleTest2.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		// printing out value that involve both circles for calculation or comparison..involves if statements and calling methods
		System.out.println("\nDistance between two circles: " + circleTest1.distance(circleTest2)); // distance
		System.out.println("compareTo value: " + circleTest1.compareTo(circleTest2)); //compareTo method value
		//next two if statements address if the circles are unit circles
		System.out.println("Is the Circle Test 1 a unit circle? (PASS/FAIL) ");
		if (circleTest1.isUnitCircle()) {
			System.out.print("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Is Circle Test 2 a unit circle? (PASS/FAIL) ");
		if (circleTest2.isUnitCircle()) {
			System.out.print("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("\nAre the circles equal? (PASS/FAIL) "); // equals method boolean
		if (circleTest1.equals(circleTest2)) {
			System.out.print("PASS"); //if theyre the same
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Do the circles intersect? (PASS/FAIL) "); //intersects method boolean
		if (circleTest1.intersects(circleTest2)) {
			System.out.print("PASS"); //if they intersect
		} else {
			System.out.println("FAIL");
		}

		// Test 2
		System.out.println("\n---Test 2 Getting Started---");
		
		// new circle test objects used for all tests. variables are edited for case
		circleTest1.setName("Circle Test Case 1");
		circleTest1.setX(150);
		circleTest1.setY(75);
		circleTest1.setRadius(25);
		circleTest2.setName("Circle Test Case 2");
		circleTest2.setX(0.0);
		circleTest2.setY(0.0);
		circleTest2.setRadius(2);
		
		// printing out circleTest1 values
		System.out.println("\n" + circleTest1);
		System.out.println("Diameter of Circle Test 1: " + circleTest1.diameter());
		System.out.println("Perimeter of Circle Test 1: " + circleTest1.perimeter());
		System.out.println("Area of Circle Test 1: " + circleTest1.area());
		
		//resetting circleTest1 radius
		circleTest1.setRadius(-78.0);

		// unit test to determine if the radius is acceptable for circleTest1
		if (Math.abs(25 - circleTest1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		// printing out circleTest2 values
		System.out.println("\n" + circleTest2);
		System.out.println("Diameter of Circle Test 2: " + circleTest2.diameter());
		System.out.println("Perimeter of Circle Test 2: " + circleTest2.perimeter());
		System.out.println("Area of Circle Test 2: " + circleTest2.area());

		//resetting circleTest2 radius
		circleTest2.setRadius(-100.0);

		// unit test to determine if the radius is acceptable for circleTest2
		if (Math.abs(2 - circleTest2.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		// printing out value that involve both circles for calculation or comparison..involves if statements and calling methods
		System.out.println("\nDistance between two circles: " + circleTest1.distance(circleTest2)); // distance method value
		System.out.println("compareTo value: " + circleTest1.compareTo(circleTest2)); // compareTo method value
		//next two if statements address if the circles are unit circles
		System.out.println("Is the Circle Test 1 a unit circle? (PASS/FAIL) ");
		if (circleTest1.isUnitCircle()) {
			System.out.print("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Is Circle Test 2 a unit circle? (PASS/FAIL) ");
		if (circleTest2.isUnitCircle()) {
			System.out.print("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Are the circles equal? (PASS/FAIL) "); //equals method boolean
		if (circleTest1.equals(circleTest2)) {
			System.out.print("PASS"); // if theyre the same
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Do the circles intersect? (PASS/FAIL) "); // intersects method boolean
		if (circleTest1.intersects(circleTest2)) {
			System.out.print("PASS"); // if they intersect
		} else {
			System.out.println("FAIL");
		}

		// Test 3
		System.out.println("\n---Test 3 Getting Started---");
		
		// new circle test objects used for all tests. variables are edited for case
		circleTest1.setName("Circle Test Case 1");
		circleTest1.setX(0);
		circleTest1.setY(0);
		circleTest1.setRadius(1);
		circleTest2.setName("Circle Test Case 2");
		circleTest2.setX(4);
		circleTest2.setY(4);
		circleTest2.setRadius(16);

		//Printing out circleTest1 variables
		System.out.println("\n" + circleTest1);
		System.out.println("Diameter of Circle Test 1: " + circleTest1.diameter());
		System.out.println("Perimeter of Circle Test 1: " + circleTest1.perimeter());
		System.out.println("Area of Circle Test 1: " + circleTest1.area());
		
		//resetting circleTest1 radius
		circleTest1.setRadius(-78.0);
		
		// unit test to determine if the radius is acceptable for circleTest1
		if (Math.abs(1 - circleTest1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		//Printing out circleTest2 variables
		System.out.println("\n" + circleTest2);
		System.out.println("Diameter of Circle Test 2: " + circleTest2.diameter());
		System.out.println("Perimeter of Circle Test 2: " + circleTest2.perimeter());
		System.out.println("Area of Circle Test 2: " + circleTest2.area());

		//resetting circleTest2 radius
		circleTest2.setRadius(-100.0);
		
		// unit test to determine if the radius is acceptable for circleTest2
		if (Math.abs(16 - circleTest2.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		// printing out value that involve both circles for calculation or comparison..involves if statements and calling methods
		System.out.println("\nDistance between two circles: " + circleTest1.distance(circleTest2)); // distance method value
		System.out.println("compareTo value: " + circleTest1.compareTo(circleTest2)); // compareTo method value
		//next two if statements address if the circles are unit circles
		System.out.println("Is the Circle Test1  a unit circle? (PASS/FAIL) ");
		if (circleTest1.isUnitCircle()) {
			System.out.print("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("\nIs Circle Test 2 a unit circle? (PASS/FAIL) ");
		if (circleTest2.isUnitCircle()) {
			System.out.print("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Are the circles equal? (PASS/FAIL) "); // equals method boolean
		if (circleTest1.equals(circleTest2)) {
			System.out.print("PASS"); //if they are equal
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Do the circles intersect? (PASS/FAIL) "); //intersects method boolean
		if (circleTest1.intersects(circleTest2)) {
			System.out.print("PASS"); // if they intersect
		} else {
			System.out.println("FAIL");
		}

		// Test 4
		System.out.println("\n\n---Test 4 Getting Started---");
		
		// new circle test objects used for all tests. variables are edited for case
		circleTest1.setName("Circle Test Case 1");
		circleTest1.setX(0);
		circleTest1.setY(0);
		circleTest1.setRadius(1);
		circleTest2.setName("Circle Test Case 2");
		circleTest2.setX(0);
		circleTest2.setY(0);
		circleTest2.setRadius(1);

		//Printing out circleTest1 variables
		System.out.println("\n" + circleTest1);
		System.out.println("Diameter of Circle Test 1: " + circleTest1.diameter());
		System.out.println("Perimeter of Circle Test 1: " + circleTest1.perimeter());
		System.out.println("Area of Circle Test 1: " + circleTest1.area());
		
		//resetting circleTest1 radius
		circleTest1.setRadius(0.0);
		
		// unit test to determine if the radius is acceptable for circleTest1
		if (Math.abs(2 - circleTest1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		//Printing out circleTest2 variables
		System.out.println("\n" + circleTest2);
		System.out.println("Diameter of Circle Test 2: " + circleTest2.diameter());
		System.out.println("Perimeter of Circle Test 2: " + circleTest2.perimeter());
		System.out.println("Area of Circle Test 2: " + circleTest2.area());

		//resetting circleTest2 radius
		circleTest2.setRadius(0.0);
		
		// unit test to determine if the radius is acceptable for circleTest2
		if (Math.abs(2 - circleTest2.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		// printing out value that involve both circles for calculation or comparison..involves if statements and calling methods
		System.out.println("\nDistance between two circles: " + circleTest1.distance(circleTest2)); // distance method value
		System.out.println("compareTo value: " + circleTest1.compareTo(circleTest2)); // compareTo method value
		//next two if statements address if the circles are unit circles
		System.out.println("Is the Circle Test1  a unit circle? (PASS/FAIL) ");
		if (circleTest1.isUnitCircle()) {
			System.out.print("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Is Circle Test 2 a unit circle? (PASS/FAIL) ");
		if (circleTest2.isUnitCircle()) {
			System.out.print("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("Are the circles equal? (PASS/FAIL) "); // equals method boolean
		if (circleTest1.equals(circleTest2)) {
			System.out.print("PASS"); //if they are equal
		} else {
			System.out.println("FAIL");
		}
		System.out.println("\nDo the circles intersect? (PASS/FAIL) "); //intersects method boolean
		if (circleTest1.intersects(circleTest2)) {
			System.out.print("PASS"); // if they intersect
		} else {
			System.out.println("FAIL");
		}

	}

}