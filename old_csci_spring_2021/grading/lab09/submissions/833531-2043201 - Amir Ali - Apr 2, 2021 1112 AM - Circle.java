/*
 * Circle.java
 * Author:  Amir Ali
 * Submission Date:  4/2/21
 *
 * Purpose: Introduces OOP
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
 * I Agree Amir Ali
 */


		
		public class Circle {
		    private String name;
		    private double radius;
		    private double x;
		    private double y;

		    public static final double THRESHOLD = 0.000000001;

		    //----------------------------------------------
		    // getName - returns the value of name
		    //----------------------------------------------
		    public String getName() {
		        return name;
		    }

		    //----------------------------------------------
		    // getRadius - returns the value of radius
		    //----------------------------------------------
		    public double getRadius() {
		        return radius;
		    }

		    //----------------------------------------------
		    // getX - returns the value of x
		    //----------------------------------------------
		    public double getX() {
		        return x;
		    }

		    //----------------------------------------------
		    // getY - returns the value of y
		    //----------------------------------------------
		    public double getY() {
		        return y;
		    }

		    //----------------------------------------------
		    // setName - assigns a new value to name
		    //----------------------------------------------
		    public void setName(String name) {
		        this.name = name;
		    }

		    //----------------------------------------------
		    // setRadius - assigns a new value to radius
		    //----------------------------------------------
		    public void setRadius(double radius) {
		        if(radius > THRESHOLD){
		            this.radius = radius;
		        }
		    }

		    //----------------------------------------------
		    // setX - assigns a new value to x
		    //----------------------------------------------
		    public void setX(double x) {
		        this.x = x;
		    }

		    //----------------------------------------------
		    // setY - assigns a new value to y
		    //----------------------------------------------
		    public void setY(double y) {
		        this.y = y;
		    }

		    //--------------------------------------------------------
		    // area - returns the area of the circle
		    //--------------------------------------------------------
		    public double area() {

		        // Your code goes here
		        return Math.PI*getRadius()*getRadius();
		    }


		    //--------------------------------------------------------
		    // perimeter - returns the perimeter of the circle
		    //--------------------------------------------------------
		    public double perimeter() {

		        // Your code goes here
		        return 2*Math.PI*getRadius();
		    }


		    //--------------------------------------------------------
		    // diameter - calculates the diameter of the circle
		    //--------------------------------------------------------
		    public double diameter() {

		        // Your code goes here
		        return 2*getRadius();
		    }
		    /* (non-Javadoc)
		     * @see java.lang.Object#toString()
		     */
		     @Override
		     public String toString() {
		         return "center:"+"("+x+","+y+")"+"\nradius:"+radius;
		     }


		     /*
		     * This method returns true when the radius and centers of both circles are the same;
		     * otherwise, it returns false.
		     * Using doubleToLongBits to convert double value to represent floating point number for comparision
		     */
		     public boolean equals(Circle anotherCircle) {
		         return( (Double.doubleToLongBits(radius) != Double.doubleToLongBits(anotherCircle.radius)) ||
		                 (Double.doubleToLongBits(x) != Double.doubleToLongBits(anotherCircle.x)) ||
		             (Double.doubleToLongBits(y) != Double.doubleToLongBits(anotherCircle.y)))?false:true;
		     }
		    
		    
		    
		     /*
		     * The method isConcentric returns true when the circle executing the method has the same center as anotherCircle,
		     * but two circles are not equal (i.e. their radius is different).
		     */
		     public boolean isConcentric(Circle anotherCircle){
		         return( (Double.doubleToLongBits(radius) != Double.doubleToLongBits(anotherCircle.radius)) &&
		                 ((Double.doubleToLongBits(x) == Double.doubleToLongBits(anotherCircle.x)) &&
		             (Double.doubleToLongBits(y) == Double.doubleToLongBits(anotherCircle.y))))?true:false;
		     }
		    
		     /*
		     * This method returns the distance between the centers of the circle executing the method and anotherCircle.
		     *   Let (x, y) and (xa, ya) be the centers of the circle executing the method and anotherCircle respectively,
		     *   the distance between their centers is computed by square root (x – x(little a))^2 + (y – y(little a))^2
		     */
		     public double distance(Circle anotherCircle) {
		         return Math.sqrt(Math.pow((this.x-anotherCircle.x), 2)+Math.pow((this.y-anotherCircle.y), 2));
		     }
		    
		     /*
		     * The method intersects returns true when the circle executing the method and anotherCircle have an intersecting area
		     * (one or more points enclosed by both circles); otherwise, it returns false.
		     * Two circles intersect if the distance between the centers of the two circles is less than the sum of their radius.
		     * Your method must call the method distance to obtain the distance between the two circles.
		     */
		     public boolean intersects(Circle anotherCircle) {
		         double distance = this.distance(anotherCircle);
		         return (Double.doubleToLongBits(distance) < Double.doubleToLongBits(this.radius+anotherCircle.radius) )?true:false;
		     }
		     /*
		     * Method calculates and returns if circle is unit circle
		     */
		     public boolean isUnitCircle(){
		         return (this.radius==1.0 &&(this.x==0.0 && this.y==0.0))?true:false;
		     }
		     public boolean isSmaller(Circle anotherCircle) {
		    	double diameter = this.diameter();
		    	double diameterAnotherCircle = 2* anotherCircle.radius;
		    	
		    	 return(Double.doubleToLongBits(diameter)< Double.doubleToLongBits(diameterAnotherCircle))?false:true;
		    	 
		     }
		     public int compareTo(Circle anotherCircle) {
		    	 if(this.isSmaller(anotherCircle) == true) {
		    		 return 1;
		    		 
		    	 }
		    	 else {
		    		 return 0;
		    	 }
		     
		     }
		     
		    
		  }
	}

}
