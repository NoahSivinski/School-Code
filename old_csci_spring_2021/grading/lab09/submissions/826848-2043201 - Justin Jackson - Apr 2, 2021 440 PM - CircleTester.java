/*
 * CircleTester.java
 * Author:  Justin Jackson 
 * Submission Date:  4/2/2021
 *
 * Purpose: Checks to make sure the methods of the Circle class work based on setting values and confirming the methods produce the correct, known outcome.
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
		
	//Added to give more testing
		Circle circle3 = new Circle();
		circle3.setName("Circle 3");
		circle3.setX(2.0);
		circle3.setY(1.0);
		circle3.setRadius(5.3);
		
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
		System.out.println("circle1 center = (" + circle1.getX() + ","+ circle1.getY() + ")");
		System.out.println("circle1 radius = " + circle1.getRadius());
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2 center = (" + circle2.getX() + ","+ circle2.getY() + ")");
		System.out.println("circle2 radius = " + circle2.getRadius());
		
		// print circle1 diameter, area and perimeter
		System.out.println("circle1 diameter = " + circle1.diameter());
		System.out.println("circle1 area = " + circle1.area());
		System.out.println("circle1 perimeter = " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("circle2 diameter = " + circle2.diameter());
		System.out.println("circle2 area = " + circle2.area());
		System.out.println("circle2 perimeter = " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println("Is circle1 a unit circle? " + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		System.out.println("Is circle2 a unit circle? " + circle2.isUnitCircle());
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
				
		
//Testing, all based on the example at the top where it is based on static values I have found to be the correct values for the given, set values.
//Would not work with changed values, but proves that the methods function as intended
	//Equals Testing
		if(circle1.equals(circle2))
			System.out.println("FAILED: 1 Equals 2");
		else
			System.out.println("PASSED: 1 Equals 2");
		
		if(circle2.equals(circle3))
			System.out.println("PASSED: 2 Equals 3");
		else
			System.out.println("FAILED: 2 Equals 3");
		
		if(circle1.equals(circle3))
			System.out.println("FAILED: 1 Equals 3");
		else
			System.out.println("PASSED: 1 Equals 3");

	//Distance Testing
		if(Math.abs(5.830951894-circle1.distance(circle2)) < THRESHOLD)
			System.out.println("PASSED: Distance test 1 and 2");
		else
			System.out.println("FAILED: Distance test 1 and 2");
		
		if(Math.abs(0-circle2.distance(circle3)) < THRESHOLD)
			System.out.println("PASSED: Distance test 2 and 3");
		else
			System.out.println("FAILED: Distance test 2 and 3");
		
		if(Math.abs(5.830951894-circle1.distance(circle3)) < THRESHOLD)
			System.out.println("PASSED: Distance test 1 and 3");
		else
			System.out.println("FAILED: Distance test 1 and 3");
		
	//isSmaller Testing
		if(circle1.isSmaller(circle2))
			System.out.println("PASSED: 1 Smaller 2");
		else
			System.out.println("FAILED: 1 Smaller 2");
		
		if(circle2.isSmaller(circle3))
			System.out.println("FAILED: 2 Smaller 3");
		else
			System.out.println("PASSED: 2 Smaller 3");
		
		if(circle1.isSmaller(circle3))
			System.out.println("PASSED: 1 Smaller 3");
		else
			System.out.println("FAILED: 1 Smaller 3");
		
	//compareTo Testing
		if(circle1.compareTo(circle2) == -1)
			System.out.println("PASSED: 1 Compare 2");
		else
			System.out.println("FAILED: 1 Compare 2");
		
		if(circle2.compareTo(circle3) == 0)
			System.out.println("PASSED: 2 Compare 3");
		else
			System.out.println("FAILED: 2 Compare 3");
		
		if(circle3.compareTo(circle1) == 1)
			System.out.println("PASSED: 3 Compare 1");
		else
			System.out.println("FAILED: 3 Compare 1");
			
	//intersects Testing
		if(circle1.intersects(circle2))
			System.out.println("PASSED: 1 Intersects 2");
		else
			System.out.println("FAILED: 1 Intersects 2");
		
		if(circle2.intersects(circle3))
			System.out.println("PASSED: 2 Intersects 3");
		else
			System.out.println("FAILED: 2 Intersects 3");
		
		if(circle1.intersects(circle3))
			System.out.println("PASSED: 1 Intersects 3");
		else
			System.out.println("FAILED: 1 Intersects 3");
		
	}
	
}