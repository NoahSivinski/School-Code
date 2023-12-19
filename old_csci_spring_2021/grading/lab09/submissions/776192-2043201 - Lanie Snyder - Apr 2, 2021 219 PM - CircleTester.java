/*
 * CircleTester.java
 * Author:  Lanie Snyder
 * Submission Date:  April 2, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program tests the methods that were created in Circle.Java.
 * It has many test cases for the different methods.
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
		//the method toString, why? When you print the object, the complier will 
		//call the toString method for that object
		
	
		System.out.println("circle1="+circle1);
		
		// set the circle2 radius to 5.3
		
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		
		System.out.println("circle2="+circle2);
		
		// print circle1 diameter, area and perimeter
		
		System.out.println("diameter: " + circle1.diameter());
		System.out.println("area: " + circle1.area());
		System.out.println("perimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		
		System.out.println("diameter: " + circle2.diameter());
		System.out.println("area: " + circle2.area());
		System.out.println("perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		
		if (circle1.isUnitCircle())
		{
			System.out.println("circle1 is a unit circle");
		}
		else 
		{
			System.out.println("circle1 is not a unit circle");
		}
		
		// display whether circle2 is a unit circle
		
		if (circle2.isUnitCircle())
		{
			System.out.println("circle2 is a unit circle");
		}
		else 
		{
			System.out.println("circle2 is not a unit circle");
		}
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		
		//Testing equals 
		//First test. Circles are equal
		
		circle1.setRadius(3.88);
		circle2.setRadius(3.88);
		
		circle1.setX(12.5);
		circle1.setY(4.6);
		
		circle2.setX(12.5);
		circle2.setY(4.6);
		
		if (circle1.equals(circle2))
		{
			System.out.println("PASSED: equals test");
		}
		else 
		{
			System.out.println("FAILED: equals test");
		}
		
		//Second test. Should not be equal
		circle1.setRadius(3.88);
		circle2.setRadius(3.86);
		
		circle1.setX(12.5);
		circle1.setY(4.6);
		
		circle2.setX(12.5);
		circle2.setY(4.6);
		
		if (circle1.equals(circle2))
		{
			System.out.println("FAILED: equals test");
		}
		else 
		{
			System.out.println("PASSED: equals test");
		}
		
		//Third test. Should not be equal
	
		circle1.setRadius(3.88);
		circle2.setRadius(3.86);
				
		circle1.setX(3.7);
		circle1.setY(8.6);
				
		circle2.setX(12.2);
		circle2.setY(5.0);
				
		if (circle1.equals(circle2))
		{
			System.out.println("FAILED: equals test");
			}
		else 
		{
			System.out.println("PASSED: equals test");
		}
		
		//Testing distance 
		//First test. Distance should be 0
	
		circle1.setX(3.3);
		circle1.setY(7.6);
				
		circle2.setX(3.3);
		circle2.setY(7.6);
		
		if (circle1.distance(circle2) < THRESHOLD)
		{
			System.out.println("PASSED: distance test");
		}
		else 
		{
			System.out.println("FAILED: distance test");
		}
		
		//Second test. Distance should be 5.380752735
			
		circle1.setX(4.5);
		circle1.setY(8.0);
						
		circle2.setX(1.2);
		circle2.setY(3.75);
				
		if (((circle1.distance(circle2)) - 5.380752735) < THRESHOLD)
		{
			System.out.println("PASSED: distance test");
		}
		else 
		{
			System.out.println("FAILED: distance test");
		}
		
		//Third test. Distance should be 24.41986896
		
		circle1.setX(23.0);
		circle1.setY(1.3);
						
		circle2.setX(20.2);
		circle2.setY(9.0);
				
		if (((circle1.distance(circle2)) - 24.41986896) < THRESHOLD)
		{
			System.out.println("PASSED: distance test");
		}
		else 
		{
			System.out.println("FAILED: distance test");
		}
		
		//Testing isSmaller
		//First test. Calling object is smaller than the parameter
		
		circle1.setRadius(2.0);
		circle2.setRadius(3.86);
		
		if (circle1.isSmaller(circle2))
		{
			System.out.println("PASSED: isSmaller test");
		}
		else 
		{
			System.out.println("FAILED: isSmaller test");
		}
		
		//Second test. Should be the same size
		
		circle1.setRadius(4.7);
		circle2.setRadius(4.7);
		
		if (circle1.isSmaller(circle2))
		{
			System.out.println("FAILED: isSmaller test");
		}
		else 
		{
			System.out.println("PASSED: isSmaller test");
		}
		
		//Third test. Calling object is larger
		circle1.setRadius(12.6);
		circle2.setRadius(2.4);
				
		if (circle1.isSmaller(circle2))
		{
			System.out.println("FAILED: isSmaller test");
		}
		else 
		{
			System.out.println("PASSED: isSmaller test");
		}
		
		//Testing compareTo
		//First test. The calling object is larger
		
		circle1.setRadius(12.6);
		circle2.setRadius(2.4);
		
		if (circle1.compareTo(circle2) == 1)
		{
			System.out.println("PASSED: compareTo test");
		}
		else if (circle1.compareTo(circle2) == -1)
		{
			System.out.println("FAILED: compareTo test");
		}
		else // circle1.compareTo(circle2) == 0
		{
			System.out.println("FAILED: compareTo test");
		}
		
		//Second test. The calling object is smaller
		
		circle1.setRadius(1.9);
		circle2.setRadius(3.7);
		
		if (circle1.compareTo(circle2) == 1)
		{
			System.out.println("FAILED: compareTo test");
		}
		else if (circle1.compareTo(circle2) == -1)
		{
			System.out.println("PASSED: compareTo test");
		}
		else // circle1.compareTo(circle2) == 0
		{
			System.out.println("FAILED: compareTo test");
		}
		
		//Third test. The calling object and parameter are the same size
		
		circle1.setRadius(7.7);
		circle2.setRadius(7.7);
				
		if (circle1.compareTo(circle2) == 1)
		{
			System.out.println("FAILED: compareTo test");
		}
		else if (circle1.compareTo(circle2) == -1)
		{
			System.out.println("FAILED: compareTo test");
		}
		else // circle1.compareTo(circle2) == 0
		{
			System.out.println("PASSED: compareTo test");
		}
		
		//Testing intersects
		//First test. The circles have the same center, so they intersect
		
		circle1.setX(2.3);
		circle1.setY(15.6);
						
		circle2.setX(2.3);
		circle2.setY(15.6);
		
		circle1.setRadius(3.4);
		circle2.setRadius(4.9);
		
		if (circle1.intersects(circle2))
		{
			System.out.println("PASSED: intersects test");
		}
		else 
		{
			System.out.println("FAIL: intersects test");
		}
		
		//Second test. The circles intersect
		
		circle1.setX(3.5);
		circle1.setY(2.5);
						
		circle2.setX(5.7);
		circle2.setY(4.8);
		
		circle1.setRadius(9.8);
		circle2.setRadius(8.6);
		
		if (circle1.intersects(circle2))
		{
			System.out.println("PASSED: intersects test");
		}
		else 
		{
			System.out.println("FAILED: intersects test");
		}
		
		//Third test. The circles do not intersect
		
		circle1.setX(8.3);
		circle1.setY(2.7);
						
		circle2.setX(4.6);
		circle2.setY(7.9);
		
		circle1.setRadius(1.3);
		circle2.setRadius(1.2);
		
		if (circle1.intersects(circle2))
		{
			System.out.println("FAILED: intersects test");
		}
		else 
		{
			System.out.println("PASSED: intersects test");
		}
		
	}
	
}
