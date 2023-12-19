/*
 * [CircleTester].java
 * Author:  [Chris Hernandez] 
 * Submission Date:  [4/2/2021]
 *
 * Purpose: This program provides various tests to ensure the Circle.java program runs correctly.
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
		System.out.println(circle1);
		System.out.println(circle2);
		
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
		
		System.out.println(circle2);
		
		// print circle1 diameter, area and perimeter
		
		System.out.println("Circle1 Diameter: " + circle1.diameter());
		System.out.println("Circle1 Area: " + circle1.area());
		System.out.println("Circle1 Perimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		
		System.out.println("Circle2 Diameter: " + circle2.diameter());
		System.out.println("Circle2 Area: " + circle2.area());
		System.out.println("Circle2 Perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		
		System.out.println("Is Circle1 a unit circle? " + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		
		System.out.println("Is Circle2 a unit circle? " + circle2.isUnitCircle());
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		// displays whether circle1 equals circle 2 from previous values (false)
		if (circle1.equals(circle2) == false) {
			System.out.println("PASSED: Equals");
		}
		else {
			System.out.println("Failed: Equals");
		}
		
		// displays whether circle1 equals circle 2 from new values (true)
		circle1.setRadius(2.0);
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle2.setRadius(2.0);
		circle2.setX(0.0);
		circle2.setY(0.0);
		if (circle1.equals(circle2) == true) {
			System.out.println("PASSED: Equals");
		}
		else {
			System.out.println("Failed: Equals");
		}
		
		// displays whether circle2 equals circle1 from same values (true)
		if (circle2.equals(circle1) == true) {
			System.out.println("PASSED: Equals");
		}
		else {
			System.out.println("Failed: Equals");
		}
		
		// displays the distance between circle1 and circle2 from same values
		if (circle1.distance(circle2) == 0.0) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("Failed: distance");
		}		
		// displays the distance between circle1 and circle2 from different values
		circle1.setX(5.0);
		circle1.setY(1.0);
		circle1.setRadius(3);
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		if (circle1.distance(circle2) == 3.0) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("Failed: distance");
		}
		// displays the distance between circle1 and circle2 from different values
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		if (circle1.distance(circle2) == 2.23606797749979) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("Failed: distance");
		}
				
		// displays true if a circle is smaller than another circle with the same values
		if (circle2.isSmaller(circle1) == true) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("Failed: isSmaller");
		}
		
		// displays false if a circle is larger than another circle with the same values
		if (circle1.isSmaller(circle2) == false) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("Failed: isSmaller");
		}
		
		// displays true if a circle is smaller than another circle with different values
		circle1.setX(5.0);
		circle1.setY(1.0);
		circle1.setRadius(3);
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		if (circle2.isSmaller(circle1) == true) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("Failed: isSmaller");
		}

		// displays 1 if circle is larger than another circle same values as before
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("PASSED: compareTo");
		}
		else {
			System.out.println("Failed: compareTo");
		}
		// displays -1 if circle is smaller than another circle same values as before
		if (circle2.compareTo(circle1) == -1) {
			System.out.println("PASSED: compareTo");
		}
		else {
			System.out.println("Failed: compareTo");
		}
		// displays 0 is circle is equal to another with different values
		circle1.setRadius(2.0);
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle2.setRadius(2.0);
		circle2.setX(0.0);
		circle2.setY(0.0);
		if (circle1.compareTo(circle2) == 0) {
			System.out.println("PASSED: compareTo");
		}
		else {
			System.out.println("Failed: compareTo");
		}
		
		// Checks if circle intersects another circle and returns true if it does (same values before)
		if (circle1.intersects(circle2) == true) {
			System.out.println("PASSED: intersects");
		}
		else {
			System.out.println("Failed: intersects");
		}
		// Checks if circle intersects another circle and returns false if it doesn't (different values)
		circle1.setX(20.0);
		circle1.setY(10.0);
		circle1.setRadius(2.0);
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1.0);
		if (circle1.intersects(circle2) == false) {
			System.out.println("PASSED: intersects");
		}
		else {
			System.out.println("Failed: intersects");
		}
		
		// Checks if circle intersects another circle and returns false (different order)
		if (circle2.intersects(circle1) == false) {
			System.out.println("PASSED: intersects");
		}
		else {
			System.out.println("Failed: intersects");
		}
	}
}