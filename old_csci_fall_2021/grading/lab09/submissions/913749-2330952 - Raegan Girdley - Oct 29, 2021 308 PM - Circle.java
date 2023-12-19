/*
 * Circle.java
 * Author:  Raegan Girdley
 * Submission Date:  10/29/2021
 *
 * Purpose: Makes a circle and compares it to other circles using certain methods.
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
	public void setName(String n) {
		
		name = n;	
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
	public void setRadius(double r) {
		
		if (r >= 0) {
			radius = r;
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
		
		return radius * 2;	
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		if (Math.abs(radius - 1) < THRESHOLD && x < THRESHOLD && 
				y < THRESHOLD) {
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
		
		String complete = "\nname: " + name + "\ncenter: (" + x + "," + y + ")" +
				"\nradius: " + radius;
		return complete;
	}
	
	public boolean equals(Circle anotherCircle) {
		if (Math.abs(radius - anotherCircle.getRadius()) < THRESHOLD &&
				Math.abs(x - anotherCircle.getX()) < THRESHOLD &&
				Math.abs(y - anotherCircle.getY()) < THRESHOLD) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double distance(Circle anotherCircle) {
		double distance = Math.sqrt(Math.pow(x - anotherCircle.getX(), 2) + Math.pow(y - anotherCircle.getY(), 2));
		return distance;
	}
	
	public boolean isSmaller(Circle anotherCircle) {
		if (diameter() - anotherCircle.diameter() < (-1 *THRESHOLD)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(Circle anotherCircle) {
		if (diameter() > anotherCircle.diameter()) {
			return 1;
		}
		else if (diameter() < anotherCircle.diameter()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public boolean intersects(Circle anotherCircle) {
		if (distance(anotherCircle) < (radius + anotherCircle.getRadius())) {
			return true;
		}
		else {
			return false;
		}
	}

}
