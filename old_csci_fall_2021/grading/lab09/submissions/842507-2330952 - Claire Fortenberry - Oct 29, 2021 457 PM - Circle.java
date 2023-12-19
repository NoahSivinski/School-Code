//*******************************************************
// Circle.java
//
// 
//*******************************************************
import java.lang.Math;
public class Circle {
	
	private String name;	// declare the private String instance  name
	private double radius;	// declare the private double instance  radius
	private double x;		// declare the private double instance  x
	private double y;		// declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {
		return this.name;	
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		return this.x;	
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		return this.y;	
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		return this.radius;	
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String newName) {
		this.name = newName;	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newX) {
		this.x = newX;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {
		this.y = newY;	
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRadius) {
		if (newRadius > THRESHOLD) {
			this.radius = newRadius;
		}
		
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		double area = Math.PI * (radius * radius);
		return area;
	
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		double perimeter = Math.PI * 2 * radius;
		return perimeter;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		double diameter = 2 * radius;
		return diameter;
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if (Math.abs(this.radius - 1) < THRESHOLD && Math.abs(x-0) < THRESHOLD && Math.abs(y-0) < THRESHOLD) {
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
		String nameStr = "name: " + this.name;
		String centerStr = "center: (" + this.x + "," + this.y + ")";
		String radiusStr = "radius: " + this.radius;
		
		return nameStr + "\n" + centerStr + "\n" + radiusStr;
			
	}
	
	//---------------------------------------------------------
	// equals - returns true if thisCircle and anotherCircle 
	// have the same radius and center
	//---------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		return (Math.abs(radius - anotherCircle.getRadius())) < THRESHOLD && Math.abs(x - anotherCircle.getX()) < THRESHOLD && Math.abs(y - anotherCircle.getY()) < THRESHOLD; 
		
	}
	
	//------------------------------------------------------------------------
	// distance - returns the distance between thisCircle and anotherCircle
	//------------------------------------------------------------------------
	public double distance(Circle anotherCircle) {
		double distance = Math.sqrt((Math.pow((x-anotherCircle.getX()),2) + (Math.pow((y-anotherCircle.getY()), 2))));
		return distance;
	}
	
	//---------------------------------------------------------------------------------------
	// isSmaller - returns true if the diameter of thisCircle is less than the diameter of anotherCircle
	// and returns false otherwise
	//---------------------------------------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle) {
		return (this.diameter() < anotherCircle.diameter());
	}
	
	//---------------------------------------------------------------------
	// compareTo - returns 0 if thisCircle and anotherCircle are equal,
	// returns -1 if thisCircle is smaller than anotherCircle, 
	// or returns 1 if thisCircle is larger than anotherCircle
	//---------------------------------------------------------------------
	public int compareTo(Circle anotherCircle) {
		if(this.equals(anotherCircle)) {
			return 0;
		}
		if (this.isSmaller(anotherCircle)) {
			return -1;
		}
		if (!(this.isSmaller(anotherCircle))) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	//-------------------------------------------------------------------------------------
	// intersects - returns true if thisCircle and anotherCircle have an intersecting area 
	// and returns false otherwise
	//-------------------------------------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		return (this.distance(anotherCircle) < (this.getRadius() + anotherCircle.getRadius()));
	}

}
