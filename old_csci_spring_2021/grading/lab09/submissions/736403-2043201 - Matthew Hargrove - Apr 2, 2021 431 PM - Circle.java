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
		
		name=newName;	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newX) {
		
		x=newX;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {
		
		y=newY;	
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRadius) {
		if (newRadius>0) {
			radius=newRadius;
		}
				
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		double area= Math.PI*(radius*radius);
		return area;
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
			double perimeter= 2*Math.PI*radius;
			return perimeter;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		double diameter= 2*radius;	
		return diameter;
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		if (((radius-1.0)<THRESHOLD)&&((x-0.0)<THRESHOLD)&&((y-0.0)<THRESHOLD)) {
			return true;
		}
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
	public String toString(Circle circle){
		return "name: " + circle.getName() + "\ncenter: (" + circle.getX() +"," + circle.getY() + ")" + "\nradius: " + circle.getRadius();
	}

	public boolean equals(Circle anotherCircle){
		if (((anotherCircle.getRadius() - radius) < THRESHOLD)&&((anotherCircle.getX()-x)<THRESHOLD)&&((anotherCircle.getY()-y)<THRESHOLD))
			return true;
		else
			return false;
	}
	public double distance(Circle anotherCircle){
		return Math.sqrt(Math.pow((x-anotherCircle.getX()), 2.0) +
				Math.pow((y-anotherCircle.getY()), 2.0));
	}
	
	public boolean isSmaller(Circle anotherCircle){
		if (anotherCircle.diameter() > this.diameter()) 
			return true;
		else 
			return false;
	}
	
	public int compareTo(Circle anotherCircle){
		if (anotherCircle.diameter() < this.diameter()) 
			return 1;
		else if (anotherCircle.diameter() > this.diameter()) 
			return -1;
		else 
			return 0;
	}
	
	public boolean intersects(Circle anotherCircle){
		if ((anotherCircle.getRadius() + radius) >this.distance(anotherCircle)) 
			return true;
		else 
			return false; 
	}
}
