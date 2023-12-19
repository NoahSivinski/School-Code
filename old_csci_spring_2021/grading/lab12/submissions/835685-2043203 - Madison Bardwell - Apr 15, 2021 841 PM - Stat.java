/* Stat.java
 * Author: Madison Bardwell 
 * Submission Date: 4/16/21
 *
 * Purpose: This program practices defining classes and works with the knowledge of UMLs and builds on the previous lab
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

public class Stat

{
	// data member
	private double[] data;

	// default constructor
	public Stat() {
		data = new double[0];
	}

	// other constructor
	public Stat(double[] d) {
		if (d == null)
			data = null;
		else {
			data = new double[d.length];
			for (int i = 0; i < d.length; i++)
				data[i] = d[i];
		}
	}

	// other constructor
	public Stat(float[] f) {
		if (f == null)
			data = null;
		else {
			data = new double[f.length];
			for (int i = 0; i < f.length; i++)
				data[i] = f[i];
		}
	}

	// other constructor
	public Stat(int[] i) {
		if (i == null)
			data = null;
		else {
			data = new double[i.length];
			for (int j = 0; j < i.length; j++)
				data[j] = i[j];
		}
	}

	// other constructor
	public Stat(long[] lo) {
		if (lo == null)
			data = null;
		else {
			data = new double[lo.length];
			for (int i = 0; i < lo.length; i++)
				data[i] = lo[i];
		}
	}

	// setData method
	public void setData(float[] f) {
		if (f == null)
			data = null;
		else {
			data = new double[f.length];
			for (int i = 0; i < f.length; i++)
				data[i] = f[i];
		}
	}

	// setData method
	public void setData(double[] d) {
		if (d == null)
			data = null;
		else {
			data = new double[d.length];
			for (int i = 0; i < d.length; i++)
				data[i] = d[i];
		}
	}

	// setData method
	public void setData(int[] i) {
		if (i == null)
			data = null;
		else {
			data = new double[i.length];
			for (int j = 0; j < i.length; j++)
				data[j] = i[j];
		}
	}

	// setData method
	public void setData(long[] lo) {
		if (lo == null)
			data = null;
		else {
			data = new double[lo.length];
			for (int i = 0; i < lo.length; i++)
				data[i] = lo[i];
		}
	}

	// getData method
	public double[] getData() {
		double tmp[] = new double[data.length];
		for (int i = 0; i < data.length; i++)
			tmp[i] = data[i];
		return tmp;
	}

	// equals method
	public boolean equals(Stat s) {
		if (s == null)
			return false;

		if (data.length != s.data.length)
			return false;

		for (int i = 0; i < s.data.length; i++) {
			if (data[i] != s.data[i])
				return false;
		}
		return true;
	}

	// reset method
	public void reset() {
		double tmp[] = new double[0];
		data = tmp;
	}

	// append method
	public void append(double[] d) {
		if (d == null)
			return;

		double tmp[] = new double[data.length + d.length];

		for (int j = 0; j < data.length; j++) {
			tmp[j] = data[j];
		}
		for (int j = 0; j < d.length; j++) {
			tmp[data.length + j] = d[j];
		}
		data = tmp;
	}

	// append method
	public void append(int[] i) {
		if (i == null)
			return;

		double tmp[] = new double[data.length + i.length];

		for (int j = 0; j < data.length; j++) {
			tmp[j] = data[j];
		}
		for (int j = 0; j < i.length; j++) {
			tmp[data.length + j] = i[j];
		}
		data = tmp;
	}

	// append method
	public void append(long[] lo) {
		if (lo == null)
			return;

		double tmp[] = new double[data.length + lo.length];

		for (int j = 0; j < data.length; j++) {
			tmp[j] = data[j];
		}
		for (int j = 0; j < lo.length; j++) {
			tmp[data.length + j] = lo[j];
		}
		data = tmp;
	}

	// append method
	public void append(float[] f) {
		if (f == null)
			return;

		double tmp[] = new double[data.length + f.length];

		for (int j = 0; j < data.length; j++) {
			tmp[j] = data[j];
		}
		for (int j = 0; j < f.length; j++) {
			tmp[data.length + j] = f[j];
		}
		data = tmp;
	}

	// isEmpty method
	public boolean isEmpty() {
		if (data.length == 0)
			return true;
		return false;
	}

	// toString method
	public String toString() {
		if (isEmpty())
			return "[]";
		String s = "[";
		for (int i = 0; i < data.length; i++) {
			s = s + data[i] + " ";
		}
		s = s.trim() + "]";
		return s;
	}

	// min method
	public double min() {
		if (isEmpty())
			return Double.NaN;

		double mn = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < mn)
				mn = data[i];
		}
		return mn;
	}

	// max method
	public double max() {
		if (isEmpty())
			return Double.NaN;

		double mx = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > mx)
				mx = data[i];
		}
		return mx;
	}

	// average method
	public double average() {
		if (isEmpty())
			return Double.NaN;

		double sum = 0;
		for (int i = 1; i < data.length; i++) {
			sum = sum + data[i];
		}
		return sum / data.length;
	}

	// mode method
	public double mode() {
		if (isEmpty())
			return Double.NaN;

		int mx = 0;
		double val = data[0];
		for (int i = 0; i < data.length; i++) {
			int k = occursNumberOfTimes(data[i]);
			if (k > mx) {
				mx = k;
				val = data[i];
			}
		}
		return val;
	}

	// occursNumberOfTimes method
	private int occursNumberOfTimes(double value) {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value)
				count++;
		}
		return count;
	}

	// variance method
	public double variance() {
		if (isEmpty())
			return Double.NaN;

		double avg = average();
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = sum + (data[i] - avg) * (data[i] - avg);
		}
		return sum / data.length;
	}

	// standardDeviation method
	public double standardDeviation() {
		if (isEmpty())
			return Double.NaN;

		return Math.sqrt(variance());
	}

	public static void main(String[] args) {
		double[] data1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Stat stat1 = new Stat(data1);
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation());
		System.out.println("stat1 is empty = " + stat1.isEmpty() + "\n");
		stat1.reset();
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation());
		System.out.println("stat1 is empty = " + stat1.isEmpty() + "\n");
	}
}
