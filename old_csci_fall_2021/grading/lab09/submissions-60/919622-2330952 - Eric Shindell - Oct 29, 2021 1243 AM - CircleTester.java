/*
 * CircleTester.java
 * Author:  Eric Shindell
 * Submission Date:  10/29/2021
 *
 * Purpose: This code expands upon Circle.java by extensively testing every
 * single method created within Circle.java, including the smallest ones such as
 * the getX and setX methods. It checks each method three times, prints whether it
 * passed the test or not, then continues on to the next test. These tests are customized
 * for those specific X, Y, and Radius values, so changing them would mess up the results of the
 * tests.
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
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		}	else {
			System.out.println("FAILED: Set Radius");
		}
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. 
		
		System.out.println("circle1=" + circle1);
		
		// set the circle2 radius to 5.3
		
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		
		System.out.println("circle2=" + circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("Circle 1: Diameter: " + circle1.diameter() + ", area: " + circle1.area() + ", perimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("Circle 2: Diameter: " + circle2.diameter() + ", area: " + circle2.area() + ", perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.print("Circle 1 is ");
		if(circle1.isUnitCircle() == false) {
			System.out.print("not a unit circle.");
		}
		else {
			System.out.print("is a unit circle.");
		}
		System.out.println("");
		
		// display whether circle2 is a unit circle
		System.out.print("Circle 2 is ");
		if(circle2.isUnitCircle() == false) {
			System.out.print("not a unit circle.");
		}
		else {
			System.out.print("is a unit circle.");
		}
		System.out.println("");
		System.out.println("");
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		Circle circle3 = new Circle();

	
		//Get and Set Name Tests
		
		circle1.setName("Corcle");
		circle2.setName("Square");
		circle3.setName("Test Circle");
		
		//Test 1
		if(circle1.getName().equals("Corcle")) {
			System.out.println("PASSED: Set and Get Name");
		}	else {
			System.out.println("FAILED: Set and Get Name");
		}

		//Test 2
		if(circle2.getName().equals("Square")) {
			System.out.println("PASSED: Set and Get Name");
		}	else {
			System.out.println("FAILED: Set and Get Name");
		}

		//Test 3
		if(circle3.getName().equals("Test Circle")) {
			System.out.println("PASSED: Set and Get Name");
		}	else {
			System.out.println("FAILED: Set and Get Name");
		}
		
		System.out.println("");
		
		//Set and Get tests for X, Y, and Radius
		
		circle1.setX(3.0);
		circle2.setX(4.0);
		circle3.setX(11.3);
		
		circle1.setY(0.0);
		circle2.setY(-2.0);
		circle3.setY(10.0);
		
		circle1.setRadius(2);
		circle2.setRadius(5.0);
		circle3.setRadius(20.0);
		
		//Get X tests
		//Test 1
		if(Math.abs(circle1.getX() - 3.0) < THRESHOLD) {
			System.out.println("PASSED: Set and Get X");
		}	else {
			System.out.println("FAILED: Set and Get X");
		}

		//Test 2
		if(Math.abs(circle2.getX() - 4.0) < THRESHOLD) {
			System.out.println("PASSED: Set and Get X");
		}	else {
			System.out.println("FAILED: Set and Get X");
		}

		//Test 3
		if(Math.abs(circle3.getX() - 11.3) < THRESHOLD) {
			System.out.println("PASSED: Set and Get X");
		}	else {
			System.out.println("FAILED: Set and Get X");
		}
	
		System.out.println("");
		
		//Get Y tests
		//Test 1
		if(Math.abs(circle1.getY() - 0) < THRESHOLD) {
			System.out.println("PASSED: Set and Get Y");
		}	else {
			System.out.println("FAILED: Set and Get Y");
		}

		//Test 2
		if(Math.abs(circle2.getY() + 2.0) < THRESHOLD) {
			System.out.println("PASSED: Set and Get Y");
		}	else {
			System.out.println("FAILED: Set and Get Y");
		}

		//Test 3
		if(Math.abs(circle3.getY() - 10.0) < THRESHOLD) {
			System.out.println("PASSED: Set and Get Y");
		}	else {
			System.out.println("FAILED: Set and Get Y");
		}
		
		System.out.println("");
		
		//Get Radius tests
		//Test 1
		if(Math.abs(circle1.getRadius() - 2.0) < THRESHOLD) {
			System.out.println("PASSED: Set and Get Radius");
		}	else {
			System.out.println("FAILED: Set and Get Radius");
		}

		//Test 2
		if(Math.abs(circle2.getRadius() - 5.0) < THRESHOLD) {
			System.out.println("PASSED: Set and Get Radius");
		}	else {
			System.out.println("FAILED: Set and Get Radius");
		}

		//Test 3
		if(Math.abs(circle3.getRadius() - 20.0) < THRESHOLD) {
			System.out.println("PASSED: Set and Get Radius");
		}	else {
			System.out.println("FAILED: Set and Get Radius");
		}
		
		System.out.println("");
		
		//Area Tests
		//Test 1
		if(Math.abs(circle1.area() - (Math.PI * 2 * 2)) < THRESHOLD) {
			System.out.println("PASSED: Get Area");
		}	
		else {
			System.out.println("FAILED: Get Area");
		}
		
		//Test 2
		if(Math.abs(circle2.area() - (Math.PI * 5 * 5)) < THRESHOLD) {
			System.out.println("PASSED: Get Area");
		}	
		else {
			System.out.println("FAILED: Get Area");
		}
		
		//Test 3
		if(Math.abs(circle3.area() - (Math.PI * 20 * 20)) < THRESHOLD) {
			System.out.println("PASSED: Get Area");
		}	
		else {
			System.out.println("FAILED: Get Area");
		}
	
		System.out.println("");
		
		//Perimeter Tests
		//Test 1
		if(Math.abs(circle1.perimeter() - (Math.PI * 2 * 2)) < THRESHOLD) {
			System.out.println("PASSED: Get Perimeter");
		}	
		else {
			System.out.println("FAILED: Get Perimeter");
		}
		
		//Test 2
		if(Math.abs(circle2.perimeter() - (Math.PI * 5 * 2)) < THRESHOLD) {
			System.out.println("PASSED: Get Perimeter");
		}	
		else {
			System.out.println("FAILED: Get Perimeter");
		}
		
		//Test 3
		if(Math.abs(circle3.perimeter() - (Math.PI * 20 * 2)) < THRESHOLD) {
			System.out.println("PASSED: Get Perimeter");
		}	
		else {
			System.out.println("FAILED: Get Perimeter");
		}
	
		System.out.println("");
		
		//Diameter Tests
		//Test 1
		if(Math.abs(circle1.diameter() - (2 * 2)) < THRESHOLD) {
			System.out.println("PASSED: Get Diameter");
		}	
		else {
			System.out.println("FAILED: Get Diameter");
		}
		
		//Test 2
		if(Math.abs(circle2.diameter() - (5 * 2)) < THRESHOLD) {
			System.out.println("PASSED: Get Diameter");
		}	
		else {
			System.out.println("FAILED: Get Diameter");
		}
		
		//Test 3
		if(Math.abs(circle3.diameter() - (20 * 2)) < THRESHOLD) {
			System.out.println("PASSED: Get Diameter");
		}	
		else {
			System.out.println("FAILED: Get Diameter");
		}
	
		System.out.println("");
		
		//Is Unit Circle Tests
		
		circle3.setX(0);
		circle3.setY(0);
		circle3.setRadius(1);
		
		//Test 1
		if (circle1.isUnitCircle()) {
			System.out.println("FAILED: isUnitCircle");
		}
		else {
			System.out.println("PASSED: isUnitCircle");
		}
		
		//Test 2
		if (circle2.isUnitCircle()) {
			System.out.println("FAILED: isUnitCircle");
		}
		else {
			System.out.println("PASSED: isUnitCircle");
		}		
		
		//Test 3
		if (circle3.isUnitCircle()) {
			System.out.println("PASSED: isUnitCircle");
		}
		else {
			System.out.println("FAILED: isUnitCircle");
		}
		
		System.out.println("");
		
		//To String Tests
		//Test 1
		if(circle1.toString().equals("name: Corcle\ncenter: (3.0,0.0) \nradius: 2.0")) {
			System.out.println("PASSED: toString");
		}
		else {
			System.out.println("FAILED: toString");
		}
		
		//Test 2
		if(circle2.toString().equals("name: Square\ncenter: (4.0,-2.0) \nradius: 5.0")) {
			System.out.println("PASSED: toString");
		}
		else {
			System.out.println("FAILED: toString");
		}
		
		//Test 3
		if(circle3.toString().equals("name: Test Circle\ncenter: (0.0,0.0) \nradius: 1.0")) {
			System.out.println("PASSED: toString");
		}
		else {
			System.out.println("FAILED: toString");
		}
		
		System.out.println("");
		
		//Equals Test
		
		//Test 1
		if(circle1.equals(circle3)) {
			System.out.println("FAILED: Equals");
		}
		else {
			System.out.println("PASSED: Equals");
		}
		
		//Test 2
		if(circle2.equals(circle3)) {
			System.out.println("FAILED: Equals");
		}
		else {
			System.out.println("PASSED: Equals");
		}
		
		circle2.setX(0);
		circle2.setY(0);
		circle2.setRadius(1.0);
		
		//Test 3
		if(circle2.equals(circle3)) {
			System.out.println("PASSED: Equals");
		}
		else {
			System.out.println("FAILED: Equals");
		}
		
		System.out.println("");
		
		//Distance tests
		
		circle2.setX(5);
		
		//Test 1
		
		if(Math.abs(circle2.distance(circle3) - 5) < THRESHOLD) {
			System.out.println("PASSED: Distance");
		}
		else {
			System.out.println("FAILED: Distance");
		}
		
		circle2.setX(0);
		circle3.setY(20);
		
		//Test 2
		
		if(Math.abs(circle3.distance(circle2) - 20) < THRESHOLD) {
			System.out.println("PASSED: Distance");
		}
		else {
			System.out.println("FAILED: Distance");
		}
		
		circle3.setY(Math.sqrt(3));
		circle3.setX(Math.sqrt(6));
		
		//Test 3
		
		if(Math.abs(circle2.distance(circle3) - 3) < THRESHOLD) {
			System.out.println("PASSED: Distance");
		}
		else {
			System.out.println("FAILED: Distance");
		}
		
		System.out.println("");
	
		//IsSmaller Tests
		
		circle1.setRadius(1);
		circle2.setRadius(5);
		circle3.setRadius(20);

		//Test 1
		if(circle2.isSmaller(circle3)) {
			System.out.println("PASSED: Is Smaller");
		}
		else {
			System.out.println("FAILED: Is Smaller");
		}
		
		//Test 2
		if(circle3.isSmaller(circle1)) {
			System.out.println("FAILED: Is Smaller");
		}
		else {
			System.out.println("PASSED: Is Smaller");
		}
	
		//Test 3
		if(circle1.isSmaller(circle3)) {
			System.out.println("PASSED: Is Smaller");
		}
		else {
			System.out.println("FAILED: Is Smaller");
		}
	
		System.out.println("");
		
		
		//Compare To Tests
		//Test 1
		if(Math.abs(circle2.compareTo(circle3) + 1) < THRESHOLD) {
			System.out.println("PASSED: Compare To");
		}
		else {
			System.out.println("FAILED: Compare To");
		}
		
		//Test 2
		if(Math.abs(circle2.compareTo(circle1) - 1) < THRESHOLD) {
			System.out.println("PASSED: Compare To");
		}
		else {
			System.out.println("FAILED: Compare To");
		}
		
		circle2.setRadius(20);
		
		//Test 3
		if(Math.abs(circle2.compareTo(circle3)) < THRESHOLD) {
			System.out.println("PASSED: Compare To");
		}
		else {
			System.out.println("FAILED: Compare To");
		}
		
		System.out.println("");
		
		//Intersects Tests
		
		circle1.setX(200);
		circle1.setRadius(2);
		circle2.setRadius(50);
		
		//Test 1
		if(circle1.intersects(circle3)) {
			System.out.println("FAILED: Intersects");
		}
		else {
			System.out.println("PASSED: Intersects");
		}
		
		//Test 2
		if(circle2.intersects(circle3)) {
			System.out.println("PASSED: Intersects");
		}
		else {
			System.out.println("FAILED: Intersects");
		}
		
		//Test 3
		if(circle2.intersects(circle1)) {
			System.out.println("FAILED: Intersects");
		}
		else {
			System.out.println("PASSED: Intersects");
		}
	}
}
