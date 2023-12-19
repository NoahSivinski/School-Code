/*
 * Circle.java
 * Author:  Chase Pitser
 * Submission Date: 10/29/2021
 *
 * Purpose: This program creates a Circle object with the instance variables of
 * the name of the circle, the radius of the circle, and the x and y values of the
 * center of the circle. This class contains 18 different methods to get and set 
 * each of the instance variables and to do and check many other operations, 
 * such as the area, perimeter, and diameter of the circle, in addition to comparing
 * the calling Circle object to another Circle object.
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
	public void setRadius(double newRadius) {
		if(newRadius >= 0) {
			radius = newRadius;
		}
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		return (Math.PI)*Math.pow(radius,2);
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		return 2*(Math.PI)*radius;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		return 2*radius;
	}

	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if(Math.abs(x)<THRESHOLD && Math.abs(y)<THRESHOLD && Math.abs(radius-1)<THRESHOLD) {
			return true;
		}else {
			return false;
		}
	}
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//	      name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		return "name: " + name + "\ncenter: (" + x + "," + y + ")\nradius: " + radius;
	}
	
	//---------------------------------------------------------
	// equals - tests if two circles are equal: if they
	//               have the same center and radius
	//---------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		return (Math.abs(this.x - anotherCircle.getX()) < THRESHOLD && Math.abs(this.y - anotherCircle.getY()) < THRESHOLD && Math.abs(this.radius - anotherCircle.getRadius()) < THRESHOLD);
	}
	
	//---------------------------------------------------------
	// distance - returns the double value of the distance
	//				   between the centers of the circle used
	//				   to call the method and the input circle
	//---------------------------------------------------------
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(this.getX()-anotherCircle.getX(),2)+Math.pow(this.getY()-anotherCircle.getY(),2));
	}
	
	//---------------------------------------------------------
	// isSmaller - compares the diameter of the calling object 
	//                    with the diameter of the parameter circle 
	//				    and returns a boolean of whether the calling 
	//                    object is smaller or not
	//---------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle) {
		return (this.diameter() < anotherCircle.diameter());
	}
	
	//----------------------------------------------------------
	// compareTo - returns either a -1, 0, or 1 if the calling 
	//						object is smaller, the same size, or bigger 
	//						than the parameter, respectively
	//----------------------------------------------------------
	public int compareTo(Circle anotherCircle) {
		if(this.isSmaller(anotherCircle)) {
			return -1;
		}else if(this.diameter()>anotherCircle.diameter()) {
			return 1;
		}else {
			return 0;
		}
	}
	
	//----------------------------------------------------------
	// intersects - returns true or false if the distance between
	// the centers of the calling object and the argument 
	// object is less than the sum of their radii or not
	//---------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		return (this.distance(anotherCircle)<(this.radius+anotherCircle.getRadius()));
	}

}
