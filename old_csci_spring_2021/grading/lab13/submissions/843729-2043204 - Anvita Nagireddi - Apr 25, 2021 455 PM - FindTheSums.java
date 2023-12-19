/**
 * FindTheSums.java
 * Author:  Anvita Nagireddi 
 * Submission Date:  Apr-25-2021
 * File name: FindTheSums.java
 *
 * This program does the following: create a numeric wordsearch for an array
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
		String array = "";
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length - 1; j++) {
				array = array +  a[i][j] + " ";
			}
			array = array + a[i][a[i].length - 1];
			if(i < a.length -1 ) {
				array = array + "\n";
			}
		}
		return array;
	}
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		int sum = 0;
        int reviewSum = 0;
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j< a[i].length;j++) {
            		sum = sum + a[i][j];
            	if(sum > sumToFind) {
            		b[i][j] = 0;
            	}
            	else {
            		b[i][j] = a[i][j];
            	}
            }
        	for(int k = 0; k < a[i].length; k++) {
        		reviewSum = reviewSum + b[i][k];
        	}
        	if (reviewSum < sumToFind) {
        		for(int j = 0; j< a[i].length;j++) {
        			b[i][j] = 0;
        		}
        	}
        	if(reviewSum > sumToFind) {
        		for(int revSum = reviewSum; revSum < sumToFind;) {
        			revSum = revSum - sumToFind;
        			reviewSum = revSum;
        		}
        	}
            sum = 0;
            reviewSum = 0;
        }
        return b;
	}
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		int sum = 0;
        int reviewSum = 0;
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j< a[i].length;j++) {
            		sum = sum + a[i][j];
            	if(sum > sumToFind) {
            		b[i][j] = 0;
            	}
            	else {
            		b[i][j] = a[i][j];
            	}
            }
        	for(int k = 0; k < a[i].length; k++) {
        		reviewSum = reviewSum + b[i][k];
        	}
        	if (reviewSum < sumToFind) {
        		for(int j = 0; j< a[i].length;j++) {
        			b[i][j] = 0;
        		}
        	}
        	if(reviewSum > sumToFind) {
        		for(int revSum = reviewSum; revSum < sumToFind;) {
        			revSum = revSum - sumToFind;
        			reviewSum = revSum;
        		}
        	}
            sum = 0;
            reviewSum = 0;
        }
        return b;
	} 
}
