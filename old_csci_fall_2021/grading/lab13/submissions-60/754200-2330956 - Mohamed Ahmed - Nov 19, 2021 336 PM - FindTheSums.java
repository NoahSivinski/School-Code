/*
* FindTheSums.java
* Author: Mohamed Ahmed
* Submission Date: November 19th, 2021
* 
* Purpose:  The goal of this lab is to write a method that 
* convert a 2D array to a printable String and to write 
* two additional methods that find the horizontal and vertical 
* sums for a 2D input array and an input integer called sumToFind.
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
* on a programming project created by the Department of
* Computer Science at the University of Georgia. Any publishing
* of source code for this project is strictly prohibited without
* written consent from the Department of Computer Science. */

public class FindTheSums {

	// This method will return a String that is a neat representation of the
	// values in a
	public static String arrayToString(int[][] a) {

		int length = a.length;

		int length1 = a[0].length;
		String totalCounter = "";

		for (int f = 0; f < length; f++) {

			for (int l = 0; l < length1; l++) {
				totalCounter += a[f][l];
				if (l < length1 - 1) {
					totalCounter += " ";
				}
			}
			if (f < length - 1) {
				totalCounter += "\n";
			}
		}

		return totalCounter;
	}

	// This method will create a new output array, b that has the same
	// dimensions
	public static int[][] horizontalSums(int[][] a, int sumToFind) {

		int[][] b = new int[a.length][a[0].length];

		int length = a.length;

		int length1 = a[0].length;

		boolean[][] check = new boolean[a.length][a[0].length];

		for (int f = 0; f < length; f++) {
			int j = 0;
			int count = 0;
			int counter = 0;

			while (j < length1) {
				if (sumToFind > counter) {
					counter = counter + a[f][j];
					j++;
				}
				if (sumToFind < counter) {
					count++;
					j = count;
					counter = 0;
				}
				if (counter == sumToFind) {
					for (int k = count; k < j; k++) {
						check[f][k] = true;
					}
					count++;
					j = count;
					counter = 0;
				}
			}
		}

		for (int f = 0; f < length; f++) {
			for (int j = 0; j < length1; j++) {
				if (check[f][j]) {
					b[f][j] = a[f][j];
				} else {
					b[f][j] = 0;
				}
			}

		}

		return b;

	}

	// This method will create a new output array called b that has the same
	// dimensions as a.
	public static int[][] verticalSums(int[][] a, int sumToFind) {

		int b[][] = new int[a.length][a[0].length];

		int length = a.length;

		int length1 = a[0].length;

		boolean check[][] = new boolean[a.length][a[0].length];

		for (int l = 0; l < length1; l++) {
			int i = 0;
			int count = 0;
			int counter = 0;

			while (i < length) {
				if (sumToFind > counter) {
					counter = counter + a[i][l];
					i++;
				}
				if (sumToFind < counter) {
					count++;
					i = count;
					counter = 0;
				}
				if (sumToFind == counter) {
					for (int k = 0; k < i; k++) {
						check[k][l] = true;
					}
					count++;
					i = count;
					counter = 0;
				}
			}
		}

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length1; j++) {
				if (check[i][j]) {
					b[i][j] = a[i][j];
				} else {
					b[i][j] = 0;
				}
			}
		}

		return b;
	}
}
