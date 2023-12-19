/*
 * Circle.java
 * Author:  William Malonda
 * Submission Date:  April 2, 2021
 *
 * Purpose: The program Circle.java works in conjunction with CircleTester.java and creates methods and objects to be used in CircleTester.java.
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
	public void setName(String value) {
		name = value;
	}

	// ----------------------------------------------
	// setX - assigns a new value to x
	// ----------------------------------------------
	public void setX(double value) {
		x = value;
	}

	// ----------------------------------------------
	// setY - assigns a new value to y
	// ----------------------------------------------
	public void setY(double value) {
		y = value;
	}

	// ----------------------------------------------
	// setRadius - assigns a new value to radius
	// ----------------------------------------------
	public void setRadius(double value) {
		if (value >= 0) {
			radius = value;
		}
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {
		double area;
		area = Math.PI * (radius * radius);
		return area;
	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() {
		double perimeter;
		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	// --------------------------------------------------------
	// diameter - calculates the diameter of the circle
	// --------------------------------------------------------
	public double diameter() {
		double diameter;
		diameter = 2 * radius;
		return diameter;
	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {
		if (radius == 1 && Double.compare(x, y) == 0) {
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
		String str = "";
		str += "\nname: " + name + "\n";
		str += "center:(" + x + "," + y + ")\n";
		str += "radius: " + radius + "\n";
		return str;
	}

	// Determines if both circles are equal to each other
	public boolean equals(Circle anotherCircle) {
		if (this.radius == anotherCircle.radius && Double.compare(this.getX(), anotherCircle.getX()) == 0
				&& Double.compare(this.getY(), anotherCircle.getY()) == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Returns the distance between the centers of the two circles
	public double distance(Circle anotherCircle) {
		double distance = Math.sqrt(
				Math.pow(this.getX() - anotherCircle.getX(), 2) + Math.pow(this.getY() - anotherCircle.getY(), 2));
		return distance;
	}

	// Determines if the circle that is being used to execute the method is smaller
	// than the other circle
	public boolean isSmaller(Circle anotherCircle) {
		if (this.diameter() < anotherCircle.diameter()) {
			return true;
		} else {
			return false;
		}
	}

	// Compares the two circles with each other
	public int compareTo(Circle anotherCircle) {
		if (this.compareTo(anotherCircle) > 0) {
			return 1;
		} else if (this.compareTo(anotherCircle) < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	// Determines if the two circles intersect on another
	public boolean intersects(Circle anotherCircle) {
		double distanceBetweenCenters;
		double sumOfRadius;

		distanceBetweenCenters = this.distance(anotherCircle);
		sumOfRadius = this.radius + anotherCircle.radius;

		if (distanceBetweenCenters < sumOfRadius) {
			return true;
		} else {
			return false;
		}

	}
}