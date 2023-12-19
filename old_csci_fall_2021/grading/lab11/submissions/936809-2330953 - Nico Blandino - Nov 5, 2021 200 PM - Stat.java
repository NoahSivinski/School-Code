/*
 * Stat.java
 * Author:  Nicolas Blandino 
 * Submission Date:  11/5/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * Basically this has all of the methods that were required
 * plus it has plenty of test cases that are also in this class.
 * 
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

   public boolean equals(Stat s) {
       double sdata[] = s.getData();
       if (data.length != sdata.length) {
    	   
           return false;
       }
       
       for (int i = 0; i < data.length; i++) {
           if (data[i] != sdata[i]) {
        	   
               return false;
           }
       }
       return true;
   }

   public String toString() {
       String arrayData = "";
       for (int i = 0; i < data.length; i++) {
    	   
           if (i == data.length - 1) {
               arrayData += data[i];
           }
           else {
               arrayData += data[i] + ", ";
           }
       }
       return "[" + arrayData + "]";
   }

   public double min() {
       double min = data[0];
       for (int i = 1; i < data.length; i++) {
    	   
           if (data[i] < min) {
               min = data[i];
           }

       }
       return min;

   }

   public double max() {
       double max = data[0];
       for (int i = 1; i < data.length; i++) {
    	   
           if (data[i] > max) {
               max = data[i];
           }

       }
       return max;

   }

   public double average() {
       double sum = 0.0;
       for (int i = 0; i < data.length; i++) {

           sum += data[i];
       }
       
       return sum / data.length;
   }

   public double mode() {
	   
       double maxNumber = 0.0;
       int maxNumberCount = 0;
       
       for (int i = 0; i < data.length; i++) {
           int numberCount = 0;
           
           for (int j = 0; j < data.length; j++) {
        	   
               if (data[i] == data[j]) {
            	   
                   numberCount++;
               }
           }
           if (numberCount > maxNumberCount) {
        	   
               maxNumberCount = numberCount;
               
               maxNumber = data[i];
               
           }
       }
       if (maxNumberCount > 1) {
           return maxNumber;
       }
       else {
           return Double.NaN;
       }
   }

   public static void main(String[] args) {
	   
       double[] data1 = { -5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, 90, 88.9 };
       double[] data2 = { 100.34, 50.01, 50.01, -8 };
       double[] data3 = { 1.0, 2.0, 3.0, 4.0, 5.0 };
       double[] data4 = { 1.0, 2.0, 3.0, 4.0, 5.0 };
       
       Stat stat1 = new Stat(data1);
       
       System.out.println("stat1 data = " + stat1.toString());
       System.out.println("stat1 min = " + stat1.min());
       System.out.println("stat1 max = " + stat1.max());
       System.out.println("stat1 average = " + stat1.average());
       System.out.println("stat1 mode = " + stat1.mode() + "\n");

       Stat stat2 = new Stat(data2);
       
       System.out.println("stat1 data = " + stat2.toString());
       System.out.println("stat1 min = " + stat2.min());
       System.out.println("stat1 max = " + stat2.max());
       System.out.println("stat1 average = " + stat2.average());
       System.out.println("stat1 mode = " + stat2.mode() + "\n");

       Stat stat3 = new Stat(data3);
       
       System.out.println("stat1 data = " + stat3.toString());
       System.out.println("stat1 min = " + stat3.min());
       System.out.println("stat1 max = " + stat3.max());
       System.out.println("stat1 average = " + stat3.average());
       System.out.println("stat1 mode = " + stat3.mode() + "\n");

       System.out.println("stat1 is equal to stat2 using \"equals()\"? " + stat1.equals(stat2));
       
       Stat stat4 = new Stat(data4);
       
       System.out.println("stat3 is equal to stat4 using \"equals()\"? " + stat3.equals(stat4));

   }

}