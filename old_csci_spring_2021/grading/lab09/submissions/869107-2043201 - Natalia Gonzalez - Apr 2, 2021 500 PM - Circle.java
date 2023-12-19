/*
 * Circle.java
 * Author: Natalia Gonzqlez
 * Submission Date:  04-02-21
 *
 * Purpose: computes teh radius and center of a circle the user enters and compares the two to see if its equal.
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
import java.util.Scanner;
public class Circle {
	
	private String name;     // declare the private String instance  name
	private double radius;     // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;      // declare the private double instance  y
        
	public static final double THRESHOLD = 0.000000001;
	Scanner keyboard = new Scanner(System.in);
        
	public String getName() {
		return name;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		 return radius;
	}
	
	public void setName(String newName) {
		
		this.name = newName;	
	}

	public void setX(double newX) {
		
		this.x = newX; 	
	}
	
	public void setY(double newY) {
		
		this.y = newY; 	
	}
	
	public void setRadius(double newRadius) {
		
		if(newRadius>=0)
                    radius=newRadius;
	}
	
	public double area() {
		double area = Math.PI * (radius * radius);
		return area;
	}
	
	public double perimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	public double diameter() {
		double diameter = radius * 2;
		return diameter;
	}
        //Zero check is impelemted like if resultant value is less than 0.0000000001 and greater then -0.000000001.
        //Same procedure is followed for zero case in complete code
	public boolean isUnitCircle() {
		if (x-y<THRESHOLD && x-y>-THRESHOLD && radius==1)
			return true;
		else 
                        return false;
                }
	
	public String toString() {
            String str="name: "+name+"\ncenter: ("+Double.toString(x)+","+Double.toString(y)+")\nradius: "+Double.toString(radius);
            return str;
	}
        
        public boolean equals(Circle anotherCircle){
            if((getRadius()-anotherCircle.getRadius()<THRESHOLD &&getRadius()-anotherCircle.getRadius()>-THRESHOLD) && (getX()-anotherCircle.getX()<THRESHOLD
                    && getX()-anotherCircle.getX()>-THRESHOLD)&& (getY()-anotherCircle.getY()<THRESHOLD && getY()-anotherCircle.getY()>-THRESHOLD) )
                return  true;
            else
                return false;
        }
        
        public double distance(Circle anotherCircle){
            double distance=0;
            double pow1=Math.pow(getX()-anotherCircle.getX(),2);
            double pow2=Math.pow(getY()-anotherCircle.getY(),2);
            distance=Math.sqrt(pow1+pow2);
            return distance;
        }
        
        public boolean isSmaller(Circle anotherCircle){
            if(diameter()-anotherCircle.diameter()<THRESHOLD && diameter()-anotherCircle.diameter()<-THRESHOLD )
                return true;
            else
                return false;
            
        }

        public int compareTo(Circle anotherCircle){
            if(isSmaller(anotherCircle))
                return -1;
            else
                 if(diameter()-anotherCircle.diameter()<THRESHOLD && diameter()-anotherCircle.diameter()>-THRESHOLD  )
                     return 0;
                 else
                     return 1;
        }
        
        public boolean intersects(Circle anotherCircle){
            double distance=distance(anotherCircle);
            if(distance<getRadius()+anotherCircle.getRadius())
                return true;
            else
                return false;
        }
        
}