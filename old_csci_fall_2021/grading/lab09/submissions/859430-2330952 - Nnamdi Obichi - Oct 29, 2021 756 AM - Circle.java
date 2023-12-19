/*
 * Circle.java
 * Author:  Nnamdi Obichi
 * Submission Date: October 29th, 2021
 *
 * Purpose: 
 * 
 * This class creates methods which can be used
 * to define the attributes of a new circle object.
 * There are boolean methods that to see if the set
 * attributes of a circle object meet certain criteria.
 * Additionally, circle objects can be compared
 * and calculated with one another to obtain numerical
 * or boolean data in some methods.
 * 
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
	
	private String name;    // declare the private String instance  name
	private double radius;  // declare the private double instance  radius
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
		
		if (newRadius >= 0) {
			radius = newRadius;
		}
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		double result = Math.PI * (radius*radius);  
		
		return result;
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		double result = 2 * Math.PI * radius;	
		
		return result;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		double result = 2 * radius;
		
		return result;
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		boolean result = (Math.abs(radius-1) < THRESHOLD) &&
						 (Math.abs(x-0) < THRESHOLD) &&
						 (Math.abs(y-0) < THRESHOLD);
		
		return result;
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		
		String details = "name: "+ name + "\ncenter: (" + x + "," + y + ")" + "\nradius: " + radius;
		
		return details;
	}
	
	//--------------------------------------------------------
	// equals - returns true if the radii and centers of both 
	// 			circles are equal otherwise it returns false
	//--------------------------------------------------------	
	public boolean equals(Circle anotherCircle) {
		
		boolean equalCircle = (Math.abs(radius - anotherCircle.radius) < THRESHOLD) &&
							  (Math.abs(x - anotherCircle.x) < THRESHOLD) &&
							  (Math.abs(y - anotherCircle.y) < THRESHOLD);
		
		return equalCircle;			
	}
	
	//--------------------------------------------------------
	// distance - returns the distance (double) between the
	//			  circle executing the method and anotherCircle
	//--------------------------------------------------------
	public double distance(Circle anotherCircle) {
		
		double result = Math.sqrt(Math.pow(x - anotherCircle.x, 2) + Math.pow(y - anotherCircle.y, 2));
		
		return result;		
	}
	
	//--------------------------------------------------------
	// isSmaller - returns true if the circle executing the
	//             method is smaller than anotherCircle and it
	//             returns false if it is larger 
	//--------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle) {
		
		boolean result = this.diameter() < anotherCircle.diameter();
		
		return result;
	}
	
	//------------------------------------------------------------
	// compareTo - if the two circles do not have equal diameters:
	//             	  --if the circle executing the method is 
	//                  larger than anotherCircle, return 1
	//				  --if the circle executing the method is 
	//                  smaller than anotherCircle, return -1
	//
	//             Otherwise the function returns 0
	//------------------------------------------------------------
	public int compareTo(Circle anotherCircle) {
		
		int result = 0;
		
		if (!(Math.abs(this.diameter() - anotherCircle.diameter()) < THRESHOLD)) {
			
			if (this.isSmaller(anotherCircle) == false) {
				return ++result; 
			}
			
			else if (this.isSmaller(anotherCircle)) {
				return --result; 
			}
		}
		
		return result;
	}
	
	//-----------------------------------------------------------
	// intersects - returns true if the distance of the circle 
	//              executing the method is less than the sum of
	//              the radii of the circle executing the method 
	//              and anotherCircle. Otherwise it returns false
	//              if the previous conditions were false
	//-----------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		
		boolean result = this.distance(anotherCircle) < (this.radius + anotherCircle.radius);
		
		return result;
	}

}