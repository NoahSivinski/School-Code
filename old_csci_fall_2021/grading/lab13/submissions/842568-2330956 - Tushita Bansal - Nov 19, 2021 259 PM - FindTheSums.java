/*
 * FindTheSums.java
 * Author: Tushita Bansal
 * Submission Date:  11/19/2020
 *
 * Purpose: The purpose of this program is to do what a crossword puzzle program would do but with a two-sided 
 * array of numbers.
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
		String s = "";
		for (int i = 0; i < a.length; i++) {
			for (int x = 0; x < a[0].length; x++) {
				s += a[i][x];
				if (x < a[0].length - 1)
					s += " ";
			}
			if (i < a.length - 1)
				s += "\n";
		}
		return s;
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = 0;
		
		for (int i = 0; i < a.length; i++) { 
			for (int j = 0; j < a[0].length; j++) { 
				int sum = 0, count = 0;
				for (int k = j; k < a[0].length; k++) { 
					if (sum < sumToFind) {
						sum += a[i][k];
						count++;
					}
				}
				if (sum == sumToFind) { 
					for (int k = 0; k < count; k++)
						b[i][j + k] = a[i][j + k];
				}
			}
		}
		return b;
	}
	
	public static int[][] verticalSums (int[][] a, int sumToFind) {
		
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = 0;
		
		for (int i = 0; i < a[0].length; i++) { 
			for (int j = 0; j < a.length; j++) { 
				int sum = 0, count = 0;
				for (int k = j; k < a.length; k++) { 
					if (sum < sumToFind) {
						sum += a[k][i];
						count++;
					}
				}
				if (sum == sumToFind) { 
					for (int k = 0; k < count; k++)
						b[j+k][i] = a[j+k][i];
				}
			}
		}
		return b;
	}
}
