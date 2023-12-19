/*
 * Circle.java

 * Author:  Scott Wagner 
 * Submission Date:  4/2/2021
 *
 * Purpose: Defines attributes and functions of circle objects.
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

public class Circle {

	private String name;
	private double radius;
	private double x;
	private double y;

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
			radius = newRadius;
		}
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {
		return (Math.PI * Math.pow(radius, 2));
	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() {
		return (2 * Math.PI) * radius;
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

		if ((Math.abs(1 - radius) < THRESHOLD) && (Math.abs(x) < THRESHOLD) && (Math.abs(y) < THRESHOLD)) {
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

		return "name: " + name + "\ncenter: (" + x + "," + y + ")" + "\nradius: " + radius;

	}

	// Circle equals method.
	public boolean equals(Circle anotherCircle) {
		// Compares radius, x, and y values for equality.
		if ((Math.abs(this.radius - anotherCircle.radius) < THRESHOLD) && (Math.abs(x - anotherCircle.x) < THRESHOLD)
				&& (Math.abs(y - anotherCircle.y) < THRESHOLD))
			return true;
		else
			return false;
	}

	// Calculates distance between center of two circles.
	public double distance(Circle anotherCircle) {

		// Processed x and y values to simplify calculation.
		double xTotal;
		double yTotal;
		double distance;

		// Distance formula assembly.
		xTotal = Math.pow((x - anotherCircle.x), 2);
		yTotal = Math.pow((y - anotherCircle.y), 2);
		distance = Math.sqrt(xTotal + yTotal);

		return distance;
	}

	public boolean isSmaller(Circle anotherCircle) {

		if (diameter() < anotherCircle.diameter()) {
			return true;
		} else {
			return false;
		}
	}

	public int compareTo(Circle anotherCircle) {

		if (diameter() < anotherCircle.diameter()) {
			return -1;
		} else if (diameter() > anotherCircle.diameter()) {
			return 1;
		} else {
			return 0;
		}
	}

	public boolean intersects(Circle anotherCircle) {

		if (this.distance(anotherCircle) < (this.radius + anotherCircle.radius)) {
			return true;
		} else {
			return false;
		}

	}

}