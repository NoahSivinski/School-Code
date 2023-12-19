/*
 * CircleTester.java
 * Author:  Jaren Spitters 
 * Submission Date:  4/2/21
 *
 * Purpose: This program tests the methods created in Circle.java. It utilizes the setter/getter methods and other more 
 * complex methods to form objects (in this case circles) based on the programmer's preference. Tests are up to the programmer, 
 * and my tests involved using different combinations of 3 circle objects to test the effectiveness of my methods in Circle.java.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

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
		
		// This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		// Notice how the double comparison is done
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
		// the method toString, why?
		System.out.println("center:(" + circle1.getX() + "," + circle1.getY() + ")\nradius: " + circle1.getRadius());
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("center:(" + circle2.getX() + "," + circle2.getY() + ")\nradius: " + circle2.getRadius());
		
		// print circle1 diameter, area and perimeter
		System.out.println("diameter: " + circle1.diameter() + "\narea: " + circle1.area() + "\nperimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("diameter: " + circle2.diameter() + "\narea: " + circle2.area() + "\nperimeter: " + circle2.perimeter());

		
		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle()) {
			
			System.out.println("circle 1 is a unit circle");
		
		} else {
			
			System.out.println("circle 1 is not a unit circle");
		}
		
		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle()) {
			
			System.out.println("circle 2 is a unit circle");
		
		} else {
			
			System.out.println("circle 2 is not a unit circle");
		}
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
				
		Circle circle3 = new Circle();
		circle3.setName("Circle 3");
		circle3.setX(34);
		circle3.setY(0);
		circle3.setRadius(50);
		
		
		/*
		 * Test number 1 for each method. This series of tests has circle1 as the calling object and circle2 as the parameter.
		 * The test passes if the returned value of the method is the value that was expected, and fails if it is not.
		 */
		
		System.out.println("\n\nTest 1 ******************\n");
		System.out.println("Objects:\n");
		System.out.println(circle1 + "\n\n" + circle2 + "\n");
		
		if (!circle1.equals(circle2)) {
			
			System.out.println("equals method test PASSED (boolean was false)");
		
		} else {
			
			System.out.println("equals method test FAILED (boolean was true)");
		}
		
		if (circle1.distance(circle2) == 5.830951894845301) {
			
			System.out.println("distance method test PASSED (Distance == 5.830951894845301)");
			
		} else {
			
			System.out.println("distance method test FAILED (Distance != 5.830951894845301)");
		}
		
		if (circle1.isSmaller(circle2)) {
			
			System.out.println("isSmaller method test PASSED (boolean was true)");
		
		} else {
			
			System.out.println("isSmaller method test FAILED (boolean was false)");
		}
		
		if (circle1.compareTo(circle2) == -1) {
			
			System.out.println("compareTo method test PASSED (value == -1 == smaller)");
			
		} else {
			
			System.out.println("compareTo method test FAILED (value != -1 == smaller)");
		}
		
		if (circle1.intersects(circle2)) {
			
			System.out.println("intersects method test PASSED (boolean was true)");
			
		} else {
			
			System.out.println("intersects method test FAILED (boolean was false)");
		}
		
		
		/*
		 * Test number 2 for each method. This series of tests has circle1 as the calling object and circle3 as the parameter.
		 * The test passes if the returned value of the method is the value that was expected, and fails if it is not.
		 */

		System.out.println("\n\nTest 2 ******************\n");
		System.out.println("Objects:\n");
		System.out.println(circle1 + "\n\n" + circle3 + "\n");
		
		if (!circle1.equals(circle3)) {
			
			System.out.println("equals method test PASSED (boolean was false)");
		
		} else {
			
			System.out.println("equals method test FAILED (boolean was true)");
		}
		
		if (circle1.distance(circle3) == 37.21558813185679) {
			
			System.out.println("distance method test PASSED (Distance == 37.21558813185679)");
			
		} else {
			
			System.out.println("distance method test FAILED (Distance != 37.21558813185679)");
		}
		
		if (circle1.isSmaller(circle3)) {
			
			System.out.println("isSmaller method test PASSED (boolean was true)");
		
		} else {
			
			System.out.println("isSmaller method test FAILED (boolean was false)");
		}
		
		if (circle1.compareTo(circle3) == -1) {
			
			System.out.println("compareTo method test PASSED (value == -1 == smaller)");
			
		} else {
			
			System.out.println("compareTo method test FAILED (value != -1 == smaller)");
		}
		
		
		if (circle1.intersects(circle3)) {
			
			System.out.println("intersects method test PASSED (boolean was true)");
			
		} else {
			
			System.out.println("intersects method test FAILED (boolean was false)");
		}
		
		/*
		 * Test number 3 for each method. This series of tests has circle3 as the calling object and circle2 as the parameter.
		 * The test passes if the returned value of the method is the value that was expected, and fails if it is not.
		 */

		System.out.println("\n\nTest 3 ******************\n");
		System.out.println("Objects:\n");
		System.out.println(circle3 + "\n\n" + circle2 + "\n");
		
		if (!circle3.equals(circle2)) {
			
			System.out.println("equals method test PASSED (boolean was false)");
		
		} else {
			
			System.out.println("equals method test FAILED (boolean was true)");
		}
		
		if (circle3.distance(circle2) == 32.01562118716424) {
			
			System.out.println("distance method test PASSED (Distance == 32.01562118716424)");
			
		} else {
			
			System.out.println("distance method test FAILED (Distance != 32.01562118716424)");
		}
		
		if (!circle3.isSmaller(circle2)) {
			
			System.out.println("isSmaller method test PASSED (boolean was false)");
		
		} else {
			
			System.out.println("isSmaller method test FAILED (boolean was true)");
		}
		
		if (circle3.compareTo(circle2) == 1) {
			
			System.out.println("compareTo method test PASSED (value == 1 == larger)");
			
		} else {
			
			System.out.println("compareTo method test FAILED (value != 1 == larger)");
		}
		
		
		if (circle3.intersects(circle2)) {
			
			System.out.println("intersects method test PASSED (boolean was true)");
			
		} else {
			
			System.out.println("intersects method test FAILED (boolean was false)");
		}
	}
}