/*
 * Circle.java
 * Author:  Nnamdi Ubbaonu 
 * Submission Date:  4/02/21
 *
 * Purpose: This program creates unit circles using methods
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
		return y;
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
	public void setName(String name) {
		this.name = name;
	}

	// ----------------------------------------------
	// setX - assigns a new value to x
	// ----------------------------------------------
	public void setX(double x) {
		this.x = x;
	}

	// ----------------------------------------------
	// setY - assigns a new value to y
	// ----------------------------------------------
	public void setY(double y) {
		this.y = y;
	}

	// ----------------------------------------------
	// setRadius - assigns a new value to radius
	// ----------------------------------------------
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		}
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {
		double area = Math.PI * (radius * radius);
		return area;
	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() {
		double perimeter = Math.PI * 2.0 * radius;
		return perimeter;
	}

	// --------------------------------------------------------
	// diameter - calculates the diameter of the circle
	// --------------------------------------------------------
	public double diameter() {

		double diameter = radius * 2.0;
		return diameter;
	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {
		if (((radius - 1.0) < THRESHOLD) && ((x - 0.0) < THRESHOLD) && ((y - 0.0) < THRESHOLD)) {
			return true;
		} else
			return false;

	}

	public String toString(Circle circle) {

		return "name: " + circle.getName() + "\ncenter: (" + circle.getX() + "," + circle.getY() + ")" + "\nradius: "
				+ circle.getRadius();
	}

	public boolean equals(Circle anotherCircle) {
		if ((anotherCircle.getRadius() - radius) < THRESHOLD)
			return true;
		else
			return false;
	}

	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow((x - anotherCircle.getX()), 2.0) + Math.pow((y - anotherCircle.getY()), 2.0));
	}

	public boolean isSmaller(Circle anotherCircle) {
		if (anotherCircle.diameter() >= this.diameter()) {
			return true;
		} else {
			return false;
		}
	}

	public int compareTo(Circle anotherCircle) {
		if (anotherCircle.diameter() < this.diameter()) {
			return 1;
		} else if (anotherCircle.diameter() > this.diameter()) {
			return -1;
		} else {
			return 0;
		}
	}

	public boolean intersects(Circle anotherCircle) {
		if ((anotherCircle.getRadius() + radius) > this.distance(anotherCircle)) {
			return true;
		} else {
			return false;
		}
	}
}
