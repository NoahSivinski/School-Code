/*
 * FindTheSums.java
 * Author:  Nataly Garcia 
 * Submission Date:  April 22nd 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? In this program, the 
 * code reads either a vertical or horizontal line and
 * finds any consecutive digits that has a sum of what
 * the user prompts. This is done by getting the summation 
 * of the line and then subtracting a sequence of
 * digits using multiple loops and if-else statements.
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
		String myString = "";
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				if (column == (a[row].length - 1)) {
					myString += a[row][column];
				}
				else {
					myString += a[row][column] + " ";
				}
			}
			if (row != (a.length - 1)) {
				myString += "\n";
			}
		}
		return myString;
	}

	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int numOfRows = a.length;
		int numOfColumns = a[numOfRows - 1].length;
		int[][] b = new int[numOfRows][numOfColumns];
		for (int row = 0; row < numOfRows; row++) {
			int sumOfColumn;
			int columnNumber = numOfColumns;
			while (columnNumber > 0) {
				sumOfColumn = 0;
				for (int selectColumn = 0; selectColumn < columnNumber; selectColumn++) {
					sumOfColumn = sumOfColumn + a[row][selectColumn];
				}
				for (int selectColumn2 = 0; selectColumn2 < columnNumber; selectColumn2++) {
					if (sumOfColumn == sumToFind) {
						for (int selectColumn3 = selectColumn2; selectColumn3 < columnNumber; selectColumn3++)
							b[row][selectColumn3] = a[row][selectColumn3];
					}
					sumOfColumn = sumOfColumn - a[row][selectColumn2];
				}
				columnNumber = columnNumber - 1;
			}
		}
		return b;
	}

	public static int[][] verticalSums(int[][] a, int sumToFind){
		int numOfRows = a.length;
		int numOfColumns = a[numOfRows - 1].length;
		int[][] b = new int[numOfRows][numOfColumns];
		for (int column = 0; column < numOfColumns; column++) {
			int sumOfRow;
			int rowNumber = numOfRows;
			while (rowNumber > 0) {
				sumOfRow = 0;
				for (int selectRow = 0; selectRow < rowNumber; selectRow++) {
					sumOfRow = sumOfRow + a[selectRow][column];
				}
				for (int selectRow2 = 0; selectRow2 < rowNumber; selectRow2++) {
					if (sumOfRow == sumToFind) {
						for (int selectRow3 = selectRow2; selectRow3 < rowNumber; selectRow3++)
							b[selectRow3][column] = a[selectRow3][column];
					}
					sumOfRow = sumOfRow - a[selectRow2][column];
				}
				rowNumber = rowNumber - 1;
			}
		}
		return b;
	}
}
