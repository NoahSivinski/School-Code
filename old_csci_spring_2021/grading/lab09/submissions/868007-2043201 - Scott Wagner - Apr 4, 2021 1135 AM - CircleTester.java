//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
/*
 * CircleTester.java
 * Author:  Scott Wagner 
 * Submission Date:  4/2/2021
 *
 * Purpose: A client to test the functionality of objects (predefined by TA.)  
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

		// print circle1 characteristics (center and radius), use a statement similar
		// to the previous println statements. Note that is not necessary to call
		// the method toString, why?
		System.out.println(circle1);

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
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
		System.out.println(circle1.isUnitCircle());

		// display whether circle2 is a unit circle
		System.out.println(circle2.isUnitCircle());

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.

		// Circle getName & setName method test case 1
		circle1.setName("cIrClE6421");
		if (circle1.getName().equals("cIrClE6421")) {
			System.out.println("Passed: getName/setName Method Test Case 1");
		} else {
			System.out.println("Failed: getName/setName Method Test Case 1");
		}

		// Circle getName & setName method test case 2
		circle1.setName("5685654.(*&#$@$");
		if (circle1.getName().equals("5685654.(*&#$@$")) {
			System.out.println("Passed: getName/setName Method Test Case 2");
		} else {
			System.out.println("Failed: getName/setName Method Test Case 2");
		}

		// Circle getName & setName method test case 3
		circle2.setName("GafojhOFJHDS32423049023479");
		if (circle2.getName().equals("GafojhOFJHDS32423049023479")) {
			System.out.println("Passed: getName/setName Method Test Case 3");
		} else {
			System.out.println("Failed: getName/setName Method Test Case 3");
		}
		circle1.setName("circle1");
		circle2.setName("circle2");

		// Circle getX, getY, setX, setY method test case 1
		circle1.setX(60);
		circle1.setY(30);

		if (circle1.getX() == 60 && circle1.getY() == 30) {
			System.out.println("Passed: getX/getY/setX/setY Method Test Case 1");
		} else {
			System.out.println("Failed: getX/getY/setX/setY Method Test Case 1");
		}

		// Circle getX, getY, setX, setY method test case 2
		circle2.setX(-943);
		circle2.setY(30);

		if (circle2.getX() == -943 && circle2.getY() == 30) {
			System.out.println("Passed: getX/getY/setX/setY Method Test Case 2");
		} else {
			System.out.println("Failed: getX/getY/setX/setY Method Test Case 2");
		}

		// Circle getX, getY, setX, setY method test case 3
		circle1.setX(95089348);
		circle1.setY(-9234798);

		if (circle1.getX() == 95089348 && circle1.getY() == -9234798) {
			System.out.println("Passed: getX/getY/setX/setY Method Test Case 3");
		} else {
			System.out.println("Failed: getX/getY/setX/setY Method Test Case 3");
		}

		// Circle setRadius/getRadius method test case 1
		circle1.setRadius(14);
		if (circle1.getRadius() == 14) {
			System.out.println("Passed: setRadius/getRadius Method Test Case 1");
		} else {
			System.out.println("Failed: setRadius/getRadius Method Test Case 1");
		}

		// Circle setRadius/getRadius method test case 2
		circle1.setRadius(-30);
		if (circle1.getRadius() == 14) {
			System.out.println("Passed: setRadius/getRadius Method Test Case 1");
		} else {
			System.out.println("Failed: setRadius/getRadius Method Test Case 2");
		}

		// Circle setRadius/getRadius method test case 3
		circle1.setRadius(109283091823.09234590238);
		if (circle1.getRadius() == 109283091823.092345902380000000) {
			System.out.println("Passed: setRadius/getRadius Method Test Case 3");
		} else {
			System.out.println("Failed: setRadius/getRadius Method Test Case 3");
		}

		// Circle area method test case 1
		circle1.setRadius(5);
		if (Math.abs(circle1.area() - 78.53981634) < THRESHOLD) {
			System.out.println("Passed: area Method Test Case 1");
		} else {
			System.out.println("Failed: area Method Test Case 1");
		}

		// Circle area method test case 2
		circle1.setRadius(-16);
		if (Math.abs(circle1.area() - 78.53981634) < THRESHOLD) {
			System.out.println("Passed: area Method Test Case 2");
		} else {
			System.out.println("Failed: area Method Test Case 2");
		}

		// Circle area method test case 3
		circle1.setRadius(2);
		if (Math.abs(circle1.area() - 12.566370614359172) < THRESHOLD) {
			System.out.println("Passed: area Method Test Case 3");
		} else {
			System.out.println("Failed: area Method Test Case 3");
		}

		// Circle perimeter method test case 1
		circle1.setRadius(15);
		if (Math.abs(circle1.perimeter() - 94.24777960769379) < THRESHOLD) {
			System.out.println("Passed: perimeter Method Test Case 1");
		} else {
			System.out.println("Failed: perimeter Method Test Case 1");
		}

		// Circle perimeter method test case 2
		circle1.setRadius(-9);
		if (Math.abs(circle1.perimeter() - 94.24777960769379) < THRESHOLD) {
			System.out.println("Passed: perimeter Method Test Case 2");
		} else {
			System.out.println("Failed: perimeter Method Test Case 2");
		}

		// Circle perimeter method test case 3
		circle1.setRadius(19);
		if (Math.abs(circle1.perimeter() - 119.38052083641213) < THRESHOLD) {
			System.out.println("Passed: perimeter Method Test Case 3");
		} else {
			System.out.println("Failed: perimeter Method Test Case 3");
		}

		// Circle diameter method test case 1
		circle1.setRadius(5);
		if (Math.abs(circle1.diameter() - 10) < THRESHOLD) {
			System.out.println("Passed: diameter Method Test Case 1");
		} else {
			System.out.println("Failed: diameter Method Test Case 1");
		}

		// Circle diameter method test case 2
		circle1.setRadius(18);
		if (Math.abs(circle1.diameter() - 36) < THRESHOLD) {
			System.out.println("Passed: diameter Method Test Case 2");
		} else {
			System.out.println("Failed: diameter Method Test Case 2");
		}

		// Circle diameter method test case 3
		circle1.setRadius(-12);
		if (Math.abs(circle1.diameter() - 36) < THRESHOLD) {
			System.out.println("Passed: diameter Method Test Case 3");
		} else {
			System.out.println("Failed: diameter Method Test Case 3");
		}

		// Circle isUnitCircle method test case 1
		circle1.setRadius(1);
		circle1.setX(0);
		circle1.setY(0);
		if (circle1.isUnitCircle()) {
			System.out.println("Passed: isUnitCircle Method Test Case 1");
		} else {
			System.out.println("Failed: isUnitCircle Method Test Case 1");
		}

		// Circle isUnitCircle method test case 2
		circle2.setRadius(1);
		circle2.setX(4);
		circle2.setY(0);
		if (!circle2.isUnitCircle()) {
			System.out.println("Passed: isUnitCircle Method Test Case 2");
		} else {
			System.out.println("Failed: isUnitCircle Method Test Case 2");
		}

		// Circle isUnitCircle method test case 3
		circle1.setRadius(-9);
		circle1.setX(0);
		circle1.setY(0);
		if (circle1.isUnitCircle()) {
			System.out.println("Passed: isUnitCircle Method Test Case 3");
		} else {
			System.out.println("Failed: isUnitCircle Method Test Case 3");
		}

		// Circle equals method test case 1: radii values.
		circle1.setRadius(1);
		circle2.setRadius(1);
		if (Math.abs(circle1.getRadius() - circle2.getRadius()) < THRESHOLD) {
			System.out.println("Passed: Equals Method Test Case 1");
		} else {
			System.out.println("Failed: Equals Method Test Case 1");
		}

		// Circle equals method test case 2: X values
		circle1.setX(1);
		circle2.setX(1);
		if (Math.abs(circle1.getX() - circle2.getX()) < THRESHOLD) {
			System.out.println("Passed: Equals Method Test Case 2");
		} else {
			System.out.println("Failed: Equals Method Test Case 2");
		}

		// Circle equals method test case 3: Y values
		circle1.setY(1);
		circle2.setY(1);
		if (Math.abs(circle1.getY() - circle2.getY()) < THRESHOLD) {
			System.out.println("Passed: Equals Method Test Case 3");
		} else {
			System.out.println("Failed: Equals Method Test Case 3");
		}

		// Distance test case 1
		circle1.setX(4);
		circle1.setY(3);
		circle2.setX(7);
		circle2.setY(8);
		if (circle1.distance(circle2) - 5.830952 < THRESHOLD) {
			System.out.println("Passed: Distance Test Case 1");
		} else {
			System.out.println("Failed: Distance Test Case 1");
		}

		// Distance test case 2
		circle1.setX(2);
		circle1.setY(9);
		circle2.setX(6);
		circle2.setY(18);
		if (circle1.distance(circle2) - 9.848858 < THRESHOLD) {
			System.out.println("Passed: Distance Test Case 2");
		} else {
			System.out.println("Failed: Distance Test Case 2");
		}

		// Distance test case 3
		circle1.setX(6);
		circle1.setY(16);
		circle2.setX(9);
		circle2.setY(14);
		if (3.605551 - circle1.distance(circle2) < THRESHOLD) {
			System.out.println("Passed: Distance Test Case 3");
		} else {
			System.out.println("Failed: Distance Test Case 3");
		}

		// isSmaller test case 1: circle1 < circle2
		circle1.setRadius(5.9);
		circle2.setRadius(10.015312419287);
		if (circle1.isSmaller(circle2) == true) {
			System.out.println("Passed: isSmaller Test Case 1");
		} else {
			System.out.println("Failed: isSmaller TestCase 1");
		}

		// isSmaller test case 2: circle1 > circle2
		circle1.setRadius(12.156161);
		circle2.setRadius(10.015312419287);
		if (circle1.isSmaller(circle2) != true) {
			System.out.println("Passed: isSmaller Test Case 2");
		} else {
			System.out.println("Failed: isSmaller TestCase 2");
		}

		// isSmaller test case 3: circle1 > circle2 (with an invalid radius)
		circle1.setRadius(2);
		circle1.setRadius(-13.9601951);
		circle2.setRadius(6);
		if (circle1.isSmaller(circle2) == true) {
			System.out.println("Passed: isSmaller Test Case 3");
		} else {
			System.out.println("Failed: isSmaller Test Case 3");
		}

		// compareTo test case 1: circle1 > circle2
		circle1.setRadius(4);
		circle2.setRadius(2);
		if (circle1.compareTo(circle2) == 1) {
			System.out.println("Passed: compareTo Test Case 1");
		} else {
			System.out.println("Failed: compareTo Test Case 1");
		}

		// compareTo test case 2: circle1 < circle2
		circle1.setRadius(2.92379847);
		circle2.setRadius(4.213123129379182739812);
		if (circle1.compareTo(circle2) == -1) {
			System.out.println("Passed: compareTo Test Case 2");
		} else {
			System.out.println("Failed: compareTo Test Case 2");
		}

		// compareTo test case 3: circle1 == circle2
		circle1.setRadius(4.0923);
		circle2.setRadius(4.0923);
		if (circle1.compareTo(circle2) == 0) {
			System.out.println("Passed: compareTo Test Case 3");
		} else {
			System.out.println("Failed: compareTo Test Case 3");
		}

		// intersects test case 1: distance < radii sum
		circle1.setRadius(4);
		circle2.setRadius(4);
		circle1.setX(2);
		circle2.setX(3);
		circle1.setY(2);
		circle2.setY(4);
		if (circle1.intersects(circle2) == true) {
			System.out.println("Passed: intersects Test Case 1");
		} else {
			System.out.println("Failed: intersects Test Case 1");
		}

		// intersects test case 2: distance > radii sum
		circle1.setRadius(4);
		circle2.setRadius(4);
		circle1.setX(19);
		circle2.setX(3);
		circle1.setY(14);
		circle2.setY(4);
		if (!circle1.intersects(circle2)) {
			System.out.println("Passed: intersects Test Case 2");
		} else {
			System.out.println("Failed: intersects Test Case 2");
		}

		// intersects test case 3: distance > radii sum (with invalid radius)

		circle1.setRadius(2);
		circle1.setRadius(-14); // Invalid, should default to 1.
		circle2.setRadius(1);
		circle1.setX(2);
		circle2.setX(1);
		circle1.setY(2);
		circle2.setY(1);
		if (circle1.intersects(circle2)) {
			System.out.println("Passed: intersects Test Case 3");
		} else {
			System.out.println("Failed: intersects Test Case 3");
		}

	}

}