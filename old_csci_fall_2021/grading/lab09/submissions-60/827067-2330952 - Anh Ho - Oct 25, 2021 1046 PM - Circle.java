/*
 * Circle.java
 * Author:  Anh Ho 
 * Submission Date:  10/25/2021
 *
 * Purpose: creating methods to be used for Circle class objects including setter, getter and simple value calculations of a circle
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */
public class Circle {
	
	private String name;      		// declare the private String instance  name
	private double radius;		    // declare the private double instance  radius
	private double x;				// declare the private double instance  x
	private double y;				// declare the private double instance  y

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
	public void setName(String newName) {
		name = newName;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newX) {
		x = newX;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {
		y = newY;	
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRad) {
		if (Double.compare(newRad, 0) >= 0) {
			radius = newRad;
		}
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		return Math.pow(this.getRadius(), 2)*Math.PI;
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		return this.diameter()*Math.PI;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		return 2*this.getRadius();	
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if (Math.abs(this.getRadius()-1) < THRESHOLD && Math.abs(this.getX()-0) < THRESHOLD && Math.abs(this.getY()-0) < THRESHOLD) {
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
		return "name: "+ this.getName() +"\ncenter: (" + this.getX() + ", "+ this.getY() +")\nradius: " + this.getRadius();
	}
	
	/*equals - return true if the 2 circles have the same radius, and x,y coordinations,
	 * 			false if not*/
	public boolean equals(Circle anotherCircle) {
		if (Math.abs(this.getRadius()-anotherCircle.getRadius()) < THRESHOLD && Math.abs(this.getX()-anotherCircle.getX()) < THRESHOLD && Math.abs(this.getY()-anotherCircle.getY()) < THRESHOLD) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*distance - returns a double,
	 * 			calculates the distance between the centers of the 2 circles*/
	public double distance (Circle anotherCircle) {
		double distance;
		distance = Math.sqrt((Math.pow((this.getX()-anotherCircle.getX()), 2)) + (Math.pow((this.getY()-anotherCircle.getY()), 2)));
		return distance;
	}
	
	/*isSmaller - return true if this circle is smaller than the other circle
	 * 				false if not*/
	public boolean isSmaller(Circle anotherCircle) {
		if (Double.compare(this.diameter(), anotherCircle.diameter()) < 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*compareTo - return 1 if this circle is larger than the other circle
	 * 					-1 if smaller
	 * 					0 if equals*/
	public int compareTo(Circle anotherCircle) {
		if (this.isSmaller(anotherCircle)) {
			return -1;
		}
		else if (this.equals(anotherCircle)) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	/*intersects - returns true if the distance between this circle and the other circle is less than the sum of their radius
	 * 						false if equals or larger*/
	public boolean intersects(Circle anotherCircle) {
		if (Double.compare(this.distance(anotherCircle) , this.getRadius() + anotherCircle.getRadius()) < 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
