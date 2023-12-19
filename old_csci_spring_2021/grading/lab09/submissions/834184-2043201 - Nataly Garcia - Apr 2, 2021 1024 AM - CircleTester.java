/*
 * CircleTester.java
 * Author:  Nataly Garcia
 * Submission Date:  April 2 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program test the class
 * named Circle.java and its methods within the class.
 * By setting new values to existing variables, the user can
 * see if the method works because it result in a "PASSED: ___ Test"
 * message,
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
		System.out.println(circle1.diameter());
		System.out.println(circle1.area());
		System.out.println(circle1.perimeter());
	
		
		// print circle2 diameter, area and perimeter
		System.out.println(circle2.diameter());
		System.out.println(circle2.area());
		System.out.println(circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println(circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		System.out.println(circle2.isUnitCircle());
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		circle1.setX(0.0);
		circle2.setX(0.0);
		circle1.setY(6.0);
		circle2.setY(0.0);
		circle1.setRadius(5.0);
		circle2.setRadius(5.0);
		
		
		if (circle1.equals(circle2) == false) {
			System.out.println("PASSED: first equals Test");
		}
		
		circle2.setRadius(8.0);
		
		if (circle1.equals(circle2) == false) {
			System.out.println("PASSED: second equals Test");
		}
		
		circle1.setY(0.0);
		circle2.setRadius(5.0);
		
		if (circle1.equals(circle2) == true) {
			System.out.println("PASSED: third equals Test");
		}
		
		if (circle1.distance(circle2) == 0) {
			System.out.println("PASSED: first distance Test");
		}
		
		circle1.setX(3.0);
		
		if (circle1.distance(circle2) == 3) {
			System.out.println("PASSED: second distance Test");
		}
		
		circle2.setY(5.0);
		
		if (Math.abs(circle1.distance(circle2) - 5.830951894845301) < THRESHOLD) {
			System.out.println("PASSED: third distance Test");
		}
		
		if (circle1.isSmaller(circle2) == false) {
			System.out.println("PASSED: first isSmaller Test");
		}
		
		if (circle1.compareTo(circle2) == 0) {
			System.out.println("PASSED: first compareTo Test");
		}
		
		circle1.setRadius(7.0);
		
		if (circle2.isSmaller(circle1) == true) {
			System.out.println("PASSED: second isSmaller Test");
		}
		
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("PASSED: second compareTo Test");
		}
		
		circle2.setRadius(12.0);
		
		if (circle2.isSmaller(circle1) == false) {
			System.out.println("PASSED: third isSmallerTest");
		}
		
		if (circle1.compareTo(circle2) == -1) {
			System.out.println("PASSED: third compareToTest");
		}
		
		circle1.setX(0.0);
		circle2.setX(0.0);
		circle1.setY(0.0);
		circle2.setY(0.0);
		circle1.setRadius(5.0);
		circle2.setRadius(5.0);
		
		if (circle1.intersects(circle2) == true) {
			System.out.println("PASSED: first intersects Test");
		}
		
		circle1.setX(11.0);
		
		if (circle1.intersects(circle2) == false) {
			System.out.println("PASSED: second intersects Test");
		}
		
		circle2.setY(7.0);
		circle1.setX(0.0);
		circle2.setX(3.0);
		
		if (circle1.intersects(circle2) == true) {
			System.out.println("PASSED: third intersects Test");
		}
		
		
	}
	
}