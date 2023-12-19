
public class Circle {
	
	private String name;       // declare the private String instance  name
	private double radius;      // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;      // declare the private double instance  y
	
	
	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {
		
		return name;   // Your code goes here	
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		
		return x;  // Your code goes here	
	}
	

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		
		return y;  // Your code goes here	
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		
		return radius;  // Your code goes here	
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String name) {
		
		this.name = name;   // Your code goes here	
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) {
		
		this.x = x; 	// Your code goes here	
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) {
		
		this.y = y; // Your code goes here	
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius)  {
		
			if (radius >= 0)   // Your code goes here	
			{
				this.radius = radius;
			}
	}
	
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		double area = Math.PI * (radius*radius);
		return area;// Your code goes here	
	}
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		double perimeter = 2 * Math.PI * radius;
		return perimeter;// Your code goes here	
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		double diameter = radius * 2;
		return diameter;	// Your code goes here	
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		if ((Math.abs(radius - 1) < THRESHOLD) && (Math.abs(x - 0) < THRESHOLD) && (Math.abs(y - 0) < THRESHOLD))
		{
			System.out.println("Unit circle");
			return true;
		}
		else
		{
			System.out.println("Not a unit circle.");
			return false;
		}  // Your code goes here	
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		
		return "name: " + name + "\ncenter: " + "(" + x + "," + y + ")" + "\nradius: " + radius;// Your code goes here	
	}
	public boolean equals(Circle anotherCircle)
	{
		if (Math.abs((this.getRadius() - anotherCircle.getRadius())) < THRESHOLD && Math.abs(this.getX() - anotherCircle.getX()) < THRESHOLD && Math.abs(this.getY() - anotherCircle.getY()) < THRESHOLD)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public double distance(Circle anotherCircle)
	{
		double part1 = Math.pow(x - anotherCircle.getX(), 2);
		double part2 = Math.pow(y - anotherCircle.getY(), 2);
		double result = part1 + part2;
		return result = Math.sqrt(result);
	}
	
	public boolean isSmaller(Circle anotherCircle)
	{
		if ((this.diameter() - anotherCircle.diameter()) < 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int compareTo(Circle anotherCircle)
	{
		if ((this.diameter() - anotherCircle.diameter()) < 0)
		{
			return -1;
		}
		if ((this.diameter() - anotherCircle.diameter()) > 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public boolean intersects(Circle anotherCircle)
	{
		if (this.distance(anotherCircle) < this.getRadius() + anotherCircle.getRadius())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	

}



