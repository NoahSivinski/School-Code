/*
 * Stat.java
 * Author:  Allan Waweru
 * Submission Date:  [04/16/2021]
 *
 * Purpose: Implement a class called Stat that is described using a UML 1 class diagram
 * 
 * Statement of Academic Honesty: The following code represents my own work. I have neither
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

	private double[] data;


	public Stat() {
		data = new double[0];
	}

	public Stat(double[] d) {	//Constructs a Stat object using the values held in a double array
		double newD[] = new double[d.length];
		for (int i = 0; i < d.length; i++)	{
			newD[i] = d[i];
		}
		this.data = newD;
	}

	public Stat(float[] f) {	//Constructs a Stat object using the values held in a float array

		if(f==null)
			data =null;
		else
		{
			double newD[] = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				newD[i] = (double)(f[i]);
			}
			this.data = newD;
		}


	}


	public Stat(int[] i) {	//Constructs a Stat object using the values held in an int array

		if(i==null)
			data=null;
		else
		{
			double newD[] = new double[i.length];
			for (int k = 0; k < i.length; k++) {
				newD[k] = (double)(i[k]);
			}
			this.data = newD;
		}


	}

	public Stat(long[] lo) {	//Constructs a Stat object using the values held in a long array
		if(lo==null)
			data=null;
		else
		{
			double newD[] = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				newD[i] = (double)(lo[i]);
			}
			this.data = newD;
		}


	}


	public double[] getData() {		//accessor method used to retrieve the values of data
		double newD[] = new double[data.length];
		for (int i = 0; i < data.length; i++)
			newD[i] = data[i];
		return newD;
	}


	public void setData(double[] d) {	//mutator method used to set the double values of the array
		if(d==null)
			data =null;
		else
		{
			double newD[]= new double[d.length];
			for (int i = 0; i < d.length; i++) {
				newD[i] = d[i];
		}
		this.data = newD;
		}
	}

	public void setData(float[] f) {	//mutator method used to set the float values of the array
		if(f==null)
			data =null;
		else
		{
			double newD[]= new double[f.length];
			for (int i = 0; i < f.length; i++) {
				newD[i] = f[i];
			}
			this.data = newD;
		}
	}

	public void setData(int[] i) {	//mutator method used to set the int values of the array
		if(i==null)
			data =null;
		else
		{
			double newD[]= new double[i.length];
			for (int k = 0; k < i.length; k++) {
				newD[k] = i[k];
			}
			this.data = newD;
		}
	}

	public void setData(long [] lo) {	//mutator method used to set the long values of the array
		if(lo==null)
			data =null;
		else
		{
			double newD[]= new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				newD[i] = lo[i];
			}
			this.data = newD;
		}
	}


	public boolean equals(Stat s) {		// Checks if both data sets have same length
		if(s==null)
	           return false;
		else
		if (s.data.length != data.length)
			return false;
		for (int i = 0; i < data.length; i++)
			if (s.data[i] != data[i])
				return false;
		return true;
	}


	public void reset() {	//clears the data array
		data = new double[0];
	}


	public void append(double[] d) {	//appends float[] to a new double array
		if(d==null)
			return; 
		double newD[] = new double[data.length+d.length];	


		for (int i = 0; i < newD.length; i++) {
			if (i < data.length)
				newD[i] = data[i];
			else
				newD[i] = d[i - data.length];
		}

		data = newD;
	}

	public void append(float[] f){	 //appends float[] to a new double array
		if(f==null)
			return; 

		double newD[] = new double[data.length+f.length];	


		for (int i = 0; i < newD.length; i++) {
			if (i < data.length)
				newD[i] = data[i];
			else
				newD[i] = f[i - data.length];
		}

		data = newD;
	}

	public void append(int[] i) {	//appends int[] to a new double array
		if(i==null)
			return; 

		double newD[] = new double[data.length+i.length];	


		for (int k = 0; k < newD.length; k++) {
			if (k < data.length)
				newD[k] = data[k];
			else
				newD[k] = i[k - data.length];
		}

		data = newD;
	}

	public void append(long[] lo) {		//appends long[] to a new double array
		if(lo ==null)
			return; 

		double newD[] = new double[data.length+lo.length];	


		for (int i = 0; i < newD.length; i++) {
			if (i < data.length)
				newD[i] = data[i];
			else
				newD[i] = lo[i - data.length];
		}

		data = newD;
	}


	public String toString() {	//Returns a String representation of the data elements
		if (isEmpty()) //empty case
			return "[]";
		String result = "[";
		for (int i = 0; i < this.data.length; i++) {
			result += data[i];
			if (i == data.length - 1)
				result += "]";
			else 
				result += ", ";
		}

		return result;
	}


	public boolean isEmpty() {	//return boolean data is empty
	       if(data.length==0)
	           return true;
	       return false;
	   }
	   
	


	public double min() {	//minimum value of the data array
		if (!isEmpty()) {
			double min = data[0];
			for (int i = 0; i < data.length; i++) {
				if (min > data[i])
					min = data[i];
			}

			return min;
		}
		else
			return Double.NaN;
	}


	public double max() { //maximum value of the  array
		if (!isEmpty()) {
			double max = data[0];
			for (int i = 0; i < data.length; i++) {
				if (max < data[i])
					max = data[i];
			}

			return max;
		}
		else 
			return Double.NaN;
	}

	public double average() { 	//return average of the array
		if (!isEmpty()) {
			double sum = 0;
			for (int i = 0; i < data.length; i++) {
				sum += data[i];
			}
			return sum / data.length;
		}
		else
			return Double.NaN;
	}

	public double mode() { //22. return mode of an array
		if (isEmpty()) {
			return Double.NaN;
		}
		else {
			double mode = 0, loop = 1;

			for (int i = 0; i < data.length; i++) {
				int temp = 0;
				for (int j = i; j < data.length; j++) {
					if (Math.abs(data[i] - data[j]) <= 0.001)
						temp++;
				}
				if (temp > loop) {
					mode = data[i];
					loop = temp;
				}
				else if (temp == loop) {
					mode = Double.NaN;
				}
			}


			return mode;

		}
	}



	private int occursNumberOfTimes(double d) { //23. return # of times d appears in data
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == d)
				count++;
		}

		return count;
	}

	public double variance() { //24. return variance of data
		if (!isEmpty()) {
			double distance = 0;

			for (int i = 0; i < data.length; i++)
				distance += Math.pow(data[i] - average(), 2);

			return distance / data.length;
		}
		else
			return Double.NaN;

	}

	public double standardDeviation()
	{
		if(isEmpty())
			return Double.NaN;

		return Math.sqrt(variance());
	}

	
}



