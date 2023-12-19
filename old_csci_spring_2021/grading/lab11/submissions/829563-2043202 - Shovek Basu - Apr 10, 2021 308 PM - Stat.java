/*
 * [Stat].java
 * Author:  [Shovek Basu] 
 * Submission Date:  4/10/21
 *
 * Purpose: stats
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
public class Stat {

   private double data[];

   public Stat() {
       data = new double[1];
       data[0] = 0.0;
   }

   //creates an array and stores a copy in data
   public Stat(double[] d) {
       double[] doubleArray = new double[d.length];
       
       for (int i = 0; i < d.length; i++) {
    	   doubleArray[i] = d[i];
       }
       data = doubleArray;

   }

   //retrieves the values and creates a new array
   public double[] getData() {
       double[] doubleArray = new double[data.length];
       
       for (int i = 0; i < data.length; i++) {
    	   doubleArray[i] = data[i];
       }
       return doubleArray;
   }
   
   //sets values of the new array 
   public void setData(double[] d) {
       double[] doubleArray = new double[d.length];
       
       for (int i = 0; i < d.length; i++) {
    	   doubleArray[i] = d[i];
       }
       data = doubleArray;
   }

   //checks if the arrays are equal length and have the same elements
   public boolean equals(Stat s) {
       double sData[] = s.getData();
       
       if (data.length != sData.length) {
           return false;
       }
       
       for (int i = 0; i < data.length; i++) {
           if (data[i] != sData[i])
               return false;
           
       }
       return true;
   }

   //transforms the array into a string
   public String toString() {
       String arrayData = "";
       
       //array obtains a number and comma for each element except the last
       for (int i = 0; i < data.length; i++) {
           if (i == data.length - 1) {
               arrayData += data[i];
           }
           else
               arrayData += data[i] + ", ";
       }
       
       return "[" + arrayData + "]";
   }

   //checks each element and holds the lowest one it can find
   public double min() {
       double min = data[0];
       
       for (int i = 1; i < data.length; i++) {
           if (data[i] < min) {
               min = data[i];
           }

       }
       
       return min;

   }

   //checks each element and holds the largest one it can find
   public double max() {
       double max = data[0];
       
       for (int i = 1; i < data.length; i++) {
           if (data[i] > max) {
        	   max = data[i];
           }

       }
       return max;

   }

   //takes each element of the array and averages them together
   public double average() {
       double sum = 0.0;
       
       for (int i = 0; i < data.length; i++) {

           sum += data[i];
       }
       
       return sum / data.length;
   }

   public double mode() {
       double maxNumber = 0.0;
       int maxNumberCounter = 0;
       
    // the i loop holds onto a value that the j loop checks with other values in the array
    // and when one matches, they increment the number counter
       for (int i = 0; i < data.length; i++) {
           int numberCounter = 0;
           
           for (int j = 0; j < data.length; j++) { 
               if (data[i] == data[j]) {
                   numberCounter++;
               }
           }
           
           if (numberCounter > maxNumberCounter) {
               maxNumberCounter = numberCounter;
               maxNumber = data[i];
           }
       }
       
       if (maxNumberCounter > 1)
           return maxNumber;
       else
           return Double.NaN;
   }


}