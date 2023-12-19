/*
 * [Circle].java
 * Author:  [Stephanie Ibarra] 
 * Submission Date:  [04/02/2021]
 *
 * Purpose: This is a component part of an overall greater
 * program used to check different variables and comparing circles.
 * Each component is independent of each other, but interact together
 * in order to receive a desired result. In this case it is the 
 * specifics of two circles, the area, radius, center, along with
 * comparing the two circles by seeing which is bigger or the distance 
 * between the two and much more.
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
public class Circle {

	//*******************************************************
	// Circle.java
	//
	// 
	//*******************************************************

	public String name;    // declare the private String instance  name
	public double radius;       // declare the private double instance  radius
	public double x;       // declare the private double instance  x
	public double y;       // declare the private double instance  y

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
	public void setName(String name) {

		this.name = name;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {

		this.x = x;	
	}

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {

		this.y = y;
	}


	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {

		if(radius>THRESHOLD) 
			this.radius = radius;
	}

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {

		return Math.PI*radius*radius;  	
	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {

		return 2*Math.PI*radius; // or radius	
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

		return (this.radius==1.0 &&(this.x==0 && this.y==0.0))?true:false;
	}


	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {

		return
				"center: " +x+ "," +y+ ")" +"\nradius:" + radius;
		//"name: " + name + "\n" + "center: " + "(" + getX() +"," + getY() +")" + "\n" + "radius: "+ getRadius();

	}




	public boolean equals(Circle anotherCircle) {
		if (radius == anotherCircle.radius && x == anotherCircle.x && y == anotherCircle.y) {
			return true;
		} else {
			return false;
		}
	}

	public double distance(Circle anotherCircle) {
		double dist = Math.sqrt(Math.pow(x - anotherCircle.x, 2) + Math.pow(y - anotherCircle.y, 2));
		return (dist);
	}

	public boolean isSmaller(Circle anotherCircle){

		return (diameter()< anotherCircle.diameter())?false:true;
	}

	public int compareTo(Circle anotherCircle) {
		if(this.getRadius()<anotherCircle.getRadius())
			return -1;
		else if (this.getRadius()>anotherCircle.getRadius())
			return 1;
		else
			return 0;
	}
	public boolean intersects(Circle anotherCircle) {
		double dist = distance(anotherCircle);
		if (dist < (radius + anotherCircle.radius)) {
			return true;
		} else {
			return false;

		}	
	}
}