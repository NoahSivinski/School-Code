/*
 * CSCI1301.java
 * Author:  Brooks Ruehle 
 * Submission Date:  Oct. 29, 2021
 *
 * Purpose: This class creates a circle object and uses methods
 * that allow you to obtain certain values related to the circle and 
 * another circle object
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
	
	public static void main(String[] args) {
		
	}
	
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
			
			if(radius >= 0) {
				this.radius = radius;
			}
		}
		
		public double area() {
			
			double result = Math.PI * radius * radius;
			return result;
		}
		
		public double perimeter() {
			
			double result = 2 * Math.PI * radius;
			return result;
		}
		
		public double diameter() {
			
			double result = radius * 2;
			return result;
		}

		public boolean isUnitCircle() {
			
			boolean doesRadiusEqualOne = Math.abs(1-radius) <= THRESHOLD;
			boolean result = false;
			if(doesRadiusEqualOne) {
				if(x <= THRESHOLD && y <= THRESHOLD) {
					result = true;
					
				}
			}
			
			return result;
		}
		
		public String toString() {
			
			return "\nname: " + name + "\ncenter: (" + x + "," + y + ")\nradius: " + radius; 
		}
		
		public boolean equals(Circle anotherCircle) {
			boolean result = false;
			if(Math.abs(x- anotherCircle.getX())  <= THRESHOLD) {
				if(Math.abs(y- anotherCircle.getY())  <= THRESHOLD) {
					if(Math.abs(radius- anotherCircle.getRadius())  <= THRESHOLD) {
						result = true;
					}
				}
			}
			return result;
		}
		
		public double distance(Circle anotherCircle) {
			double x1 = x;
			double x2 = anotherCircle.getX();
			double y1 = y;
			double y2 = anotherCircle.getY();
			
			double result = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
			return result;
		}
		
		public boolean isSmaller(Circle anotherCircle) {
			boolean result = false;
			if(this.diameter() < anotherCircle.diameter()) {
				result = true;
			}
			return result;
		}
		
		public int compareTo(Circle anotherCircle) {
			int result;
			if(this.isSmaller(anotherCircle)) {
				result = -1;
			}
			else if(Math.abs(this.radius - anotherCircle.radius) <= THRESHOLD) {
				result = 0;
			}
			else {
				result = 1;
			}
			return result;
		
		}
		
		public boolean intersects(Circle anotherCircle) {
			boolean result = false;
			
			if(this.distance(anotherCircle) < this.radius + anotherCircle.radius) {
				result = true;
			}
			return result;

	}

}
