/*
 * CircleTester.java
 * Author:  Raegan Girdley
 * Submission Date:  10/29/2021
 *
 * Purpose: Tests Circle.java methods
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
		System.out.println("name: " + circle1.getName() + "\ncenter: (" + circle1.getX() + "," + circle1.getY() + ")\nradius: " + circle1.getRadius());
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("name: " + circle2.getName() + "\ncenter: (" + circle2.getX() + "," + circle2.getY() + ")\nradius: " + circle2.getRadius());
		
		// print circle1 diameter, area and perimeter
		System.out.println("name: Circle 1");
		System.out.println("diameter: " + circle1.diameter() + "\narea: " + circle1.area() + "\nperimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("name: Circle 2");
		System.out.println("diameter: " + circle2.diameter() + "\narea: " + circle2.area() + "\nperimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle()) {
			System.out.println("Circle 1 is a unit circle.");
		}
		else {
			System.out.println("Circle 1 is not a unit circle.");
		}
		
		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle()) {
			System.out.println("Circle 2 is a unit circle.");
		}
		else {
			System.out.println("Circle 2 is not a unit circle.");
		}
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		System.out.println("\nHere are the additional tests:\n");
		Circle circle3 = new Circle();
		circle3.setName("Circle 3");
		circle3.setX(10);
		circle3.setY(14);
		circle3.setRadius(2);
		Circle circle4 = new Circle();
		circle4.setName("Circle 4");
		circle4.setX(3);
		circle4.setY(5);
		circle4.setRadius(8);
		Circle circle5 = new Circle();
		circle5.setName("Circle 5");
		circle5.setX(0);
		circle5.setY(0);
		circle5.setRadius(1);
		
		//prints area, perimeter, and diameter of each circle
		System.out.println("Circle 3:");
		System.out.println("area: " + circle3.area() + "\nperimeter: " + circle3.perimeter() + 
				"\ndiameter: " + circle3.diameter());
		
		System.out.println("Circle 4:");
		System.out.println("area: " + circle4.area() + "\nperimeter: " + circle4.perimeter() + 
				"\ndiameter: " + circle4.diameter());
		
		System.out.println("Circle 5:");
		System.out.println("area: " + circle5.area() + "\nperimeter: " + circle5.perimeter() + 
				"\ndiameter: " + circle5.diameter());
		
		//tests unit circle
		System.out.println("Circle 3: " + circle3.isUnitCircle());
		System.out.println("Circle 4: " + circle4.isUnitCircle());
		System.out.println("Circle 5: " + circle5.isUnitCircle());
		
		//toString
		System.out.println(circle3.toString());
		System.out.println(circle4.toString());
		System.out.println(circle5.toString());
		
		//equals
		System.out.println(circle3.equals(circle4));
		System.out.println(circle4.equals(circle3));
		System.out.println(circle3.equals(circle5));
		System.out.println(circle5.equals(circle3));
		System.out.println(circle4.equals(circle5));
		System.out.println(circle5.equals(circle4));
		System.out.println(circle3.equals(circle3));
		
		//distance
		System.out.println(circle3.distance(circle4));
		System.out.println(circle4.distance(circle3));
		System.out.println(circle5.distance(circle4));
		
		//isSmaller
		System.out.println(circle3.isSmaller(circle4));
		System.out.println(circle4.isSmaller(circle3));
		System.out.println(circle5.isSmaller(circle4));
		
		//compareTo
		System.out.println(circle3.compareTo(circle4));
		System.out.println(circle4.compareTo(circle3));
		System.out.println(circle5.compareTo(circle4));
		System.out.println(circle5.compareTo(circle5));
		
		//intersects
		System.out.println(circle3.intersects(circle4));
		System.out.println(circle4.intersects(circle3));
		System.out.println(circle5.intersects(circle4));
		System.out.println(circle5.intersects(circle3));
		
	}
	
}
