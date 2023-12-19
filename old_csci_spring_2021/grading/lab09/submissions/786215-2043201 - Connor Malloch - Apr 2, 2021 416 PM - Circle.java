/*
* RockPaperScissors.java
* Author: Connor Malloch
* Submission Date: April 2 2021
*
* Purpose: 
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
	
	private String name;    // declare the private String instance  name
	private double x;       // declare the private double instance  radius
	private double y;      	// declare the private double instance  x
	private double radius;  // declare the private double instance  y

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
	public void setName(String circleName) {
		
		this.name = circleName;	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double valueX) {
		
		this.x = valueX;	
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double valueY) {
		
		this.y = valueY;
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double valueR) {
		 if (valueR > 0)
			 radius = valueR;
	
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		return (Math.PI * (radius * radius));
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		return (2 * Math.PI * radius);
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		return (2 * radius);
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if (x == 0 && y == 0 && Math.abs(radius - 1) <= THRESHOLD) {
				return true;
			} else
				return false;
		}
		
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		return (" name: " + name + "\ncenter: (" + x + "," + y +")" + "\nradius: " + radius);
			
	}

	
	//----------------------------------------------------------
	// equals - returns true if the radius and center
	//			of the two circles being compared are
	//			the same. False if otherwise
	//----------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		if ((Math.abs(getX()-anotherCircle.getX()) <= THRESHOLD 
				&& Math.abs(getY()-anotherCircle.getY()) <= THRESHOLD )
				&& Math.abs(getRadius()-anotherCircle.getRadius()) <= THRESHOLD) {
			return true;
		} else
			return false;
	}
	
	
	//----------------------------------------------------------
	// distance - returns the distance between the centers of the 
	//			  circle executing the method and anotherCircle.
	//----------------------------------------------------------
	public double distance(Circle anotherCircle) {
		return (  Math.sqrt(Math.pow((getX()-anotherCircle.getX()), 2) 
				+ Math.pow((getY() - anotherCircle.getY()), 2)));
	}

	
	//-----------------------------------------------------------
	// isSmaller - returns true when the circle executing the 
	//			   method is smaller than the parameter.
	//			   Otherwise, it returns false.
	//-----------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle) {
		if (diameter() < anotherCircle.diameter()) {
			return true;
		} else
			return false;
	}
	
	
	//-----------------------------------------------------------
	// CompareTo - If the calling object is larger, the	method
	// 			   returns a positive 1. If	the calling	object
	//			   is smaller than anotherCircle, it returns-1.		
	//			   Otherwise, it returns 0
	//-----------------------------------------------------------
	public int compareTo(Circle anotherCircle) {
		if (isSmaller(anotherCircle)) {
			return 0;
		} else
			return 1;
	}

	//-----------------------------------------------------------
	// intersects - returns true when the circle executing the 
	//				method and anotherCircle have an intersecting
	//				area. Otherwise, return false;
	//-----------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		if ( distance(anotherCircle) < ((radius + anotherCircle.radius))) {
			return true;
		} else
			return false;
	}





}