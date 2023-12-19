/*
 * CSCI1301.java
 * Author: Rayman Ng
 * Submission Date: 4/23/2021
 *
 * Purpose: This program generates a 2-d array with rows being greater than 0, and columns being greater than 0. 
 * It then checks to see if horizontal adjacent numbers or vertical adjacent numbers add to some sum. If they do add to that sum, they will be added to the outputted array, if they don't,
 * they will show up as zero. The program also provides a method which will format the array to make it look neater. 
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
	public static String arrayToString (int [][] a) {
		String arrayOfNumbers = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j != a[i].length -1) {
					arrayOfNumbers = arrayOfNumbers + a[i][j] + " ";
				}
				else {
					arrayOfNumbers = arrayOfNumbers + a[i][j];
				}
			}
			if ( i != a.length - 1) {
				arrayOfNumbers = arrayOfNumbers + "\n";
			}
		}
		return arrayOfNumbers;
	}
	public static int [][] horizontalSums(int [][] a, int sumToFind) {
		int [][] b = new int[a.length][a[0].length];
		for (int i = 0; i != a.length; i++) {
			int sum = 0;
			for (int j = 0, count = 0; j < a[i].length; j++) {
				sum = sum + a[i][j];
				while (sum > sumToFind) {
					sum = sum - a[i][count];
					count++;
				}
				if (sum == sumToFind) {
					sum = sum - a[i][count];
					for (int f = count;(f != j + 1); f++) {
						b[i][f] = a[i][f];
					}
					count++;
				}
			}
		}
		return b;
	}
	public static int [][] verticalSums(int [][] a, int sumToFind){
		int [][] b = new int[a.length][a[0].length];
		for (int i = 0;(i - a.length != 0); i++) {
			int sum = 0;
			for (int j = 0, count = 0; j < a.length; j++) {
				sum = sum + a[j][i];
				while (sum > sumToFind) {
					sum = sum - a[count][i];
					count++;
				}
				if (sum == sumToFind) {
					sum = sum - a[count][i];
					for (int f = count;(f != j + 1); f++) {
						b[f][i] = a[f][i];
					}
					count++;
				}
			}
		}
		return b;
	
	}
}
