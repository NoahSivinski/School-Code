/*
 * CircleTester.java
 * Author:  Evan McKinney 
 * Submission Date:  10/29/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *	This program checks and tests the methods for
 *	the class Circle. It makes sure each method
 *	performs the action it should.
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
		System.out.println("circle1="+circle1);
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2="+circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("cirlce1 diameter = " + circle1.diameter());
		System.out.println("circle1 area = " + circle1.area());
		System.out.println("circle1 perimeter = " + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("cirlce2 diameter = " + circle2.diameter());
		System.out.println("circle2 area = " + circle2.area());
		System.out.println("circle2 perimeter = " + circle2.perimeter());
		// display whether circle1 is a unit circle
		if(circle1.isUnitCircle()) {
			System.out.println("circle1 is a unit circle");
		}else {
			System.out.println("circle1 is not a unit circle");
		}
		// display whether circle2 is a unit circle
		if(circle2.isUnitCircle()) {
			System.out.println("circle2 is a unit circle");
		}else {
			System.out.println("circle2 is not a unit circle");
		}
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		System.out.println("\nMethod Tests");
		
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		
		c1.setX(0.0);
		c1.setY(0.0);
		c1.setRadius(1);
		c1.setName("Unit Circle");

		c2.setX(2.0);
		c2.setY(4.0);
		c2.setRadius(5);
		c2.setName("Circle");
		
		c3.setX(2.0);
		c3.setY(4.0);
		c3.setRadius(5);
		c3.setName("Circle");
		
		//testing equals method
		System.out.println("---Equals Method Test---");
		if(!c1.equals(c2)) {
			System.out.println("Test 1 passed");
		}else {
			System.out.println("Test 1 failed");
		}
		if(!c1.equals(c3)) {
			System.out.println("Test 2 passed");
		}else {
			System.out.println("Test 2 failed");
		}
		if(c3.equals(c2)) {
			System.out.println("Test 3 passed");
		}else {
			System.out.println("Test 3 failed");
		}
		
		//testing distance method, with actual values calculated with calculator
		c3.setX(3.0);
		c3.setY(4.0);
		System.out.println("---Distance Method Test---");
		if(Math.abs(c1.distance(c2) - 4.472135955) < THRESHOLD) {
			System.out.println("Test 1 passed");
		}else {
			System.out.println("Test 1 failed");
		}
		if(Math.abs(c1.distance(c3) - 5.0) < THRESHOLD) {
			System.out.println("Test 2 passed");
		}else {
			System.out.println("Test 2 failed");
		}
		if(Math.abs(c2.distance(c3) - 1.0) < THRESHOLD) {
			System.out.println("Test 3 passed");
		}else {
			System.out.println("Test 3 failed");
		}
		
		//testing isSmaller
		c3.setRadius(0.5);
		System.out.println("---IsSmaller Method Test---");
		if(c1.isSmaller(c2)) {
			System.out.println("Test 1 passed");
		}else {
			System.out.println("Test 1 failed");
		}
		if(!c2.isSmaller(c1)) {
			System.out.println("Test 2 passed");
		}else {
			System.out.println("Test 2 failed");
		}
		if(c3.isSmaller(c1)) {
			System.out.println("Test 3 passed");
		}else {
			System.out.println("Test 3 failed");
		}
		
		//testing compareTo
		c3.setRadius(5);
		System.out.println("---CompareTo Method Test---");
		if(c1.compareTo(c2) < 0) {
			System.out.println("Test 1 passed");
		}else {
			System.out.println("Test 1 failed");
		}
		if(c2.compareTo(c3) == 0) {
			System.out.println("Test 2 passed");
		}else {
			System.out.println("Test 2 failed");
		}
		if(c3.compareTo(c1) > 0) {
			System.out.println("Test 3 passed");
		}else {
			System.out.println("Test 3 failed");
		}
		
		//tests intersects
		c3.setX(70.0);
		c3.setY(70.0);
		System.out.println("---Intersects Method Test---");
		if(c1.intersects(c2)) {
			System.out.println("Test 1 passed");
		}else {
			System.out.println("Test 1 failed");
		}
		if(!c3.intersects(c1)) {
			System.out.println("Test 2 passed");
		}else {
			System.out.println("Test 2 failed");
		}
		if(!c1.intersects(c3)) {
			System.out.println("Test 3 passed");
		}else {
			System.out.println("Test 3 failed");
		}
	}
	
}
