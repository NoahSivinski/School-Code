/*
 * [CircleTester.java]
 * Author:  [Austin Perales] 
 * Submission Date:  [4/1/2021]
 *
 * This program does the following: A client to test the functionality of objects of the class Circle
 * 
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
		System.out.println("circle1="+circle1);
		
		System.out.println("");
		
		System.out.println("circle2="+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		System.out.println("");
		
		//This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		//Notice how the double comparison is done
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
			System.out.println("Set Radius for circle1: PASSED");
		else
			System.out.println("Set Radius for circle1: FAILED");
		
		System.out.println("");
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		
		System.out.println("circle1="+circle1);
		
		System.out.println("");
		
		// set the circle2 radius to 5.3
		
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		
		System.out.println("circle2="+circle2);
		
		System.out.println("--------------------------------------------------------------------");
		
		// print circle1 diameter, area and perimeter
		
		System.out.println("circle1 diameter: " + circle1.diameter());
		System.out.println("circle1 area: " + circle1.area());
		System.out.println("circle1 perimeter: " + circle1.perimeter());
		
		System.out.println("");
		
		// print circle2 diameter, area and perimeter
		
		System.out.println("circle2 diameter: " + circle2.diameter());
		System.out.println("circle2 area: " + circle2.area());
		System.out.println("circle2 perimeter: " + circle2.perimeter());
		
		System.out.println("");
		
		// set the circle2 x to 5, y to 1, and radius to 1.7
		
		circle2.setX(5.0);
		circle2.setY(1.0);
		circle2.setRadius(1.7);
		
		// print circle2 diameter, area and perimeter
		
		System.out.println("circle2 diameter: " + circle2.diameter());
		System.out.println("circle2 area: " + circle2.area());
		System.out.println("circle2 perimeter: " + circle2.perimeter());
				
		System.out.println("--------------------------------------------------------------------");
		
		// display whether circle1 is a unit circle
		
		if (circle1.isUnitCircle() == true) {
			System.out.println("Circle1 is a unit circle: PASS");
		}
		else {
			System.out.println("Circle1 is a unit circle: FAIL");
		}
		
		// display whether circle2 is a unit circle
		
		if (circle2.isUnitCircle() == true) {
			System.out.println("Circle2 is a unit circle: PASS");
		}
		else {
			System.out.println("Circle2 is a unit circle: FAIL");
		}
		
		// set the circle1 x to 0, y to 0, and radius to 1
		
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(1);
		
		// display whether circle1 is a unit circle
		
		if (circle1.isUnitCircle() == true) {
			System.out.println("Circle1 is a unit circle: PASS");
		}
		else {
			System.out.println("Circle1 is a unit circle: FAIL");
		}
		
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
				
		
		System.out.println("--------------------------------------------------------------------");
		
		//display whether circle1 equals circle2
		
		if (circle1.equals(circle2) == true) {
			System.out.println("Circle1 equals circle2: PASS");
		}
		else {
			System.out.println("Circle1 equals circle2: FAIL");
		}
		
		//sets circle1 and circle2 
		
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(1);

		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(1);
		
		//display whether circle1 equals circle2

		if (circle1.equals(circle2) == true) {
			System.out.println("Circle1 equals circle2: PASS");
		}
		else {
			System.out.println("Circle1 equals circle2: FAIL");
		}
		
		//display whether circle2 equals circle1

		if (circle2.equals(circle1) == true) {
			System.out.println("Circle2 equals circle1: PASS");
		}
		else {
			System.out.println("Circle2 equals circle1: FAIL");
		}
		
		System.out.println("--------------------------------------------------------------------");
		
		//displays what the distance between the two circles is
		
		System.out.println("The distance between the circles is: " + circle1.distance(circle2));
		
		//sets circle1 and circle2
		
		circle1.setX(1.0);
		circle1.setY(5.0);
		circle1.setRadius(1);

		circle2.setX(0.0);
		circle2.setY(2.0);
		circle2.setRadius(4);
		
		//displays what the distance between the two circles is
		
		System.out.println("The distance between circle1 and circle2 is: " + circle1.distance(circle2));
		
		//sets circle1 and circle2
		
		circle1.setX(0.0);
		circle1.setY(3.5);
		circle1.setRadius(2.5);

		circle2.setX(1.2);
		circle2.setY(10.0);
		circle2.setRadius(2.3);
		
		//displays what the distance between the two circles is
		
		System.out.println("The distance between circle2 and circle1 is: " + circle2.distance(circle1));
		
		System.out.println("--------------------------------------------------------------------");
		
		//displays whether circle1 is smaller than circle2
		
		if (circle1.isSmaller(circle2) == true) {
			System.out.println("Circle1 is smaller than circle2: PASS");
		}
		else {
			System.out.println("Circle1 is smaller than circle2: FAIL");
		}
		
		//displays whether circle2 is smaller than circle1
		
		if (circle2.isSmaller(circle1) == true) {
			System.out.println("Circle2 is smaller than circle1: PASS");
		}
		else {
			System.out.println("Circle2 is smaller than circle1: FAIL");
		}
		
		
		// set the circle1 x to 0, y to 0, and radius to 1
		
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(1);
		
		//displays whether circle1 is smaller than circle2
		
		if (circle1.isSmaller(circle2) == true) {
			System.out.println("Circle1 is smaller than circle2: PASS");
		}
		else {
			System.out.println("Circle1 is smaller than circle2: FAIL");
		}
				
		System.out.println("--------------------------------------------------------------------");
		
		//displays whether circle1 is smaller than circle2
		
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("Circle1 is bigger than than circle2: PASS");
		}
		else if (circle1.compareTo(circle2) == -1) {
			System.out.println("Circle1 is bigger than circle2: FAIL");
		}
		else {
			System.out.println("Circle1 is neither bigger nor smaller than circle2");
		}
		
		// set the circle1 x to 5.5, y to 5.3, and radius to 4.7
		
		circle1.setX(5.5);
		circle1.setY(5.3);
		circle1.setRadius(4.7);
		
		//displays whether circle1 is smaller than circle2
		
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("Circle1 is bigger than than circle2: PASS");
		}
		else if (circle1.compareTo(circle2) == -1) {
			System.out.println("Circle1 is bigger than circle2: FAIL");
		}
		else {
			System.out.println("Circle1 is neither bigger nor smaller than circle2");
		}
		
		// set the circle1 x to 0, y to 0, and radius to 1
		
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(1);
		
		// set the circle2 x to 0, y to 0, and radius to 1
		
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(1);
		
		//displays whether circle1 is smaller than circle2
		
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("Circle1 is bigger than than circle2: PASS");
		}
		else if (circle1.compareTo(circle2) == -1) {
			System.out.println("Circle1 is bigger than circle2: FAIL");
		}
		else {
			System.out.println("Circle1 is neither bigger nor smaller than circle2");
		}
		
		System.out.println("--------------------------------------------------------------------");
		
		//displays whether circle1 intersects circle2
		
		if (circle1.intersects(circle2) == true) {
			System.out.println("Circle1 intersects circle2: PASS");
		}
		else {
			System.out.println("Circle1 intersects circle2: FAIL");
		}
		
		// set the circle1 x to 3.0, y to 4.0, and radius to 2
		
		circle1.setX(3.0);
		circle1.setY(4.0);
		circle1.setRadius(2);
		
		//displays whether circle1 intersects circle2
		
		if (circle1.intersects(circle2) == true) {
			System.out.println("Circle1 intersects circle2: PASS");
		}
		else {
			System.out.println("Circle1 intersects circle2: FAIL");
		}
		
		// set the circle2 x to -2.0, y to 3.5, and radius to 7
		
		circle1.setX(-2.0);
		circle1.setY(3.5);
		circle1.setRadius(7);
		
		//displays whether circle1 intersects circle2
		
		if (circle1.intersects(circle2) == true) {
			System.out.println("Circle1 intersects circle2: PASS");
		}
		else {
			System.out.println("Circle1 intersects circle2: FAIL");
		}
	}
}