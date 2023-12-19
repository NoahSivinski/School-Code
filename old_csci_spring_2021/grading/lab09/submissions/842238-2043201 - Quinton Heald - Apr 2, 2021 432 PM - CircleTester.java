/*
 * [CircleTester].java
 * Author:  [Quinton Heald] 
 * Submission Date:  [4-2-21]
 *
 * Purpose: This program is designed to test each of the methods 
 * created within the Circle class. When called, methods allow the user
 * to display the traits of a specific circle, reassign its radius, x or y value,
 * as well as compare one circle to another in terms of size. The last
 * portion of the program's output displays whether specific methods
 * (equals, distance, isSmaller, compareTo, and intersects) pass their
 * test cases. Each test case runs the methods through a different
 * set of values to test if the method handles the values correctly.
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
		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);

		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0);

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
		circle1.setX(-3.0);
		circle1.setY(4.0);

		System.out.println("circle1=" + circle1);
		// print circle1 characteristics (center and radius), use a statement similar
		// to the previous println statements. Note that is not necessary to call
		// the method toString, why?

		// since circle1 is set to the class Circle, it returns
		// the toString

		circle2.setRadius(5.3);
		// set the circle2 radius to 5.3

		System.out.println("circle2=" + circle2);
		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements

		System.out.println(circle1.diameter() + " " + circle1.area() + " " + circle1.perimeter());
		// print circle1 diameter, area and perimeter

		System.out.println(circle2.diameter() + " " + circle2.area() + " " + circle2.perimeter());
		// print circle2 diameter, area and perimeter

		System.out.println("Is circle1 a unit circle: " + circle1.isUnitCircle());
		// display whether circle1 is a unit circle

		System.out.println("Is circle2 a unit circle: " + circle2.isUnitCircle());
		// display whether circle2 is a unit circle

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.

		// equals method tester
		System.out.println();
		System.out.println("EQUALS METHOD TESTER");
		// test 1
		circle1.setRadius(2);
		circle1.setX(3);
		circle1.setY(2);

		circle2.setRadius(5);
		circle2.setX(1);
		circle2.setY(3);
		if (circle1.equals(circle2) == false) {
			System.out.println("PASSED: equals");
		} else {
			System.out.println("FAILED: equals");
		}
		// test 2
		circle1.setRadius(2);
		circle1.setX(3);
		circle1.setY(2);

		circle2.setRadius(2);
		circle2.setX(3);
		circle2.setY(2);
		if (circle1.equals(circle2) == true) {
			System.out.println("PASSED: equals");
		} else {
			System.out.println("FAILED: equals");
		}
		// test 3
		circle1.setRadius(1);
		circle1.setX(0);
		circle1.setY(0);

		circle2.setRadius(1);
		circle2.setX(0);
		circle2.setY(0);
		if (circle1.equals(circle2) == true) {
			System.out.println("PASSED: equals");
		} else {
			System.out.println("FAILED: equals");
		}

		// distance method tester
		System.out.println();
		System.out.println("DISTANCE METHOD TESTER");

		// test 1
		circle1.setRadius(2);
		circle1.setX(3);
		circle1.setY(2);

		circle2.setRadius(5);
		circle2.setX(1);
		circle2.setY(3);
		if ((Math.abs(circle1.distance(circle2) - 2.236067977) < THRESHOLD))
			System.out.println("PASSED: distance");
		else
			System.out.println("FAILED: distance");

		// test 2
		circle1.setRadius(2);
		circle1.setX(3);
		circle1.setY(2);

		circle2.setRadius(2);
		circle2.setX(3);
		circle2.setY(2);
		if ((Math.abs(circle1.distance(circle2) - circle2.distance(circle1)) < THRESHOLD))
			System.out.println("PASSED: distance");
		else
			System.out.println("FAILED: distance");

		// test 3
		circle1.setRadius(2);
		circle1.setX(6);
		circle1.setY(1);

		circle2.setRadius(5);
		circle2.setX(4);
		circle2.setY(7);
		if ((Math.abs(circle1.distance(circle2) - 6.32455532) < THRESHOLD)) {
			System.out.println("PASSED: distance");
		} else {
			System.out.println("FAILED: distance");
		}

		// isSmaller method tester
		System.out.println();
		System.out.println("ISSMALLER METHOD TESTER");

		// test 1
		circle1.setRadius(2);
		circle1.setX(3);
		circle1.setY(2);

		circle2.setRadius(5);
		circle2.setX(1);
		circle2.setY(3);
		if (circle1.isSmaller(circle2) == true) {
			System.out.println("PASSED: isSmaller");
		} else {
			System.out.println("FAILED: isSmaller");
		}

		// test 2
		circle1.setRadius(2);
		circle1.setX(3);
		circle1.setY(2);

		circle2.setRadius(2);
		circle2.setX(3);
		circle2.setY(2);
		if (circle1.isSmaller(circle2) == false) {
			System.out.println("PASSED: isSmaller");
		} else {
			System.out.println("FAILED: isSmaller");
		}

		// test 3
		circle1.setRadius(2);
		circle1.setX(6);
		circle1.setY(1);

		circle2.setRadius(5);
		circle2.setX(4);
		circle2.setY(7);
		if (circle1.isSmaller(circle2) == true) {
			System.out.println("PASSED: isSmaller");
		} else {
			System.out.println("FAILED: isSmaller");
		}

		// compareTo method tester
		System.out.println();
		System.out.println("COMPARETO METHOD TESTER");

		//test 1
		circle1.setRadius(2);
		circle1.setX(3);
		circle1.setY(2);

		circle2.setRadius(5);
		circle2.setX(1);
		circle2.setY(3);
		if (circle1.compareTo(circle2) == -1) {
			System.out.println("PASSED: compareTo");
		} else {
			System.out.println("FAILED: compareTo");
		}
		
		//test 2
		circle1.setRadius(2);
		circle1.setX(3);
		circle1.setY(2);

		circle2.setRadius(2);
		circle2.setX(3);
		circle2.setY(2);
		if (circle1.compareTo(circle2) == 0) {
			System.out.println("PASSED: compareTo");
		}else {
			System.out.println("FAILED: compareTo");
		}
		
		//test 3
		circle1.setRadius(10);
		circle1.setX(6);
		circle1.setY(1);

		circle2.setRadius(5);
		circle2.setX(4);
		circle2.setY(7);
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("PASSED: compareTo");
		}else {
			System.out.println("FAILED: compareTo");
		}

		// intersects method tester
		System.out.println();
		System.out.println("INTERSECTS METHOD TESTER");

		//test 1
		circle1.setRadius(2);
		circle1.setX(3);
		circle1.setY(2);

		circle2.setRadius(5);
		circle2.setX(1);
		circle2.setY(3);
		if(circle1.intersects(circle2) == true) {
			System.out.println("PASSED: intersects");
		} else {
			System.out.println("FAILED: intersects");
		}
		
		//test 2
		circle1.setRadius(2);
		circle1.setX(10);
		circle1.setY(15);

		circle2.setRadius(5);
		circle2.setX(1);
		circle2.setY(3);
		if(circle1.intersects(circle2) == false) {
			System.out.println("PASSED: intersects");
		} else {
			System.out.println("FAILED: intersects");
		}
		
		//test 3 
		circle1.setRadius(1);
		circle1.setX(0);
		circle1.setY(0);

		circle2.setRadius(1);
		circle2.setX(0);
		circle2.setY(0);
		if(circle1.intersects(circle2) == true) {
			System.out.println("PASSED: intersects");
		} else {
			System.out.println("FAILED: intersects");
		}
		
	}

}