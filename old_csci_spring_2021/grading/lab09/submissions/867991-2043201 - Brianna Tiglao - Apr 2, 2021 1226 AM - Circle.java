/*
 * Circle.java
 * Author:  Brianna Tiglao
 * Submission Date: April 02, 2021
 *
 * Purpose: The purpose of this program is to take different circles and compare
 * the radius of each one as well as their centers, (x,y). 
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

	private String name;        // declare the private String instance  name
	private double radius;      // declare the private double instance  radius
	private double x;           // declare the private double instance  x
	private double y;           // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {

		return this.name;	
	}

	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {

		return this.x;
	}


	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {

		return this.y;	
	}

	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {

		return this.radius;	
	}

	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String newName) {

		this.name = newName;	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newX) {

		this.x = newX;
	}

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {

		this.y = newY;
	}


	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRadius) {

		if (newRadius >= 0) {
			this.radius = newRadius;
		}

	}

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {

		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {

		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {

		double diameter = radius * 2;
		return diameter;
	}


	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {

		boolean unitCircle;

		if (radius == 1 && y == 0 && x == 0) {
			unitCircle = true;
		}
		else {
			unitCircle = false;
		}

		return unitCircle;
	}


	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {

		return "name: " + name + "\ncenter: (" + x + "," + y + ")\nradius: " + radius;
	}

	public boolean equals(Circle anotherCircle) {
		return (this.x == anotherCircle.x) && (this.y == anotherCircle.y) && (this.radius == anotherCircle.radius);
	}
	
	public double distance (Circle anotherCircle) {
		return Math.sqrt(Math.pow(this.x - anotherCircle.x, 2) + Math.pow(this.y - anotherCircle.y, 2));
	}
	
	public boolean isSmaller(Circle anotherCircle) {
		return this.diameter() < anotherCircle.diameter();
	}
	
	public int compareTo (Circle anotherCircle) {
		
		int compare;
		if (anotherCircle.isSmaller(this)) {
			compare = 1;
		}
		else if (this.isSmaller(anotherCircle)) {
			compare = -1;
		}
		else {
			compare = 0;
		}
		return compare;
	}
	
	public boolean intersects (Circle anotherCircle) {
		return (this.radius + anotherCircle.radius) > this.distance(anotherCircle);
	}
	
}
