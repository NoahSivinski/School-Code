/*
 * [Stat].java
 * Author:  [Hriddhiman Dey] 
 * Submission Date:  [4/10/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * Program uses arrays, for and if loops to find the max, min,
 * mode, average, using the Stat class. 
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

	private double data[];
	public Stat() {
		data = new double [1];
		data[0]=0.0;
	}

	//stat
	public Stat(double[] d) {
		double[] newStat= new double[d.length];
		for(int i = 0; i < d.length; i++) {
			newStat[i]=d[i];
		}
		data = newStat;
	}

	//getdata
	public double[] getData() {
		double[] dataCopy = new double [data.length];
		for(int i = 0; i< data.length; i++) {
			dataCopy[i]=data[i];
		}
		return dataCopy;
	}


	//setdata
	public void setData(double [] d) {
		double [] sData = new double [d.length];
		for (int i = 0; i <d.length; i++) {
			sData[i]=d[i];
		}
		data = sData;
	}

	//equals
	public boolean equals(Stat s) {
		double sdata[] = s.getData();
		if (data.length != sdata.length)
			return false;
		for (int i = 0; i < data.length; i++) {
			if (data [i] != sdata[i])
				return false;
		}
		return true;
	}

	//toString
	public String toString() {
		String arrayString = "";
		for (int i = 0; i < data.length; i++) {
			if (i == data.length - 1)
				arrayString += data[i];
			else
				arrayString += data[i] + ", ";
		}
		return "[" + arrayString + "]";
	}

	//min
	public double min() {
		double min = data [0];
		for(int i = 1; i < data.length; i++) {
			if(data[i] < min)
				min=data[i];
		}
		return min;
	}

	//max
	public double max() {
		double max = data [0];
		for(int i = 1; i < data.length; i++) {
			if (data [i] > max)
				max = data[i];
		}
		return max;
	}

	//average
	public double average() {
		double sum = 0.0;
		for(int i=0;i<data.length;i++) {
			sum+=data[i];
		}
		return sum / data.length;
	}

	//mode
	public double mode() {
		// variables
		double mode = 0.0 /0; // default mode is NaN meaning it doesn't have one mode
		double oneMode = 0.0/ 0;
		int index = 0;
		int secondIndex = 0;
		int count = 0;
		int modeCount = 0;
		int previousCount = 2;

		// there's two loops that loop through each value of the array comparing it with another
		for (int i = 0; i < data.length; i++, index++)

			for (int j = 0; j < data.length; j++, secondIndex++) {
				// if the first value being measured is the same as the second value then the following code runs
				if (data[index] - data[secondIndex] == 0) {
					count++; // the number of times the first number being compared matches the second one increases

					// if the number of times is greater than any previous amount then that becomes the new mode
					if (count > previousCount) {
						modeCount = 0;
						oneMode = data[index];
						modeCount++;
						previousCount = count;
					}
				}  
				// once the array has been cycled through once, the index and count are reset    
				if (secondIndex == data.length - 1) {
					secondIndex = 0;
					count = 0;
				}
			}
		// if the number of modes is not greater than one then mode's value is changed
		if (modeCount <= 1) {
			mode = oneMode;
		}
		return mode;
	}
}
