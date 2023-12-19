
/*
 * CircleTester.java
 * Author:  Prateek Yadav
 * Submission Date:  10/29/2021
 * Due Date: 10/29/2021
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
 * 
 * I agree with this statement^
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
		System.out.println("circle1 name =" + circle1.getName());
		System.out.println("circle1 center = (" + circle1.getX() +","+ circle1.getY()+")");
		System.out.println("circle1 radius =" + circle1.getRadius());
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2 radius =" + circle2.getRadius());
		System.out.println("circle2 center = (" + circle2.getX() +","+ circle2.getY()+")");
		// print circle1 diameter, area and perimeter
		System.out.println("circle1 diameter =" + circle1.diameter());
		System.out.println("circle1 area =" + circle1.area());
		System.out.println("circle1 perimeter =" + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("circle2 diameter =" + circle2.diameter());
		System.out.println("circle2 area =" + circle2.area());
		System.out.println("circle2 perimeter =" + circle2.perimeter());
		// display whether circle1 is a unit circle
		if(circle1.isUnitCircle()){
			System.out.println("circle1 is a unit circle.");
		}
		else {
			System.out.println("circle1 is not a unit circle.");
		}
		// display whether circle2 is a unit circle
		if(circle2.isUnitCircle()){
			System.out.println("circle2 is a unit circle.");
		}
		else {
			System.out.println("circle2 is not a unit circle.");
		}
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		//______________________________________________________________________________
		
		//Equals Cases
		Circle eqTest1 = new Circle();
		Circle eqTest2 = new Circle();
		//Case 1, circles are equal
		eqTest1.setX(0.0);
		eqTest1.setY(0.0);
		eqTest1.setRadius(2);
		
		eqTest2.setX(0.0);
		eqTest2.setY(0.0);
		eqTest2.setRadius(2);
		if (eqTest1.equals(eqTest2)) {
			System.out.println("PASSED: Equals");
		}
		else {
			System.out.println("FAILED: Equals");
		}
		
		//Case 2, circles are not equal
		eqTest1.setX(0.0);
		eqTest1.setY(3.0);
		eqTest1.setRadius(2);
		
		eqTest2.setX(0.0);
		eqTest2.setY(0.0);
		eqTest2.setRadius(4);
		if (eqTest1.equals(eqTest2)) {
			System.out.println("FAILED: Equals");
		}
		else {
			System.out.println("PASSED: Equals");
		}
		
		//Case 3, Coordinates equal, radius different
		eqTest1.setX(3.0);
		eqTest1.setY(3.0);
		eqTest1.setRadius(2);
		
		eqTest2.setX(3.0);
		eqTest2.setY(3.0);
		eqTest2.setRadius(7);
		if (eqTest1.equals(eqTest2)) {
			System.out.println("FAILED: Equals");
		}
		else {
			System.out.println("PASSED: Equals");
		}
		
		//______________________________________________________________________________
		
		//Distance
		
		Circle disTest1 = new Circle();
		Circle disTest2 = new Circle();
		
		//Case 1, different Y
		disTest1.setX(0);
		disTest1.setY(0);
		
		disTest2.setX(0);
		disTest2.setY(4);
		if (((disTest1.distance(disTest2))- 4.0) < THRESHOLD) {
			System.out.println("PASSED: Distance");
		}
		else {
			System.out.println("FAILED: Distance");
		}
		
		//Case 2, Different X
		disTest1.setX(0);
		disTest1.setY(0);
		
		disTest2.setX(4);
		disTest2.setY(0);
		if (((disTest1.distance(disTest2))- 4.0) < THRESHOLD) {
			System.out.println("PASSED: Distance");
		}
		else {
			System.out.println("FAILED: Distance");
		}
		//Case 3, circles on top of each other
		disTest1.setX(0);
		disTest1.setY(0);
		
		disTest2.setX(0);
		disTest2.setY(0);
		if (((disTest1.distance(disTest2))- 0.0) < THRESHOLD) {
			System.out.println("PASSED: Distance");
		}
		else {
			System.out.println("FAILED: Distance");
		}
		
		//______________________________________________________________________________
		
		//Is Smaller
		Circle smallTest1 = new Circle();
		Circle smallTest2 = new Circle();
		
		//Case 1, circle one is smaller
		smallTest1.setRadius(5);
		smallTest2.setRadius(6);
		if (smallTest1.isSmaller(smallTest2)) {
			System.out.println("PASSED: Smaller");
		}
		else {
			System.out.println("FAILED: Smaller");
		}
		//Case 2, circle one is bigger
		smallTest1.setRadius(7);
		smallTest2.setRadius(6);
		if (smallTest1.isSmaller(smallTest2)) {
			System.out.println("FAILED: Smaller");
		}
		else {
			System.out.println("PASSED: Smaller");
		}
		//Case 3, same radius
		smallTest1.setRadius(6);
		smallTest2.setRadius(6);
		if ((smallTest1.isSmaller(smallTest2))) {
			System.out.println("FAILED: Smaller");
		}
		else {
			System.out.println("PASSED: Smaller");
		}
		
		//______________________________________________________________________________
		
		//Compare to
		Circle compareTest1 = new Circle();
		Circle compareTest2 = new Circle();
		
		//Case 1, circle one is smaller
		compareTest1.setRadius(5);
		compareTest2.setRadius(6);
		if (compareTest1.compareTo(compareTest2) == -1) {
			System.out.println("PASSED: Compare");
		}
		else {
			System.out.println("FAILED: Compare");
		}
		//Case 2, circle one is bigger
		compareTest1.setRadius(7);
		compareTest2.setRadius(6);
		if (compareTest1.compareTo(compareTest2) == 1){
			System.out.println("PASSED: Compare");
		}
		else {
			System.out.println("FAILED: Compare");
		}
		//Case 3, same radius
		compareTest1.setRadius(6);
		compareTest2.setRadius(6);
		if (compareTest1.compareTo(compareTest2) == 0) {
			System.out.println("PASSED: Compare");
		}
		else {
			System.out.println("FAILED: Compare");
		}
		
		//______________________________________________________________________________
		
		//Intersects
		Circle intersectTest1 = new Circle();
		Circle intersectTest2 = new Circle();
		
		//Case 1, circles do intersect
		
		intersectTest1.setX(0);
		intersectTest1.setY(0);
		intersectTest1.setRadius(3);
		intersectTest2.setX(0);
		intersectTest2.setY(2);
		intersectTest2.setRadius(4);
		if (intersectTest1.intersects(intersectTest2)) {
			System.out.println("PASSED: Intersects");
		}
		else {
			System.out.println("FAILED: Intersects");
		}
		
		//Case 2, circles don't intersect
		
		intersectTest1.setX(0);
		intersectTest1.setY(0);
		intersectTest1.setRadius(1);
		intersectTest2.setX(70);
		intersectTest2.setY(70);
		intersectTest2.setRadius(2);
		if (intersectTest1.intersects(intersectTest2)) {
			System.out.println("FAILED: Intersects");
		}
		else {
			System.out.println("PASSED: Intersects");
		}
		
		//Case 3, circles on top of each other, should intersect
		intersectTest1.setX(0);
		intersectTest1.setY(0);
		intersectTest1.setRadius(1);
		intersectTest2.setX(0);
		intersectTest2.setY(0);
		intersectTest2.setRadius(1);
		if (intersectTest1.intersects(intersectTest2)) {
			System.out.println("PASSED: Intersects");
		}
		else {
			System.out.println("FAILED: Intersects");
		}
		
		//______________________________________________________________________________
		
		//Diameter
		Circle diamTest = new Circle();
		
		//Case 1, radius 4
		
		diamTest.setRadius(4);
		if (diamTest.diameter() - 8 < THRESHOLD) {
			System.out.println("PASSED: Diameter");
		}
		else {
			System.out.println("FAILED: Diameter");
		}
		
		//Case 2, radius 7.7
		
		diamTest.setRadius(7.7);
		if (diamTest.diameter() - 15.4 < THRESHOLD) {
			System.out.println("PASSED: Diameter");
		}
		else {
			System.out.println("FAILED: Diameter");
		}
		
		//Case 3, radius 10
		
		diamTest.setRadius(10.0);
		if (diamTest.diameter() - 20.0 < THRESHOLD) {
			System.out.println("PASSED: Diameter");
		}
		else {
			System.out.println("FAILED: Diameter");
		}
		
		//______________________________________________________________________________
		
		//Is Unit circle
		Circle uniTest = new Circle();
		
		//Case 1, is a unit circle
		uniTest.setX(0);
		uniTest.setY(0);
		uniTest.setRadius(1);
		if(uniTest.isUnitCircle()){
			System.out.println("PASSED: Unit Circle");
		}
		else {
			System.out.println("FAILED: Unit Circle");
		}
		
		//Case 2, radius 2, correct center
		
		uniTest.setX(0);
		uniTest.setY(0);
		uniTest.setRadius(2);
		if(uniTest.isUnitCircle()){
			System.out.println("FAILED: Unit Circle");
		}
		else {
			System.out.println("PASSED: Unit Circle");
		}
		
		//Case 3, totally wrong
		
		uniTest.setX(3);
		uniTest.setY(90);
		uniTest.setRadius(3773821);
		if(uniTest.isUnitCircle()){
			System.out.println("FAILED: Unit Circle");
		}
		else {
			System.out.println("PASSED: Unit Circle");
		}
		
		//______________________________________________________________________________
		
		//Perimeter
		Circle perimTest = new Circle();
		
		//Case 1, radius of 7
		perimTest.setRadius(7);
		if(perimTest.perimeter() - 43.9823 < THRESHOLD){
			System.out.println("PASSED: Perimeter");
		}
		else {
			System.out.println("FAILED: Perimeter");
		}
		//Case 2, radius of 5
		perimTest.setRadius(5);
		if(perimTest.perimeter() - 31.41593 < THRESHOLD){
			System.out.println("PASSED: Perimeter");
		}
		else {
			System.out.println("FAILED: Perimeter");
		}
		//Case 3, radius of 9
		perimTest.setRadius(9);
		if(perimTest.perimeter() - 56.54867 < THRESHOLD){
			System.out.println("PASSED: Perimeter");
		}
		else {
			System.out.println("FAILED: Perimeter");
		}
		//______________________________________________________________________________
		
		//Area
		Circle areaTest = new Circle();
		
		//Case 1, radius  72
		areaTest.setRadius(72);
		if(areaTest.area() - 16286.01632 < THRESHOLD){
			System.out.println("PASSED: Area");
		}
		else {
			System.out.println("FAILED: Area");
		}
		//Case 2, radius 25
		areaTest.setRadius(25);
		if(areaTest.area() - 1963.49541 < THRESHOLD){
			System.out.println("PASSED: Area");
		}
		else {
			System.out.println("FAILED: Area");
		}
		//Case 3, radius 34
		areaTest.setRadius(34);
		if(areaTest.area() - 3631.68111 < THRESHOLD){
			System.out.println("PASSED: Area");
		}
		else {
			System.out.println("FAILED: Area");
		}
		
	}
}