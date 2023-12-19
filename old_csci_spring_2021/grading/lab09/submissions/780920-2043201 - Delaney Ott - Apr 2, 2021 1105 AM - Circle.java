/*
 * Circle.java
 * Author:  Delaney Ott
 * Submission Date:  April 2nd 2021
 *
 * Purpose: This program is deigned to create different circles depending on the radius and center
 * values that the program writer inputs. In this program are also multiple different methods
 * that we use to compare multiple circles and find their area, perimeter, and distance.
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
	private double radius;       // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;       // declare the private double instance  y

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
		return (this.radius*this.radius*Math.PI);
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		return (2*Math.PI*this.radius);	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		return (2*this.radius);	
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if((Math.abs(this.radius - 1) < THRESHOLD) && (Math.abs(this.x - 0) < THRESHOLD) &&
				(Math.abs(this.y - 0) < THRESHOLD)) {
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
		return "\nname: " + this.name + "\ncenter: (" + this.x + "," + this.y + ")"
				+ "\nradius: " + this.radius;
	}
	public boolean equals(Circle anotherCircle) {
		if((Math.abs(this.radius-anotherCircle.radius) < THRESHOLD)&&(Math.abs(this.x-anotherCircle.x) < THRESHOLD)
				&&(Math.abs(this.y-anotherCircle.y) < THRESHOLD)) {
			return true;
		}
		else {
			return false;
		}
	}
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow((this.x-anotherCircle.x),2) + Math.pow((this.y-anotherCircle.y), 2));
	}
	public boolean isSmaller(Circle anotherCircle) {
		if((this.diameter() - anotherCircle.diameter()) < THRESHOLD - 0.000000001){
			return true;
		}
		else {
			return false;
		}
	}
	public int compareTo(Circle anotherCircle) {
		if (isSmaller(anotherCircle) == true) {
			return -1;
		}
		else {
			if (this.diameter() == anotherCircle.diameter()) {
				return 0;
			}
			else {
				return 1;
			}
		}
	}
	public boolean intersects(Circle anotherCircle) {
		if ((this.radius + anotherCircle.radius) > distance(anotherCircle)) {
			return true;
		}
		else {
			return false;
		}
	}
}