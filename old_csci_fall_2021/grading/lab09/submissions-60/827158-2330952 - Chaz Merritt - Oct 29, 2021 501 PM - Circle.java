/*
 * Circle.java
 * Author:  Charles Merritt
 * Submission Date:  10/29/2020
 *
 * Purpose: It introduces basic oop principles
 *
 * Statement of Academic Honesty: CEM
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
	
	private String name;         // declare the private String instance  name
	private double radius;       // declare the private double instance  radius
	private double x;            // declare the private double instance  x
	private double y;            // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {
		return name;
		// Your code goes here	
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		return x;
		// Your code goes here	
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		return y;
		// Your code goes here	
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		return radius;
		// Your code goes here	
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String newName) {
		this.name = newName;
		// Your code goes here	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newX) {
		this.x = newX;
		// Your code goes here	
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {
		this.y = newY;
		// Your code goes here	
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRadius) {
		if (newRadius > 0) { 
		radius = newRadius;
		}
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		return Math.PI * this.getRadius() * this.getRadius();
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		return 2*Math.PI*this.getRadius();
			
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		return this.getRadius() * 2;	
	}
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		return this.getRadius() == 1 && this.getX() == 0 && this.getY() == 0;
	}
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		return "\nname: " + getName() + "\ncenter: " + "(" + getX() + ", " + getY() + ")" + "\nradius: " + getRadius(); 
		
		// Your code goes here	
	}
	
	//------------------------------------------------------------
	// equals - return a boolean value that represents whether
	//          one circle has an equal center to anotherCircle  
	//------------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		if (radius != anotherCircle.radius) {
			return false;
		}
		if (x != anotherCircle.x) {
			return false;
		}
		if (y != anotherCircle.y) {
			return false;
		}
		return true;
	}
	
	//------------------------------------------------------------
	// distance - returns the distance between the centers of two
	//            circles
	//------------------------------------------------------------
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(this.getX() - anotherCircle.getX(), 2) + Math.pow(this.getY() - anotherCircle.getY(), 2));
	}
	//------------------------------------------------------------
	// isSmaller - returns true when the circle executing the method
	// 			   is smaller than the parameter anotherCircle   
	//------------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle) {
		return this.getRadius() < anotherCircle.getRadius(); 
	}
	
	public int compareTo(Circle anotherCircle) {
		if (this.isSmaller(anotherCircle)) {
			return -1;
		}
		if (anotherCircle.isSmaller(this)) {
			return 1;
		}
		return 0; 
	}
	
	public boolean intersects(Circle anotherCircle) {
		return (radius + anotherCircle.radius) < this.distance(anotherCircle);
	}
	
}
