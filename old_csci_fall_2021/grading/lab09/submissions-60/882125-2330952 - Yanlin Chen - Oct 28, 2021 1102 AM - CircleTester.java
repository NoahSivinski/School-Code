/*
 * [CSCI 1301].java
 * Author:  [Yanlin Chen] 
 * Submission Date:  [10/29/2021]
 *
 * Purpose: Compare two circles.
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
//  of the class Circle. Use the default constructor
//  in the Circle class to create Circle objects. 
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
		System.out.println("diameter: " + circle1.diameter());
		System.out.println("area: " + circle1.area());
		System.out.println("perimeter: " + circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("diameter: " + circle2.diameter());
		System.out.println("area: " + circle2.area());
		System.out.println("perimeter: " + circle2.perimeter());

		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle() == true) {
			System.out.println("Circle1 is a unit circle");
		}
		else {
			System.out.println("Circle1 is not a unit circle");
		}

		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle() == true) {
			System.out.println("Circle2 is a unit circle");
		}
		else {
			System.out.println("Circle2 is not a unit circle");
		}

		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.

		//test 1 --------------------------------------------------
		/**
		 * circle1: (2,2) with radius of 2
		 * circle2: (-2,2) with radius of 2
		 */
		circle1.setX(2);
		circle1.setY(2);
		circle1.setRadius(2);
		circle2.setX(-2);
		circle2.setY(2);
		circle2.setRadius(2);
		//test the set x
		if (Math.abs(circle1.getX() - 2) < THRESHOLD)
			System.out.println("PASSED: Set X");
		else
			System.out.println("FAILED: Set X");
		//test the set y
		if (Math.abs(circle2.getY() - 2) < THRESHOLD)
			System.out.println("PASSED: Set Y");
		else
			System.out.println("FAILED: Set Y");
		//test the set radius
		if (Math.abs(circle1.getRadius() - 2) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		//test the radius negative
		circle2.setRadius(-2);
		if (Math.abs(circle1.getRadius() - 2) < THRESHOLD)
			System.out.println("PASSED: Set Radius (negative)");
		else
			System.out.println("FAILED: Set Radius (negative)");
		//test the diameter
		if (Math.abs(circle1.diameter() - (2 * circle1.getRadius())) < THRESHOLD)
			System.out.println("PASSED: diameter()");
		else
			System.out.println("FAILED: diameter()");
		//test the area
		if (Math.abs(circle1.getRadius()) - (Math.PI*circle1.getRadius()*circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: area()");
		else
			System.out.println("FAILED: area()");
		//test the perimeter
		if (Math.abs(circle1.perimeter()) - (Math.PI*circle1.getRadius()*2) < THRESHOLD)
			System.out.println("PASSED: perimeter()");
		else
			System.out.println("FAILED: perimeter()");
		//test the isUnitCircle
		if (circle1.isUnitCircle() == false)
			System.out.println("PASSED: isUnitCircle()");
		else
			System.out.println("FAILED: isUnitCircle()");
		//test the equals
		if (circle1.equals(circle2) == false)
			System.out.println("PASSED: equals()");
		else 
			System.out.println("FAILED: equals()");
		//test the intersects()
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: intersects()");
		else
			System.out.println("FAILED: intersects()");
		//test the isSmaller
		if (circle1.isSmaller(circle2) == false)
			System.out.println("PASSED: isSmaller()");
		else
			System.out.println("FAILED: isSmaller()");
		//test the compareTo
		if (circle1.compareTo(circle2) == 0)
			System.out.println("PASSED: compareTo()");
		else
			System.out.println("FAILED: compareTo()");
		//test the distance
		if ((Math.abs(circle1.distance(circle2) - 4) < THRESHOLD))
			System.out.println("PASSED: distance");
		else
			System.out.println("FAILED: distance");

		//test 2 --------------------------------------------------
		/**
		 * circle1: (2,2) with radius of 4
		 * circle2: (-3,3) with radius of 3
		 */
		circle1.setX(2);
		circle1.setY(2);
		circle1.setRadius(4);
		circle2.setX(-3);
		circle2.setY(3);
		circle2.setRadius(3);
		//test the set x
		if (Math.abs(circle2.getX() + 3) < THRESHOLD)
			System.out.println("PASSED: Set X");
		else
			System.out.println("FAILED: Set X");
		//test the set y
		if (Math.abs(circle2.getY() - 3) < THRESHOLD)
			System.out.println("PASSED: Set Y");
		else
			System.out.println("FAILED: Set Y");
		//test the set radius
		if (Math.abs(circle1.getRadius() - 4) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		//test the radius negative
		circle2.setRadius(-10);
		if (Math.abs(circle1.getRadius() - 4) < THRESHOLD)
			System.out.println("PASSED: Set Radius (negative)");
		else
			System.out.println("FAILED: Set Radius (negative)");
		//test the diameter
		if (Math.abs(circle1.diameter() - (2 * circle1.getRadius())) < THRESHOLD)
			System.out.println("PASSED: diameter()");
		else
			System.out.println("FAILED: diameter()");
		//test the area
		if (Math.abs(circle1.getRadius()) - (Math.PI*circle1.getRadius()*circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: area()");
		else
			System.out.println("FAILED: area()");
		//test the perimeter
		if (Math.abs(circle1.perimeter()) - (Math.PI*circle1.getRadius()*2) < THRESHOLD)
			System.out.println("PASSED: perimeter()");
		else
			System.out.println("FAILED: perimeter()");
		//test the isUnitCircle
		if (circle1.isUnitCircle() == false)
			System.out.println("PASSED: isUnitCircle()");
		else
			System.out.println("FAILED: isUnitCircle()");
		//test the equals
		if (circle1.equals(circle2) == false)
			System.out.println("PASSED: equals()");
		else 
			System.out.println("FAILED: equals()");
		//test the intersects()
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: intersects()");
		else
			System.out.println("FAILED: intersects()");
		//test the isSmaller
		if (circle1.isSmaller(circle2) == false)
			System.out.println("PASSED: isSmaller()");
		else
			System.out.println("FAILED: isSmaller()");
		//test the compareTo
		if (circle1.compareTo(circle2) == 1)
			System.out.println("PASSED: compareTo()");
		else
			System.out.println("FAILED: compareTo()");
		//test the distance
		if ((Math.abs(circle1.distance(circle2) - Math.sqrt(26)) < THRESHOLD))
			System.out.println("PASSED: distance()");
		else
			System.out.println("FAILED: distance()");
		
		//test 3 ------------------------------------------------
		/**
		 * circle1: (2,2) with radius of 4
		 * circle2: (2,2) with radius of 4
		 */
		circle1.setX(2);
		circle1.setY(2);
		circle1.setRadius(4);
		circle2.setX(2);
		circle2.setY(2);
		circle2.setRadius(4);
		//test the set x
		if (Math.abs(circle2.getX() - 2) < THRESHOLD)
			System.out.println("PASSED: Set X");
		else
			System.out.println("FAILED: Set X");
		//test the set y
		if (Math.abs(circle2.getY() - 2) < THRESHOLD)
			System.out.println("PASSED: Set Y");
		else
			System.out.println("FAILED: Set Y");
		//test the set radius
		if (Math.abs(circle1.getRadius() - 4) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		//test the radius negative
		circle2.setRadius(-10);
		if (Math.abs(circle1.getRadius() - 4) < THRESHOLD)
			System.out.println("PASSED: Set Radius (negative)");
		else
			System.out.println("FAILED: Set Radius (negative)");
		//test the diameter
		if (Math.abs(circle1.diameter() - (2 * circle1.getRadius())) < THRESHOLD)
			System.out.println("PASSED: diameter()");
		else
			System.out.println("FAILED: diameter()");
		//test the area
		if (Math.abs(circle1.getRadius()) - (Math.PI*circle1.getRadius()*circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: area()");
		else
			System.out.println("FAILED: area()");
		//test the perimeter
		if (Math.abs(circle1.perimeter()) - (Math.PI*circle1.getRadius()*2) < THRESHOLD)
			System.out.println("PASSED: perimeter()");
		else
			System.out.println("FAILED: perimeter()");
		//test the isUnitCircle
		if (circle1.isUnitCircle() == false)
			System.out.println("PASSED: isUnitCircle()");
		else
			System.out.println("FAILED: isUnitCircle()");
		//test the equals
		if (circle1.equals(circle2) == true)
			System.out.println("PASSED: equals()");
		else 
			System.out.println("FAILED: equals()");
		//test the intersects()
		if (circle1.intersects(circle2) == true)
			System.out.println("PASSED: intersects()");
		else
			System.out.println("FAILED: intersects()");
		//test the isSmaller
		if (circle1.isSmaller(circle2) == false)
			System.out.println("PASSED: isSmaller()");
		else
			System.out.println("FAILED: isSmaller()");
		//test the compareTo
		if (circle1.compareTo(circle2) == 0) //equal
			System.out.println("PASSED: compareTo()");
		else
			System.out.println("FAILED: compareTo()");
		//test the distance
		if ((Math.abs(circle1.distance(circle2) - 0) < THRESHOLD))
			System.out.println("PASSED: distance()");
		else
			System.out.println("FAILED: distance()");
	}
}
