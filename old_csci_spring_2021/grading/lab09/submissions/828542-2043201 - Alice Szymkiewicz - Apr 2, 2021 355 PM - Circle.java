/*
 * Circle.java
 * Author:  Alice Szymkiewicz
 * Submission Date:  04/2/2021
 *
 * Purpose:
 * 
 * This class declares four private instance variable: the name
 * of the circle, x & y coordinates of the circles, and radius 
 * of the circles. The class also returns the string values of 
 * the name of the circle, center of circle, and radius of the 
 * circle using these instance variable. Thie class also declares
 * the accessor methods getName, getX, getY, getRadius, the mutator
 * methods setName, setX, setY, and setRadius. The class can return 
 * the area of each circle, the perimeter, and diameter. Teh calss 
 * also has if-else statements that will test if the circle is a Unit
 * Circle and declares methods that compare each circle from the 
 * CircleTester class, such as if one circle is smaller than another
 * or if one intersects another. 
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

		this.radius = Math.abs(radius);
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {

		return Math.PI * (radius * radius);
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

		if ((Math.abs(radius - 1) < THRESHOLD)) {
			if (x == 0 && y == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean equals(Circle anotherCircle) {
		return (Math.abs(radius - anotherCircle.getRadius()) < THRESHOLD) && x == anotherCircle.getX()
				&& y == anotherCircle.getY();
	}

	public double distance(Circle anotherCircle) {
		return Math.sqrt(((x - anotherCircle.getX()) * (x - anotherCircle.getX()))
				+ ((y - anotherCircle.getY()) * (y - anotherCircle.getY())));
	}

	public boolean isSmaller(Circle anotherCircle) {
		return this.diameter() < anotherCircle.diameter();
	}

	public int compareTo(Circle anotherCircle) {
		if (this.diameter() == anotherCircle.diameter()) {
			return 0;
		} 
		else if (this.diameter() > anotherCircle.diameter()) {
			return 1;
		} 
		else {
			return -1;
		}
	}

	public boolean intersects(Circle anotherCircle) {
		return this.distance(anotherCircle) < (radius + anotherCircle.getRadius());
	}

	// --------------------------------------------------------
	// toString - return a String representation of
	// this circle in the following format:
	// name: name
	// center:(x,y)
	// radius: r
	// --------------------------------------------------------
	public String toString() {

		return "name: " + name + "\ncenter: (" + x + ", " + y + ")\nradius: " + radius;
	}

}