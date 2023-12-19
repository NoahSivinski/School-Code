/*
 * Circle.java
 * Author:  Charles Merritt
 * Submission Date:  10/29/2020
 *
 * Purpose: It tests basic oop principles
 *
 * Statement of Academic Honesty: CEM
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
		System.out.println("circle1 = "+circle1);
		System.out.println("circle2 = "+circle2);

		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.

		circle1.setRadius(-2.0); 

		//This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		//Notice how the double comparison is done
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		// Reset the center of circle1 (-3.0,4.0)

		circle1.setX(-3.0);
		circle1.setY(4.0);

		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		if (Math.abs(3-circle1.getX()) < THRESHOLD) {
			System.out.println("PASSED: Set X");
		}
		else {
			System.out.println("FAILED: Set X");
		}

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2 =" + circle2);

		// print circle1 diameter, area and perimeter
		System.out.println("circle1 diameter = " + circle1.diameter() + "\n area = " + circle1.area() + "\n perimeter = " + circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("circle1 diameter = " + circle2.diameter() + "\n area = " + circle2.area() + "\n perimeter = " + circle2.perimeter());

		// display whether circle1 is a unit circle
		System.out.println("Is circle1 a unit circle: " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Is circle2 a unit circle: " + circle2.isUnitCircle());

		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.

		// equals test 1 not equal
		circle1.setX(2);
		circle1.setY(7);
		circle1.setRadius(3);
		circle2.setX(1);
		circle2.setY(1);
		circle2.setRadius(3);
		if(circle1.equals(circle2))
			System.out.println("FAILED: circle1 and circle2 are equal");
		else
			System.out.println("PASSED: circle1 and circle2 are not equal");
		
		// equals test 2
		circle1.setX(-3);
		circle1.setY(2);
		circle1.setRadius(10);
		circle2.setX(3);
		circle2.setY(-2);
		circle2.setRadius(10);
		if(!circle1.equals(circle2))
			System.out.println("PASSED: negative and positive numbers are not equal");
		else
			System.out.println("FAILED: negative and positive numbers are equal");
		
		// equals test 3
		circle1.setX(1234.00567);
		circle1.setY(-0.000123);
		circle1.setRadius(123);
		circle2.setX(1234.00567);
		circle2.setY(-0.000123);
		circle2.setRadius(123);
		if(circle1.equals(circle2))
			System.out.println("PASSED: circle1 and circle 2 are equal");
		else
			System.out.println("FAILED: circle1 and circle 2 are not equal");
		
		
		// distance test 1
		if(circle1.distance(circle2) == 0)
			System.out.println("PASSED: distance is 0 when circles are equal");
		else
			System.out.println("FAILED: distance is not 0 when circles are equal");
		
		// distance test 2
		circle1.setX(1);
		circle1.setY(1);
		circle2.setX(1);
		circle2.setY(3);
		if(2-circle1.distance(circle2) < THRESHOLD)
			System.out.println("PASSED: distance is correct"); 
		else
			System.out.println("FAILED: distance is not correct");

		// reset circles
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle2.setX(0.0);
		circle2.setY(0.0);

		// isSmaller test 1
		circle1.setRadius(1);
		circle2.setRadius(3);
		if(circle1.isSmaller(circle2))
			System.out.println("PASSED: circle1 is smaller than circle2");
		else
			System.out.println("FAILED: isSmaller returns an improper value");
		
		// isSmaller test 2
		circle1.setRadius(0.0000000001);
		circle2.setRadius(0.0000000001);
		if(!circle1.isSmaller(circle2))
			System.out.println("PASSED: isSmaller returns the proper value"); 
		else
			System.out.println("FAILED: isSmaller returns an improper value");

		// compareTo test 1
		circle1.setRadius(10);
		circle2.setRadius(1);
		if(circle1.compareTo(circle2) > 0)
			System.out.println("PASSED: compareTo returns the proper value");
		else if (circle1.compareTo(circle2) < 0)
			System.out.println("FAILED: returns an improper value");	
		else
			System.out.println("FAILED: returns an improper value");	
		
		// compareTo test 2
		circle1.setRadius(2);
		circle2.setRadius(5);
		if(circle1.compareTo(circle2) > 0)
			System.out.println("FAILED: compareTo returns an improper value");
		else if (circle1.compareTo(circle2) < 0)
			System.out.println("PASSED: compareTo returns the proper value");	
		else
			System.out.println("FAILED: compareTo returns an improper value");
		
		// compareTo test 3
		circle1.setRadius(1);
		circle2.setRadius(1);
		if(circle1.compareTo(circle2) > 0)
			System.out.println("FAILED: compareTo returns an improper value");
		else if (circle1.compareTo(circle2) < 0)
			System.out.println("FAILED: compareTo returns an improper value");	
		else
			System.out.println("PASSED: compareTo returns the proper value");	

		// intersect test 1
		circle1.setX(2);
		circle1.setY(3);
		circle2.setX(2);
		circle2.setY(5);
		circle1.setRadius(5);
		circle2.setRadius(5);
		if(circle1.intersects(circle2))
			System.out.println("PASSED: intersect returns the proper value");
		else
			System.out.println("FAILED: intersect returns an improper value");
		
		// intersect test 2
		circle1.setX(-1);
		circle1.setY(-2);
		circle2.setX(0);
		circle2.setY(1);
		circle1.setRadius(2);
		circle2.setRadius(30);
		if(circle1.intersects(circle2))
			System.out.println("PASSED: intersect returns the proper value");
		else
			System.out.println("FAILED: intersect returns an improper value");
		
		// intersect test 3
		circle1.setX(2);
		circle1.setY(2);
		circle2.setX(2);
		circle2.setY(2);
		circle1.setRadius(2);
		circle2.setRadius(1);
		if(circle1.intersects(circle2))
			System.out.println("PASSED: intersect returns the proper value");
		else
			System.out.println("FAILED: intersect returns an improper value");

	}

}
