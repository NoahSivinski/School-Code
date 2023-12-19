/*
 * CircleTester.java
 * Author:  Anna Kerber
 * Submission Date:  4/1/21
 *
 * Purpose: The purpose of this program is to test the methods of 
 * the Circle class by printing out whether each method test was
 * passed or failed. 
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

		// print circle1 characteristics (center and radius), use a statement similar
		// to the previous println statements. Note that is not necessary to call
		// the method toString, why?
		System.out.println("\ncircle1=name: "+circle1.getName() + "\ncenter: (" + circle1.getX() + "," + circle1.getY() + ")\nradius: " + circle1.getRadius());

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println("\ncircle2=name: "+circle2.getName() + "\ncenter: (" + circle2.getX() + "," + circle2.getY() + ")\nradius: " + circle2.getRadius());


		// print circle1 diameter, area and perimeter
		System.out.println("\ndiameter: " + circle1.diameter() + "\narea: " + circle1.area() + "\nperimeter: "
				+ circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("\ndiameter: " + circle2.diameter() + "\narea: " + circle2.area() + "\nperimeter: "
				+ circle2.perimeter());

		// display whether circle1 is a unit circle
		System.out.println("\n"+circle1.getName() + " is a unit circle: true/false\n" + circle1.isUnitCircle());

		// display whether circle2 is a unit circle
		System.out.println("\n"+circle2.getName() + " is a unit circle: true/false\n" + circle2.isUnitCircle());
		
		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.
		
		
		//Testing .equals() method
		circle1.setRadius(1.0);
		circle1.setX(4.0);
		circle1.setY(5.0);
		circle2.setRadius(1.0);
		circle2.setX(4.0);
		circle2.setY(5.0);
		System.out.println("\ncircle1=name: "+circle1.getName() + "\ncenter: (" + circle1.getX() + "," + circle1.getY() + ")\nradius: " + circle1.getRadius());
		System.out.println("circle2=name: "+circle2.getName() + "\ncenter: (" + circle2.getX() + "," + circle2.getY() + ")\nradius: " + circle2.getRadius());
		
		//circle1.equals(circle2) should return true
		if (circle1.equals(circle2))
			System.out.println("PASSED: Equals");
		else
			System.out.println("FAILED: Equals");
		
		circle1.setRadius(1.0);
		circle1.setX(4.0);
		circle1.setY(5.0);
		circle2.setRadius(2.0);
		circle2.setX(4.0);
		circle2.setY(5.0);
		System.out.println("\ncircle1=name: "+circle1.getName() + "\ncenter: (" + circle1.getX() + "," + circle1.getY() + ")\nradius: " + circle1.getRadius());
		System.out.println("circle2=name: "+circle2.getName() + "\ncenter: (" + circle2.getX() + "," + circle2.getY() + ")\nradius: " + circle2.getRadius());
		
		//circle1.equals(circle2) should return false
		if (!circle1.equals(circle2))
			System.out.println("PASSED: Equals");
		else
			System.out.println("FAILED: Equals");
		
		circle1.setRadius(1.0);
		circle1.setX(4.5);
		circle1.setY(5.0);
		circle2.setRadius(2.7);
		circle2.setX(4.9);
		circle2.setY(5.6);
		System.out.println("\ncircle1=name: "+circle1.getName() + "\ncenter: (" + circle1.getX() + "," + circle1.getY() + ")\nradius: " + circle1.getRadius());
		System.out.println("circle2=name: "+circle2.getName() + "\ncenter: (" + circle2.getX() + "," + circle2.getY() + ")\nradius: " + circle2.getRadius());
		
		//circle2.equals(circle1) should return false
		if (!circle2.equals(circle1))
			System.out.println("PASSED: Equals");
		else
			System.out.println("FAILED: Equals");
		
		
		//Testing .distance() method
		circle1.setX(4.0);
		circle1.setY(5.0);
		circle2.setX(4.0);
		circle2.setY(5.0);
		System.out.println("\ncircle1=name: "+circle1.getName() + "\ncenter: (" + circle1.getX() + "," + circle1.getY() + ")");
		System.out.println("circle2=name: "+circle2.getName() + "\ncenter: (" + circle2.getX() + "," + circle2.getY() + ")");		
		
		//circle1.distance(circle2) should return 0.0
		if (Math.abs(circle1.distance(circle2))<THRESHOLD) {
			System.out.println("PASSED: Distance");
		}
		else {
			System.out.println("FAILED: Distance");
		}
		
		circle1.setX(4.5);
		circle1.setY(6.9);
		circle2.setX(5.0);
		circle2.setY(7.4);
		System.out.println("\ncircle1=name: "+circle1.getName() + "\ncenter: (" + circle1.getX() + "," + circle1.getY() + ")");
		System.out.println("circle2=name: "+circle2.getName() + "\ncenter: (" + circle2.getX() + "," + circle2.getY() + ")");

		//circle1.distance(circle2) should return ~0.7071067812
		if (Math.abs(circle1.distance(circle2)-0.7071067812)<THRESHOLD)
			System.out.println("PASSED: Distance");
		else
			System.out.println("FAILED: Distance");
		
		circle1.setX(-2.3);
		circle1.setY(-0.9);
		circle2.setX(5.7);
		circle2.setY(-4.4);
		System.out.println("\ncircle1=name: "+circle1.getName() + "\ncenter: (" + circle1.getX() + "," + circle1.getY() + ")");
		System.out.println("circle2=name: "+circle2.getName() + "\ncenter: (" + circle2.getX() + "," + circle2.getY() + ")");		

		//circle1.distance(circle2) should return ~8.732124598
		if (Math.abs(circle1.distance(circle2)-8.732124598)<THRESHOLD)
			System.out.println("PASSED: Distance");
		else
			System.out.println("FAILED: Distance");
		
		
		//Testing .isSmaller() method
		circle1.setRadius(2.0);
		circle2.setRadius(3.0);
		System.out.println("\ncircle1=name: "+circle1.getName() + "\nradius: "+circle1.getRadius());
		System.out.println("circle2=name: "+circle2.getName() + "\nradius: "+circle2.getRadius());
		
		//circle1.isSmaller(circle2) should return true
		if (circle1.isSmaller(circle2))
			System.out.println("PASSED: Is Smaller");
		else
			System.out.println("FAILED: Is Smaller");

		circle1.setRadius(3.0);
		circle2.setRadius(3.0);
		System.out.println("\ncircle1=name: "+circle1.getName() + "\nradius: "+circle1.getRadius());
		System.out.println("circle2=name: "+circle2.getName() + "\nradius: "+circle2.getRadius());
		
		//circle1.isSmaller(circle2) should return false
		if (!circle1.isSmaller(circle2))
			System.out.println("PASSED: Is Smaller");
		else
			System.out.println("FAILED: Is Smaller");
		
		circle1.setRadius(3.7);
		circle2.setRadius(3.0);
		System.out.println("\ncircle1=name: "+circle1.getName() + "\nradius: "+circle1.getRadius());
		System.out.println("circle2=name: "+circle2.getName() + "\nradius: "+circle2.getRadius());
		
		//circle2.isSmaller(circle1) should return true
		if (circle2.isSmaller(circle1))
			System.out.println("PASSED: Is Smaller");
		else
			System.out.println("FAILED: Is Smaller");
		
		//Testing .compareTo()
		circle1.setRadius(3.09);
		circle2.setRadius(4.2);
		System.out.println("\ncircle1=name: "+circle1.getName() + "\nradius: "+circle1.getRadius());
		System.out.println("circle2=name: "+circle2.getName() + "\nradius: "+circle2.getRadius());
		
		//circle1.compareTo(circle2) should return -1
		if (circle1.compareTo(circle2)==-1)
			System.out.println("PASSED: Compare To");
		else
			System.out.println("FAILED: Compare To");
		
		circle1.setRadius(56.9);
		circle2.setRadius(4.703);
		System.out.println("\ncircle1=name: "+circle1.getName() + "\nradius: "+circle1.getRadius());
		System.out.println("circle2=name: "+circle2.getName() + "\nradius: "+circle2.getRadius());
		
		//circle1.compareTo(circle2) should return 0
		if (circle1.compareTo(circle2)==0)
			System.out.println("PASSED: Compare To");
		else
			System.out.println("FAILED: Compare To");
		
		circle1.setRadius(4.703);
		circle2.setRadius(4.703);
		System.out.println("\ncircle1=name: "+circle1.getName() + "\nradius: "+circle1.getRadius());
		System.out.println("circle2=name: "+circle2.getName() + "\nradius: "+circle2.getRadius());
		
		//circle1.compareTo(circle2) should return 0
		if (circle1.compareTo(circle2)==0)
			System.out.println("PASSED: Compare To");
		else
			System.out.println("FAILED: Compare To");
		
		//Testing .intersects() method
		circle1.setRadius(1.0);
		circle1.setX(4.5);
		circle1.setY(5.0);
		circle2.setRadius(2.7);
		circle2.setX(4.9);
		circle2.setY(5.6);
		System.out.println("\ncircle1=name: "+circle1.getName() + "\ncenter: (" + circle1.getX() + "," + circle1.getY() + ")\nradius: " + circle1.getRadius());
		System.out.println("circle2=name: "+circle2.getName() + "\ncenter: (" + circle2.getX() + "," + circle2.getY() + ")\nradius: " + circle2.getRadius());
		
		//circle1.intersects(circle2) should return true
		if (circle1.intersects(circle2))
			System.out.println("PASSED: Intersects");
		else
			System.out.println("FAILED: Intersects");
		
		circle1.setRadius(2.0);
		circle1.setX(-6.5);
		circle1.setY(-5.7);
		circle2.setRadius(0.7);
		circle2.setX(4.2);
		circle2.setY(5.9);
		System.out.println("\ncircle1=name: "+circle1.getName() + "\ncenter: (" + circle1.getX() + "," + circle1.getY() + ")\nradius: " + circle1.getRadius());
		System.out.println("circle2=name: "+circle2.getName() + "\ncenter: (" + circle2.getX() + "," + circle2.getY() + ")\nradius: " + circle2.getRadius());
		
		//circle1.intersects(circle2) should return false
		if (!circle1.intersects(circle2))
			System.out.println("PASSED: Intersects");
		else
			System.out.println("FAILED: Intersects");
		
		circle1.setRadius(1.0);
		circle1.setX(0.5);
		circle1.setY(2.0);
		circle2.setRadius(14.7);
		circle2.setX(-4.3);
		circle2.setY(2.9);
		System.out.println("\ncircle1=name: "+circle1.getName() + "\ncenter: (" + circle1.getX() + "," + circle1.getY() + ")\nradius: " + circle1.getRadius());
		System.out.println("circle2=name: "+circle2.getName() + "\ncenter: (" + circle2.getX() + "," + circle2.getY() + ")\nradius: " + circle2.getRadius());
		
		//circle1.intersects(circle2) should return true
		if (circle1.intersects(circle2))
			System.out.println("PASSED: Intersects");
		else
			System.out.println("FAILED: Intersects");


	}

}
