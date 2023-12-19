//*******************************************************
// Circle.java
//
// 
//*******************************************************
/*
 * Circle.java
 * Author:  Tushita Bansal
 * Submission Date:  October 29, 2021
 *
 * Purpose: This program draws shapes based on what letter the user inputs.
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
	
	private String name;      // declare the private String instance  name
	private double radius;       // declare the private double instance  radius
	private double x ;      // declare the private double instance  x
	private double y;       // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	// Your code goes here	
	public String getName() {
		return name;
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	// Your code goes here
	public double getX() {
		return x;	
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	// Your code goes here
	public double getY() {
		return y;	
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	// Your code goes here	
	public double getRadius() {
		return radius;
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	// Your code goes here	
	public void setName(String nameSet) {
		name = nameSet;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	// Your code goes here	
	public void setX(double xSet) {
		x = xSet;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	// Your code goes here	
	public void setY(double ySet) {
		y = ySet;
	}
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	// Your code goes here	
	public void setRadius(double radiusSet) {
		radius = radiusSet;
	}
	
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	// Your code goes here	
	public double area() {
		return Math.PI * (radius * radius);
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	// Your code goes here	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	// Your code goes here	
	public double diameter() {
		return radius * 2;
	}

	
	//--------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	// Your code goes here	
	public boolean isUnitCircle() {
		if((Double.compare(radius,1) < THRESHOLD) && ((Double.compare(x,0) < THRESHOLD) && (Double.compare(y,0) < THRESHOLD))) {
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
		return("\nname: ") + name + ("\ncenter: (") + x + "," + y + ")" + "\nradius: " + radius;
			
	}
	
	//This is the equals method.
	public boolean equals(Circle anotherCircle) {
		if((Math.abs(this.x - anotherCircle.x) < THRESHOLD) &&
		(Math.abs(this.y - anotherCircle.y)< THRESHOLD ) &&
		(Math.abs(this.radius - anotherCircle.radius) < THRESHOLD)){
			return true;
		}	
		else {
			return false;
		}
	}
	//This is the distance method.
	public double distance(Circle anotherCircle) {
		return Math.sqrt( Math.pow((this.getX() - anotherCircle.getX()), 2) + Math.pow((this.getY() - anotherCircle.getY()), 2));
	}
	//This is the isSmaller method.
	public boolean isSmaller(Circle anotherCircle) {
		if(this.diameter() < anotherCircle.diameter()) {
			return true;
		}
		else {
			return false;
		}
	}
	//This is the compareTo method.
	public int compareTo(Circle anotherCircle) {
		if(this.diameter() > anotherCircle.diameter()) {
			return 1;
		}
		else if(this.diameter() < anotherCircle.diameter()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	//This is the intersects method.
	public boolean intersects(Circle anotherCircle) {
		if( this.distance(anotherCircle) < (this.getRadius() + anotherCircle.getRadius())){
			return true;
		}
		else {
			return false;
		}
	}

}