/*
 * [Circle.java]
 * Author:  [Austin Perales] 
 * Submission Date:  [4/1/2021]
 *
 * This program does the following: Circle.java is a class that has multiple methods that create and
 * manipulate an object circle. There are setter methods, getter methods, and multiple methods that
 * use the objects to compare and receive info from other objects of the circle class. One can use the
 * CircleTester driver class to instantiate these methods and display them on the screen for the
 * user to test.
 * 
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
	
	private String name;     // declare the private String instance  name
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
		
		return Math.PI * (radius * 2);
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
		
		if ( (Math.abs(radius-1) < THRESHOLD) && (Math.abs(x) < THRESHOLD) && (Math.abs(y) < THRESHOLD) ) {
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
		
		return "name: " + name + "\ncenter: " + "(" + x + "," + y + ")" + "\nradius: " + radius;
	}
	
	
	//--------------------------------------------------------
	// equals - This method returns true when the radius and
	// centers of both circles are the same; otherwise,
	// it returns false
	//--------------------------------------------------------

	public boolean equals(Circle anotherCircle) {
		if ( (Math.abs( (this.radius - anotherCircle.radius) ) < THRESHOLD) && 
			(Math.abs( (this.x - anotherCircle.x) ) < THRESHOLD) && (Math.abs( (this.y - anotherCircle.y) ) < THRESHOLD) ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//--------------------------------------------------------
	// distance - This method returns the distance between the 
	// centers of the circle executing the method and
	// anotherCircle. 
	//--------------------------------------------------------
	
	public double distance(Circle anotherCircle) {
		return ( Math.sqrt( (Math.pow((x - anotherCircle.x), 2)) + (Math.pow((y - anotherCircle.y), 2)) ));
	}
	
	
	//--------------------------------------------------------
	// isSmaller - The method isSmaller returns true when the 
	// circle executing the method (calling object) is
	// smaller than the parameter (anotherCircle). Otherwise, 
	// it returns false.
	//--------------------------------------------------------
	
	public boolean isSmaller(Circle anotherCircle) {
		if ( (this.diameter() < anotherCircle.diameter()) ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//--------------------------------------------------------
	// compareTo - Works similar to the compareTo method in the 
	// String class. If the calling object is larger, the
	// method returns a positive 1. If the calling object is 
	// smaller than anotherCircle, it returns -1.
	// Otherwise, it returns 0. 
	//--------------------------------------------------------
	
	public int compareTo(Circle anotherCircle) {
		if ( (this.diameter() > anotherCircle.diameter()) ) {
			return 1;
		}
		else if ( isSmaller(anotherCircle) == true ) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
	//--------------------------------------------------------
	// intersects - returns true when the circle executing the 
	// method and anotherCircle have an intersecting area (one or 
	// more points enclosed by both circles); otherwise, it 
	// returns false. 
	//--------------------------------------------------------
	
	public boolean intersects(Circle anotherCircle) {
		if ( distance(anotherCircle) < (this.radius + anotherCircle.radius) ) {
			return true;
		}
		else {
			return false;
		}
	}
}