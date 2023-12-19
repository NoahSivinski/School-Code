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
		System.out.println("circle1=\n"+circle1);
		System.out.println();
		System.out.println("circle2=\n"+circle2);
		System.out.println();
		
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
		System.out.println("circle1=\n" + circle1);
		System.out.println();

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2=\n" + circle2);
		System.out.println();
		
		// print circle1 diameter, area and perimeter
		System.out.println("circle1 diameter: " + circle1.diameter());
		System.out.println("circle1 area: " + circle1.area());
		System.out.println("circle1 perimeter: " + circle1.perimeter());
		System.out.println();
		
		// print circle2 diameter, area and perimeter
		System.out.println("circle2 diameter: " + circle2.diameter());
		System.out.println("circle2 area: " + circle2.area());
		System.out.println("circle2 perimeter: " + circle2.perimeter());
		System.out.println();
		
		// display whether circle1 is a unit circle
		System.out.println("circle1 isUnitCircle = " + circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		System.out.println("circle2 isUnitCircle = " + circle2.isUnitCircle());
		System.out.println();
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		Circle circleA = new Circle();
		circleA.setName("Circle A");
		circleA.setRadius(0.0);
		circleA.setX(0.0);
		circleA.setY(0.0);
		
		Circle circleB = new Circle();
		circleB.setName("Circle B");
		circleB.setRadius(1.0);
		circleB.setX(1.0);
		circleB.setY(1.0);
		
		Circle circleC = new Circle();
		circleC.setName("Circle C");
		circleC.setRadius(2.0);
		circleC.setX(2.0);
		circleC.setY(2.0);
		
		//// GET-NAME TESTS \\\\
		
		//case1
		if (circleA.getName() == "Circle A") {
			System.out.println("getName = PASSED");
		}
		else {
			System.out.println("getName = FAILED");
		}
		
		//case2
		if (circleB.getName() == "Circle B") {
			System.out.println("getName = PASSED");
		}
		else {
			System.out.println("getName = FAILED");
		}
		
		//case3
		if (circleC.getName() != "Circle C") {
			System.out.println("getName = FAILED");
		}
		else {
			System.out.println("getName = PASSED");
		}
		
		System.out.println();
		
		//// GET-X TESTS \\\\
		
		//case1
		if (Math.abs(circleA.getX() - 0.0) < THRESHOLD) {
			System.out.println("getX = PASSED");
		}
		else {
			System.out.println("getX = FAILED");
		}
		
		//case2
		if (Math.abs(circleB.getX() - 1.0) < THRESHOLD) {
			System.out.println("getX = PASSED");
		}
		else {
			System.out.println("getX = FAILED");
		}
		
		//case3
		if (Math.abs(circleC.getX() - 2.0) > THRESHOLD) {
			System.out.println("getX = FAILED");
		}
		else {
			System.out.println("getX = PASSED");
		}
		
		System.out.println();
		
		//// GET-Y TESTS \\\\
		
		//case1
		if (Math.abs(circleA.getY() - 0.0) < THRESHOLD) {
			System.out.println("getY = PASSED");
		}
		else {
			System.out.println("getY = FAILED");
		}
		
		//case2
		if (Math.abs(circleB.getY() - 1.0) < THRESHOLD) {
			System.out.println("getY = PASSED");
		}
		else {
			System.out.println("getY = FAILED");
		}
		
		//case3
		if (Math.abs(circleC.getY() - 2.0) > THRESHOLD) {
			System.out.println("getY = FAILED");
		}
		else {
			System.out.println("getY = PASSED");
		}
		
		System.out.println();
		
		//// GET-RADIUS TESTS \\\\
		
		//case1
		if (Math.abs(circleA.getRadius() - 0.0) < THRESHOLD) {
			System.out.println("getRadius = PASSED");
		}
		else {
			System.out.println("getRadius = FAILED");
		}
		
		//case2
		if (Math.abs(circleB.getRadius() - 1.0) < THRESHOLD) {
			System.out.println("getRadius = PASSED");
		}
		else {
			System.out.println("getRadius = FAILED");
		}
		
		//case3
		if (Math.abs(circleC.getRadius() - 2.0) > THRESHOLD) {
			System.out.println("getRadius = FAILED");
		}
		else {
			System.out.println("getRadius = PASSED");
		}
		
		System.out.println();
		
		//// SET-NAME TESTS \\\\
		
		//case1
		circleA.setName("CircleA");
		if (circleA.getName() == "CircleA") {
			System.out.println("setName = PASSED");
		}
		else {
			System.out.println("setName = FAILED");
		}
		
		//case2
		circleB.setName("CIRCLE B");
		if (circleB.getName() == "CIRCLE B") {
			System.out.println("setName = PASSED");
		}
		else {
			System.out.println("setName = FAILED");
		}
		
		//case3
		circleC.setName("circleC");
		if (circleC.getName() != "circleC") {
			System.out.println("setName = FAILED");
		}
		else {
			System.out.println("setName = PASSED");
		}
		
		System.out.println();
		
		//// SET-X TESTS \\\\
		
		//case1
		circleA.setX(3.0);
		if (Math.abs(circleA.getX() - 3.0) < THRESHOLD) {
			System.out.println("setX = PASSED");
		}
		else {
			System.out.println("setX = FAILED");
		}
		
		//case2
		circleB.setX(6.0);
		if (Math.abs(circleB.getX() - 6.0) < THRESHOLD) {
			System.out.println("setX = PASSED");
		}
		else {
			System.out.println("setX = FAILED");
		}
		
		//case3
		circleC.setX(9.0);
		if (Math.abs(circleC.getX() - 9.0) > THRESHOLD) {
			System.out.println("setX = FAILED");
		}
		else {
			System.out.println("setX = PASSED");
		}
		
		System.out.println();
		
		//// SET-Y TESTS \\\\
		
		//case1
		circleA.setY(4.0);
		if (Math.abs(circleA.getY() - 4.0) < THRESHOLD) {
			System.out.println("setY = PASSED");
		}
		else {
			System.out.println("setY = FAILED");
		}
		
		//case2
		circleB.setY(7.0);
		if (Math.abs(circleB.getY() - 7.0) < THRESHOLD) {
			System.out.println("setY = PASSED");
		}
		else {
			System.out.println("setY = FAILED");
		}
		
		//case3
		circleC.setY(8.0);
		if (Math.abs(circleC.getY() - 8.0) > THRESHOLD) {
			System.out.println("setY = FAILED");
		}
		else {
			System.out.println("setY = PASSED");
		}
		
		System.out.println();
		
		//// SET-RADIUS TESTS \\\\
		
		//case1
		circleA.setRadius(2.0);
		if (Math.abs(circleA.getRadius() - 2.0) < THRESHOLD) {
			System.out.println("setRadius = PASSED");
		}
		else {
			System.out.println("setRadius = FAILED");
		}
				
		//case2
		circleB.setRadius(4.0);
		if (Math.abs(circleB.getRadius() - 4.0) < THRESHOLD) {
			System.out.println("setRadius = PASSED");
		}
		else {
			System.out.println("setRadius = FAILED");
		}
				
		//case3
		circleC.setRadius(6.0);
		if (Math.abs(circleC.getRadius() - 6.0) > THRESHOLD) {
			System.out.println("setRadius = FAILED");
		}
		else {
			System.out.println("setRadius = PASSED");
		}
		
		System.out.println();
		
		//// AREA TESTS \\\\
		
		//case1
		if (circleA.area() == Math.pow(circleA.getRadius(), 2) * Math.PI) {
			System.out.println("area = PASSED");
		}
		else {
			System.out.println("area = FAILED");
		}
			
		//case2
		if (circleB.area() == Math.pow(circleB.getRadius(), 2) * Math.PI) {
			System.out.println("area = PASSED");
		}
		else {
			System.out.println("area = FAILED");
		}
		
		//case3
		if (circleA.area() == Math.pow(circleA.getRadius(), 2) * Math.PI) {
			System.out.println("area = PASSED");
		}
		else {
			System.out.println("area = FAILED");
		}
		
		System.out.println();
		
		//// PERIMETER TESTS \\\\
		
		//case1
		if (circleA.perimeter() == (Math.PI * 2 * circleA.getRadius())) {
			System.out.println("perimeter = PASSED");
		}
		else {
			System.out.println("perimeter = FAILED");
		}
		
		//case2
		if (circleB.perimeter() == (Math.PI * 2 * circleB.getRadius())) {
			System.out.println("perimeter = PASSED");
		}
		else {
			System.out.println("perimeter = FAILED");
		}
		
		//case3
		if (circleC.perimeter() == (Math.PI * 2 * circleC.getRadius())) {
			System.out.println("perimeter = PASSED");
		}
		else {
			System.out.println("perimeter = FAILED");
		}
		
		System.out.println();
		
		//// DIAMETER TESTS \\\\
		
		//case1
		if (circleA.diameter() == (2 * circleA.getRadius())) {
			System.out.println("diameter = PASSED");
		}
		else {
			System.out.println("diameter = FAILED");
		}
		
		//case2
		if (circleB.diameter() == (2 * circleB.getRadius())) {
			System.out.println("diameter = PASSED");
		}
		else {
			System.out.println("diameter = FAILED");
		}
		
		//case3
		if (circleC.diameter() == (2 * circleC.getRadius())) {
			System.out.println("diameter = PASSED");
		}
		else {
			System.out.println("diameter = FAILED");
		}
		
		System.out.println();
		
		//// ISUNITCIRCLE TESTS \\\\
		
		//case1
		if (circleA.isUnitCircle() == false) {
			System.out.println("isUnitCircle = PASSED");
		}
		else {
			System.out.println("isUnitCircle = FAILED");
		}
		
		//case2
		circleB.setRadius(1.0);
		circleB.setX(0.0);
		circleB.setY(0.0);
		
		if(circleB.isUnitCircle()) {
			System.out.println("isUnitCircle = PASSED");
		}
		else {
			System.out.println("isUnitCircle = FAILED");
		}
		
		//case3
		circleB.setRadius(1.5);
		
		if(circleB.isUnitCircle() == false) {
			System.out.println("isUnitCircle = PASSED");
		}
		else {
			System.out.println("isUnitCircle = FAILED");
		}
		
		System.out.println();
		
		//// TOSTRING TESTS \\\\
		
		//case1
		
		//// EQUALS TESTS \\\\
		
		//case1
		if (circleA.equals(circleC)) {
			System.out.println("equals = FAILED");
		}
		else {
			System.out.println("equals = PASSED");
		}
		
		//case2
		if (circleA.equals(circleA)) {
			System.out.println("equals = PASSED");
		}
		else {
			System.out.println("equals = FAILED");
		}
		
		//case3
		if(circleB.equals(circle1)) {
			System.out.println("equals = FAILED");
		}
		else {
			System.out.println("equals = PASSED");
		}
		
		System.out.println();
		
		//// DISTANCE TESTS \\\\
		
		//case1
		if (circleA.distance(circleB) == 5.0) {
			System.out.println("distance = PASSED");
		}
		else {
			System.out.println("distance = FAILED");
		}
		
		//// IS-SMALLER TESTS \\\\
		circleA.setRadius(2.0);
		circleB.setRadius(3.0);
		circleC.setRadius(4.0);
		
		//case1
		if (circleA.isSmaller(circleB)) {
			System.out.println("isSmaller = PASSED");
		}
		else {
			System.out.println("isSmaller = FAILED");
		}
		
		//// COMPARE-TO TESTS \\\\
		
		//case1
		if (circleA.compareTo(circleB) == -1) {
			System.out.println("compareTo = PASSED");
		}
		else {
			System.out.println("compareTo = FAILED");
		}
		
		//// INTERSECTS TESTS \\\\
		circleC.setX(0.0);
		circleC.setY(0.0);
		
		//case1
		if(circleB.intersects(circleC)) {
			System.out.println("intersects = PASSED");
		}
		else {
			System.out.println("intersects = FAILED");
		}
		
		
		
		
		
		
	}
	
}
