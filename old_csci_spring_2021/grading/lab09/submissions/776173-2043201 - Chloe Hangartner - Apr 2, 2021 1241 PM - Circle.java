/*
 * Circle.java
 * Author: Chloe Hangartner
 * Submission Date: 2 April 2021
 *
 * Purpose:  Contains a partial definition or a class
 * representing a circle.
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
	private double radius;       // declare the private double instance  radius
	private double x;			// declare the private double instance  x
	private double y;       // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {

		// Your code goes here	
		return this.name;
	}

	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {

		// Your code goes here	
		return this.x;
	}


	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {

		// Your code goes here	
		return this.y;
	}

	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {

		// Your code goes here	
		return this.radius;
	}

	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String newValueName) {

		// Your code goes here	
		this.name = newValueName;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newValueX) {

		// Your code goes here	
		this.x = newValueX;
	}

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newValueY) {

		// Your code goes here	
		this.y = newValueY;
	}


	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newValueRadius) {

		// Your code goes here
		if(newValueRadius >= 0) {
			this.radius = newValueRadius;
		}
	}

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {

		// Your code goes here	
		return (this.radius * this.radius) * Math.PI;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {

		// Your code goes here	
		return 2 * Math.PI * this.radius;
	}

	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {

		// Your code goes here	
		return this.radius * 2;
	}


	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {


		// if(Math.abs(2-circle1.getRadius()) < THRESHOLD)

		// Your code goes here	

		if (this.radius==1 && this.x==0 && this.y==0) {
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
		return "Center: ("+this.x + "," + this.y + ")\nRadius: " + this.radius;
	}

	public boolean equals(Circle anotherCircle) {
		if (this.radius==anotherCircle.radius && 
				this.x==anotherCircle.x&&this.y==anotherCircle.y) {
			return true;
		}
		else {
			return false;
		}
	}
	public double distance (Circle anotherCircle) {
		return Math.sqrt(Math.pow((this.x-anotherCircle.x), 2) + 
				Math.pow((this.y-anotherCircle.y), 2));

	}

//	public boolean isSmaller(Circle anotherCircle) {
//
//	}
//
//	public int compareTo (Circle anotherCircle) {
//
//	}

	public boolean intersects (Circle anotherCircle) {
		if(this.radius + anotherCircle.radius > Math.sqrt(Math.pow((this.x-anotherCircle.x), 
				2) + Math.pow((this.y-anotherCircle.y), 2))){

			return true;
		}
		else {
			return false;
		}
	}
}
