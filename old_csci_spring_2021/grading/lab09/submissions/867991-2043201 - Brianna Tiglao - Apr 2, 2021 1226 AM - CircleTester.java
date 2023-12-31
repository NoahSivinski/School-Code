/*
 * CircleTester.java
 * Author:  Brianna Tiglao
 * Submission Date: April 02, 2021
 *
 * Purpose: The purpose of this program is to call on the methods within
 * circle.java to set the different centers and radius of each circle
 * and to compare these values.
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
		
		System.out.println(circle1.diameter());
		System.out.println(circle1.area());
		System.out.println(circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		
		System.out.println(circle2.diameter());
		System.out.println(circle2.area());
		System.out.println(circle2.perimeter());
		
		// display whether circle1 is a unit circle
		
		System.out.println(circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		
		System.out.println(circle2.isUnitCircle());
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		//equals test 1 (False)
		
		circle1.setRadius(4.2);
		circle1.setX(2.4);
		circle1.setY(4.3);
		
		circle2.setRadius(9.5);
		circle2.setX(2.4);
		circle2.setY(4.3);
		
		if (!circle1.equals(circle2)) {
			System.out.println("PASSED: equals");
		}
		else {
			System.out.println("FAILED: equals");
		}
		//equals test 2 (True)
		
		circle1.setRadius(3.0);
		circle1.setX(4.5);
		circle1.setY(2.5);
		
		circle2.setRadius(3.0);
		circle2.setX(4.5);
		circle2.setY(2.5);
		
		if (circle1.equals(circle2)) {
			System.out.println("PASSED: equals");
		}
		else {
			System.out.println("FAILED: equals");
		}
		
		//equals test 3 (True)
		
		circle1.setRadius(-1.0);
		circle1.setX(4.5);
		circle1.setY(2.5);
		
		circle2.setRadius(-2.5);
		circle2.setX(4.5);
		circle2.setY(2.5);
		
		if (circle1.equals(circle2)) {
			System.out.println("PASSED: equals");
		}
		else {
			System.out.println("FAILED: equals");
		}
		
		//distance test 1 (1.5811388301)
		
		circle1.setX(2.5);
		circle1.setY(6.5);
		
		circle2.setX(4.0);
		circle2.setY(7.0);
		
		if (Math.abs(1.5811388301 - circle1.distance(circle2)) < THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}
		
		//distance test 2 (14.9913308282)
		
		circle1.setX(-4.0);
		circle1.setY(3.2);
		
		circle2.setX(10.3);
		circle2.setY(7.7);
		
		if (Math.abs(14.9913308282 - circle1.distance(circle2)) < THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}
		
		//distance test 3 (9.4047860156)
		
		circle1.setX(8.0);
		circle1.setY(9.8);
		
		circle2.setX(1.3);
		circle2.setY(3.2);
		
		if (Math.abs(9.4047860156 - circle1.distance(circle2)) < THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}
		
		//isSmaller test 1 (False)
		
		circle1.setRadius(4.5);
		circle2.setRadius(2.7);
		
		if (!circle1.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller");
		}
		
		//isSmaller test 2 (True)
		
		circle1.setRadius(4.5);
		circle2.setRadius(2.7);
		
		if (circle2.isSmaller(circle1)) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller");
		}
		
		//isSmaller test 3 (False)
		
		circle1.setRadius(-4.5);
		circle2.setRadius(-2.7);
		
		if (!circle1.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller");
		}
		
		//compareTo test 1 (1)
		
		circle1.setRadius(4.5);
		circle2.setRadius(2.7);
		
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("PASSED: compare");
		}
		else {
			System.out.println("FAILED: compare");
		}
		
		//compareTo test 2 (-1)
		
		circle1.setRadius(4.5);
		circle2.setRadius(2.7);
		
		if (circle2.compareTo(circle1) == -1) {
			System.out.println("PASSED: compare");
		}
		else {
			System.out.println("FAILED: compare");
		}
		
		//compareTo test 3 (0)
		
		circle1.setRadius(3.0);
		circle2.setRadius(3.0);
		
		if (circle1.compareTo(circle2) == 0) {
			System.out.println("PASSED: compare");
		}
		else {
			System.out.println("FAILED: compare");
		}
		
		//intersects test 1 (False)
		
		circle1.setRadius(3.8);
		circle1.setX(6.7);
		circle1.setY(2.3);
		
		circle2.setRadius(2.3);
		circle2.setX(14.5);
		circle2.setY(20.4);
		
		if (!circle1.intersects(circle2)) {
			System.out.println("PASSED: interescts");
		}
		else {
			System.out.println("FAILED: intersects");
		}
		
		//intersects test 2 (True)
		
		circle1.setRadius(20.4);
		circle1.setX(2.5);
		circle1.setY(3.0);
		
		circle2.setRadius(14.3);
		circle2.setX(5.5);
		circle2.setY(3.3);
		
		if (circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects");
		}
		else {
			System.out.println("FAILED: intersects");
		}
		
		//intersects test 3 (False)
			
		circle1.setRadius(2);
		circle1.setX(5.0);
		circle1.setY(1.0);
		
		circle2.setRadius(2);
		circle2.setX(1.0);
		circle2.setY(1.0);
		
		if (!circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects");
		}
		else {
			System.out.println("FAILED: intersects");
		}
		
	}
	
}