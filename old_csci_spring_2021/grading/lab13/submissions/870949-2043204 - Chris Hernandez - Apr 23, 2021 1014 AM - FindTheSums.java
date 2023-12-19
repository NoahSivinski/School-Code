/*
 * [FindTheSums].java
 * Author:  [Chris Hernandez] 
 * Submission Date:  [4/23/2021]
 *
 * Purpose: This lab consists of working with 2D input arrays of integers. It converts 2D arrays
 * into a neatly formed String that provides better organization. 
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
	
	// Returns a String which represents the values of a neatly in an array.
	public static String arrayToString(int[][] a) {
		String array = "";
		/* Aligns the values of a so that each column has a single space between them 
		 * and each row has a single newline character
		 * between them. Also adjusts accordingly with parameters given. */
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j == a[i].length-1) {
					array += a[i][j];
				}
				else {
					array += a[i][j] + " ";
				}
			}
			if(i!=a.length-1) {
				array+="\n";				
			}
		}
		return array;
	}
	
	// Method that creates output array b that has same dimensions as a.
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		// Creates new array
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				b[i][j] = 0;
			}
		}
		int sum;
		// Follows parameters given in lab.
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j<a[0].length; j++) {
				sum = 0;
				for (int k = j; k<a[0].length; k++) {
					sum += a[i][k];
					if (sum == sumToFind) {
						for (int l = j; l <= k; l++) {
							b[i][l] = a[i][l];
						}
						k = a[0].length;
					}
				}
			}
		}
		return b;
	}
	
	// Method that creates output array b that has same dimensions as a.
	public static int[][] verticalSums(int[][] a, int sumToFind){
		// Creates new array
		int[][] b = new int[a.length][a[0].length];
		for(int i = 0; i<a.length; i++) {
			for (int j = 0; j<a[0].length; j++) {
				b[i][j] = 0;
			}
		}
		int sum;
		// Follows parameters given in lab.
		for (int i = 0; i<a[0].length; i++) {
			for (int j = 0; j<a.length; j++) {
				sum = 0;
				for (int k = j; k<a.length; k++) {
					sum += a[k][i];
					if(sum == sumToFind) {
						for (int l = j; l<=k; l++) {
							b[l][i] = a[l][i];
						}
						k = a.length;
					}
				}
			}
		}
		return b;
	}
}