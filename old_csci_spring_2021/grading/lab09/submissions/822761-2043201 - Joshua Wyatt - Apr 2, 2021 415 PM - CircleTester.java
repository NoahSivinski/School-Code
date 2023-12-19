/*
 * CircleTester.java
 * Author:  Joshua Wyatt 
 * Submission Date:  4/2/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program tests the circle.java program that takes the input
 * from inside the code once its changed and it gives the output 
 * depending on the inputed values by the editing of the program.
 * This tests the circle.java program that gives values for a 
 * circle
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
		Circle circle3 = new Circle();
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
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		
		// print circle1 diameter, area and perimeter
		System.out.println("Circle 1 diameter is "+ String.valueOf(circle1.diameter()) + ", circle 1 area is"
				+ String.valueOf(circle1.area()) + "circle 1 perimeter is" + String.valueOf(circle1.perimeter()) );
		
		// print circle2 diameter, area and perimeter
		System.out.println("Circle 2 diameter is "+ String.valueOf(circle2.diameter()) + ", circle 2 area is"
				+ String.valueOf(circle2.area()) + "circle 2 perimeter is" + String.valueOf(circle2.perimeter()) );
		
		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle()) {
			System.out.println("Circle 1 is a unit circle");
		}
		else {
			System.out.println("Circle 1 is not a unit circle");
		}
		
		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle()) {
			System.out.println("Circle 2 is a unit circle");
		}
		else {
			System.out.println("Circle 2 is not a unit circle");
		}
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		System.out.println(circle1.equals(circle2));
		System.out.println(circle2.equals(circle1));
		System.out.println(circle3.equals(circle1));
		System.out.println(circle1.isSmaller(circle2));
		System.out.println(circle2.isSmaller(circle3));
		System.out.println(circle3.isSmaller(circle1));
		System.out.println(circle1.compareTo(circle2));
		System.out.println(circle2.compareTo(circle3));
		System.out.println(circle3.compareTo(circle1));
		System.out.println(circle1.intersects(circle2));
		System.out.println(circle2.intersects(circle3));
		System.out.println(circle3.intersects(circle1));
		System.out.println(circle1.distance(circle2));
		System.out.println(circle2.distance(circle3));
		System.out.println(circle3.distance(circle1));


	}
	
}