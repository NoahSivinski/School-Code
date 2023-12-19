/*
 * Circle.java
 * Author:  Joshua Wyatt 
 * Submission Date:  4/2/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program takes the program written out depending on values
 * entered by the one editing the program and runs it, outputing
 * the diameter, area, perimeter, radius, etc. Once it is entered
 * and changed by the editing of code, the program runs with some
 * outputs being true and false.
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
	public static void main (String[]args){
//		System.out.println("hello");
	}
	
// 	declare the private String instance  name
	private String name;
	
// 	declare the private double instance  radius
	private double radius;
	
// 	declare the private double instance  x
	private double x;
	
// 	declare the private double instance  y
	private double y;

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {
		
		return this.name;
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		
		return this.x;
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
	
		return this.y;
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		
		return this.radius;
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
		if (radius<0)
			return;
		this.radius = radius;	
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		return Math.PI*getRadius()*getRadius();	
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		return Math.PI*getRadius()*2;	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		return getRadius()*2;
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		
		if(Math.abs(getRadius()-1.0)<THRESHOLD && Math.abs(getX()-0.0)<THRESHOLD && Math.abs(getY()-0.0)<THRESHOLD) {
			return true;
		}
		return false;
	}
	public boolean equals(Circle anotherCircle) {
		
		if(Math.abs(getRadius()-anotherCircle.getRadius())<THRESHOLD){
			if(Math.abs(getX()-anotherCircle.getX())<THRESHOLD){
				if(Math.abs(getY()-anotherCircle.getY())<THRESHOLD){
					return true;
				}
			}
			
		}
		return false;
	}
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(getX()-anotherCircle.getX(),2)+ Math.pow(getY()-anotherCircle.getY(),2));

	}
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		
		return "name: "+String.valueOf(getName())+"\ncenter:("+String.valueOf(getX())+','+String.valueOf(getY())+")\nradius: "+String.valueOf(getRadius());
	}
	public boolean isSmaller(Circle anotherCircle) {
		return this.diameter()<anotherCircle.diameter();
	}
	public int compareTo(Circle anotherCircle) {
		if(this.diameter() == anotherCircle.diameter()){
			return 0;
		}

		if (this.isSmaller(anotherCircle)){
			return 1;
		}
		return -1;
	}
	public boolean intersects(Circle anotherCircle) {
		if(this.distance(anotherCircle)<(this.getRadius()+anotherCircle.getRadius())){
			return true;
		}
		return false;
		
	}

}