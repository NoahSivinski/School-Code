
/*
 * Circle.java
 * Author: Jonathan Dintino
 * Submission Date: 29 October 2021
 *
 * Purpose: This program contains a circle class that will be
 * used for testing in another file. Every circle has a name,
 * radius, and x and y coordinate values. There are also various
 * methods attached to each instance of the class.
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
	
	private String name;         // declare the private String instance  name
	private double radius;       // declare the private double instance  radius
	private double x;      		 // declare the private double instance  x
	private double y;      		 // declare the private double instance  y

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
		if (radius < 0) return;
		this.radius = radius;
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
		return Math.abs(radius - 1) < THRESHOLD && Math.abs(x) < THRESHOLD && Math.abs(y) < THRESHOLD;
	}
	
	//--------------------------------------------------------
	// equals - returns if the radius and center of this circle and anotherCircle are the same
	//--------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		return Math.abs(radius - anotherCircle.radius) < THRESHOLD
			&& Math.abs(x - anotherCircle.x) < THRESHOLD
			&& Math.abs(y - anotherCircle.y) < THRESHOLD;
	}
	
	//--------------------------------------------------------
	// distance - returns the distance between the center of this circle and anotherCircle
	//--------------------------------------------------------
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(x - anotherCircle.x, 2) + Math.pow(y - anotherCircle.y, 2));
	}
	
	//--------------------------------------------------------
	// isSmaller - returns if this circle is smaller than anotherCircle
	//--------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle) {
		return this.diameter() < anotherCircle.diameter();
	}
	
	//--------------------------------------------------------
	// compareTo - 
	//--------------------------------------------------------
	public int compareTo(Circle anotherCircle) {
		return this.isSmaller(anotherCircle) ? -1 : (anotherCircle.isSmaller(this) ? 1 : 0);
	}
	
	//--------------------------------------------------------
	// intersects - returns if this circle and anotherCircle are intersecting eachother
	//--------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		return this.distance(anotherCircle) < (radius + anotherCircle.radius);
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
	}

}