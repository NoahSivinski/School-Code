//*******************************************************
// Circle.java
//
// 
//*******************************************************

public class Circle {
	
	private String name;       // declare the private String instance  name
	private double radius;       // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;       // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {
		
		return name;
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		
		return x;
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		
		return y;
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		
		return radius;	
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String newName) {
		
		name = newName;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newX) {
		
		x = newX;	
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {
		
		y = newY;	
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRadius) {
		if(newRadius > 0) {
			radius = newRadius;
		}
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		double area = (Math.PI * (getRadius() * getRadius()));
		return area;
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		double perimeter = 2 * Math.PI * getRadius();
		return perimeter;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		double diameter = getRadius() * 2;
		return diameter;
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		if((Math.abs(getX()-0) < THRESHOLD)&&(Math.abs(getY()-0) < THRESHOLD)&&(Math.abs(getRadius()-1) < THRESHOLD)) {
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
		
		return ("name: " + getName())+("\ncenter: (" + getX() + ", " + getY() + ")")+("\nradius: " + getRadius());
	}
	
	public boolean equals(Circle anotherCircle) {
		
		if((Math.abs(this.getX() - anotherCircle.getX()) < THRESHOLD)&&(Math.abs(this.getY() - anotherCircle.getY()) < THRESHOLD)&&(Math.abs(this.getRadius() - anotherCircle.getRadius()) < THRESHOLD)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double distance(Circle anotherCircle) {
		
		double distance = Math.sqrt(Math.pow((this.getX() - anotherCircle.getX()), 2)) + (Math.pow((this.getY() - anotherCircle.getY()), 2));
		return distance;
	}
	
	public boolean isSmaller(Circle anotherCircle) {
		
		if(this.diameter() < anotherCircle.diameter()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(Circle anotherCircle) {
		
		if(anotherCircle.isSmaller(this)) {
			return 1;
		}
		else if(this.isSmaller(anotherCircle)) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public boolean intersects(Circle anotherCircle) {
		
		if(this.distance(anotherCircle) < (this.getRadius() + anotherCircle.getRadius())) {
			return true;
		}
		else {
			return false;
		}
	}
}
