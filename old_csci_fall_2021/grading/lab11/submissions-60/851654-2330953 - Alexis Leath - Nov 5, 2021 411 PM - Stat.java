/*
 * Stat.java
 * Author:  Alexis Leath
 * Submission Date:  11/05/2021
 *
 * Purpose: This program stores an array of data and computes the maximum, minimum,mode
 *  average, variance and  standard deviation of the data set inside the array.
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

	public Stat() {
		data = new double[0];

	}

	// create a double array of the same length as d and holding copies of the
	// values of d.
	public Stat(double[] d) {
		double dd[] = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dd[i] = d[i];
		}
		this.data = dd;
	}

	public Stat(float[] f) {
		double dd[] = new double[f.length];
		for (int i = 0; i < f.length; i++) {
			dd[i] = (double) (f[i]);
		}
		this.data = dd;
	}

	public Stat(int[] i) {
		double dd[] = new double[i.length];
		for (int j = 0; j < i.length; j++) {
			dd[j] = (double) (i[j]);
		}
		this.data = dd;
	}

	public Stat(long[] f) {
		double dd[] = new double[f.length];
		for (int i = 0; i < f.length; i++) {
			dd[i] = (double) (f[i]);
		}
		this.data = dd;
	}

	// create a new array containing exactly the values contained in data.
	public double[] getData() {
		double d[] = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			d[i] = data[i];
		}
		return d;
	}

	// create a new array containing exactly the elements of d and assign to
	// data a reference to this new array
	public void setData(double[] d) {
		try {
			double dd[] = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				dd[i] = d[i];
			}
			this.data = dd;
		} catch (NullPointerException e) {
			this.data = new double[0];// if the entered value is null create an empty array
		}
	}

	public void setData(float[] d) {
		double dd[] = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dd[i] = (double) d[i];
		}
		this.data = dd;
	}

	public void setData(int[] d) {
		double dd[] = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dd[i] = (double) d[i];
		}
		this.data = dd;
	}

	public void setData(long[] d) {
		double dd[] = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			dd[i] = (double) d[i];
		}
		this.data = dd;
	}

	// Returns the boolean value true if the data objects of both the calling
	// Stat object and the passed Stat object s have the same values.
	public boolean equals(Stat s) {
		boolean result = true;
		try {
			if (s.data.length == this.data.length) {
				for (int i = 0; i < s.data.length; i++) {
					if (s.data[i] != this.data[i]) {
						return false;

					}
				}
			} else {
				return false;
			}
			return result;
		} catch (NullPointerException e) {
			return false;// if entered value is null then return false
		}
	}

	public void reset() {

		double da[] = new double[0];

		this.data = da;
	}

	public void append(double[] d) {
		try {
			if (d.length > 0) {
				int arcount = 0;
				int len = this.data.length + d.length;
				double[] res = new double[len];
				for (int i = 0; i < data.length; i++) {
					res[i] = this.data[i];
				}

				for (int i = data.length; i < len; i++) {

					res[i] = d[arcount];
					arcount++;
				}
				this.data = res;
			}
		} catch (NullPointerException e) {
			// if entered value is null do nothing
		}
	}

	public void append(float[] d) {
		if (d.length > 0) {
			int arcount = 0;
			int len = this.data.length + d.length;
			double[] res = new double[len];
			for (int i = 0; i < data.length; i++) {
				res[i] = this.data[i];
			}

			for (int i = data.length; i < len; i++) {

				res[i] = Double.valueOf(d[arcount]);
				arcount++;
			}
			this.data = res;
		}
	}

	public void append(int[] d) {
		if (d.length > 0) {
			int arcount = 0;
			int len = this.data.length + d.length;
			double[] res = new double[len];
			for (int i = 0; i < data.length; i++) {
				res[i] = this.data[i];
			}

			for (int i = data.length; i < len; i++) {

				res[i] = Double.valueOf(d[arcount]);
				arcount++;
			}
			this.data = res;
		}
	}

	public void append(long[] d) {
		if (d.length > 0) {
			int arcount = 0;
			int len = this.data.length + d.length;
			double[] res = new double[len];
			for (int i = 0; i < data.length; i++) {
				res[i] = this.data[i];
			}

			for (int i = data.length; i < len; i++) {

				res[i] = Double.valueOf(d[arcount]);
				arcount++;
			}
			this.data = res;
		}
	}

	public boolean isEmpty() {

		if (this.data.length == 0)
			return true;

		return false;
	}

	// Returns a String representation of the data elements stored in the Stat
	// object.
	public String toString() {
		String result = "[";
		for (int i = 0; i < this.data.length; i++) {
			result = result + " " + this.data[i];

		}
		return result + "0.0]";
	}

	// Returns the minimum of the data array
	public double min() {
		if (this.data.length > 0) {
			double m = this.data[0];
			for (int i = 0; i < this.data.length; i++) {
				if (m > data[i]) {
					m = data[i];
				}
			}
			return m;
		} else if (this.data.length == 0) {
			return 0.0;
		}
		return 0.0;
	}

	// Returns the maximum of the data array
	public double max() {
		if (this.data.length > 0) {
			double m = this.data[0];
			for (int i = 0; i < this.data.length; i++) {
				if (m < data[i]) {
					m = data[i];
				}
			}
			return m;
		} else if (this.data.length == 0) {
			return 0.0;// if length is zero then return Double.Nan
		}
		return 0.0;// if length is zero then return Double.Nan
	}

	// Returns the average of the data array.
	public double average() {
		double s = 0;
		for (int i = 0; i < this.data.length; i++) {
			s = s + this.data[i];
		}
		return s / this.data.length;// if length is zero then return Double.Nan
	}

	// Returns mode of the data array.
	public double mode() {
		if (this.data.length > 0) {
			int modeCount = 0;
			double modeElement = this.data[0];
			for (int i = 0; i < this.data.length; i++) {
				int numCount = 0;
				double num = data[i];
				for (int j = 0; j < this.data.length; j++) {
					if (data[j] == data[i]) {
						numCount++;
					}
				}
				if (numCount > modeCount) {
					modeCount = numCount;
					modeElement = num;
				}
			}
			return modeElement;
		} else if (this.data.length == 0) {
			return 0.0;// if length is zero then return Double.Nan
		}
		return 0.0;// if length is zero then return Double.Nan
	}

	public int occursNumberOfTimes(double value) {

		int count = 0;
		for (int i = 0; i < this.data.length; i++) {

			if (this.data[i] == value) {
				count++;
			}
		}

		return count;
	}

	public double variance() {

		double average = 0;

		for (int i = 0; i < this.data.length; i++) {

			average = average + this.data[i];
		}

		average = average / this.data.length;

		double var = 0;

		for (int i = 0; i < this.data.length; i++) {

			var = var + Math.pow(this.data[i] - average, 2);
		}

		return var / this.data.length;

	}

	public double standardDeviation() {

		double variance = variance();

		return Math.sqrt(variance);
	}

	public static void main(String[] args) {
		Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 data = " + stat1.toString());

	}
}

