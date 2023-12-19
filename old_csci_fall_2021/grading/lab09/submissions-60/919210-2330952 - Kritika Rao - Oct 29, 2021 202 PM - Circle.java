/*
 * [Circle].java
 * Author:  [Kritika Rao] 
 * Submission Date:  [10/29/21]
 *
 * Purpose: This program contains instance variables, which 
 * are the characteristics of the circle. Each circle object
 * will get its own copy of name, radius, x, and y. Each 
 * circle object will have the functions of calculating area,
 * perimeter, if it is a unit circle. The program can also
 * compare two circles to see if one is smaller than the other, 
 * the distance between them, if they are equal, if they
 * intersect. 
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
	//2a 
	private String name;       // declare the private String instance  name
	private double radius;       // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;       // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	//2c
	public String getName() {
		
		// Your code goes here	
		return name;
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	//2c
	public double getX() {	
		return x;
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	//2c
	public double getY() {
		return y;
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	//2c
	public double getRadius() {
		return radius;
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	//2d
	public void setName(String newName) {	
		name = newName;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	//2d
	public void setX(double newXVal) {
		x = newXVal;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	//2d
	public void setY(double newYVal) {	
		y = newYVal;
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	//2e
	public void setRadius(double newRadius) {
		if (newRadius >= 0) {
		radius = newRadius;
		}
		
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	//2f
	public double area() {
		double area = (radius * radius * Math.PI);
		return area;
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	//2g
	public double perimeter() {	
		double perimeter = (2 * Math.PI * radius);
		return perimeter;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	//2h
	public double diameter() {
		double diameter = 2 * radius;
		return diameter;
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	//2i
	public boolean isUnitCircle() {
		if(Math.abs(1 - radius) <= THRESHOLD) {
			if(Math.abs(0 - x) <= THRESHOLD) {
				if(Math.abs(0 - y) <= THRESHOLD) {
					return true;
				}
			}
			
		}
		return false;
		
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	//2b
	public String toString() {
		
		return ("\nname: " + name + "\n" + "center: " + "(" + x + ", "  + y + ")"  + "\n" + "radius: " + radius);
		
	}
	//5a
	//returns true when the radius and centers of both circles are the same; otherwise it returns false.
	public boolean equals(Circle anotherCircle) {
		return (Math.abs(anotherCircle.getRadius() - this.radius)) < THRESHOLD && (Math.abs(anotherCircle.getX() - this.x)) < THRESHOLD && (Math.abs(anotherCircle.getY()) - this.y < THRESHOLD);
	}
	//5b
	//returns the distance between the centers of the circle executing the method an anotherCircle.
	public double distance(Circle anotherCircle) {
		double distance = Math.sqrt(Math.pow(anotherCircle.getX() - this.x, 2) + Math.pow(anotherCircle.getY() - this.y, 2));
		return distance;
	}
	//5c
	/*returns true when the circle executing the method (calling object) is
	smaller than the parameter (anotherCircle). Otherwise, it returns false */
	public boolean isSmaller(Circle anotherCircle) {
		if(diameter() < anotherCircle.diameter()) {
			return true;
		}
		else {
			return false;
		}
	}
	//5d
	/*If the calling object is larger, the
	method returns a positive 1. If the calling object is smaller than anotherCircle, it returns -1.
	Otherwise, it returns 0. */
	public int compareTo(Circle anotherCircle) {
		int compare;
		if(isSmaller(anotherCircle)) {
			compare = -1;
			return compare;
		}
		else if(!isSmaller(anotherCircle) && diameter() > anotherCircle.diameter()) {
			compare = 1;
			return compare;
		}
		else {
			compare = 0;
			return compare;
		}
	}
	//5e
	/*returns true when the circle executing the method and
	anotherCircle have an intersecting area (one or more points enclosed by both circles);
	otherwise, it returns false. */
	public boolean intersects(Circle anotherCircle) {
		double intersectionDistance = distance(anotherCircle);
		if(intersectionDistance < (anotherCircle.getRadius() + this.radius)) {
			return true;
		}
		else {
			return false;
		}
	}

}
