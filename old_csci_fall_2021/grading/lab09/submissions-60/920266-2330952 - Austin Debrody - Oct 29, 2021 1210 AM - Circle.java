/*
 * Circle.java
 * Author:  Austin Debrody
 * Submission Date:  10/29/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * This class allows for the creation of a circle with coordinates,
 * radius, and a name. It also provides different methods to calculate
 * area, perimeter, and diameter. There are additional methods included
 * such as isUnitCircle, equals, distance, isSmaller, compareTo, and
 * intersects. Each of which completes an algorithm according to its
 * name.
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
		name = newName;
		// Your code goes here	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newX) {
		x = newX;
		// Your code goes here	
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {
		y = newY;
		// Your code goes here	
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRadius) {
		if(newRadius >= 0) {
			radius = newRadius;
		}
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		return Math.PI * (radius * radius);
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		return 2 * Math.PI * radius;
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		return 2 * radius;
		// Your code goes here	
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if(radius < 1 + THRESHOLD && radius > 1 - THRESHOLD) {
			if(Math.abs(x) < THRESHOLD) {
				if(Math.abs(y) < THRESHOLD) {
					return true;
				}
			}
		} 
		
		return false;

		// Your code goes here	
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
		// Your code goes here	
	}
	
	public boolean equals(Circle anotherCircle) {
		if(Math.abs(anotherCircle.getRadius()- radius) < THRESHOLD) {
			if(Math.abs(x) - Math.abs(anotherCircle.getX()) < THRESHOLD && Math.abs(y) - Math.abs(anotherCircle.getY()) < THRESHOLD) {
				return true;
			}
		}
		
		return false;
	}
	
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow((x - anotherCircle.getX()), 2) + Math.pow((y - anotherCircle.getY()), 2));
	}
	
	public boolean isSmaller(Circle anotherCircle) {
		if(diameter() < anotherCircle.diameter()) {
			return true;
		}
		
		return false;
	}

	public int compareTo(Circle anotherCircle) {
		if(radius == anotherCircle.getRadius()) {
			return 0;
		}
		
		if(isSmaller(anotherCircle)) {
			return 1;
		}
		
		return -1;
		
	}
	
	public boolean intersects(Circle anotherCircle) {
		if(distance(anotherCircle) < (radius + anotherCircle.getRadius())) {
			return true;
		}
		
		return false;
	}
	

}
