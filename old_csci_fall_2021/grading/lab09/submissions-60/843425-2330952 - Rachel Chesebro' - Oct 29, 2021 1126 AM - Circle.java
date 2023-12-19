/*
 * [Circle].java
 * Author:  [Rachel Chesebro'] 
 * Submission Date:  [10/29/2021]
 *
 * Purpose: The purpose of this program is to contain a partial definition for a class representing a circle.
 * This class will store methods and equations used to calculate things such as diameter, and whether each
 * circle is a unit circle. The java class CircleTester.java will test these methods to check that this class
 * was set up correctly, and should display the implemented methods correctly.
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
//*******************************************************
public class Circle {
	
	private String name;       // declare the private String instance  name
	private double radius;       // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;       // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	// getName - returns the value of name
	public String getName() {
		return name;				
	}
	
	// getX - returns the value of x
	public double getX() {
		return x;
	}
	// getY - returns the value of y
	public double getY() {
		return y;
	}
	
	// getRadius - returns the value of radius
	public double getRadius() {
		return radius;
	}
	
	// setName - assigns a new value to name
	public void setName(String name) {
		this.name = name;
	}

	// setX - assigns a new value to x
	public void setX(double x) {
		this.x = x;
	}
	
	// setY - assigns a new value to y
	public void setY(double y) {
		this.y = y;
	}
	
	// setRadius - assigns a new value to radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// area - returns the area of the circle
	public double area() {
		double area = Math.PI * (radius * radius);
		return area;
	}
	
	// perimeter - returns the perimeter of the circle
	public double perimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	// diameter - calculates the diameter of the circle
	public double diameter() {
		double diameter = 2 * radius;
		return diameter;
	}

	// isUnitCircle - return true if the radius of this circle is 1 and its center is (0,0) and false otherwise
	public boolean isUnitCircle() {
		if (radius < 1 + THRESHOLD && radius > 1 - THRESHOLD && x < THRESHOLD && y < THRESHOLD) {
			return true;
		}
		return false;
	}
	
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	public String toString() {
		String output = "\nname: " + name + "\ncenter: (" + x + "," + y + ")\nradius: " + radius;
		return output;	
	}

	// equals - check whether circles are equal
	public boolean equals(Circle anotherCircle) {
		if ((Math.abs(anotherCircle.getX() - getX()) < THRESHOLD) && (Math.abs(anotherCircle.getY() - getY()) < THRESHOLD) && (Math.abs(anotherCircle.getRadius() - getRadius()) < THRESHOLD)) {
			return true;
		}
		return false;
	}
	
	// distance - find the distance between the centers of the circle
	public double distance(Circle anotherCircle) {
		double distance = Math.sqrt((Math.pow((this.x-x),2) + (Math.pow((this.y-y),2))));
		return distance;
	}

	
	// isSmaller - find which circle is smaller by comparing diameters
	public boolean isSmaller(Circle anotherCircle) {
		if (this.diameter() < diameter() + THRESHOLD) {
			return true;
		}
		return false;
	}
	
	// compareTo - use compareTo method
	 public int compareTo(Circle anotherCircle) {
			if ((Math.abs(anotherCircle.getX() - getX()) <= THRESHOLD) && (Math.abs(anotherCircle.getY() - getY()) <= THRESHOLD) && (Math.abs(anotherCircle.getRadius() - getRadius()) <= THRESHOLD)) {
			 return 1;
		}
		else if (anotherCircle.getX() > getX()) {
			return -1;
		}
		else {
			return 0;
		}
	 }

	 
	 // intersects - check if the two circles intersect (if the distance between
	 // the centers of the two circles is less than the sum of their radius
	 public boolean intersects(Circle anotherCircle) {
		 double R = (getRadius() + anotherCircle.getRadius());
		 if (R > Math.sqrt((Math.pow((this.x-x),2) + (Math.pow((this.y-y),2))))) {
			 return true;
		 }
		 else {
			 return false;
		 }
		 
	 }
	 
}
