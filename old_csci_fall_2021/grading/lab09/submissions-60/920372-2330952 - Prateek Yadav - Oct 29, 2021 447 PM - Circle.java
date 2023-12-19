/*
 * Circle.java
 * Author:  Prateek Yadav
 * Submission Date:  10/29/2021
 * Due Date: 10/29/2021
 *
 *
 * Code Description:
 * The following class contains getters and
 * setters used to create a circle object, with an 
 * x and y coordinate, radius, and name. Aspects of the circle
 * like perimeter, diameter, and area are also included, as well
 * as a determination of unit circle equivalency.
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
 * 
 * I agree with this statement^
 */
public class Circle {
	
	private String name;
	private double radius, x, y;

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
	public void setName(String nameInput) {
		
		name = nameInput;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double xInput) {
		
		x = xInput;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double yInput) {
		
		y = yInput;
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double rInput) {
		if (rInput >= 0) {
			radius = rInput;
		}
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		return Math.PI * radius * radius;
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		return Math.PI * radius * 2;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		return radius * 2;
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		boolean status;
		if(radius == 1 && Math.abs(x - 0) < THRESHOLD && Math.abs(y - 0) < THRESHOLD) {
			status = true;
			return status;
		}
		else {
			status = false;
			return  status;
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
		
		return "\nname: " + name + "\ncenter:(" +x+","+y+")\nradius: "+ radius;
	}
	
	
	//Equality method
	public boolean equals(Circle anotherCircle) {
		if(Math.abs(anotherCircle.getRadius() - this.getRadius()) < THRESHOLD && Math.abs(anotherCircle.getX() - this.getX()) < THRESHOLD && Math.abs(anotherCircle.getY() - this.getY()) < THRESHOLD){
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//Distance method
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(x - anotherCircle.getX(),2) + Math.pow(y - anotherCircle.getY(),2));
	}
	
	
	//Is Smaller method
	public boolean isSmaller(Circle anotherCircle) {
		if(this.diameter() - anotherCircle.diameter() < 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//Compare to method
	public int compareTo(Circle anotherCircle) {
		if(this.isSmaller(anotherCircle)){
			return -1;
		}
		else if(this.diameter() - anotherCircle.diameter() > 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	
	//Intersects method
	public boolean intersects(Circle anotherCircle) {
		if(this.distance(anotherCircle) < (this.getRadius() + anotherCircle.getRadius())) {
			return true;
		}
		else if(this.distance(anotherCircle) < THRESHOLD){
			return true;
		}
		else {
			return false;
		}
	}
}