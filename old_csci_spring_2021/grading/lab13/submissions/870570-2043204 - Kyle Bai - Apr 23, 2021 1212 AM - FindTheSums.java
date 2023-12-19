/*
 * [FindTheSums].java
 * Author:  [KyleBai] 
 * Submission Date:  [04/23/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This lab is a puzzles game. In this lab we will find horizontal and vertical sums in 2D array of integers.
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

	public static String arrayToString(int a[][]) {

		String arrayString = "";

		for(int i = 0 ; i < a.length; i++){
			for(int j = 0 ; j < a[i].length; j++){
				if(j == a[i].length-1) {
					arrayString += a[i][j];
				}
				else {
					arrayString += a[i][j]+" ";
				}
			}
			if(i!=a.length-1)
				arrayString += "\n";
		}
		return arrayString;
	}
	//horizontalSum
	public static int[][] horizontalSums(int[][] a,int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		for(int i = 0 ; i < a.length; i++) {
			for(int j = 0 ; j < a[i].length; j++) {
				int sum = 0;
				b[i][j]=0;
				for(int k = j; k < a[i].length; k++) {
					sum += a[i][k];
					if (sumToFind < sum) {
						break;
					}
					else if(sumToFind == sum) {
						for(int e = j; e <= k; e++) {
							b[i][e] = a[i][e];
						}
						break;
					}
				}
			}
		}
		return b;
	}
	//verticalSum
	public static int[][] verticalSums(int[][] a,int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		for(int i = 0 ; i < a.length; i++) {
			for(int j = 0 ; j < a[i].length; j++) {
				int sum = 0;
				b[i][j]=0;
				for(int k = j; k < a[i].length; k++) {
					sum += a[i][k];
					if (sumToFind < sum) {
						break;
					}
					else if(sumToFind == sum) {
						for(int e = j; e <= k; e++) {
							b[i][e] = a[i][e];
						}
						break;
					}
				}
			}
		}
		return b;
	}
}