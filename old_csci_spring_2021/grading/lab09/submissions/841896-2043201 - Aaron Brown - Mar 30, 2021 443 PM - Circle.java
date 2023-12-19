/*
 * Circle.java
 * Author: Aaron Brown
 * Submission Date: 03/30/2021
 *
 * Purpose: This set of code contains a large amount of methods that
 * allow the user to work with Circle objects. There are setter and 
 * getter methods for the aspects of the circle, there is a toString
 * that prints the details of the circle, and there are more methods
 * that work with the details of the circle to check different statuses.
 * These are the equals, distance, intersects, isSmaller, isUnitCircle
 * and compareTo methods which work with the circle class to check the
 * status. There are also area, perimeter, and diameter methods which 
 * return the appropriate value of the circle.
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
	private double y;      // declare the private double instance  y

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
		if(newRadius > 0) radius = newRadius;
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		double area = 	(Math.PI * (Math.pow(radius, 2)));
		return area;
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		double perimeter = (2 * Math.PI * radius);
		return perimeter;
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		double diameter = radius + radius;	
		return diameter;
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if((Math.abs((radius-1)) < THRESHOLD)) {
			if((Math.abs((x)) < THRESHOLD)) {
				if((Math.abs((y)) < THRESHOLD)) return true;
				else return false;
			}
			else return false;
		}
		else return false;
	}
	/* The following is the equals boolean method that returns true
	 * if the two circles have the same radius, x, and y values.
	 * Otherwise the method returns false.
	 */
	public boolean equals(Circle anotherCircle) {
		if((Math.abs(radius-anotherCircle.getRadius()) < THRESHOLD) && 
				(Math.abs(x-anotherCircle.getX()) < THRESHOLD) && 
				(Math.abs(y-anotherCircle.getY()) < THRESHOLD)) return true;
		else return false;
	}
	
	/* The following is the distance method which returns the distance
	 * between the centers of two different circles.
	 */
	public double distance(Circle anotherCircle) {
		double distance = Math.sqrt((Math.pow(x-anotherCircle.getX(), 2) + (Math.pow(y-anotherCircle.getY(), 2))));
		return distance;
	}
	
	/* The following is the isSmaller method which checks the two circles
	 * and tells the user whether or not the first circle is smaller than
	 * the second circle. True means it is smaller, false means it isn't.
	 */
	public boolean isSmaller(Circle anotherCircle) {
		if(diameter() < anotherCircle.diameter()) return true;
		else return false;
	}
	
	/* The following method is the compareTo method which is the compares
	 * the size of both circles, and instead of a boolean returns an integer.
	 * If the first circle is larger than the inner circle the integer returned
	 * is 1, if the first is smaller then the integer will be returned as -1.
	 * Otherwise the integer returned is 0.
	 */
	 public int compareTo(Circle anotherCircle) {
		 if(diameter() < anotherCircle.diameter()) return -1;
		 else if(diameter() > anotherCircle.diameter()) return 1;
		 else return 0;
	 }
	 
	 /* The intersects method returns true if the distance between
	  * the two circles is less than the sum of their radiuses.
	  * 
	  */
	 public boolean intersects(Circle anotherCircle) {
		 double distance = distance(anotherCircle);
		 double radiSum = radius + anotherCircle.getRadius();
		 if(distance < radiSum) return true;
		 else return false;
	 }
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		String circleDetails = ("name: " + name + "\ncenter:(" + x + "," + y + ")\nradius: " + radius +'\n');
		return circleDetails;
	}
}
