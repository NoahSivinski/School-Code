
/*
 * CircleTester.java
 * Author: Jonathan Dintino
 * Submission Date: 29 October 2021
 *
 * Purpose: This program will act as a testing class to ensure
 * a Circle class works correctly with no errors. There will be
 * a lot of data outputted to the console, including unit tests
 * to evaluate our Circle instance methods work as intended.
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

	/**
	 * @param args
	 */
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
		// the method toString, why?
		System.out.println("circle1=" + circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2=" + circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("circle1 diameter=" + circle1.diameter());
		System.out.println("circle1 area=" + circle1.area());
		System.out.println("circle1 perimeter=" + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("circle2 diameter=" + circle2.diameter());
		System.out.println("circle2 area=" + circle2.area());
		System.out.println("circle2 perimeter=" + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println("circle1 is" + (circle1.isUnitCircle() ? "" : " not") + " a unit circle");
		
		// display whether circle2 is a unit circle
		System.out.println("circle2 is" + (circle2.isUnitCircle() ? "" : " not") + " a unit circle");
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		System.out.println(); // separator
		
		// compareTo unit test
		Circle circle3 = new Circle();
		Circle circle4 = new Circle();
		
		circle3.setRadius(3);
		circle4.setRadius(3);
		
		boolean check1 = circle4.compareTo(circle3) == 0;
		
		circle3.setRadius(4.5);
		
		boolean check2 = circle4.compareTo(circle3) == -1;
		boolean check3 = circle3.compareTo(circle4) == 1;
		
		if (check1 && check2 && check3) {
			System.out.println("PASSED: compareTo");
		} else {
			System.out.println("FAILED: compareTo");
		}
		
		
		// isSmaller unit test
		circle3.setRadius(2.1);
		circle4.setRadius(4.7);
		
		boolean check4 = circle3.isSmaller(circle4);
		boolean check5 = !circle4.isSmaller(circle3);
		
		if (check4 && check5) {
			System.out.println("PASSED: circle3 is smaller than circle4");
		} else {
			System.out.println("FAILED: circle3 is smaller than circle4");
		}
		
		
		// intersects unit test
		circle3.setX(2.0);
		circle3.setY(5.0);
		
		circle4.setX(1.0);
		circle4.setX(2.0);
		
		boolean check6 = circle3.intersects(circle4);
		boolean check7 = circle4.intersects(circle3);
		
		if (check6 && check7) {
			System.out.println("PASSED: circle3 intersects circle4");
		} else {
			System.out.println("FAILED: circle3 intersects circle4");
		}

	}

}
