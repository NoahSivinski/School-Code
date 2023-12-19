/*
 * Circle.java
 * Author:  Ethan Delamater
 * Submission Date: 04/02/2021
 *
 * Purpose: Gives the user the center and radius of a circle based around 2 coordinates
 * 
 * This program is used to check and use the methods defined in the class Circle.java. In this class you can call upon the methods: setName, setX, setY,
 * and setRadius. It also prints out the values of diameter, area, and perimeter of each circle. Also we use test calls for the methods 
 * equals, isSmaller, and intersects which will tell you if the values inputed either pass or fail the method, or if you call
 * upon the methods distance or compareTo will print out numerical values.
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

		return Math.PI * (getRadius() * getRadius());
	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() {

		return 2 * Math.PI * getRadius();
	}

	// --------------------------------------------------------
	// diameter - calculates the diameter of the circle
	// --------------------------------------------------------
	public double diameter() {

		return 2 * getRadius();
	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {

		if ((Double.compare(getY(), getX())) == 0 && getRadius() == 1) {
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

		return "name:" + getName() + "\ncenter: (" + getX() + "," + getY() + ")" + "\nradius:" + getRadius();

	}

	//returns true when the radius and the center of the circle are the same, otherwise returns false
	
	public boolean equals(Circle anotherCircle) {
		if (Math.abs(anotherCircle.getRadius() - radius) < THRESHOLD
				&& (Math.abs(anotherCircle.getX() - x) < THRESHOLD && Math.abs(anotherCircle.getY() - y) < THRESHOLD)) {
			return true;
		} else {
			return false;
		}
	}

	// gives the user the distance between the center of circle and anotherCircle
	
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow((this.x - anotherCircle.x), 2) + Math.pow((this.y - anotherCircle.y), 2));
	}

	// returns true when the circle is smaller than the parameter, otherwise returns false
	
	public boolean isSmaller(Circle anotherCircle) {
		if (this.diameter() < anotherCircle.diameter()) {
			return true;
		} else {
			return false;
		}
	}

	// returns a 1, -1, or 0 based on if circle is smaller or larger than anotherCircle
	
	public int compareTo(Circle anotherCircle) {
		if (this.diameter() > anotherCircle.diameter()) {
			return 1;
		} else if (this.isSmaller(anotherCircle)) {
			return -1;
		} else {
			return 0;
		}
	}

	
	// returns true when the circle and anotherCircle intersect, otherwise is false

	public boolean intersects(Circle anotherCircle) {
		double distance = this.distance(anotherCircle);
		if (distance < (this.radius + anotherCircle.radius)) {
			return true;
		} else {
			return false;
		}
	}
}