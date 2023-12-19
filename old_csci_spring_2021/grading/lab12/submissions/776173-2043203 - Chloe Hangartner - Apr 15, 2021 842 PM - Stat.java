/*
 * Stat.java
 * Author:  Chloe Hangartner
 * Submission Date: 15 April 2021
 *
 * Purpose: Extension to the previous Stat lab.
 * The Stat class stores an array
 * of double values called data. As indicated
 * by the class diagram, public methods are
 * implemented to compute min, max, mode, and 
 * average.
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


	public Stat(){
		this.data = new double[0];
	}

	public Stat(double[] d){
		setData(d);
	}

	public Stat(float[] f){
		setData(f);
	}

	public Stat(int[] i){
		setData(i);
	}

	public Stat(long[] lo){
		setData(lo);
	}


	public void setData(float[] f){
		if(f!=null){
			double[] copyData2 = new double[f.length];
			for(int count=0;count<f.length;count++){
				copyData2[count] = f[count];
			}
			this.data = copyData2;
		}
		else{
			this.data=new double[0];

		}
	}

	public void setData(double[] d) {
		if (d != null) {
			double[] dataCopy2 = new double[d.length];
			for (int count=0; count < d.length; count++) {
			}
			this.data = dataCopy2;
		}
		else {
			this.data = new double[0];
		}
	}

	public void setData(int[] i){
		if(i!=null){
			double[] copyData2 = new double[i.length];
			for(int count=0;count<i.length;count++){
				copyData2[count] = i[count];
			}
			this.data = copyData2;
		}
		else{
			this.data=new double[0];

		}
	}
	public void setData(long[] lo){
		if(lo!=null){
			double[] copyData2 = new double[lo.length];
			for(int count=0;count<lo.length;count++){
				copyData2[count] = lo[count];
			}
			this.data = copyData2;
		}
		else{
			this.data=new double[0];

		}
	}


	public double[] getData() {
		double[] dataCopy = new double[this.data.length];

		for (int count=0; count < this.data.length; count++) {
			dataCopy[count] = this.data[count];
		}
		return dataCopy;
	}



	public boolean equals(Stat s){
		if(s ==  null) {
			return false;
		}

		double[] array2 = s.getData();
		if (this.data.length == array2.length){
			for(int count=0; count < this.data.length; count++){
				if(this.data[count]==array2[count]){
					if(count == this.data.length-1){
						return true;
					}
				}
				else{
					return false;
				}
			}
		}
		return false;
	}


	public void reset(){
		double[] r = new double[0];
		this.data = r;
	}

	public void append(int[] i){
		if(i!=null){
			double[] r = new double[this.data.length+i.length];
			for(int count=0;count<this.data.length;count++){
				r[count] = this.data[count];
			}
			for(int count=0;count<i.length;count++){
				r[count+this.data.length] = i[count];
			}
			this.data = r;
		}
		else{

		}
	}

	public void append(float[] f){
		if(f!=null){
			double[] r = new double[this.data.length+f.length];
			for(int count=0;count<this.data.length;count++){
				r[count] = this.data[count];
			}
			for(int count=0;count<f.length;count++){
				r[count+this.data.length] = f[count];
			}
			this.data = r;
		}
		else{

		}
	}

	public void append(long[] lo){
		if(lo!=null){
			double[] r = new double[this.data.length+lo.length];
			for(int count=0;count<this.data.length;count++){
				r[count] = this.data[count];
			}
			for(int count=0;count<lo.length;count++){
				r[count+this.data.length] = lo[count];
			}
			this.data = r;
		}
		else{

		}
	}

	public void append(double[] d){
		if(d!=null){
			double[] r = new double[this.data.length+d.length];
			for(int count=0;count<this.data.length;count++){
				r[count] = this.data[count];
			}
			for(int count=0;count<d.length;count++){
				r[count+this.data.length] = d[count];
			}
			this.data = r;
		}
		else{

		}
	}

	public boolean isEmpty(){
		if(this.data.length == 0){
			return true;
		}
		else{
			return false;
		}
	}


	public String toString() {
		String arrayString = "";
		for (int count=0;count < this.data.length;count++) {
			arrayString = arrayString+this.data[count]+" ";
		}
		return arrayString;
	}


	public double min() {
		if(this.data.length == 0){
			return Double.NaN;
		}
		double minimum = this.data[0];
		for(int count=0; count < this.data.length; count++){

			if(this.data[count] < minimum){
				minimum = this.data[count];
			}
		}
		return minimum;
	}


	public double max() {
		if(this.data.length == 0) {
			return Double.NaN;
		}

		double maximum = this.data[0];
		for(int count=0; count < this.data.length; count++){

			if(this.data[count]>maximum){
				maximum = this.data[count];
			}
		}
		return maximum;
	}

	public double average(){

		if(this.data.length == 0) {
			return Double.NaN;
		}

		double numerator = 0;
		for(int count = 0; count < this.data.length; count++){
			numerator = numerator + this.data[count];
		}
		double average = numerator/this.data.length;
		return average;
	}


	public double mode(){
		if(this.data.length == 0){
			return Double.NaN;
		}
		else {
			int mode = 0, maxCount = 0;
			for (int i = 0; i < this.data.length; ++i) {
				int count = 0;
				for (int j=0; j < this.data.length; ++j) {
					if (this.data[j] == this.data[i])
						++count;
				}
				if (count>maxCount) {
					maxCount = count;
					mode = (int) this.data[i];
				}

			}
			return mode;
		}
	}


	public double variance(){
		if(this.isEmpty()){
			return Double.NaN;
		}
		double sum = 0;
		for(int count=0;count<this.data.length;count++){
			double distance = Math.pow((this.data[count] - this.average()), 2);
			sum = sum + distance;
		}
		return sum/this.data.length;
	}


	public double standardDeviation(){
		if(this.isEmpty()){
			return Double.NaN;
		}
		double sD = Math.sqrt(this.variance());
		return  sD;
	}
}



