/*
 * Circle.java
 * Author:  Derek Li
 * Submission Date:  10/30/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program has multiple methods dealing with
 * the creation and permutation of a circle object along with the comparison 
 * of this circle object to another.
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

public class Circle 
{
	
	private String name;       // declare the private String instance  name
	private double radius;	   // declare the private double instance  radius
	private double x;          // declare the private double instance  x
	private double y;          // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() 
	{
		return name;
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() 
	{
		return x;
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() 
	{
		return y;
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() 
	{
		return radius;
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String name) 
	{
		
		this.name = name;	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) 
	{
		this.x = x;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) 
	{
		this.y = y;
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) 
	{
		if (radius >= 0)
			this.radius = radius;
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() 
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() 
	{
		return 2 * Math.PI * radius;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() 
	{
		return radius * 2;
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() 
	{
		return (Math.abs(radius - 1) < THRESHOLD) && Math.abs(x) < THRESHOLD && Math.abs(y) < THRESHOLD;	
	}
	
	//--------------------------------------------------------
		// equals - return true if the radius and center of this 
		//			circle equals anotherCircle and false otherwise.
		//--------------------------------------------------------
	public boolean equals(Circle anotherCircle)
	{
		return (Math.abs(radius - anotherCircle.getRadius()) < THRESHOLD 
				&& Math.abs(x - anotherCircle.getX()) < THRESHOLD 
				&& Math.abs(y - anotherCircle.getY()) < THRESHOLD);
	}
	
	//--------------------------------------------------------
		// distance - returns the distance between the centers
		//			  of this circle and anotherCircle.
		//--------------------------------------------------------
	public double distance(Circle anotherCircle)
	{
		return Math.sqrt((Math.pow(x - anotherCircle.getX(), 2)) + (Math.pow(y - anotherCircle.getY(), 2)));
	}
	
	//--------------------------------------------------------
		// isSmaller - return true if the diameter of this circle
		//			   is smaller than anotherCircle and false
		//             otherwise.
		//--------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle)
	{
		return diameter() < anotherCircle.diameter();
	}
	
	//--------------------------------------------------------
			// compareTo - returns -1 if the diameter of this circle
			//			   is smaller than anotherCircle, 0 if it equals
			//			   anotherCircle, and 1 if it is larger than
			//             anotherCircle.
			//--------------------------------------------------------
	public int compareTo(Circle anotherCircle)
	{
		if (isSmaller(anotherCircle))
			return -1;
		else if (diameter() > anotherCircle.diameter())
			return 1;
		else
			return 0;
	}
	
	//--------------------------------------------------------
			// intersects - returns true if the distance between this
			//				circle and anotherCircle is smaller than
			//              the sum of both circles' radiuses and
			//              false otherwise.
			//--------------------------------------------------------
	public boolean intersects(Circle anotherCircle)
	{
		return distance(anotherCircle) < (radius + anotherCircle.getRadius());
	}

	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() 
	{
		
		String output = "name: " + name + "\n" + 
						"center: (" + x + "," + y + ")\n" + 
						"radius: " + radius;
		return output;
	}
	
}
