/*
 * [Circle].java
 * Author:  [Shovek Basu] 
 * Submission Date:  [4/2/21]
 *
 * Purpose: circle
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
	
	private String name;   // declare the private String instance  name
	private double radius; // declare the private double instance  radius
	private double x;      // declare the private double instance  x
	private double y;      // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {
		
		// Your code goes here	
		return name;
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		
		// Your code goes here	
		return x;
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		
		// Your code goes here	
		return y;
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		
		// Your code goes here	
		return radius;
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String name) {
		
		// Your code goes here	
		this.name = name;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {
		
		// Your code goes here	
		this.x = x;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		
		// Your code goes here	
		this.y = y;
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		
		// Your code goes here	
		 if(radius>0.0)
		 this.radius = radius;
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		// Your code goes here
		return Math.PI * radius * radius;
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		// Your code goes here	
		return 2 * Math.PI * radius;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		// Your code goes here
		return  Math.abs(2 * radius);
		
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		// Your code goes here	
		 if (radius == 1 && x == 0 && y == 0)
	        return true;
	     else
	        return false;
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		
		// Your code goes here	
		  return "center:(" + x + "," + y + ")\nradius :" + radius;
	}
	
	public boolean equals(Circle anotherCircle) {
		if ( (Math.abs(this.radius - anotherCircle.radius) < THRESHOLD) && (Math.abs(this.x - anotherCircle.x) < THRESHOLD) 
				&& (Math.abs(this.y - anotherCircle.y) < THRESHOLD) ) {

			return true;
		}
		else
			return false;
	}
	
	public double distance(Circle anotherCircle) {
	
		return Math.sqrt( Math.pow (( this.x - anotherCircle.x) , 2 ) + Math.pow( (this.y - anotherCircle.y) , 2));
	}
	
	public boolean isSmaller(Circle anotherCircle) {
		if ( ((2 * this.radius) - (2 * anotherCircle.radius)) < THRESHOLD )  {

			return true;
		}
		else
			return false;
	}
	public int compareTo(Circle anotherCircle) {
		if (this.equals(anotherCircle)) {
			
			return 0;
		}
		else if (anotherCircle.isSmaller(this)) {
			return 1;
		}
		else if(this.isSmaller(anotherCircle)) { //this.isSmaller(anotherCircle)
			return -1;
		}
			return 0;
		
	}
	
	public boolean intersects(Circle anotherCircle) {
		if (distance(this) < (this.radius + anotherCircle.radius)) {
			return true;
		}
		else
			return false;
		
	}
	
	
}
