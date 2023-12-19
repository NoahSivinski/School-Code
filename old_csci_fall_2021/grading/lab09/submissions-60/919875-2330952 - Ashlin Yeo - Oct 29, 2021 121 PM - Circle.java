/*
 * Circle.java
 * Author:  Ashlin Yeo
 * Submission Date:  10/29/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
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

	private String name;    // declare the private String instance  name
	private double radius;  // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;       // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {

		return name;
	}

	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {

		return x;
	}


	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {

		return y;	
	}

	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {

		return radius;	
	}

	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String newName) {

		name = newName;	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newX) {

		x = newX;	
	}

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {

		y = newY;
	}


	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRadius) {

		if (newRadius >= 0)	{
			radius = newRadius;
		}
	}

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {

		return Math.PI	* (radius * radius);
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {

		return 2 * Math.PI * radius;
	}

	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {

		return radius * 2;
	}


	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {

		return	(radius == 1) && (Math.abs(x) <= THRESHOLD) && (Math.abs(y) <= THRESHOLD);
	}


	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {

		return ("\nname: " + name + "\ncenter: (" + x +  "," + y + ")" + "\nradius: " + radius);	
	}

	//equals - returns true when the radius and centers of both circles
	//are the same; otherwise false
	public boolean equals(Circle anotherCircle) {
		return (Math.abs(radius - anotherCircle.radius) < THRESHOLD) && (Math.abs(x - anotherCircle.x) < THRESHOLD) && (Math.abs(y - anotherCircle.y) < THRESHOLD);

	}

	//distance - returns the distance between the centers of the circle
	//executing the method and anotherCircle
	public double distance(Circle anotherCircle) {
		return Math.sqrt((Math.pow(x - anotherCircle.x, 2) + Math.pow(y - anotherCircle.y, 2)));
	}

	//isSmaller - returns true when the diameter of the circle executing
	//the method is smaller than the diameter of the parameter anotherCircle
	public boolean isSmaller(Circle anotherCircle) {
		return diameter() < anotherCircle.diameter();
	}

	//compareTo - if the calling object is larger, returns a 1.
	//If the calling object is smaller, returns a -1. 
	//Otherwise, returns a 0.
	public int compareTo(Circle anotherCircle) {
		int compared;
		if (isSmaller(anotherCircle)) {
			compared = -1;
			return compared;
		}
		else if (!isSmaller(anotherCircle) && (diameter() - anotherCircle.diameter()) < THRESHOLD) {
			compared = 0;
			return compared;
		}
		else {
			compared = 1;
			return compared;
		}
	}

	//intersects - returns true when the circle executing the method and
	//anotherCircle have an intersecting area. Otherwise, returns false.
	public boolean intersects (Circle anotherCircle) {
		return (distance(anotherCircle) < (radius + anotherCircle.radius));
	}










}