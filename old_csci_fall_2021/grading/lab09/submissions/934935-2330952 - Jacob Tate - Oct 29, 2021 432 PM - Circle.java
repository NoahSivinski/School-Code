//*******************************************************
// Circle.java
//
// 
//*******************************************************
/**
 * Circle.java
 * Author:  Jacob Tate 
 * Submission Date:  Friday, October 29th, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * The purpose of the program is to create a circle using information
 * such as the x and y coordinates, the name of the circle, and the radius.
 * This class also allows the user to check various conditions of the circle,
 * such as the circle being a unit circle. Simultaneously, the user can also
 * compare multiple circle objects, given the methods are called appropriately.
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
	private double radius;   // declare the private double instance  radius
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
	public void setRadius(double newRadius) 
	{
		if(newRadius >= 0)
		{
			radius = newRadius;
		}
		
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		return Math.PI * Math.pow(radius, 2);
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
		
		if(Math.abs(1 - radius) < THRESHOLD && this.getX() < THRESHOLD && this.getY() < THRESHOLD)
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
		
		return "\n" + "name: " + name + "\n" + "center: (" + x + "," +  y + ") \n" + "radius: " + radius;
	}
	
	//--------------------------------------------------------
	// equals - return true if two circles have the same
	//          radii and coordinates and false
	//          otherwise.
	//--------------------------------------------------------
	public boolean equals(Circle anotherCircle)
	{
		if((Math.abs(this.getRadius() - anotherCircle.getRadius()) < THRESHOLD) && (Math.abs(this.getX()-anotherCircle.getX()) < THRESHOLD) && (Math.abs(this.getY()-anotherCircle.getY()) < THRESHOLD))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//--------------------------------------------------------
	// distance - calculates the distance between two circles
	//--------------------------------------------------------
	public double distance(Circle anotherCircle)
	{
		return Math.sqrt(Math.pow(this.getX()-anotherCircle.getX(), 2) + Math.pow(this.getY() - anotherCircle.getY(), 2));
	}
	
	//--------------------------------------------------------
	// isSmaller - return true if the diameter of the 
	//         circle that calls this method is less than 
	//         the diameter of another circle, and false
	//		   otherwise.
	//--------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle)
	{
		if(this.diameter() < anotherCircle.diameter())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//--------------------------------------------------------
	// compareTo - returns 1 if the circle that calls this 
	//			   method is larger than another circle,
	//             returns -1 if the circle that calls this 
	//			   method is smaller than another circle,
	//       	   returns 0 otherwise.
	//--------------------------------------------------------
	public int compareTo(Circle anotherCircle)
	{
		if(this.isSmaller(anotherCircle) == true)
		{
			return -1;
		}
		else if(this.isSmaller(anotherCircle) == false)
		{
			return 1;
		}
			else
		{
			return 0;
		}
	}
	
	//--------------------------------------------------------
	// intersects - returns true if the distance between 
	//			   the centers of the two circles is less
	//             than the sum of their radii,
	//			   and returns false otherwise.
	//--------------------------------------------------------
	public boolean intersects(Circle anotherCircle)
	{
		if(this.distance(anotherCircle) < (this.getRadius() + anotherCircle.getRadius()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
