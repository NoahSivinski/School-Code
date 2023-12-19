//*******************************************************
// Circle.java
//
// 
//*******************************************************
/*
 *Circle.java\
 * Author: Cole Wright 
 * Submission Date:  4/2/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *This code works with the Circle Tester to create circles and describe their aspects given the radius, x, 
 *y, etc. input. This code contains many tests to compare the two circles
 *made. The Circle Tester tests these formulas to ensure they are giving the correct output.
 * The use of multiple classes and methods is needed many times throughout this code.
 *Object oriented programminmg abilities of the coder are tested and must be used to get the correct code. 
 *Variables, classes,objects, and methods are needed for these codes.
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
		if (radius > THRESHOLD)
			this.radius = radius;

	}

	public double area() {
		return Math.PI * getRadius() * getRadius();

	}

	public double perimeter() {
		return Math.PI * 2 * getRadius();

	}

	public double diameter() {
		return getRadius() * 2;
		
	}

	public boolean isUnitCircle() {
		if ((Math.abs(radius - 1) < THRESHOLD) && Math.abs(x) < THRESHOLD && Math.abs(y) < THRESHOLD) {
			return true;
		} else {
			return false;

		}
	}

	public String toString() {
		return "name: " + name + "\n center: " + "(" + getX() + "," + getY() + ")" + "\n radius: " + getRadius();
	}

	public boolean equals(Circle anotherCircle) {
		if ((radius - anotherCircle.radius) < THRESHOLD && (x - anotherCircle.x) < THRESHOLD
				&& (y - anotherCircle.y) < THRESHOLD && (anotherCircle.radius - radius) < THRESHOLD
				&& (anotherCircle.x - x) < THRESHOLD && (anotherCircle.y - y) < THRESHOLD) {
			return true;
		} else {
			return false;
		}

	}

	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(x - anotherCircle.x, 2) + Math.pow(y - anotherCircle.y, 2));

	}

	public boolean isSmaller(Circle anotherCircle) {
		if (diameter() < anotherCircle.diameter()) {
			return true;

		}
		return false;
	}

	public int compareTo(Circle anotherCircle) {
		if (diameter() < anotherCircle.diameter()) {
			return -1;
		} else if (diameter() > anotherCircle.diameter()) {
			return 1;
		} else {
			return 0;
		}
	}

	public boolean intersects(Circle anotherCircle) {
		if (distance(anotherCircle) < (radius + anotherCircle.radius)) {
			return true;
		} else {
			return false;
		}

	}
}
