/*
 * Circle.java
 * Author:  Reid Cogswell 
 * Submission Date:  04-02-2021
 *
 * Purpose: Allows the user to input dimensions and then creates a circle using them.
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
import java.util.Scanner;
public class Circle {

	private String name;    
	private double radius;  
	private double x;      	
	private double y;      	

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

	public void setName(String name) {
		this.name = name;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setRadius(double radius) {
		this.radius = radius;
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
		if (this.radius == 1 && x == 0 && y == 0)
		{
			return true;
		}
		else 
			return false;
	}

	public String toString() {
		String center = "("+this.x+", "+this.y+")";
		String output = "name: " + this.name + "\n" + "center: " + center + "\n" + "radius: " + this.radius + "\n";
		return output;
	}

	public boolean equals(Circle anotherCircle)
	{
		if(this.radius == anotherCircle.radius && this.x == anotherCircle.x && this.y == anotherCircle.y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isSmaller(Circle anotherCircle)
	{
		if(this.x == anotherCircle.x && this.y == anotherCircle.y && this.radius != anotherCircle.radius)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public double distance(Circle anotherCircle)
	{
		double distance = Math.sqrt((this.x - anotherCircle.x) * (this.x - anotherCircle.x) +
				(this.y - anotherCircle.y) * (this.y - anotherCircle.y));
		return distance;
	}

	public boolean intersects(Circle anotherCircle)
	{
		if(this.distance(anotherCircle) < (this.radius + anotherCircle.radius))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int compareTo(Circle circle2) {
		return 0;
	}
}
