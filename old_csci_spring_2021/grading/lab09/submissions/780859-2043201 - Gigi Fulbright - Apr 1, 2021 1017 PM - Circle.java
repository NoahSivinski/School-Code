
//*******************************************************
/**
 * Circle.java 
 * Author: Jordyn Fulbright 
 * Submission Date: April 2nd
 *
 * Purpose: This program defines two circles and allows the user to determine
 * whether the circles are unit circles, whether they equal each other, the
 * distance from each of their centers, whether the first circle is smaller than
 * the second, it also compares the two circles and returns a 1 if the first
 * circle is bigger, a -1 if it is smaller and a 0 if they are equivalent, the
 * program can also determine whether the circles intersect each other.
 * 
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither received nor given
 * inappropriate assistance. I have not copied or modified code from any source
 * other than the course webpage or the course textbook. I recognize that any
 * unauthorized assistance or plagiarism will be handled in accordance with the
 * University of Georgia's Academic Honesty Policy and the policies of this
 * course. I recognize that my work is based on an assignment created by the
 * Department of Computer Science at the University of Georgia. Any publishing
 * or posting of source code for this assignment is strictly prohibited unless
 * you have written consent from the Department of Computer Science at the
 * University of Georgia.
 */
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

		} else {
			// Need something about original radius being unchanged...
			System.out.println("ERROR: Radius must be greater than or equal to 0");
		}

	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {

		return (Math.PI * (Math.pow(radius, 2)));
	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() {

		return (2 * Math.PI * radius);
	}

	// --------------------------------------------------------
	// diameter - calculates the diameter of the circle
	// --------------------------------------------------------
	public double diameter() {

		return (radius * 2);
	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {

		if ((Math.abs(this.radius - 1) < THRESHOLD) && (Math.abs(this.x - this.x) < THRESHOLD)
				&& (Math.abs(this.y - this.y) < THRESHOLD)) {
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

		return ("name: " + this.name + "\n" + "center: (" + this.x + "," + this.y + ")" + "\n" + "radius: "
				+ this.radius);

	}

	// Circle equals method
	public boolean equals(Circle anotherCircle) {

		if (((this.radius - anotherCircle.radius) < THRESHOLD) && ((this.x - anotherCircle.x) < THRESHOLD)
				&& ((this.y - anotherCircle.y) < THRESHOLD)) {
			return true;
		} else {
			return false;
		}
	}

	// Distance between circles
	public double distance(Circle anotherCircle) {

		return Math.sqrt(Math.pow((this.x - anotherCircle.x), 2) + (Math.pow((this.y - anotherCircle.y), 2)));
	}

	public boolean isSmaller(Circle anotherCircle) {
		// USE DIAMETER
		if (this.diameter() < anotherCircle.diameter()) {

			return true;

		} else {
			return false;
		}
	}

	public int compareTo(Circle anotherCircle) {

		if (this.radius < anotherCircle.radius) {
			return -1;
		} else if (this.radius > anotherCircle.radius) {
			return 1;
		} else {
			return 0;
		}
	}

	public boolean intersects(Circle anotherCircle) {

		if ((this.radius + anotherCircle.radius) > this.distance(anotherCircle)) {
			return true;
		} else {
			return false;
		}
	}

}