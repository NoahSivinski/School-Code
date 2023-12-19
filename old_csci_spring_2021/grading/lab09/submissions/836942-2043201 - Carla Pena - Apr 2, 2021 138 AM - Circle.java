/*
 * Carla Pena.java
 * Author:  Circle
 * Submission Date:  2 April 2021
 *
 * Purpose: This program introduces the concepts
 * of object orriented programming. This program
 * works by having a blueprint of how to obtain 
 * the desired results. In this case I am trying
 * to determine characteristics of a circle. 
 * I will enter known values and the code will 
 * work to give me my desired results.
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

	private String name;
	private double radius;
	private double x;
	private double y;
	
	public String getName() {
		return this.name;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setX(double newX) {
		this.x = newX;
	}
	
	public void setY(double newY) {
		this.y = newY;
	}
	
	public void setRadius(double newRadius) {
		if (newRadius > 0) {
			this.radius = newRadius;
		}
	}
	
	public double area() {
		return Math.PI * (radius * radius);
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public double diameter() {
		return 2 * radius;
	}
	
	public boolean isUnitCircle() {
		if (Double.compare(this.x, 0.0) == 0 && Double.compare(this.y, 0.0) == 0 && Double.compare(this.radius, 1.0) == 0 ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "name: " + this.name + "\n\ncenter: (" + this.x + "," + this.y + ")\n\nradius: " + this.radius;
	}
	
	public boolean equals(Circle anotherCircle) {
		if (Double.compare(this.radius, anotherCircle.getRadius()) == 0 && Double.compare(this.x, anotherCircle.getX()) == 0 && Double.compare(this.y, anotherCircle.getY()) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(this.x - anotherCircle.getX(), 2) + Math.pow(this.y - anotherCircle.getY(), 2));
	}
	
	public boolean isSmaller(Circle anotherCircle) {
		if (this.perimeter() < anotherCircle.perimeter()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(Circle anotherCircle) {
		if (!this.isSmaller(anotherCircle)) {
			return 1;
		}
		else if (this.isSmaller(anotherCircle)) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public boolean intersects(Circle anotherCircle) {
		if (this.distance(anotherCircle) < (this.radius + anotherCircle.radius)) {
			return true;
		}
		else {
			return false;
		}
	}

}
