/*
 * Circle.java
 * Author:  Eric Shindell 
 * Submission Date:  10/29/2021
 *
 * Purpose: This code provides various methods by which a circle can be modified through its X, Y,
 * and radius values. These modifications also change its diameter, perimeter, area, and how it interacts
 * with other circles within the class. It also creates methods for finding
 * the distance between two circles, whether they intersect, are smaller than one
 * another or have similar radiuses. 
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
		if (radius >= 0) {
			this.radius = radius;
		}
		else {
			//Nothing
		}
		
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		return Math.PI * this.getRadius() * this.getRadius();
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		return 2 * Math.PI * this.getRadius();
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		return 2 * this.getRadius();
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		if(Math.abs(this.getRadius() - 1) < THRESHOLD) {
			if(Math.abs(this.getX()) < THRESHOLD) {
				if(Math.abs(this.getY()) < THRESHOLD) {
					return true;
				}
			}
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
		
		return "name: " + name + "\ncenter: (" + x + "," + y + ") \nradius: " + radius;
	}
	
	//Checks if the circle's centers and radiuses are equal to one another.
	public boolean equals(Circle anotherCircle) {
		if(Math.abs(anotherCircle.getRadius()) - Math.abs(this.getRadius()) < THRESHOLD && Math.abs(this.getX()) - Math.abs(anotherCircle.getX()) < THRESHOLD && Math.abs(this.getY()) - Math.abs(anotherCircle.getY()) < THRESHOLD) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Checks the distance between the two centers of the circles.
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow((this.x - anotherCircle.x), 2) + Math.pow((this.y - anotherCircle.y), 2));
	}
	
	//Checks if this circle is smaller than another circle.
	public boolean isSmaller(Circle anotherCircle) {
		if(this.diameter() < anotherCircle.diameter()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Does the isSmaller method to greater specificity.
	public int compareTo(Circle anotherCircle) {
		if(this.getRadius() == anotherCircle.getRadius()) {
			return 0;
		}
		else if(this.diameter() < anotherCircle.diameter()) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	public boolean intersects(Circle anotherCircle) {
		if(distance(anotherCircle) < this.radius + anotherCircle.radius) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
