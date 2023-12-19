/*
 * FindTheSums.java
 * Author:  Reid Cogswell 
 * Submission Date:  4-22-2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
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
	public static String arrayToString(int[][] a ) {
		String x="";
		for(int i=0; i<a.length; i++) { // i=row, j=column
			for (int j=0;j<a[0].length;j++) 
				if (i==a.length-1 && j==a[0].length-1)
					x+=a[i][j];
				else if (j == a[0].length-1)
					x+=a[i][j]+"\n";		
				else 
					x+=a[i][j]+" ";
		}
		return x;		
	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		int horizontalSum = 0;
		int counter=0;
		boolean sumIsCorrect = false;
		for(int i=0; i<a.length; i++) { // i=row, j=column
			for (int j=0;j<a[0].length;j++) {
				if (horizontalSum<sumToFind) {
					horizontalSum += a[i][j];
					counter++; //marks where last sumToFind was found 
					b[i][j] = a[i][j];
					if (j==a[0].length-1 && horizontalSum < sumToFind) {
						for (int k=0; k<counter; k++) {
							b[i][j-k] = 0;
						}
						j = j - counter + 1;
						horizontalSum = 0;
						counter = 0;
					}
					else if (horizontalSum == sumToFind) {
						sumIsCorrect = true;
						if(sumIsCorrect == true) {
							
						}
						horizontalSum = 0;
						counter=0;
					}
					else if (horizontalSum>sumToFind) {
						for (int k=0; k<counter; k++) {
							b[i][j-k] = 0;
						}
						if (j==a[0].length-1 && horizontalSum != sumToFind) {
							b[i][j] = 0;
							counter = 0;
							horizontalSum = 0;
						}
						else {
							j = j - counter;
							horizontalSum = 0;
							counter = 0;
						}
					}
				}
				else if (horizontalSum>sumToFind) {
					b[i][j] = 0;
					horizontalSum = 0;
				}
				else
					b[i][j] = 0;
			} // j
			counter = 0;
			horizontalSum = 0;
		} // i
		return b;
	}

	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		int verticalSum = 0;
		int counter=0;
		for(int j=0;j<a[0].length;j++) { // i=row, j=column
			for (int i=0;i<a[0].length;i++) {
				if (verticalSum<sumToFind) {
					verticalSum += a[i][j];
					counter++;
					b[i][j] = a[i][j];
					if (verticalSum == sumToFind) {
						verticalSum = 0;
						counter=0;
					}
					else if (verticalSum>sumToFind) {
						for (int k=0; k<counter; k++) {
							b[i][j-k] = 0;
						}
					}			
				}
				else if (verticalSum>sumToFind)
					b[i][j] = 0;
				else
					b[i][j] = 0;
			}
		}
		return b;
	}
}




