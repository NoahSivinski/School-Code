/*
 * CircleTester.java
 * Author: Zachary Krausman 
 * Submission Date:  2 April 2021
 *
 * Purpose: The purpose of this program is to learn how to use basic OOP principles through
 * various methods in the circle class that calculates certain circle calculations like
 * diameter, perimeter, etc. from methods that I create. Specific test cases are then used 
 * to show if the methods are working properly.
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
		System.out.println("circle1="+circle1);

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2="+circle2);

		// print circle1 diameter, area and perimeter
		System.out.println("diameter: " + circle1.diameter() + "\narea: " + circle1.area() + "\nperimeter: " + circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("diameter: " + circle2.diameter() + "\narea: " + circle2.area() + "\nperimeter: " + circle2.perimeter());

		// display whether circle1 is a unit circle (shouldn't be)
		if (circle1.isUnitCircle() == true) {
			System.out.println("circle1 is a unit circle.");
		}
		else {
			System.out.println("circle1 is not a unit circle.");
		}
		// display whether circle2 is a unit circle (shouldn't be)
		if (circle2.isUnitCircle() == true) {
			System.out.println("circle2 is a unit circle.");
		}
		else {
			System.out.println("circle2 is not a unit circle.");
		}

		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.


		/*
		 * equals method tests
		 */
		if (circle1.equals(circle2) == true) { // intended to fail - PASS CHECK (1 of 3)
			System.out.println("PASSED: equals");
		}
		else {
			System.out.println("FAILED: equals");
		}
		circle1.setRadius(5);
		circle1.setX(1.0);
		circle1.setY(1.0);
		circle2.setRadius(5);
		circle2.setX(1.0);
		circle2.setY(1.0);
		if (circle1.equals(circle2) == true) { // intended to pass - PASS CHECK (2 of 3)
			System.out.println("PASSED: equals");
		}
		else {
			System.out.println("FAILED: equals");
		}
		circle1.setRadius(8);
		circle1.setX(2.8);
		circle1.setY(1.9);
		circle2.setRadius(2);
		circle2.setX(2.8);
		circle2.setY(1.9);
		if (circle1.equals(circle2) == true) { // intended to fail - PASS CHECK (3 of 3)
			System.out.println("PASSED: equals");
		}
		else {
			System.out.println("FAILED: equals");
		}

		/*
		 * distance method tests
		 */
		circle1.setX(2.3);
		circle1.setY(5.8);
		circle2.setX(5.2);
		circle2.setY(7.1);
		if (Math.abs(3.178049716 - circle1.distance(circle2)) < THRESHOLD) { // intended to pass - PASS CHECK (1 of 3)
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}
		circle1.setX(2.3);
		circle1.setY(5.8);
		circle2.setX(2.3);
		circle2.setY(5.8);
		if (Math.abs(5 - circle1.distance(circle2)) < THRESHOLD) { // intended to fail - PASS CHECK (2 of 3)
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}
		circle1.setX(2.3);
		circle1.setY(5.8);
		circle2.setX(9.6);
		circle2.setY(15.2);
		if (Math.abs(11.901680554 - circle1.distance(circle2)) < THRESHOLD) { // intended to pass - PASS CHECK (3 of 3)
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}

		/*
		 * isSmaller method tests
		 */
		if (circle1.isSmaller(circle2) == true) { // intended to fail - PASS CHECK (1 of 3)
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller");
		}
		circle2.setRadius(5);
		if (circle1.isSmaller(circle2) == true) { // intended to fail - PASS CHECK (2 of 3)
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller");
		}
		circle1.setRadius(1);
		if (circle1.isSmaller(circle2) == true) { // intended to pass - PASS CHECK (3 of 3)
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller");
		}

		/*
		 * compareTo method tests
		 */
		circle1.setRadius(5);
		circle2.setRadius(3);
		if (Math.abs(1 - circle1.compareTo(circle2)) < THRESHOLD) { // intended to pass (returns a 1) - PASS CHECK (1 of 3)
			System.out.println("PASSED: compareTo");
		}
		else {
			System.out.println("FAILED: compareTo");
		}
		circle1.setRadius(3);
		if (Math.abs(circle1.compareTo(circle2)) < THRESHOLD) { // intended to pass (returns a 0) - PASS CHECK (2 of 3)
			System.out.println("PASSED: compareTo");
		}
		else {
			System.out.println("FAILED: compareTo");
		}
		circle2.setRadius(2);
		if (Math.abs(circle2.compareTo(circle1)) < THRESHOLD) { // intended to fail (returns a -1) - PASS CHECK (3 of 3)
			System.out.println("PASSED: compareTo");
		}
		else {
			System.out.println("FAILED: compareTo");
		}

		/*
		 * intersects method tests
		 */
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(2);
		if (circle1.intersects(circle2) == true) { // intended to pass - PASS CHECK (1 of 4)
			System.out.println("PASSED: intersects");
		}
		else {
			System.out.println("FAILED: intersects");
		}
		circle1.setX(7.5);
		circle1.setY(4.8);
		circle1.setRadius(3);
		circle2.setX(56.2);
		circle2.setY(18.4);
		circle2.setRadius(6);
		if (circle1.intersects(circle2) == true) { // intended to fail - PASS CHECK (2 of 4)
			System.out.println("PASSED: intersects");
		}
		else {
			System.out.println("FAILED: intersects");
		}
		if (circle2.intersects(circle1) == true) { // intended to fail - PASS CHECK (3 of 4)
			System.out.println("PASSED: intersects");
		}
		else {
			System.out.println("FAILED: intersects");
		}
		circle1.setX(12.0);
		circle1.setY(66.2);
		circle1.setRadius(15);
		circle2.setX(12.0);
		circle2.setY(52.2);
		circle2.setRadius(6);
		if (circle1.intersects(circle2) == true) { // intended to pass - PASS CHECK (4 of 4)
			System.out.println("PASSED: intersects");
		}
		else {
			System.out.println("FAILED: intersects");
		}
	}

}