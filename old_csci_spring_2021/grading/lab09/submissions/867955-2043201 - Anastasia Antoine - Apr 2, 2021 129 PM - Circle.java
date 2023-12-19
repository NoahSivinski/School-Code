//*******************************************************
// Circle.java
// Author:  [Anastasia Antoine] 
// * Submission Date:  [4/2/2021]
// *
// * Purpose: This program will calculate a circle by the radius, diameter, and etc..
// *
// * Statement of Academic Honesty:
// *
// * The following code represents my own work. I have neither
// * received nor given inappropriate assistance. I have not copied
// * or modified code from any source other than the course webpage
// * or the course textbook. I recognize that any unauthorized
// * assistance or plagiarism will be handled in accordance with
// * the University of Georgia's Academic Honesty Policy and the
// * policies of this course. I recognize that my work is based
// * on an assignment created by the Department of Computer
// * Science at the University of Georgia. Any publishing 
// * or posting of source code for this assignment is strictly
// * prohibited unless you have written consent from the Department
// * of Computer Science at the University of Georgia.
// 
//*******************************************************
public class Circle {
	
	String name;    // declare the private String instance  name
	double radius;  // declare the private double instance  radius
	double x;       // declare the private double instance  x
	double y;      // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {
		
		// Your code goes here
		return name;
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		
		// Your code goes here
		return x; 
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		
		// Your code goes here	
		return y;
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		
		// Your code goes here	
		return radius; 
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String name) {
		
		// Your code goes here	
		this.name = name;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {
		
		// Your code goes here
		this.x = x;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		
		// Your code goes here	
		this.y = y; 
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double r) {
		
		// Your code goes here	
		if (r >= 0 ) {
			this.radius = r;
		}
		
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		// Your code goes here	
		double area = Math.PI * radius * radius; 
		return area;
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		// Your code goes here	
		double perimeter = 2 * Math.PI * radius;
		return perimeter; 
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		// Your code goes here	
		return (2 * radius); 
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		// Your code goes here	
		if (Double.compare(getX(), getY()) == THRESHOLD && getRadius() == 1) {
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
		
		// Your code goes here	
		return ("name: " + name + "\n" + "center:" + "(" + x + "," + y + ")" + "\n" + "radius: " + radius); 
	}
	
	public boolean equals(Circle anotherCircle) {
		if (Double.compare(getX(),getY()) == getRadius()) {
			return true;
		}
		else {
			return false; 
		}
	}
	
	public double distance(Circle anotherCircle) {
		double distance = Math.sqrt(Math.pow(x - anotherCircle.x, 2) + Math.pow(y - anotherCircle.y, 2));
		return distance; 
	}
	
	public boolean isSmaller (Circle anotherCircle) {
		if (this.diameter() < anotherCircle.diameter()) {
			return true; 
		}
		else {
			return false; 
		}
	}
	
	public int compareTo (Circle anotherCircle) {
		if (this.radius > anotherCircle.radius) {
			return 1;
		}
		else if (this.radius < anotherCircle.radius) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public boolean interacts (Circle anotherCircle) {
		double distance = this.distance(anotherCircle);
		if (distance < (radius + anotherCircle.radius)) {
			return true;
		}
		else {
			return false;
		}
	}

}
