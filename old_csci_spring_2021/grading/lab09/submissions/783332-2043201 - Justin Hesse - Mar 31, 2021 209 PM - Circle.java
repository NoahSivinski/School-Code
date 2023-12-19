/*
 * Circle.java
 * Author:  Justin Hesse 
 * Submission Date:  3/31/2021
 *
 * Purpose: Contains instance variables and methods
 * for a circle object.
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

	private String name;       // declare the private String instance  name
	private double x;       // declare the private double instance  radius
	private double y;       // declare the private double instance  x
	private double radius;       // declare the private double instance  y

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
	public void setName(String name) {

		this.name = name;	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {

		this.x = x;	
	}

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {

		this.y = y;	
	}


	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {

		if(radius >= 0) {
			this.radius = radius;
		}
	}

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {

		return Math.PI * (radius * radius);	
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

		return 2 * radius;	
	}


	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {

		if (Math.abs(0.0 - this.x) < THRESHOLD && Math.abs(0.0 - this.y) < THRESHOLD && Math.abs(1.0 - this.radius) < THRESHOLD) {
			return true;
		}
		else {
			return false;
		}
	}


	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {

		String output = "name: " + name + "\n center: (" + this.x + "," + this.y + ")" + "\n radius: " + this.radius;
		return output;
	}

	//equals - returns true if the radius' and centers of both circle are the same
	public boolean equals(Circle anotherCircle) {

		return Math.abs(this.radius - anotherCircle.getRadius()) < THRESHOLD && Math.abs(this.x - anotherCircle.getX()) < THRESHOLD && Math.abs(this.y - anotherCircle.getY()) < THRESHOLD;
	}

	//distance - calculates the distance between the centers of the circles
	public double distance(Circle anotherCircle) {

		return Math.sqrt(Math.pow(this.x - anotherCircle.getX(), 2.0) + Math.pow(this.y - anotherCircle.getY(), 2.0));
	}
	
	//isSmaller - returns true if the calling circle is smaller than anotherCircle
	public boolean isSmaller(Circle anotherCircle) {

		return this.diameter() < anotherCircle.diameter();
	}

	//compareTo - returns -1 if the calling circle is smaller
	//returns 1 if the calling circle is larger
	//returns 0 if the circles are of equal size
	public int compareTo (Circle anotherCircle) {

		if(this.isSmaller(anotherCircle)) {
			return -1;
		}
		else if(!this.isSmaller(anotherCircle) && Math.abs(this.diameter() - anotherCircle.diameter()) > THRESHOLD) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	//intersects - returns true when both circles have an overlapping area
	public boolean intersects(Circle anotherCircle) {
		return this.distance(anotherCircle) < this.getRadius() + anotherCircle.getRadius();
	}

}
