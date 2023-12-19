/*
 * CircleTester.java
 * Author:  Jordan Arogeti 
 * Submission Date:  4/2/21
 *
 * Purpose: This program prints information gathered from the
 * methods of the other program. It has 15 test cases for checking
 * to see if the information is correct.
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
		
		System.out.println("Circle 1 Characteristics:");
		System.out.println("Center: (" + circle1.getX() + "," + circle1.getY() + ")");
		System.out.println("Radius: " + circle1.getRadius());
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		
		System.out.println("Circle 2 Characteristics:");
		System.out.println("Center: (" + circle2.getX() + "," + circle2.getY() + ")");
		System.out.println("Radius: " + circle2.getRadius());
		
		// print circle1 diameter, area and perimeter
		
		System.out.println("Circle 1 Diameter: " + circle1.diameter());
		System.out.println("Area: " + circle1.area());
		System.out.println("Perimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		
		System.out.println("Circle 2 Diameter: " + circle2.diameter());
		System.out.println("Area: " + circle2.area());
		System.out.println("Perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		
		System.out.println("Is Circle 1 a unit circle? " + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		
		System.out.println("Is Circle 2 a unit circle? " + circle2.isUnitCircle());

		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		// method public boolean equals(Circle anotherCircle)
		
		circle1.setRadius(4);
		circle2.setRadius(4);
		circle1.setX(4);
		circle1.setY(4);
		circle2.setX(4);
		circle2.setY(4);
		if ((circle1.getRadius() == circle2.getRadius()) &&
				(circle1.getX() == circle2.getX()) && (circle1.getY() == circle2.getY()))
			System.out.println("PASSED: Circles Equal");
		else
			System.out.println("FAILED: Circles Equal");
		
		circle1.setRadius(4);
		circle2.setRadius(3);
		circle1.setX(4);
		circle1.setY(1);
		circle2.setX(4);
		circle2.setY(5);
		if ((circle1.getRadius() == circle2.getRadius()) &&
				(circle1.getX() == circle2.getX()) && (circle1.getY() == circle2.getY()))
			System.out.println("PASSED: Circles Equal");
		else
			System.out.println("FAILED: Circles Equal");
		
		circle1.setRadius(10);
		circle2.setRadius(3);
		circle1.setX(0);
		circle1.setY(2);
		circle2.setX(9);
		circle2.setY(5);
		if ((circle1.getRadius() == circle2.getRadius()) &&
				(circle1.getX() == circle2.getX()) && (circle1.getY() == circle2.getY()))
			System.out.println("PASSED: Circles Equal");
		else
			System.out.println("FAILED: Circles Equal");
		
		// method double distance(Circle anotherCircle)
		
		circle1.setX(0);
		circle1.setY(2);
		circle2.setX(9);
		circle2.setY(5);
		double xValue = circle1.getX() - circle2.getX();
		double yValue = circle1.getY() - circle2.getY();
		double distance = Math.sqrt((Math.pow(xValue, 2)) + (Math.pow(yValue, 2)));
		if (distance < 10)
			System.out.println("PASSED: Distance between circles is less than 10");
		else
			System.out.println("FAILED: Distance between circles is greater than 10");
		
		circle1.setX(0);
		circle1.setY(2);
		circle2.setX(15);
		circle2.setY(20);
		xValue = circle1.getX() - circle2.getX();
		yValue = circle1.getY() - circle2.getY();
		distance = Math.sqrt((Math.pow(xValue, 2)) + (Math.pow(yValue, 2)));
		if (distance < 10)
			System.out.println("PASSED: Distance between circles is less than 10");
		else
			System.out.println("FAILED: Distance between circles is greater than 10");

		circle1.setX(0);
		circle1.setY(0);
		circle2.setX(0);
		circle2.setY(90);
		xValue = circle1.getX() - circle2.getX();
		yValue = circle1.getY() - circle2.getY();
		distance = Math.sqrt((Math.pow(xValue, 2)) + (Math.pow(yValue, 2)));
		if (distance < 10)
			System.out.println("PASSED: Distance between circles is less than 10");
		else
			System.out.println("FAILED: Distance between circles is greater than 10");
		
		// method public boolean isSmaller(Circle anotherCircle)
		
		circle1.setRadius(5);
		double diameter1 = circle1.getRadius() * 2;
		circle2.setRadius(2);
		double diameter2 = circle2.getRadius() * 2;
		if (diameter1 < diameter2)
			System.out.println("PASSED: circle 1 is smaller than circle 2");
		else
			System.out.println("FAILED: circle 1 is not smaller than circle 2");
		
		circle1.setRadius(10);
		diameter1 = circle1.getRadius() * 2;
		circle2.setRadius(11);
		diameter2 = circle2.getRadius() * 2;
		if (diameter1 < diameter2)
			System.out.println("PASSED: circle 1 is smaller than circle 2");
		else
			System.out.println("FAILED: circle 1 is not smaller than circle 2");
		
		circle1.setRadius(1);
		diameter1 = circle1.getRadius() * 2;
		circle2.setRadius(7);
		diameter2 = circle2.getRadius() * 2;
		if (diameter1 < diameter2)
			System.out.println("PASSED: circle 1 is smaller than circle 2");
		else
			System.out.println("FAILED: circle 1 is not smaller than circle 2");

		// method public int compareTo(Circle another Circle)
		
		circle1.setRadius(5);
		diameter1 = circle1.getRadius() * 2;
		circle2.setRadius(1);
		diameter2 = circle2.getRadius() * 2;
		if (diameter1 > diameter2)
			System.out.println("PASSED: Circle 1 is bigger than circle 2");
		else if (diameter1 < diameter2)
			System.out.println("FAILED: Circle 1 is smaller than circle 2");
		else
			System.out.println("PASSED/FAILED: Circle 1 is the same size as circle 2");
		
		circle1.setRadius(2);
		diameter1 = circle1.getRadius() * 2;
		circle2.setRadius(8);
		diameter2 = circle2.getRadius() * 2;
		if (diameter1 > diameter2)
			System.out.println("PASSED: Circle 1 is bigger than circle 2");
		else if (diameter1 < diameter2)
			System.out.println("FAILED: Circle 1 is smaller than circle 2");
		else
			System.out.println("PASSED/FAILED: Circle 1 is the same size as circle 2");

		circle1.setRadius(7);
		diameter1 = circle1.getRadius() * 2;
		circle2.setRadius(7);
		diameter2 = circle2.getRadius() * 2;
		if (diameter1 > diameter2)
			System.out.println("PASSED: Circle 1 is larger than circle 2");
		else if (diameter1 < diameter2)
			System.out.println("FAILED: Circle 1 is smaller than circle 2");
		else
			System.out.println("PASSED/FAILED: Circle 1 is the same size as circle 2");
		
		// method public boolean intersects(Circle another Circle)
		
		circle1.setRadius(7);
		circle2.setRadius(7);
		circle1.setX(0);
		circle1.setY(2);
		circle2.setX(15);
		circle2.setY(20);
		double radiusSum = circle1.getRadius() + circle2.getRadius();
		xValue = circle1.getX() - circle2.getX();
		yValue = circle1.getY() - circle2.getY();
		distance = Math.sqrt((Math.pow(xValue, 2)) + (Math.pow(yValue, 2)));
		if (radiusSum >= distance)
			System.out.println("PASSED: circles intersect");
		else
			System.out.println("FAILED: circles do not intersect");
		
		circle1.setRadius(6);
		circle2.setRadius(15);
		circle1.setX(10);
		circle1.setY(7);
		circle2.setX(9);
		circle2.setY(20);
		radiusSum = circle1.getRadius() + circle2.getRadius();
		xValue = circle1.getX() - circle2.getX();
		yValue = circle1.getY() - circle2.getY();
		distance = Math.sqrt((Math.pow(xValue, 2)) + (Math.pow(yValue, 2)));
		if (radiusSum >= distance)
			System.out.println("PASSED: circles intersect");
		else
			System.out.println("FAILED: circles do not intersect");
		
		circle1.setRadius(8);
		circle2.setRadius(1);
		circle1.setX(1);
		circle1.setY(4);
		circle2.setX(2);
		circle2.setY(5);
		radiusSum = circle1.getRadius() + circle2.getRadius();
		xValue = circle1.getX() - circle2.getX();
		yValue = circle1.getY() - circle2.getY();
		distance = Math.sqrt((Math.pow(xValue, 2)) + (Math.pow(yValue, 2)));
		if (radiusSum >= distance)
			System.out.println("PASSED: circles intersect");
		else
			System.out.println("FAILED: circles do not intersect");

			
		
		
		
			
		
		
	} // main 
	
} // class