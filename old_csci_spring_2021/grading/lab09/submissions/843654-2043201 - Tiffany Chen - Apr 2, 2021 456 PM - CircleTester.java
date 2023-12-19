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
		System.out.println("circle1 characteristics are:\n" + circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2 characteristics are:\n" + circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("circle1=");
		System.out.println("diameter: " + circle1.diameter());
      	System.out.println("area: " + circle1.area());
      	System.out.println("perimeter: " + circle1.perimeter());
      	
		// print circle2 diameter, area and perimeter
      	System.out.println("circle2=");
      	System.out.println("diameter: " + circle2.diameter());
		System.out.println("area: " + circle2.area());
		System.out.println("perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println("Is circle1 a unit circle? ");
		circle1.isUnitCircle();
		
		// display whether circle2 is a unit circle
		System.out.println("Is circle2 a unit circle? ");
		circle2.isUnitCircle();
	
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
						
		//circle3 for the third test
		Circle circle3 = new Circle();
		Circle secondUnit = new Circle();
		Circle unit = new Circle();
		secondUnit.setName("unit 2");
		secondUnit.setX(0);
		secondUnit.setY(0);
		secondUnit.setRadius(1);
		unit.setName("unit circle");
		unit.setX(0);
		unit.setY(0);
		unit.setRadius(1);
	
		circle1.setX(2.0);
		circle2.setX(0);
		circle3.setX(3.0);
		circle1.setY(4.0);
		circle2.setY(-3);
		circle3.setY(0);
		circle3.setRadius(6);
		circle3.area();
		circle3.perimeter();
		circle3.diameter();
		
		
		//testing equals method
		System.out.println("EQUALS TESTS");
		//1
		if(circle1.equals(circle2) == false)
		{
			System.out.println("test 1 passed");
		}
		//2
		if(circle1.equals(circle3) == false)
		{
			System.out.println("test 2 passed");
		}
		//3
		if(unit.equals(secondUnit) == true)
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing distance method
		System.out.println("DISTANCE TESTS");
		//1
		if (unit.distance(secondUnit) == 0)
		{
			System.out.println("test 1 passed");
		}
		//2
		if (circle2.distance(circle3) == Math.sqrt(18))
		{
			System.out.println("test 2 passed");
		}
		//3
		if (circle1.distance(circle3) == Math.sqrt(17))
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing isSmaller method
		System.out.println("ISSMALLER TESTS");
		//1
		if (unit.isSmaller(secondUnit) == false)
		{
			System.out.println("test 1 passed");
		}
		//2
		if (circle2.isSmaller(circle3) == true)
		{
			System.out.println("test 2 passed");
		}
		//3
		if (circle3.isSmaller(circle1) == false)
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing compareTo method
		System.out.println("COMPARETO TESTS");
		//1
		if (unit.compareTo(secondUnit) == 0)
		{
			System.out.println("test 1 passed");
		}
		//2
		if (circle2.compareTo(circle3) == -1)
		{
			System.out.println("test 2 passed");
		}
		//3
		if (circle3.compareTo(circle2) == 1)
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing intersects method
		System.out.println("INTERSECTS TESTS");
		//1
		if (unit.intersects(secondUnit) == true)
		{
			System.out.println("test 1 passed");
		}
		//2
		if (circle2.intersects(circle3) == true)
		{
			System.out.println("test 2 passed");
		}
		//3
		if (circle1.intersects(circle3) == true)
		{
			System.out.println("test 3 passed");
		}
	}
	
}