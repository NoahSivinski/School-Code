/*
 * FindTheSums.java
 * Author:  Allan Waweru 
 * Submission Date:  04/23/2021
 *
 * Purpose: The goals of this lab are to write a method
 * that convert a 2D array to a neatly printable String
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

	//method to get the 2D arrays in a form of String
	public static String arrayToString(int[][] a) {
		String returned = "";

		//nested loop
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if(j == a[1].length - 1) {
					returned+=a[i][j];
				}
				else {

					returned+=a[i][j]+" ";
				}
			}
			if(i != a.length - 1) {
				returned = returned + "\n";
			}
		}


		return returned;
	}

	
	//horizontal sums method
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] b = new int [a.length][a[0].length];

		//local variables
		int tempSum;
		int indexCount;

		//nested loop
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				//initialize the variables
				tempSum = 0;
				indexCount = 0;

				for(int x = 0; x < a[0].length - j; x++) {

					tempSum += a[i][j + x];                    
					indexCount++;
					if(tempSum == sumToFind) {
						for(int y = 0; y < indexCount; y++) {
							//stores the vales in a[][] to b[][]
							b[i][j + x - y] = a[i][j + x - y];
						}

						x = a[0].length;
					}

					if(tempSum > sumToFind) {
						x = a[0].length;
					}
				}
			}
		}

		return b;
	}

	
	//vertical sums method
	public static int[][] verticalSums(int[][] a,int sumToFind){
		int[][] b = new int[a.length][a[0].length];
		for(int i = 0 ; i < a.length; i++)
			for(int j = 0 ; j < a[i].length; j++)
				b[i][j]=0;
		for(int i = 0 ; i < a[0].length; i++){
			for(int j = 0 ; j < a.length; j++){
				int sum=0,k=j;
				while(k<a.length){
					sum+=a[k][i];
					if(sum>sumToFind)break;
					if(sum==sumToFind){
						for(int t=j;t<=k;t++)
							b[t][i]=a[t][i];
						break;
					}
					k++;
					}
				}
			}
			return b;
		}

	}
