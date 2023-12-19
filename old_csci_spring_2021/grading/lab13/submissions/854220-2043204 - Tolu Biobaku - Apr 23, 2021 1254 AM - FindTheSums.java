/*
 * FindTheSums.java
 * Author:  Toluwani Biobaku
 * Submission Date:  04/23/2021
 *
 * Purpose: 
 * 
 * The purpose of this program is to gain experience working with 2D arrays, nested loops, nested statements, static methods, writing pseudocode, and problem decomposition.
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
public class FindTheSums {

	public static String arrayToString(int[][] a) {

		String Array = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j < a[i].length - 1)
					Array = Array + a[i][j] + " ";
				else
					Array = Array + a[i][j];
			}
			if (i < a.length - 1)
				Array = Array + "\n";
		}
		return Array;
	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = 0;


		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++) {
				int sum = 0;
				int tempo = 0;

				for (int k = j; k < a[0].length; k++) {
					if (sum < sumToFind) {
						sum = a[i][k] + sum;
						tempo++;
					}

				}
				if (sum == sumToFind) { 
					for (int k = 0; k < tempo; k++) {
						b[i][j + k] = a[i][j + k];

					}
				}
			}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {

			}
		}
		return b;
	}

	public static int[][] verticalSums(int[][] a, int sumToFind) { 

		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++)

			for (int j = 0; j < a[0].length; j++)
				b[i][j] = 0;


		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				int sum = 0, tempo = 0;

				for (int k = j; k < a.length; k++) {
					if (sum < sumToFind) {
						sum = a[k][i] + sum;
						tempo++;
					}
				}
				if (sum == sumToFind) {
					for (int k = 0; k < tempo; k++)
						b[j + k][i] = a[j + k][i];
				}
			}
		}
		return b;
	}
}


