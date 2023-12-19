/**
 * Stat.java
 * Author:  Anvita Nagireddi 
 * Submission Date:  Apr-16-2021
 * File name: Stat.java
 *
 * This program does the following:The Stat class stores an array of double values called data. 
 * As indicated by the class diagram, youwill need to implement public methods to compute 
 * the min, max, mode, and average of these values.
 * You will also implement methods to “get” and “set” the values held by data. Importantly, data should
 * be a private instance variable, meaning that each instance of the Stat class should have its own copy of
 * the data variable (each object would store different arrays of double values). 
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
public class Stat{
	double[] data;
	public Stat(){
		data = new double[0];
	}
	
	public Stat(double[] d){
		if(d == null) {
			data = new double[0];
		}
		else {
		data = new double[d.length];
        for (int i = 0; i < data.length; i++)
        	data[i] = d[i];
		}
	}
	
	public Stat(float[] f){
		if(f == null) {
			data = new double[0];
		}
		else {
		data = new double[f.length];
        for (int i = 0; i < data.length; i++)
        	data[i] = f[i];
		}
	}
	
	public Stat(int[] i){
		if(i == null) {
			data = new double[0];
		}
		else {
		data = new double[i.length];
        for (int j = 0; j < data.length; j++)
        	data[j] = i[j];
		}
	}
	
	public Stat(long[] lo){
		if(lo == null) {
			data = new double[0];
		}
		else {
		data = new double[lo.length];
        for (int i = 0; i < data.length; i++)
        	data[i] = lo[i];
		}
	}
	
	public void setData(float[] f){
		if(f == null) {
			data = new double[0];
		}
		else {
		data = new double[f.length];
        for (int i = 0; i < data.length; i++)
        	data[i] = f[i];
		}
	}
	
	//method for setting
		public void setData(double[] d){
			if(d == null) {
				data = new double[0];
			}
			else {
			data = new double[d.length];
	        for (int i = 0; i < data.length; i++)
	        	data[i] = d[i];
			}
		}
	
	public void setData(int[] i){
		if(i == null) {
			data = new double[0];
		}
		else {
		data = new double[i.length];
        for (int j = 0; j < data.length; j++)
        	data[j] = i[j];
		}
	}
	
	public void setData(long[] lo){
		if(lo == null) {
			data = new double[0];
		}
		else {
		data = new double[lo.length];
        for (int i = 0; i < data.length; i++)
        	data[i] = lo[i];
		}
	}
	
	//method for getting
	public double[] getData(){
		double[] tempArray = data;
		return tempArray;
	}
	
	//method for comparing if equal
	public boolean equals(Stat s){
		if(s == null) {
			return false;
		}
		if(data.length != (s.getData()).length) {
			return false;
		}
		for(int i = 0; i < data.length; i++) {
			if(data[i]!=(s.getData())[i]) {
				return false;
			}
		}
		return true;
	}
	
	public void reset(){
		data = new double[0];
	}
	
	public void append(int[] i){
		if(i != null) {
		double[] append = new double[data.length + i.length];
		for (int j = 0; j < data.length; j++) {
        	append[j] = data[j];
		}
		for (int j = 0; j < i.length; j++) {
	    	append[j + data.length] = i[j];
		}
		data = append;
		}
		else {
			data = data;
		}
	}
	
	public void append(float[] f){
		if(f != null) {
		double[] append = new double[data.length + f.length];
		for (int i = 0; i < data.length; i++) {
        	append[i] = data[i];
		}
		for (int j = 0; j < f.length; j++) {
	    	append[j + data.length] = f[j];
		}
		data = append;
		}
	}
	
	public void append(long[] lo){
		if(lo != null) {
		double[] append = new double[data.length + lo.length];
		for (int i = 0; i < data.length; i++) {
        	append[i] = data[i];
		}
		for (int j = 0; j < lo.length; j++) {
	    	append[j + data.length] = lo[j];
		}
		data = append;
		}
	}
	
	public void append(double[] d){
		if(d != null) {
		double[] append = new double[data.length + d.length];
		for (int i = 0; i < data.length; i++) {
        	append[i] = data[i];
		}
		for (int j = 0; j < d.length; j++) {
	    	append[j + data.length] = d[j];
		}
		data = append;
		}
	}
	
	public boolean isEmpty(){
		if(data.length != 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	//method for printing as string
	public String toString(){
		if(data.length != 0) {
			String tempStr = "[";
			for(int i = 0; i < data.length-1;i++) {
			tempStr = tempStr.concat(String.valueOf(data[i]).concat(", "));
			}
			tempStr = tempStr.concat(String.valueOf(data[data.length-1]));
			return tempStr + "]";
		}
		else {
			return "[]";
		}
	}
	
	//method for minimum
	public double min(){
		if(data.length != 0) {
			double min = data[0];
			for(int i = 1; i <= data.length-1;i++) {
				double toCompare = data[i];
				if(min > toCompare) {
					min = toCompare;
				}
			}
			return min;
		}
		else {
			return Double.NaN;
		}
	}
	
	//method for maximum
	public double max(){
		if(data.length != 0) {
		double max = data[0];
		for(int i = 1; i <= data.length-1;i++) {
			double toCompare = data[i];
			if(max < toCompare) {
				max = toCompare;
			}
		}
		return max;
		}
		else {
			return Double.NaN;
		}
	}
	
	//method for average
	public double average(){
		if(data.length != 0) {
		double total = 0.0;
		for(int i = 0; i <= data.length-1;i++) {
			total = total + data[i];
		}
		double average = (total/(data.length));
		return average;
		}
		else {
			return Double.NaN;
		}
	}
	
	//method for mode
	public double mode(){
		if(data.length != 0) {
			double maxValue = 0;
			int maxCount = 0;
			double secondMaxValue = 0;
			int secondMaxCount = 0;
		    for (int i = 0; i < data.length; i++) {
		         int count = 0;
		         for (int j = 0; j < data.length; j++) {
		            if (data[j] == data[i])
		            count++;
		         }
		         if (count > maxCount) {
		            maxCount = count;
		            maxValue = data[i];
		         }
		    }
		    int index = 0;
		    double[] secondArray = new double[data.length - maxCount];
		    for (int k = 0; k < secondArray.length + 1; k++) {
			    if(data[k] != maxValue) {
			    	secondArray[index]= data[k];
			    	index++;
			    }
		    }
		    for (int i = 0; i < secondArray.length; i++) {
		         int count = 0;
		         for (int j = 0; j < secondArray.length; ++j) {
		            if (secondArray[j] == secondArray[i])
		            count++;
		         }
	
		         if (count > secondMaxCount) {
		        	secondMaxCount = count;
		            secondMaxValue = secondArray[i];
		         }
		    }
		    if (maxCount == secondMaxCount) {
		    	return Double.NaN;
		    }
		    if(maxCount == 1) {
		    	return Double.NaN;
		    }
		    else {
		    	return maxValue;
		    }
		} 
		else {
			return Double.NaN;
		}
	}
	
	public int occursNumberOfTimes(double value){
		int counter = 0;
		for(int i = 0; i <= data.length-1;i++) {
			if(value == data[i]) {
				counter ++;
			}
		}
		return counter;
	}
	
	public double variance(){
		if(data.length != 0) {
			double total = 0.0;
			for(int i = 0; i < data.length;i++) {
				total = total + data[i];
			}
			double average = (total/(data.length));
			double variance = 0;
			for(int i = 0; i < data.length;i++) {
				variance = variance + Math.pow((data[i]-average),2);
			}
			variance = variance/data.length;
			return variance;
		}
		else {
			return Double.NaN;
		}
	}
	
	public double standardDeviation(){
		double stanDev = Math.sqrt(variance());
		return stanDev;
	}
}