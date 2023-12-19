/*
 * CircleTester.java
 * Author:  Sean Payne 
 * Submission Date:  [04/02/21]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 				This program collects methods from the Circle program and then utilizes them. We create
 * the objects in this class and then print out our info. This is the program we see in our console.
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

		circle1.setRadius(-2.0);

		if (Math.abs(2 - circle1.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		} else {
			System.out.println("FAILED: Set Radius");
		}

		circle1.setX(-3.0);
		circle1.setY(4.0);

		System.out.println(circle1);

		circle2.setRadius(5.3);

		System.out.println(circle2);

		System.out.println("circle #1: ");
		System.out.println("Diameter: " + circle1.diameter());
		System.out.println("Area: " + circle1.area());
		System.out.println("Perimeter: " + circle1.perimeter());

		System.out.println("circle #2: ");
		System.out.println("Diameter: " + circle2.diameter());
		System.out.println("Area: " + circle2.area());
		System.out.println("Perimeter: " + circle2.perimeter());

		// prints if circle 1 is a unit circle 
		if (circle1.isUnitCircle()) {
			System.out.println("Circle #1 is a Unit Circle");
		} else {
			System.out.println("Circle #1 is a Unit Circle");
		}

		// prints is circle 2 is a unit circle
		if (circle2.isUnitCircle()) {
			System.out.println("Circle #2 is a Unit Circle");
		} else {
			System.out.println("Circle #2 is a Unit Circle");
		}

		// prints if the circles equal each other
		if (circle1.equals(circle2)) {
			System.out.println("Circle 1 equals Circle 2");
		} else {
			System.out.println("Circle 1 does not equal Circle 2");
		}

		// prints which circle is smaller
		if (circle2.isSmaller(circle1)) {
			System.out.println("Circle 1 is smaller than circle 2");
		} else {
			System.out.println("Circle 2 is smaller than circle 1");
		}

		// prints if circle 1 and 2 intersect
		if (circle1.intersects(circle2)) {
			System.out.println("Circle 1 and 2 intersect");
		} else {
			System.out.println("Circle 1 and 2 do not intersect");
		}

		System.out.println("The distance between circle 1 and 2 is: " + circle1.distance(circle2));

		/*
		 * Tests 
		 Test 1: 
		 circle1=center: (0.0,0.0) 
		 radius: 2.0 
		 circle2=center: (2.0,1.0)
		 radius: 1.0 
		 PASSED: Set Radius 
		 center: (-3.0,4.0) 
		 radius: 2.0 
		 center: (2.0,1.0) 
		 radius: 5.3 
		 circle #1: 
		 Diameter: 4.0 
		 Area: 12.566370614359172
		 Perimeter: 12.566370614359172 
		 circle #2: 
		 Diameter: 10.6 
		 Area: 88.24733763933727 
		 Perimeter: 33.3008821280518 
		 Circle #1 is a Unit Circle
		 Circle #2 is a Unit Circle 
		 Circle 1 does not equal Circle 2 
		 Circle 2 is smaller than circle 1 
		 Circle 1 and 2 intersect 
		 The distance between circle 1 and 2 is: 5.830951894845301
		 * Test 1 Over
		 Test 2:
		 circle1=center: (0.0,0.0)
         radius: 2.0
         circle2=center: (2.0,1.0)
         radius: 1.0
         FAILED: Set Radius
         center: (-20.0,10.0)
         radius: 9.0
         center: (2.0,1.0)
         radius: 20.3
         circle #1: 
         Diameter: 18.0
         Area: 254.46900494077323
         Perimeter: 56.548667764616276
         circle #2: 
         Diameter: 40.6
         Area: 1294.618916617818
         Perimeter: 127.54866173574561
         Circle #1 is a Unit Circle
         Circle #2 is a Unit Circle
         Circle 1 does not equal Circle 2
         Circle 2 is smaller than circle 1
         Circle 1 and 2 intersect
         The distance between circle 1 and 2 is: 23.769728648009426
		 */
	}

}
