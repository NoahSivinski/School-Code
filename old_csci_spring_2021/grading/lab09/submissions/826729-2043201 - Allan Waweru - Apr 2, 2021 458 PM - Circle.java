public class Circle {
	private String name;
	private double radius;
	private double x;
	private double y;

	public static final double THRESHOLD = 0.000000001;

	// getName returns the value of name

	public String getName() {
		return name;
	}


	// getRadius - returns the value of radius

	public double getRadius() {
		return radius;
	}


	// getX - returns the value of x

	public double getX() {
		return x;
	}

	// getY - returns the value of y

	public double getY() {
		return y;
	}


	// setName - assigns a new value to name

	public void setName(String name) {
		this.name = name;
	}


	// setRadius - assigns a new value to radius

	public void setRadius(double radius) {
		if(radius > 0){
			this.radius = radius;
		}
	}


	// setX - assigns a new value to x

	public void setX(double x) {
		this.x = x;
	}


	// setY - assigns a new value to y

	public void setY(double y) {
		this.y = y;
	}


	// area - returns the area of the circle

	public double area() {


		double area = Math.PI * (radius * radius);
		return area;

	}



	// perimeter - returns the perimeter of the circle

	public double perimeter() {

		double perimeter = Math.PI * 2.0 * radius;
		return perimeter;
	}



	// diameter - calculates the diameter of the circle

	public double diameter() {

		return 2*getRadius();
	}



	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//                    otherwise.
	
	public boolean isUnitCircle() {

		if (((radius - 1.0)<THRESHOLD) && ((x-0.0)< THRESHOLD) && ((y-0.0)<THRESHOLD)) {
			return true;
		}
		else
			return false;

	}

	public String toString() {
		return "name: " + name + "\ncenter: " + "(" + getX() +"," + getY() +")" + "\nradius: "+ getRadius();
	}

	public boolean equals(Circle anotherCircle)
	{
		if ((anotherCircle.getRadius() - radius) < THRESHOLD)
			return true;
		else
			return false;
	}

	public double distance(Circle anotherCircle)
	{
		return Math.sqrt(Math.pow((x-anotherCircle.getX()), 2.0) +
				Math.pow((y-anotherCircle.getY()), 2.0));
	}
	public boolean isSmaller(Circle anotherCircle)	{
		if (anotherCircle.diameter() >= this.diameter()) {
			return true;
		} 
		else {
			return false;
		}
	}
	public int compareTo(Circle anotherCircle)	{
		if (anotherCircle.diameter() < this.diameter()) {
			return 1;
		}
		else if (anotherCircle.diameter() > this.diameter()) {
			return -1; 
		}
		else {
			return 0;
		} 
	}
	public boolean intersects(Circle anotherCircle)	{
		if ((anotherCircle.getRadius() + radius) > this.distance(anotherCircle)) {
			return true;
		}
		else {
			return false;
		}
	}
}
