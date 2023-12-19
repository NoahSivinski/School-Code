/*
 * CircleTester.java
 * Author:  Morgan McGrath  
 * Submission Date:  10/28/2021
 *
 * Purpose: This program tests the methods created in the Circle class
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


		// Note is not necessary to call the method toString.
		System.out.println();
		
		//a. Display the name, center and radius of circle1
		System.out.println(circle1);

		//b. Set the radius of circle2 to 5.3
		circle2.setRadius(5.3);

		//c. Display the name, center and radius of circle2
		System.out.println(circle2);

		//d. Display the diameter, area and perimeter of circle1
		System.out.println("Circle 1's diameter = "+circle1.diameter());
		System.out.println("Circle 1's area = "+circle1.area());
		System.out.println("Circle 1's perimeter = "+circle1.perimeter());

		//e. Display the diameter, area and perimeter of circle2
		System.out.println("Circle 2's diameter = "+circle2.diameter());
		System.out.println("Circle 2's area = "+circle2.area());
		System.out.println("Circle 2's perimeter = "+circle2.perimeter());

		//f. Display a message that indicates whether or not circle1 is a unit circle
		if(circle1.isUnitCircle()) {
			System.out.println("Circle 1 is a unit circle");
		}
		else {
			System.out.println("Circle 1 is not a unit circle");
		}

		//g. Display a message that indicates whether or not circle2 is a unit circle
		if(circle2.isUnitCircle()) {
			System.out.println("Circle 2 is a unit circle");
		}
		else {
			System.out.println("Circle 2 is not a unit circle");
		}

		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.


		Circle circle3=new Circle();
		circle3.setName("Circle 3");
		circle3.setRadius(1);
		circle3.setX(0);
		circle3.setY(0);

		Circle circle4=new Circle();
		circle4.setName("Circle 4");
		circle4.setRadius(1);
		circle4.setX(0);
		circle4.setY(0);
		
		//Circle 1 test cases
		System.out.println();
		System.out.println("Test cases for Circle 1");
		//set name
		circle1.setName("Circle 1");
		if(circle1.getName()=="Circle 1") {
			System.out.println("PASSED: setName");
		}
		else {
			System.out.println("FAILED: setName");
		}
		//set x 
		circle1.setX(-3.0);
		if(circle1.getX()==-3.0) {
			System.out.println("PASSED: setX");
		}
		else {
			System.out.println("FAILED: setX");
		}
		//set y
		circle1.setY(4.0);
		if(circle1.getY()==4.0) {
			System.out.println("PASSED: setY");
		}
		else {
			System.out.println("FAILED: setY");
		}
		//set radius 
		circle1.setRadius(2.0);
		if(circle1.getRadius()==2.0) {
			System.out.println("PASSED: setRadius");
		}
		else {
			System.out.println("FAILED: setRadius");
		}
		//set radius negative
		circle1.setRadius(-2.0);
		if(circle1.getRadius()==2.0) {
			System.out.println("PASSED: setRadius (negative)");
		}
		else {
			System.out.println("FAILED: setRadius (negative)");
		}
		//area
		if(circle1.area()-12.566370614359172<=THRESHOLD) {
			System.out.println("PASSED: area");
		}
		else {
			System.out.println("FAILED: area");
		}
		//perimeter
		if(circle1.perimeter()-12.566370614359172<=THRESHOLD) {
			System.out.println("PASSED: perimeter");
		}
		else {
			System.out.println("FAILED: perimeter");
		}
		//diameter
		if(circle1.diameter()-4.0<=THRESHOLD) {
			System.out.println("PASSED: diameter");
		}
		else {
			System.out.println("FAILED: diameter");
		}
		//is Unit Circle
		if(circle1.isUnitCircle()==false) {
			System.out.println("PASSED: isUnitCircle");
		}
		else {
			System.out.println("FAILED: isUnitCircle");
		}
		//equals
		if(circle1.equals(circle2)==false) {
			System.out.println("PASSED: equals");
		}
		else {
			System.out.println("FAILED: equals");
		}
		//distance
		if(circle1.distance(circle2)-5.830951894845301<=THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}
		//isSmaller
		if(circle1.isSmaller(circle2)==true) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller");
		}
		//compareTo
		if(circle1.compareTo(circle2)==-1) {
			System.out.println("PASSED: compareTo");
		}
		else {
			System.out.println("FAILED: compareTo");
		}
		//intersects
		if(circle1.intersects(circle2)==true) {
			System.out.println("PASSED: intersects");
		}
		else {
			System.out.println("FAILED: intersects");
		}


		//Circle 2 test cases
		System.out.println();
		System.out.println("Test cases for Circle 2");
		//set name
		circle2.setName("Circle 2");
		if(circle2.getName()=="Circle 2") {
			System.out.println("PASSED: setName");
		}
		else {
			System.out.println("FAILED: setName");
		}
		//set x 
		circle2.setX(2.0);
		if(circle2.getX()==2.0) {
			System.out.println("PASSED: setX");
		}
		else {
			System.out.println("FAILED: setX");
		}
		//set y
		circle2.setY(1.0);
		if(circle2.getY()==1.0) {
			System.out.println("PASSED: setY");
		}
		else {
			System.out.println("FAILED: setY");
		}
		//set radius 
		circle2.setRadius(5.3);
		if(circle2.getRadius()==5.3) {
			System.out.println("PASSED: setRadius");
		}
		else {
			System.out.println("FAILED: setRadius");
		}
		//set radius negative
		circle2.setRadius(-5.3);
		if(circle2.getRadius()==5.3) {
			System.out.println("PASSED: setRadius (negative)");
		}
		else {
			System.out.println("FAILED: setRadius (negative)");
		}
		//area
		if(circle2.area()-88.24733763933727<=THRESHOLD) {
			System.out.println("PASSED: area");
		}
		else {
			System.out.println("FAILED: area");
		}
		//perimeter
		if(circle2.perimeter()-33.3008821280518<=THRESHOLD) {
			System.out.println("PASSED: perimeter");
		}
		else {
			System.out.println("FAILED: perimeter");
		}
		//diameter
		if(circle2.diameter()-10.6<=THRESHOLD) {
			System.out.println("PASSED: diameter");
		}
		else {
			System.out.println("FAILED: diameter");
		}
		//is Unit Circle
		if(circle2.isUnitCircle()==false) {
			System.out.println("PASSED: isUnitCircle");
		}
		else {
			System.out.println("FAILED: isUnitCircle");
		}
		//equals
		circle2.setX(0);
		circle2.setY(10);
		circle2.setRadius(5);
		circle3.setX(10);
		circle3.setY(10);
		circle3.setRadius(5);
		if(circle2.equals(circle3)==false) {
			System.out.println("PASSED: equals");
		}
		else {
			System.out.println("FAILED: equals");
		}
		circle3.setX(0);
		//distance
		if(circle2.distance(circle3)-2.23606797749979<=THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}
		//isSmaller
		if(circle2.isSmaller(circle3)==false) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller");
		}
		//compareTo
		if(circle2.compareTo(circle3)==0) {
			System.out.println("PASSED: compareTo");
		}
		else {
			System.out.println("FAILED: compareTo");
		}
		//intersects
		if(circle2.intersects(circle3)==true) {
			System.out.println("PASSED: intersects");
		}
		else {
			System.out.println("FAILED: intersects");
		}

		
		//Circle 3 test cases
		System.out.println();
		System.out.println("Test cases for Circle 3");
		//set name
		circle3.setName("Circle 3");
		if(circle3.getName()=="Circle 3") {
			System.out.println("PASSED: setName");
		}
		else {
			System.out.println("FAILED: setName");
		}
		//set x 
		circle3.setX(0.0);
		if(circle3.getX()==0.0) {
			System.out.println("PASSED: setX");
		}
		else {
			System.out.println("FAILED: setX");
		}
		//set y
		circle3.setY(0.0);
		if(circle3.getY()==0.0) {
			System.out.println("PASSED: setY");
		}
		else {
			System.out.println("FAILED: setY");
		}
		//set radius 
		circle3.setRadius(1.0);
		if(circle3.getRadius()==1.0) {
			System.out.println("PASSED: setRadius");
		}
		else {
			System.out.println("FAILED: setRadius");
		}
		//set radius negative
		circle3.setRadius(-1.0);
		if(circle3.getRadius()==1.0) {
			System.out.println("PASSED: setRadius (negative)");
		}
		else {
			System.out.println("FAILED: setRadius (negative)");
		}
		//area
		if(circle3.area()-3.141592653589793<=THRESHOLD) {
			System.out.println("PASSED: area");
		}
		else {
			System.out.println("FAILED: area");
		}
		//perimeter
		if(circle3.perimeter()-6.283185307179586<=THRESHOLD) {
			System.out.println("PASSED: perimeter");
		}
		else {
			System.out.println("FAILED: perimeter");
		}
		//diameter
		if(circle3.diameter()-2.0<=THRESHOLD) {
			System.out.println("PASSED: diameter");
		}
		else {
			System.out.println("FAILED: diameter");
		}
		//is Unit Circle
		if(circle3.isUnitCircle()==true) {
			System.out.println("PASSED: isUnitCircle");
		}
		else {
			System.out.println("FAILED: isUnitCircle");
		}
		//equals
		if(circle3.equals(circle4)==true) {
			System.out.println("PASSED: equals");
		}
		else {
			System.out.println("FAILED: equals");
		}
		circle3.setX(0);
		//distance
		if(circle3.distance(circle4)-0.0<=THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}
		//isSmaller
		if(circle3.isSmaller(circle4)==false) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller");
		}
		//compareTo
		if(circle3.compareTo(circle4)==0) {
			System.out.println("PASSED: compareTo");
		}
		else {
			System.out.println("FAILED: compareTo");
		}
		//intersects
		if(circle3.intersects(circle4)==true) {
			System.out.println("PASSED: intersects");
		}
		else {
			System.out.println("FAILED: intersects");
		}
	}

}
