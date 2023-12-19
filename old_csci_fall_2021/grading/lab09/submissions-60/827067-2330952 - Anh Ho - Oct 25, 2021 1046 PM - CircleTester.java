/*
 * CircleTester.java
 * Author:  Anh Ho
 * Submission Date:  10/25/2021
 *
 * Purpose: Testing the Circle class and all of its methods
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
		System.out.println("circle 1:\n"+circle1);	//test setters
		System.out.println("circle 2:\n"+circle2);	//test setters
		
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
		// Reset the center of circle1 (-3.0,4.0)
		circle1.setX(-3.0);
		circle1.setY(4.0);		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		System.out.println("circle 1:\n"+circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2:\n"+circle2);

		//print circle1 diameter, area and perimeter
		System.out.println("circle 1 diameter " + circle1.diameter());
		System.out.println("circle 1 area " + circle1.area());
		System.out.println("circle 1 perimeter " + circle1.perimeter());

		// print circle2 diameter, area and perimeter
		System.out.println("circle 2 diameter " + circle2.diameter());
		System.out.println("circle 2 area " + circle2.area());
		System.out.println("circle 2 perimeter " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		if (circle1.isUnitCircle()) {
			System.out.println("circle 1 is a unit circle");
		}
		else {
			System.out.println("circle 1 is not a unit circle");
		}
		// display whether circle2 is a unit circle
		if (circle2.isUnitCircle()) {
			System.out.println("circle 2 is a unit circle");
		}
		else {
			System.out.println("circle 2 is not a unit circle");
		}
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		//display if circle 1 equals circle 2
		if (circle1.equals(circle2) == false) {
			System.out.println("PASSED: equals()");
		}
		else {
			System.out.println("FAILED: equals()");
		}
		//display isSmaller result
		if (circle1.isSmaller(circle2) == true) {
			System.out.println("PASSED: isSmaller()");
		}
		else {
			System.out.println("FAILED: isSmaller()");
		}
		//display compareTo() result
		if (circle1.compareTo(circle2) == -1) {
			System.out.println("PASSED: compareTo()");
		}
		else {
			System.out.println("FAILED: compareTo()");
		}
		//display distance() result
		if (Math.abs(circle1.distance(circle2) - Math.sqrt((Math.pow((circle1.getX()-circle2.getX()), 2)) + (Math.pow((circle1.getY()-circle2.getY()), 2)))) < THRESHOLD) {
			System.out.println("PASSED: distance()");
		}
		else {
			System.out.println("FAILED: distance()");
		}
		//display intersects() result
		if (circle1.intersects(circle2) == true ) {
			System.out.println("PASSED: intersects()");
		}
		else {
			System.out.println("FAILED: intersects()");
		}
		/*Test case 2 both are unit circles*/
		System.out.println(circle1.getName());
		//setX check
		circle1.setX(0);
		if(Math.abs(0-circle1.getX()) < THRESHOLD) {
			System.out.println("PASSED: Set X");
		}
		else {
			System.out.println("FAILED: Set X");
		}
		//setY check
		circle1.setY(0);
		if(Math.abs(0-circle1.getY()) < THRESHOLD) {
			System.out.println("PASSED: Set Y");
		}
		else {
			System.out.println("FAILED: Set Y");
		}
		circle1.setRadius(1);
		if(Math.abs(1-circle1.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		}
		else {
			System.out.println("FAILED: Set Radius");
		}
		circle1.setRadius(-1);
		if(Math.abs(-1-circle1.getRadius()) < THRESHOLD) {
			System.out.println("FAILED: Set Radius (negative)");
		}
		else {
			System.out.println("PASSED: Set Radius (negative)");
		}
		//diameter check
		if(Math.abs(2-circle1.diameter()) < THRESHOLD) {
			System.out.println("PASSED: diameter()");
		}
		else {
			System.out.println("FAILED: diameter()");
		}
		//area check
		if(Math.abs(1*Math.PI-circle1.area()) < THRESHOLD) {
			System.out.println("PASSED: area()");
		}
		else {
			System.out.println("FAILED: area()");
		}
		//perimeter check
		if(Math.abs(2*Math.PI-circle1.perimeter()) < THRESHOLD) {
			System.out.println("PASSED: perimeter()");
		}
		else {
			System.out.println("FAILED: perimeter()");
		}	
		if (circle1.isUnitCircle() == true) {	
			System.out.println("PASSED: isUnitCircle()");
		}
		else {
			System.out.println("FAILED: isUnitCircle()");
		}
		
		System.out.println(circle2.getName());
		circle2.setX(0);
		if(Math.abs(0-circle2.getX()) < THRESHOLD) {
			System.out.println("PASSED: Set X");
		}
		else {
			System.out.println("FAILED: Set X");
		}
		circle2.setY(0);
		if(Math.abs(0-circle2.getY()) < THRESHOLD) {
			System.out.println("PASSED: Set Y");
		}
		else {
			System.out.println("FAILED: Set Y");
		}
		circle2.setRadius(1);
		if(Math.abs(1-circle2.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		}
		else {
			System.out.println("FAILED: Set Radius");
		}
		circle2.setRadius(-1);
		if(Math.abs(-1-circle2.getRadius()) < THRESHOLD) {
			System.out.println("FAILED: Set Radius (negative)");
		}
		else {
			System.out.println("PASSED: Set Radius (negative)");
		}
		
		//diameter check
		if(Math.abs(2-circle2.diameter()) < THRESHOLD) {
			System.out.println("PASSED: diameter()");
		}
		else {
			System.out.println("FAILED: diameter()");
		}
		//area check
		if(Math.abs(1*Math.PI-circle2.area()) < THRESHOLD) {
			System.out.println("PASSED: area()");
		}
		else {
			System.out.println("FAILED: area()");
		}
		//perimeter check
		if(Math.abs(2*Math.PI-circle2.perimeter()) < THRESHOLD) {
			System.out.println("PASSED: perimeter()");
		}
		else {
			System.out.println("FAILED: perimeter()");
		}
		//isunit check
		if (circle2.isUnitCircle() == true) {	
			System.out.println("PASSED: isUnitCircle()");
		}
		else {
			System.out.println("FAILED: isUnitCircle()");
		}
		//compare methods check
		if (circle1.equals(circle2) == true) {
			System.out.println("PASSED: equals()");
		}
		else {
			System.out.println("FAILED: equals()");
		}
		if (circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects()");
		}
		else {
			System.out.println("FAILED: intersects()");
		}
		if (circle1.isSmaller(circle2) == false) {
			System.out.println("PASSED: isSmaller()");
		}
		else {
			System.out.println("FAILED: isSmaller()");
		}
		if (circle1.compareTo(circle2) == 0) {
			System.out.println("PASSED: compareTo()");
		}
		else {
			System.out.println("FAILED: compareTo()");
		}
		//distance check
		if (Math.abs(circle1.distance(circle2)-0)<THRESHOLD) {
			System.out.println("PASSED: distance()");
		}
		else {
			System.out.println("FAILED: distance()");
		}
		
		/*Test case 3 circle 1 is unit circle and circle 2 isnt, does not intersect*/
		System.out.println(circle2.getName());
		circle2.setX(3);
		if(Math.abs(3-circle2.getX()) < THRESHOLD) {
			System.out.println("PASSED: Set X");
		}
		else {
			System.out.println("FAILED: Set X");
		}
		circle2.setY(4);
		if(Math.abs(4-circle2.getY()) < THRESHOLD) {
			System.out.println("PASSED: Set Y");
		}
		else {
			System.out.println("FAILED: Set Y");
		}
		circle2.setRadius(2);
		if(Math.abs(2-circle2.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		}
		else {
			System.out.println("FAILED: Set Radius");
		}
		circle2.setRadius(-1);
		if(Math.abs(-1-circle2.getRadius()) < THRESHOLD) {
			System.out.println("FAILED: Set Radius (negative)");
		}
		else {
			System.out.println("PASSED: Set Radius (negative)");
		}
		
		//diameter check
		if(Math.abs(4-circle2.diameter()) < THRESHOLD) {
			System.out.println("PASSED: diameter()");
		}
		else {
			System.out.println("FAILED: diameter()");
		}
		//area check
		if(Math.abs(2*2*Math.PI-circle2.area()) < THRESHOLD) {
			System.out.println("PASSED: area()");
		}
		else {
			System.out.println("FAILED: area()");
		}
		//perimeter check
		if(Math.abs(4*Math.PI-circle2.perimeter()) < THRESHOLD) {
			System.out.println("PASSED: perimeter()");
		}
		else {
			System.out.println("FAILED: perimeter()");
		}
		//isunit check
		if (circle2.isUnitCircle() == false) {	
			System.out.println("PASSED: isUnitCircle()");
		}
		else {
			System.out.println("FAILED: isUnitCircle()");
		}
		//compare methods check
		if (circle1.equals(circle2) == false) {
			System.out.println("PASSED: equals()");
		}
		else {
			System.out.println("FAILED: equals()");
		}
		if (circle1.intersects(circle2) == false) {
			System.out.println("PASSED: intersects()");
		}
		else {
			System.out.println("FAILED: intersects()");
		}
		if (circle1.isSmaller(circle2) == true) {
			System.out.println("PASSED: isSmaller()");
		}
		else {
			System.out.println("FAILED: isSmaller()");
		}
		if (circle1.compareTo(circle2) == -1) {
			System.out.println("PASSED: compareTo()");
		}
		else {
			System.out.println("FAILED: compareTo()");
		}
		//distance check
		if (Math.abs(circle1.distance(circle2)- (Math.sqrt((Math.pow((circle1.getX()-circle2.getX()), 2)) + (Math.pow((circle1.getY()-circle2.getY()), 2)))))<THRESHOLD) {
			System.out.println("PASSED: distance()");
		}
		else {
			System.out.println("FAILED: distance()");
		}
	}	//close main
}	//close class