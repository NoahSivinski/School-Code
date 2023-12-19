//*******************************************************
// Circle.java
//
/*
 * [CSCI1301L].java
 * Author:  [Jaehoon Seol] 
 * Submission Date:  [04022021]
 *
 * Purpose:This program creates methods for testing circle1 and circle2's properties.
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

		if (radius >= 0) {
			this.radius = radius;
		}

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

		return radius * 2;
	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {

		if (Double.compare(radius, 1) == 0 && Double.compare(x, 0) == 0 && Double.compare(y, 0) == 0) {
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

		return "name: " + name + "\n" + "center: " + "(" + x + "," + y + ")\n" + "radius: " + radius;
	}

	public boolean equals(Circle anotherCircle) {
		return (Double.compare(this.radius, anotherCircle.radius) == 0);
	}

	public double distance(Circle anotherCircle) {
		return Math.sqrt((Math.pow((anotherCircle.x - this.x), 2)) + (Math.pow((anotherCircle.y - this.y), 2)));
	}

	public boolean isSmaller(Circle anotherCircle) {
		return (Double.compare(this.diameter(), anotherCircle.diameter()) == -1);
	}

	public int compareTo(Circle anotherCircle) {
		return (Double.compare(this.diameter(), anotherCircle.diameter()));
	}

	public boolean intersects(Circle anotherCircle) {
		double radii = this.radius + anotherCircle.radius;
		if (Double.compare((this.distance(anotherCircle)), (radii)) == -1) {
			return true;
		} else {
			return false;
		}
		// return(Double.compare(distance(d),(this.radius+anotherCircle.radius))==-1);
	}

	public boolean isLarger(Circle anotherCircle) {
		return (Double.compare(this.diameter(), anotherCircle.diameter()) == 1);
	}

	public String midPoint(Circle anotherCircle) {
		String midpoint = "(" + ((this.x + anotherCircle.x) / 2) + " , " + ((this.y + anotherCircle.y) / 2) + ")";
		return midpoint;
	}

	public boolean radiusLarger(Circle anotherCircle) {
		return (Double.compare(this.radius, anotherCircle.radius) == -1);
	}
}
