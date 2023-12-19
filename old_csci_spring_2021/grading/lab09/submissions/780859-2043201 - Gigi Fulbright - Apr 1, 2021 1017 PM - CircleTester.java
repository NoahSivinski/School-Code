//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
public class CircleTester {
	public static final double THRESHOLD = 0.000000001;

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);

		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0);

		// This is a unit test. It is best to have tests output pass or fail instead of
		// just a bunch of values.
		// Notice how the double comparison is done
		if (Math.abs(2 - circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);

		// print circle1 characteristics (center and radius), use a statement similar
		// to the previous println statements. Note that is not necessary to call
		// the method toString, why?

		System.out.println("Name=" + circle1.getName());
		System.out.println("Center=" + "(" + circle1.getX() + "," + circle1.getY() + ")");
		System.out.println("Radius=" + circle1.getRadius());
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println("Name=" + circle2.getName());
		System.out.println("Center=" + "(" + circle2.getX() + "," + circle1.getY() + ")");
		System.out.println("Radius=" + circle2.getRadius());

		// print circle1 diameter, area and perimeter
		System.out.println("Diameter=" + circle1.diameter());
		System.out.println("Area=" + circle1.area());
		System.out.println("Perimeter=" + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter=" + circle2.diameter());
		System.out.println("Area=" + circle2.area());
		System.out.println("Perimeter=" + circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Is a Unit Circle = " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Is a Unit Circle = " + circle2.isUnitCircle());

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.

		// a. equals method
		// Test case 1: The circles equal each other
		circle1.setRadius(1);
		circle1.setX(1);
		circle1.setY(1);
		circle2.setRadius(1);
		circle2.setX(1);
		circle2.setY(1);
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: Equals");
		else
			System.out.println("FAILED: Equals");
		// Test case 2: The radiuses are different
		circle1.setRadius(2);
		circle1.setX(1);
		circle1.setY(1);
		circle2.setRadius(1);
		circle2.setX(1);
		circle2.setY(1);
		if (circle1.equals(circle2) == false)
			System.out.println("PASSED: Equals");
		else
			System.out.println("FAILED: Equals");
		// Test case 3: The x values are different
		circle1.setRadius(1);
		circle1.setX(2);
		circle1.setY(1);
		circle2.setRadius(1);
		circle2.setX(1);
		circle2.setY(1);
		if (circle1.equals(circle2) == false)
			System.out.println("PASSED: Equals");
		else
			System.out.println("FAILED: Equals");
		// Test case 4: The y values are different
		circle1.setRadius(1);
		circle1.setX(1);
		circle1.setY(2);
		circle2.setRadius(1);
		circle2.setX(1);
		circle2.setY(1);
		if (circle1.equals(circle2) == false)
			System.out.println("PASSED: Equals");
		else
			System.out.println("FAILED: Equals");

		// b. distance method
		// Test case 1: Circles equal each other
		circle1.setRadius(1);
		circle1.setX(1);
		circle1.setY(1);
		circle2.setRadius(1);
		circle2.setX(1);
		circle2.setY(1);

		if ((circle1.distance(circle2) - 0) < THRESHOLD)
			System.out.println("PASSED: Distance");
		else
			System.out.println("FAILED: Distance");
		// Test case 2: Different Radius but same center
		circle1.setRadius(2);
		circle1.setX(1);
		circle1.setY(1);
		circle2.setRadius(1);
		circle2.setX(1);
		circle2.setY(1);

		if ((circle1.distance(circle2) - 0) < THRESHOLD)
			System.out.println("PASSED: Distance");
		else
			System.out.println("FAILED: Distance");

		// Test case 3: Should compute a distance of 4
		circle1.setRadius(1);
		circle1.setX(3);
		circle1.setY(3);
		circle2.setRadius(1);
		circle2.setX(1);
		circle2.setY(1);

		if ((circle1.distance(circle2) - 4) < THRESHOLD)
			System.out.println("PASSED: Distance");
		else
			System.out.println("FAILED: Distance");
		
		//c. isSmaller method
		//Test case 1: circle 1 is smaller than circle 2
		circle1.setRadius(1);
		circle1.setX(1);
		circle1.setY(1);
		circle2.setRadius(2);
		circle2.setX(1);
		circle2.setY(1);
		if ((circle1.isSmaller(circle2)) == true)
			System.out.println("PASSED: Is Smaller");
		else
			System.out.println("FAILED: Is Smaller");
		//Test case 2: circle 1 and circle 2 are the same size
		circle1.setRadius(1);
		circle1.setX(1);
		circle1.setY(1);
		circle2.setRadius(1);
		circle2.setX(1);
		circle2.setY(1);
		if ((circle1.isSmaller(circle2)) == false)
			System.out.println("PASSED: Is Smaller");
		else
			System.out.println("FAILED: Is Smaller");
		//Test case 3: circle 1 is bigger than circle 2
		circle1.setRadius(2);
		circle1.setX(1);
		circle1.setY(1);
		circle2.setRadius(2);
		circle2.setX(1);
		circle2.setY(1);
		if ((circle1.isSmaller(circle2)) == false)
			System.out.println("PASSED: Is Smaller");
		else
			System.out.println("FAILED: Is Smaller");
		
		//d. compareTo method
		//Test case 1: Circle 1 bigger than circle 2
		circle1.setRadius(2);
		circle1.setX(0);
		circle1.setY(0);
		circle2.setRadius(1);
		circle2.setX(1);
		circle2.setY(1);
		if ((circle1.compareTo(circle2) - 1) < THRESHOLD)
			System.out.println("PASSED: Compare To");
		else
			System.out.println("FAILED: Compare To");
		//Test case 2: Circle 1 smaller than circle 2
		circle1.setRadius(1);
		circle1.setX(0);
		circle1.setY(0);
		circle2.setRadius(2);
		circle2.setX(1);
		circle2.setY(1);
		if ((circle1.compareTo(circle2) + 1) < THRESHOLD)
			System.out.println("PASSED: Compare To");
		else
			System.out.println("FAILED: Compare To");
		//Test case 3: Circle 1 and circle 2 are the same size
		circle1.setRadius(1);
		circle1.setX(1);
		circle1.setY(1);
		circle2.setRadius(1);
		circle2.setX(0);
		circle2.setY(0);
		if ((circle1.compareTo(circle2) - 0) < THRESHOLD)
			System.out.println("PASSED: Compare To");
		else
			System.out.println("FAILED: Compare To");
		
		//e. intersects method
		//Test case 1: Circles do not intersect
		circle1.setRadius(1);
		circle1.setX(3);
		circle1.setY(3);
		circle2.setRadius(1);
		circle2.setX(-3);
		circle2.setY(-3);
		if ((circle1.intersects(circle2)) == false)
			System.out.println("PASSED: Intersects");
		else
			System.out.println("FAILED: Intersects");
		//Test case 2: Circles do intersect
		circle1.setRadius(3);
		circle1.setX(1);
		circle1.setY(1);
		circle2.setRadius(2);
		circle2.setX(0);
		circle2.setY(0);
		if ((circle1.intersects(circle2)) == true)
			System.out.println("PASSED: Intersects");
		else
			System.out.println("FAILED: Intersects");
		//Test case 3: Circles are equivalent
		circle1.setRadius(3);
		circle1.setX(1);
		circle1.setY(1);
		circle2.setRadius(3);
		circle2.setX(1);
		circle2.setY(1);
		if ((circle1.intersects(circle2)) == true)
			System.out.println("PASSED: Intersects");
		else
			System.out.println("FAILED: Intersects");
	}

}
