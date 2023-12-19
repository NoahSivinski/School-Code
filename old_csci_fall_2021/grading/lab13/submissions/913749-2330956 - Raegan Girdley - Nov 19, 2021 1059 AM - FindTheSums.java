/*
 * FindTheSums.java
 * Author:  Raegan Girdley
 * Submission Date:  11/19/2021
 *
 * Purpose: Takes 2d array and prints it out as string, finds horizontal sums, and finds vertical sums.
 * New array only prints out numbers that are a part of a sum, otherwise the number at that position
 * is printed as zero.
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
		String result = "";
		
		for (int i = 0; i < a.length; i++) { 
			for (int j = 0; j < a[i].length; j++) {
				if (j != a[i].length-1) {
					result += a[i][j] + " ";
				}
				else {
					result += a[i][j];
				}
			}
			if (i != a.length-1) {
				result += "\n";
			}
		}
		return result;
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		int total, checker;
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = 0;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				total = 0;
				checker = 0;
				for (int x = j; x < a[i].length; x++) {
					if (total < sumToFind) {
						total += a[i][x];
						checker++;
					}
				}
				if (total == sumToFind) {
					for (int x = 0; x < checker; x++) {
						b[i][j + x] = a[i][j + x];
					}
				}
			}
		}
		
		return b;
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		int total, checker;
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = 0;
			}
		}
		
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				total = 0;
				checker = 0;
				
				for (int x = j; x < a.length; x++) {
					if (total < sumToFind) {
						total += a[x][i];
						checker++;
					}
				}
				
				if (total == sumToFind) {
					for (int x = 0; x < checker; x++) {
						b[j+x][i] = a[j+x][i];
					}
				}
			}
		}
		
		
		return b;
	}

}
