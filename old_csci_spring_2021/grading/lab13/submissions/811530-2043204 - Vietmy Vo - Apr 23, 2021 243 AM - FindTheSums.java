/*
 * FindTheSums.java
 * Author:  Vietmy Vo
 * Submission Date:  04/23/2021
 *
 * Purpose: The purpose of this program is to print out a 2d array into a string and find vertical
 * and horizontal sums that add up to a certain number.
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
		String Array = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (j == a[0].length - 1)
					Array = Array + a[i][j];
				else
					Array = Array + a[i][j] + " ";
			}
			if (i != a.length - 1)
				Array = Array + "\n";
		}
		return Array;
	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] horSums = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				horSums[i][j] = 0;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int sum = 0;
				for (int k = j; k < a[i].length; k++) {
					sum = sum + a[i][k];
					if (sum == sumToFind) {
						for (int l = j; l <= k; l++) {
							horSums[i][l] = a[i][l];
						}
						k = a[i].length;
					}
				}
			}
		}
		return horSums;
	}

	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] vertSums = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				vertSums[i][j] = 0;
			}
		}
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				int sum = 0;
				for (int k = j; k < a.length; k++) {
					sum = sum + a[k][i];
					if (sum == sumToFind) {
						for (int l = j; l <= k; l++) {
							vertSums[l][i] = a[l][i];
						}
						k = a.length;
					}
				}
			}
		}
		return vertSums;
	}

}
