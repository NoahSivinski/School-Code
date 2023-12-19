//*******************************************************
// CircleTester.java
// Author:  Ethan Milley 
// Submission Date:  3/31/2021
//
// Purpose: A client to test the functionality of objects
// of the class Circle
// 
// Statement of Academic Honesty:
//
// The following code represents my own work. I have neither
// received nor given inappropriate assistance. I have not copied
// or modified code from any source other than the course webpage
// or the course textbook. I recognize that any unauthorized
// assistance or plagiarism will be handled in accordance with
// the University of Georgia's Academic Honesty Policy and the
// policies of this course. I recognize that my work is based
// on an assignment created by the Department of Computer
// Science at the University of Georgia. Any publishing 
// or posting of source code for this assignment is strictly
// prohibited unless you have written consent from the Department
// of Computer Science at the University of Georgia.  
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
		// the method toString, why? 
		System.out.println(circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println(circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("\nCircle1:" + "\nDiameter: " + circle1.diameter() 
		+ "\nArea: " + circle1.area() + "\nPerimeter " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("\nCircle2:" + "\nDiameter: " + circle2.diameter() 
		+ "\nArea: " + circle2.area() + "\nPerimeter " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println();
		
		if (circle1.isUnitCircle()) {
			System.out.println("Circle1 is a unit circle");
		}
		
		else {
			System.out.println("Circle1 is a not unit circle");
		}
		
		// display whether circle2 is a unit circle
		System.out.println();
		
		if (circle2.isUnitCircle()) {
			System.out.println("Circle2 is a unit circle");
		}
		
		else {
			System.out.println("Circle2 is a not unit circle");
		}
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
	
		//Circles equals tests
		
		System.out.println();
		
		System.out.println("Are circles equal test 1 where circle1 should equal circle2");
		
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(2);
		
		System.out.println();
		System.out.println(circle1);
		System.out.println();
		System.out.println(circle2);
		
		if (circle1.equals(circle2)) {
			System.out.println("The Circles are equal");
			System.out.println("Pass");
		}
		else {
			System.out.println("The Circles are not equal");
			System.out.println("Fail");
		}
		
		System.out.println();
		
		System.out.println("Are circles equal test 2 where the circle2 should equal circle1");
		
		circle1.setX(3.5);
		circle1.setY(6.9);
		circle1.setRadius(10);
		
		circle2.setX(3.5);
		circle2.setY(6.9);
		circle2.setRadius(10);
		
		System.out.println();
		System.out.println(circle1);
		System.out.println();
		System.out.println(circle2);
		
		if (circle2.equals(circle1)) {
			System.out.println("The Circles are equal");
			System.out.println("Pass");
		}
		else {
			System.out.println("The Circles are not equal");
			System.out.println("Fail");
		}
		
		System.out.println();
		
		System.out.println("Are circles equal test 3 where the circles should not be equal");
		
		circle1.setX(0.0);
		circle1.setY(4.5);
		circle1.setRadius(5);
		
		circle2.setX(3.5);
		circle2.setY(6.9);
		circle2.setRadius(10);
		
		System.out.println();
		System.out.println(circle1);
		System.out.println();
		System.out.println(circle2);
		
		if (circle1.equals(circle2)) {
			System.out.println("The Circles are equal");
			System.out.println("Fail");
		}
		else {
			System.out.println("The Circles are not equal");
			System.out.println("Pass");
		}
		
		System.out.println();
		
		//Circle Distance Tests
		
		System.out.println("Circles distance test 1 where the distance should be equal to 0 and they have diffent radi");
		
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(5);
		
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(10);
		
		System.out.println();
		System.out.println(circle1);
		System.out.println();
		System.out.println(circle2);
		
		if (Math.abs(circle1.distance(circle2) - 0) < THRESHOLD) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		System.out.println();
		
		System.out.println("Circles distance test 2 where the distance should be equal to 20 due to different y values");
		
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(5);
		
		circle2.setX(0.0);
		circle2.setY(20.0);
		circle2.setRadius(10);
		
		System.out.println();
		System.out.println(circle1);
		System.out.println();
		System.out.println(circle2);
		
		if (Math.abs(circle1.distance(circle2) - 20) < THRESHOLD) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		System.out.println();
		
		System.out.println("Circles distance test 3 where the distance should be equal to 100 due to different x values");
		
		circle1.setX(100.0);
		circle1.setY(0.0);
		circle1.setRadius(5);
		
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(10);
		
		System.out.println();
		System.out.println(circle1);
		System.out.println();
		System.out.println(circle2);
		
		if (Math.abs(circle2.distance(circle1) - 100) < THRESHOLD) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		//Smaller Circle tests
		
		System.out.println();
		
		System.out.println("Is the first circle smaller test 1 where circle1 should be smaller than circle2");
		
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(10);
		
		System.out.println();
		System.out.println(circle1);
		System.out.println();
		System.out.println(circle2);
		
		if (circle1.isSmaller(circle2)) {
			System.out.println("circle1 is smaller than circle2");
			System.out.println("Pass");
		}
		else {
			System.out.println("circle1 is not smaller than circle2");
			System.out.println("Fail");
		}
		
		System.out.println();
		
		System.out.println("Is the first circle smaller test 2 where circle1 should not be smaller than circle2");
		
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(10);
		
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(2);
		
		System.out.println();
		System.out.println(circle1);
		System.out.println();
		System.out.println(circle2);
		
		if (circle1.isSmaller(circle2)) {
			System.out.println("circle1 is smaller than circle2");
			System.out.println("Fail");
		}
		else {
			System.out.println("circle1 is not smaller than circle2");
			System.out.println("Pass");
		}
		
		System.out.println();
		
		System.out.println("Is the first circle smaller test 3 where circle2 should not be smaller than circle1");
		
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(10);
		
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(2);
		
		System.out.println();
		System.out.println(circle1);
		System.out.println();
		System.out.println(circle2);
		
		if (circle2.isSmaller(circle1)) {
			System.out.println("circle2 is smaller than circle1");
			System.out.println("Pass");
		}
		else {
			System.out.println("circle2 is not smaller than circle1");
			System.out.println("Fail");
		}
		
		//Comparing circles tests
		
		System.out.println();
				
		System.out.println("Comparing circles test 1 where circle1 should equal to circle2");
				
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
				
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(2);
		
		System.out.println();
		System.out.println(circle1);
		System.out.println();
		System.out.println(circle2);
		
		if (circle1.compareTo(circle2) == 0) {
			System.out.println("The Circles are equal");
			System.out.println("Pass");
		}
		else if (circle1.compareTo(circle2) == 1){
			System.out.println("The circle1 is larger than circle2");			
			System.out.println("Fail");
		}
		else if (circle1.compareTo(circle2) == -1) {
			System.out.println("The circle1 is smaller than circle2");			
			System.out.println("Fail");
		}
		
		System.out.println();
		
		System.out.println("Comparing circles test 2 where circle1 should smaller than circle2");
				
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
				
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(20);
		
		System.out.println();
		System.out.println(circle1);
		System.out.println();
		System.out.println(circle2);
		
		if (circle1.compareTo(circle2) == 0) {
			System.out.println("The Circles are equal");
			System.out.println("Fail");
		}
		else if (circle1.compareTo(circle2) == 1){
			System.out.println("The circle1 is larger than circle2");			
			System.out.println("Fail");
		}
		else if (circle1.compareTo(circle2) == -1) {
			System.out.println("The circle1 is smaller than circle2");			
			System.out.println("Pass");
		}
		
		System.out.println();
		
		System.out.println("Comparing circles test 3 where circle2 should larger than circle1");
				
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
				
		circle2.setX(0.0);
		circle2.setY(0.0);
		circle2.setRadius(20);
		
		System.out.println();
		System.out.println(circle1);
		System.out.println();
		System.out.println(circle2);
		
		if (circle2.compareTo(circle1) == 0) {
			System.out.println("The Circles are equal");
			System.out.println("Fail");
		}
		else if (circle2.compareTo(circle1) == 1){
			System.out.println("The circle2 is larger than circle1");			
			System.out.println("Pass");
		}
		else if (circle2.compareTo(circle1) == -1) {
			System.out.println("The circle2 is smaller than circle1");			
			System.out.println("Fail");
		}
		
		//Circles intersect tests

		System.out.println();
		
		System.out.println("Do the circles intersect test 1 where circle1 should intersect circle2");
		
		circle1.setX(10.0);
		circle1.setY(0.0);
		circle1.setRadius(10);
		
		circle2.setX(0.0);
		circle2.setY(10.0);
		circle2.setRadius(20);
		
		System.out.println();
		System.out.println(circle1);
		System.out.println();
		System.out.println(circle2);
		
		if (circle1.intersects(circle2)) {
			System.out.println("The Circles intersect");
			System.out.println("Pass");
		}
		else {
			System.out.println("The Circles do not intersect");
			System.out.println("Fail");
		}

		System.out.println();
		
		System.out.println("Do the circles intersect test 2 where circle2 should intersect circle1");
		
		circle1.setX(10.0);
		circle1.setY(0.0);
		circle1.setRadius(10);
		
		circle2.setX(0.0);
		circle2.setY(10.0);
		circle2.setRadius(20);
		
		System.out.println();
		System.out.println(circle1);
		System.out.println();
		System.out.println(circle2);
		
		if (circle2.intersects(circle1)) {
			System.out.println("The Circles intersect");
			System.out.println("Pass");
		}
		else {
			System.out.println("The Circles do not intersect");
			System.out.println("Fail");
		}
		
		System.out.println();
		
		System.out.println("Do the circles intersect test 3 where circle1 should not intersect circle2");
		
		circle1.setX(10.0);
		circle1.setY(0.0);
		circle1.setRadius(10);
		
		circle2.setX(0.0);
		circle2.setY(100.0);
		circle2.setRadius(20);
		
		System.out.println();
		System.out.println(circle1);
		System.out.println();
		System.out.println(circle2);
		
		if (circle1.intersects(circle2)) {
			System.out.println("The Circles intersect");
			System.out.println("Fail");
		}
		else {
			System.out.println("The Circles do not intersect");
			System.out.println("Pass");
		}
	}
}