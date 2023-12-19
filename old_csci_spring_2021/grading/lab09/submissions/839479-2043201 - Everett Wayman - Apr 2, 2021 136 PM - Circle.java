/*
 * Circle.java
 * Author: Everett Wayman
 * Submission Date: 04/02/21
 *
 * Purpose: This program defines all the methods used to give
 * properties to the class Circle. Unique methods have been 
 * created for the user to compare different circles.
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
		if (newRadius < 0) {
			System.out.println("Error: Need number greater than or equal to zero");
		} else {
			radius = newRadius;
		}

	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {
		return Math.PI * radius * radius;
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
		if ((Math.abs(1 - radius) < THRESHOLD) && (Math.abs(0 - x) < THRESHOLD) && (Math.abs(0 - y) < THRESHOLD)) {
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

		// Your code goes here

		return ("\nname: " + this.name + "\ncenter: (" + this.x + "," + this.y + ")\nradius: " + this.radius);
	}

	// Here the 2 circles are equal if radius are the same and the centers are the
	// same.
	// I used a threshold here to make sure the doubles matched correctly.
	public boolean equals(Circle anotherCircle) {
		if ((Math.abs(this.radius - anotherCircle.radius) < THRESHOLD)
				&& (Math.abs(this.x - anotherCircle.x) < THRESHOLD)
				&& (Math.abs(this.y - anotherCircle.y) < THRESHOLD)) {
			return true;
		} else {
			return false;
		}
	}

	// This method use to find the distance between two centers of circles.
	public double distance(Circle anotherCircle) {
		double distance;
		distance = Math.sqrt(Math.pow(this.x - anotherCircle.x, 2.0) + Math.pow(this.y - anotherCircle.y, 2.0));
		return distance;
	}

	// This method returns true depending on if a circle is smaller than another
	// circle.
	public boolean isSmaller(Circle anotherCircle) {
		if (this.diameter() < anotherCircle.diameter()) {
			return true;
		} else {
			return false;
		}

	}

	// This method compares the diameters of the two different circles and
	// determines if
	// the circle is bigger, smaller, or equal in size no matter where the center
	// is.
	public int compareTo(Circle anotherCircle) {
		if (this.diameter() > anotherCircle.diameter()) {
			return 1;
		} else if (this.diameter() < anotherCircle.diameter()) {
			return -1;
		} else {
			return 0;
		}
	}

	// This method says that if the distance between each circle is less than the
	// sum of both radius
	// then the circles must intersect.
	public boolean intersects(Circle anotherCircle) {
		double distance;
		distance = Math.sqrt(Math.pow(this.x - anotherCircle.x, 2.0) + Math.pow(this.y - anotherCircle.y, 2.0));
		if (distance < (this.radius + anotherCircle.radius)) {
			return true;
		} else {
			return false;
		}
	}

}
