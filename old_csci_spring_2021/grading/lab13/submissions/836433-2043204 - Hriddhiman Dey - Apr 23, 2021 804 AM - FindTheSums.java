/*
 * [FindTheSums].java
 * Author:  [Hriddhiman Dey] 
 * Submission Date:  [4/23/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * Program uses 2 Dimensional arrays to find horizontal and vertical sums in 
 * an array of integers that equal some input integer value. It uses nested
 * loops to iterate through the values in their rows and columns. 
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
	
	//array toStrnig
	public static String arrayToString(int[][] a) {
		String sum = "";
		for(int i = 0 ; i < a.length; i++){
			for(int j = 0 ; j < a[i].length; j++){
				if(j == a[i].length-1)
					sum+=a[i][j];
				else
					sum+=a[i][j]+" ";
			}
			if(i!=a.length-1)
				sum+="\n";
		}
		return sum;
	}
	//horizontalSums
	public static int[][] horizontalSums(int[][] a,int sumToFind){
		int[][] h = new int[a.length][a[0].length];
		for(int i = 0 ; i < a.length; i++)
			for(int j = 0 ; j < a[i].length; j++)
				h[i][j]=0;
		boolean looping = true;
		for(int i = 0 ; i < a.length; i++){
			for(int j = 0 ; j < a[i].length; j++){
				int sum=0,k=j;
				while(k<a[i].length){
					sum+=a[i][k];
					if(sum>sumToFind)
						looping = false;
					if(sum==sumToFind){
						for(int t=j;t<=k;t++)
							h[i][t]=a[i][t];
					}
					k++;
				}
			}
		}
		return h;
	}
	// verticalSums
	public static int[][] verticalSums(int[][] a,int sumToFind){
		int[][] v = new int[a.length][a[0].length];
		for(int i = 0 ; i < a.length; i++)
			for(int j = 0 ; j < a[i].length; j++)
				v[i][j]=0;
		boolean looping = true;
		for(int i = 0 ; i < a[0].length; i++){
			for(int j = 0 ; j < a.length; j++){
				int sum=0,k=j;
				while(k<a.length){
					sum+=a[k][i];
					if(sum>sumToFind)
						looping = false;
					if(sum==sumToFind){
						for(int t=j;t<=k;t++)
							v[t][i]=a[t][i];
					}
					k++;
				}
			}
		}
		return v;
	}

}


