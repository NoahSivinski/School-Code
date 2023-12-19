/*
 * Carla Pena.java
 * Author:  Circle
 * Submission Date:  2 April 2021
 *
 * Purpose: This program introduces the concepts
 * of object orriented programming. This program
 * works by having a blueprint of how to obtain 
 * the desired results. In this case I am trying
 * to determine characteristics of a circle. 
 * I will enter known values and the code will 
 * work to give me my desired results.
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
		System.out.println("circle1="+circle1);
		System.out.println();
		System.out.println("circle2="+circle2);
		System.out.println();
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		//Notice how the double comparison is done
		if (Math.abs(2-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		System.out.println();
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		System.out.println("circle1="+circle1);
		System.out.println();
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2="+circle2);
		System.out.println();
		
		// print circle1 diameter, area and perimeter
		System.out.println("diameter of Circle 1: " + circle1.diameter());
		System.out.println("area of Circle 1: " + circle1.area());
		System.out.println("perimeter of Circle 1: " + circle1.perimeter());
		System.out.println();
		
		
		// print circle2 diameter, area and perimeter
		System.out.println("diameter of Circle 2: " + circle2.diameter());
		System.out.println("area of Circle 2: " + circle2.area());
		System.out.println("perimeter of Circle 2: " + circle2.perimeter());
		System.out.println(); 
		
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is unit circle: " + circle1.isUnitCircle());
		System.out.println();
		
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is unit circle: " + circle2.isUnitCircle());
		System.out.println();
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		System.out.println("Is circle1 equals to circle 2: " + circle1.equals(circle2));
		
		if (Math.abs(2.0 - circle1.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: is equals\n");
		}
		else {
			System.out.println("Failed: is equals\n");
		}
		
		circle1.setRadius(3.5);
		circle1.setX(4.2);
		circle1.setY(6.1);
		circle2.setRadius(3.5);
		circle2.setX(4.2);
		circle2.setY(6.1);
		
		System.out.println("Is Circle 1 equals to Circle 2: " + circle1.equals(circle2));
		
		if (Math.abs(3.5 - circle1.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: is equals\n");
		}
		else {
			System.out.println("Failed: is equals\n");
		}
		
		circle1.setRadius(-3.5);
		circle1.setX(4.2);
		circle1.setY(-6.1);
		circle2.setRadius(3.5);
		circle2.setX(4.2);
		circle2.setY(6.1);
		
		System.out.println("Is Circle 1 equals to Circle 2: " + circle1.equals(circle2));
		
		if (Math.abs(3.5 - circle1.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: is equals\n");
		}
		else {
			System.out.println("Failed: is equals\n");
		}
		
		System.out.println("Distance between Circle 1 and Circle 2: " + circle1.distance(circle2));
		
		if (((4.2 - 4.2) - (circle2.getX() - circle1.getX())) < THRESHOLD) {
			System.out.println("PASSED: Distance\n");
		}
		else {
			System.out.println("Failed: Distance\n");
		}
		
		circle1.setX(5);
		circle1.setY(7);
		circle2.setX(13);
		circle2.setY(10);
		
		System.out.println("Distance between Circle 1 and Circle 2: " + circle1.distance(circle2));
		
		if (((13 - 5) - (circle2.getX() - circle1.getX())) < THRESHOLD) {
			System.out.println("PASSED: Distance\n");
		}
		else {
			System.out.println("Failed: Distance\n");
		}
		
		circle1.setX(-5.2);
		circle1.setY(4.23);
		circle2.setX(7.85);
		circle2.setY(9.16);
		
		System.out.println("Distance between Circle 1 and Circle 2: " + circle1.distance(circle2));
		
		if (((7.85 - (-5.2)) - (circle2.getX() - circle1.getX())) < THRESHOLD) {
			System.out.println("PASSED: Distance\n");
		}
		else {
			System.out.println("Failed: Distance\n");
		}
		
		System.out.println("Circle 1 is smaller than Circle 2: " + circle1.isSmaller(circle2));
		
		if ((2 * Math.PI * circle1.getRadius()) - circle1.perimeter() < THRESHOLD) {
			System.out.println("PASSED: isSmaller\n");
		}
		else {
			System.out.println("PASSED: isSmaller\n");
		}
		
		circle1.setRadius(5.87);
		circle2.setRadius(13.82);
		
		System.out.println("Circle 1 is smaller than Circle 2: " + circle1.isSmaller(circle2));
		
		if ((2 * Math.PI * circle1.getRadius()) - circle1.perimeter() < THRESHOLD) {
			System.out.println("PASSED: isSmaller\n");
		}
		else {
			System.out.println("PASSED: isSmaller\n");
		}
		
		circle1.setRadius(1.456);
		circle2.setRadius(64.092);
		
		System.out.println("Circle 1 is smaller than Circle 2: " + circle1.isSmaller(circle2));
		
		if ((2 * Math.PI * circle1.getRadius()) - circle1.perimeter() < THRESHOLD) {
			System.out.println("PASSED: isSmaller\n");
		}
		else {
			System.out.println("PASSED: isSmaller\n");
		}
		
		System.out.println("Circle 1 compared to Circle 2: " + circle1.compareTo(circle2));
		
		if ((2 * Math.PI * circle2.getRadius()) - circle2.perimeter() < THRESHOLD) {
			System.out.println("PASSED: compareTo\n");
		}
		else {
			System.out.println("PASSED: compareTo\n");
		}
		
		circle1.setRadius(10.384);
		circle2.setRadius(4.02);
		
		System.out.println("Circle 1 compared to Circle 2: " + circle1.compareTo(circle2));
		
		if ((2 * Math.PI * circle2.getRadius()) - circle2.perimeter() < THRESHOLD) {
			System.out.println("PASSED: compareTo\n");
		}
		else {
			System.out.println("PASSED: compareTo\n");
		}
		
		circle1.setRadius(36.7);
		circle2.setRadius(36.7);
		
		System.out.println("Circle 1 compared to Circle 2: " + circle1.compareTo(circle2));
		
		if ((2 * Math.PI * circle2.getRadius()) - circle2.perimeter() < THRESHOLD) {
			System.out.println("PASSED: compareTo\n");
		}
		else {
			System.out.println("PASSED: compareTo\n");
		}
		
		System.out.println("Circle 1 intersects Circle 2: " + circle1.intersects(circle2));
		
		if ((36.7 - 36.7) - (circle1.getRadius() - circle2.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: intersects\n");
		}
		else {
			System.out.println("PASSED: intersects\n");
		}
		
		circle1.setRadius(1.2);
		circle2.setRadius(2.45);
		
		System.out.println("Circle 1 intersects Circle 2: " + circle1.intersects(circle2));
		
		if ((1.2 - 2.45) - (circle1.getRadius() - circle2.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: intersects\n");
		}
		else {
			System.out.println("PASSED: intersects\n");
		}
		
		circle1.setRadius(18);
		circle2.setRadius(5.32);
		
		System.out.println("Circle 1 intersects Circle 2: " + circle1.intersects(circle2));
		
		if ((1.2 - 2.45) - (circle1.getRadius() - circle2.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: intersects\n");
		}
		else {
			System.out.println("PASSED: intersects\n");
		}
		
	}

}
