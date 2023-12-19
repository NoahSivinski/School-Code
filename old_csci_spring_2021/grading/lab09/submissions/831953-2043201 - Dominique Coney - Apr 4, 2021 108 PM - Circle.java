/*
 * Circle.java
 * Author:  Dominique Coney
 * Submission Date:  April 4, 2021
 *
 * Purpose: The purpose of this program is to code the methods that will be tested in the CircleTester.java program.
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
		// Your code goes here
	}

	// ----------------------------------------------
	// getX - returns the value of x
	// ----------------------------------------------
	public double getX() {
		return x;
		// Your code goes here
	}

	// ----------------------------------------------
	// getY - returns the value of y
	// ----------------------------------------------
	public double getY() {
		return y;
		// Your code goes here
	}

	// ----------------------------------------------
	// getRadius - returns the value of radius
	// ----------------------------------------------
	public double getRadius() {
		return radius;
		// Your code goes here
	}

	// ----------------------------------------------
	// setName - assigns a new value to name
	// ----------------------------------------------
	public void setName(String newName) {
		name = newName;
		// Your code goes here
	}

	// ----------------------------------------------
	// setX - assigns a new value to x
	// ----------------------------------------------
	public void setX(double newX) {
		x = newX;
		// Your code goes here
	}

	// ----------------------------------------------
	// setY - assigns a new value to y
	// ----------------------------------------------
	public void setY(double newY) {
		y = newY;
		// Your code goes here
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
		return radius * 2;
	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {
		if (Math.abs(radius - 1) < THRESHOLD) {
			if (Math.abs(y - 0) < THRESHOLD) {
				if (Math.abs(x - 0) < THRESHOLD) {
					return true;
				}
			}
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
		String values = ("Name:" + name + "\nCenter:" + "(" + x + "," + y + ")" + "\nRadius:" + radius);
		return values;

		// Your code goes here
	}

	public boolean equals(Circle anotherCircle) {
		if (Math.abs(anotherCircle.getRadius() - radius) < THRESHOLD) {
			if (Math.abs(anotherCircle.x - x) < THRESHOLD) {
				if (Math.abs(anotherCircle.y - y) < THRESHOLD) {
					return true;
				}
			}
		}
		return false;
	}

	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(x - anotherCircle.x, 2) + Math.pow(y - anotherCircle.y, 2));
	}

	public boolean isSmaller(Circle anotherCircle) {
		if (diameter() < anotherCircle.diameter()) {
			return true;
		}
		return false;
	}

	public int compareTo(Circle anotherCircle) {
		if (diameter() > anotherCircle.diameter()) {
			return 1;
		}
		return -1;
	}

	public boolean intersects(Circle anotherCircle) {
		if (this.getRadius() - anotherCircle.getRadius() < this.distance(anotherCircle)
				&& this.distance(anotherCircle) < this.getRadius() + anotherCircle.getRadius()) {
			return true;
		}
		return false;
	}
}