/*
 * [CircleTester].java
 * Author:  [Rachel Chesebro'] 
 * Submission Date:  [10/29/2021]
 *
 * Purpose: The purpose of this program is to test the Circle.java class to test if the
 * methods are correctly set up. It should correctly display the methods declared in
 * the Circle.java class and the components of each circle, such as diameter.
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
//  of the class Circle. Use the default constructor
//  in the Circle class to create Circle objects. 
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
		circle2.setRadius(5.3);
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
		
		// Reset the center of circle1 (-3.0,4.0)
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements.
		System.out.println("The center of circle 1 is (" + circle1.getX() + "," + circle1.getY() + ")");
		System.out.println("The radius of circle 1 is " + circle1.getRadius());
		
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and second println statements
		System.out.println("The center of circle 2 is (" + circle2.getX() + "," + circle2.getY() + ")");
		System.out.println("The radius of circle 2 is " + circle2.getRadius());
		
		// print circle1 diameter, area and perimeter
		System.out.println("The diameter of circle1 is " + circle1.diameter());
		System.out.println("The area of circle1 is " + circle1.area());
		System.out.println("The perimeter of circle1 is " + circle1.perimeter());

		
		// print circle2 diameter, area and perimeter
		System.out.println("The diameter of circle2 is " + circle2.diameter());
		System.out.println("The area of circle2 is " + circle2.area());
		System.out.println("The perimeter of circle2 is " + circle2.perimeter());

		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle()) {
			System.out.println("circle1 is a unit circle");
		}
		else {
			System.out.println("circle1 is not a unit circle");
		}

		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle()) {
			System.out.println("circle2 is a unit circle");
		}
		else {
			System.out.println("circle2 is not a unit circle");
		}

				
	}
	
}