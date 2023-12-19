/*
 * Circle.java
 * Author:  Malinda Uboh
 * Submission Date:  10/29/2021
 *
 * Purpose: This program contains various
 * methods and objects to be used in the Circle
 * Tester.java. The methods and objects created 
 * in this class give means to create various circles 
 * that can interact with each other in various ways. 
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

	// declare the instance variables of the class
	private String name;
	private double radius;
	private double x;
	private double y;

	// Use this value to accurately compare doubles
	public static final double THRESHOLD = 0.000000001;

	// return the value of the name
	public String getName() {

		return name;
	}

	// return the value of X
	public double getX() {

		return x;
	}

	// return the value of Y
	public double getY() {

		return y;
	}

	// Return the value of the radius
	public double getRadius() {

		return radius;
	}

	// assign a new value to name
	public void setName(String newName) {

		name = newName;
	}

	// assign a new value to x
	public void setX(double newX) {

		x = newX;
	}

	// assign a new value to y
	public void setY(double newY) {

		y = newY;
	}

	// assign a new value to radius
	public void setRadius(double newRadius) {

		if (newRadius >= 0) {
			radius = newRadius;
		}

	}

	// return the area of the circle
	public double area() {

		return (Math.PI * (radius * radius));

	}

	// return the perimeter of the circle
	public double perimeter() {

		return (2 * Math.PI * radius);

	}

	// calculate the diameter of the circle
	public double diameter() {

		return (2 * radius);

	}

	/*
	 * return true if the radius of this circle is 1 and its center is (0,0) and
	 * return false otherwise.
	 */
	public boolean isUnitCircle() {

		if (Math.abs(1 - radius) < THRESHOLD) {// Use threshold to accurately compare doubles
			if (Math.abs(0 - x) < THRESHOLD) {
				if (Math.abs(0 - y) < THRESHOLD) {
					return true;
				}
			}

		}

		return false;

	}

	// return a String representation of this circle
	public String toString() {

		return ("\n" + "name: " + this.name + "\n" + "center: (" + this.x + "," + this.y + ")" + "\n" + "radius: "
				+ this.radius);

	}

	// return true when the radius and centers of both circles are the same
	public boolean equals(Circle anotherCircle) {

		if (Math.abs(radius - anotherCircle.radius) < THRESHOLD) {
			if (Math.abs(x - anotherCircle.x) < THRESHOLD) {
				if (Math.abs(y - anotherCircle.y) < THRESHOLD) {
					return true;
				}
			}

		}
		return false;

	}

	// return the distance between the centers of the circle executing the method
	// and anotherCircle
	public double distance(Circle anotherCircle) {

		double inside = Math.pow((x - anotherCircle.x), 2) + Math.pow((y - anotherCircle.y), 2);
		double distance = Math.sqrt(inside);
		return distance;
	}

	/*
	 * return true when the circle executing the method (calling object) is smaller
	 * than the parameter (anotherCircle).
	 */
	public boolean isSmaller(Circle anotherCircle) {
		if (diameter() < anotherCircle.diameter()) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * If the calling object is larger, the method returns a positive 1. If the
	 * calling object is smaller than anotherCircle, it returns -1. Otherwise, it
	 * returns 0.
	 */
	public int compareTo(Circle anotherCircle) {
		if (diameter() > anotherCircle.diameter()) {
			return 1;
		} else if (diameter() < anotherCircle.diameter()) {
			return -1;
		} else {
			return 0;
		}

	}

	/*
	 * returns true when the circle executing the method and anotherCircle have an
	 * intersecting area
	 */
	public boolean intersects(Circle anotherCircle) {

		double distance = distance(anotherCircle);

		if (distance < (radius + anotherCircle.radius)) {

			return true;
		} else {
			return false;
		}

	}

}
