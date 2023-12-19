//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
public class CircleTester{
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
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		//Notice how the double comparison is done
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
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
		//the method toString, why?
		System.out.println("Circle1=" + circle1);
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("Circle2=" + circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter=" + circle1.diameter());
		System.out.println("Area=" + circle1.area());
		System.out.println("Perimeter=" + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter=" + circle2.diameter());
		System.out.println("Area=" + circle2.area());
		System.out.println("Perimeter=" + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println("Unit Circle1=" + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		System.out.println("Unit Circle2=" + circle2.isUnitCircle());
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		// Test Case 1
		System.out.print("\n");
		Circle circle3 = new Circle();
		circle3.setName("Circle 3");
		circle3.setX(5.0);
		circle3.setY(5.0);
		circle3.setRadius(10);
		
		Circle circle4 = new Circle();
		circle4.setName("Circle 4");
		circle4.setX(5.0);
		circle4.setY(5.0);
		circle4.setRadius(10);
		
		System.out.println("Circle 3 Diameter is: " + circle3.diameter());
		System.out.println("Circle 3 Area is: " + circle3.area());
		System.out.println("Circle 3 Perimeter is: " + circle3.perimeter());
		System.out.println("Circle 4 Diameter is: " + circle4.diameter());
		System.out.println("Circle 4 Area is: " + circle4.area());
		System.out.println("Circle 4 Perimeter is: " + circle4.perimeter());
		System.out.println("Does Circle 3 & Circle 4 have the same radius and centers?: " + circle3.equals(circle4));
		System.out.println("What is the distance between centers of Circle 3 and Circle 4?: " + circle3.distance(circle4));
		System.out.println("Is Circle 3 smaller than Circle 4?: " + circle3.isSmaller(circle4) + " and " + circle3.compareTo(circle4));
		System.out.println("Do Circle 3 and Circle 4 intersect each other?: " + circle3.intersects(circle4));
		
		// Test Case 2
		System.out.print("\n");
		Circle circle5 = new Circle();
		circle5.setName("Circle 5");
		circle5.setX(-10.0);
		circle5.setY(-5.0);
		circle5.setRadius(5);
		
		Circle circle6 = new Circle();
		circle6.setName("Circle 6");
		circle6.setX(5.0);
		circle6.setY(10.0);
		circle6.setRadius(25);
		
		System.out.println("Circle 5 Diameter is " + circle5.diameter());
		System.out.println("Circle 5 Area is " + circle5.area());
		System.out.println("Circle 5 Perimeter is " + circle5.perimeter());
		System.out.println("Circle 6 Diameter is " + circle6.diameter());
		System.out.println("Circle 6 Area is " + circle6.area());
		System.out.println("Circle 6 Perimeter is " + circle6.perimeter());
		System.out.println("Does Circle 5 & Circle 6 have the same radius and centers?: " + circle5.equals(circle6));
		System.out.println("What is the distance between centers of Circle 5 and Circle 6?: " + circle5.distance(circle6));
		System.out.println("Is Circle 5 smaller than Circle 6?: " + circle5.isSmaller(circle6) + " and " + circle5.compareTo(circle6));
		System.out.println("Do Circle 5 and Circle 6 intersect each other?: " + circle5.intersects(circle6));
		
		// Test Case 3
		System.out.print("\n");
		Circle circle7 = new Circle();
		circle7.setName("Circle 7");
		circle7.setX(3.0);
		circle7.setY(9.0);
		circle7.setRadius(12);
		
		Circle circle8 = new Circle();
		circle8.setName("Circle 8");
		circle8.setX(3.0);
		circle8.setY(9.0);
		circle8.setRadius(20);
		
		System.out.println("Circle 7 Diameter is " + circle7.diameter());
		System.out.println("Circle 7 Area is " + circle7.area());
		System.out.println("Circle 7 Perimeter is " + circle7.perimeter());
		System.out.println("Circle 8 Diameter is " + circle8.diameter());
		System.out.println("Circle 8 Area is " + circle8.area());
		System.out.println("Circle 8 Perimeter is " + circle8.perimeter());
		System.out.println("Does Circle 7 & Circle 8 have the same radius and centers?: " + circle7.equals(circle8));
		System.out.println("What is the distance between centers of Circle 7 and Circle 8?: " + circle7.distance(circle8));
		System.out.println("Is Circle 7 smaller than Circle 8?: " + circle7.isSmaller(circle8) + " and " + circle7.compareTo(circle8));
		System.out.println("Do Circle 7 and Circle 8 intersect each other?: " + circle7.intersects(circle8));
	}
	
}
