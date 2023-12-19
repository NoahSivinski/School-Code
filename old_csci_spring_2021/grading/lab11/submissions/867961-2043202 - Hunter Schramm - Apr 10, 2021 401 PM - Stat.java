/**
 * 
 *
 * [Stat].java
 * Author:  [Hunter Schramm] 
 * Submission Date:  [04/10/21]
 *
 * Purpose: This program takes data from an array and 
 * finds the min, max, mode, and average of the values. 
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

/**
 * @author hunterschramm
 *
 */
public class Stat {

		   private double data[];

		   public Stat() {
		       data = new double[1];
		       data[0] = 0.0;

		   }
		   //Set values of the data array
		   public Stat(double[] d) {
		       double[] newArray = new double[d.length];
		       for (int i = 0; i < d.length; i++) {
		           newArray[i] = d[i];
		       }
		       data = newArray;

		   }

		   public double[] getData() {
		       double[] newArray = new double[data.length];
		       for (int i = 0; i < data.length; i++) {
		           newArray[i] = data[i];
		       }
		       return newArray;
		   }

		   public void setData(double[] d) {
		       double[] newArray = new double[d.length];
		       for (int i = 0; i < d.length; i++) {
		           newArray[i] = d[i];
		       }
		       data = newArray;
		   }
		   //Returns the boolean value true if the data objects of both the calling
		   //Stat object and the passed Stat object s have the same values 
		   public boolean equals(Stat s) {
		       double sdata[] = s.getData();
		       if (data.length != sdata.length)
		           return false;
		       for (int i = 0; i < data.length; i++) {
		           if (data[i] != sdata[i])
		               return false;
		       }
		       return true;
		   }
		   
		   //String representation of the data
		   public String toString() {
		       String arrayData = "";
		       for (int i = 0; i < data.length; i++) {
		           if (i == data.length - 1)
		               arrayData += data[i];
		           else
		               arrayData += data[i] + ", ";
		       }
		       return "[" + arrayData + "]";
		   }
		   
		   //for loop to find the minimum of the array
		   public double min() {
		       double min = data[0];
		       for (int i = 1; i < data.length; i++) {
		           if (data[i] < min)
		               min = data[i];

		       }
		       return min;

		   }
		   
		   //for loop to find the maximum of the array
		   public double max() {
		       double max = data[0];
		       for (int i = 1; i < data.length; i++) {
		           if (data[i] > max)
		               max = data[i];

		       }
		       return max;

		   }
		   
		   //for loop to find the average of the array
		   public double average() {
		       double sum = 0.0;
		       for (int i = 0; i < data.length; i++) {

		           sum += data[i];
		       }
		       return sum / data.length;
		   }
		   
		   //for loop to find the mode of the array
		   public double mode() {
		       double maxNumber = 0.0;
		       int maxAppearances = 0;
		       for (int i = 0; i < data.length; i++) {
		           int numberCount = 0;
		           for (int j = 0; j < data.length; j++) {
		               if (data[i] == data[j])
		                   numberCount++;
		               
		           }
		           if (numberCount > maxAppearances) {
		        	   maxAppearances = numberCount;
		               maxNumber = data[i];
		           }
		           
		       }
		       if (maxNumber == 2.0)
		    	   return Double.NaN;
		       else if (maxAppearances > 1)
		           return maxNumber;
		       else if (maxAppearances < 1)
		           return Double.NaN;
		       else
		           return 0.0;
		   }
}
