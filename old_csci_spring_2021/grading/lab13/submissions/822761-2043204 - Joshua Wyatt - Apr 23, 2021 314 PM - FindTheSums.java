
/*
 * FindTheSum.java
 * Author:  Joshua Wyatt
 * Submission Date:  4/23/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program is a word search program that allows you to find a sum
 * horizontally and vertically in an array of integers instead of using
 * letters and words like normal word search. This includes examples of finding all
 * vertical sums in the given array that equat something like 25.
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
	public static void main (String[] args) {
//		input code to test here

	}
	public static String arrayToString(int[][] a) {
		String output = "";
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) {
				output=output+String.valueOf(a[i][j]);
				if(j!=a[i].length-1) {
					output+= " ";
				}
			}
			if(i!=a.length-1) {
				output+= "\n";
			}
		}
		return output;
		
	}
//	horizontal sum calculator and finder
	public static int[][] horizontalSums(int[][] a, int sumToFind){
		int count=0;
		int k=0;
		int [][] b=new int[a.length][a[0].length];
		boolean flag = false;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
			b[i][j]=0;
			}}
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				count=0;
				for(k=j;k<a[i].length;k++) {
					count+=a[i][k];
					if (count==sumToFind) {
						flag=true;
						for(;j<=k;j++){
							b[i][j]=a[i][j];
						}

					}
				}
				
			}
		}
		return b;
	}
//	vertical sum calculator and finder
	public static int[][] verticalSums(int[][] a, int sumToFind){
		int count=0;
		int k=0;
		int [][] b=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
			b[i][j]=0;
			}}
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				count=0;
				for(k=i;k<a.length;k++) {
					count+=a[k][j];
					if (count==sumToFind) {
						
						for(int l=i;l<=k;l++){
							
							b[l][j]=a[l][j];
						}

					}
				}
				
			}
		}
		return b;
	}
	
}

