/*
 * Circle.java
 * Author:  James Breathnach 
 * Submission Date:  10/29/2021
 *
 * Purpose: It contains a list of methods which will be called upon in order to create values for circles.
 * The methods also can be used to run tests on the circles.
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



//*******************************************************
// Circle.java
//
// 
//*******************************************************
public class Circle {

	private String name;         // declare the private String instance  name
	private double radius;       // declare the private double instance  radius
	private double x;            // declare the private double instance  x
	private double y;            // declare the private double instance  y

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

		this.name = newName;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newX) {

		this.x=newX;	
	}

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {

		this.y=newY;
	}


	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRadius) {
		if (newRadius>=0) {
			this.radius=newRadius;
		}
	}

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {

		double area = Math.PI *(radius*radius);
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

		double diameter = radius*2;
		return diameter;
	}


	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		boolean unitCircle = false;
		if ( 1- THRESHOLD <= radius && radius <= 1 + THRESHOLD && Math.abs(x) <=0.0 + THRESHOLD && Math.abs(y)<=0.0 + THRESHOLD) {
			unitCircle=true;
		}
		return unitCircle;
	}


	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {

		String format ="name: " + name + "\ncenter: (" + x +"," + y + ")\nradius: " + radius;
		return format;
	}
	//equals - checks to see if two circles are equal to each other
	public boolean equals(Circle anotherCircle) {
		boolean equals = false;
		if (Math.abs(this.x- anotherCircle.getX()) <= THRESHOLD && Math.abs(this.y- anotherCircle.getY()) <= THRESHOLD && Math.abs(this.radius- anotherCircle.getRadius()) <= THRESHOLD) {
			equals = true;
		}
		return equals;



	}
	//Distance uses the distance formula to find the difference between the centers of the circles
	public double distance(Circle anotherCircle) {
		double distance;
		double distanceX= this.x - anotherCircle.getX();
		double distanceY= this.y - anotherCircle.getY();
		distance = Math.sqrt(Math.pow(distanceX,2)+Math.pow(distanceY,2));
		return distance;	
	}
	//isSmaller checks to see if the circle it is being compared to is larger or smaller
	public boolean isSmaller(Circle anotherCircle) {
		boolean smaller= false;
		if (this.diameter() < anotherCircle.diameter()) {
			smaller = true;
		}
		return smaller;
	}
	//Compare to uses isSmaller and equals methods to get an int based upon if the circle is smaller, larger, or equal size.
	public int compareTo (Circle anotherCircle) {
		int compare =1;
		if (this.isSmaller(anotherCircle)) {
			compare=-1;
		}else if(this.equals(anotherCircle)) {
			compare=0;
		}
		return compare;
	}
	//Intersects checks to see if the circles intersects by comparing distance to radius
	public boolean intersects(Circle anotherCircle) {
		boolean intersects = false;
		if (this.radius + anotherCircle.getRadius()>=this.distance(anotherCircle)) {
			intersects= true;
		}
		return intersects;	
	}
}

