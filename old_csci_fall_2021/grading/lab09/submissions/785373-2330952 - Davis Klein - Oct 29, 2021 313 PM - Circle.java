/*
 * [Circle].java
 * Author:  [Davis Klein] 
 * Submission Date:  [10/29/2021]
 *
 * Purpose: This program creates instances variables of the class Circle and has many methods to perform particular operations on the 
 * circle's variables.
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
	private double radius;	  // declare the private double instance  radius
	private double x;		 // declare the private double instance  x
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
		if (newRadius < 0) {
			this.radius = radius;
		}
		else {
			this.radius = newRadius;
		}
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		double area = Math.PI * radius * radius;
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
		double diameter = 2 * radius;
		return diameter;
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if (Math.abs(radius - 1) < THRESHOLD && Math.abs(x - 0) < THRESHOLD && Math.abs(y - 0) < THRESHOLD) {
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
		String returnString = 
				"name: " + name + "\n" +
				"center: (" + x + "," + y + ")\n" +
				"radius: " + radius + "\n";
		return returnString;
	}
	
	//checks if the two circles have the same radius and center
	public boolean equals(Circle anotherCircle) {
		if (Math.abs(radius - anotherCircle.radius) < THRESHOLD && Math.abs(x - anotherCircle.x) < THRESHOLD && Math.abs(y -anotherCircle.y) < THRESHOLD){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//finds the distance between two circles
	public double distance(Circle anotherCircle) {
		double xMove = x - anotherCircle.x;
		double yMove = y - anotherCircle.y;
		double x2 = Math.pow(xMove, 2);
		double y2 = Math.pow(yMove, 2);
		double xNy = x2 + y2;
		return Math.sqrt(xNy);
	}
	
	//checks the sizes of two circles based on diameter
	public boolean isSmaller(Circle anotherCircle) {
		if (diameter() < anotherCircle.diameter()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//returns a boolean if/if not the circles are equal
	public int compareTo(Circle anotherCircle) {
		int result = 0;
		if (isSmaller(anotherCircle) == false) {
			result = 1;
		}
		if (isSmaller(anotherCircle) == true) {
			result = -1;
		}
		return result;
	}
	
	//checks if the circles intersect on a coordinate plane
	public boolean intersects(Circle anotherCircle) {
		if (distance(anotherCircle) < radius + anotherCircle.radius) {
			return true;
		}
		else {
			return false;
		}
	}

}
