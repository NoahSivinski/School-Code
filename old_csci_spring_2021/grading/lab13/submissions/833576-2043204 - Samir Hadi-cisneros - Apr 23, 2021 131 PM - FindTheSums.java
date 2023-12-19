/*
 * FindTheSums.java
 * Author: Samir Hadi Cisneros
 * Submission Date:  23 April 2021
 *
 * Purpose: This program finds numbers that sum to the given value in 
 * a two dimensional array. It is expressed either horizontally or vertically.
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
 * 
 * I agree
 */

public class FindTheSums {
	
	//This method will return a String that is a representation of the values in a
	public static String arrayToString(int[][] a) {

		String s = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				s += a[i][j];
				if (j < a[0].length - 1)
					s += " "; //formatting so that the values are neat
			}
			if (i < a.length - 1)
				s += "\n";	////formatting so that the values are neat
		}
		return s;
	}

	
	//This method will create a new output array called b that has the same dimensions as a
	//For each a[i][j], where i and j are valid indices in a, if a[i][j] is part of a horizontal sum in a that
	//equals sumToFind, then b[i][j] = a[i][j]; otherwise, b[i][j] = 0
	//then returns b
	 
	public static int[][] horizontalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				int sum = 0, tracing = 0;
				for (int k = j; k < a[0].length; k++) {
					if (sum < sumToFind) {
						sum += a[i][k];
						tracing++;
					}
				}
				if (sum == sumToFind) {
					for (int k = 0; k < tracing; k++)
						b[i][j + k] = a[i][j + k];
				}
			}
		}
		return b;
	}

	
	//This method will create a new output array called b that has the same dimensions as a
	//each a[i][j], where i and j are valid indices in a, if a[i][j] is part of a vertical sum in a that
	//equals sumToFind, then b[i][j] = a[i][j]; otherwise, b[i][j] = 0.
	//returns b
	public static int[][] verticalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = 0;

		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				int sum = 0, tracing = 0;
				for (int k = j; k < a.length; k++) {
					if (sum < sumToFind) {
						sum += a[k][i];
						tracing++;
					}
				}
				if (sum == sumToFind) {
					for (int k = 0; k < tracing; k++)
						b[j + k][i] = a[j + k][i];
				}
			}
		}
		return b;
	}

}