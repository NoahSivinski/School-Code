/*
* Stat.java
* Author: Connor Malloch
* Submission Date: April 10 2021
*
* Purpose: This program finds the max,min,average, and other pieces of data from a double array
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
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/
public class Stat {
	
	private double[] data;
	

	public Stat() {
		data = new double[0];
		}
	
	public Stat(double[] d) {
		if (d == null) {
			data = new double[0];
			return;
		}
		data = new double[d.length];
		for (int i = 0; i< d.length; i++) {
			data[i] = d[i];
			}
	}
	
	
	public Stat(float[] f) {
		if (f == null) {
			data = new double[0];
			return;
		}
		data = new double[f.length];
		for (int i = 0; i< f.length; i++) {
			data[i] = f[i];
			}
		
	}
	

	public Stat(int[] i) {
		if (i == null) {
			data = new double[0];
			return;
		}
		data = new double[i.length];
		for (int index = 0; index< i.length; index++) {
			data[index] = i[index];
			}
		
	}
	
	
	public Stat(long[] lo) {
		if (lo == null) {
			data = new double[0];
			return;
		}
		data = new double[lo.length];
		for (int index = 0; index< lo.length; index++) {
			data[index] = lo[index];
			}
	}
	
	public double[] getData() {
		double[] dataCopy = new double[this.data.length];
		for (int i = 0; i < this.data.length; i++) {
			dataCopy[i] = this.data[i];
			}
		return dataCopy;
	}
	
	
	public void setData(double[] d) {
		if (d == null) {
			double[] dataCopy = new double[0];
			data = dataCopy;
			return;
		}
		double[] dataCopy = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dataCopy[i] = d[i];
			}
		data = dataCopy;
	}
	
	
	public void setData(float[] f) {
		if (f == null) {
			double[] dataCopy = new double[0];
			data = dataCopy;
			return;
		}
		double[] dataCopy = new double[f.length];
		for (int i = 0; i < f.length; i++) {
			dataCopy[i] = f[i];
			}
		data = dataCopy;
	}
	
	public void setData(int[] i) {
		if (i == null) {
			double[] dataCopy = new double[0];
			data = dataCopy;
			return;
		}
		double[] dataCopy = new double[i.length];
		for (int index = 0; index < i.length; index++) {
			dataCopy[index] = i[index];
			}
		data = dataCopy;
	}
	
	
	public void setData(long[] lo) {
		if (lo == null) {
			double[] dataCopy = new double[0];
			data = dataCopy;
			return;
		}
		double[] dataCopy = new double[lo.length];
		for (int i = 0; i < lo.length; i++) {
			dataCopy[i] = lo[i];
			}
		data = dataCopy;
	}
	
	public boolean equals(Stat s) {
		boolean comparison = false;
		if (null == s)
			return false;
		for (int i = 0; i < s.getData().length ; i++) {
			if ( Math.abs((s.getData()[i] - getData()[i])) < .0001) {
				comparison = true;
			} else {
				return false;
			}	
		}
		return comparison;
	}
	
	
	public void reset() {
		data = new double[0];
	}
	
	
	public void append(int[] i) {
		if (null == i || i.length == 0) {
			return;
		}
		double[] dataCopy = new double[data.length + i.length];
		for (int index = 0; index < (data.length + i.length); index++) {
			while (index < data.length) {
				dataCopy[index] = data[index];
				index++;
			}
			dataCopy[index] = i[index-data.length];
		}
		data = dataCopy;	
	}
	
	
	public void append(double[] d) {
		
		if (null == d || d.length == 0) {
			return;
		}
		double[] dataCopy = new double[data.length + d.length];
		for (int index = 0; index < (data.length + d.length); index++) {
			while (index < data.length) {
				dataCopy[index] = data[index];
				index++;
			}
			if (index < data.length + d.length)
			dataCopy[index] = d[index-data.length];
		}
		data = dataCopy;
	}
	
	
	public void append(long[] lo) {
		if (null == lo || lo.length == 0) {
			return;
		}
		double[] dataCopy = new double[data.length + lo.length];
		for (int index = 0; index < (data.length + lo.length); index++) {
			while (index < data.length) {
				dataCopy[index] = data[index];
				index++;
			}
			dataCopy[index] = lo[index-data.length];
		}
		data = dataCopy;
	}
	
	public void append(float[] f) {
		if (null == f || f.length == 0) {
			return;
		}
		double[] dataCopy = new double[data.length + f.length];
		for (int index = 0; index < (data.length + f.length); index++) {
			while (index < data.length) {
				dataCopy[index] = data[index];
				index++;
			}
			dataCopy[index] = f[index-data.length];
		}
		data = dataCopy;
	}
	
	
	public String toString() {
		String s = "";
		for (int i = 0; i < getData().length; i++) {
			s = s + getData()[i];
			if (!(getData().length == i+1)) {
				s = s + ", ";
			}
		}
		s = "[" + s + "]";
		return s;
	}
	
	
	public boolean isEmpty() {
		if (getData().length == 0) {
			return true;
		} else
			return false;
	}
	
	public double min() {
		if (getData().length == 0) {
			return Double.NaN;
		}
		double minValue = getData()[0];
		for(int i = 0; i < getData().length; i++) {
			if (minValue > getData()[i]) {
				minValue = getData()[i];
			}
		}
		return minValue;
	}
	
	
	public double max() {
		if (getData().length == 0) {
			return Double.NaN;
		}
		double maxValue = getData()[0];
		for(int i = 0; i < getData().length; i++) {
			if (maxValue < getData()[i]) {
				maxValue = getData()[i];
			}
		}
		return maxValue;
	}
	
	public double average() {
		if (getData().length == 0) {
			return Double.NaN;
		}
		double average = 0;
		for (int i = 0; i < getData().length; i++) {
			average = average + getData()[i];
		}
		average = average/getData().length;
		return average;
	}
	
	
	public double mode() {
		if (getData().length == 0) {
			return Double.NaN;
		}
		double maxValue = 0;
		double maxCount = 0;
		for (int i = 0; i < getData().length; i++) {
			int numTimes = 0;
			for (int index = 0; index < getData().length; index++) {
				if (Math.abs(getData()[i] 
					- getData()[index]) < .0001) {
					numTimes++ ;
					}
			}
				if ( numTimes > maxCount) {
					maxCount = numTimes;
					maxValue = getData()[i];
					} else if( numTimes == maxCount) {
						if (Math.abs(maxValue - getData()[i]) < .0001) {	
							} else 
								maxValue = Double.NaN;
						}
			}
		return maxValue;
	 }
	
	
	public double variance() {
		if (getData().length == 0) {
			return Double.NaN;
		}
		double var = 0;
		double thisVar = 0;
		for (int index = 0; index < getData().length; index++) {
			thisVar = getData()[index] - average();
			thisVar = Math.pow(thisVar,2);
			var = thisVar + var;
		}
		var = var/getData().length;
		return var;
	}
	
	public double standardDeviation() {
		if (getData().length == 0) {
			return Double.NaN;
		}
		return Math.sqrt(variance());
	}
	public static void main(String[] args) {
		double[] data1 = {50.0, 60.0};
		float[]	data2 =	{70.0F,	80.0F};
		int[] data3	= {90, 100};
		long[] data4 = {100L, 110L};
		Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString());
		stat1.append(data1);
		System.out.println("stat1 data = " + stat1.toString());
		stat1.append(data2);
		System.out.println("stat1 data = " + stat1.toString());
		stat1.append(data3);
		System.out.println("stat1 data = " + stat1.toString());
		stat1.append(data4);
		System.out.println("stat1 data = " + stat1.toString());
		data1 = null;
		stat1.append(data1);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " +	stat1.min());
		System.out.println("stat1 max = " +	stat1.max());
		System.out.println("stat1 average =	" +	stat1.average());
		System.out.println("stat1 mode = " +	stat1.mode());
		System.out.println("stat1 variance	= " +	stat1.variance());
		System.out.println("stat1 standard deviation = " +	stat1.standardDeviation()	+	"\n");
	}
}
