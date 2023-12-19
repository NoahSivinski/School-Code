/*
 * FindTheSums.java
 * Author:  [Anastasia Antoine] 
 * Submission Date:  [4/19/2021]
 *
 * Purpose: Find the sums of integers
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

	public static String arrayToString(int [] [] a) {
		String array = "";
		for(int i = 0; i < a.length; i++) {
			for(int l = 0; l < a[i].length; l++) {
				if(l == a[i].length - 1) {
					array += a[i][l];
				}
				else {
					array += a[i][l] + " ";
				}
			}
			if(i != a.length - 1) {
				array += "\n";
			}
		}
		return array;

	}
	
	public static int[] [] horizontalSums(int[] [] a, int sumToFind){
		int[] [] b = new int[a.length] [a[0].length]; 
		for(int i = 0; i < a.length; i++) {
			for(int l = 0; l < a[i].length; l++) {
				b[i][l] = 0; 
			}
		}
		for(int i = 0; i < a.length; i++) {
			for(int l = 0; l < a[i].length; l++) {
				int sum = 0, m = l; 
				while (m < a[i].length) {
					sum += a[i][m];
					if(sum > sumToFind)break;
					if(sum == sumToFind) {
						for(int g = l; g <= m; g++) {
							b[i][g] = a[i][g];
						}
						break;
					}
					m++;
				}
			}
		}
		return b;
	}
	
	public static int[] [] verticalSums(int[] [] a, int sumToFind){
		int[] [] b = new int[a.length][a[0].length]; 
		for(int i = 0; i < a.length; i++) {
			for(int l = 0; l < a[i].length; l++) {
				b[i][l] = 0;
			}
		}
		for(int i = 0; i < a[0].length; i++) {
            for(int l = 0; l < a.length; l++) {
            	int sum = 0, m = l; 
				while (m < a.length) {
					sum += a[m][i];
					if(sum > sumToFind)break;
					if(sum == sumToFind) {
						for(int g = l; g <= m; g++) {
							b[g][i] = a[g][i];
						}
						break;
					}
					m++;
				}	
			}
		}
		return b; 
					
	}
	
	

}
