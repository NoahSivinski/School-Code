/*
 * Circle.java
 * Author:  Alexis Leath
 * Submission Date: October 29,2021
 *
 * Purpose: This Program will create methods that help create the circle object. 
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
	private String name;   // declare the private String instance  name
	private double radius;       // declare the private double instance  radius
	private double x;      // declare the private double instance  x
	private double y;      // declare the private double instance  y

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
	public double  getRadius() {

		return radius;	
	}

	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String newName) {

		this.name = newName;	
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
	public void  setY(double newY) {
		this.y = newY;	
	}


	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		if (radius > THRESHOLD) {

			this.radius = radius;
		}
	}

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {

		double 	area =Math.PI * getRadius() * getRadius();

		return area;
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {

		double perimeter = 2 * Math.PI * radius;

		return perimeter;
	}

	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {

		return  2 * getRadius();	
	}


	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if (Double.compare(getX(), getY()) == 0 && getRadius() == 1) {
			return true;
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
		return	"name: " + name + "\n" + "center: " + "(" + getX() +"," + getY() +")" + "\n" + "radius: "+ getRadius();

	}

}
