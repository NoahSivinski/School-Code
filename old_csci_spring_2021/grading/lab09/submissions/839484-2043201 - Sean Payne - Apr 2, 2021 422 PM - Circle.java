/*
 * Circle.java
 * Author:  Sean Payne 
 * Submission Date:  [04/02/21]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 				This program holds the methods which are needed for our CircleTester program.
 * Includes various methods that range from calculation to check booleans. CircleTester uses these
 * methods to helps print out our info to the console.
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
	// declared variables
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
		if (radius > THRESHOLD) {
			this.radius = radius;
		}
	}

	public double area() {
		return Math.PI * getRadius() * getRadius();
	}

	public double perimeter() {
		return 2 * Math.PI * getRadius();
	}

	public double diameter() {
		return 2 * getRadius();
	}

	public boolean isUnitCircle() {
		if (Double.compare(getX(), getY()) == 0 && getRadius() == 1) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "center: (" + x + "," + y + ")\n" + "radius: " + radius;
	}

	public boolean equals(Circle anotherCircle) {
		return ((anotherCircle.x == x) && (anotherCircle.y == y) && (anotherCircle.radius == radius));
	}
	
	// calculates distance between circles
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow((this.x - anotherCircle.x), 2) + Math.pow((this.y - anotherCircle.y), 2));
	}

	// determines if select circle is smaller than other
	public boolean isSmaller(Circle anotherCircle) {
		boolean smaller;

		if (this.radius > anotherCircle.radius) {
			smaller = false;
		} else {
			smaller = true;
		}
		return smaller;
	}

	public int compareTo(Circle anotherCircle) {
		if (this.radius > anotherCircle.radius) {
			return 1;
		} else if (this.radius < anotherCircle.radius) {
			return -1;
		} else {
			return 0;
		}
	}

	// checks if circles intersect
	public boolean intersects(Circle anotherCircle) {
		boolean intersects = false;
		double radiusSum = radius + anotherCircle.radius;
		double distanceBetweenCenters = distance(anotherCircle);
		if (distanceBetweenCenters < radiusSum) {
			intersects = true;
		} else {
			intersects = false;
		}
		return intersects;
	}
}
