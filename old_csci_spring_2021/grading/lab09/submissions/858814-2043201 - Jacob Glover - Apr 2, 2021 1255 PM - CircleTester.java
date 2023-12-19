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
		System.out.println(circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2="+circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("circle1=\nDiameter: " + circle1.diameter() + "\nArea: " + circle1.area() + "\nPerimeter " + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("circle2=\nDiameter: " + circle2.diameter() + "\nArea: " + circle2.area() + "\nPerimeter " + circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is unit circle: " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is unit circle: " + circle2.isUnitCircle());
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		// 3 test cases for equals
		// #1
		circle1.setRadius(4);
		circle2.setRadius(4);
		circle1.setX(1);
		circle1.setY(2);
		circle2.setX(1);
		circle2.setY(2);
		
		if (circle1.equals(circle2) == true) {
			System.out.println("PASSED: Equals");
		} else System.out.println("FAILED: Equals");
		
		// #2
		circle1.setRadius(2);
		circle2.setRadius(3);
		circle1.setX(1);
		circle1.setY(2);
		circle2.setX(1);
		circle2.setY(2);
		
		if (circle1.equals(circle2) == false) {
			System.out.println("PASSED: Equals");
		} else System.out.println("FAILED: Equals");
		
		// #3
		circle1.setRadius(4);
		circle2.setRadius(4);
		circle1.setX(2);
		circle1.setY(5);
		circle2.setX(6);
		circle2.setY(4);
		
		if (circle1.equals(circle2) == false) {
			System.out.println("PASSED: Equals");
		} else System.out.println("FAILED: Equals");
		
		
		// 3 test cases for distance
		// #1 
		circle1.setX(4);
		circle1.setY(3);
		circle2.setX(4);
		circle2.setY(3);
		
		if (circle1.distance(circle2) == 0) {
			System.out.println("PASSED: Distance");
		} else System.out.println("FAILED: Distance");
		
		// #2
		circle1.setX(-16);
		circle1.setY(19);
		circle2.setX(4);
		circle2.setY(4);
		
		if (circle1.distance(circle2) == 25) {
			System.out.println("PASSED: Distance");
		} else System.out.println("FAILED: Distance");
		
		// #3
		circle1.setX(2);
		circle1.setY(4);
		circle2.setX(2);
		circle2.setY(8);
		
		if (circle1.distance(circle2) == 4) {
			System.out.println("PASSED: Distance");
		} else System.out.println("FAILED: Distance");
		
		// 3 test cases for isSmaller
		// #1
		circle1.setRadius(5);
		circle2.setRadius(6);
		
		if (circle1.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller");
		} else System.out.println("FAILED: isSmaller");
		
		// #2
		circle1.setRadius(7.65);
		circle2.setRadius(4.812);
		
		if (circle1.isSmaller(circle2)) {
			System.out.println("FAILED: isSmaller");
		} else System.out.println("PASSED: isSmaller");
		
		// #3
		circle1.setRadius(0);
		circle2.setRadius(0);
		
		if (circle1.isSmaller(circle2)) {
			System.out.println("FAILED: isSmaller");
		} else System.out.println("PASSED: isSmaller");
		
		// 3 test cases for compareTo
		// #1
		circle1.setRadius(7);
		circle2.setRadius(5);
		
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("PASSED: compareTo");
		} else System.out.println("FAILED: compareTo");
		
		// #2
		circle1.setRadius(4.534);
		circle2.setRadius(7.32);
		
		if (circle1.compareTo(circle2) == -1) {
			System.out.println("PASSED: compareTo");
		} else System.out.println("FAILED: compareTo");
		
		// #3
		circle1.setRadius(0);
		circle2.setRadius(0);
		
		if (circle1.compareTo(circle2) == 0) {
			System.out.println("PASSED: compareTo");
		} else System.out.println("FAILED: compareTo");
		
		
		// 3 test cases for intersects
		// #1
		circle1.setX(2);
		circle1.setY(4);
		circle2.setX(3);
		circle2.setY(6);
		circle1.setRadius(5);
		circle2.setRadius(2); // distance is 2.23
		
		if (circle1.intersects(circle2) == true) {
			System.out.println("PASSED: intersects");
		} else System.out.println("FAILED: intersects");
		
		// #2
		circle1.setX(-5);
		circle1.setY(4);
		circle2.setX(7);
		circle2.setY(2);
		circle1.setRadius(5);
		circle2.setRadius(2); // distance is 12.16, sum of radius is 7
		if (circle1.intersects(circle2) == false) {
			System.out.println("PASSED: intersects");
		} else System.out.println("FAILED: intersects");
		
		// #1
		circle1.setX(-5);
		circle1.setY(4);
		circle2.setX(7);
		circle2.setY(2);
		circle1.setRadius(10);
		circle2.setRadius(3); // 
		System.out.println(circle1.distance(circle2));
		if (circle1.intersects(circle2) == true) {
			System.out.println("PASSED: intersects");
		} else System.out.println("FAILED: intersects");
		
	}
}