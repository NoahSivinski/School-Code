
//*******************************************************
/*
* FindTheSums.java
* Author: Lincoln Ledet
* Submission Date:  11/18/21
* Lab 13 – FindTheSums
* 
* Purpose: This programs finds what number produce a 
* sum in a array specified by the user. It works with
* the FindtheSumsTester file. 
* 
* 
*  * Statement of Academic Honesty:
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
//*******************************************************

public class FindTheSums {
	
	public static String arrayToString(int[][] a) {
		String numString = ""; 
		for(int i = 0; i < a.length; i++) {
			if (i>0 && i < a.length) {
				numString += "\n";//adds new line inbetween strings
			}
			for(int j = 0; j < a[i].length; j++) {
				if (j>0 && j < a[i].length) { 
					numString +=" ";
				}
				numString += a[i][j];
				
			}
		}
		//System.out.println(numString);
		return numString;

	}

	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = 0;//creates empty array of "0"s
			}

		}
		int total;

		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[0].length; j++) {//goes into 2d array
				total = 0;//sets sum to 0
				for (int p = j; p < a[0].length; p++) {//loop starts at first number
					
					total += a[i][p];
					if (total == sumToFind) {
						
						for(int k=j;k<=p;k++) {
							
							b[i][k]=a[i][k];//replaces "0" in int array
						}
						p = a[0].length;//if total == sumToFind loop will rescan for additional sums;\ 
					}
				}
			}
		}

		return b;
		
		
	}

	public static int[][] verticalSums(int[][] a, int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = 0;//creates empty array of "0"s
			}

		}
		int total;
		//Basically the same as horizontal sums except array is fliped
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {//gives collums instead of rows
				total = 0;
				for (int p = j; p < a.length; p++) {
					
					total += a[p][i];
					
					if (total == sumToFind) {
						
						for(int k=j;k<=p;k++) {
							
							b[k][i]=a[k][i];
						}
						p = a.length;//sets to length of collum 
					}
				}
			}
		}

		return b;
		
		
	}
		
	

}
