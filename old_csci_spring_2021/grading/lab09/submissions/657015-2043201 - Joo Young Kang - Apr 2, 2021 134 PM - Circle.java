import java.util.concurrent.atomic.DoubleAccumulator;

//*******************************************************
// Circle.java
//
// 
//*******************************************************
public class Circle {
	
	private String name;
	private double radius;
	private double x;
	private double y;

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
	public void setName(String newName) {
		
		// Your code goes here
		this.name = newName;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newX) {
		
		// Your code goes here
		this.x = newX;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {
		
		// Your code goes here
		this.y = newY;
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRadius) {
		
		// Your code goes here
		if (newRadius >= 0) {
			this.radius = newRadius;
		}
		else {
			this.radius = radius;
		}
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		// Your code goes here
		return Math.PI*Math.pow(radius, 2);
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		// Your code goes here
		return 2*Math.PI*radius;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		// Your code goes here
		return 2*radius;
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		// Your code goes here
		if (Math.abs(radius-1) < THRESHOLD && Math.abs(x) < THRESHOLD && Math.abs(y) < THRESHOLD) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Question 5
	// Part A
	public boolean equals(Circle anotherCircle) {
		if (Math.abs(anotherCircle.getRadius() - radius) < THRESHOLD && Math.abs(anotherCircle.x - this.x) < THRESHOLD && Math.abs(anotherCircle.y - this.y) < THRESHOLD) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Part B
	public double distance(Circle anotherCircle) {
		double diffDistance = Math.pow(this.x - anotherCircle.getX(),2) + Math.pow(this.y - anotherCircle.getY(),2);
		return Math.sqrt(diffDistance);
	}
	
	// Part C
	public boolean isSmaller(Circle anotherCircle) {
		if (this.diameter() < anotherCircle.diameter()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Part D
	public int compareTo(Circle anotherCircle) {
		if (isSmaller(anotherCircle) == false && this.diameter() > anotherCircle.diameter()) {
			return 1;
		}
		else if (isSmaller(anotherCircle) == true) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	// Part E
	public boolean intersects(Circle anotherCircle) {
		if (distance(anotherCircle) < (this.radius + anotherCircle.getRadius())) {
			return true;
		}
		else {
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
		
		// Your code goes here
		return ("name: " + this.name + "\n"+ "center: (" + this.x + "," + this.y +")\n" + "radius: " + this.radius);
	}
}
