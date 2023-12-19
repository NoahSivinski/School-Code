/*
 * [Circle].java
 * Author:  [Quinton Heald] 
 * Submission Date:  [4-2-21]
 *
 * Purpose: This class contains each of the methods used for calculation in the 
 * CircleTester class. It establishes multiple methods along
 * with the variables used within them. It also allows for certain
 * Variables such as radius, x and y values to be changed.
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

		if (newRadius >= 1)
			radius = newRadius;
		else {
			newRadius = radius;
		}
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {

		return Math.PI * Math.pow(radius, 2);
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
		
		return ((Math.abs(1 - radius) < THRESHOLD) && (Math.abs(x) < THRESHOLD) && (Math.abs(y) < THRESHOLD)? true : false);
	}

	// --------------------------------------------------------
	// toString - return a String representation of
	// this circle in the following format:
	// name: name
	// center:(x,y)
	// radius: r
	// --------------------------------------------------------
	public String toString() {

		return ("name: " + this.name + "\ncenter: (" + this.x + "," + this.y + ")\nradius: " + this.radius);

	}

	public boolean equals(Circle anotherCircle) {
		return ((Math.abs(this.radius - anotherCircle.radius) < THRESHOLD) ? true : false);
	}

	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(this.x - anotherCircle.x, 2) + Math.pow(this.y - anotherCircle.y, 2));

	}

	public boolean isSmaller(Circle anotherCircle) {
		return ((this.diameter() < anotherCircle.diameter()) ? true : false);
	}

	public int compareTo(Circle anotherCircle) {
		
		if (this.equals(anotherCircle) == false)
		return ((this.isSmaller(anotherCircle) == true ? -1 : 1));
		else
			return 0;

	}

	public boolean intersects(Circle anotherCircle) {
		return ((this.distance(anotherCircle) < this.radius + anotherCircle.radius) ? true : false);
	}

}