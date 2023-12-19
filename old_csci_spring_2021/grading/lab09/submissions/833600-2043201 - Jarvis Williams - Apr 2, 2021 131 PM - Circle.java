/*
 * Circle.java
 * Author: Jarvis Williams
 * Submission Date:  4/2/2021
 *
 * Purpose: The purpose of this class is to create the methods to 
 * be used in the CircleTester class.
 * * Statement of Academic Honesty:
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
	
	private String name = "No name";       // declare the private String instance  name
	private double radius = 0;       // declare the private double instance  radius
	private double x = 0;       // declare the private double instance  x
	private double y = 0;       // declare the private double instance  y

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
	public void setName(String initialName) {
		this.name = initialName;	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double intialX) {
		this.x = intialX;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double initialY) {
		this.y = initialY;
	}
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double initialRadius) {
		if (initialRadius <= 0) {		
		} else {
			this.radius = initialRadius;
		}
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		return Math.PI * radius * radius;
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
		if (((Math.abs(radius-1) < THRESHOLD) && Math.abs(x-0) < THRESHOLD) && (Math.abs(y-0) < THRESHOLD)) {
			return true;
		} else {
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
	public String toString( ) {
		return "\nname: " + name + 
				"\ncenter: (" + x + "," + y + ")" +
				"\nradius: " + radius;
	}
	
	//returns true when the radius and centers of both circles are the same
	public boolean equals(Circle anotherCircle) {
		if (((Math.abs(x-anotherCircle.getX()) < THRESHOLD) && (Math.abs(y-anotherCircle.getY()) < THRESHOLD) && ((Math.abs(radius-anotherCircle.getRadius()) < THRESHOLD)))) { 
			return true;
		} else {
			return false;
		}
	}
	
	//Returns the distance between the calling object and the parameter
	public double distance(Circle anotherCircle) {
		return Math.sqrt((Math.pow(x - anotherCircle.getX(),2) + Math.pow(y - anotherCircle.getY(),2)));
	}
	
	//checks if the calling object (Circle 1) is smaller than the parameter (anotherCircle)
	public boolean isSmaller(Circle anotherCircle) {
		if (this.diameter() < anotherCircle.diameter()) {
			return true;
		} else {
			return false;
		}
	}
	
	//If the calling object is largest, returns positive 1. If calling object is smaller, returns -1. Else, returns 0.
	
	public int compareTo(Circle anotherCircle) {
		if (this.diameter() < anotherCircle.diameter()) {
			return -1;
		} else if (this.diameter() > anotherCircle.diameter()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	//returns true if the two circles intersect
	public boolean intersects(Circle anotherCircle) {
		if (Math.sqrt((Math.pow(x - anotherCircle.getX(),2) + Math.pow(y - anotherCircle.getY(),2))) < radius + anotherCircle.getRadius()) {
			return true;
		} else {
			return false;
		}	
	}
}