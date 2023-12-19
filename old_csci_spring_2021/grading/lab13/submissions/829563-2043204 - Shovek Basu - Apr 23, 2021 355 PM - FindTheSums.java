/*
 * [FindTheSums].java
 * Author:  [Shovek Basu] 
 * Submission Date:  [4/23/20]
 *
 * Purpose: pain
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
public class FindTheSums {
 
   public static String arrayToString(int[][] a) {
       
	   String arrayString = "";
       
	   for(int i = 0 ; i < a.length; i++){
       
    	   for(int j = 0 ; j < a[i].length; j++){
               if(j == a[i].length - 1) {
            	   arrayString += a[i][j]; 
               }
               else
            	   arrayString += a[i][j] + " "; //prints a space after a number is printed
               }
           if(i != a.length - 1) {
        	   arrayString += "\n"; //prints a new line
           }
       }
       		return arrayString;
   }
 
   public static int[][] horizontalSums(int[][] a,int sumToFind){
      
	   int[][] b = new int[a.length][a[0].length]; //creates new array with the same dimensions as a//
       
	   for(int i = 0 ; i < a.length; i++) {
           for(int j = 0 ; j < a[i].length; j++) {
               b[i][j] = 0; //initializing b//
           }
	   }
	   for(int i = 0 ; i < a.length; i++){
           for(int j = 0 ; j < a[i].length; j++){
               int sum = 0;
               int k = j;
               
               
               while(k < a[i].length){
                   sum += a[i][k];
                   boolean isSumLarger = true;
                  
                   if(isSumLarger == true) {
                   if(sum > sumToFind) {
                	  isSumLarger = false;
                	  }
                   }
                  boolean isSumEqual = false;
                  if(isSumEqual == false) {
                   if(sum==sumToFind){
                       for(int t = j; t <= k; t++)
                           b[i][t] = a[i][t];
                       isSumEqual = true;
                   }
                   }
               k++;
               }
           }
       }
       return b;
   }
    
   public static int[][] verticalSums(int[][] a,int sumToFind){
      
	   int[][] b = new int[a.length][a[0].length];
       
	   for(int i = 0 ; i < a.length; i++) {
           for(int j = 0 ; j < a[i].length; j++) {
               b[i][j] = 0;
           }
	   }
	   for(int i = 0 ; i < a[0].length; i++){
           for(int j = 0 ; j < a.length; j++){
               int sum = 0;
               int k = j;
       
               while(k < a.length){
                   
            	   sum+=a[k][i];
            	   boolean isSumLarger = false;
                   if(isSumLarger == false) {
                   if(sum > sumToFind) {
                	   isSumLarger = true;
                   }
                   boolean isSumEqual = false;
                   
                   if(isSumEqual == false) {
	                   if(sum == sumToFind){
	                       for(int t = j; t <= k; t++)
	                           b[t][i]=a[t][i];
	                      isSumEqual = true;
	                   	}
	                  }
                   }
               k++;
               }
           }
       }
       return b;
   }

}