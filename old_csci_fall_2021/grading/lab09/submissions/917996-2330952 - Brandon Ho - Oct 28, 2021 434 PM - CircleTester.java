/*
 * CircleTester.java
 * Author: Brandon Ho
 * Submission Date:  Oct 28 2021
 *
 * Purpose:   A client to test the functionality of objects of the class Circle
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
		System.out.println("circle 2=" + circle2);

		// print circle1 diameter, area and perimeter
		System.out.println("circle 1=" + "\ndiameter: " + circle1.diameter() + "\narea: " + circle1.area() + "\nperimeter: " + circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("circle 2=" + "\ndiameter: " + circle2.diameter() + "\narea: " + circle2.area() + "\nperimeter: " + circle2.perimeter());

		// display whether circle1 is a unit circle
		if(circle1.isUnitCircle()) {
			System.out.println("Circle 1 is a unit circle");
		}
		else {
			System.out.println("Circle 1 is not a unit circle");
		}
		// display whether circle2 is a unit circle
		if(circle2.isUnitCircle()) {
			System.out.println("Circle 2 is a unit circle");
		}
		else {
			System.out.println("Circle 2 is not a unit circle");
		}
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.

		//creates a circle 3 similar to circle 1
		Circle circle3 = new Circle();
		circle3.setName("Circle 3");
		circle3.setX(-3.0);
		circle3.setY(4.0);
		circle3.setRadius(2.0);
		
		//tests getName method
		if(circle1.getName().equals("Circle 1")) {
			System.out.println("PASSED: getName");
		}
		else {
			System.out.println("FAILED: getName");
		}
		
		if(circle2.getName().equals("Circle 2")) {
			System.out.println("PASSED: getName");
		}
		else {
			System.out.println("FAILED: getName");
		}
		
		if(circle3.getName().equals("Circle 3")) {
			System.out.println("PASSED: getName");
		}
		else {
			System.out.println("FAILED: getName");
		}
		
		//tests getX method
		if(circle1.getX() == -3.0) {
			System.out.println("PASSED: getX");
		}
		else {
			System.out.println("FAILED: getX");
		}
		if(circle2.getX() == 2.0) {
			System.out.println("PASSED: getX");
		}
		else {
			System.out.println("FAILED: getX");
		}
		if(circle3.getX() == -3.0) {
			System.out.println("PASSED: getX");
		}
		else {
			System.out.println("FAILED: getX");
		}
		
		
		//tests getY method
		if(circle1.getY() == 4.0) {
			System.out.println("PASSED: getY");
		}
		else {
			System.out.println("FAILED: getY");
		}
		if(circle2.getY() == 1.0) {
			System.out.println("PASSED: getY");
		}
		else {
			System.out.println("FAILED: getY");
		}
		if(circle3.getY() == 4.0) {
			System.out.println("PASSED: getY");
		}
		else {
			System.out.println("FAILED: getY");
		}
		
		//tests get radius methods
		if(circle1.getRadius() == 2) {
			System.out.println("PASSED: getRadius");
		}
		else {
			System.out.println("FAILED: getRadius");
		}
		if (circle2.getRadius() == 5.3) {
			System.out.println("PASSED: getRadius");
		}
		else {
			System.out.println("FAILED: getRadius");
		}
		if (circle3.getRadius() == 2) {
			System.out.println("PASSED: getRadius");
		}
		else {
			System.out.println("FAILED: getRadius");
		}
		
		
		//tests set methods
		Circle circleTest = new Circle();
		circleTest.setName("testCircle");
		circleTest.setX(1);
		circleTest.setY(2);
		circleTest.setRadius(1);
		if(circleTest.getName() == "testCircle" && circleTest.getX() == 1 && circleTest.getY() == 2 && circleTest.diameter() == 2) {
			System.out.println("PASSED: set methods");
		}
		else {
			System.out.println("FAILED: set methods");
		}
		
		circleTest.setName("test2");
		circleTest.setX(3);
		circleTest.setY(4);
		circleTest.setRadius(2);
		
		if(circleTest.getName() == "test2" && circleTest.getX() == 3 && circleTest.getY() == 4 && circleTest.diameter() == 4) {
			System.out.println("PASSED: set methods");
		}
		else {
			System.out.println("FAILED: set methods");
		}
		
		circleTest.setName("test3");
		circleTest.setX(4);
		circleTest.setY(5);
		circleTest.setRadius(3);
		
		if(circleTest.getName() == "test3" && circleTest.getX() == 4 && circleTest.getY() == 5 && circleTest.diameter() == 6) {
			System.out.println("PASSED: set methods");
		}
		else {
			System.out.println("FAILED: set methods");
		}
		
		//tests area, diameter, and perimeter
		
		circleTest.setX(2);
		circleTest.setY(2);
		circleTest.setRadius(2);
		
		if(circleTest.area() == 4 * Math.PI && circleTest.diameter() == 4 && circleTest.perimeter() == 4 * Math.PI) {
			System.out.println("PASSED: area, diameter, and perimeter");
		}
		else {
			System.out.println("FAILED: area, diameter, and perimeter");
		}
		
		circleTest.setX(3);
		circleTest.setY(3);
		circleTest.setRadius(3);
		if(circleTest.area() == 9 * Math.PI && circleTest.diameter() == 6 && circleTest.perimeter() == 6 * Math.PI) {
			System.out.println("PASSED: area, diameter, and perimeter");
		}
		else {
			System.out.println("FAILED: area, diameter, and perimeter");
		}
		
		circleTest.setX(4);
		circleTest.setY(4);
		circleTest.setRadius(4);
		if(circleTest.area() == 16 * Math.PI && circleTest.diameter() == 8 && circleTest.perimeter() == 8 * Math.PI) {
			System.out.println("PASSED: area, diameter, and perimeter");
		}
		else {
			System.out.println("FAILED: area, diameter, and perimeter");
		}
		
		//tests isUnitCircle method
		circleTest.setX(0);
		circleTest.setY(0);
		circleTest.setRadius(1);
		if(circleTest.isUnitCircle() == true) {
			System.out.println("PASSED: isUnitCircle");
		}
		else {
			System.out.println("FAILED: isUnitCircle");
		}
		
		circleTest.setX(0);
		circleTest.setY(0);
		circleTest.setRadius(2);
		if(circleTest.isUnitCircle() == true) {
			System.out.println("FAILED: isUnitCircle");
		}
		else {
			System.out.println("PASSED: isUnitCircle");
		}
		
		circleTest.setX(1);
		circleTest.setY(0);
		circleTest.setRadius(1);
		if(circleTest.isUnitCircle() == true) {
			System.out.println("FAILED: isUnitCircle");
		}
		else {
			System.out.println("PASSED: isUnitCircle");
		}
		
		
		//tests equals method
		if(circle1.equals(circle2)) {
			System.out.println("FAILED: equals");
		}
		else {
			System.out.println("PASSED: equals");
		}

		if(circle1.equals(circle3)) {
			System.out.println("PASSED: equals");
		}
		else {
			System.out.println("FAILED: equals");
		}

		if(circle2.equals(circle3)) {
			System.out.println("FAILED: equals");
		}
		else {
			System.out.println("PASSED: equals");
		}

		//tests distance method
		if (Math.abs(circle1.distance(circle2)) - Math.sqrt(34) < THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}

		if (Math.abs(circle3.distance(circle2)) - Math.sqrt(34) < THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}
		if (Math.abs(circle1.distance(circle3)) < THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}

		//test isSmaller method
		if (circle1.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller");
		}

		if (circle1.isSmaller(circle3)) {
			System.out.println("FAILED: isSmaller");
		}
		else {
			System.out.println("PASSED: isSmaller");
		}

		if (circle2.isSmaller(circle3)) {
			System.out.println("FAILED: isSmaller");
		}
		else {
			System.out.println("PASSED: isSmaller");
		}

		//tests compareTo method
		if(circle1.compareTo(circle2) == -1 ) {
			System.out.println("PASSED: compareTo");
		}
		else {
			System.out.println("FAILED: compareTo");
		}

		if(circle2.compareTo(circle1) == 1 ) {
			System.out.println("PASSED: compareTo");
		}
		else {
			System.out.println("FAILED: compareTo");
		}
		if(circle1.compareTo(circle3) == 0 ) {
			System.out.println("PASSED: compareTo");
		}
		else {
			System.out.println("FAILED: compareTo");
		}

		//tests intersects method

		//circle 3 should not intersect any circles
		circle3.setX(10.0);

		//circle 1 and 2 should intersect
		if(circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects");
		}
		else {
			System.out.println("FAILED: intersects");
		}

		if(circle1.intersects(circle3)) {
			System.out.println("FAILED: intersects");
		}
		else {
			System.out.println("PASSED: intersects");
		}

		if(circle2.intersects(circle3)) {
			System.out.println("FAILED: intersects");
		}
		else {
			System.out.println("PASSED: intersects");
		}
	}

}
