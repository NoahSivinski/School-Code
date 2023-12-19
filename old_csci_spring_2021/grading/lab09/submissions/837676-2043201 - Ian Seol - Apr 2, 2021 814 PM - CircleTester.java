//*******************************************************
// CircleTester.java
//
//
// 
// 
/*
 * [CSCI1301L].java
 * Author:  [Jaehoon Seol] 
 * Submission Date:  [04022021]
 *
 * Purpose: A client to test the functionality of objects
//  of the class Circle
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
public class CircleTester {
	public static final double THRESHOLD = 0.000000001;

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(1);
		circle2.setName("Circle 2");
		circle2.setX(1.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);

		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(1.0);

		// This is a unit test. It is best to have tests output pass or fail instead of
		// just a bunch of values.
		// Notice how the double comparison is done
		if (Math.abs(2 - circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(0.0);
		circle1.setY(0.0);

		// print circle1 characteristics (center and radius), use a statement similar
		// to the previous println statements. Note that is not necessary to call
		// the method toString, why? because circle1 & circle2 already has statements
		// structured
		System.out.println("Characteristics of Circle 1: " + circle1);

		// set the circle2 radius to 5.3
		circle2.setRadius(7.7);

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println("Characteristics of Circle 2: " + circle2);

		// print circle1 diameter, area and perimeter
		System.out.println("Circle 1 Diameter: " + circle1.diameter());
		System.out.println("Circle 1 Area: " + circle1.area());
		System.out.println("Circle 1 Perimeter: " + circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("Circle 2 Diameter: " + circle2.diameter());
		System.out.println("Circle 2 Area: " + circle2.area());
		System.out.println("Circle 2 Perimeter: " + circle2.perimeter());

		// display whether circle1 is a unit circle
		System.out.println("Is Circle 1 a Unit Circle?: " + circle1.isUnitCircle());

		// display whether circle2 is a unit circle
		System.out.println("Is Circle 2 a Unit Circle?: " + circle2.isUnitCircle());

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.

		// display whether circle 1's radius and circle 2's radius are same
		System.out.println("Are Two Circles' Radii Equal?: " + circle1.equals(circle2));

		// display the distance between two circles' origin
		System.out.println("Distance Between the Two Circles' Origins: " + circle1.distance(circle2));

		// display whether circle 1's size is smaller than the circle 2's size
		System.out.println("Is Circle 1 Smaller Than Circle 2?: " + circle1.isSmaller(circle2));

		// display whether circle 1's radius is smaller than circle 2's radius
		System.out.println("Is Circle 1's Radius Smaller than Circle 2?: " + circle1.radiusLarger(circle2));

		// display whether circle 1's diameter is larger than circle 2's diameter
		System.out.println("Is Circle 1's Diameter Larger than Circle 2's Diameter?: " + circle1.isLarger(circle2));

		// display comparison results between circle 1 and circle 2's diameters
		System.out.println(
				"How Does Circle 1's Size Compare to Circle 2? (1=Circle 1 is larger, 0=same, -1=Circle 1 is smaller): "
						+ circle1.compareTo(circle2));

		// display whether two circles have an intersecting area
		System.out.println("Does Two Circles Have an Instersecting Area?: " + circle1.intersects(circle2));

		// display the midpoint of the two circles
		System.out.println("The Midpoint of the Two Circles: " + circle1.midPoint(circle2));

	}

}