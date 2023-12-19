/*
 * FindTheSums.java
 * Author:  Brandon Ho
 * Submission Date:  Nov 18 2021
 *
 * Purpose: Finds the sums of a given integer found in row or column
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

	//returns a string of 2d array printed out in rows and columns
	public static String arrayToString(int[][] a) {
		String s = "";
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < a[i].length - 1 ; j++) {
				s += a[i][j] + " ";
			}
			if(i != a.length - 1) {
				s += a[i][a[i].length - 1] + "\n";
			}
			else {
				s += a[i][a[i].length - 1] ;
			}

		}
		return s;
	}

	//finds horizontal sums in array that equals the sumToFind, replace others values that do not to 0
	public static int[][] horizontalSums(int[][] a, int sumToFind){

		int[][] b = new int[a.length][a[0].length];
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < a[i].length ; j++) {
				int sum = sumToFind;
				for(int k = j ; k < a[i].length && sum > 0 ; k++ ) {
					sum = sum - a[i][k];
					if(sum == 0) {
						while(k >= j) {
							b[i][k] = a[i][k];
							k--;
						}
					}
				}

			}
		}

		return b;

	}

	//finds vertical sums in array that equals the sumToFind, replaces other values that do not to 0
	public static int[][] verticalSums(int[][] a, int sumToFind){

		int[][] b = new int[a.length][a[0].length];
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < a[i].length ; j++) {
				int sum = sumToFind;
				for(int k = i ; k < a.length && sum > 0 ; k++) {
					sum = sum - a[k][j];
					if(sum == 0) {
						while(k >= i) {
							b[k][j] = a [k][j];
							k--;
						}
					}
				}
			}
		}

		return b;

	}

}
