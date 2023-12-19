/*
 * CSCI1301.java
 * Author:  Olivia Richardson
 * Submission Date:  2 April 2021
 *
 * Purpose: This program uses a skeleton code that has defined the basic
 * class and method structure that is used throughout the program so
 * that the classes function as intended. This program contains objects that are independent of the
 * other objects but still are able to interact with each other 
 * because they are in different methods within the same main method
 * within the same class within the same paradigm. There is a testing
 * program to illustrate how all the components interact with each
 * other. This lab uses access modifiers, instance variables/ fields, 
 * methods which return values and void methods, methods calling other
 * methods, accessor and mutator methods, and the equals() method.
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
// Circle.java
//
// 
//*******************************************************

public class Circle {

	private String name; // declare the private String instance name
	private double radius; // declare the private double instance radius
	private double x; // declare the private double instance x
	private double y; // declare the private double instance y

//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

//----------------------------------------------
// getName - returns the value of name
	// ----------------------------------------------
	public String getName() {
		return name;
	}

	// ----------------------------------------------
	// getX - returns the value of x
	// ----------------------------------------------
	public double getX() {
		return x;
	}

	// ----------------------------------------------
	// getY - returns the value of y
	// ----------------------------------------------
	public double getY() {
		return y;
	}

	// ----------------------------------------------
	// getRadius - returns the value of radius
	// ----------------------------------------------
	public double getRadius() {
		return radius;
	}

	// ----------------------------------------------
	// setName - assigns a new value to name
	// ----------------------------------------------
	public void setName(String newName) {
		name = newName;
	}

	// ----------------------------------------------
	// setX - assigns a new value to x
	// ----------------------------------------------
	public void setX(double newX) {
		x = newX;
	}

	// ----------------------------------------------
	// setY - assigns a new value to y
	// ----------------------------------------------
	public void setY(double newY) {
		y = newY;

	}

	// ----------------------------------------------
	// setRadius - assigns a new value to radius
	// ----------------------------------------------

	public void setRadius(double newRadius) {
		if (newRadius >= 0) {
			radius = newRadius; // only changes the radius if it meets the requirement
		}
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	// --------------------------------------------------------
	// diameter - calculates the diameter of the circle
	// --------------------------------------------------------
	public double diameter() {
		double diameter = 2 * radius;
		return diameter;
	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {

		if (Math.abs(radius - 1) < THRESHOLD && (Math.abs(x - 0) < THRESHOLD) && (Math.abs(y - 0) < THRESHOLD)) {
			return true;
		} else {
			return false;
		}
	}

	// --------------------------------------------------------
	// equals- return true if the radius of the circles
	// and the centers of the circles are the same and false
	// otherwise.
	// --------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		if (Math.abs(radius - anotherCircle.getRadius()) < THRESHOLD && Math.abs(x - anotherCircle.getX()) < THRESHOLD
				&& Math.abs(y - anotherCircle.getY()) < THRESHOLD) {
			return true;
		} else {
			return false;
		}

	}

	// --------------------------------------------------------
	// distance- returns distance between the centers of both
	// circles using the distance formula
	// --------------------------------------------------------
	public double distance(Circle anotherCircle) {
		double distance = Math.sqrt(
				((double) Math.pow(x - anotherCircle.getX(), 2)) + ((double) Math.pow(y - anotherCircle.getY(), 2)));
		return distance;
	}

	// --------------------------------------------------------
	// isSmaller- returns true when the circle executing the
	// method is smaller than the parameter (anotherCircle) and
	// false otherwise. diameter is used to see which is larger
	// --------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle) {
		if (diameter() < anotherCircle.diameter()) {
			return true;
		} else {
			return false;
		}
	}

	// --------------------------------------------------------
	// compareTo- if calling object is larger, the method
	// returns a positive 1. if the calling object is smaller
	// than anotherCircle it returns -1. otherwise it returns
	// the number 0
	// --------------------------------------------------------
	public int compareTo(Circle anotherCircle) {
		if (isSmaller(anotherCircle)) {
			return -1;
		} else if (equals(anotherCircle)) {
			return 0;
		} else {
			return 1;
		}

	}

	// --------------------------------------------------------
	// isSmaller- returns true when the circle executing the
	// method intersects with anotherCircle and false otherwise.
	//
	// **if distance between the centers of the two circles is
	// less than the sum of their radius** they intersect
	//
	// uses distance to obtain the distance between two circles
	// --------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {

		if (distance(anotherCircle) < (radius + anotherCircle.getRadius())) {
			return true;
		} else {
			return false;
		}
	}

	// --------------------------------------------------------
	// toString - return a String representation of
	// this circle in the following format:
	// name: name
	// center:(x,y)
	// radius: r
	// --------------------------------------------------------
	public String toString() {
		return ("name: " + name + "\ncenter: (" + x + "," + y + ")" + "\nradius: " + radius);

	}

}