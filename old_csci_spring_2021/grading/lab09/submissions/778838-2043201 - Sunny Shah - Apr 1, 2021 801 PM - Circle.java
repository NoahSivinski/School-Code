/*
 * Circle.java
 * Author:  Sunny Shah 
 * Submission Date:  04/02/2021
 *
 * Purpose: This program creates unit circles using various methods. 
 * This lab uses testing program to illustrate how the component
 * parts of what you have created interact.
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
	private double x;       // declare the private double instance  radius
	private double y;       // declare the private double instance  x
	private double radius;       // declare the private double instance  y

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
	public void setRadius(double radius) {

		// Your code goes here	
		if (radius >= THRESHOLD)
		{
			this.radius = radius;
		}

	}

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {

		// Your code goes here	
		return (getRadius() * getRadius()) * Math.PI;

	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {

		// Your code goes here	
		return (2) * (Math.PI) * (getRadius());

	}

	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {

		// Your code goes here	
		return getRadius() + getRadius();

	}


	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {

		if ((Math.abs(1 - radius) < THRESHOLD) && (Math.abs(0 - x) < THRESHOLD) && (Math.abs(0 - y) < THRESHOLD))
		{
			return true;
		}

		else
		{
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
		return "name: " + name + "\n" + "center: " + "(" + getX() +"," + getY() +")" + "\n" + "radius: "+ getRadius();

	}

	// Test 1: Checks if circle1 and circle2 are equal.
	public boolean equals(Circle anotherCircle) {

		if ((Math.abs(radius - anotherCircle.getRadius()) < THRESHOLD) && 
				(Math.abs(x - anotherCircle.getX()) < THRESHOLD) && 
				(Math.abs(y - anotherCircle.getY()) < THRESHOLD)) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// Test 2: Checks the distance between circle1 and circle2.
	public double distance(Circle anotherCircle) {

		double distance = Math.sqrt(Math.pow(x - anotherCircle.x, 2) + Math.pow(y - anotherCircle.y, 2));

		return distance;
	}

	// Test 3: Checks if the circle being compared is smaller than the other circle.
	public boolean isSmaller(Circle anotherCircle) {

		if (diameter() < anotherCircle.diameter())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	// Test 4: Compares the circles. If the circle being compared is smaller than the
	// other circle than return -1. If the circle being compared is larger than the
	// other circle than return 1. If the circle being compared is equal to the
	// other circle than return 0.
	public int compareTo(Circle anotherCircle) {

		if (diameter() < anotherCircle.diameter())
		{
			return -1;
		}
		else if (diameter() > anotherCircle.diameter())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	// Test 5: Checks if the circles intersect.
	public boolean intersects(Circle anotherCircle) {

		double distance = distance(anotherCircle); // call distance

		if (distance < (radius + anotherCircle.radius))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

}