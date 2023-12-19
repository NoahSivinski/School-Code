/*
 * FindTheSums.java
 * Author:  Dominique Coney 
 * Submission Date:  April 22, 2021
 *
 * Purpose: The purpose of this lab is to create two dimensional arrays with methods that can be used to make something similar to a word search puzzle.
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
/**
 * 
 */

/**
 * @author Dominique Coney
 *
 */
public class FindTheSums {

	/**
	 * @param args
	 */
	public static String arrayToString(int[][] a) {
		String neat = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j == a[i].length - 1) {
					neat += a[i][j];
				} else {
					neat += a[i][j] + " ";
				}
			}
			if (i != a.length - 1) {
				neat += "\n";
			}
		}
		return neat;
	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[i][j] = 0;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int sum = 0; 
				int k=j;
				boolean run = true;
				while (k < a[i].length && run) {
					sum += a[i][k];
					if(sum>sumToFind) {
						run = false;
					}
					if (sum == sumToFind) {
						for (int l = j; l <= k; l++) {
							b[i][l] = a[i][l];
						}
						run = false;
					}
						k++;
				}

			}

		}
		return b;
	}
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] b = new int [a.length] [a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[i][j] = 0;
			}
	}
		for(int i = 0; i<a[0].length; i++) {
			for(int j = 0; j<a.length; j++) {
				int sum = 0; 
				int k=j;
				boolean run = true;
				while (k < a.length && run) {
					sum += a[k][i];
					if(sum>sumToFind) {
						run = false;
					};
					if (sum == sumToFind) {
						for (int l = j; l <= k; l++) {
							b[l][i] = a[l][i];
						}
						run = false;
					}
						k++;
				}

			}

		}
		return b;
	}
	}
