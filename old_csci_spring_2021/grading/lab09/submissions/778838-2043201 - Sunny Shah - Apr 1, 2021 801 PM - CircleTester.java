/*
 * CircleTester.java
 * Author:  Sunny Shah 
 * Submission Date:  04/02/2021
 *
 * Purpose: This program creates unit circles using various methods. 
 * This lab uses testing program to illustrate how the component
 * parts of what you have created interact.
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
public class CircleTester{
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

		System.out.println("circle1=" + circle1);

		// set the circle2 radius to 5.3

		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements

		System.out.println("circle2=" + circle2);

		// print circle1 diameter, area and perimeter

		System.out.println("Circle 1:");
		System.out.println("diameter: "+ circle1.diameter() + ", " + "area: " + circle1.area() + 
				", " + "perimeter: " + circle1.perimeter());

		// print circle2 diameter, area and perimeter

		System.out.println("Circle 2:");
		System.out.println("diameter: "+ circle2.diameter() + ", " + "area: " + circle2.area() +
				", " + "perimeter: " + circle2.perimeter());

		// display whether circle1 is a unit circle
		// Test 0: Check if circle1 or circle2 is a unit circle.

		if (circle1.isUnitCircle() == true)
		{
			System.out.println("PASSED: Circle 1 is a unit circle.");
		}
		else
		{
			System.out.println("FAILED: Circle 1 is not a unit circle.");
		}

		if (circle2.isUnitCircle() == true)
		{
			System.out.println("PASSED: Circle 2 is a unit circle.");
		}
		else
		{
			System.out.println("FAILED: Circle 2 is not a unit circle.");
		}

		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.

		// Test 1: Checks if circle1 and circle2 are equal.
		System.out.println("\nTest 1:");

		// Different test cases using loop
		for (int i = 0; i < 3; i++)
		{
			if (i == 0)
			{
				circle1.setX(1.0);
				circle1.setY(0.0);
				circle1.setRadius(1);
				circle2.setX(1.0);
				circle2.setY(0.0);
				circle2.setRadius(1);
			}

			if (i == 1)
			{
				circle1.setX(2.0);
				circle1.setY(4.0);
				circle1.setRadius(3);
				circle2.setX(2.0);
				circle2.setY(1.0);
				circle2.setRadius(1);
			}

			if (i == 2)
			{
				circle1.setX(3.0);
				circle1.setY(5.0);
				circle1.setRadius(4);
				circle2.setX(1.0);
				circle2.setY(5.0);
				circle2.setRadius(4);
			}

			System.out.println(" ");
			
			if (circle1.equals(circle2) == true)
			{
				System.out.println("PASSED: Both of the circles are equal.");
			}
			else
			{
				System.out.println("FAILED: Both of the circles are not equal.");
			}
		}

		// Test 2: Checks the distance between circle1 and circle2.
		System.out.println("\nTest 2:");

		// Different test cases using loop
		for (int i = 0; i < 3; i++)
		{
			if (i == 0)
			{
				circle1.setX(1.0);
				circle1.setY(0.0);
				circle1.setRadius(1);
				circle2.setX(1.0);
				circle2.setY(0.0);
				circle2.setRadius(1);
			}

			if (i == 1)
			{
				circle1.setX(2.0);
				circle1.setY(4.0);
				circle1.setRadius(3);
				circle2.setX(2.0);
				circle2.setY(1.0);
				circle2.setRadius(1);
			}

			if (i == 2)
			{
				circle1.setX(3.0);
				circle1.setY(5.0);
				circle1.setRadius(4);
				circle2.setX(1.0);
				circle2.setY(5.0);
				circle2.setRadius(4);
			}
			System.out.println(" ");
			System.out.println("Distance between circles: " + circle1.distance(circle2));

			if (circle1.distance(circle2) <= 1)
			{
				System.out.println("PASSED: The distance between the circles is less than equal to 1.");
			}
			else
			{
				System.out.println("FAILED: The distance between the circles is not less than equal to 1.");
			}

			if (circle1.distance(circle2) <= 5)
			{
				System.out.println("PASSED: The distance between the circles is less than equal to 5.");
			}
			else
			{
				System.out.println("FAILED: The distance between the circles is not less than equal to 5.");
			}

			if (circle1.distance(circle2) > 5)
			{
				System.out.println("PASSED: The distance between the circles is greater than 5.");
			}
			else
			{
				System.out.println("FAILED: The distance between the circles is not greater than 5.");
			}
		}

		// Test 3: Checks if the circle being compared is smaller than the other circle.
		System.out.println("\nTest 3:");

		// Different test cases using loop
		for (int i = 0; i < 3; i++)
		{
			if (i == 0)
			{
				circle1.setX(1.0);
				circle1.setY(0.0);
				circle1.setRadius(1);
				circle2.setX(1.0);
				circle2.setY(0.0);
				circle2.setRadius(1);
			}

			if (i == 1)
			{
				circle1.setX(2.0);
				circle1.setY(4.0);
				circle1.setRadius(3);
				circle2.setX(2.0);
				circle2.setY(1.0);
				circle2.setRadius(1);
			}

			if (i == 2)
			{
				circle1.setX(3.0);
				circle1.setY(5.0);
				circle1.setRadius(2);
				circle2.setX(1.0);
				circle2.setY(5.0);
				circle2.setRadius(4);
			}

			System.out.println(" ");
			
			if (circle1.isSmaller(circle2) == true)
			{
				System.out.println("PASSED: Circle 1 is smaller than circle 2.");
			}
			else
			{
				System.out.println("FAILED: Circle 1 is not smaller than circle 2.");
			}

			if (circle2.isSmaller(circle1) == true)
			{
				System.out.println("PASSED: Circle 2 is smaller than circle 1.");
			}
			else
			{
				System.out.println("FAILED: Circle 2 is not smaller than circle 1.");
			}
		}

		// Test 4: Compares the circles. If the circle being compared is smaller than the
		// other circle than return -1. If the circle being compared is larger than the
		// other circle than return 1. If the circle being compared is equal to the
		// other circle than return 0.
		System.out.println("\nTest 4:");

		// Different test cases using loop
		for (int i = 0; i < 3; i++)
		{
			if (i == 0)
			{
				circle1.setX(1.0);
				circle1.setY(0.0);
				circle1.setRadius(1);
				circle2.setX(1.0);
				circle2.setY(0.0);
				circle2.setRadius(1);
			}

			if (i == 1)
			{
				circle1.setX(2.0);
				circle1.setY(4.0);
				circle1.setRadius(3);
				circle2.setX(2.0);
				circle2.setY(1.0);
				circle2.setRadius(1);
			}

			if (i == 2)
			{
				circle1.setX(3.0);
				circle1.setY(5.0);
				circle1.setRadius(4);
				circle2.setX(1.0);
				circle2.setY(5.0);
				circle2.setRadius(4);
			}

			System.out.println(" ");
			
			if (circle1.compareTo(circle2) == 1)
			{
				System.out.println("PASSED: Circle 1 is larger than Circle 2.");
			}
			else
			{
				System.out.println("FAILED: Circle 1 is not larger than Circle 2.");
			}

			if (circle1.compareTo(circle2) == -1)
			{
				System.out.println("PASSED: Circle 1 is smaller than Circle 2.");
			}
			else
			{
				System.out.println("FAILED: Circle 1 is not smaller than Circle 2.");
			}

			if (circle1.compareTo(circle2) == 0)
			{
				System.out.println("PASSED: Circle 1 is the same size as Circle 2.");
			}
			else
			{
				System.out.println("FAILED: Circle 1 is not the same size as Circle 2.");
			}
		}

		// Test 5: Checks if the circles intersect.
		System.out.println("\nTest 5:");

		// Different test cases using loop
		for (int i = 0; i < 3; i++)
		{
			if (i == 0)
			{
				circle1.setX(5.0);
				circle1.setY(4.0);
				circle1.setRadius(1);
				circle2.setX(1.0);
				circle2.setY(0.0);
				circle2.setRadius(1);
			}

			if (i == 1)
			{
				circle1.setX(2.0);
				circle1.setY(4.0);
				circle1.setRadius(3);
				circle2.setX(2.0);
				circle2.setY(1.0);
				circle2.setRadius(1);
			}

			if (i == 2)
			{
				circle1.setX(3.0);
				circle1.setY(5.0);
				circle1.setRadius(4);
				circle2.setX(1.0);
				circle2.setY(5.0);
				circle2.setRadius(4);
			}

			System.out.println(" ");
			
			if (circle1.intersects(circle2) == true)
			{
				System.out.println("PASSED: The circles intersect.");
			}
			else
			{
				System.out.println("FAILED: The circles do not intersect.");
			}
		}

	}

}