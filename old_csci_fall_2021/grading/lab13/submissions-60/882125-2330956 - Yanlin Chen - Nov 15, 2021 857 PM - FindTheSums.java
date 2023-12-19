/*
 * [CSCI 1301].java
 * Author:  [Yanlin Chen] 
 * Submission Date:  [11/19/2021]
 *
 * Purpose: To find the horizontal sum and vertical sum within the array,
 * 			and put them into a new array.
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
		String neatA = "";
		for (int indexR = 0; indexR < a.length; indexR++) {
			for (int indexC = 0; indexC < a[0].length; indexC++) {
				if (indexC < a[0].length - 1)
					neatA = neatA + a[indexR][indexC] + " ";
				else 
					neatA = neatA + a[indexR][indexC];
			}
			if (indexR < a.length - 1)
				neatA = neatA + "\n";
		}
		return neatA;
	}
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int[][] b = new int [a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int o = 0; o < a[0].length; o++) {
				b[i][o] = 0;
			}
		}
		int indexR = 0;
		while (indexR < a.length) {
			int sum = 0;
			int nextColumn = 0;
			int indexC = 0;
			while (indexC < a[0].length) {
				sum = sum + a[indexR][indexC];
				if (sum < sumToFind) {
					indexC++;
				}
				else if (sum == sumToFind) {
					for (int index = nextColumn; index <= indexC; index++) {
						b[indexR][index] = a[indexR][index];
					}
				}
				//sum > sumToFind
				else {
					nextColumn++;
					indexC = nextColumn;
					sum = 0;
				}
			}
			indexR++;
		}
		return b;
	}
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] b = new int [a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int o = 0; o < a[0].length; o++) {
				b[i][o] = 0;
			}
		}
		int indexC = 0;
		while (indexC < a[0].length) {
			int sum = 0;
			int nextRow = 0;
			int indexR = 0;
			while (indexR < a.length) {
				sum = sum + a[indexR][indexC];
				if (sum < sumToFind) {
					indexR++;
				}
				else if (sum == sumToFind) {
					for (int i = nextRow; i <= indexR; i++) {
						b[i][indexC] = a[i][indexC];
					}
				}
				//sum > sumToFind
				else {
					nextRow++;
					indexR = nextRow;
					sum = 0;
				}
			}
			indexC++;
		}
		return b;
	}
}
