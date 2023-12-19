/*
 * Circle.java
 * Author:  Brandon Ho
 * Submission Date:  Oct 28 2021
 *
 * Purpose: creates a circle with a (x,y) cord. and a radius
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

	private String name;  
	private double radius;     
	private double x;       
	private double y;      

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
	public void setX(double xValue) {

		x = xValue;	
	}

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double yValue) {

		y = yValue;
	}


	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		if(radius >= 0) {
			this.radius = radius;
		}

	}

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {

		return Math.PI * Math.pow(radius , 2);
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

		boolean isUnitCircle;
		if(Math.abs(radius - 1) < THRESHOLD && Math.abs(x) < THRESHOLD && Math.abs(y) < THRESHOLD) {
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

		return("\nname: " + name + "\ncenter: (" + x + "," + y + ")" + "\nradius: " + radius);
	}


	//--------------------------------------------------------
	// equals - returns true when the radius and centers of both circles are the same
	//--------------------------------------------------------
	public boolean equals(Circle anotherCircle) {

		return Math.abs(this.radius - anotherCircle.radius) < THRESHOLD && Math.abs(this.x - anotherCircle.x) < THRESHOLD && Math.abs(this.y - anotherCircle.y) < THRESHOLD;

	}

	//--------------------------------------------------------
	// distance - returns distance between center of circles
	//--------------------------------------------------------
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(this.x - anotherCircle.x , 2) + Math.pow(this.y - anotherCircle.y , 2));
	}

	//--------------------------------------------------------
	// isSmaller - returns true when circle is smaller than the circle inputted into parameter
	//--------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle) {
		boolean isSmaller = false;
		if(this.diameter() < anotherCircle.diameter()) {
			isSmaller = true;
		}
		return isSmaller;
	}

	//--------------------------------------------------------
	// compareTo - if circle is larger than another circle returns 1
	// 			   if circle is smaller than another circle returns -1
	// 			   if circle is equal to another circle returns 0
	//--------------------------------------------------------
	public int compareTo(Circle anotherCircle) {

		int compareValue = 0;
		if(this.diameter() > anotherCircle.diameter()) {
			compareValue = 1;
		}
		else if (this.diameter() < anotherCircle.diameter()) {
			compareValue = -1;
		}
		return compareValue;

	}

	//--------------------------------------------------------
	// intersects - returns true when circle intersects another circle
	//--------------------------------------------------------
	public boolean intersects(Circle anotherCircle){
		return distance(anotherCircle) < (this.radius + anotherCircle.radius);
	}

}

