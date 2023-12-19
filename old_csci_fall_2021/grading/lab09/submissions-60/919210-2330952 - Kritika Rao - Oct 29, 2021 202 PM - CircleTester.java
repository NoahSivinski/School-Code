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
		//3a
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
		System.out.println("circle1=" + circle1);

		// set the circle2 radius to 5.3
		//3b
		circle2.setRadius(5.3);

		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		//3c
		System.out.println("circle2=" + circle2);

		// print circle1 diameter, area and perimeter
		//3d
		System.out.println("circle1 diameter: " + circle1.diameter());
		System.out.println("circle1 area: " + circle1.area());
		System.out.println("circle1 perimeter: " + circle1.perimeter());

		// print circle2 diameter, area and perimeter
		//3e
		System.out.println("circle2 diameter: " +circle2.diameter());
		System.out.println("circle2 area: " +circle2.area());
		System.out.println("circle2 perimeter: " +circle2.perimeter());

		// display whether circle1 is a unit circle
		//3f
		System.out.println("circle1 is a unit circle: " + circle1.isUnitCircle());

		// display whether circle2 is a unit circle
		//3g
		System.out.println("circle2 is a unit circle: " + circle2.isUnitCircle());

		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.


		/* Test case one */
		System.out.println("\nTest Case One: ");
		Circle circleOne = new Circle();
		circleOne.setName("Circle One");
		//testing setX method
		circleOne.setX(3);
		if(Math.abs(3-circleOne.getX()) < THRESHOLD) {
			System.out.println("PASSED: Set X");
		}
		else {
			System.out.println("FAILED: Set X");
		}
		//testing setY method
		circleOne.setY(5);
		if(Math.abs(5-circleOne.getY()) < THRESHOLD) {
			System.out.println("PASSED: Set Y");
		}
		else {
			System.out.println("FAILED: Set Y");
		}
		//testing setRadius method
		circleOne.setRadius(4);
		if(Math.abs(4-circleOne.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		}
		else {
			System.out.println("FAILED: Set Radius");
		}
		//testing setRadius method negative case
		circleOne.setRadius(-4);
		if(Math.abs(4-circleOne.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius (negative)");
		}
		else {
			System.out.println("FAILED: Set Radius (negative)");
		}
		//testing diameter method
		if(Math.abs(8-circleOne.diameter()) < THRESHOLD) {
			System.out.println("PASSED: diameter()");
		}
		else {
			System.out.println("FAILED: diameter()");
		}
		//testing area method
		if(Math.abs(50.26548245743669-circleOne.area()) < THRESHOLD) {
			System.out.println("PASSED: area()");
		}
		else {
			System.out.println("FAILED: area()");
		}
		//testing perimeter method
		if(Math.abs(25.132741228718345-circleOne.perimeter()) < THRESHOLD) {
			System.out.println("PASSED: perimeter()");
		}
		else {
			System.out.println("FAILED: perimeter()");
		}
		//testing isUnitCircle method
		if(false == circleOne.isUnitCircle()) {
			System.out.println("PASSED: isUnitCircle()");
		}
		else {
			System.out.println("FAILED: isUnitCircle()");
		}
		//testing equals method
		if(false == circleOne.equals(circle2)) {
			System.out.println("PASSED: equals()");
		}
		else {
			System.out.println("FAILED: equals()");
		}
		//testing intersects method
		if(true == circleOne.intersects(circle2)) {
			System.out.println("PASSED: intersects()");
		}
		else {
			System.out.println("FAILED: intersects()");
		}

		//testing isSmaller method
		if(true == circleOne.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller()");
		}
		else {
			System.out.println("FAILED: isSmaller()");
		}
		//testing compareTo method
		if(-1 == circleOne.compareTo(circle2)) {
			System.out.println("PASSED: compareTo()");
		}
		else {
			System.out.println("FAILED: compareTo()");
		}

		//testing distance method
		if(Math.abs(4.123105625617661-circleOne.distance(circle2)) < THRESHOLD) {
			System.out.println("PASSED: distance()");
		}
		else {
			System.out.println("FAILED: distance()");
		}





		/* Test case two */
		System.out.println("\nTest Case Two: ");
		Circle circleTwo = new Circle();
		circleTwo.setName("Circle Two");
		//testing setX method
		circleTwo.setX(0);
		if(Math.abs(0-circleTwo.getX()) < THRESHOLD) {
			System.out.println("PASSED: Set X");
		}
		else {
			System.out.println("FAILED: Set X");
		}
		//testing setY method
		circleTwo.setY(0);
		if(Math.abs(0-circleTwo.getY()) < THRESHOLD) {
			System.out.println("PASSED: Set Y");
		}
		else {
			System.out.println("FAILED: Set Y");
		}
		//testing setRadius method
		circleTwo.setRadius(1);
		if(Math.abs(1-circleTwo.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		}
		else {
			System.out.println("FAILED: Set Radius");
		}
		//testing setRadius method negative case
		circleTwo.setRadius(-10);
		if(Math.abs(1-circleTwo.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius (negative)");
		}
		else {
			System.out.println("FAILED: Set Radius (negative)");
		}
		//testing diameter method
		if(Math.abs(2-circleTwo.diameter()) < THRESHOLD) {
			System.out.println("PASSED: diameter()");
		}
		else {
			System.out.println("FAILED: diameter()");
		}
		//testing area method
		if(Math.abs(3.141592653589793-circleTwo.area()) < THRESHOLD) {
			System.out.println("PASSED: area()");
		}
		else {
			System.out.println("FAILED: area()");
		}
		//testing perimeter method
		if(Math.abs(6.283185307179586-circleTwo.perimeter()) < THRESHOLD) {
			System.out.println("PASSED: perimeter()");
		}
		else {
			System.out.println("FAILED: perimeter()");
		}
		//testing isUnitCircle method
		if(true == circleTwo.isUnitCircle()) {
			System.out.println("PASSED: isUnitCircle()");
		}
		else {
			System.out.println("FAILED: isUnitCircle()");
		}
		//testing equals method
		if(false == circleTwo.equals(circle2)) {
			System.out.println("PASSED: equals()");
		}
		else {
			System.out.println("FAILED: equals()");
		}
		//testing intersects method
		if(true == circleTwo.intersects(circle2)) {
			System.out.println("PASSED: intersects()");
		}
		else {
			System.out.println("FAILED: intersects()");
		}

		//testing isSmaller method
		if(true == circleTwo.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller()");
		}
		else {
			System.out.println("FAILED: isSmaller()");
		}
		//testing compareTo method
		if(-1 == circleTwo.compareTo(circle2)) {
			System.out.println("PASSED: compareTo()");
		}
		else {
			System.out.println("FAILED: compareTo()");
		}

		//testing distance method
		if(Math.abs(2.23606797749979-circleTwo.distance(circle2)) < THRESHOLD) {
			System.out.println("PASSED: distance()");
		}
		else {
			System.out.println("FAILED: distance()");
		}

		
	
	
		/* Test case three */
		System.out.println("\nTest Case Three: ");
		Circle circleThree = new Circle();
		circleTwo.setName("Circle Three");
		//testing setX method
		circleThree.setX(50);
		if(Math.abs(50-circleThree.getX()) < THRESHOLD) {
			System.out.println("PASSED: Set X");
		}
		else {
			System.out.println("FAILED: Set X");
		}
		//testing setY method
		circleThree.setY(50);
		if(Math.abs(50-circleThree.getY()) < THRESHOLD) {
			System.out.println("PASSED: Set Y");
		}
		else {
			System.out.println("FAILED: Set Y");
		}
		//testing setRadius method
		circleThree.setRadius(7);
		if(Math.abs(7-circleThree.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		}
		else {
			System.out.println("FAILED: Set Radius");
		}
		//testing setRadius method negative case
		circleThree.setRadius(-8);
		if(Math.abs(7-circleThree.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius (negative)");
		}
		else {
			System.out.println("FAILED: Set Radius (negative)");
		}
		//testing diameter method
		if(Math.abs(14-circleThree.diameter()) < THRESHOLD) {
			System.out.println("PASSED: diameter()");
		}
		else {
			System.out.println("FAILED: diameter()");
		}
		//testing area method
		if(Math.abs(153.93804002589985-circleThree.area()) < THRESHOLD) {
			System.out.println("PASSED: area()");
		}
		else {
			System.out.println("FAILED: area()");
		}
		//testing perimeter method
		if(Math.abs(43.982297150257104-circleThree.perimeter()) < THRESHOLD) {
			System.out.println("PASSED: perimeter()");
		}
		else {
			System.out.println("FAILED: perimeter()");
		}
		//testing isUnitCircle method
		if(false == circleThree.isUnitCircle()) {
			System.out.println("PASSED: isUnitCircle()");
		}
		else {
			System.out.println("FAILED: isUnitCircle()");
		}
		//testing equals method
		if(false == circleThree.equals(circle2)) {
			System.out.println("PASSED: equals()");
		}
		else {
			System.out.println("FAILED: equals()");
		}
		//testing intersects method
		if(false == circleThree.intersects(circle2)) {
			System.out.println("PASSED: intersects()");
		}
		else {
			System.out.println("FAILED: intersects()");
		}

		//testing isSmaller method
		if(false == circleThree.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller()");
		}
		else {
			System.out.println("FAILED: isSmaller()");
		}
		//testing compareTo method
		if(1 == circleThree.compareTo(circle2)) {
			System.out.println("PASSED: compareTo()");
		}
		else {
			System.out.println("FAILED: compareTo()");
		}

		//testing distance method
		if(Math.abs(68.59300255857006-circleThree.distance(circle2)) < THRESHOLD) {
			System.out.println("PASSED: distance()");
		}
		else {
			System.out.println("FAILED: distance()");
		}


		
		
		
		
		/* Test case four */
		System.out.println("\nTest Case Four: ");
		Circle circleFour = new Circle();
		circleTwo.setName("Circle Three");
		//testing setX method
		circleFour.setX(2);
		if(Math.abs(2-circleFour.getX()) < THRESHOLD) {
			System.out.println("PASSED: Set X");
		}
		else {
			System.out.println("FAILED: Set X");
		}
		//testing setY method
		circleFour.setY(1);
		if(Math.abs(1-circleFour.getY()) < THRESHOLD) {
			System.out.println("PASSED: Set Y");
		}
		else {
			System.out.println("FAILED: Set Y");
		}
		//testing setRadius method
		circleFour.setRadius(5.3);
		if(Math.abs(5.3-circleFour.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius");
		}
		else {
			System.out.println("FAILED: Set Radius");
		}
		//testing setRadius method negative case
		circleFour.setRadius(-20);
		if(Math.abs(5.3-circleFour.getRadius()) < THRESHOLD) {
			System.out.println("PASSED: Set Radius (negative)");
		}
		else {
			System.out.println("FAILED: Set Radius (negative)");
		}
		//testing diameter method
		if(Math.abs(10.6-circleFour.diameter()) < THRESHOLD) {
			System.out.println("PASSED: diameter()");
		}
		else {
			System.out.println("FAILED: diameter()");
		}
		//testing area method
		if(Math.abs(88.24733763933729-circleFour.area()) < THRESHOLD) {
			System.out.println("PASSED: area()");
		}
		else {
			System.out.println("FAILED: area()");
		}
		//testing perimeter method
		if(Math.abs(33.3008821280518-circleFour.perimeter()) < THRESHOLD) {
			System.out.println("PASSED: perimeter()");
		}
		else {
			System.out.println("FAILED: perimeter()");
		}
		//testing isUnitCircle method
		if(false == circleFour.isUnitCircle()) {
			System.out.println("PASSED: isUnitCircle()");
		}
		else {
			System.out.println("FAILED: isUnitCircle()");
		}
		//testing equals method
		if(true == circleFour.equals(circle2)) {
			System.out.println("PASSED: equals()");
		}
		else {
			System.out.println("FAILED: equals()");
		}
		//testing intersects method
		if(true == circleFour.intersects(circle2)) {
			System.out.println("PASSED: intersects()");
		}
		else {
			System.out.println("FAILED: intersects()");
		}

		//testing isSmaller method
		if(false == circleFour.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller()");
		}
		else {
			System.out.println("FAILED: isSmaller()");
		}
		//testing compareTo method
		if(0 == circleFour.compareTo(circle2)) {
			System.out.println("PASSED: compareTo()");
		}
		else {
			System.out.println("FAILED: compareTo()");
		}

		//testing distance method
		if(Math.abs(0-circleFour.distance(circle2)) < THRESHOLD) {
			System.out.println("PASSED: distance()");
		}
		else {
			System.out.println("FAILED: distance()");
		}

	}

}
