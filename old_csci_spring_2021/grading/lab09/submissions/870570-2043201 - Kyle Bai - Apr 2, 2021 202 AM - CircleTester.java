/*
 * [CircleTester].java
 * Author:  [KyleBai] 
 * Submission Date:  [04/02/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program is use to test the circle.java
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
		circle1.setName("Circle1 ");
		circle1.setX(0.0);
		circle1.setY(.0);
		circle1.setRadius(2);
		circle2.setName("Circle2 ");
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
		System.out.println("\ncircle1: \n" + circle1);

		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		System.out.println("circle2: \n" + circle2);

		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements

		// print circle1 diameter, area and perimeter
		System.out.println("\nCircle 1" + "\ndiameter: " + circle1.diameter() + "\narea: " + circle1.area() + "\nperimeter: " + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("\nCircle 2" + "\ndiameter: " + circle2.diameter() + "\narea: " + circle2.area() + "\nperimeter: " + circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("\nunit circle 1 is " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("unit circle 2 is " + circle2.isUnitCircle());

		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.

		//test case 3
		Circle circle3 = new Circle();
		circle3.setName("Circle3 ");
		circle3.setX(0.0);
		circle3.setY(0.0);
		circle3.setRadius(1.0);
		System.out.println("\ncircle3="+circle3);
		System.out.println("Circle 3" + "\ndiameter: " + circle3.diameter() + "\narea: " + circle3.area() + "\nperimeter: " + circle3.perimeter());
		System.out.println("unit circle 3 is " + circle3.isUnitCircle());
	}
}