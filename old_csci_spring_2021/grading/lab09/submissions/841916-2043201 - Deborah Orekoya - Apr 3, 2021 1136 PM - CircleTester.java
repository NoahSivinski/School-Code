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
		System.out.println("circle1=" + circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2=" + circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("circle1:");
		System.out.println("diameter: "+ circle1.diameter() + ", " + " area: "+ circle1.area() + ", " + " perimeter: "+ circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("circle2:");
		System.out.println("diameter: "+ circle2.diameter() + ", " + " area: "+ circle2.area() + ", " + " perimeter: "+ circle2.perimeter());
		
		// display whether circle1 is a unit circle
		if(circle1.isUnitCircle())
			   System.out.println("Circle1 is a Unit Circle");
			else
			   System.out.println("Circle1 is not Unit Circle");

		
		// display whether circle2 is a unit circle
		if(circle1.isUnitCircle())
			   System.out.println("Circle2 is a Unit Circle");
			else
			   System.out.println("Circle2 is not Unit Circle");
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
			
		
		//test for boolean equals
		System.out.println("Test #1 for Boolean Equals");//test 1 for equals
		boolean actualEquals1 = circle1.equals(circle2);
		boolean expectedEquals1 = false;
	
		if (!actualEquals1) {
			System.out.println("PASSED: Boolean Equals Test");
		}
		else {
			System.out.println("FAILED: Boolean Equals Test");
	}
		//changed the x values of circle1 and circle2
		circle1.setX(3);
		circle2.setX(5);
		
		System.out.println("Test #2 for Boolean Equals");//test 2 for equals
		boolean actualEquals2 = circle1.equals(circle2);
		boolean expectedEquals2 = false;
		
		if (!actualEquals2) {
			System.out.println("PASSED: Boolean Equals Test");
		}
		else {
			System.out.println("FAILED: Boolean Equals Test");
	}
		//changed the y values of circle1 and circle2
		circle1.setY(2);
		circle2.setY(4);
		
		System.out.println("Test #3 for Boolean Equals");//test 3 for equals
		boolean actualEquals3 = circle1.equals(circle2);
		boolean expectedEquals3 = false;
		
		if (!actualEquals3) {
			System.out.println("PASSED: Boolean Equals Test");
		}
		else {
			System.out.println("FAILED: Boolean Equals Test");
	}
		
		//Testing for double distance
		System.out.println("Test #1 for Double Distance");//test 1 for distance
		
		double actualDistance1 = circle1.distance(circle2);
		double expectedDistance1 = 2.8284271247461903; //distance formula used 
		//circle1 x=4
		//circle1 y=2
		//circle2 x=5
		//circle2 y=4
		if(Math.abs(actualDistance1 - expectedDistance1) < THRESHOLD)
			System.out.println("PASSED: Double Distance Test");
		else
			System.out.println("FAILED: Double Distance Test");
		
		//changed the x and y values of circle1 and circle2
		circle1.setX(3);
		circle2.setY(5);
		circle1.setY(1);
		circle2.setX(4);
	
		System.out.println("Test #2 for Double Distance");//test 2 for distance
		
		double actualDistance2 = circle1.distance(circle2);
		double expectedDistance2 = 4.123105625617661; //distance formula used 
		
		if(Math.abs(actualDistance2 - expectedDistance2) < THRESHOLD)
			System.out.println("PASSED: Double Distance Test");
		else
			System.out.println("FAILED: Double Distance Test");
		
		//changed the x and y values of circle1 and circle2
		circle1.setX(1);
		circle2.setY(3);
		circle1.setY(2);
		circle2.setX(4);
		
		System.out.println("Test #3 for Double Distance");//test 3 for distance
		
		double actualDistance3 = circle1.distance(circle2);
		double expectedDistance3 = 3.1622776601683795;//distance formula used 
	
		if(Math.abs(actualDistance3 - expectedDistance3) < THRESHOLD)
			System.out.println("PASSED: Double Distance Test");
		else
			System.out.println("FAILED: Double Distance Test");
		
		
		
		//Testing boolean isSmaller
		System.out.println("Test #1 for Boolean isSmaller");//test 1 for isSmaller
		boolean actualIsSmaller1 = circle1.isSmaller(circle2);
		boolean expectedIsSmaller1 = true;

		//changed the radius values of circle1 and circle2
		circle2.setRadius(3);
		circle1.setRadius(2);
		
		if (actualIsSmaller1) {
			System.out.println("PASSED: Boolean isSmaller Test");
		}
		else {
			System.out.println("FAILED: Boolean isSmaller Test");
		}
		
		System.out.println("Test #2 for Boolean isSmaller");//test 2 for isSmaller
		boolean actualIsSmaller2 = circle1.isSmaller(circle2);
		boolean expectedIsSmaller2 = false;

		//changed the radius values of circle1 and circle2
		circle2.setRadius(2);
		circle1.setRadius(6);
		
		if (actualIsSmaller2) {
			System.out.println("PASSED: Boolean isSmaller Test");
		}
		else {
			System.out.println("FAILED: Boolean isSmaller Test");
		}	
		System.out.println("Test #3 for Boolean isSmaller");//test 3 for isSmaller
		boolean actualIsSmaller3 = circle2.isSmaller(circle1);
		boolean expectedIsSmaller3 = true;
		
		//changed the radius values of circle1 and circle2
		circle2.setRadius(4);
		circle1.setRadius(5);

		if (actualIsSmaller3) {
			System.out.println("PASSED: Boolean isSmaller Test");
		}
		else {
			System.out.println("FAILED: Boolean isSmaller Test");
		}
		
		//Testing int compareTo
		System.out.println("Test #1 for int comapreTo");//test 1 for compareTo

		int actualCompareTo1 = circle1.compareTo(circle2);
		int expectedCompareTo1 = 1; 
		//circle1 radius = 5
		//circle2 radius = 4
		
		if(Math.abs(actualCompareTo1 - expectedCompareTo1) < THRESHOLD)
			System.out.println("PASSED: int comapreTo Test");
		else
			System.out.println("FAILED: int comapreTo Test");
	
		System.out.println("Test #2 for int comapreTo");//test 2 for compareTo
		
		//changed the x values of circle1 and circle2
		circle1.setX(0);
		circle2.setX(1);
		
		int actualCompareTo2 = circle2.compareTo(circle1);
		int expectedCompareTo2 = -1;  
		
		if(Math.abs(actualCompareTo2 - expectedCompareTo2) < THRESHOLD)
			System.out.println("PASSED: int comapreTo Test");
		else
			System.out.println("FAILED: int comapreTo Test");
		
		System.out.println("Test #3 for int comapreTo");//test 3 for compareTo
		
		//changed the radius values of circle1 and circle2
		circle1.setRadius(0);
		circle2.setRadius(0);
		
		int actualCompareTo3 = circle2.compareTo(circle1);
		int expectedCompareTo3 = 0;  
		
		if(Math.abs(actualCompareTo3 - expectedCompareTo3) < THRESHOLD)
			System.out.println("PASSED: int comapreTo Test");
		else
			System.out.println("FAILED: int comapreTo Test");
		
		//Testing boolean intersects
		System.out.println("Test #1 for boolean intersects");//test 1 for intersects
		boolean actualIntersects1 = circle1.intersects(circle2);
		boolean expectedIntersects1 = true; 
		
		//changed the radius, x, and y values of circle1 and circle2
		circle1.setRadius(2);
		circle2.setRadius(2);
		circle1.setX(1);
		circle2.setY(2);
		circle1.setY(2);
		circle2.setX(1);
		
		if (!actualIntersects1) {
			System.out.println("PASSED: Boolean intersects Test");
		}
		else {
			System.out.println("FAILED: Boolean intersects Test");
		}
		
		System.out.println("Test #2 for boolean intersects");//test 2 for intersects
		boolean actualIntersects2 = circle1.intersects(circle2);
		boolean expectedIntersects2 = true; 
		
		//changed the radius, x, and y values of circle1 and circle2
		circle1.setRadius(2);
		circle2.setRadius(2);
		circle1.setX(4);
		circle2.setY(6);
		circle1.setY(2);
		circle2.setX(1);
		
		if (actualIntersects2) {
			System.out.println("PASSED: Boolean intersects Test");
		}
		else {
			System.out.println("FAILED: Boolean intersects Test");
		}
		
		System.out.println("Test #3 for boolean intersects");//test 3 for intersects
		boolean actualIntersects3 = circle1.intersects(circle2);
		boolean expectedIntersects3 = false; 
		
		//changed the radius, x, and y values of circle1 and circle2
		circle1.setRadius(3);
		circle2.setRadius(3);
		circle1.setX(1);
		circle2.setY(2);
		circle1.setY(2);
		circle2.setX(3);
		
		if (!actualIntersects3) {
			System.out.println("PASSED: Boolean intersects Test");
		}
		else {
			System.out.println("FAILED: Boolean intersects Test");
		}
	}
}

