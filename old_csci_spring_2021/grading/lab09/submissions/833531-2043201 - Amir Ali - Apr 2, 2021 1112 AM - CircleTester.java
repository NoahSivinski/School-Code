/*
 * CircleTester.java
 * Author:  Amir Ali
 * Submission Date:  4/2
 *
 * Purpose: Tests Circle
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




		
		/*
		* Class to test Circle
		*/
		public class CircleTester {
		  
		   public static void main(String args[]){
		      
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
			   
			   
		      
		       System.out.println("circle1="+circle1);
		       System.out.println("circle2="+circle2);
		      
		       // -ve radius will not change radius value
		       circle1.setRadius(-2.0);
		      
		       //Reset center of circle (-3.0,4.0)
		       circle1.setX(-3.0);
		       circle1.setY(4.0);
		      
		       // Display the center and radius of circle1
		       System.out.println("Circle1:"+circle1);
		      
		       //Set the radius of circle2 to 5.3.
		       circle2.setRadius(5.3);
		      
		       //Display the center and radius of circle2.
		       System.out.println("Circle2:"+circle2);
		      
		       // Display the diameter, area and perimeter of circle1.
		      
		       System.out.println("Diameter:"+circle1.diameter()+" Area:"+circle1.area()+" Perimeter:"+circle1.perimeter());

		       // Display the diameter, area and perimeter of circle2.
		      
		       System.out.println("Diameter:"+circle2.diameter()+" Area:"+circle2.area()+" Perimeter:"+circle2.perimeter());

	      //Display message that indicates whether or not circle1 is a unit circle.
		       System.out.println("Unit Circle:"+circle1.isUnitCircle());
		      
		       //Display message that indicates whether or not circle2 is a unit circle.
		       System.out.println("Unit Circle:"+circle2.isUnitCircle());
		      
		       //Additional Tests
		      
		      //Display message that indicates whether or not circle1 & circle2 are equal,concentric or intersects.
		       System.out.println("Equal ="+circle1.equals(circle2)+" intersects:"+circle1.intersects(circle2));
		       
		       
		       System.out.println("is " + circle1.getName() + " greater than "+circle2.getName()+ " ? "+ circle1.isSmaller(circle2));
		       System.out.println("To confirm " + circle1.compareTo(circle2));
		       
		      
		       }
		}
	}

}
