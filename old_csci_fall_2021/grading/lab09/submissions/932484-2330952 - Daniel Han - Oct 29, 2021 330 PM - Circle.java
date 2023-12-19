/*
 * [Circle].java
 * Author:  [Daniel Han] 
 * Submission Date:  [10/29/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *The purpose of this class is as a class with several methods. The circle class can be instantiated and 4 private variables, which include name, x, y, and radius.
 *This class also has several methods such as mutator and accessor methods. The class Circle also has several methods that can return things like distance, area, and perimeter.
 *The program also has methods that can return boolean values as well such as whether a circle and another circle intersect each other or if a circle is smaller than another.
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
	
	private String name;      // declare the private String instance  name
	private double radius;       // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;       // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {
		//returns the name
		return name;	
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		//returns x
		return x;
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		//returns y
		return y;	
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		//returns the radius
		return radius;
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String newName) {
		//sets name to newName
		name = newName;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newX) {
		//sets x to newX
		x = newX;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {
		//sets y to newY
		y = newY;
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRadius) {
		//if the new radius is positive, the radius is set to newRadius
		if (newRadius >= 0) {
			radius = newRadius;
		}
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		//finds area using Math.PI and radius
		return (Math.PI * radius * radius);
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		//finds perimeter and returns it using Math.PI and radius
		return (Math.PI * 2 * radius);
		
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		//returns radius * 2
		return (radius * 2);
	
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		//if the radius is 1, and the coordinates are 0,0, then it will return true
		if ((Math.abs(x - 0) <= THRESHOLD) && (Math.abs(y-0) <= THRESHOLD) && (Math.abs(radius - 1) <= THRESHOLD)) {
			return true;
		}
		else {
			//else it returns false
			return false;
		}
		
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		//toString method that will print out the output
		String returnString = "name: " + name + "\ncenter: (" + x + "," + y + ")\nradius: " + radius;
		return returnString;
		
		// Your code goes here	
	}
	
	public boolean equals(Circle anotherCircle) {
		//if the radius and the coordinates of both circles are equal to each other, then returns true
		//we can't use the == method, but rather find the absolute difference of both differences and see if it less than THRESHOLD
		if (Math.abs(this.radius - anotherCircle.radius) <= THRESHOLD && (Math.abs(this.x - anotherCircle.x) <= THRESHOLD) && (Math.abs(this.y - anotherCircle.y) <= THRESHOLD)) {
			return true;
		}
		//else it returns false
		return false;
	}
	
	public double distance(Circle anotherCircle) {
		//calculated distance using the distance formula and then returns distance
		double distance;
		distance = Math.sqrt((Math.pow(this.x - anotherCircle.x, 2)) + Math.pow(this.y - anotherCircle.y, 2));
		return distance;
	}

	public boolean isSmaller (Circle anotherCircle) { 
		//if this circle's diameter is less than anotherCircle's diameter, then it will return true
		if (this.diameter() < anotherCircle.diameter()) {
			return true;
		}
		//else it will return false
		return false;
	}
	//compareTo method which returns an int number -1, 0, or 1 depending if the circle is bigger than anotherCircle or not
	public int compareTo (Circle anotherCircle) {
		//if the circle calling the method is NOT smaller and if the diameters are not equal
		if ((!this.isSmaller(anotherCircle) && !((this.radius * 2) == (anotherCircle.radius*2)))) {
			return 1;
		}
		//will return -1 if the circle calling the object is smaller and if the diameters are not equal
		if (this.isSmaller(anotherCircle) && !((this.radius*2) == (anotherCircle.radius*2))) {
			return -1;
		}
		//else, the method will return 0
		return 0;
	}
	
	public boolean intersects(Circle anotherCircle) {
		//formula for determining if a circle intersects with another
		if (this.distance(anotherCircle) < (this.radius + anotherCircle.radius)) {
			return true;
	
		}
		return false;
	}
}
