/*
 * Circle.java
 * Author:  Samir Hadi Cisneros 
 * Submission Date: 02 March 2021
 *
 * Purpose: This program utilizes various methods learned in class to compute and compare various features of circles. Uses setter and getter 
 * methods to identify x, y, name, and radius. These methods are called upon to get area, perimeter, diameter, and to determine if the circle is a unit circle.
 * Also compares two circles to see if they are equal, smaller to, intersect, etc.
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
 * 
 * 
 * I agree
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
		
		if (radius > THRESHOLD) {
			this.radius = radius;	
		}
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		return Math.PI * (getRadius() * getRadius());		
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		return 2 * Math.PI * getRadius();	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		return 2 * getRadius();	
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		if ((Double.compare(getY(), getX())) == 0 && getRadius() == 1) {
			return true;
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
	public String toString() {
		
		return "name: " + getName() + "\ncenter: (" + getX() + "," + getY() + ")" + "\nradius: " + getRadius();
	}
	
	
	
	
	
	// Checks if circle's radius and center are the same as anotherCircle
	public boolean equals(Circle anotherCircle) {
		if (Math.abs(anotherCircle.getRadius() - radius) < THRESHOLD && (Math.abs(anotherCircle.getX() - x) < THRESHOLD && Math.abs(anotherCircle.getY() - y) < THRESHOLD)) {
			return true;
		} else {
			return false;
		}
	}
	
	// Finds the distance between the center of a circle and the center of another instance of a circle
	//the formula computes square root (x – x(little a))^2 + (y – y(little a))^2
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow((this.x - anotherCircle.x), 2) + Math.pow((this.y - anotherCircle.y), 2));
	}
		
	
	//this will return true if the circle is smaller than the anotherCircle parameter
	//uses the diameter to see which is larger
	public boolean isSmaller(Circle anotherCircle) {
		if (this.diameter() < anotherCircle.diameter()) {
			return true;
		} else {
			return false;
		}
	}	
	
	//if the calling object is larger, the code will output a positive one
	//if it is smaller the code will output a negative one
	//otherwise will output a zero
	public int compareTo(Circle anotherCircle) {
		if (this.diameter() > anotherCircle.diameter()) {
			return 1;
		} else if (this.isSmaller(anotherCircle)) {
			return -1;
		} else {
			return 0;
		}
	}
	
	//this is true when the circles getting compared to each other have intersecting areas
	// calls the distance method to get the distance between the circles
	public boolean intersects(Circle anotherCircle) {
		double distance = this.distance(anotherCircle);
		if (distance < (this.radius + anotherCircle.radius)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	

}