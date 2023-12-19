
/*
 * CircleTester.java
 * Author:  Gage Roney 
 * Submission Date:  4/2/2021
 *
 * Purpose: The purpose of this program is to allow for the user to use methods that will display certain values for two different circles. 
 * These different circles will be manipulated throughout the program and the program will run a series of tests to see if certain values of 
 * the circles are correct or false.
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
	public static final double THRESHOLD = 0.000000001; // Number so close to 0 so when comparing minute numbers it will
														// still hold true
														// Used when comparing double values

	public static void main(String[] args) {
		// Two objects created named circle1 and circle2, the values for these objects
		// such as the names, radius, x, and y are set here as well
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
		System.out.println("circle1=" + circle1); // Prints circle1 output based from the toString method
		System.out.println("circle2=" + circle2);// Prints circle2 output based from the toString method

		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); // does not change because radius is not greater than 0

		// This is a unit test. It is best to have tests output pass or fail instead of
		// just a bunch of values.
		// Notice how the double comparison is done
		if (Math.abs(2 - circle1.getRadius()) < THRESHOLD) // Tests to see if radius is equal to the THRESHOLD which is
															// essentially 0
			System.out.println("PASSED: Set Radius"); // Either Passes or Fails
		else
			System.out.println("FAILED: Set Radius");

		// Reset the center of circle1 (-3.0,4.0)
		// Circle1 is changed using the setter methods
		circle1.setX(-3.0);
		circle1.setY(4.0);

		// print circle1 characteristics (center and radius), use a statement similar
		// to the previous println statements. Note that is not necessary to call
		// the method toString, why?
		System.out.println("circle1=" + circle1); // Prints circle1 characteristics, not necessary to call toString
													// because the values are placed respectively
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		// Output here displays values and characteristics of each circle using the
		// classes and objects
		System.out.println("circle2=" + circle2);
		// print circle1 diameter, area and perimeter
		System.out.printf("diameter of circle1: %.2f\n", circle1.diameter());
		System.out.printf("area of circle1: %.2f\n", circle1.area());
		System.out.printf("perimeter of circle1: %.2f\n", circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.printf("diameter of circle2: %.2f\n", circle2.diameter());
		System.out.printf("area of circle2: %.2f\n", circle2.area());
		System.out.printf("perimeter of circle2: %.2f\n", circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("(True/False) Is Circle1 a Unit Circle: " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("(True/False) Is Circle2 a Unit Circle: " + circle2.isUnitCircle());
		System.out.println();
		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.
		// My tests cases are all based on the initial values and characteristics of the
		// circle, they can be changed and still pass or fail
		// but if they are changed later passed this point the test cases won't all be
		// congruent although they will still work
		// Test case 1 for Equals method
		System.out.println("Test cases for equals method");
		if (circle1.equals(circle2)) { // If true test case 1 for equals method passes
			System.out.println("PASSED: the circles are equal to each other.");
		} else {// If false test case 1 for equals method fails
			System.out.println("FAILED: the circles are equal not to each other.");
		}
		// Test case 2 for Equals method
		if (circle1.equals(circle2)) {
			if (Math.abs(circle1.getRadius() - circle2.getRadius()) < THRESHOLD) {
				System.out.println("PASSED: Radius is equal.");// If true test case 2 for equals method passes
			} else {
				System.out.println("FAILED: Radius is not equal.");// If false test case 2 for equals method fails
			}
		} else { // Radius can still be equal even if the circles themselves are not
			if (Math.abs(circle1.getRadius() - circle2.getRadius()) < THRESHOLD) {
				System.out.println("PASSED: Radius is equal."); // If false test case 2 for equals method passes
			} else {
				System.out.println("FAILED: Radius is not equal.");// If false test case 2 for equals method fails

			}
		}
		// Test case 3 for equals method
		if (circle1.equals(circle2)) { // If the circles do equal the x and y values must equal
			System.out.println("PASSED: The values for x and y are equal.");
		} else { // If the circles are not equal the values for x and y still have a chance at
					// being equal
			if (Math.abs(circle1.getX() - circle2.getX()) < THRESHOLD
					&& Math.abs(circle1.getY() - circle2.getY()) < THRESHOLD) {
				System.out.println("PASSED: The values for x and y are equal."); // Passes x and y value test to see if
																					// the values for both circles are
																					// same
			} else {
				System.out.println("FAILED: The values for x and y are not equal."); // Fails the x and y value test to
																						// see if the values for both
																						// circles are same

			}
		}
		System.out.println(); // Space to separate test cases for better visibility
		System.out.println("Test cases for distance method"); // Print line statement
		// Test case 1 for distance method
		if (circle1.distance(circle2) < THRESHOLD) { // Checks to see if the distance between circles is equal to zero
			System.out.println("PASSED: Distance between the center points is 0."); // Passes this test
		} else {
			System.out.print("FAILED: Distance between the center points is not 0. "); // Fails this test case and
																						// prints the actual distance
			System.out.printf("The distance is between their center points is %.2f\n", circle1.distance(circle2)); // Prints
																													// distance
																													// two
																													// decimal
																													// places
		} // Test case 2 for distance method
		if (Math.abs(circle1.getRadius() + circle2.getRadius() - circle1.distance(circle2)) < THRESHOLD) {
			System.out.println("PASSED: There is distance between the center points but the circles touch externally.");// circles
																														// touch
																														// but
																														// don't
																														// intersect,
																														// can
																														// use
																														// something
																														// similar
																														// on
																														// intersection
																														// method
																														// test
																														// case
		} else {
			System.out.println(
					"FAILED: There is distance between center points and the objects of the circles themselves.");
			// circles have distance and the center points have distance between them
		} // Test case 3 for distance
		if (circle1.distance(circle2) > circle1.area()) { // Checks the distance and compares to the circle1's radius
			System.out.println(
					"PASSED: The distance between the center points of the two circles is greater than that of circle1's area.");
			// Passes so the distance is greater than that of the radius for circle1
		} else {
			System.out.println(
					"FAILED: The distance between the center points of the two circles is less than that of circle1's area.");
		} // Fails so the distance is not greater than the radius of circle1
			// Space so that test cases are easier to read in the output
		System.out.println();
		System.out.println("Test cases for is smaller method"); // Print statement that shows the methods being output
		// First test case for is smaller method
		if (circle1.isSmaller(circle2)) { // Checks to see if the circle is smaller based on the method
			if (circle1.isSmaller(circle2)) { // Is a boolean so a nested decision statement is here in case it passes
												// or fails
				System.out.println("PASSED: Circle1 is smaller than circle2."); // Passes and outputs message if true
			} else {
				System.out.println("FAILED: Circle1 is not smaller than circle2."); // If they are not equal it fails
																					// test case
			}
			// If boolean is true this is the Second test case
			if (circle1.perimeter() < circle2.perimeter()) { // checks to see if circle1's perimeter is smaller than
																// that of circle2
				System.out.println("PASSED: The perimeter for circle1 is smaller than that of circle2.");
			} else {
				System.out.println("FAILED: The perimeter for circle1 is not smaller than that of circle2.");
			}
			if (circle1.area() < circle2.area()) { // Third test case if boolean is true
				System.out.println("PASSED: The area for circle1 is smaller than that of circle2."); // Checks the areas
																										// for circle 1
																										// and circle2
																										// and passes
																										// here
			} else {
				System.out.println("FAILED: The area for circle1 is not smaller than that of circle2."); // If it is not
																											// smaller
																											// than it
																											// will fail
																											// test case
			}

		} else {
			if (circle1.perimeter() < circle2.perimeter()) { // Second test case if boolean is false, checks just like
																// before if the perimeter's and areas for circle1 are
																// smaller if not then these will output pass or fail
				System.out.println("PASSED: The perimeter for circle1 is smaller than that of circle2.");
			} else {
				System.out.println("FAILED: The perimeter for circle1 is not smaller than that of circle2.");
			}
			if (circle1.area() < circle2.area()) {// third test case if boolean is false
				System.out.println("PASSED: The area for circle1 is smaller than that of circle2.");
			} else {
				System.out.println("FAILED: The area for circle1 is not smaller than that of circle2.");
			}

		}
		// Space to separate test cases
		System.out.println();
		System.out.println("Test cases for compare to method");
		// FIrst test case for compareTo method
		if (circle1.compareTo(circle2) == 1) { // If the circle method returns 1 and that is equal to one than it will
												// pass test case one
			System.out.println("PASSED: The object circle1 is larger than circle2.");
		} else {
			System.out.println("FAILED: The object circle1 is not larger than circle2."); // Else it will fail
		}
		// Second Test case for compareTo
		if (circle1.getX() > circle2.getX() && circle1.getY() > circle2.getY()) { // Checks to see if x and y are larger
																					// for circle1 than circle2
			System.out
					.println("PASSED: Both the x and y values for circle1 (center of circle) are larger than circle2."); // Outputs
																															// if
																															// pass
		} else {
			System.out.println(
					"FAILED: Both the x and y values for circle1 (center of circle) are not larger than circle2."); // Output
																													// if
																													// fails
		}
		// Third case for compareTo method
		if (circle1.getRadius() > circle2.getRadius()) { // If radius for circle1 is larger than circle 2
			System.out.println("PASSED: The radius for circle1 is larger than circle2.");
		} else {
			System.out.println("FAILED: The radius for circle1 is not larger than circle2.");
		}
		System.out.println();
		System.out.println("Test cases for the intersection method"); // Test cases for intersection
		if (circle1.intersects(circle2)) { // If the circles intersect
			System.out.println("PASSED: Circle1 does intersect circle2.");// Output if passes
		} else {
			System.out.println("FAILED: Circle1 does not intersect circle2.");// Output if fails
		}
		if ((Math.abs(circle1.getRadius() + circle2.getRadius() - circle1.distance(circle2)) < THRESHOLD)) { // If the
																												// circles
																												// touch
																												// each
																												// other
																												// but
																												// not
																												// necessarily
																												// intersect
			System.out.println("PASSED: The circles do not intersect but the do touch sides externally."); // Output if
																											// passes
		} else {
			System.out.println("FAILED: The circles do not touch each other externally."); // Output if fails
		}
		if (circle1.intersects(circle2)
				|| (Math.abs(circle1.getRadius() + circle2.getRadius() - circle1.distance(circle2)) < THRESHOLD)) { // Checks
																													// to
																													// see
																													// if
																													// either
																													// they
																													// touch
																													// externally
																													// or
																													// intersect
																													// at
																													// all
			System.out.println("PASSED: The circles do touch either externally or by intersection");// Output if passes
		} else {
			System.out.println("FAILED: The circles do not touch externally or intersect.");// Output if fails and the
																							// shapes do not touch at
																							// all
		}
	}

}
