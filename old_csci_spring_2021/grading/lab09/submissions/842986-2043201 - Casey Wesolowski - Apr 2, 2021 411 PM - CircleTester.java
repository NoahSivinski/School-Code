
/*
 * CSCI1301 27827
 * CircleTester.java
 * Author:  Casey Wesolowski 
 * Submission Date:  April 2nd, 2021
 *
 * Purpose:  CircleTester is the testing program created to test
 * the program Circle.java's methods. It's purpose is to show 
 * how each part and method written in Circle.java work and 
 * interact.
 * 
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
		System.out.println("circle1 = " + circle1);
		System.out.println("circle2 = " + circle2);
		
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
		circle1.toString();
		System.out.println(circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		circle2.toString();
		System.out.println(circle2);
		
		// print circle1 diameter, area and perimeter
		System.out.println("");
		System.out.println("Diameter: " + circle1.diameter() + 
				"\nArea: " + circle1.area() + "\nPerimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter() + 
				"\nArea: " + circle2.area() + "\nPerimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println("");
		if (circle1.isUnitCircle() == true)	{
			System.out.println("Is circle 1 a Unit Circle?: Yes");
		}
		else	{
			System.out.println("Is circle 1 a Unit Circle: No");
		}
		
		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle() == true)	{
			System.out.println("Is circle 2 a Unit Circle?: Yes");
		}
		else	{
			System.out.println("Is circle 1 a Unit Circle: No");
		}
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		System.out.println("");
		System.out.println("Method Checks: ");
		
		//area method checks
		//area pt.1
		System.out.println("area:");
		double expected = Math.PI * (circle1.getRadius() * circle1.getRadius());
		double actual = circle1.area();
		if(Math.abs(actual - expected) < THRESHOLD)	{
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		//area pt.2
		expected = Math.PI * (circle2.getRadius() * circle2.getRadius());
		actual = circle2.area();
		if(Math.abs(actual - expected) < THRESHOLD)	{
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		//area pt.3
		//if circle 1 is larger – false, if circle 1 is smaller – true
		boolean expectedB = true;
		boolean actualB = (circle1.area() < circle2.area());
		if(actualB == expectedB) {
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		
		//perimeter method checks
		//perimeter pt.1
		System.out.println("");
		System.out.println("perimeter:");
		expected = 2 * Math.PI * circle1.getRadius();
		actual = circle1.perimeter();
		if(Math.abs(actual - expected) < THRESHOLD)	{
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		//perimeter pt.2
		expected = 2 * Math.PI * circle2.getRadius();
		actual = circle2.perimeter();
		if(Math.abs(actual - expected) < THRESHOLD)	{
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		//perimeter pt.3
		//if circle 1 is larger – false, if circle 1 is smaller – true
		expectedB = true;
		actualB = (circle1.perimeter() < circle2.perimeter());
		if(actualB == expectedB) {
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		
		
		//diameter method checks
		//diameter pt.1
		System.out.println("");
		System.out.println("diameter:");
		expected = 2 * circle1.getRadius();
		actual = circle1.diameter();
		if(Math.abs(actual - expected) < THRESHOLD)	{
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		//diameter pt.2
		expected = 2 * circle2.getRadius();
		actual = circle2.diameter();
		if(Math.abs(actual - expected) < THRESHOLD)	{
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		//diameter pt.3
		//if circle 1 is larger – false, if circle 1 is smaller – true
		expectedB = true;
		actualB = (circle1.diameter() < circle2.diameter());
		if(actualB == expectedB) {
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		
		//isUnitCircle method checks
		//isUnitCircle pt.1
		System.out.println("");
		System.out.println("isUnitCircle:");
		expectedB = (circle1.getRadius() == 1);
		actualB = circle1.isUnitCircle();
		if(actualB == expectedB) {
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		//isUnitCircle pt.2
		expectedB = (circle2.getRadius() == 1);
		actualB = circle2.isUnitCircle();
		if(actualB == expectedB) {
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		//isUnitCircle pt.3
		//if both circles are unit circles – true, otherwise – false
		expectedB = circle1.isUnitCircle();
		actualB = circle2.isUnitCircle();
		if(actualB == expectedB) {
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		
		//distance method checks
		//distance pt.1
		System.out.println("");
		System.out.println("distance:");
		expected = 0; //What it should yield
		actual = circle1.distance(circle2); //What it actually yields
		if(actual >= expected) {
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		//distance pt.2
		//Should be the same of pt.1
		expected = 0;
		actual = circle2.distance(circle1);
		if(actual >= expected)	{
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		//distance pt.3
		expected = 0;
		actual = circle1.distance(circle1);
		if(actual >= expected)	{
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		
		//isSmaller method checks
		//isSmaller pt.1
		System.out.println("");
		System.out.println("isSmaller:");
		expectedB = true;
		actualB = circle1.isSmaller(circle2);
		if(actualB == expectedB)	{
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIl");
		}
		
		//isSmaller pt.2
		expectedB = true;
		actualB = circle2.isSmaller(circle1);
		if(actualB == expectedB)	{
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIl");
		}
		
		//isSmaller pt.3 – 
		expectedB = false;
		actualB = circle1.isSmaller(circle1);
		if(actualB == expectedB)	{
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIl");
		}
		
		
		//compareTo method checks
		//compareTo pt.1
		System.out.println("");
		System.out.println("compareTo:");
		expected = 0;
		actual = circle1.compareTo(circle2);
		if(actual >= expected)	{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//compareTo pt.2
		expected = 0;
		actual = circle2.compareTo(circle1);
		if(actual >= expected)	{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//compareTo pt.3
		//Should equal 0
		expected = 0;
		actual = circle1.compareTo(circle1);
		if(actual >= expected)	{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		
		//intersects method checks – all should pass
		//intersects pt.1
		System.out.println("");
		System.out.println("intersects:");
		expectedB = true;
		actualB = circle1.intersects(circle2);
		
		if(actualB == expectedB)	{
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		//intersects pt.2
		expectedB = true;
		actualB = circle2.intersects(circle1);
		
		if(actualB == expectedB)	{
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
		
		//intersects pt.3
		expectedB = true;
		actualB = circle1.intersects(circle1);
		
		if(actualB == expectedB)	{
			System.out.println("PASS");
		}
		else	{
			System.out.println("FAIL");
		}
			
	}
	
}