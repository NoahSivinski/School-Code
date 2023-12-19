/*
 * CircleTester.java
 * Author:  Justin Hesse 
 * Submission Date:  3/31/2021
 *
 * Purpose: Tests methods and functionality of the circle class.
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
		System.out.println("Circle1: " + circle1);
		//System.out.println("Circle 1 center: (" + circle1.getX() + "," + circle1.getY() + ")");
		//System.out.println("Circle 1 radius: " + circle1.getRadius());
		//System.out.println(circle1.getName());
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("Circle2: " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Circle1 diameter: " + circle1.diameter());
		System.out.println("Circle1 perimeter: " + circle1.perimeter());
		System.out.println("Circle1 area: " + circle1.area());
		// print circle2 diameter, area and perimeter
		System.out.println("Circle2 diameter: " + circle2.diameter());
		System.out.println("Circle2 perimeter: " + circle2.perimeter());
		System.out.println("Circle2 area: " + circle2.area());
		// display whether circle1 is a unit circle
		System.out.println("Circle1 is a unit circle: " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle2 is a unit circle: " + circle2.isUnitCircle());
		
		
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		System.out.println();
		System.out.println("**UNIT TEST OUTPUTS BELOW**");
		System.out.println();
		
		//First unit test for equals method
		circle1.setRadius(3);
		circle2.setRadius(3);
		circle1.setX(3.4);
		circle1.setY(5.2);
		circle2.setX(3.4);
		circle2.setY(5.2);
		//test should be PASSED
		if(circle1.equals(circle2)) {
			System.out.println("PASSED: equals");
		}
		else {
			System.out.println("FAILED: equals"); //Not printed
		}
		
		//Second unit test for equals method
		circle1.setRadius(4);
		circle2.setRadius(8);
		circle1.setX(2.6);
		circle1.setY(6.7);
		circle2.setX(2.6);
		circle2.setY(6.7);
		//test should FAIL
		if(circle1.equals(circle2)) {
			System.out.println("PASSED: equals"); //Not printed
		}
		else {
			System.out.println("FAILED: equals");
		}
		
		//Third unit test for equals method
		circle1.setRadius(circle2.getRadius());
		circle1.setX(circle2.getX());
		circle1.setY(circle2.getY());
		//test should be PASSED
		if(circle1.equals(circle2)) {
			System.out.println("PASSED: equals");
		}
		else {
			System.out.println("FAILED: equals"); //Not printed
		}
		
		//First unit test for distance method
		circle1.setX(4.0);
		circle1.setY(7.0);
		circle2.setX(5.0);
		circle2.setY(10.0);
		//distance should be sqrt(10)
		if(Math.abs(circle1.distance(circle2) - Math.sqrt(10)) < THRESHOLD){
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance"); //Not printed
		}
		
		//Second unit test for distance method
		circle2.setX(circle1.getX());
		circle1.setY(circle2.getY());
		//distance should be 0
		if(Math.abs(circle1.distance(circle2) - 0) < THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance"); //Not printed
		}
		
		//Third test for distance method
		circle1.setX(249);
		circle1.setY(0.0);
		circle2.setX(24);
		circle2.setY(0.0);
		//distance should be 15
		if(Math.abs(circle1.distance(circle2) - 15) > THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");	//Not printed
		}
		
		//First unit test for isSmaller method
		circle1.setRadius(9.3);
		circle2.setRadius(9.4);
		//test should PASS
		if(circle1.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller"); //Not printed
		}
		
		//Second test for isSmaller
		circle1.setRadius(9.4);
		circle2.setRadius(9.3);
		
		if(circle2.isSmaller(circle1)) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller"); //Not printed
		}
		
		//Third test for isSmaller
		circle1.setRadius(0.0003);
		circle2.setRadius(0.003);
		
		if(circle1.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller"); //Not printed
		}
		
		//First unit test for compareTo method
		circle1.setRadius(5.6);
		circle2.setRadius(4.3);
		
		if(circle1.compareTo(circle2) == 1) {
			System.out.println("PASSED: compareTo"); 
		}
		else {
			System.out.println("FAILED: compareTO");	//Not printed
		}
		
		//Second test for compareTo
		circle1.setRadius(3.3);
		circle2.setRadius(3.6);
		
		if(circle1.compareTo(circle2) == -1) {
			System.out.println("PASSED: compareTo"); 
		}
		else {
			System.out.println("FAILED: compareTo");	//Not printed
		}
		
		//Third test for compareTo
		circle1.setRadius(5.678);
		circle2.setRadius(5.678);
		
		if(circle1.compareTo(circle2) == 0) {
			System.out.println("PASSED: compareTo"); 
		}
		else {
			System.out.println("FAILED: compareTo");	//Not printed
		}
		
		//First test for intersects
		circle2.setRadius(6);
		circle2.setX(4.6);
		circle2.setY(3.1);
		circle1.setRadius(4);
		circle1.setX(6.8);
		circle1.setY(1.6);
		
		if(circle2.intersects(circle1)) {
			System.out.println("PASSED: intersects"); 
		}
		else {
			System.out.println("FAILED: intersects");	//Not printed
		}
		
		//Second test for intersects
		circle1.setRadius(circle2.getRadius());
		circle1.setX(circle2.getX());
		circle1.setY(circle2.getY());
		
		if(circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects"); 
		}
		else {
			System.out.println("FAILED: intersects"); //Not printed
		}
		
		//Third test for intersects
		circle1.setRadius(10);
		circle1.setX(5.6);
		circle1.setY(5.6);
		circle2.setRadius(1);
		circle2.setX(100);
		circle2.setY(31.875);
		
		if(circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects"); //Not printed
		}
		else {
			System.out.println("FAILED: intersects"); 
		}
		
	}
	
}