/*
 * [CircleTester].java
 * Author:  [Daniel Han] 
 * Submission Date:  [10/292021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * The program checks the methods of the circle class. We were given part of the program CircleTester and we followed the directions in the comments
 * Some things that the program does is: check the equals, distance, isSmaller, compareTo, and intersects method using 3 tests for each method.
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
 * or posting of source code for this project is strictly
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
		System.out.println("circle1= " + circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2= " + circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("circle1 diameter: " + circle1.diameter());
		System.out.println("circle1 area: " + circle1.area());
		System.out.println("circle1 perimeter: " + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("circle2 diameter: " + circle2.diameter());
		System.out.println("circle2 area: " + circle2.area());
		System.out.println("circle2 perimeter: " + circle2.perimeter());
		
		
		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle()) {
			System.out.println("Circle1 is a unit circle");
		}
		else {
			System.out.println("Circl1 is not a unit circle");
		}
		
		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle()) {
			System.out.println("Circle2 is a unit circle");
		}
		else {
			System.out.println("Circle2 is not a unit circle");
		}
		
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		System.out.println("Testing additional methods:");
		
		//creates 3 new circle objects
		Circle test1 = new Circle();
		Circle test2 = new Circle();
		//setting the names for circle test1 and test2
		test1.setName("Test 1");
		test2.setName("Test 2");
		
		//3 tests for the equal method
		//first sets test1 and test2's radius and center as the same
		test1.setRadius(5);
		test2.setRadius(5);
		test1.setX(0);
		test1.setY(0);
		test2.setX(0);
		test2.setY(0);
		System.out.println("Tests for the equal method");
		//testing to see if the equals method will return true if test 1 and test 2 have the same radius and coordinates
		if (test1.equals(test2)) {
			System.out.println("PASSED: Equals Method");
		}
		else {
			System.out.println("FAILED: Equals Method");
		}
		//testing to see if the equals method will return false if test 1 and test 2 have the same radius but different coordinates
		//sets test2 coordinates to (3,6)
		test2.setX(3);
		test2.setY(6);
		if (test1.equals(test2)) {
			System.out.println("FAILED: Equals Method");
		}
		else {
			System.out.println("PASSED: Equals Method");
		}
		//testing to see if the equals method will return false if both radius and coordinates of test 1 and test 2 are different
		//sets the radius of test2 to 10
		test2.setRadius(10);
		if (test1.equals(test2)) {
			System.out.println("FAILED: Equals Method");
		}
		else {
			System.out.println("PASSED: Equals Method");
		}
		
		//tests for the distance method
		System.out.println("Tests for the distance method");
		test2.setY(4);
		if ( Math.abs(test1.distance(test2) -5) <= THRESHOLD) {		
			System.out.println("PASSED: Distance Method");
		}
		else {
			System.out.println("FAILED: Distance Method");
		}
		//the second test checks if the method will output 0 if the coordinates of both circles are equal
		//sets test2 coordinates to 0,0
		test2.setX(0);
		test2.setY(0);
		if ( Math.abs(test1.distance(test2) -0) <= THRESHOLD) {		
			System.out.println("PASSED: Distance Method");
		}
		else {
			System.out.println("FAILED: Distance Method");
		}
		//third test
		//sets the test2 circle coordinates to negative numbers: (-3,-4)
		test2.setX(-3);
		test2.setY(-4);
		if ( Math.abs(test1.distance(test2) -5) <= THRESHOLD) {		
			System.out.println("PASSED: distance Method");
		}
		else {
			System.out.println("FAILED: distance Method");
		}
		
		//tests for the isSmaller method in java
		System.out.println("Tests for the isSmaller method");
		//circle test1 is smaller than test2, so the method should return true
		if ((test1.isSmaller(test2))) {
			System.out.println("PASSED: isSmaller Method");
		}
		else {
			System.out.println("FAILED: isSmaller Method");
		}
		
		//the second test will set the radius of test2 smaller than test2 and should print false
		//sets the radius of test2 to 3
		test2.setRadius(3);
		//if test2 is smaller than test1, then it will pass the test
		if (!(test1.isSmaller(test2))) {
			System.out.println("PASSED: isSmaller Method");
		}
		else {
			System.out.println("FAILED: isSmaller Method");
		}
		//third test when both the radius are the same
		//sets the radius of test2's to test1's radius
		test2.setRadius(test1.getRadius());
		//the method should return false
	    if (!(test1.isSmaller(test2))) {
	    	System.out.println("PASSED: isSmaller Method");
	    }
	    else {
	    	System.out.println("FAILED: isSmaller Method");
	    }
		
	    System.out.println("Tests for the compareTo Method");
	    
	    //sets test2's radius to be smaller than test1's radius
	    test2.setRadius(1);
	    if (test1.compareTo(test2) == 1) {
	    	System.out.println("PASSED: compareTo Method");
	    }
	    else {
	    	System.out.println("FAILED: compareTo Method");
	    }
	    //sets test2's radius to be equal to test1's radius
	    test2.setRadius(test1.getRadius());
	    //compareTo should return 0
	    if (test1.compareTo(test2) == 0) {
	    	System.out.println("PASSED: compareTo Method");
	    }
	    else {
	    	System.out.println("FAILED: compareTo Method");
	    }
	    
	    //sets test2's radius to be larger than test1's radius
	    test2.setRadius(15);
	    //compareTo method should output -1
	    if (test1.compareTo(test2) == -1) {
	    	System.out.println("PASSED: compareTo Method");
	    }
	    else {
	    	System.out.println("FAILED: compareTo Method");
	    }
	    
	    
	    //tests for the intersects method
	    System.out.println("Tests for the intersects Method");
	    //test one when the coordinates and radius of both test circles are the same
	    test1.setRadius(5);
		test2.setRadius(5);
		test1.setX(0);
		test1.setY(0);
		test2.setX(0);
		test2.setY(0);
		if (test1.intersects(test2)) {
			System.out.println("PASSED: Intersects Method");
		}
		else {
			System.out.println("FAILED: Intersects Method");
		}
		
		//second method should return false
		//moves test2's coordinate outside of intersection range
	    test2.setX(100);
	    test2.setY(100);
	    if (!(test1.intersects(test2))) {
	    	System.out.println("PASSED: Intersects Method");
	    }
	    else {
	    	System.out.println("FAILED: Intersects Method");
	    }
	    //third test for intersects method
	    //the test1 and test2 should intersect, and the intersects method should return true
	    //sets x and y of test2 circle to be within intersection
	    test2.setY(2);
	    test2.setX(1);
	    if (test1.intersects(test2)) {
	    	System.out.println("PASSED: Intersects Method");
	    }
	    else {
	    	System.out.println("PASSED: Intersects Method");
	    }
		
	    
	}
	
}
