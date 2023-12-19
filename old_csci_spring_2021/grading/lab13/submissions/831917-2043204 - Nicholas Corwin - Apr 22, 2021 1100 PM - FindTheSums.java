/*
 * [CSCI 1301].java
 * Author:  [Nicholas Corwin] 
 * Submission Date:  [4/23/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program converts a 2D array to a neatly printed string. This program also prints two additional methods to find the horizontal and vertical sums for the input 2D array. 
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
	// Returns string for the 2D array
   public static String arrayToString(int[][] a) {
       String res = "";
       for(int i = 0 ; i < a.length; i++){
           for(int j = 0 ; j < a[i].length; j++){
               if(j == a[i].length-1)
                   res+=a[i][j];
               else
                   res+=a[i][j]+" ";
           }
           if(i!=a.length-1)
           res+="\n";
       }
       	return res;
   }
   // horizontalSums function
   public static int[][] horizontalSums(int[][] a,int sumToFind){
       int[][] b = new int[a.length][a[0].length];
       for(int i = 0 ; i < a.length; i++)
           for(int j = 0 ; j < a[i].length; j++)
               b[i][j]=0;
       for(int i = 0 ; i < a.length; i++){
           for(int j = 0 ; j < a[i].length; j++){
               int sum=0,k=j;
               while(k<a[i].length){
                   sum+=a[i][k];
                   if(sum>sumToFind)break;
                   if(sum==sumToFind){
                       for(int t=j;t<=k;t++)
                           b[i][t]=a[i][t];
                       break;
                   }
               k++;
               }
           }
       }
       return b;
   }
   // verticalSums function
   public static int[][] verticalSums(int[][] a,int sumToFind){
       int[][] b = new int[a.length][a[0].length];
       for(int i = 0 ; i < a.length; i++)
           for(int j = 0 ; j < a[i].length; j++)
               b[i][j]=0;
       for(int i = 0 ; i < a[0].length; i++){
           for(int j = 0 ; j < a.length; j++){
               int sum=0,k=j;
               while(k<a.length){
                   sum+=a[k][i];
                   if(sum>sumToFind)break;
                   if(sum==sumToFind){
                       for(int t=j;t<=k;t++)
                           b[t][i]=a[t][i];
                       break;
                   }
               k++;
               }
           }
       }
       return b;
   }

}