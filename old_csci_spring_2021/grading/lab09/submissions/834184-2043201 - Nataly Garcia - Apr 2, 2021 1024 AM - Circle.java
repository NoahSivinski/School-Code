/*
 * Circle.java
 * Author:  Nataly Garcia
 * Submission Date:  April 2 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? In this code, there are four variables
 * privately declared. These variables are used to produce different 
 * methods, such as equals, distance, isSmaller, compareTo, and
 * intersects. Then, using the class named CircleTester.java, 
 * the methods are put to the test.
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

	private String name;      // declare the private String instance  name
	private double radius;	  // declare the private double instance  radius
	private double x;         // declare the private double instance  x
	private double y;         // declare the private double instance  y

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
		return Math.PI * radius * radius;
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
		return 2 * radius;
	}


	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if ((Math.abs(radius - 1) < THRESHOLD) && (Math.abs(x) < THRESHOLD) && (Math.abs(y) < THRESHOLD)) {
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
		return "\nname: " + name + "\ncenter: (" + x + "," + y + ") \nradius: " + radius;	
	}

	public boolean equals(Circle anotherCircle) {
		if ((Math.abs(radius - anotherCircle.getRadius()) < THRESHOLD) && (Math.abs(x - anotherCircle.getX()) < THRESHOLD) && (Math.abs(y - anotherCircle.getY()) < THRESHOLD)){
			return true;
		}
		else {
			return false;
		}
	}

	public double distance(Circle anotherCircle) {
		return Math.sqrt((Math.pow((x - anotherCircle.getX()), 2.0)) + (Math.pow((y - anotherCircle.getY()), 2.0)));
	}

	public boolean isSmaller(Circle anotherCircle) {
		if (diameter() < anotherCircle.diameter()) {
			return true;
		}
		else {
			return false;
		}
	}
		
		public int compareTo(Circle anotherCircle) {
			if (Math.abs(radius - anotherCircle.getRadius()) < THRESHOLD) {
				return 0;
			}
			else if (isSmaller(anotherCircle) == false) {
				return 1;
			}
			else {
				return -1;
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