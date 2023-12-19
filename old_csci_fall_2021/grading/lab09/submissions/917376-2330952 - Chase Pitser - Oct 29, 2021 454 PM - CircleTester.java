/*
 * CircleTester.java
 * Author: Chase Pitser
 * Submission Date:  10/29/2021
 *
 * Purpose: This program has a series of tests to check and see if the methods
 * in the Circle.java program are working as they are intended to work. It makes 
 * many different calls to the methods and checks that what is outputted is 
 * the desired output. The program then prints either a PASSED or FAILED
 * output to indicate the success of the tests.
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
		System.out.println("\ncircle1="+circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("\ncircle2="+circle2);
		System.out.print("\n");
		
		// print circle1 diameter, area and perimeter
		System.out.println(circle1.getName() + " Diameter: " + circle1.diameter());
		System.out.println(circle1.getName() + " Area: " + circle1.area());
		System.out.println(circle1.getName() + " Perimeter: " + circle1.perimeter());
		System.out.print("\n");
		
		// print circle2 diameter, area and perimeter
		System.out.println(circle2.getName() + " Diameter: " + circle2.diameter());
		System.out.println(circle2.getName() + " Area: " + circle2.area());
		System.out.println(circle2.getName() + " Perimeter: " + circle2.perimeter());
		System.out.print("\n");
		
		// display whether circle1 is a unit circle
		System.out.println(circle1.getName() + " is a unit circle?: " + circle1.isUnitCircle());
		System.out.print("\n");
		
		// display whether circle2 is a unit circle
		System.out.println(circle2.getName() + " is a unit circle?: " + circle2.isUnitCircle());
		System.out.print("\n");
		
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		//-------------------------
		// testing getName method
		//-------------------------
		System.out.println("getName method tests:");
			// test 1
		circle2.setName("myCircle");
		if(circle2.getName().equals("myCircle")) {
			System.out.println("PASSED: getName method test 1");
		}else {
			System.out.println("FAILED: getName method test 1");
		}
			// test 2
		circle1.setName("coolCircle");
		circle1.setName("awesomeCircle");
		if(circle1.getName().equals("awesomeCircle")) {
			System.out.println("PASSED: getName method test 2");
		}else {
			System.out.println("FAILED: getName method test 2");
		}
			// test 3
		circle2.setName("");
		if(circle2.getName().equals("")) {
			System.out.println("PASSED: getName method test 3");
		}else {
			System.out.println("FAILED: getName method test 3");
		}
		// test 4
		circle1.setName(null);
		if(circle1.getName()==null) {
			System.out.println("PASSED: getName method test 4");
		}else {
			System.out.println("FAILED: getName method test 4");
		}
		
		
		//-------------------------
		// testing getX method
		//-------------------------
		System.out.println("\ngetX method tests:");
			// test 1
		circle1.setX(2.034);
		if(Math.abs(circle1.getX()-2.034)<THRESHOLD) {
			System.out.println("PASSED: getX method test 1");
		}else {
			System.out.println("FAILED: getX method test 1");
		}
			//test 2
		circle2.setX(6.0);
		circle2.setX(-15.0);
		if(Math.abs(circle2.getX()-(-15.0))<THRESHOLD) {
			System.out.println("PASSED: getX method test 2");
		}else {
			System.out.println("FAILED: getX method test 2");
		}
			//test 3
		circle1.setX(0);
		if(Math.abs(circle1.getX())<THRESHOLD) {
			System.out.println("PASSED: getX method test 3");
		}else {
			System.out.println("FAILED: getX method test 3");
		}
		
		
		//-------------------------
		// testing getY method
		//-------------------------
		System.out.println("\ngetY method tests:");
			// test 1
		circle1.setY(-216.0);
		if(Math.abs(circle1.getY()-(-216.0))<THRESHOLD) {
			System.out.println("PASSED: getY method test 1");
		}else {
			System.out.println("FAILED: getY method test 1");
		}
			//test 2
		circle2.setY(7.20);
		circle2.setY(3.73);
		if(Math.abs(circle2.getY()-3.73)<THRESHOLD) {
			System.out.println("PASSED: getY method test 2");
		}else {
			System.out.println("FAILED: getY method test 2");
		}
			//test 3
		circle1.setY(1.0);
		if(Math.abs(circle1.getY()-1.0)<THRESHOLD) {
			System.out.println("PASSED: getY method test 3");
		}else {
			System.out.println("FAILED: getY method test 3");
		}
		
		
		//-------------------------
		// testing getRadius method
		//-------------------------
		System.out.println("\ngetRadius method tests:");
			// test 1
		circle1.setRadius(9.0);
		if(Math.abs(circle1.getRadius()-9.0)<THRESHOLD) {
			System.out.println("PASSED: getRadius method test 1");
		}else {
			System.out.println("FAILED: getRadius method test 1");
		}
			//test 2
		circle2.setRadius(5.0);
		circle2.setRadius(-20.0);
		if(Math.abs(circle2.getRadius()-5.0)<THRESHOLD) {
			System.out.println("PASSED: getRadius method test 2");
		}else {
			System.out.println("FAILED: getRadius method test 2");
		}
			//test 3
		circle1.setRadius(0.0);
		if(Math.abs(circle1.getRadius())<THRESHOLD) {
			System.out.println("PASSED: getRadius method test 3");
		}else {
			System.out.println("FAILED: getRadius method test 3");
		}
		
		
		//-------------------------
		// testing setName method
		//-------------------------
		System.out.println("\nsetName method tests:");
			// test 1
		circle1.setName("testingCircle");
		if(circle1.getName().equals("testingCircle")) {
			System.out.println("PASSED: setName method test 1");
		}else {
			System.out.println("FAILED: setName method test 1");
		}
			// test 2
		circle2.setName("roundCircle");
		circle2.setName("funRoundCircle");
		if(circle2.getName().equals("funRoundCircle")) {
			System.out.println("PASSED: setName method test 2");
		}else {
			System.out.println("FAILED: setName method test 2");
		}
			// test 3
		circle1.setName("");
		if(circle1.getName().equals("")) {
			System.out.println("PASSED: setName method test 3");
		}else {
			System.out.println("FAILED: setName method test 3");
		}
		// test 4
		circle2.setName(null);
		if(circle2.getName()==null) {
			System.out.println("PASSED: setName method test 4");
		}else {
			System.out.println("FAILED: setName method test 4");
		}
		
		
		//-------------------------
		// testing setX method
		//-------------------------
		System.out.println("\nsetX method tests:");
			// test 1
		circle1.setX(3490.0);
		if(Math.abs(circle1.getX()-3490.0)<THRESHOLD) {
			System.out.println("PASSED: setX method test 1");
		}else {
			System.out.println("FAILED: setX method test 1");
		}
			//test 2
		circle2.setX(1000000000.0);
		circle2.setX(3.94);
		if(Math.abs(circle2.getX()-3.94)<THRESHOLD) {
			System.out.println("PASSED: setX method test 2");
		}else {
			System.out.println("FAILED: setX method test 2");
		}
			//test 3
		circle1.setX(-111.0/56.0);
		if(Math.abs(circle1.getX()-(-111.0/56.0))<THRESHOLD) {
			System.out.println("PASSED: setX method test 3");
		}else {
			System.out.println("FAILED: setX method test 3");
		}
		
		
		//-------------------------
		// testing setY method
		//-------------------------
		System.out.println("\nsetY method tests:");
			// test 1
		circle1.setY(461.0);
		if(Math.abs(circle1.getY()-461.0)<THRESHOLD) {
			System.out.println("PASSED: setY method test 1");
		}else {
			System.out.println("FAILED: setY method test 1");
		}
			//test 2
		circle2.setY(-475474.0);
		circle2.setY(-6.237);
		if(Math.abs(circle2.getY()-(-6.237))<THRESHOLD) {
			System.out.println("PASSED: setY method test 2");
		}else {
			System.out.println("FAILED: setY method test 2");
		}
			//test 3
		circle1.setY(8.0/15.0);
		if(Math.abs(circle1.getY()-(8.0/15.0))<THRESHOLD) {
			System.out.println("PASSED: setY method test 3");
		}else {
			System.out.println("FAILED: setY method test 3");
		}
		
		
		//-------------------------
		// testing setRadius method
		//-------------------------
		System.out.println("\nsetRadius method tests:");
			// test 1
		circle1.setRadius(24.907);
		if(Math.abs(circle1.getRadius()-24.907)<THRESHOLD) {
			System.out.println("PASSED: setRadius method test 1");
		}else {
			System.out.println("FAILED: setRadius method test 1");
		}
			//test 2
		circle2.setRadius(92.0);
		circle2.setRadius(-1396.0);
		if(Math.abs(circle2.getRadius()-92.0)<THRESHOLD) {
			System.out.println("PASSED: setRadius method test 2");
		}else {
			System.out.println("FAILED: setRadius method test 2");
		}
			//test 3
		circle1.setRadius(0.0001);
		if(Math.abs(circle1.getRadius()-0.0001)<THRESHOLD) {
			System.out.println("PASSED: setRadius method test 3");
		}else {
			System.out.println("FAILED: setRadius method test 3");
		}
		
		
		//-------------------------
		// testing area method
		//-------------------------
		System.out.println("\narea method tests:");
			// test 1
		circle1.setRadius(1.0);
		if(Math.abs(circle1.area()-Math.PI)<THRESHOLD) {
			System.out.println("PASSED: area method test 1");
		}else {
			System.out.println("FAILED: area method test 1");
		}
			// test 2
		circle1.setRadius(5.0);
		if(Math.abs(circle1.area()-25.0*Math.PI)<THRESHOLD) {
			System.out.println("PASSED: area method test 2");
		}else {
			System.out.println("FAILED: area method test 2");
		}
			// test 3
		circle1.setRadius(Math.PI);
		if(Math.abs(circle1.area()-Math.pow(Math.PI,3))<THRESHOLD) {
			System.out.println("PASSED: area method test 3");
		}else {
			System.out.println("FAILED: area method test 3");
		}
			// test 4
		circle1.setRadius(0.0);
		if(Math.abs(circle1.area())<THRESHOLD) {
			System.out.println("PASSED: area method test 4");
		}else {
			System.out.println("FAILED: area method test 4");
		}
		
		
		//-------------------------
		// testing perimeter method
		//-------------------------
		System.out.println("\nperimeter method tests:");
			// test 1
		circle1.setRadius(1.0);
		if(Math.abs(circle1.perimeter()-2.0*Math.PI)<THRESHOLD) {
			System.out.println("PASSED: perimeter method test 1");
		}else {
			System.out.println("FAILED: perimeter method test 1");
		}
			// test 2
		circle1.setRadius(0.0);
		if(Math.abs(circle1.perimeter())<THRESHOLD) {
			System.out.println("PASSED: perimeter method test 2");
		}else {
			System.out.println("FAILED: perimeter method test 2");
		}
			// test 3
		circle1.setRadius(Math.PI);
		if(Math.abs(circle1.perimeter()-2.0*Math.PI*Math.PI)<THRESHOLD) {
			System.out.println("PASSED: perimeter method test 3");
		}else {
			System.out.println("FAILED: perimeter method test 3");
		}
			// test 4
		circle1.setRadius(5.0);
		if(Math.abs(circle1.perimeter()-10.0*Math.PI)<THRESHOLD) {
			System.out.println("PASSED: perimeter method test 4");
		}else {
			System.out.println("FAILED: perimeter method test 4");
		}
		
		
		//-------------------------
		// testing diameter method
		//-------------------------
		System.out.println("\ndiameter method tests:");
			// test 1
		circle1.setRadius(1.0);
		if(Math.abs(circle1.diameter()-2.0)<THRESHOLD) {
			System.out.println("PASSED: diameter method test 1");
		}else {
			System.out.println("FAILED: diameter method test 1");
		}
			// test 2
		circle1.setRadius(0.0);
		if(Math.abs(circle1.diameter())<THRESHOLD) {
			System.out.println("PASSED: diameter method test 2");
		}else {
			System.out.println("FAILED: diameter method test 2");
		}
			// test 3
		circle1.setRadius(2.0*Math.PI);
		if(Math.abs(circle1.diameter()-4.0*Math.PI)<THRESHOLD) {
			System.out.println("PASSED: diameter method test 3");
		}else {
			System.out.println("FAILED: diameter method test 3");
		}
			// test 4
		circle1.setRadius(17.0);
		if(Math.abs(circle1.diameter()-34.0)<THRESHOLD) {
			System.out.println("PASSED: diameter method test 4");
		}else {
			System.out.println("FAILED: perimeter method test 4");
		}
		
		
		//-------------------------
		// testing isUnitCircle method
		//-------------------------
		System.out.println("\nisUnitCircle method tests:");
			//test 1 - unit circle
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(1.0);
		if(circle1.isUnitCircle()) {
			System.out.println("PASSED: isUnitCircle method test 1");
		}else {
			System.out.println("FAILED: isUnitCircle method test 1");
		}
			//test 2 - not unit circle
		circle1.setX(1.0);
		circle1.setY(1.0);
		circle1.setRadius(1.0);
		if(!circle1.isUnitCircle()) {
			System.out.println("PASSED: isUnitCircle method test 2");
		}else {
			System.out.println("FAILED: isUnitCircle method test 2");
		}
			//test 3 - not unit circle
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2.0);
		if(!circle1.isUnitCircle()) {
			System.out.println("PASSED: isUnitCircle method test 3");
		}else {
			System.out.println("FAILED: isUnitCircle method test 3");
		}
		
		
		//-------------------------
		// testing toString method
		//-------------------------
		System.out.println("\ntoString method tests:");
			// test 1
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(1.0);
		if(circle1.toString().equals("name: Circle 1\ncenter: (0.0,0.0)\nradius: 1.0")) {
			System.out.println("PASSED: toString method test 1");
		}else {
			System.out.println("FAILED: toString method test 1");
		}
			// test 2
		circle2.setName("Circle 2");
		circle2.setX(5.0);
		circle2.setY(8.0);
		circle2.setRadius(3.0);
		if(circle2.toString().equals("name: Circle 2\ncenter: (5.0,8.0)\nradius: 3.0")) {
			System.out.println("PASSED: toString method test 2");
		}else {
			System.out.println("FAILED: toString method test 2");
		}
			// test 3
		circle1.setName("This is a Circle");
		circle1.setX(7.3);
		circle1.setY(-9.22);
		circle1.setRadius(6.7);
		if(circle1.toString().equals("name: This is a Circle\ncenter: (7.3,-9.22)\nradius: 6.7")) {
			System.out.println("PASSED: toString method test 3");
		}else {
			System.out.println("FAILED: toString method test 3");
		}
		
		
		//-------------------------
		// testing equals method
		//-------------------------
		System.out.println("\nequals method tests:");
		circle1.setX(1.0);
		circle1.setY(1.0);
		circle1.setRadius(1.0);
			// test 1: different center, different radius
		circle2.setX(2.0);
		circle2.setY(5.0);
		circle2.setRadius(3.0);
		if(!(circle1.equals(circle2))) {
			System.out.println("PASSED: equals method test 1");
		}else {
			System.out.println("FAILED: equals method test 1");
		}
			// test 2: same center, different radius
		circle2.setX(1.0);
		circle2.setY(1.0);
		circle2.setRadius(3.0);
		if(!(circle1.equals(circle2))) {
			System.out.println("PASSED: equals method test 2");
		}else {
			System.out.println("FAILED: equals method test 2");
		}
			// test 3: different center, same radius
		circle2.setX(2.0);
		circle2.setY(5.0);
		circle2.setRadius(6.0);
		if(!(circle1.equals(circle2))) {
			System.out.println("PASSED: equals method test 3");
		}else {
			System.out.println("FAILED: equals method test 3");
		}
			// test 4: same center, same radius
		circle2.setX(1.0);
		circle2.setY(1.0);
		circle2.setRadius(1.0);
		if(circle1.equals(circle2)) {
			System.out.println("PASSED: equals method test 4");
		}else {
			System.out.println("FAILED: equals method test 4");
		}
		
		
		//-------------------------
		// testing distance method
		//-------------------------
		System.out.println("\ndistance method tests:");
		circle1.setX(0.0);
		circle1.setY(0.0);
			// test 1: distance of 0
		circle2.setX(0.0);
		circle2.setY(0.0);
		if(Math.abs(circle1.distance(circle2))<THRESHOLD) {
			System.out.println("PASSED: distance method test 1");
		}else {
			System.out.println("FAILED: distance method test 1");
		}
			// test 2: distance of 5 in x direction
		circle2.setX(5.0);
		circle2.setY(0.0);
		if(Math.abs(circle1.distance(circle2)-5.0)<THRESHOLD) {
			System.out.println("PASSED: distance method test 2");
		}else {
			System.out.println("FAILED: distance method test 2");
		}
			// test 3: distance of 10 in y direction
		circle2.setX(0.0);
		circle2.setY(10.0);
		if(Math.abs(circle1.distance(circle2)-10.0)<THRESHOLD) {
			System.out.println("PASSED: distance method test 3");
		}else {
			System.out.println("FAILED: distance method test 3");
		}
			// test 4: distance in both directions
		circle2.setX(7.0);
		circle2.setY(3.0);
		if(Math.abs(circle1.distance(circle2)-Math.sqrt(58.0))<THRESHOLD) {
			System.out.println("PASSED: distance method test 4");
		}else {
			System.out.println("FAILED: distance method test 4");
		}
			// test 5: distance in both directions
		circle1.setX(2.0);
		circle1.setY(6.0);
		circle2.setX(7.0);
		circle2.setY(3.0);
		if(Math.abs(circle1.distance(circle2)-Math.sqrt(34.0))<THRESHOLD) {
			System.out.println("PASSED: distance method test 5");
		}else {
			System.out.println("FAILED: distance method test 5");
		}
		
		
		//-------------------------
		// testing isSmaller method
		//-------------------------
		System.out.println("\nisSmaller method tests:");
		circle1.setRadius(5.0);
			// test 1: calling object is bigger, parameter object is smaller
		circle2.setRadius(1.0);
		if(!circle1.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller method test 1");
		}else {
			System.out.println("FAILED: isSmaller method test 1");
		}
			// test 2: objects are same size
		circle2.setRadius(5.0);
		if(!circle1.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller method test 2");
		}else {
			System.out.println("FAILED: isSmaller method test 2");
		}
			// test 3: calling object is smaller, parameter object is bigger
		circle2.setRadius(10.0);
		if(circle1.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller method test 3");
		}else {
			System.out.println("FAILED: isSmaller method test 3");
		}
		
		
		//-------------------------
		// testing compareTo method
		//-------------------------
		System.out.println("\ncompareTo method tests:");
		circle1.setRadius(5.0);
			// test 1: calling object is bigger, parameter object is smaller
		circle2.setRadius(1.0);
		if(circle1.compareTo(circle2) == 1) {
			System.out.println("PASSED: compareTo method test 1");
		}else {
			System.out.println("FAILED: compareTo method test 1");
		}
			// test 2: objects are same size
		circle2.setRadius(5.0);
		if(circle1.compareTo(circle2) == 0) {
			System.out.println("PASSED: compareTo method test 2");
		}else {
			System.out.println("FAILED: compareTo method test 2");
		}
			// test 3: calling object is smaller, parameter object is bigger
		circle2.setRadius(10.0);
		if(circle1.compareTo(circle2) == -1) {
			System.out.println("PASSED: compareTo method test 3");
		}else {
			System.out.println("FAILED: compareTo method test 3");
		}
		
		
		//-------------------------
		// testing intersects method
		//-------------------------
		System.out.println("\nintersects method tests:");
			// test 1
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(5.0);
		circle2.setX(10.0);
		circle2.setY(0.0);
		circle2.setRadius(5.0);
		if(!circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects method test 1");
		}else {
			System.out.println("FAILED: intersects method test 1");
		}
			// test 2
		if(!circle2.intersects(circle1)) {
			System.out.println("PASSED: intersects method test 1");
		}else {
			System.out.println("FAILED: intersects method test 1");
		}
			// test 3
		circle2.setRadius(6.0);
		if(circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects method test 3");
		}else {
			System.out.println("FAILED: intersects method test 3");
		}
			// test 4
		if(circle2.intersects(circle1)) {
			System.out.println("PASSED: intersects method test 4");
		}else {
			System.out.println("FAILED: intersects method test 4");
		}
			// test 5
		circle2.setX(100.0);
		circle2. setY(100.0);
		if(!circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects method test 5");
		}else {
			System.out.println("FAILED: intersects method test 5");
		}
			// test 6
		if(!circle2.intersects(circle1)) {
			System.out.println("PASSED: intersects method test 6");
		}else {
			System.out.println("FAILED: intersects method test 6");
		}
			// test 7
		circle2.setX(1.0);
		circle2. setY(1.0);
		if(circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects method test 7");
		}else {
			System.out.println("FAILED: intersects method test 7");
		}
			// test 8
		if(circle2.intersects(circle1)) {
			System.out.println("PASSED: intersects method test 8");
		}else {
			System.out.println("FAILED: intersects method test 8");
		}
	}
	
}
