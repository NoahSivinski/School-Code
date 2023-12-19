/*
 * Circle.java
 * Author: Zachary Krausman 
 * Submission Date:  2 April 2021
 *
 * Purpose: The purpose of this program is to learn how to use basic OOP principles through
 * various methods in the circle class that calculates certain circle calculations like
 * diameter, perimeter, etc. from methods that I create. Specific test cases are then used 
 * to show if the methods are working properly.
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
	private double radius;  // declare the private double instance  radius
	private double x;       // declare the private double instance  x (x coordinate for center of circle)
	private double y;       // declare the private double instance  y (y coordinate for center of circle)

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
	public void setX(double xNew) {

		x = xNew;
	}

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double yNew) {

		y = yNew;	
	}


	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radiusNew) {
		if (radiusNew >= 0) { // radius valid only when it is greater than or equal to 0
			radius = radiusNew; // change to new radius if valid
		}	
	}

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {

		return (Math.PI * Math.pow(radius, 2));
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {

		return (2 * Math.PI * radius);	
	}

	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {

		return (2 * radius);	
	}


	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {

		if (Math.abs(1-radius) < THRESHOLD && Math.abs(x) < THRESHOLD && Math.abs(y) < THRESHOLD) {
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

		return "name: " + name + "\ncenter:(" + x + "," + y + ")\nradius: " + radius;
	}

	//--------------------------------------------------------
	// equals - this method returns true when the radius and
	//          centers of both circles are the same;
	//          otherwise, it returns false.
	//--------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		return ((Math.abs(anotherCircle.radius - radius) < THRESHOLD) && (Math.abs(anotherCircle.x - x) < THRESHOLD) 
				&& (Math.abs(anotherCircle.y - y) < THRESHOLD));
	}

	//---------------------------------------------------------
	// distance - this method returns the distance between the
	//            centers of the circle executing the method
	//            and anotherCircle. Uses given formula, just
	//            broken up into two lines for reading ease.
	//---------------------------------------------------------
	public double distance(Circle anotherCircle) {
		double xCalc = Math.pow((x - anotherCircle.x),2);
		double yCalc = Math.pow((y - anotherCircle.y), 2);
		return Math.sqrt(xCalc + yCalc);
	}

	//---------------------------------------------------------
	// isSmaller - returns true when the circle is executing the
	//             method (calling object) is smaller then the
	//             parameter (anotherCircle). Otherwise, it
	//             returns false.
	//---------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle) {
		return this.diameter() < anotherCircle.diameter();
	}

	//---------------------------------------------------------
	// compareTo - works similar to compareTo method in String
	//             class. If the calling object is larger, the
	//             method returns a positive 1. If the calling 
	//             object is smaller than anotherCircle, it 
	//             returns -1. Otherwise, it returns 0.
	//---------------------------------------------------------
	public int compareTo(Circle anotherCircle) {
		if (isSmaller(anotherCircle) == true) { // smaller calling object
			return -1;
		}
		else if (radius > anotherCircle.radius) { // larger calling object
			return 1;
		}
		else { // equal values
			return 0;
		}
	}

	//---------------------------------------------------------
	// intersects - returns true when the circle executing the
	//              method and anotherCircle have an intersecting
	//              area (one or more points enclosed by both
	//              circles); otherwise it returns false.
	//             
	//              Two circles intersect (by this lab’s definition) 
	//              if the distance between the centers of the two
	//              circles is less than the sum of their radius. Your 
	//              method must call the method distance to obtain the 
	//              distance between the two circles.
	//---------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		return ( this.distance(anotherCircle) < (this.radius + anotherCircle.radius));
	}

}
