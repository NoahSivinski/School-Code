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
		System.out.println("circle1= "+circle1);
		System.out.println("circle2= "+circle2);
		
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
		 System.out.println (circle1.toString()); 
	
		
		// set the circle2 radius to 5.3
		 circle2.setRadius(5.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		 System.out.println (circle2.toString()); 
		
		// print circle1 diameter, area and perimeter
		 System.out.println("Diameter: " + circle1.diameter() +"\n"+ "Area: " + circle1.area() +"\n"+ "Perimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		 System.out.println("Diameter: " + circle2.diameter() +"\n"+ "Area: " + circle2.area() +"\n"+ "Perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		 System.out.println(circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		 System.out.println(circle2.isUnitCircle());
		
		// your additional tests should be placed below here.  Make sure to include at least 3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen. 
		 
		 Circle testCircle = new Circle(); 
		 testCircle.setName("Circle");
		 testCircle.setRadius(2.3);
		 testCircle.setX(0.2);
		 testCircle.setY(1.2);
		 
		 if (testCircle.getName().equals("Circle") && (testCircle.getRadius() == 2.3) && (testCircle.getX() == 0.2) && (testCircle.getY() == 1.2)) {
			 System.out.println("Pass: testCircle"); 
		 }
		 else {
			 System.out.println("Fail: testCircle"); 
		 }
		 
		 Circle testCircle3 = new Circle(); 
		 testCircle3.setName("Circle 3");
		 testCircle3.setRadius(3.6);
		 testCircle3.setX(2.5);
		 testCircle3.setY(2.0);
		 
		 if (testCircle3.getName().equals("Circle 3") && (testCircle3.getRadius() == 3.6) && (testCircle3.getX() == 2.5) && (testCircle3.getY() == 2.0)) {
			 System.out.println("Pass: testCircle3"); 
		 }
		 else {
			 System.out.println("Fail: testCircle3"); 
		 }
		 
		 Circle testCircle4 = new Circle(); 
		 testCircle4.setName("Circle 4");
		 testCircle4.setRadius(4.0);
		 testCircle4.setX(3.2);
		 testCircle4.setY(2.6);
		 
		 if (testCircle4.getName().equals("Circle 4") && (testCircle4.getRadius() == 4.0) && (testCircle4.getX() == 3.2) && (testCircle4.getY() == 2.6)) {
			 System.out.println("Pass: testCircle4"); 
		 }
		 else {
			 System.out.println("Fail: testCircle4"); 
		 }
		 Circle testCircle5 = new Circle(); 
		 testCircle5.setName("Circle 5");
		 testCircle5.setRadius(6.0);
		 testCircle5.setX(4.5);
		 testCircle5.setY(2.6);
		 
		 
		 if (testCircle5.getName().equals("Circle 5") && (testCircle5.getRadius() == 6.0) && (testCircle5.getX() == 4.5) && (testCircle5.getY() == 2.6)) {
			 System.out.println("Pass: testCircle5"); 
		 }
		 else {
			 System.out.println("Fail: testCircle5"); 
		 }
		 System.out.println(testCircle5.distance(circle1));
		 System.out.println(testCircle5.compareTo(circle1));
		 System.out.println(testCircle5.isSmaller(circle1));
		 System.out.println(testCircle5.interacts(circle1));
				
	}
	
}
