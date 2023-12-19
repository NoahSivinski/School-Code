/*
 * [CircleTester].java
 * Author:  [Hriddhiman Dey] 
 * Submission Date:  [4/2/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * This tests whether the methods written in Circle.java runs correctly. There are
 * multiple tests set up to test each method. 
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
//CircleTester.java
//
//
//A client to test the functionality of objects
//of the class Circle
//
//*******************************************************
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
		System.out.println("\ncircle1=" + circle1);
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("\ncircle2=" + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("\ncircle 1= \n\tdiameter: " + circle1.diameter() +  "\n\tarea: " + circle1.area() +  "\n\tperimeter: " + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("\ncircle 2= \n\tdiameter: " + circle2.diameter() +  "\n\tarea: " + circle2.area() +  "\n\tperimeter: " + circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("\nIs circle1 an unit circle: " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("\nIs circle2 an unit circle: " + circle2.isUnitCircle());
		// your additional tests should be placed below here.  Make sure to include at least 2-3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.

		// other tests done above

		// test for unit circle
		System.out.println("\nUnit Circle Test");

		// when values are equal to the unit circle
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(1.0);
		if (circle2.isUnitCircle() == true) {
			System.out.println("\tPASSED: isUnitCircle");
		} else {
			System.out.println("\tFAILED: isUnitCircle");
		}

		// when the values are not according to the unit circle
		circle2.setX(1.0);
		circle2.setY(1.0);
		circle2.setRadius(2.0);
		if (circle2.isUnitCircle() == true) {
			System.out.println("\tFAILED: isUnitCircle");
		} else {
			System.out.println("\tPASSED: isUnitCircle");
		}

		// test for equals
		System.out.println("\nEquals Test");

		// when the circles are different
		if (circle1.equals(circle2)) {
			System.out.println("\tFAILED: equals");
		} else {
			System.out.println("\tPASSED: equals");
		}

		// when the circles are the same
		circle1.setX(1.0);
		circle1.setY(1.0);
		circle1.setRadius(2.0);

		if (circle1.equals(circle2)) {
			System.out.println("\tPASSED: equals");
		} else {
			System.out.println("\tFAILED: equals");
		}

		// when the circles are different but x,y coordinates are the same
		circle1.setRadius(1.0);

		if (circle1.equals(circle2)) {
			System.out.println("\tFAILED: equals");
		} else {
			System.out.println("\tPASSED: equals");
		}

		// test for distance
		System.out.println("\nDistance Test");

		// same origin
		if (Math.abs(circle1.distance(circle2)) < THRESHOLD) {
			System.out.println("\tPASSED: distance");
		} else {
			System.out.println("\tFAILED: distance");
		}

		// different x coordinates
		circle1.setX(5.0);

		if (Math.abs(4 - circle1.distance(circle2)) < THRESHOLD) {
			System.out.println("\tPASSED: distance");
		} else {
			System.out.println("\tFAILED: distance");
		}

		// different x & y
		circle1.setY(5.0);
		if (Math.abs(5.656854249 - circle1.distance(circle2)) < THRESHOLD) {
			System.out.println("\tPASSED: distance");
		} else {
			System.out.println("\tFAILED: distance");
		}

		// test for isSmaller
		System.out.println("\nisSmaller Test");

		// is smaller
		if (circle1.isSmaller(circle2)) {
			System.out.println("\tPASSED: isSmaller");
		} else {
			System.out.println("\tFAILED: isSmaller");
		}

		// is larger
		if (circle2.isSmaller(circle1)) {
			System.out.println("\tFAILED: isSmaller");
		} else {
			System.out.println("\tPASSED: isSmaller");
		}

		// is the same size
		circle1.setRadius(2.0);
		if (circle1.isSmaller(circle2)) {
			System.out.println("\tFAILED: isSmaller");
		} else {
			System.out.println("\tPASSED: isSmaller");
		}

		// test for compareTo
		System.out.println("\ncompareTo Test");

		// if calling object is larger
		circle1.setRadius(5.0);
		circle2.setRadius(4.0);

		if (Math.abs(1 - circle1.compareTo(circle2)) < THRESHOLD) {
			System.out.println("\tPASSED: compareTo");
		} else {
			System.out.println("\tFAILED: compareTo");
		}

		// if anotherCircle is smaller
		if (Math.abs(-1 - circle2.compareTo(circle1)) < THRESHOLD) {
			System.out.println("\tPASSED: compareTo");
		} else {
			System.out.println("\tFAILED: compareTo");
		}

		// if they're the same
		circle2.setRadius(5.0);

		if (Math.abs(circle2.compareTo(circle1)) < THRESHOLD) {
			System.out.println("\tPASSED: compareTo");
		} else {
			System.out.println("\tFAILED: compareTo");
		}

		// test for intersects
		System.out.println("\nIntersects Test");

		// doesnt intersect at all
		circle1.setX(0);
		circle1.setY(0);

		circle2.setX(11);
		circle2.setY(0);

		if (circle1.intersects(circle2)) {
			System.out.println("\tFAILED: intersects");
		} else {
			System.out.println("\tPASSED: intersects");
		}

		// are touching
		circle2.setX(10);

		if (circle1.intersects(circle2)) {
			System.out.println("\tFAILED: intersects");
		} else {
			System.out.println("\tPASSED: intersects");
		}

		// intersect
		circle2.setX(9);

		if (circle1.intersects(circle2)) {
			System.out.println("\tPASSED: intersects");
		} else {
			System.out.println("\tFAILED: intersects");
		}
	}

}