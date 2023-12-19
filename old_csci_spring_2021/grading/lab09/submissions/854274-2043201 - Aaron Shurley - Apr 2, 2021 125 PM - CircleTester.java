/*
 * CircleTester.java
 * Author:  Aaron Shurley
 * 
 * Submission Date:  4/2/2021
 *
 * Purpose: The purpose of this program is to allow for the user to use methods that will display certain values for two different circles. 
 * These different circles will be manipulated throughout the program and the program will run a series of tests and will check if
 * the tests are passed or failed.
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

		// Reset the center of circle1 (-3.0,4.0)

		circle1.setX(-3.0);
		circle1.setY(4.0);

		// print circle1 characteristics (center and radius), use a statement similar
		// to the previous println statements. Note that is not necessary to call
		// the method toString, why?
		System.out.println("circle1=" + circle1);
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
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
		
		
		
		// Test case 1 for Equals method: checks if circles are equal
		System.out.println("Test cases for equals method");
		if (circle1.equals(circle2)) {
			System.out.println("PASSED: the circles are equal to each other.");
		} else {
			System.out.println("FAILED: the circles are equal not to each other.");
		}
		// Test case 2 for Equals method : checks if the radius of the circles are equal
		if (circle1.equals(circle2)) {
			System.out.println(
					"(True/False) Do the radius circle1 and circle2 equal each other: " + circle1.equals(circle2));
			if (Math.abs(circle1.getRadius() - circle2.getRadius()) < THRESHOLD) {
				System.out.println("PASSED: Radius is equal.");
			} else {
				System.out.println("FAILED: Radius is not equal.");
			}
		} else {
			if (Math.abs(circle1.getRadius() - circle2.getRadius()) < THRESHOLD) {
				System.out.println("PASSED: Radius is equal.");
			} else {
				System.out.println("FAILED: Radius is not equal.");

			}
		}
		// Test case 3 for equals method: checks if the x and y  are equal
		if (circle1.equals(circle2)) {
			System.out.println("(True/False) Are the x and y values the same for circle1 and circle2 equal each other: "
					+ circle1.equals(circle2));
		} else {
			if (Math.abs(circle1.getX() - circle2.getX()) < THRESHOLD
					&& Math.abs(circle1.getY() - circle2.getY()) < THRESHOLD) {
				System.out.println("PASSED: The values for x and y are equal.");
			} else {
				System.out.println("FAILED: The values for x and y are not equal.");

			}
		}
		System.out.println();
		System.out.println("Test cases for distance method");
		// Test case 1 for distance method: checks  if the distance between center points is 0
		if (circle1.distance(circle2) < THRESHOLD) {
			System.out.println("PASSED: Distance between the center points is 0.");
		} else {
			System.out.print("FAILED: Distance between the center points is not 0. ");
			System.out.printf("The distance is between their center points is %.2f\n", circle1.distance(circle2));
		
		} // Test case 2 for distance method : checks if the circles touch
		if (Math.abs(circle1.getRadius() + circle2.getRadius() - circle1.distance(circle2)) < THRESHOLD) {
			System.out.println(
					"PASSED: There is distance between the center points but no distance between the circle sides.");				// case
		} else {
			System.out.println("FAILED: There is distance between both the  centers and the circles");
			
		}
		//Test case 3 for distance method : checks if the distance between  the circles is greater than the perimeter of circle 2
		
		if (circle1.distance(circle2)>circle2.perimeter())
			System.out.println("PASSSED: The distance between the two circles is greater than the permiter of circle 2");
		else { 
			System.out.println("FAILED: The distance between the two circles is not greater than the perimeter of circle 2");
		}
		
		
		
		
		System.out.println();
		System.out.println("Test cases for is smaller method");
		// First test case for is smaller method: checks if circle 1 is smaller than circle 2
		if (circle1.isSmaller(circle2)) {
	
			if (circle1.isSmaller(circle2)) {
				System.out.println("PASSED: Circle1 is smaller than circle2.");
			} else {
				System.out.println("FAILED: Circle1 is not smaller than circle2.");
			}
			if (circle1.perimeter() < circle2.perimeter()) { // Second test case for is smaller method if boolean is
																// true
				System.out.println("PASSED: The perimeter for circle1 is smaller than that of circle2.");
			} else {
				System.out.println("FAILED: The perimeter for circle1 is not smaller than that of circle2.");
			}
			if (circle1.area() < circle2.area()) { // Third test case if boolean is false
				System.out.println("PASSED: The area for circle1 is smaller than that of circle2.");
			} else {
				System.out.println("FAILED: The area for circle1 is not smaller than that of circle2.");
			}


		}
		System.out.println();
		System.out.println("Test cases for compare to method");
		// First test case: checks if circle 1 is bigger than  circle 2
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("PASSED: The object circle1 is larger than circle2.");
		} else {
			System.out.println("FAILED: The object circle1 is not larger than circle2.");
		// Second test case : checks if the X,Y values for circle 1 are larger than circle 2
		}
		if (circle1.getX() > circle2.getX() && circle1.getY() > circle2.getY()) {
			System.out
					.println("PASSED: Both the x and y values for circle1 (center of circle) are larger than circle2.");
		} else {
			System.out.println(
					"FAILED: Both the x and y values for circle1 (center of circle) are not larger than circle2.");
		//Test case 3 : checks if the radius for circle 1 is greater   than circle  2
		}
		if (circle1.getRadius() > circle2.getRadius()) {
			System.out.println("PASSED: The radius for circle1 is larger than circle2.");
		} else {
			System.out.println("FAILED: The radius for circle1 is not larger than circle2.");
		}
		
		
		System.out.println();
		System.out.println("Test cases for the intersection method");
		//Test case 1 for intersect method: checks if the circles intersect
	if (circle1.intersects(circle2)) {
		System.out.println("PASSED: circle1 intersects circle2");
	}else {
		System.out.println("FAILED: circle1 does not  intersects circle2 ");}
		
		//Test case 2 for intersect method: checks if the circles touch
		if (Math.abs(circle1.getRadius() + circle2.getRadius() - circle1.distance(circle2)) < THRESHOLD) {
			System.out.println(
					"PASSED: The circles touch");				
		} else {
			System.out.println("FAILED:The circles do not touch");
			//Test case 3 for intersect  method: checks if the circles either intersect of  touch
			
		}
		if (circle1.intersects(circle2) || (Math.abs(circle1.getRadius() + circle2.getRadius() - circle1.distance(circle2)) < THRESHOLD)){
			System.out.println("PASSED: The circles either intersect or touch ");}
		else {
				System.out.println("FAILED: Thecircles niether touched nor did they intersect");}
			
				
			
		}
	}
	

