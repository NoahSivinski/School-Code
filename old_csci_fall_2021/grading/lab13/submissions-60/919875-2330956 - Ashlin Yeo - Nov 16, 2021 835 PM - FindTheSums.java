/*
 * FindTheSums.java
 * Author:  Ashlin Yeo
 * Submission Date:  11/16/2021
 *
 * Purpose: This program finds horizontal and vertical sums in a 
 * 2D input array of integers that equal some input integer value.
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
		for (int m = 0; m < a.length; m++) {
			for (int n = 0; n < a[m].length; n++) {
				arrayString += a[m][n];
				if (n < a[m].length - 1) {
					arrayString += " ";
				}
			}
			if (m < a.length - 1){
				arrayString += "\n";
			}
		}
		return arrayString;
	}

	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		int sum = 0;
		for (int m = 0; m < a.length; m++) { //moves row by 1
			for (int n = 0; n < a[m].length; n++) { //moves column by 1
				sum = 0;
				int startValue = n + 1;
				sum += a[m][n];
				while (sum != sumToFind && startValue < a[m].length) {
					sum += a[m][startValue];
					startValue++;
				}
				if (sum == sumToFind) {
					for (int k = n; k < startValue; k++) {
						b[m][k] = a[m][k]; //assign correct values of a to b
					}
				}
			}
		}
		return b;
	}

	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		int sum = 0;
		for (int m = 0; m < a[0].length; m++) { //moves row by 1
			for (int n = 0; n < a.length - 1; n++) { //moves column by 1
				sum = 0;
				int startValue = n + 1;
				sum += a[n][m];
				while (sum != sumToFind && startValue < a.length) {
					sum += a[startValue][m];
					startValue++;
				}
				if (sum == sumToFind) { 
					for (int k = n; k < startValue; k++) {
						b[k][m] = a[k][m]; //assign correct values of a to b
					}
				}
			}
		}
		return b;
	}









}
