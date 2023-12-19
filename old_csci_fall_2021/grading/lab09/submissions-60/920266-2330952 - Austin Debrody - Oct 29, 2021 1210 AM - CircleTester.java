/*
 * CircleTester.java
 * Author:  Austin Debrody
 * Submission Date:  10/29/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * A client to test the functionality of objects
 *  of the class Circle. Use the default constructor
 * in the Circle class to create Circle objects. 
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
		System.out.println(circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println(circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("Circle 1 diameter: " + circle1.diameter());
		System.out.println("Circle 1 area: " + circle1.area());
		System.out.println("Circle 1 perimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("Circle 2 diameter: " + circle2.diameter());
		System.out.println("Circle 2 area: " + circle2.area());
		System.out.println("Circle 2 perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		if(circle1.isUnitCircle()) {
			System.out.println("Circle 1 is a unit circle");
		}else {
			System.out.println("Circle 1 is not a unit circle");
		}
		
		// display whether circle2 is a unit circle
		if(circle2.isUnitCircle()) {
			System.out.println("Circle 2 is a unit circle");
		}else {
			System.out.println("Circle 2 is not a unit circle");
		}
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		Circle circleTest = new Circle(); // circle object used for testing methods and values that can have variables be changed
		
		System.out.println("------------------"); // separates different test cases

		// tests the getName and setName methods of the circle class
		circleTest.setName("Hello"); // sets name of circle to "Hello"
		
		if(circleTest.getName().equals("Hello")) {
			System.out.println("PASSED: Set Name");
		}else {
			System.out.println("FAILED: Set Name");
		}
		
		circleTest.setName("Bob"); // sets name of circle to "Bob"
		
		if(circleTest.getName().equals("Bob")) {
			System.out.println("PASSED: Set Name");
		}else {
			System.out.println("FAILED: Set Name");
		}
		
		circleTest.setName("Austin"); // sets name of circle to "Hello"
		
		if(circleTest.getName().equals("Aus")) {
			System.out.println("FAILED: Set Name"); // getName should not be equal to "Aus"
		}else {
			System.out.println("PASSED: Set Name");
		}
		
		
		System.out.println("------------------"); // separates different test cases
		
		// tests the setX and getX methods of the circle class
		circleTest.setX(1); // intended to set x coordinate of center to 1
		
		if(Math.abs(circleTest.getX() - 1) < THRESHOLD) {
			System.out.println("PASSED: Set X");
		}else {
			System.out.println("FAILED: Set X");
		}
		
		circleTest.setX(6); // intended to set x coordinate of center to 6
		
		if(Math.abs(circleTest.getX() - 6) < THRESHOLD) {
			System.out.println("PASSED: Set X");
		}else {
			System.out.println("FAILED: Set X");
		}
		
		circleTest.setX(-4); // intended to set x coordinate of center to 6
		
		if(Math.abs(circleTest.getX() + 4) < THRESHOLD) {
			System.out.println("PASSED: Set X");
		}else {
			System.out.println("FAILED: Set X");
		}	
		
		System.out.println("------------------"); // separates different test cases
		
		// tests the setY and getY methods of the circle class
		circleTest.setY(1); // intended to set y coordinate of center to 1
		
		if(Math.abs(circleTest.getY() - 1) < THRESHOLD) {
			System.out.println("PASSED: Set Y");
		}else {
			System.out.println("FAILED: Set Y");
		}
		
		circleTest.setY(6); // intended to set y coordinate of center to 6
		
		if(Math.abs(circleTest.getY() - 6) < THRESHOLD) {
			System.out.println("PASSED: Set Y");
		}else {
			System.out.println("FAILED: Set Y");
		}
		
		circleTest.setY(-4); // intended to set y coordinate of center to 6
		
		if(Math.abs(circleTest.getY() + 4) < THRESHOLD) {
			System.out.println("PASSED: Set Y");
		}else {
			System.out.println("FAILED: Set Y");
		}	
		
		System.out.println("------------------"); // separates different test cases
		
		// tests the setRadius and getRadius methods in the circle class
		circleTest.setRadius(2); // sets the radius of the circle to a known value 2
		
		if(Math.abs(circleTest.getRadius() - 2) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		}else {
			System.out.println("FAILED: Set Radius");
		}	
		
		circleTest.setRadius(10); // sets the radius of the circle to a known value 10
		
		if(Math.abs(circleTest.getRadius() - 10) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		}else {
			System.out.println("FAILED: Set Radius");
		}	
		
		circleTest.setRadius(1); // sets the radius of the circle to a known value 1
		circleTest.setRadius(-4); // sets radius to negative value which should cause radius to remain the value prior (i.e. 1)
		
		if(Math.abs(circleTest.getRadius() - 1) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		}else {
			System.out.println("FAILED: Set Radius");
		}	
		
		System.out.println("------------------"); // separates different test cases
		
		// tests the area method in the circle class
		circleTest.setRadius(2); // sets the radius of the circle to a known value 2
		
		if(Math.abs(circleTest.area() - (4 * Math.PI)) < THRESHOLD) {
			System.out.println("PASSED: Area");
		}else {
			System.out.println("FAILED: Area");
		}
		
		circleTest.setRadius(3); // sets the radius of the circle to a known value 3
		
		if(Math.abs(circleTest.area() - (9 * Math.PI)) < THRESHOLD) {
			System.out.println("PASSED: Area");
		}else {
			System.out.println("FAILED: Area");
		}
		
		circleTest.setRadius(5); // sets the radius of the circle to a known value 5
		
		if(Math.abs(circleTest.area() - (25 * Math.PI)) < THRESHOLD) {
			System.out.println("PASSED: Area");
		}else {
			System.out.println("FAILED: Area");
		}
		
		System.out.println("------------------"); // separates different test cases
		
		// tests perimeter method in the circle class
		circleTest.setRadius(5); // sets the radius of the circle to a known value 5
		
		if(Math.abs(circleTest.perimeter() - (2 * Math.PI * 5)) < THRESHOLD) {
			System.out.println("PASSED: Perimeter");
		}else {
			System.out.println("FAILED: Perimeter");
		}
		
		circleTest.setRadius(4); // sets the radius of the circle to a known value 4
		
		if(Math.abs(circleTest.perimeter() - (2 * Math.PI * 4)) < THRESHOLD) {
			System.out.println("PASSED: Perimeter");
		}else {
			System.out.println("FAILED: Perimeter");
		}
		
		circleTest.setRadius(1); // sets the radius of the circle to a known value 1
		
		if(Math.abs(circleTest.perimeter() - (2 * Math.PI * 1)) < THRESHOLD) {
			System.out.println("PASSED: Perimeter");
		}else {
			System.out.println("FAILED: Perimeter");
		}
		
		System.out.println("------------------"); // separates different test cases
		
		// tests the diameter method in the circle class
		circleTest.setRadius(1); // sets the radius of the circle to a known value 1
		
		if(Math.abs(circleTest.diameter() - (2 * 1)) < THRESHOLD) {
			System.out.println("PASSED: Diameter");
		}else {
			System.out.println("FAILED: Diameter");
		}
		
		circleTest.setRadius(2); // sets the radius of the circle to a known value 2
		
		if(Math.abs(circleTest.diameter() - (2 * 2)) < THRESHOLD) {
			System.out.println("PASSED: Diameter");
		}else {
			System.out.println("FAILED: Diameter");
		}
		
		circleTest.setRadius(10); // sets the radius of the circle to a known value 10
		
		if(Math.abs(circleTest.diameter() - (2 * 10)) < THRESHOLD) {
			System.out.println("PASSED: Diameter");
		}else {
			System.out.println("FAILED: Diameter");
		}
		
		System.out.println("------------------"); // separates different test cases
		
		// tests the isUnitCircle method in the circle class
		circleTest.setX(-3.0); // sets the x coordinate of the center to a known value -3
		circleTest.setY(-3.0); // sets the y coordinate of the center to a known value -3
		circleTest.setRadius(2); // sets the radius of the circle to a known value 2
		
		// this test will NOT be a unit circle so it moves to the else statement
		if(circleTest.isUnitCircle()) {
			System.out.println("FAILED: isUnitCircle");
		}else {
			System.out.println("PASSED: isUnitCircle");
		}
		
		circleTest.setX(0); // sets the x coordinate of the center to a known value 0
		circleTest.setY(1); // sets the y coordinate of the center to a known value 1
		circleTest.setRadius(1); // sets the radius of the circle to a known value 1
		
		// this test will NOT be a unit circle so it moves to the else statement
		if(circleTest.isUnitCircle()) {
			System.out.println("FAILED: isUnitCircle");
		}else {
			System.out.println("PASSED: isUnitCircle");
		}
		
		circleTest.setX(0); // sets the x coordinate of the center to a known value 0
		circleTest.setY(0); // sets the y coordinate of the center to a known value 0
		circleTest.setRadius(1); // sets the radius of the circle to a known value 1
		
		// this test will be a unit circle so it moves to the else statement
		if(circleTest.isUnitCircle()) {
			System.out.println("PASSED: isUnitCircle");
		}else {
			System.out.println("FAILED: isUnitCircle");
		}
		
		System.out.println("------------------"); // separates different test cases
		
		// tests the equals method in the Circle class
		circleTest.setX(-3.0); // sets the x coordinate of the center to a known value -3
		circleTest.setY(-3.0); // sets the y coordinate of the center to a known value -3
		circleTest.setRadius(2); // sets the radius of the circle to a known value 2
		
		if(circle1.equals(circleTest)) {
			System.out.println("FAILED: Equals");
		}else {
			System.out.println("PASSED: Equals");
		}
		
		circleTest.setX(circle1.getX()); // sets the x coordinate of the center to the same as circle1's
		circleTest.setY(circle1.getY()); // sets the y coordinate of the center to the same as circle1's
		circleTest.setRadius(circle1.getRadius()); // sets the radius of the circle to the same as circle1's
		
		if(circle1.equals(circleTest)) {
			System.out.println("PASSED: Equals");
		}else {
			System.out.println("FAILED: Equals");
		}
		
		circleTest.setX(-8); // sets the x coordinate of the center to a known value -8
		circleTest.setY(6); // sets the y coordinate of the center to a known value 6
		circleTest.setRadius(5); // sets the radius of the circle to a known value 5
		
		if(circle2.equals(circleTest)) {
			System.out.println("FAILED: Equals");
		}else {
			System.out.println("PASSED: Equals");
		}
		
		System.out.println("------------------"); // separates different test cases
		
		// tests the distance method in the Circle class
		
		circleTest.setX(circle1.getX() - 1); // set X value to 1 less than circle1's X value
		circleTest.setY(circle1.getY()); // keep Y value the same as circle1's Y value
		circleTest.setRadius(5); // radius is irrelevant for this test
		
		if(circleTest.distance(circle1) - 1  < THRESHOLD) {
			System.out.println("PASSED: Distance");
		}else {
			System.out.println("FAILED: Distance");
		}
		
		circleTest.setX(circle1.getX()); // keep X value the same as circle1's X value
		circleTest.setY(circle1.getY() - 1); // set Y value to 1 less than circle1's Y value
		circleTest.setRadius(5); // radius is irrelevant for this test
		
		if(circleTest.distance(circle1) - 1  < THRESHOLD) {
			System.out.println("PASSED: Distance");
		}else {
			System.out.println("FAILED: Distance");
		}
		
		circleTest.setX(circle1.getX()); // keep X value the same as circle1's X value
		circleTest.setY(circle1.getY()); // keep Y value the same as circle1's Y value
		circleTest.setRadius(5); // radius is irrelevant for this test
		
		if(circleTest.distance(circle1) < THRESHOLD) {
			System.out.println("PASSED: Distance");
		}else {
			System.out.println("FAILED: Distance");
		}
		
		System.out.println("------------------"); // separates different test cases
		
		// tests the isSmaller method in the Circle class
		circleTest.setX(circle1.getX()); // X value is irrelevant
		circleTest.setY(circle1.getY()); // Y value is irrelevant
		circleTest.setRadius(circle1.getRadius()); // both circles have the same radius for this test
		
		if(circleTest.isSmaller(circle1)) {
			System.out.println("FAILED: isSmaller");
		}else {
			System.out.println("PASSED: isSmaller");
		}
		
		circleTest.setX(2); // X value is irrelevant
		circleTest.setY(6); // Y value is irrelevant
		circleTest.setRadius(circle1.getRadius() + 1); // circleTest is given larger radius to cause test to fail
		
		if(circleTest.isSmaller(circle1)) {
			System.out.println("FAILED: isSmaller");
		}else {
			System.out.println("PASSED: isSmaller");
		}
		
		circleTest.setX(2); // X value is irrelevant
		circleTest.setY(6); // Y value is irrelevant
		circleTest.setRadius(circle1.getRadius() - 1); // circleTest is given smaller radius to cause test to pass
		
		if(circleTest.isSmaller(circle1)) {
			System.out.println("PASSED: isSmaller");
		}else {
			System.out.println("FAILED: isSmaller");
		}
		
		System.out.println("------------------"); // separates different test cases
		
		// tests the compareTo method in the Circle class
		circleTest.setX(circle1.getX()); // X value is irrelevant
		circleTest.setY(circle1.getY()); // Y value is irrelevant
		circleTest.setRadius(circle1.getRadius()); // both circles have the same radius for this test
		
		if(circleTest.compareTo(circle1) == 0) {
			System.out.println("PASSED: compareTo");
		}else {
			System.out.println("FAILED: compareTo");
		}
		
		circleTest.setX(2); // X value is irrelevant
		circleTest.setY(6); // Y value is irrelevant
		circleTest.setRadius(circle1.getRadius() - 1); // circleTest is given smaller radius to test if 1 is returned
		
		if(circleTest.compareTo(circle1) == 1) {
			System.out.println("PASSED: compareTo");
		}else {
			System.out.println("FAILED: compareTo");
		}
		
		circleTest.setX(2); // X value is irrelevant
		circleTest.setY(6); // Y value is irrelevant
		circleTest.setRadius(circle1.getRadius() + 1); // circleTest is given larger radius to test if -1 is returned
		
		if(circleTest.compareTo(circle1) == -1) {
			System.out.println("PASSED: compareTo");
		}else {
			System.out.println("FAILED: compareTo");
		}
		
		System.out.println("------------------"); // separates different test cases
		
		// tests the intersects method in the Circle class
		circleTest.setX(circle1.getX() + 1); // X value is close enough to cause test to pass
		circleTest.setY(circle1.getY() + 1); // Y value is close enough to cause test to pass
		circleTest.setRadius(circle1.getRadius()); // both circles have the same radius for this test
		
		if(circleTest.intersects(circle1)) {
			System.out.println("PASSED: Intersects");
		}else {
			System.out.println("FAILED: Intersects");
		}
		
		circleTest.setX(circle1.getX() + 10); // X value is far enough to cause test to fail
		circleTest.setY(circle1.getY() + 10); // Y value is far enough to cause test to fail
		circleTest.setRadius(circle1.getRadius()); // both circles have the same radius for this test
		
		if(circleTest.intersects(circle1)) {
			System.out.println("FAILED: Intersects");
		}else {
			System.out.println("PASSED: Intersects");
		}
		
		circleTest.setX(circle1.getX()); // X value is exactly the same to cause test to pass
		circleTest.setY(circle1.getY()); // Y value is exactly the same to cause test to pass
		circleTest.setRadius(circle1.getRadius()); // both circles have the same radius for this test
		
		if(circleTest.intersects(circle1)) {
			System.out.println("PASSED: Intersects");
		}else {
			System.out.println("FAILED: Intersects");
		}
		
	}
	
}
