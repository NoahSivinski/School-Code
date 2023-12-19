/*
 * CircleTester.java
 * Author:  Evan Zimmerman 
 * Submission Date:  2nd April 2021
 *
 * Purpose: The exercise being explored by Lab #9 is classes and methods.
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
		
		System.out.println("circle1="+circle1);
		
		// set the circle2 radius to 5.3
		
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		
		System.out.println("circle2="+circle2);
		
		// print circle1 diameter, area and perimeter
		
		System.out.println("Circle 1 diameter: " + circle1.diameter());
		System.out.println("Circle 1 area: " + circle1.area());
		System.out.println("Circle 1 perimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		
		System.out.println("Circle 2 diameter: " + circle2.diameter());
		System.out.println("Circle 2 area: " + circle2.area());
		System.out.println("Circle 2 perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		
		if(circle1.isUnitCircle()) {
			System.out.println("Circle 1 is a unit circle");
		} else {
			System.out.println("Circle 1 is not a unit circle");
		}
		
		// display whether circle2 is a unit circle
		
		if(circle2.isUnitCircle()) {
			System.out.println("Circle 2 is a unit circle");
		} else {
			System.out.println("Circle 2 is not a unit circle");
		}
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
				
		//Test 1
		//Circles 1 and 2 are given equal radii and centers, so they should be equal, circle 1 should
		//be the same size as circle 2, the distance between them should be 0, and they should intersect.
		System.out.println("========TEST 1 DATA========");
		circle1.setRadius(1);
		circle2.setRadius(1);
		circle1.setX(1.0);
		circle2.setX(1.0);
		circle1.setY(1.0);
		circle2.setY(1.0);
		System.out.println("Circle 1 data: \n" + circle1);
		System.out.println("Circle 2 data: \n" + circle2);
		System.out.println("Are the two circles equal? Answer: " + circle1.equals(circle2));
		System.out.println("Distance between the two circles: " + circle1.distance(circle2));
		System.out.println("Is circle 1 smaller than circle 2? Answer: " + circle1.isSmaller(circle2));
		System.out.print("Result of comparing two circles: ");
		if(circle1.compareTo(circle2) == 1) {
			System.out.println("Circle 1 is larger than circle 2.");
		} else if (circle1.compareTo(circle2) == 0) {
			System.out.println("The two circles are equal");
		} else if (circle1.compareTo(circle2) == -1) {
			System.out.println("Circle 1 is smaller than circle 2.");
		}
		System.out.println("Does circle 1 intersect circle 2? Answer: " + circle1.intersects(circle2));
	
		//Test 2
		//Circle 1 is given a larger radius than circle 2, and the circles' centers are given a horizontal
		//difference of 200 and a vertical difference of 20. Therefore, the two circles should not be equal,
		//the distance should be a little greater than 200, circle 1 should not display as smaller than circle 2,
		//and they should not intersect.
		System.out.println("========TEST 2 DATA========");
		circle1.setRadius(10);
		circle2.setRadius(1);
		circle1.setX(100.0);
		circle2.setX(-100.0);
		circle1.setY(10.0);
		circle2.setY(-10.0);
		System.out.println("Circle 1 data: \n" + circle1);
		System.out.println("Circle 2 data: \n" + circle2);
		System.out.println("Are the two circles equal? Answer: " + circle1.equals(circle2));
		System.out.println("Distance between the two circles: " + circle1.distance(circle2));
		System.out.println("Is circle 1 smaller than circle 2? Answer: " + circle1.isSmaller(circle2));
		System.out.print("Result of comparing two circles: ");
		if(circle1.compareTo(circle2) == 1) {
			System.out.println("Circle 1 is larger than circle 2.");
		} else if (circle1.compareTo(circle2) == 0) {
			System.out.println("The two circles are equal");
		} else if (circle1.compareTo(circle2) == -1) {
			System.out.println("Circle 1 is smaller than circle 2.");
		}
		System.out.println("Does circle 1 intersect circle 2? Answer: " + circle1.intersects(circle2));
		
		//Test 3
		//Circle 1 is given a smaller radius than circle 2, so they should not be equal and it should
		//display circle 2 as bigger than circle 1, the circles are given a horizontal difference of 3
		//and a vertical difference of 4 so the difference should be 5 and the circles should intersect.
		System.out.println("========TEST 3 DATA========");
		circle1.setRadius(4);
		circle2.setRadius(5);
		circle1.setX(2.0);
		circle2.setX(5.0);
		circle1.setY(2.0);
		circle2.setY(6.0);
		System.out.println("Circle 1 data: \n" + circle1);
		System.out.println("Circle 2 data: \n" + circle2);
		System.out.println("Are the two circles equal? Answer: " + circle1.equals(circle2));
		System.out.println("Distance between the two circles: " + circle1.distance(circle2));
		System.out.println("Is circle 1 smaller than circle 2? Answer: " + circle1.isSmaller(circle2));
		System.out.print("Result of comparing two circles: ");
		if(circle1.compareTo(circle2) == 1) {
			System.out.println("Circle 1 is larger than circle 2.");
		} else if (circle1.compareTo(circle2) == 0) {
			System.out.println("The two circles are equal");
		} else if (circle1.compareTo(circle2) == -1) {
			System.out.println("Circle 1 is smaller than circle 2.");
		}
		System.out.println("Does circle 1 intersect circle 2? Answer: " + circle1.intersects(circle2));
	}
	
}