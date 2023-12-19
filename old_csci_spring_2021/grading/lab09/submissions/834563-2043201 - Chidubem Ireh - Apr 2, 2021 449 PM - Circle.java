/*
 * Circle.java
 * Author: Chidubem Ireh
 * Submission Date: 4/2/2021
 *
 * Purpose:Provide information about the math used behind circle tester.
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
public class Circle {	    
	    private double radius;
	    private double x;
	    private double y;
	    private String name;
	    
	    public static final double THRESHOLD = 0.000000001;
	    // getName 
	       public String getName() {
	        return name;
	    }
	    // getRadius
	    public double getRadius() {
	        return radius;
	    }

	    // getX 
	    public double getX() {
	        return x;
	    }

	    // getY
	    public double getY() {
	        return y;
	    }

	    // setName
	    public void setName(String name) {
	        this.name = name;
	    }

	    // setRadius
	    public void setRadius(double radius) {
	        if(radius > THRESHOLD){
	            this.radius = radius;
	        }
	    }
	    // setX 
	    public void setX(double x) {
	        this.x = x;
	    }
	    // setY 
	    public void setY(double y) {
	        this.y = y;
	    }
	    // area 
	    public double area() {

	        return Math.PI*getRadius()*getRadius();
	    }

	    // perimeter 
	    public double perimeter() {

	        return 2*Math.PI*getRadius();
	    }

	    // diameter 
	    public double diameter() {

	        return 2*getRadius();
	    }

	    // isUnitCircle 
	    public boolean isUnitCircle() {

	        if(Double.compare(getX(),getY()) == 0  &&  getRadius() == 1){
	            return true;
	        }
	        return false;
	    }
	    public double distance(Circle anotherCircle) {
	        return Math.sqrt(Math.pow((this.x-anotherCircle.x),2)+Math.pow((this.y-anotherCircle.y),2));
	    }
	   
	    public boolean intersects(Circle anotherCircle) {
	        double distance = distance(anotherCircle);
	        if (distance < (radius + anotherCircle.radius)) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    
	    public boolean equals(Circle anotherCircle) {
	        if (radius == anotherCircle.radius && x == anotherCircle.x && y == anotherCircle.y) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    public String toString() {
	        return
	                "name: " + name + "\n" + "center: " + "(" + getX() +"," + getY() +")" + "\n" + "radius: "+ getRadius();
	    }
	}