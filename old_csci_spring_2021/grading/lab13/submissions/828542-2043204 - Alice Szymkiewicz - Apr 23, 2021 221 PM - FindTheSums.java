/*
 * FindTheSums.java
 * Author:  Alice Szymkiewicz 
 * Submission Date:  04/23/2021
 *
 * Purpose: 
 * 
 * This program uses 2D input arrays to create a word search game.
 * The user looks for a set of numbers wither in the horizontal 
 * direction or vertical direction that will add up to a certain 
 * value. The program converts the 2D arrays to a printed String 
 * to do this. There are several loops in the program that traverse
 * through the 2D array. Then at a certain row or column, the program 
 * starts at the beginning and traverses through that entire row and 
 * column looking for values that add together with the first number 
 * that result in the sumToFind. When this is done, the for loop
 * iterates and goes to the second number and traverses the rest of 
 * the row or column to look for another set of numbers that creates
 * the sumToFind. This process repeats.
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
		String statement = "";
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[0].length; j++) {
				statement += a[i][j];
				
				if (j != (a[0].length - 1)) {
					statement += " ";
				}
				
			}
			
			if (i != (a.length - 1)) {
				statement += "\n";
			}
			
		}
		return statement;
	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[0].length; j++) {
				int sum = 0;
				
				for (int k = j; k < a[0].length; k++) {
					sum += a[i][k];
					
					if (sum == sumToFind) {
						
						for (int l = j; l <= k; l++) {
							b[i][l] = a[i][l];
						}
						
					}

				}
				
			}
			
		}
		return b;
	}

	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		
		for (int i = 0; i < a[0].length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				int sum = 0;
				
				for (int k = j; k < a.length; k++) {
					sum += a[k][i];
					
					if (sum == sumToFind) {
						
						for (int l = j; l <= k; l++) {
							b[l][i] = a[l][i];
						}
						
					}

				}
				
			}
			
		}
		return b;
	}
}