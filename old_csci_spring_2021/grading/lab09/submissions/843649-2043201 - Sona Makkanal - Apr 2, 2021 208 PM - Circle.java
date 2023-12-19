/*
 * [Circle].java
 * Author:  [Sona Makkanal] 
 * Submission Date:  [4/2/21]
 *
 * Purpose: This program contains the "getter" and "setter" methods for various variables such as name, radius, x, and y, as well as a couple methods that are later tested in CircleTester.java
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
	
	private String name;       	 // declare the private String instance  name
	private double radius;       // declare the private double instance  radius
	private double x;      		 // declare the private double instance  x
	private double y;      		 // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {
		return (this.name);
		// Your code goes here	
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		return (this.x);
		// Your code goes here	
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		return (this.y);
		// Your code goes here	
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		return (this.radius);
		// Your code goes here	
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String A) {
		this.name = A;
		// Your code goes here	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double A) {
		this.x = A;
		// Your code goes here	
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double A) {
		this.y = A;
		// Your code goes here	
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double A) {
		if (A >= 0) {
			this.radius = A;
		}
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		return (Math.PI * Math.pow(radius, 2));
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		return (2 * Math.PI * radius);
		// Your code goes here	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		return (2 * radius);
		// Your code goes here	
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if (Math.abs(radius -1) < THRESHOLD && Math.abs(x - 0) < THRESHOLD && Math.abs(y - 0) < THRESHOLD)  {
		 return(true);
		}
		else return(false);
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
		return ("\nname: " + name + "\ncenter: (" + x + ", " + y + ")" + "\nradius: " + radius);
		// Your code goes here	
	}
	
	public boolean equals(Circle anotherCircle) {
		if(Math.abs(this.radius - anotherCircle.getRadius()) < THRESHOLD && Math.abs(this.x - anotherCircle.x) < THRESHOLD && Math.abs(this.y - anotherCircle.y) < THRESHOLD ) {
			return(true);
		}
		else return(false);
	}
	
	public double distance(Circle anotherCircle) {
		double distance = Math.sqrt(Math.pow((x - anotherCircle.getX()),2) + Math.pow((y - anotherCircle.getY()),2));
			return(distance);
	}
	
	public boolean isSmaller (Circle anotherCircle) {
		if(this.diameter() < anotherCircle.diameter()) {
			return(true);
		}
		else return(false);
	}
	
	public int compareTo (Circle anotherCircle) {
		if(this.isSmaller(anotherCircle)) {
			return(-1);
		}
		else if(anotherCircle.isSmaller(this)) {
			return(1);
		}
		else return(0);
	}
	public boolean intersects (Circle anotherCircle) {
		if ((this.distance(anotherCircle)) < (this.radius + anotherCircle.getRadius())) {
			return(true);
		}
		else return(false);
	}

}