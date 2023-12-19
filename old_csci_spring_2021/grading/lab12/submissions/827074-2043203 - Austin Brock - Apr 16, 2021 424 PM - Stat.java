/*
 * [Austin Brock].java
 * Author:  [Your name here] 
 * Submission Date:  [4/16/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
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

	public static void main(String[] args) {

	}

	public Stat() {
		data = new double[] { 0.0 };
	}

	public Stat(double[] d) {
		if (d != null) {

			double dd[] = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				dd[i] = d[i];
			}
			this.data = dd;
		} else {
			double[] dd = {};
			data = dd;
		}
	}

	public Stat(float[] f) {
		if (f != null) {
			double ff[] = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				ff[i] = f[i];
			}
			this.data = ff;
		} else {
			double[] ff = {};
			data = ff;
		}
	}

	public Stat(int[] i) {
		if (i != null) {
			double ii[] = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				ii[j] = i[j];

			}
			this.data = ii;
		} else {
			double[] ii = {};
			data = ii;
		}
	}

	public Stat(long[] lo) {
		if (lo != null) {
			double lolo[] = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				lolo[i] = lo[i];
			}
			this.data = lolo;
		} else {
			double[] lolo = {};
			data = lolo;
		}

	}

	public void setData(float[] f) {
		if (f != null) {

			double ff[] = new double[f.length];
			for (int i = 0; i < f.length; i++) {
				ff[i] = f[i];
			}
			this.data = ff;
		} else {
			double[] ff = {};
			data = ff;
		}

	}

	public void setData(double[] d) {
		if (d != null) {
			double dd[] = new double[d.length];
			for (int i = 0; i < d.length; i++) {
				dd[i] = d[i];
			}
			this.data = dd;
		} else {
			double[] dd = {};
			data = dd;
		}
	}

	public void setData(int[] i) {
		if (i != null) {
			double ii[] = new double[i.length];
			for (int j = 0; j < i.length; j++) {
				ii[j] = i[j];

			}
			this.data = ii;
		} else {
			double[] ii = {};
			data = ii;
		}
	}

	public void setData(long[] lo) {
		if (lo != null) {
			double lolo[] = new double[lo.length];
			for (int i = 0; i < lo.length; i++) {
				lolo[i] = lo[i];
			}
			this.data = lolo;
		} else {
			double[] lolo = {};
			data = lolo;
		}
	}

	public double[] getData() {
		double d[] = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			d[i] = data[i];
		}
		return d;
	}

	public boolean equals(Stat s) {
		boolean result = true;
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
	}

	public void reset() {
		double[] data1 = {};
		data = data1;
	}

	public void append(int[] i) {
		if (i == null)
			return;

		double ii[] = new double[data.length + i.length];

		for (int j = 0; j < data.length; j++) {
			ii[j] = data[j];
		}
		for (int k = data.length; k < i.length + data.length; k++) {
			ii[k] = i[k];

		}

		this.data = ii;

	}

	public void append(float[] f) {
		if (f == null)
			return;

		double ff[] = new double[data.length + f.length];

		for (int j = 0; j < data.length; j++) {
			ff[j] = data[j];
		}
		for (int k = data.length; k < f.length + data.length; k++) {
			ff[k] = f[k];

		}

		this.data = ff;
	}

	public void append(long[] lo) {
		if (lo == null)
			return;

		double lolo[] = new double[data.length + lo.length];

		for (int j = 0; j < data.length; j++) {
			lolo[j] = data[j];
		}
		for (int k = data.length; k < lo.length + data.length; k++) {
			lolo[k] = lo[k];

		}

		this.data = lolo;
	}

	public void append(double[] d) {
		if (d == null)
			return;

		double dd[] = new double[data.length + d.length];

		for (int j = 0; j < data.length; j++) {
			dd[j] = data[j];
		}
		for (int k = data.length; k < d.length + data.length; k++) {
			dd[k] = d[k];

		}

		this.data = dd;
	}

	public boolean isEmpty() {
		if (data.length == 0)
			return true;

		else {
			return false;
		}

	}

	public String toString() {
		String result = "data : ";
		for (int i = 0; i < this.data.length; i++) {
			result = result + "  " + this.data[i];
		}
		return result;
	}

	public double min() {
		double m = this.data[0];
		for (int i = 0; i < this.data.length; i++) {
			if (m > data[i]) {
				m = data[i];
			}
		}
		return m;
	}

	public double max() {
		double m = this.data[0];
		for (int i = 0; i < this.data.length; i++) {
			if (m < data[i]) {
				m = data[i];
			}
		}
		return m;
	}

	public double average() {
		double s = 0;
		for (int i = 0; i < this.data.length; i++) {
			s = s + this.data[i];
		}
		return s / this.data.length;
	}

	public double mode() {
		int modCount = 0;
		double modElement = this.data[0];
		for (int i = 0; i < this.data.length; i++) {
			int numCount = 0;
			double num = data[i];
			for (int j = 0; j < this.data.length; j++) {
				if (data[j] == data[i]) {
					numCount++;
				}
			}
			if (numCount > modCount) {
				modCount = numCount;
				modElement = num;
			}
		}
		return modElement;
	}

	
	

	public double variance() {
		double mean = 0.0;
		for (int i = 0; i < data.length; i++) {
			mean += data[i];
		}
		mean /= data.length;

		// The variance
		double variance = 0;
		for (int i = 0; i < data.length; i++) {
			variance += Math.pow(data[i] - mean, 2);
		}
		variance /= data.length;

		return (Double) null;

	}

	public void standardDeviation() {
		// TODO Auto-generated method stub
		
	        double[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	        double SD = calculateSD(numArray);

	        System.out.format("Standard Deviation = %.6f", SD);
	    }

	    public static double calculateSD(double numArray[])
	    {
	        double sum = 0.0, standardDeviation = 0.0;
	        int length = numArray.length;

	        for(double num : numArray) {
	            sum += num;
	        }

	        double mean = sum/length;

	        for(double num: numArray) {
	            standardDeviation += Math.pow(num - mean, 2);
	        }

	        return Math.sqrt(standardDeviation/length);
	    }
	

	}


