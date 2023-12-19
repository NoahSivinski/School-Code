/*
 * [CSCI 1301].java
 * Author:  [Yanlin Chen] 
 * Submission Date:  [11/12/2021]
 *
 * Purpose: Compare double array
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

	private double[] data;

	//default Stat constructor
	public Stat() {
		data = new double[0];
	}
	//Stat double constructor
	public Stat(double[] d){
		if (d == null) {
			double[] emptyArray = {};
			data = emptyArray;
		}
		else {
			double[] newD = new double[d.length];
			for (int index = 0; index < d.length; index++) {
				newD[index] = d[index];
			}
			data = newD;
		}
	}
	//Stat int constructor
	public Stat(int[] i) {
		if (i == null) {
			double[] emptyArray = {};
			data = emptyArray;
		}
		else {
			double[] newI = new double[i.length];
			for (int index = 0; index < i.length; index++) {
				newI[index] = i[index];
			}
			data = newI;
		}
	}
	//Stat long constructor
	public Stat(long[] lo) {
		if (lo == null) {
			double[] emptyArray = {};
			data = emptyArray;
		}
		else {
			double[] newL = new double[lo.length];
			for (int index = 0; index < lo.length; index++) {
				newL[index] = lo[index];
			}
			data = newL;
		}
	}
	//Stat float constructor
	public Stat(float[] f) {
		if (f == null) {
			double[] emptyArray = {};
			data = emptyArray;
		}
		else {
			double[] newF = new double[f.length];
			for (int index = 0; index < f.length; index++) {
				newF[index] = f[index];
			}
			data = newF;
		}
	}
	//set double
	public void setData(double[] d) {
		if (d == null) {
			double[] emptyArray = {};
			data = emptyArray;
		}
		else {
			double[] newD = new double[d.length];
			for (int index = 0; index < d.length; index++) {
				newD[index] = d[index];
			}
			data = newD;
		}
	}
	//set float
	public void setData(float[] f) {
		if (f == null) {
			double[] emptyArray = {};
			data = emptyArray;
		}
		else {
			double[] newF = new double[f.length];
			for (int index = 0; index < f.length; index++) {
				newF[index] = f[index];
			}
			data = newF;
		}
	}
	//set int
	public void setData(int[] i) {
		if (i == null) {
			double[] emptyArray = {};
			data = emptyArray;
		}
		else {
			double[] newI = new double[i.length];
			for (int index = 0; index < i.length; index++) {
				newI[index] = i[index];
			}
			data = newI;
		}
	}
	//set long
	public void setData(long[] lo) {
		if (lo == null) {
			double[] emptyArray = {};
			data = emptyArray;
		}
		else {
			double[] newL = new double[lo.length];
			for (int index = 0; index < lo.length; index++) {
				newL[index] = lo[index];
			}
			data = newL;
		}
	}
	//getData
	public double[] getData(){
		double[] newG = new double[data.length];
		for (int index = 0; index < data.length; index++) {
			newG[index] = data[index];
		}
		return newG;
	}
	//reset 
	public void reset() {
		double[] empty = {};
		data = empty;
	}
	//append double
	public void append(double[] d) {
		if (d != null) {
			int Index = 0;
			int appendIndex = 0;
			boolean elementLeft = true;
			double[] newArray = new double[data.length + d.length];
			while (elementLeft) {
				if (Index < data.length)
					newArray[Index] = data[Index];
				else if ((Index >= data.length) && (Index < newArray.length)) {
					newArray[Index] = d[appendIndex];
					appendIndex ++;
				}
				else
					elementLeft = false;
				Index ++;
			}
			data = newArray;
		}
	}
	//append int
	public void append(int[] i) {
		if (i != null) {
			int Index = 0;
			int appendIndex = 0;
			boolean elementLeft = true;
			double[] newArray = new double[data.length + i.length];
			while (elementLeft) {
				if (Index < data.length)
					newArray[Index] = data[Index];
				else if ((Index >= data.length) && (Index < newArray.length)) {
					newArray[Index] = i[appendIndex];
					appendIndex ++;
				}
				else
					elementLeft = false;
				Index ++;
			}
			data = newArray;
		}
	}
	//append long
	public void append(long[] lo) {
		if (lo != null) {
			int Index = 0;
			int appendIndex = 0;
			boolean elementLeft = true;
			double[] newArray = new double[data.length + lo.length];
			while (elementLeft) {
				if (Index < data.length)
					newArray[Index] = data[Index];
				else if ((Index >= data.length) && (Index < newArray.length)) {
					newArray[Index] = lo[appendIndex];
					appendIndex ++;
				}
				else
					elementLeft = false;
				Index ++;
			}
			data = newArray;
		}
	}
	//append float
	public void append(float[] f) {
		if (f != null) {
			int Index = 0;
			int appendIndex = 0;
			boolean elementLeft = true;
			double[] newArray = new double[data.length + f.length];
			while (elementLeft) {
				if (Index < data.length)
					newArray[Index] = data[Index];
				else if ((Index >= data.length) && (Index < newArray.length)) {
					newArray[Index] = f[appendIndex];
					appendIndex ++;
				}
				else
					elementLeft = false;
				Index ++;
			}
			data = newArray;
		}
	}
	//isEmpty
	public boolean isEmpty() {
		if (data.length == 0)
			return true;
		else
			return false;
	}
	//equals
	public boolean equals(Stat s) {
		if (s == null)
			return false;
		if (data.length != s.data.length)
			return false;
		for (int index = 0; index < s.data.length; index++) {
			if (data[index] != s.data[index])
				return false;
		}
		return true;
	}
	//toString
	public String toString() {
		String s1 = "[";
		for (int index = 0; index <= data.length - 1; index++) {
			if (index < data.length - 1)
				s1 = s1 + data[index] + ", ";
			else if (index == data.length - 1)
				s1 = s1 + data[index];
		}
		s1 = s1 + "]";
		return s1;
	}
	//minimum
	public double min() {
		if (data.length != 0) {
			double min = 0;
			min = data[0];
			for (int index = 0; index <= data.length - 1; index++) {
				if (min > data[index])
					min = data[index];
			}
			return min;
		}
		else 
			return Double.NaN;
	}
	//maximum
	public double max() {
		if (data.length != 0) {
			double max = 0;
			max = data[0];
			for (int index = 0; index <= data.length - 1; index++) {
				if (max < data[index])
					max = data[index];
			}
			return max;
		}
		else 
			return Double.NaN;
	}
	//average
	public double average() {
		if (data.length != 0) {
			double ave = 0;
			double sum = 0;
			for (int index = 0; index <= data.length - 1; index++) {
				sum += data[index];
			}
			ave = sum / data.length;
			return ave;
		}
		return Double.NaN;
	}
	//mode
	public double mode() {
		if (data.length != 0) {
			int currentMax = 0;
			double theNum = 0;
			if (data.length == 1) {
				theNum = data[0];
				return theNum;
			}
			else {
				for (int i = 0; i <= data.length - 1; i++) {
					int count = 0;
					for (int ii = 0; ii <= data.length - 1; ii++) {
						if (data[i] == data[ii]) 
							count++;
					}
					if (currentMax < count) {
						currentMax = count;
						theNum = data[i];
					}
					else if (currentMax == count) {
						if (theNum != data[i])
							theNum = Double.NaN;
					}
					if (currentMax > 1)
						theNum += 0;
					else
						theNum = Double.NaN;
				}
				return theNum;
			}
		}
		else
			return Double.NaN;
	}
	//variance
	public double variance() {
		if (data.length != 0) {
			double length = data.length;
			double mean;
			double sum = 0;
			double sumSquaredVales = 0;
			for (int index = 0; index < data.length; index++) 
				sum = sum + data[index];
			mean = sum / length;
			for (int index = 0; index < data.length; index++) 
				sumSquaredVales = sumSquaredVales + Math.pow((data[index] - mean),2);
			return (sumSquaredVales / length); 
		}
		else
			return Double.NaN;
	}
	//standardDeiation
	public double standardDeviation() {
		if (data.length != 0) {
			double length = data.length;
			double mean;
			double sum = 0;
			double sumSquaredVales = 0;
			for (int index = 0; index < data.length; index++) 
				sum = sum + data[index];
			mean = sum / length;
			for (int index = 0; index < data.length; index++) 
				sumSquaredVales = sumSquaredVales + Math.pow((data[index] - mean),2);
			return Math.sqrt(sumSquaredVales / length);
		}
		else
			return Double.NaN;
	}
}
