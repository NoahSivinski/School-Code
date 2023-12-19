/*
 * Circle.java
 * Author:  Aaron Shurley
 * 
 * Submission Date:  4/2/2021
 *
 * Purpose: The purpose of this program is to allow for the user to use methods that will display certain values for two different circles. 
 * These different circles will be manipulated throughout the program and the program will run a series of tests and will check if
 * the tests are passed or failed.
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
	
	private String name;     	// declare the private String instance  name
	private double radius;      // declare the private double instance  radius
	private double x;			// declare the private double instance  x
	private double y;           // declare the private double instance  y

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
//		x = this.x;
		return this.x;
		// Your code goes here	
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
//		y = this.y;
		return this.y;
		// Your code goes here	
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
//		radius = 0;
		return this.radius;
		// Your code goes here	
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String name) {
		this.name = name;
		// Your code goes here	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {
		this.x = x;
		
		// Your code goes here	
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		this.y = y;
		
		// Your code goes here	
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} 
			
		
		
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		double area = (radius * radius) * Math.PI;	
		return area;
		
		// Your code goes here	 
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		double perimeter =( 2 * Math.PI) * radius;
		return perimeter;
		// Your code goes here	
	}
//	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		double diameter = radius * 2;
		return diameter;
		
		// Your code goes here	
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		if (Math.abs(radius - 1) < THRESHOLD && Math.abs(x - 0) < THRESHOLD && Math.abs(y - 0) < THRESHOLD) {
			return true;
		
		}else {
			return false;
			
		}
		
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
		System.out.println("name: " + name);
		System.out.println("center: " + "(" + x + "," + y + ")");
		System.out.println("radius: " + radius);
		return name;
		// math for the .equals method
	}
	public boolean equals(Circle anotherCircle) {
			if (Math.abs(getRadius()- anotherCircle.getRadius()) < THRESHOLD && (Math.abs(getX() - anotherCircle.getX()) < THRESHOLD && (Math.abs(getY() - anotherCircle.getY()) < THRESHOLD))){
				return true;
			}else 
				return false;
	}
	// math for the .distance method
	public double distance(Circle anotherCircle) {
		double distance = Math.sqrt((Math.pow(getX() - anotherCircle.getX(), 2) + (Math.pow(getY() - anotherCircle.getY() , 2))));
		return distance;
	}
	// math for the .isSmaller  method 
	public boolean isSmaller(Circle anotherCircle) {
		if(diameter() < anotherCircle.diameter()) {
			return true;
		}else
			return false;
		//math for the .compareTo method
	}
	public int compareTo (Circle anotherCircle) {
		if (diameter() > anotherCircle.diameter()) {
			return 1;
		}
		else if (diameter() < anotherCircle.diameter()){
			return -1;
		}
		else {
			return 0;
		}
	}
	//  math for the .intersects method
	public boolean intersects (Circle anotherCircle) {
		if (distance(anotherCircle) < (getRadius() + anotherCircle.getRadius())) {
			return true;
		}
		else {
			return false;
		}

}

}
	
