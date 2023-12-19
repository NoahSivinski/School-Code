/*
 * Circle.java
 * Author:  Anna Kerber
 * Submission Date:  4/1/21
 *
 * Purpose: The purpose of this program is to allow the creation
 * of Circle objects that can have operations performed on and be 
 * compared, alongside the typical accessor and mutator methods
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

	// Used to compare doubles. Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	// ----------------------------------------------
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
	public void setName(String nameIn) {

		name = nameIn;
	}

	// ----------------------------------------------
	// setX - assigns a new value to x
	// ----------------------------------------------
	public void setX(double xIn) {

		x = xIn;
	}

	// ----------------------------------------------
	// setY - assigns a new value to y
	// ----------------------------------------------
	public void setY(double yIn) {

		y = yIn;
	}

	// ----------------------------------------------
	// setRadius - assigns a new value to radius
	// ----------------------------------------------
	public void setRadius(double radiusIn) {

		if (radiusIn >= 0) {
			radius = radiusIn;
		}
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {

		return Math.pow(radius, 2) * Math.PI;
	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() {

		return 2 * Math.PI * radius;
	}

	// --------------------------------------------------------
	// diameter - calculates the diameter of the circle
	// --------------------------------------------------------
	public double diameter() {

		return 2 * radius;
	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {

		return (Math.abs(radius - 1) < THRESHOLD && Math.abs(x - 0) < THRESHOLD && Math.abs(y - 0) < THRESHOLD);
	}

	// --------------------------------------------------------
	// toString - return a String representation of
	// this circle in the following format:
	// name: name
	// center:(x,y)
	// radius: r
	// --------------------------------------------------------
	public String toString() {

		return "name: " + name + "\ncenter:(" + x + "," + y + ")\nradius: " + radius;

	}

	// --------------------------------------------------------
	// equals - returns true if the 2 circles have the same
	// radius and centers, and false if otherwise
	// --------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		return Math.abs(radius - anotherCircle.getRadius()) < THRESHOLD
				&& Math.abs(x - anotherCircle.getX()) < THRESHOLD && Math.abs(y - anotherCircle.getY()) < THRESHOLD;
	}

	// --------------------------------------------------------
	// distance - returns the distance between the centers of
	// the circles
	// --------------------------------------------------------
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(x - anotherCircle.getX(), 2) + Math.pow(y - anotherCircle.getY(), 2));
	}

	// --------------------------------------------------------
	// isSmaller - returns true if the calling circle has a
	// smaller diameter than the parameter circle, and false
	// if otherwise
	// --------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle) {
		return this.diameter() < anotherCircle.diameter();
	}

	// --------------------------------------------------------
	// compareTo - returns -1 if the calling circle is smaller
	// than the parameter circle, and 0 otherwise
	// --------------------------------------------------------
	public int compareTo(Circle anotherCircle) {
		if (this.isSmaller(anotherCircle)) {
			return -1;
		} else {
			return 0;
		}
	}

	// --------------------------------------------------------
	// intersects - returns true if the circles have an
	// intersecting area, and false if otherwise
	// --------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		return this.distance(anotherCircle) < radius + anotherCircle.getRadius();
	}
}
