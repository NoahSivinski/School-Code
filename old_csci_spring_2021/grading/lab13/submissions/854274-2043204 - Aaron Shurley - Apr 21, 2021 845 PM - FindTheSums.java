/**
   * FindTheSums.java 
   * 
   * Author: Aaron Shurley 
   * 
   * Submission Date: 4/21/2021
   *
   * Purpose: This program finds numbers that add up to a given sum occurring horizontally or vertically
   * in a 2 dimensional array.
   *
   * Statement of Academic Honesty:
   *
   * The following code represents my own work. I have neither received nor given inappropriate
   * assistance. I have not copied or modified code from any source other than the course webpage or
   * the course textbook. I recognize that any unauthorized assistance or plagiarism will be handled
   * in accordance with the University of Georgia's Academic Honesty Policy and the policies of this
   * course. I recognize that my work is based on an assignment created by the Department of
   * Computer Science at the University of Georgia. Any publishing or posting of source code for
   * this project is strictly prohibited unless you have written consent from the Department of
   * Computer Science at the University of Georgia.
   */
public class FindTheSums {
	public static String arrayToString(int[][] a) {
		String array = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				array += a[i][j];
				if (j < a[0].length - 1)
					array += " ";
			}
			if (i < a.length - 1)
				array += "\n";
		}
		return array;
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		//create b array
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = 0;
		
		//nested loop search
		for (int i = 0; i < a.length; i++) { //setting up the rows
			for (int j = 0; j < a[0].length; j++) { //setting up the columns
				int sum = 0, tracker = 0;
				for (int k = j; k < a[0].length; k++) { //the search loop
					if (sum < sumToFind) {
						sum += a[i][k];
						tracker++;
					}
				}
				if (sum == sumToFind) { //update b array
					for (int k = 0; k < tracker; k++)
						b[i][j + k] = a[i][j + k];
				}
			}
		}
		return b;
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		//create b array
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = 0;
		
		//nested loop search
		for (int i = 0; i < a[0].length; i++) { // setting up the columns
			for (int j = 0; j < a.length; j++) { //setting up the rows
				int sum = 0, tracker = 0;
				for (int k = j; k < a.length; k++) { //search loop
					if (sum < sumToFind) {
						sum += a[k][i];
						tracker++;
					}
				}
				if (sum == sumToFind) { //update b array
					for (int k = 0; k < tracker; k++)
						b[j+k][i] = a[j+k][i];
				}
			}
		}
		return b;
	}
	
	
}