/*
 * Circle.java
 * Author:  Tenacity Murdie 
 * Submission Date:  10-25-2021
 *
 * Purpose: This program defines a circle. It includes accessor and mutator methods. It also includes methods to calculate
 * area, perimeter, and diameter. Given two circles, this program tests their sizes, distances, equality, and intersection
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
	private double radius;   // declare the private double instance  radius
	private double x;        // declare the private double instance  x
	private double y;        // declare the private double instance  y

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
		name = newName;
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
	public void setRadius(double newRadius) {
		if (newRadius >= 0) {
			radius = newRadius;
		}
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		return (Math.PI * radius * radius);
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
		boolean isUnitCircle;
		if ((Math.abs(radius - 1) < THRESHOLD) && (Math.abs(x-0) < THRESHOLD) && (Math.abs(y-0) < THRESHOLD)) {
			isUnitCircle = true;
		}
		else {
			isUnitCircle = false;
		}
		return isUnitCircle;
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		return ("name: " + name + "\n" + "center: " + "(" + x + "," + y +")" + "\n" + "radius: " + radius);
	}
	
	//--------------------------------------------------------
	//Returns true when the radius and centers of both circles are the same;
	//otherwise, returns false
	//--------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		boolean equals;
		if ((Math.abs(this.radius - anotherCircle.radius) < THRESHOLD) && (Math.abs(this.x-anotherCircle.x) < THRESHOLD) && (Math.abs(this.y-anotherCircle.y) < THRESHOLD)) {
			equals = true;
		}
		else {
			equals = false;
		}
		return equals;
	}
	
	//--------------------------------------------------------
	//Returns the distance between the centers of the circle executing the method
	//and another Circle
	//--------------------------------------------------------
	public double distance(Circle anotherCircle) {
		double powX = Math.pow((this.x - anotherCircle.x), 2);
		double powY = Math.pow((this.y - anotherCircle.y), 2);
		double distance = Math.sqrt(powX+powY);
		return distance;
	}
	
	//--------------------------------------------------------
	//Returns true when the circle executing the method is smaller than anotherCircle
	//otherwise, returns false
	//--------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle) {
		boolean isSmaller;
		if (this.diameter() < anotherCircle.diameter()) {
			isSmaller = true;
		}
		else {
			isSmaller = false;
		}
		return isSmaller;
	}
	
	//--------------------------------------------------------
	//If the calling object is larger than anotherCircle, the method returns a positive 1
	//if the calling object is smaller than anotherCircle, the method returns -1
	//otherwise, the method returns 0
	//--------------------------------------------------------
	public int compareTo(Circle anotherCircle) {
		int compare;
		if (this.isSmaller(anotherCircle) == true) {
			compare = -1;
		}
		else if (this.diameter() > anotherCircle.diameter()) {
			compare = 1;
		}
		else {
			compare = 0;
		}
		return compare;
	}
	
	//--------------------------------------------------------
	//Returns true when the circle executing the method and anotherCircle have an intersecting area
	//otherwise, method returns false
	//--------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		return (this.distance(anotherCircle) < (this.radius + anotherCircle.radius));
	}

}
