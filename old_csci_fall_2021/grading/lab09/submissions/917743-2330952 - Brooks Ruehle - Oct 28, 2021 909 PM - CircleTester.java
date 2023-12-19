/*
 * CSCI1301.java
 * Author:  Brooks Ruehle 
 * Submission Date:  Oct. 29, 2021
 *
 * Purpose: This program tests the circle class
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

public class CircleTester {

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

		circle1.setRadius(-2.0); 

		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		

		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		
		System.out.println("Circle 1 Name: " + circle1.getName());
		System.out.println("Circle 1 Center: (" + circle1.getX() + ", " + circle1.getY() + ")");
		System.out.println("Circle 1 Radius: " + circle1.getRadius());
		
		
		circle2.setRadius(5.3);
		System.out.println();
		
		System.out.println("Circle 2 Name: " + circle2.getName());
		System.out.println("Circle 2 Center: (" + circle2.getX() + ", " + circle2.getY() + ")");
		System.out.println("Circle 2 Radius: " + circle2.getRadius());
		
		System.out.println();
		System.out.println("Circle 1 Diameter: " + circle1.diameter());
		System.out.println("Circle 1 Area:" + circle1.area());
		System.out.println("Circle 1 Perimeter: " + circle1.perimeter());
		
		System.out.println();
		System.out.println("Circle 2 Diameter: " + circle2.diameter());
		System.out.println("Circle 2 Area:" + circle2.area());
		System.out.println("Circle 2 Perimeter: " + circle2.perimeter());
		
		//testing unit circle method
		circle1.setRadius(1.0);
		circle1.setX(0);
		circle1.setY(0);
		System.out.println();
		System.out.println("Is Circle 1 a unit circle? " + circle1.isUnitCircle());
		
		System.out.println();
		System.out.println("Is Circle 2 a unit circle? " + circle2.isUnitCircle());
		
		//testing equals method
		circle2.setRadius(1.0);
		circle2.setX(0);
		circle2.setY(0);
		
		System.out.println();
		if(circle1.equals(circle2)) {
			System.out.println("PASSED: equals");
		}else {
			System.out.println("FAILED: equals");
		}
		
		circle2.setX(3);
		
		if(circle1.equals(circle2)) {
			System.out.println("FAILED: equals");
		}else {
			System.out.println("PASSED: equals");
		}
		
		circle1.setX(3);
				
		
		if(circle1.equals(circle2)) {
			System.out.println("PASSED: equals");
		}else {
			System.out.println("FAILED: equals");
		}
		
		
		//testing distance method; checked using a calculator
		
		System.out.println();
		
		if(circle1.distance(circle2) <= THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}
		 
		circle1.setX(5);
		
		if(Math.abs(circle1.distance(circle2) - 2) <= THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}
		
		circle1.setX(10);
		if(Math.abs(circle1.distance(circle2) - 7) <= THRESHOLD) {
			System.out.println("PASSED: distance");
		}
		else {
			System.out.println("FAILED: distance");
		}
		
		
		//testing isSmaller method
		System.out.println();
		if(circle1.isSmaller(circle2)) {
			System.out.println("FAILED: isSmaller");
		}else {
			System.out.println("PASSED: isSmaller");
		}
		
		circle2.setRadius(30);
		if(circle1.isSmaller(circle2)) {
			System.out.println("PASSED: isSmaller");
		}else {
			System.out.println("FAILED: isSmaller");
		}
		
		circle1.setRadius(50);
		if(circle1.isSmaller(circle2)) {
			System.out.println("FAILED: isSmaller");
		}else {
			System.out.println("PASSED: isSmaller");
		}
		
		//Testing compareTo method
		System.out.println();
		circle1.setRadius(50);
		if(circle1.compareTo(circle2) == 1) {
			System.out.println("PASSED: compareTo");
		}else {
			System.out.println("FAILED: compareTo");
		}
		
		circle1.setRadius(30);
		if(circle1.compareTo(circle2) == 0) {
			System.out.println("PASSED: compareTo");
		}else {
			System.out.println("FAILED: compareTo");
		}
		circle1.setRadius(10);
		if(circle1.compareTo(circle2) == -1) {
			System.out.println("PASSED: compareTo");
		}else {
			System.out.println("FAILED: compareTo");
		}
		
		//Testing intersects method
		
		System.out.println();
		System.out.println("Distance Circle 1 and Circle 2: " + circle1.distance(circle2));
		double radiusSum = circle1.getRadius() + circle2.getRadius();
		System.out.println("Sum of radius Circle 1 and Circle 2: " + radiusSum);
		if(circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects");
		}else {
			System.out.println("FAILED: intersects");
		}
		
		circle1.setRadius(2);
		circle2.setRadius(3);
		System.out.println();
		System.out.println("Distance Circle 1 and Circle 2: " + circle1.distance(circle2));
		radiusSum = circle1.getRadius() + circle2.getRadius();
		System.out.println("Sum of radius Circle 1 and Circle 2: " + radiusSum);
		if(circle1.intersects(circle2)) {
			System.out.println("FAILED: intersects");
		}else {
			System.out.println("PASSED: intersects");
		}
		
		circle1.setX(0);
		circle1.setY(0);
		circle2.setX(2);
		circle2.setY(2);
		System.out.println();
		System.out.println("Distance Circle 1 and Circle 2: " + circle1.distance(circle2));
		radiusSum = circle1.getRadius() + circle2.getRadius();
		System.out.println("Sum of radius Circle 1 and Circle 2: " + radiusSum);
		if(circle1.intersects(circle2)) {
			System.out.println("PASSED: intersects");
		}else {
			System.out.println("FAILED: intersects");
		}
		
	}

}
