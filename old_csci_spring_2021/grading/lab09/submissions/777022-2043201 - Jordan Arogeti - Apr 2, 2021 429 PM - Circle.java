/*
 * Circle.java
 * Author:  Jordan Arogeti 
 * Submission Date:  4/2/21
 *
 * Purpose: This program creates a blueprint from which objects in the
 * other class can be created from. This code has a lot of the meat of 
 * this whole program. we can call methods from this code into the other
 * one and it saves time and is more efficient.
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
	private double x;		// declare the private double instance  x
	private double y;       // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {
		
		return name;
			
	} // getName
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		
		return x;	
		
	} // getX
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		
		return y;
			
	} // getY
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		
		return radius;
		
	} // getRadius
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String name) {
		
		this.name = name;
			
	} // setName
	
	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {
		
		this.x = x;
			
	} // setX
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		
		this.y = y;
			
	} // setY
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		
		if (radius >= 0)
			this.radius = radius;
		
	} // setRadius
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		double area = Math.PI * Math.pow(radius, 2);
		return area;	
		
	} // area
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
		
	} // perimeter
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		double diameter = 2 * radius;
		return diameter;
		
	} // diameter

	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		boolean right = true;
		
		if((Math.abs(1 - radius) < THRESHOLD) && (x == 0 && y == 0))
			right = true;
		else
			right = false;
		
		return right;
			
	} // isUnitCircle
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		String output = "";
		
		output += "name: "  + this.name + "\n";
		output += "center: " + "(" + x + "," + y + ")\n";
		output += "radius: " + radius + "\n";
		
		return output;
	
	} // toString

	
	// new methods
	
	public boolean equals(Circle anotherCircle) {
		if ((radius == anotherCircle.getRadius()) && (x == anotherCircle.getX()) && (y == anotherCircle.getY())) 
			return true;
		else
			return false;
		
	} // equals
	
	public double distance(Circle anotherCircle) {
		double xValues = this.x - anotherCircle.x;
		double yValues = this.y - anotherCircle.y;
		double distance = Math.sqrt((Math.pow(xValues, 2)) + (Math.pow(yValues, 2)));
		return distance;
		
	} // distance
	
	public boolean isSmaller(Circle anotherCircle) {
		if (this.diameter() < anotherCircle.diameter())
			return true;
		else
			return false;
		
	} // isSmaller
	
	public int compareTo(Circle anotherCircle) {
		if (this.diameter() > anotherCircle.diameter())
			return 1;
		else if (this.diameter() < anotherCircle.diameter())
			return -1;
		else
			return 0;
					
	} // compareTo
	
	public boolean intersects(Circle anotherCircle) {
		boolean intersect = true;
		double radiusSum = this.radius + anotherCircle.radius;
		double distanceSum = distance(anotherCircle);
		if (radiusSum >= distanceSum)
			intersect = true;
		else
			intersect = false;
		return intersect;
		
	} // intersects
	
	
}
