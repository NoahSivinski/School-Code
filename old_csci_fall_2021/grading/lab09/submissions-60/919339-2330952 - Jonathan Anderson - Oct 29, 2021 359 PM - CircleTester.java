//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle. Use the default constructor
//  in the Circle class to create Circle objects. 
// 
//*******************************************************
/*
 * CircleTester.java
 * Author:  Jonathan Anderson
 * Submission Date:  10/29/2021
 *
 * Purpose: Tests Circle objects and methods by using a variety of tests to ensure functionality.
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
		System.out.println("circle1 center=(" + circle1.getX() + "," + circle1.getY() + ")\ncircle1 radius=" + circle1.getRadius());
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2 center=(" + circle2.getX() + "," + circle2.getY() + ")\ncircle1 radius=" + circle2.getRadius());
		// print circle1 diameter, area and perimeter
		System.out.println("circle1 diameter=" + circle1.diameter());
		System.out.println("circle1 area=" + circle1.area());
		System.out.println("circle1 perimeter=" + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("circle2 diameter=" + circle2.diameter());
		System.out.println("circle2 area=" + circle2.area());
		System.out.println("circle2 perimeter=" + circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("circle1 unit circle=" + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("circle2 unit circle=" + circle2.isUnitCircle());
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.

		Circle circle3 = new Circle();
		circle3.setName("circle3");
		circle3.setX(4.0);
		circle3.setY(4.0);
		circle3.setRadius(8.0);

		Circle circle3clone = new Circle();
		circle3clone.setName("circle3");
		circle3clone.setX(4.0);
		circle3clone.setY(4.0);
		circle3clone.setRadius(8.0);

		//checking to see if equals works
		if(circle3.equals(circle3clone)){
			System.out.println("PASSED: equals");
		}
		else{
			System.out.println("FAILED: equals");
		}

		circle3clone.setName("circle3clone");
		//checking to see if equals works with different names
		if(circle3.equals(circle3clone)){
			System.out.println("FAILED: equals");
		}
		else{
			System.out.println("PASSED: equals");
		}

		circle3clone.setName("circle3");
		circle3clone.setX(5.0);
		//checking to see if equals works with different x's
		if(circle3.equals(circle3clone)){
			System.out.println("FAILED: equals");
		}
		else{
			System.out.println("PASSED: equals");
		}
		circle3clone.setX(4.0);

		Circle circle4 = new Circle();
		circle4.setName("circle4");
		circle4.setX(10.0);
		circle4.setY(8.0);
		circle4.setRadius(1.0);

		if(circle4.isUnitCircle()){
			System.out.println("FAILED: isUnitCircle");
		}
		else{
			System.out.println("PASSED: isUnitCircle");
		}
		circle4.setY(10.0);
		if(circle4.isUnitCircle()){
			System.out.println("PASSED: isUnitCircle");
		}
		else{
			System.out.println("FAILED: isUnitCircle");
		}
		circle4.setRadius(2);
		if(circle4.isUnitCircle()){
			System.out.println("FAILED: isUnitCircle");
		}
		else{
			System.out.println("PASSED: isUnitCircle");
		}

		if(circle4.isSmaller(circle3)){
			System.out.println("PASSED: isSmaller");
		}
		else{
			System.out.println("FAILED: isSmaller");
		}

		if(circle3.isSmaller(circle4)){
			System.out.println("FAILED: isSmaller");
		}
		else{
			System.out.println("PASSED: isSmaller");
		}

		circle4.setRadius(8.0);
		if(circle4.isSmaller(circle3)){
			System.out.println("FAILED: isSmaller");
		}
		else{
			System.out.println("PASSED: isSmaller");
		}

		if(circle4.compareTo(circle3) == 1){
			System.out.println("PASSED: compareTo");
		}
		else{
			System.out.println("FAILED: compareTo");
		}

		circle4.setRadius(7.0);
		if(circle4.compareTo(circle3) == -1){
			System.out.println("PASSED: compareTo");
		}
		else{
			System.out.println("FAILED: compareTo");
		}

		if(circle3.compareTo(circle3clone) == 0){
			System.out.println("PASSED: compareTo");
		}
		else{
			System.out.println("PASSED: compareTo");
		}

		if(circle4.intersects(circle3)){
			System.out.println("PASSED: intersects");
		}
		else{
			System.out.println("FAILED: intersects");
		}

		if(circle3.intersects(circle3clone)){
			System.out.println("PASSED: intersects");
		}
		else{
			System.out.println("FAILED: intersects");
		}

		if(circle4.intersects(circle1)){
			System.out.println("FAILED: intersects");
		}
		else{
			System.out.println("PASSED: intersects");
		}

		if(circle4.getName().equals("circle4")){
			System.out.println("PASSED: setName");
		}
		else{
			System.out.println("FAILED: setName");
		}

		if(circle1.getName().equals("Circle 1")){
			System.out.println("PASSED: setName");
		}
		else{
			System.out.println("FAILED: setName");
		}

		if(circle3clone.getName().equals("circle3")){
			System.out.println("PASSED: setName");
		}
		else{
			System.out.println("FAILED: setName");
		}

		circle4.setRadius(5.0);
		if(Math.abs(5-circle4.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		}
		else {
			System.out.println("FAILED: Set Radius");
		}

		if(Math.abs(8-circle3.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		}
		else
			System.out.println("FAILED: Set Radius");{

		}

		circle3clone.setRadius(12.0);
		if(Math.abs(12-circle3clone.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		}
		else
			System.out.println("FAILED: Set Radius");{
		}

		circle4.setX(-5.0);
		if(Math.abs(circle4.getX()) - 5 < THRESHOLD){
			System.out.println("PASSED: setX");
		}
		else{
			System.out.println("FAILED: setX");
		}

		if(Math.abs(circle3.getX()) - 8 < THRESHOLD){
			System.out.println("PASSED: setX");
		}
		else{
			System.out.println("FAILED: setX");
		}


		if(Math.abs(circle1.getX()) - 3 < THRESHOLD){
			System.out.println("PASSED: setX");
		}
		else{
			System.out.println("FAILED: setX");
		}

		if(Math.abs(circle1.getY()) - 4 < THRESHOLD){
			System.out.println("PASSED: setY");
		}
		else{
			System.out.println("FAILED: setY");
		}

		circle4.setY(-10.0);
		if(Math.abs(circle4.getY()) - 10 < THRESHOLD){
			System.out.println("PASSED: setY");
		}
		else{
			System.out.println("FAILED: setY");
		}

		circle3.setY(20.0);
		if(Math.abs(circle3.getY()) - 20 < THRESHOLD){
			System.out.println("PASSED: setY");
		}
		else{
			System.out.println("FAILED: setY");
		}
	}
	
}
