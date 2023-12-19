/*
 * Circle.java
 * Author:  Gage Roney 
 * Submission Date:  4/2/2021
 *
 * Purpose: The purpose of this program is to allow for the user to use methods that will display certain values for two different circles. 
 * These different circles will be manipulated throughout the program and the program will run a series of tests to see if certain values of 
 * the circles are correct or false.
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
public class Circle { // public class named circle that holds all the methods
	// Instance variables made to be private so that they are only used in this
	// class
	private String name;
	private double radius;
	private double x;
	private double y;

	// Used to compare doubles. Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001; // number so close to 0 so when comparing minute numbers it will
														// still hold true

	// ----------------------------------------------
	// getName - returns the value of name
	// ----------------------------------------------
	public String getName() { // Method that returns a valume of the String name
		return name;

	}

	// ----------------------------------------------
	// getX - returns the value of x
	// ----------------------------------------------
	public double getX() {
		return this.x;

	}

	// ----------------------------------------------
	// getY - returns the value of y
	// ----------------------------------------------
	public double getY() {
		return this.y;
	}

	// ----------------------------------------------
	// getRadius - returns the value of radius
	// ----------------------------------------------
	public double getRadius() {
		return this.radius;
	}

	// ----------------------------------------------
	// setName - assigns a new value to name
	// ----------------------------------------------
	public void setName(String name) { // Method that allows the user to set a value to the String name
		this.name = name;
	}

	// ----------------------------------------------
	// setX - assigns a new value to x
	// ----------------------------------------------
	public void setX(double x) {// Method that allows the user to set a value to the x value in the center of
								// the circle coordinate
		this.x = x;

	}

	// ----------------------------------------------
	// setY - assigns a new value to y
	// ----------------------------------------------
	public void setY(double y) {// Method that allows the user to set a value to the y value in the center of
								// the circle coordinate
		this.y = y;
	}

	// ----------------------------------------------
	// setRadius - assigns a new value to radius
	// ----------------------------------------------
	public void setRadius(double radius) { // Method that allows the user to set a value to the radius
		if (radius > 0) { // a radius is only valid if it is greater than 0, if not the original radius
							// will be returned
			this.radius = radius;
		}
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() { // Method that calculates the area for a certain circle
		double area = (radius * radius) * Math.PI; // Uses the constant PI from the class Math
		return area; // returns the area as a double value
	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() { // Method that calculates the perimeter for a certain circle
		double perimeter = (2 * Math.PI) * radius; // Uses the constant PI from the class Math
		return perimeter; // returns the perimeter as a double value

	}

	// --------------------------------------------------------
	// diameter - calculates the diameter of the circle
	// --------------------------------------------------------
	public double diameter() { // Method calculates the diameter of a circle using radius value
		double diameter = radius * 2;
		return diameter; // returns the diameter as a double value

	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() { // Method to see if the circle is a unit circle or not, if true the center has
									// to be at the origin (0,0)
									// and radius must be 1
		if (Math.abs(radius - 1) < THRESHOLD && Math.abs(x - 0) < THRESHOLD && Math.abs(y - 0) < THRESHOLD) {
			return true; // Calculates to see if the circle is a unit circle or not using THRESHOLD
							// constant variable
							// returns a boolean value of true
		} else {
			return false; // returns a boolean value of false if the if statement is not true

		}
	}

	// --------------------------------------------------------
	// toString - return a String representation of
	// this circle in the following format:
	// name: name
	// center:(x,y)
	// radius: r
	// --------------------------------------------------------
	public String toString() { // Method to display a blueprint of the values the user might want displayed
								// that have been calculated so far
		System.out.println("name: " + name); // Series of print statements to display the values to screen
		System.out.println("center: " + "(" + x + "," + y + ")");
		System.out.println("radius: " + radius);
		return name; // Returns the value of name as a String

	}

	public boolean equals(Circle anotherCircle) { // Method to see if a circle equals another circle
		if (Math.abs(getRadius() - anotherCircle.getRadius()) < THRESHOLD
				&& (Math.abs(getX() - anotherCircle.getX()) < THRESHOLD
						&& (Math.abs(getY() - anotherCircle.getY()) < THRESHOLD))) {
			return true; // Returns a boolean value if the calculation in the if statement is true, all
							// values of
		} else // radius, x-values, and y-values must be the exact same
			return false; // Returns a boolean value of false else the if statement not hold true
	}

	public double distance(Circle anotherCircle) { // Method that calculates the distance of the center points of two
													// circles, uses Math class to use square root and powers
		double distance = Math
				.sqrt((Math.pow(getX() - anotherCircle.getX(), 2.0) + (Math.pow(getY() - anotherCircle.getY(), 2.0))));
		return distance; // Returns the value of distance as a double
	}

	public boolean isSmaller(Circle anotherCircle) { // Method that calculates to see if the diameter of one circle is
														// smaller than another circle
		if (diameter() < anotherCircle.diameter()) {
			return true; // Returns a value of true if the if statement holds true
		} else
			return false; // Else it returns a boolean value of false
	}

	public int compareTo(Circle anotherCircle) { // Method that compares the diameters of two circles to see which
													// object is larger
		if (diameter() > anotherCircle.diameter()) {
			return 1; // Returns integer value of 1 if statement holds true, means that the object is
						// larger
		} else if (diameter() < anotherCircle.diameter()) {
			return -1;// Returns integer value of -1 if statement holds true, means that the object is
						// smaller
		} else {
			return 0;// Returns integer value of 0 if statement holds true, means that the object is
						// the same size relatively
		}
	}

	public boolean intersects(Circle anotherCircle) { // Method that checks to see if the circles intersect anywhere
		if (distance(anotherCircle) < (getRadius() + anotherCircle.getRadius())) {
			return true; // Returns a boolean value of true if the circle intersects
		} else {
			return false; // Else it returns a boolean value of false
		}

	}

}
	
	
	
