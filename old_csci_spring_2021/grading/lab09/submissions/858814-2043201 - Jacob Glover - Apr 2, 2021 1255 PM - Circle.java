//*******************************************************
// Circle.java
//
// 
//*******************************************************
public class Circle {
	
	private String name;    // declare the private String instance  name
	private double radius;    // declare the private double instance  radius
	private double x;    // declare the private double instance  x
	private double y;    // declare the private double instance  y

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
	public void setName(String name) {
		this.name = name;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {
		this.x = x;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		this.y = y;
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) {
		
		if (radius >= 0) {
		this.radius = radius;
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
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
		
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		double diameter = radius * 2;
		return diameter;
		
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		if ((radius == 1) && (x == 0) && (y == 0)) return true;
		else return false;
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		return "\nname: " + name + "\ncenter:(" + x + ", " + y + ")" + "\nradius: " + radius;
		
	}

	public boolean equals(Circle anotherCircle) {
		double center = x + y;
		if ((Math.abs(center - (anotherCircle.x + anotherCircle.y)) < THRESHOLD ) && (Math.abs(radius - anotherCircle.radius) < THRESHOLD)) {
			return true;
		} else return false;
	} 
	public double distance (Circle anotherCircle) {
		double distance = Math.sqrt(Math.pow(anotherCircle.x - x, 2) + (Math.pow(anotherCircle.y - y, 2)));
				
		return distance;
	}
	public boolean isSmaller(Circle anotherCircle) {
		if (diameter() < anotherCircle.diameter()) {
			return true;
		} else return false;
	}
	public int compareTo(Circle anotherCircle) { // fix
		if ((isSmaller(anotherCircle) == false) && !(Math.abs(diameter() - anotherCircle.diameter()) < THRESHOLD)) {
			return 1;
		} else if (isSmaller(anotherCircle) == true) {
			return -1;
		} else return 0;
	}
	public boolean intersects (Circle anotherCircle) {
		if (distance(anotherCircle) < (radius + anotherCircle.radius)) {
			return true;
		} else return false;
	}
}