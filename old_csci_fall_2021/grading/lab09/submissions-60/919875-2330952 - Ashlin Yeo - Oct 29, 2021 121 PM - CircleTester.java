/*
 * CircleTester.java
 * Author:  Ashlin Yeo
 * Submission Date:  10/29/21
 *
 * Purpose: This program tests the functionality of objects
 *  of the class Circle.
 *  
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

		//Declare circle1 and circle2
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(); 

		//Set x, y, and radius for circle1 and circle2. Print these values.
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
		System.out.println("circle1=\ndiameter: " + circle1.diameter() + "\narea: " + circle1.area() + "\nperimeter: " + circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("circle2=\ndiameter: " + circle2.diameter() + "\narea: " + circle2.area() + "\nperimeter: " + circle2.perimeter());

		// display whether circle1 is a unit circle
		if(circle1.isUnitCircle())
			System.out.println("PASSED: isUnitCircle()");
		else
			System.out.println("FAILED: isUnitCircle()");

		// display whether circle2 is a unit circle
		if(circle2.isUnitCircle())
			System.out.println("PASSED: isUnitCircle()");
		else
			System.out.println("FAILED: isUnitCircle()");

		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		Circle circle3 = new Circle();

		//Set x, y, and radius for circle1, circle2, and circle3
		circle1.setX(0.0);
		circle2.setX(-5.0);
		circle3.setX(10);
		circle1.setY(0.0);
		circle2.setY(1.0);
		circle3.setY(2.5);
		circle1.setRadius(3);
		circle2.setRadius(4);
		circle3.setRadius(5);
		circle1.setRadius(-100);
		circle2.setRadius(-100);
		circle3.setRadius(-5);

		System.out.println("Circle 1");
		if (Math.abs(0 - circle1.getX()) < THRESHOLD){
			System.out.println("PASSED: Set X");
		}
		else {
			System.out.println("FAILED: Set X");
		}
		if (Math.abs(0 - circle1.getY()) < THRESHOLD){
			System.out.println("PASSED: Set Y");
		}
		else {
			System.out.println("FAILED: Set Y");
		}
		if (Math.abs(3 - circle1.getRadius()) < THRESHOLD){
			System.out.println("PASSED: Set Radius");
		}
		else {
			System.out.println("FAILED: Set Radius");
		}
		if (Math.abs(3 - circle1.getRadius()) < THRESHOLD){
			System.out.println("PASSED: Set Radius (negative)");
		}
		else {
			System.out.println("FAILED: Set Radius (negatvie)");
		}
		if (Math.abs(6 - circle1.diameter()) < THRESHOLD){
			System.out.println("PASSED: diameter()");
		}
		else {
			System.out.println("FAILED: diameter()");
		}
		if (Math.abs((Math.PI * Math.pow(circle1.getRadius(), 2)) - circle1.area()) < THRESHOLD){
			System.out.println("PASSED: area()");
		}
		else {
			System.out.println("FAILED: area()");
		}
		if (Math.abs((Math.PI * 6) - circle1.perimeter()) < THRESHOLD){
			System.out.println("PASSED: perimeter()");
		}
		else {
			System.out.println("FAILED: perimeter()");
		}
		if(!circle1.isUnitCircle())
			System.out.println("PASSED: isUnitCircle()");
		else {
			System.out.println("FAILED: isUnitCircle()");
		}
		if(!circle1.equals(circle2))
			System.out.println("PASSED: equals()");
		else {
			System.out.println("FAILED: equals()");
		}
		if(circle1.intersects(circle2))
			System.out.println("PASSED: intersects()");
		else {
			System.out.println("FAILED: intersects()");
		}
		if(circle1.isSmaller(circle2))
			System.out.println("PASSED: isSmaller()");
		else {
			System.out.println("FAILED: isSmaller()");
		}
		if(-1 - circle1.compareTo(circle2) < THRESHOLD) {
			System.out.println("PASSED: compareTo()");
		}
		else {
			System.out.println("FAILED: compareTo()");
		}
		if(Math.sqrt(26) - circle1.distance(circle2) < THRESHOLD)
			System.out.println("PASSED: distance()");
		else {
			System.out.println("FAILED: distance()");
		}
		//Test Circle 2
		System.out.println("Circle 2");
		if (Math.abs(-5 - circle2.getX()) < THRESHOLD){
			System.out.println("PASSED: Set X");
		}
		else {
			System.out.println("FAILED: Set X");
		}
		if (Math.abs(1 - circle2.getY()) < THRESHOLD){
			System.out.println("PASSED: Set Y");
		}
		else {
			System.out.println("FAILED: Set Y");
		}
		if (Math.abs(4 - circle2.getRadius()) < THRESHOLD){
			System.out.println("PASSED: Set Radius");
		}
		else {
			System.out.println("FAILED: Set Radius");
		}
		if (Math.abs(4 - circle2.getRadius()) < THRESHOLD){
			System.out.println("PASSED: Set Radius (negative)");
		}
		else {
			System.out.println("FAILED: Set Radius (negatvie)");
		}
		if (Math.abs(8 - circle2.diameter()) < THRESHOLD){
			System.out.println("PASSED: diameter()");
		}
		else {
			System.out.println("FAILED: diameter()");
		}
		if (Math.abs((Math.PI * Math.pow(circle2.getRadius(), 2)) - circle2.area()) < THRESHOLD){
			System.out.println("PASSED: area()");
		}
		else {
			System.out.println("FAILED: area()");
		}
		if (Math.abs((Math.PI * 8) - circle2.perimeter()) < THRESHOLD){
			System.out.println("PASSED: perimeter()");
		}
		else {
			System.out.println("FAILED: perimeter()");
		}
		if(!circle2.isUnitCircle())
			System.out.println("PASSED: isUnitCircle()");
		else {
			System.out.println("FAILED: isUnitCircle()");
		}
		if(!circle2.equals(circle3))
			System.out.println("PASSED: equals()");
		else {
			System.out.println("FAILED: equals()");
		}
		if(!circle2.intersects(circle3))
			System.out.println("PASSED: intersects()");
		else {
			System.out.println("FAILED: intersects()");
		}
		if(circle2.isSmaller(circle3))
			System.out.println("PASSED: isSmaller()");
		else {
			System.out.println("FAILED: isSmaller()");
		}
		if(-1 - circle2.compareTo(circle3) < THRESHOLD) {
			System.out.println("PASSED: compareTo()");
		}
		else {
			System.out.println("FAILED: compareTo()");
		}
		if(Math.sqrt(227.25) - circle2.distance(circle3) < THRESHOLD)
			System.out.println("PASSED: distance()");
		else {
			System.out.println("FAILED: distance()");
		}
		//Test Circle 3
		System.out.println("Circle 3");
		if (Math.abs(10 - circle3.getX()) < THRESHOLD){
			System.out.println("PASSED: Set X");
		}
		else {
			System.out.println("FAILED: Set X");
		}
		if (Math.abs(2.5 - circle3.getY()) < THRESHOLD){
			System.out.println("PASSED: Set Y");
		}
		else {
			System.out.println("FAILED: Set Y");
		}
		if (Math.abs(5 - circle3.getRadius()) < THRESHOLD){
			System.out.println("PASSED: Set Radius");
		}
		else {
			System.out.println("FAILED: Set Radius");
		}
		if (Math.abs(5 - circle3.getRadius()) < THRESHOLD){
			System.out.println("PASSED: Set Radius (negative)");
		}
		else {
			System.out.println("FAILED: Set Radius (negatvie)");
		}
		if (Math.abs(10 - circle3.diameter()) < THRESHOLD){
			System.out.println("PASSED: diameter()");
		}
		else {
			System.out.println("FAILED: diameter()");
		}
		if (Math.abs((Math.PI * Math.pow(circle3.getRadius(), 2)) - circle3.area()) < THRESHOLD){
			System.out.println("PASSED: area()");
		}
		else {
			System.out.println("FAILED: area()");
		}
		if (Math.abs((Math.PI * 10) - circle3.perimeter()) < THRESHOLD){
			System.out.println("PASSED: perimeter()");
		}
		else {
			System.out.println("FAILED: perimeter()");
		}
		if(!circle3.isUnitCircle())
			System.out.println("PASSED: isUnitCircle()");
		else {
			System.out.println("FAILED: isUnitCircle()");
		}
		if(!circle3.equals(circle1))
			System.out.println("PASSED: equals()");
		else {
			System.out.println("FAILED: equals()");
		}
		if(!circle3.intersects(circle1))
			System.out.println("PASSED: intersects()");
		else {
			System.out.println("FAILED: intersects()");
		}
		if(!circle3.isSmaller(circle1))
			System.out.println("PASSED: isSmaller()");
		else {
			System.out.println("FAILED: isSmaller()");
		}
		if(1 - circle3.compareTo(circle1) < THRESHOLD) {
			System.out.println("PASSED: compareTo()");
		}
		else {
			System.out.println("FAILED: compareTo()");
		}
		if(Math.sqrt(106.25) - circle3.distance(circle1) < THRESHOLD)
			System.out.println("PASSED: distance()");
		else {
			System.out.println("FAILED: distance()");
		}














	}
}