
/*
 * Circle.java
 * Author: Kaushalkumar A. Patel
 * Submission Date: 04-01-21
 *
 * Purpose: A brief paragraph description of the program. What does it do?
 * The program will implement classes, objects, methods, and instance variables.
 * The program will compare two circles, with respect to the unit circle, by their
 * radius, location, size, area, perimeter, and diameter. This will be done using
 * two classes that manipulate the entered code and methods to output what is asked for.
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
	private double X; // declare the private double instance x
	private double Y; // declare the private double instance y

	// Used to compare doubles. Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	// ----------------------------------------------
	// getName - returns the value of name
	// ----------------------------------------------
	public String getName() {
		return name; // Your code goes here
	}

	// ----------------------------------------------
	// getX - returns the value of x
	// ----------------------------------------------
	public double getX() {
		return X; // Your code goes here
	}

	// ----------------------------------------------
	// getY - returns the value of y
	// ----------------------------------------------
	public double getY() {
		return Y; // Your code goes here
	}

	// ----------------------------------------------
	// getRadius - returns the value of radius
	// ----------------------------------------------
	public double getRadius() {
		return radius; // Your code goes here
	}

	// ----------------------------------------------
	// setName - assigns a new value to name
	// ----------------------------------------------
	public void setName(String newName) {
		name = newName; // Your code goes here
	}

	// ----------------------------------------------
	// setX - assigns a new value to x
	// ----------------------------------------------
	public void setX(double newX) {
		X = newX; // Your code goes here
	}

	// ----------------------------------------------
	// setY - assigns a new value to y
	// ----------------------------------------------
	public void setY(double newY) {
		Y = newY; // Your code goes here
	}

	// ----------------------------------------------
	// setRadius - assigns a new value to radius
	// ----------------------------------------------
	public void setRadius(double newRadius) {
		if (newRadius < 0) { // Your code goes here
		} else {
			radius = newRadius;
		}
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {
		double area = Math.PI * radius * radius; // Your code goes here
		return area;
	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() {
		double perimeter = 2 * Math.PI * radius; // Your code goes here
		return perimeter;
	}

	// --------------------------------------------------------
	// diameter - calculates the diameter of the circle
	// --------------------------------------------------------
	public double diameter() {
		double diameter = 2 * radius; // Your code goes here
		return diameter;
	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {
		if (X == 0 && Y == 0 && radius == 1) { // Your code goes here
			return true;
		}
		return false;
	}

	// --------------------------------------------------------
	// toString - return a String representation of
	// this circle in the following format:
	// name: name
	// center:(x,y)
	// radius: r
	// --------------------------------------------------------
	public String toString() {
		return "name: " + name + "\n" + "center: " + "(" + X + "," + Y + ")" + "\n" + "radius: " + radius; // Your code
																											// goes here

	}

	// Checks if circle and another instance of circle are the same
	public boolean equals(Circle anotherCircle) {
		if (radius == anotherCircle.getRadius() && X == anotherCircle.getX() && Y == anotherCircle.getY()) {
			return true;
		} else
			return false;
	}

	// Checks if circle and another instance of circle's are smaller
	public boolean isSmaller(Circle anotherCircle) {
		if (radius != anotherCircle.getRadius() && X == anotherCircle.getX() && Y == anotherCircle.getY()) {
			return true;
		} else
			return false;
	}

	// Finds the distance between the center of a circle and the center of another
	// instance of a circle
	public double distance(Circle anotherCircle) {
		double distance = Math
				.sqrt((Math.pow(X - anotherCircle.getX(), 2.0)) + (Math.pow(Y - anotherCircle.getY(), 2.0)));
		return distance;
	}

	// If the calling object is larger, the method returns a positive 1. If the
	// calling object is smaller than anotherCircle, it returns -1. Otherwise, it
	// returns 0.
	public int compareTo(Circle anotherCircle) {
		if (radius > anotherCircle.getRadius() && X == anotherCircle.getX() && Y == anotherCircle.getY()) {
			return 1;
		} else
			return 0;
	}

	// Checks if circle and another instance of circle's area intersects
	public boolean intersects(Circle anotherCircle) {
		if (distance(anotherCircle) < (radius + anotherCircle.getRadius())) {
			return true;
		} else
			return false;
	}

}