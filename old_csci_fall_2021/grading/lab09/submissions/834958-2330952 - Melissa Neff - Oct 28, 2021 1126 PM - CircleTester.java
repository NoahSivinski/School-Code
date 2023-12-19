/*
 * CircleTester.java
 * Author:  Melissa Neff
 * Submission Date:  10/28/2021
 *
 * Purpose: A client to test the functionality of objects
 * of the class Circle. Use the default constructor
 *  in the Circle class to create Circle objects.
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
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		}
		else {
			System.out.println("FAILED: Set Radius");
		}
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		System.out.println();
		System.out.println("Circle 1:");
		System.out.println("center: (" + circle1.getX()  + "," + circle1.getY() + ")");
		System.out.println("radius: " + circle1.getRadius());
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println();
		System.out.println("Circle 2:");
		System.out.println("center: (" + circle2.getX()  + "," + circle2.getY() + ")");
		System.out.println("radius: " + circle2.getRadius());
		
		// print circle1 diameter, area and perimeter
		System.out.println();
		System.out.println("Circle 1:");
		System.out.println("diameter: " + (circle1.diameter()));
		System.out.println("area: " + circle1.area());
		System.out.println("perimeter: " + (circle1.perimeter()));
		
		
		// print circle2 diameter, area and perimeter
		System.out.println();
		System.out.println("Circle 2:");
		System.out.println("diameter: " + (circle2.diameter()));
		System.out.println("area: " + circle2.area());
		System.out.println("perimeter: " + (circle2.perimeter()));
		System.out.println();
		
		// display whether circle1 is a unit circle
		if(circle1.isUnitCircle()) {
			System.out.println("Circle 1 is a unit circle");
		}
		else if(!circle1.isUnitCircle()) {
			System.out.println("Circle 1 is not a unit circle");
		}
		System.out.println();
		// display whether circle2 is a unit circle
		if(circle2.isUnitCircle()) {
			System.out.println("Circle 2 is a unit circle");
		}
		else if(!circle2.isUnitCircle()) {
			System.out.println("Circle 2 is not a unit circle");
		}
		System.out.println();
		//Displays whether circle 1 and circle to are equal, and how they compare
		if(circle1.equals(circle2)) {
			System.out.println("Circle 1 is equal to circle 2");
		}
		else {
			System.out.println("Circle 1 is not equal to circle 2");
			System.out.println();
			if(circle1.compareTo(circle2) == 1) {
				System.out.println("Circle 1 is smaller than circle 2");
			}
			else if(circle1.compareTo(circle2) == -1) {
				System.out.println("Circle 1 is larger than circle 2");
			}
		}
		System.out.println();
		//Displays whether or not circle 1 and circle 2 intersect
		if(circle1.intersects(circle2)) {
			System.out.println("Circle 1 intersects circle 2");
		}
		else {
			System.out.println("Circle 1 does not intersect circle 2");
		}
		
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		System.out.println();
		Circle circle3 = new Circle();
		circle3.setName("Circle 3");
		circle3.setX(0.0);
		circle3.setY(0.0);
		circle3.setRadius(1);
		System.out.println("Circle 3 = " + circle3);
		System.out.println("diameter: " + (circle3.diameter()));
		System.out.println("area: " + circle3.area());
		System.out.println("perimeter: " + (circle3.perimeter()));
		System.out.println();
		if(circle3.isUnitCircle()) {
			System.out.println("Circle 3 is a unit circle");
		}
		else if(!circle3.isUnitCircle()) {
			System.out.println("Circle 3 is not a unit circle");
		}
		if(circle3.equals(circle2)) {
			System.out.println("Circle 3 is equal to circle 2");
		}
		else {
			System.out.println("Circle 3 is not equal to circle 2");
			System.out.println();
			if(circle3.compareTo(circle2) == 1) {
				System.out.println("Circle 3 is smaller than circle 2");
			}
			else if(circle3.compareTo(circle2) == -1) {
				System.out.println("Circle 3 is larger than circle 2");
			}
		}
			if(circle3.intersects(circle2)) {
				System.out.println("Circle 3 intersects circle 2");
			}
			else {
				System.out.println("Circle 3 does not intersect circle 2");
			
		}
			System.out.println();
			//Circle 4
			Circle circle4 = new Circle();
			circle4.setName("Circle 4");
			circle4.setX(7.2);
			circle4.setY(6.5);
			circle4.setRadius(8);
			System.out.println("Circle 4 = " + circle4);
			System.out.println("diameter: " + (circle4.diameter()));
			System.out.println("area: " + circle4.area());
			System.out.println("perimeter: " + (circle4.perimeter()));
			System.out.println();
			if(circle4.isUnitCircle()) {
				System.out.println("Circle 4 is a unit circle");
			}
			else if(!circle4.isUnitCircle()) {
				System.out.println("Circle 4 is not a unit circle");
			}
			System.out.println();
			if(circle4.equals(circle2)) {
				System.out.println("Circle 4 is equal to circle 2");
			}
			else {
				System.out.println("Circle 4 is not equal to circle 2");
				System.out.println();
				if(circle4.compareTo(circle2) == 1) {
					System.out.println("Circle 4 is smaller than circle 2");
				}
				else if(circle4.compareTo(circle2) == -1) {
					System.out.println("Circle 4 is larger than circle 2");
				}
			}
			System.out.println();
				if(circle4.intersects(circle2)) {
					System.out.println("Circle 4 intersects circle 2");
				}
				else {
					System.out.println("Circle 4 does not intersect circle 2");
			
		
		}
				//Circle 5
				Circle circle5 = new Circle();
				circle5.setName("Circle 5");
				circle5.setX(9.0);
				circle5.setY(-2.0);
				circle5.setRadius(5);
				System.out.println("Circle 5 = " + circle5);
				System.out.println("diameter: " + (circle5.diameter()));
				System.out.println("area: " + circle5.area());
				System.out.println("perimeter: " + (circle5.perimeter()));
				System.out.println();
				if(circle5.isUnitCircle()) {
					System.out.println("Circle 5 is a unit circle");
				}
				else if(!circle5.isUnitCircle()) {
					System.out.println("Circle 5 is not a unit circle");
				}
				System.out.println();
				if(circle5.equals(circle2)) {
					System.out.println("Circle 5 is equal to circle 2");
				}
				else {
					System.out.println("Circle 5 is not equal to circle 2");
					System.out.println();
					if(circle5.compareTo(circle2) == 1) {
						System.out.println("Circle 5 is smaller than circle 2");
					}
					else if(circle5.compareTo(circle2) == -1) {
						System.out.println("Circle 5 is larger than circle 2");
					}
				}
				System.out.println();
					if(circle5.intersects(circle2)) {
						System.out.println("Circle 5 intersects circle 2");
					}
					else {
						System.out.println("Circle 5 does not intersect circle 2");
				
	}
}
}
	

