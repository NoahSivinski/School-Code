/*
 * Circle.java
 * Author:  Evan McKinney
 * Submission Date:  10/29/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *	This program is a class for a circle. It stores the name of
 *	the circle, the x and y, and the radius. It has all accessor
 *	and mutator methods. In addition, there are other methods
 *	like to check if two circles intersect.
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
		return radius * radius * Math.PI;
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		return 2 * radius * Math.PI;
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
		return (Math.abs(radius) - 1 < THRESHOLD) && (Math.abs(x) < THRESHOLD ) && (Math.abs(y) < THRESHOLD);
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		return "name: " + name + "\ncenter:(" + x + "," + y + ")\n" + "radius: " + radius;
	}
	
	//--------------------------------------------------------
	// equals - return true if instance variables of calling
	//          object and parameter object are equal
	//--------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		return (Math.abs(radius - anotherCircle.getRadius()) < THRESHOLD) 
				&& (Math.abs(x - anotherCircle.getX()) < THRESHOLD) 
				&& (Math.abs(y - anotherCircle.getY()) < THRESHOLD);
	}
	//--------------------------------------------------------
	// distance - return a distance between centers of calling
	//            object and anotherCircle
	//--------------------------------------------------------
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(x - anotherCircle.getX(), 2) + Math.pow(y - anotherCircle.getY(), 2));
	}
	
	//--------------------------------------------------------
	// isSmaller - return true if calling object's diameter
	//             is smaller than anotherCircle, otherwise false
	//--------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle) {
		return this.diameter() < anotherCircle.diameter();
	}

	//--------------------------------------------------------
	// compareTo - return a 1 if calling object is larger than parameter
	//             return 0 if calling object is equal to parameter
	//			   return -1 of calling object is smaller than parameter
	//--------------------------------------------------------
	public int compareTo(Circle anotherCircle) {
		if(this.isSmaller(anotherCircle)) {
			return -1;
		}else if(Math.abs(radius - anotherCircle.getRadius()) < THRESHOLD) {
			return 0;
		}else {
			return 1;
		}
	}
	
	//--------------------------------------------------------
	// intersects - return true if the distance between the 
	//              two centers is less than the sum of the 
	//              sum of the two circle's radii
	//--------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		return this.distance(anotherCircle) < (radius + anotherCircle.getRadius());
	}
}
