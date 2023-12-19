/*
 * Stat.java
 * Author:  Melissa Neff 
 * Submission Date:  11/5/2021
 *
 * Purpose: The purpose of the program is to compute and display the
 * values for min, max, average, and mode for a set of data.
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


public class Stat {
//Creates a double array:
	private double data[];
	public Stat() {
		data = new double[1];
		data[0] = 0.0;
	}
	//Creates a Stat object:
	public Stat(double d[]) {
		double[] newArray = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		data = newArray;
	}
	//Retrieves values of data:
	public double[] getData() {
		double[] newArray = new double[data.length];
		for(int i = 0; i < data.length; i++) {
			newArray[i] = data [i];
		}
		return newArray;
	}
	//Sets values of data array:
	public void setData(double[] d) {
		double[] newArray = new double[d.length];
		for(int i = 0; i < d.length; i++) {
			newArray[i] = d[i];
		}
		data = newArray;
	}
	//Returns true if both Stat objects have the same values, otherwise returns false:
	public boolean equals(Stat s) {
		double sdata[] = s.getData();
		if(data.length != sdata.length)
			return false;
		for(int i = 0; i < data.length; i++) {
			if(data[i] != sdata[i])
				return false;
		}
			return true;
			}
	
		//Returns a string representation of data in the Stat object:
	public String toString() {
		String arrayData = "";
		for(int i = 0; i < data.length; i++) {
			if(i == data.length - 1)
				arrayData += data[i];
			else
				arrayData += data[i] + ", ";
		}
		return "[" + arrayData + "]";
	}
	//Calculates the minimum value from a set of data:
	public double min() {
		double min = data[0];
		for(int i = 1; i < data.length; i++) {
			if(data[i] < min)
				min = data[i];
		}
		return min;
	}
	//Calculates the maximum values from a set o data:
	public double max() {
		double max = data[0];
		for(int i = 1; i < data.length; i++) {
			if(data[i] > max)
				max = data[i];
		}
		return max;
	}
	//Calculates the average value from a set of data:
	public double average() {
		double sum = 0.0;
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum / data.length;
	}
	
	//Calculates the mode from a set of data:
	public double mode() {
		double maxNumber = 0.0;
		int maxNumberCount = 0;
		for(int i = 0; i < data.length; i++) {
			int numberCount = 0;
			for(int j = 0; j < data.length; j++)
			if(data[i] == data[j]) {
				numberCount++;
		}
			
		 if (numberCount > maxNumberCount) {
				maxNumberCount = numberCount;
				maxNumber = data[i];
			}
		}

		double maxNumber2 = 0.0;
		int maxNumberCount2 = 0;
		for(int a = data.length - 1; a >= 0; a--) {
			int anotherNumberCount = 0;
				for(int b = data.length - 1; b >= 0; b--)
					if(data[a] == data[b]) {
						anotherNumberCount++;
					}
		if (anotherNumberCount > maxNumberCount2) {
			maxNumberCount2 = anotherNumberCount;
			maxNumber2 = data[a];
		}
	}
		
		if(maxNumber2 != maxNumber) {
			return Double.NaN;
		}
		
	  if(maxNumberCount > 1) {
		return maxNumber;
	  } 
	  else if(maxNumber == 0) {
			return 0.0;
		}
	  else {
		return Double.NaN;
	  }

		
	}

	
	public static void main(String[] args) {
		//The following are example main methods for testing:
		//Example 1:
		/*
		double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9};
		double[] data2 = {100.34, 50.01, 50.01, -8};
		Stat stat1 = new Stat();
		
		System.out.println("stat1 data = " + stat1.toString());
		
		stat1 = new Stat(data);
		
		System.out.println("stat1 has been altered.");
		System.out.println("stat1 data = " + stat1.toString());
		
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode() + "\n");
		
		Stat stat2 = new Stat();
		stat2.setData(data2);
		Stat stat3 = new Stat(stat1.getData());
		
		System.out.println("stat2 data = " + stat2.toString());
		System.out.println("stat3 data = " + stat3.toString());
		System.out.println();
		System.out.println("stat1 is equal to stat2 using \"equals()\"? " + stat1.equals(stat2));
		System.out.println("stat1 is equal to stat3 using \"equals()\"? " + stat1.equals(stat3));
		System.out.println("stat1 is equal to stat3 using \"==\"? " + (stat1 == stat3));
		*/
		
		//Example 2:
		/*double[] data = {10.0, 20.0, 30.0};
		Stat stat1 = new Stat(data);
		
		data[0] = 100.0;
		data[1] = 200.0;
		data[2] = 300.0;
		
		Stat stat2 = new Stat(data);
		
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat2 data = " + stat2.toString());
		System.out.println("The two arrays should be different");
		*/
		
		//Example 3:
		/*double[] data1 = {10.0, 20.0, 30.0};
		Stat stat1 = new Stat(data1);
		
		double[] data2 = stat1.getData();
		
		System.out.println("The arrays are identical: " + (data1 == data2));
		*/
		
		//Example 4:
		/*double[] data1 = {10.0, 20.0, 30.0};
		Stat stat1 = new Stat();
		stat1.setData(data1);
		Stat stat2 = new Stat(data1);
		double[] data2 = stat1.getData();
		
		System.out.println("The arrays are identical: " + (data1 == data2));
		System.out.println("stat2 equals stat1: " + stat2.equals(stat1));
		System.out.println("stat1 equals stat2: " + stat2.equals(stat1));
		*/
		
		//Example 5:
		/*Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " +stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 data = " + stat1.toString());
		*/
		
		//Example 6:
		/*double[] data = {1,2,2,3,3,4};
		Stat stat1 = new Stat(data);
		
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 data = " + stat1.toString());
		*/

		//Example 7:
		
		double[] data = {-10, 5, 10, 0, 10, -7};
		double[] data2 = {2, 4, 6, 8, 10, 12};
		Stat stat3 = new Stat();
		stat3 = new Stat(data);
		Stat stat4 = new Stat();
		stat4 = new Stat(data2);
		System.out.println();
		System.out.println("stat3 data = " + stat3.toString());	
		System.out.println("stat3 min = " + stat3.min());
		System.out.println("stat3 max = " + stat3.max());
		System.out.println("stat3 average = " + stat3.average());
		System.out.println("stat3 mode = " + stat3.mode() + "\n");
		
		System.out.println("stat4 data = " + stat4.toString());
		System.out.println();
		System.out.println("stat3 is equal to stat4 using \"equals()\"? " + stat3.equals(stat4));
		
	}
}


