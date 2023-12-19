/*
 * Circle.java
 * Author:  Nazha Erakat
 * Submission Date:  4/2/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program uses a circle class to calculate and compare the area, distance, diameter, etc of two circles. 
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

import java.lang.Math;

public class Circle {

	private String name; // declare the private String instance name
	private double radius; // declare the private double instance radius
	private double x; // declare the private double instance x
	private double y; // declare the private double instance y

	// Used to compare doubles. Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	public String getName() {
		return name;

	}

	public double getX() {
		return x;
	}

	public double getY() {

		return y;
	}

	public double getRadius() {

		return radius;
	}

	public void setName(String newName) {

		name = newName;

	}

	public void setX(double newX) {

		x = newX;
	}

	public void setY(double newY) {

		y = newY;
	}

	public void setRadius(double newRadius) {

		if (newRadius >= 0)
			radius = newRadius;
		else {
			radius = radius;
		}

	}

	public double getArea() {

		double area = (radius * radius) * Math.PI;
		return area;
	}

	public double getPerimeter() {

		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	public double getDiameter() {
		double diameter = radius * 2;
		return diameter;
	}

	public boolean isUnitCircle() {
		boolean valid = false;

		if ((Math.abs(radius - 1) < THRESHOLD) && (Math.abs(x - 0) < THRESHOLD) && (Math.abs(y - 0) < THRESHOLD)) {

			valid = true;
		}

		else {
			valid = false;
		}
		return valid;
	}

	public String toString() {

		return ("name: " + this.name + "\ncenter: " + "(" + this.x + "," + this.y + ")" + "\nradius: " + this.radius);

	}

	public boolean equals(Circle anotherCircle) {

		if ((getRadius() - anotherCircle.getRadius() < THRESHOLD && getX() - anotherCircle.getX() < THRESHOLD && getY() - anotherCircle.getY() < THRESHOLD)) {
			return true;
		} else {
			return false;
		}
	}

	public double distance(Circle anotherCircle) {

		double distance = Math.sqrt((Math.pow(getX() - anotherCircle.getX(), 2) + Math.pow(getY() - anotherCircle.getY(), 2)));

		return distance;

	}

	public boolean isSmaller(Circle anotherCircle) {
		if (this.getDiameter() < anotherCircle.getDiameter()) {
			return true; 
		}
		else {
			return false;
		}
		
	}

	public int compareTo(Circle anotherCircle) {
		if (this.compareTo(anotherCircle) > anotherCircle.compareTo(this)) {
			return 1;
		} else if (this.isSmaller(anotherCircle)) {
			return -1;
		} else {
			return 0;
		}
	}

	public boolean intersects(Circle anotherCircle) {
		boolean intersects = false;
		if (this.distance(anotherCircle) < (this.radius + anotherCircle.radius))
		{
			intersects = true;
		}
		else if (this.distance(anotherCircle) > (this.radius + anotherCircle.radius))
		{
			intersects = false; 
		}
		return intersects;
	}
	
	}

