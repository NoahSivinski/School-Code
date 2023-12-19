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
		System.out.println(("name: " + circle1.getName())+("\ncenter: (" + circle1.getX() + ", " + circle1.getY() + ")") + ("\nradius: " + circle1.getRadius()));
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println(("name: " + circle2.getName())+("\ncenter: (" + circle2.getX() + ", " + circle2.getY() + ")") + ("\nradius: " + circle2.getRadius()));
		// print circle1 diameter, area and perimeter
		System.out.println(("diameter: " + circle1.diameter())+("\narea: " + circle1.area()) + ("\nperimeter: " + circle1.perimeter()));
		// print circle2 diameter, area and perimeter
		System.out.println(("diameter: " + circle2.diameter())+("\narea: " + circle2.area()) + ("\nperimeter: " + circle2.perimeter()));
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is a unit circle: " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is a unit circle: " + circle2.isUnitCircle());
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
				
	}
	
}
