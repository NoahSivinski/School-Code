
/*
 * Circle.java
 * Author: Kaushalkumar A. Patel
 * Submission Date: 04-01-21
 *
 * Purpose: A brief paragraph description of the program. What does it do?
 * The program will implement classes, objects, methods, and instance variables.
 * The program will compare two circles, with respect to the unit circle, by their
 * radius, location, size, area, perimeter, and diameter. This will be done using
 * two classes that manipulate the entered code and methods to output what is asked for.
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
		System.out.println("circle1 = " + circle1);
		System.out.println("circle2 = " + circle2);
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
		System.out.println();
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);

		// print circle1 characteristics (center and radius), use a statement similar
		// to the previous println statements. Note that is not necessary to call
		// the method toString, why?
		System.out.println("circle1 = " + circle1);

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println("circle2 = " + circle2);

		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		if (Math.abs(2 - circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is a unit circle: " + circle1.isUnitCircle());

		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is a unit circle: " + circle2.isUnitCircle());
		System.out.println();

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.

		// Test case 1
		System.out.println("Test case 1");
		System.out.println("circle1 = " + circle1);
		circle2.setRadius(7);
		System.out.println("circle2 = " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is " + circle2.isUnitCircle());
		// Test 1 checks if circles are equal
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: The two circles are equal.");
		else
			System.out.println("FAILED: The two circles are not equal.");
		// Test 2 checks the distance of circle 1 and 2
		if (circle1.distance(circle2) < 1)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 1.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 1.");
		if (circle1.distance(circle2) < 3)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 3.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 3.");
		// Test 3 checks if circle1 is smaller
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: Circle 1 is smaller than circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
		// Test 4 checks the sizes of the circles
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: Circle 1 is larger than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
		if (circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not the same size asCircle 2.");
		// Test 5 checks if both circles intersect
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: The two circles intersect.");
		else
			System.out.println("FAILED: The two circles do not intersect");
		System.out.println();

		// Test case 2
		System.out.println("Test case 2");
		System.out.println("circle1 = " + circle1);
		circle2.setRadius(10);
		System.out.println("circle2 = " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is " + circle2.isUnitCircle());
		// Test 1 checks if circles are equal
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: The two circles are equal.");
		else
			System.out.println("FAILED: The two circles are not equal.");
		// Test 2 checks the distance of circle 1 and 2
		if (circle1.distance(circle2) < 1)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 1.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 1.");
		if (circle1.distance(circle2) < 3)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 3.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 3.");
		// Test 3 checks if circle1 is smaller
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: Circle 1 is smaller than circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
		// Test 4 checks the sizes of the circles
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: Circle 1 is larger than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
		if (circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not the same size asCircle 2.");
		// Test 5 checks if both circles intersect
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: The two circles intersect.");
		else
			System.out.println("FAILED: The two circles do not intersect");
		System.out.println();

		// Test case 3
		System.out.println("Test case 3");
		System.out.println("circle1 = " + circle1);
		circle2.setRadius(20);
		System.out.println("circle2 = " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is " + circle2.isUnitCircle());
		// Test 1 checks if circles are equal
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: The two circles are equal.");
		else
			System.out.println("FAILED: The two circles are not equal.");
		// Test 2 checks the distance of circle 1 and 2
		if (circle1.distance(circle2) < 1)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 1.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 1.");
		if (circle1.distance(circle2) < 3)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 3.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 3.");
		// Test 3 checks if circle1 is smaller
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: Circle 1 is smaller than circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
		// Test 4 checks the sizes of the circles
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: Circle 1 is larger than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
		if (circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not the same size asCircle 2.");
		// Test 5 checks if both circles intersect
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: The two circles intersect.");
		else
			System.out.println("FAILED: The two circles do not intersect");
		System.out.println();

		// Test case 4
		System.out.println("Test case 4");
		System.out.println("circle1 = " + circle1);
		circle2.setRadius(33);
		System.out.println("circle2 = " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is " + circle2.isUnitCircle());
		// Test 1 checks if circles are equal
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: The two circles are equal.");
		else
			System.out.println("FAILED: The two circles are not equal.");
		// Test 2 checks the distance of circle 1 and 2
		if (circle1.distance(circle2) < 1)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 1.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 1.");
		if (circle1.distance(circle2) < 3)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 3.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 3.");
		// Test 3 checks if circle1 is smaller
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: Circle 1 is smaller than circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
		// Test 4 checks the sizes of the circles
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: Circle 1 is larger than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
		if (circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not the same size asCircle 2.");
		// Test 5 checks if both circles intersect
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: The two circles intersect.");
		else
			System.out.println("FAILED: The two circles do not intersect");
		System.out.println();

		// Test case 5
		System.out.println("Test case 5");
		System.out.println("circle1 = " + circle1);
		circle2.setRadius(45);
		System.out.println("circle2 = " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is " + circle2.isUnitCircle());
		// Test 1 checks if circles are equal
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: The two circles are equal.");
		else
			System.out.println("FAILED: The two circles are not equal.");
		// Test 2 checks the distance of circle 1 and 2
		if (circle1.distance(circle2) < 1)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 1.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 1.");
		if (circle1.distance(circle2) < 3)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 3.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 3.");
		// Test 3 checks if circle1 is smaller
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: Circle 1 is smaller than circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
		// Test 4 checks the sizes of the circles
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: Circle 1 is larger than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
		if (circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not the same size asCircle 2.");
		// Test 5 checks if both circles intersect
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: The two circles intersect.");
		else
			System.out.println("FAILED: The two circles do not intersect");
		System.out.println();

		// Test case 6
		System.out.println("Test case 6");
		System.out.println("circle1 = " + circle1);
		circle2.setRadius(23);
		System.out.println("circle2 = " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is " + circle2.isUnitCircle());
		// Test 1 checks if circles are equal
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: The two circles are equal.");
		else
			System.out.println("FAILED: The two circles are not equal.");
		// Test 2 checks the distance of circle 1 and 2
		if (circle1.distance(circle2) < 1)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 1.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 1.");
		if (circle1.distance(circle2) < 3)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 3.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 3.");
		// Test 3 checks if circle1 is smaller
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: Circle 1 is smaller than circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
		// Test 4 checks the sizes of the circles
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: Circle 1 is larger than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
		if (circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not the same size asCircle 2.");
		// Test 5 checks if both circles intersect
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: The two circles intersect.");
		else
			System.out.println("FAILED: The two circles do not intersect");
		System.out.println();

		// Test case 7
		System.out.println("Test case 7");
		System.out.println("circle1 = " + circle1);
		circle2.setRadius(87);
		System.out.println("circle2 = " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is " + circle2.isUnitCircle());
		// Test 1 checks if circles are equal
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: The two circles are equal.");
		else
			System.out.println("FAILED: The two circles are not equal.");
		// Test 2 checks the distance of circle 1 and 2
		if (circle1.distance(circle2) < 1)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 1.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 1.");
		if (circle1.distance(circle2) < 3)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 3.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 3.");
		// Test 3 checks if circle1 is smaller
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: Circle 1 is smaller than circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
		// Test 4 checks the sizes of the circles
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: Circle 1 is larger than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
		if (circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not the same size asCircle 2.");
		// Test 5 checks if both circles intersect
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: The two circles intersect.");
		else
			System.out.println("FAILED: The two circles do not intersect");
		System.out.println();

		// Test case 8
		System.out.println("Test case 8");
		System.out.println("circle1 = " + circle1);
		circle2.setRadius(88);
		System.out.println("circle2 = " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is " + circle2.isUnitCircle());
		// Test 1 checks if circles are equal
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: The two circles are equal.");
		else
			System.out.println("FAILED: The two circles are not equal.");
		// Test 2 checks the distance of circle 1 and 2
		if (circle1.distance(circle2) < 1)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 1.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 1.");
		if (circle1.distance(circle2) < 3)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 3.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 3.");
		// Test 3 checks if circle1 is smaller
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: Circle 1 is smaller than circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
		// Test 4 checks the sizes of the circles
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: Circle 1 is larger than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
		if (circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not the same size asCircle 2.");
		// Test 5 checks if both circles intersect
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: The two circles intersect.");
		else
			System.out.println("FAILED: The two circles do not intersect");
		System.out.println();

		// Test case 9
		System.out.println("Test case 9");
		System.out.println("circle1 = " + circle1);
		circle2.setRadius(15);
		System.out.println("circle2 = " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is " + circle2.isUnitCircle());
		// Test 1 checks if circles are equal
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: The two circles are equal.");
		else
			System.out.println("FAILED: The two circles are not equal.");
		// Test 2 checks the distance of circle 1 and 2
		if (circle1.distance(circle2) < 1)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 1.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 1.");
		if (circle1.distance(circle2) < 3)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 3.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 3.");
		// Test 3 checks if circle1 is smaller
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: Circle 1 is smaller than circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
		// Test 4 checks the sizes of the circles
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: Circle 1 is larger than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
		if (circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not the same size asCircle 2.");
		// Test 5 checks if both circles intersect
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: The two circles intersect.");
		else
			System.out.println("FAILED: The two circles do not intersect");
		System.out.println();

		// Test case 10
		System.out.println("Test case 10");
		System.out.println("circle1 = " + circle1);
		circle2.setRadius(98);
		System.out.println("circle2 = " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is " + circle2.isUnitCircle());
		// Test 1 checks if circles are equal
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: The two circles are equal.");
		else
			System.out.println("FAILED: The two circles are not equal.");
		// Test 2 checks the distance of circle 1 and 2
		if (circle1.distance(circle2) < 1)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 1.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 1.");
		if (circle1.distance(circle2) < 3)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 3.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 3.");
		// Test 3 checks if circle1 is smaller
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: Circle 1 is smaller than circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
		// Test 4 checks the sizes of the circles
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: Circle 1 is larger than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
		if (circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not the same size asCircle 2.");
		// Test 5 checks if both circles intersect
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: The two circles intersect.");
		else
			System.out.println("FAILED: The two circles do not intersect");
		System.out.println();

		// Test case 11
		System.out.println("Test case 11");
		System.out.println("circle1 = " + circle1);
		circle2.setRadius(77);
		System.out.println("circle2 = " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is " + circle2.isUnitCircle());
		// Test 1 checks if circles are equal
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: The two circles are equal.");
		else
			System.out.println("FAILED: The two circles are not equal.");
		// Test 2 checks the distance of circle 1 and 2
		if (circle1.distance(circle2) < 1)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 1.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 1.");
		if (circle1.distance(circle2) < 3)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 3.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 3.");
		// Test 3 checks if circle1 is smaller
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: Circle 1 is smaller than circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
		// Test 4 checks the sizes of the circles
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: Circle 1 is larger than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
		if (circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not the same size asCircle 2.");
		// Test 5 checks if both circles intersect
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: The two circles intersect.");
		else
			System.out.println("FAILED: The two circles do not intersect");
		System.out.println();

		// Test case 12
		System.out.println("Test case 12");
		System.out.println("circle1 = " + circle1);
		circle2.setRadius(100);
		System.out.println("circle2 = " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is " + circle2.isUnitCircle());
		// Test 1 checks if circles are equal
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: The two circles are equal.");
		else
			System.out.println("FAILED: The two circles are not equal.");
		// Test 2 checks the distance of circle 1 and 2
		if (circle1.distance(circle2) < 1)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 1.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 1.");
		if (circle1.distance(circle2) < 3)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 3.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 3.");
		// Test 3 checks if circle1 is smaller
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: Circle 1 is smaller than circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
		// Test 4 checks the sizes of the circles
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: Circle 1 is larger than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
		if (circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not the same size asCircle 2.");
		// Test 5 checks if both circles intersect
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: The two circles intersect.");
		else
			System.out.println("FAILED: The two circles do not intersect");
		System.out.println();

		// Test case 13
		System.out.println("Test case 13");
		System.out.println("circle1 = " + circle1);
		circle2.setRadius(111);
		System.out.println("circle2 = " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is " + circle2.isUnitCircle());
		// Test 1 checks if circles are equal
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: The two circles are equal.");
		else
			System.out.println("FAILED: The two circles are not equal.");
		// Test 2 checks the distance of circle 1 and 2
		if (circle1.distance(circle2) < 1)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 1.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 1.");
		if (circle1.distance(circle2) < 3)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 3.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 3.");
		// Test 3 checks if circle1 is smaller
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: Circle 1 is smaller than circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
		// Test 4 checks the sizes of the circles
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: Circle 1 is larger than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
		if (circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not the same size asCircle 2.");
		// Test 5 checks if both circles intersect
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: The two circles intersect.");
		else
			System.out.println("FAILED: The two circles do not intersect");
		System.out.println();

		// Test case 14
		System.out.println("Test case 14");
		System.out.println("circle1 = " + circle1);
		circle2.setRadius(14);
		System.out.println("circle2 = " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is " + circle2.isUnitCircle());
		// Test 1 checks if circles are equal
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: The two circles are equal.");
		else
			System.out.println("FAILED: The two circles are not equal.");
		// Test 2 checks the distance of circle 1 and 2
		if (circle1.distance(circle2) < 1)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 1.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 1.");
		if (circle1.distance(circle2) < 3)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 3.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 3.");
		// Test 3 checks if circle1 is smaller
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: Circle 1 is smaller than circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
		// Test 4 checks the sizes of the circles
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: Circle 1 is larger than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
		if (circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not the same size asCircle 2.");
		// Test 5 checks if both circles intersect
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: The two circles intersect.");
		else
			System.out.println("FAILED: The two circles do not intersect");
		System.out.println();

		// Test case 15
		System.out.println("Test case 15");
		System.out.println("circle1 = " + circle1);
		circle2.setRadius(10);
		System.out.println("circle2 = " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter() + " , " + "Area: " + circle1.area() + " , " + "Perimeter: "
				+ circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + " , " + "Area: " + circle2.area() + " , " + "Perimeter: "
				+ circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is " + circle2.isUnitCircle());
		// Test 1 checks if circles are equal
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: The two circles are equal.");
		else
			System.out.println("FAILED: The two circles are not equal.");
		// Test 2 checks the distance of circle 1 and 2
		if (circle1.distance(circle2) < 1)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 1.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 1.");
		if (circle1.distance(circle2) < 3)
			System.out.println("PASSED: The distance between circle 1 and circle 2 is less than 3.");
		else
			System.out.println("FAILED: The distance between circle 1 and circle 2 is not less than 3.");
		// Test 3 checks if circle1 is smaller
		if (circle1.isSmaller(circle2) == true)
			System.out.println("PASSED: Circle 1 is smaller than circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
		// Test 4 checks the sizes of the circles
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: Circle 1 is larger than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
		if (circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
		else
			System.out.println("FAILED: Circle 1 is not the same size asCircle 2.");
		// Test 5 checks if both circles intersect
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: The two circles intersect.");
		else
			System.out.println("FAILED: The two circles do not intersect");
		System.out.println();

	}

}