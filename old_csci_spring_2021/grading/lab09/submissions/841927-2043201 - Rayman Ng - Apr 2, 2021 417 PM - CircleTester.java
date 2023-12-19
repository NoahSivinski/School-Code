/*
 * CSCI1301.java
 * Author: Rayman Ng
 * Submission Date: 4/2/2021
 * 
 * Purpose: This program creates circle objects, and contains methods that modify
 * these circles, compares them with other circles, or checks some of their properties such as 
 * their diameter or if they're a unit circle or not. Each circle has its own center, radius, and name, which can also be modified using certain methods. 
 * 
 * 
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
		System.out.println("circle1:\n" + "diameter: " + circle1.diameter() + "\narea: " + circle1.area() + "\nperimeter: " + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("circle2:\n" + "diameter: " + circle2.diameter() + "\narea: " + circle2.area() + "\nperimeter: " + circle2.perimeter());
		// display whether circle1 is a unit circle

		if(circle1.isUnitCircle() == true) {
			System.out.println("circle1 is a unit circle.");
		}
		else {
			System.out.println("circle1 isn't a unit circle.");
		}
		// display whether circle2 is a unit circle
		if(circle2.isUnitCircle() == true) {
			System.out.println("circle2 is a unit circle.");
		}
		else {
			System.out.println("circle2 isn't a unit circle.");
		}
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.

		//Test for equals method. Different name, radius, and center
		if(circle1.equals(circle2) == false) {
			System.out.println("PASSED: equals method");
		}
		else 
			System.out.println("FAILED: equals method");

		//Test for equals method. Same radius and center.
		circle1.setRadius(5.3);
		circle1.setX(2);
		circle1.setY(1);
		if(circle1.equals(circle2) == true) {
			System.out.println("PASSED: equals method");
		}
		else
			System.out.println("FAILED: equals method");

		//Test for equals method. Same radius, different x coordinate.
		circle2.setX(9);
		if(circle1.equals(circle2) == false) {
			System.out.println("PASSED: equals method");
		}
		else
			System.out.println("FAILED: equals method");
		//Test for equals method. Different radius, same center.
		circle2.setX(2);
		circle1.setRadius(2);
		if(circle1.equals(circle2) == false) {
			System.out.println("PASSED: equals method");
		}
		else
			System.out.println("FAILED: equals method");

		//Test for distance method. Circles have the same center:
		if(Math.abs(0 - circle1.distance(circle2)) < THRESHOLD){
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}

		//Test for distance method. Circles have different centers. Expected something around 5.099019514 as distance.
		circle1.setX(-3);
		circle1.setY(4);
		circle2.setY(5);
		if(Math.abs(5.099019514 - circle1.distance(circle2)) < THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}
		//Test for distance method. Circles have long coordinates. Expected something around 2.952439927 as distance. 
		circle1.setX(Math.PI);
		circle1.setY(-0.25);
		circle2.setX(Math.log(7));
		circle2.setY(Math.sqrt(6));
		if(Math.abs(2.952439927 - circle1.distance(circle2)) < THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}
		//Test for distance method. Circles should have same distance no matter their position in the formula.
		if(Math.abs(circle1.distance(circle2)- circle2.distance(circle1))< THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}
		//Test for isSmaller method. Same radius. 
		circle1.setRadius(5.3);
		if(circle1.isSmaller(circle2)== false) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller");
		}

		//Test for isSmaller method. circle1 will have a smaller radius. 
		circle2.setRadius(10);
		if(circle1.isSmaller(circle2)== true) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller");
		}

		//Test for isSmaller method. circle1 will have a bigger radius.
		circle1.setRadius(99);
		if(circle1.isSmaller(circle2)== false) {
			System.out.println("PASSED: isSmaller");
		}
		else {
			System.out.println("FAILED: isSmaller");
		}

		//Test for compareTo method. circle1 will be larger than circle2.
		if(circle1.compareTo(circle2) == 1) {
			System.out.println("PASSED: compareTo");
		}
		else {
			System.out.println("FAILED: compareTo");
		}

		//Test for compareTo method. circle1 will be smaller than circle2.
		circle1.setRadius(1);
		if(circle1.compareTo(circle2) == -1) {
			System.out.println("PASSED: compareTo");
		}
		else {
			System.out.println("FAILED: compareTo");
		}
		//Test for compareTo method. circle1 will be the same size as circle2.
		circle1.setRadius(10);
		if(circle1.compareTo(circle2) == 0) {
			System.out.println("PASSED: compareTo");
		}
		else {
			System.out.println("FAILED: compareTo");

		}
		//Test for intersects method. Distance will be shorter than the sum of the radius.
		if(circle1.intersects(circle2) == true) {
			System.out.println("PASSED: intersects");
		}
		else
			System.out.println("FAILED: intersects");

		//Test for intersects method. Distance will be greater than the sum of the radius.
		circle1.setX(100);
		if(circle1.intersects(circle2) == false) {
			System.out.println("PASSED: intersects");
		}
		else
			System.out.println("FAILED: intersects");

		//Test for intersects method. Distance will equal the sum of the radius. 
		circle1.setX(9);
		circle2.setX(3);
		circle1.setY(12);
		circle2.setY(4);
		circle1.setRadius(5);
		circle2.setRadius(5);
		if(circle1.intersects(circle2) == false) {
			System.out.println("PASSED: intersects");
		}
		else
			System.out.println("FAILED: intersects");
	}
}