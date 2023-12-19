/*
 * CircleTester.java
 * Author:  Delaney Ott
 * Submission Date:  April 2nd 2021
 *
 * Purpose: This program is designed to calculate the area, perimeter, and distance between two circles.
 * It also compares circles using different methods and test cases that we have created. At the end,
 * we use unit testing to make sure our methods are working properly.
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
		System.out.println("Circle 1: "+ circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("Circle 2: "+ circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("Circle 1");
		System.out.println("Diameter: " + circle1.diameter());
		System.out.println("Area: " + circle1.area());
		System.out.println("Perimeter: "+ circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("Circle 2");
		System.out.println("Diameter: " + circle2.diameter());
		System.out.println("Area: " + circle2.area());
		System.out.println("Perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println("Is Circle 1 a unit circle? : " + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		System.out.println("Is Circle 2 a unit circle? : " + circle2.isUnitCircle());
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		//equals Method Test Cases
		//Different Radius, x, and y
		if(circle1.equals(circle2) == false) {
			System.out.println("PASS: equals");
		} else {
			System.out.println("FAIL: equals");
		}
		//Different Radius, Same x and y
		circle1.setRadius(2);
		circle1.setX(1);
		circle1.setY(1);
		circle2.setRadius(1);
		circle2.setX(1);
		circle2.setY(1);
		if(circle1.equals(circle2) == false) {
			System.out.println("PASS: equals");
		} else {
			System.out.println("FAIL: equals");
		}
		//Same Radius, x, and y
		circle2.setRadius(2);
		if(circle1.equals(circle2) == true) {
			System.out.println("PASS: equals");
		} else {
			System.out.println("FAIL: equals");
		}
		//distance Method Test Cases
		//Same Radius, x, and y so the distance should be 0
		if(Math.abs(circle1.distance(circle2) - 0) < THRESHOLD) {
			System.out.println("PASS: distance");
		} else {
			System.out.println("FAIL: distance");
		}
		//Same x and y, but different Radius so the distance should still be 0
		circle2.setRadius(1);
		if(Math.abs(circle1.distance(circle2) - 0) < THRESHOLD) {
			System.out.println("PASS: distance");
		} else {
			System.out.println("FAIL: distance");
		}
		//Different x, y, and Radius so the distance should be greater than 0
		circle2.setX(2);
		circle2.setY(4);
		if(circle1.distance(circle2) > THRESHOLD) {
			System.out.println("PASS: distance");
		} else {
			System.out.println("FAIL: distance");
		}
		//isSmaller Method Test Cases
		//Circle 1 Radius is larger than Circle 2 Radius, they have different x and y. Circle 1 should be larger
		if(circle1.isSmaller(circle2) == false) {
			System.out.println("PASS: isSmaller");
		} else {
			System.out.println("FAIL: isSmaller");
		}
		//Circle 1 and 2 have the same radius, so it should be false
		circle2.setRadius(2);
		if(circle1.isSmaller(circle2) == false) {
			System.out.println("PASS: isSmaller");
		} else {
			System.out.println("FAIL: isSmaller");
		}
		//Circle 2 radius is larger, so it should be true
		circle2.setRadius(4);
		if(circle1.isSmaller(circle2) == true) {
			System.out.println("PASS: isSmaller");
		} else {
			System.out.println("FAIL: isSmaller");
		}
		//compareTo Method Test Cases
		//Same x and y values, but Radius in circle 2 is larger, so circle2 is larger and should return -1
		circle2.setX(1);
		circle2.setY(1);
		if(circle1.compareTo(circle2) < THRESHOLD) {
			System.out.println("PASS: compareTo");
		} else {
			System.out.println("FAIL: compareTo");
		}
		//Same x and y values, but Radius in circle 2 is smaller, so circle 1 is larger and should return 1
		circle1.setRadius(2);
		circle2.setRadius(1);
		if(circle1.compareTo(circle2) > THRESHOLD) {
			System.out.println("PASS: compareTo");
		} else {
			System.out.println("FAIL: compareTo");
		}
		//Same radius, x and y values, so the circles are the same size and should return 0
		circle1.setRadius(1);
		if(Math.abs(circle1.compareTo(circle2) - 0) < THRESHOLD) {
			System.out.println("PASS: compareTo");
		} else {
			System.out.println("FAIL: compareTo");
		}
		//intersects Method Test Cases
		//Same radius, x, and y, so the circles intersect
		if(circle1.intersects(circle2) == true) {
			System.out.println("PASS: intersects");
		} else {
			System.out.println("FAIL: intersects");
		}
		//Different x and y, but large enough radius that the circles intersect
		circle1.setRadius(5);
		circle2.setX(8);
		circle2.setX(8);
		circle2.setRadius(4);
		if(circle1.intersects(circle2) == true) {
			System.out.println("PASS: intersects");
		} else {
			System.out.println("FAIL: intersects");
		}
		//Same radius that is small and different x and y so the circles don't intersect
		circle1.setRadius(1);
		circle2.setRadius(1);
		if(circle1.intersects(circle2) == false) {
			System.out.println("PASS: intersects");
		} else {
			System.out.println("FAIL: intersects");
		}
	}
	
}