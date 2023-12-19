/*
 * Stat.java
 * Author: Jarvis Williams
 * Submission Date:  4/23/2021
 *
 * Purpose: The purpose of this program is to be able to set and get
 * values for arrays and manipulate them with different methods
 * * Statement of Academic Honesty:
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
	//initializing data array
	private double data[] = {0.0};                                                                  //

	//Constructor to create array with single element (0.0)
	public Stat() {
		double newData [] = {}; //creating aray for copy
		this.data = newData;
	}

	//Stat object to create a double array with the same values
	//of d
	public Stat(double[] d) {
		//if array is null, sets data as empty array
		if (d == null) {
			double[] newArray = {};
			this.data = newArray;
		}
		double[] newArray = new double[d.length]; //create array with length of array d
		this.data = newArray; //copy array
		for (int i = 0; i < data.length; i++) {
			newArray[i] = d[i];
		}
	}
	
	//Stat object to create a float array with the same values
	//of f
	public Stat(float[] f) {
		//if array is null, sets data as empty array
		if (f == null) {
			double[] newArray = {};
			this.data = newArray;
		}
		double[] newArray = new double[f.length]; //create array with length of array f
		this.data = newArray; //copy array
		for (int i = 0; i < data.length; i++) {
			newArray[i] = f[i];
		}
	}
		
	//Stat object to create a int array with the same values
	//of i
	public Stat(int[] i) {
		//if array is null, sets data as empty array
		if (i == null) {
			double[] newArray = {};
			data = newArray;
		}
		double[] newArray = new double[i.length]; //create array with length of array i
		this.data = newArray; //copy array
		for (int d = 0; d < data.length; d++) { //d functions as i
			newArray[d] = i[d];
		}
	}
	
	//Stat object to create a long array with the same values
	//of lo
	public Stat(long[] lo) {
		//if array is null, sets data as empty array
		if (lo == null) {
			double[] newArray = {};
			data = newArray;
		}
		double[] newArray = new double[lo.length]; //create array with length of array lo
		this.data = newArray; //copy array
		for (int i = 0; i < data.length; i++) {
			newArray[i] = lo[i];
		}
	}

	//set the values of the data array (flaot values)
	public void setData(float[] f) {
		//if array is null, sets data as empty array
		if (f == null) {
			double setterArray[] = {};
			data = setterArray;
		}
		double setterArray[] = new double[f.length]; //create array with length of array f
		//loop for getting values 
		int i = 0;
		while (i < f.length) {
			setterArray[i] = f[i];
			i++;
		}
		this.data = setterArray; //sets value for data
	}
	
	//set the values of the data array (double values)
	public void setData(double[] d) {
		//if array is null, sets data as empty array
		if (d == null) {
			double setterArray[] = {};
			data = setterArray;
		} else {
			double setterArray[] = new double[d.length]; //create array with length of array d
			//loop for getting values 
			int i = 0;
			while (i < d.length) {
				setterArray[i] = d[i];
				i++;
			}
			this.data = setterArray; //sets value for data
		}
		
	}
	
	//set the values of the data array (int values)
	public void setData(int[] i) {
		//if array is null, sets data as empty array
		if (i == null) {
			double setterArray[] = {};
			data = setterArray;
		}
		double setterArray[] = new double[i.length]; //create array with length of array i
		//loop for getting values 
		int d = 0; //d functions as i
		while (d < i.length) {
			setterArray[d] = i[d];
			d++;
		}
		this.data = setterArray; //sets value for data
	}
	
	//set the values of the data array (double values)
	public void setData(long[] lo) {
		//if array is null, sets data as empty array
		if (lo == null) {
			double setterArray[] = {};
			data = setterArray;
		}
		double setterArray[] = new double[lo.length]; //create array with length of array lo
		//loop for getting values 
		int i = 0;
		while (i < lo.length) {
			setterArray[i] = lo[i];
			i++;
		}
		this.data = setterArray; //sets value for data
	}
	
	//get the data for the values of data
	public double[] getData() {
		double[] getterArray = new double[data.length]; //create array with length of data
		//loop for getting values of array
		int i = 0;
		while (i < data.length) {
			getterArray[i] = data[i];
			i++;
		}
		return getterArray; //return get value
	}

	//Checks to see if data objects of calling object and stat object
	//have the same values
	public boolean equals(Stat s) {
		//if s is null, changes to an empty value
		if (s == null) {
			Stat nullStat = new Stat();
			s = nullStat;
		}
		//initializing boolean variable
		boolean elementsEqual = true;
		//if length of called object is not equal to the stat object, elementsEqual is false
		if (getData().length != s.getData().length) {
			elementsEqual = false;
		}
		//loop to see if values of each array are equal
		else {
			int i = 0;
			while (elementsEqual && i < s.getData().length) {
				if (getData()[i] != s.getData()[i]) {
					elementsEqual = false;
				}
				i++;
			}
		}
		return elementsEqual; //return boolean value
	}
	//resets the value of the the array to an empty array
	public void reset( ) {
		double[] resetArray = {}; //create empty array
		this.data = resetArray; // copy empty array to data
	}
	
	//combines values of data and then values of called object (double array)
	public void append (double[] d) {
		//if called array is null, sets append array equal to data
		if (d == null) {
			double[] appendArray = data;
			data = appendArray;
		} else {
			int length = data.length + d.length;  //variable for length of called object and data array
			double[] appendArray = new double[length];
			
			//for loop to get each value for array 
			for (int i = 0; i < length; i++) {
				if (i < data.length) {
					appendArray[i] = data[i];
				} else {
					appendArray[i] = d[i-data.length];
				}		
			}
		this.data = appendArray; //Sets appendsArray equal to data
		}
	}
	
	//combines values of data and then values of called object (int array)
		public void append (int[] i) {
		//if called array is null, sets append array equal to data
		if (i == null) {
			double[] appendArray = data;
			data = appendArray;
		} else {
			int length = data.length + i.length; //variable for length of called object and data array
			double[] appendArray = new double[length];
			
			//for loop to get each value for array 
			for (int d = 0; d < length; d++) {
				if (d < data.length) {
					appendArray[d] = data[d];
				} else {
					appendArray[d] = i[d-data.length];
				}	
			} 
		this.data = appendArray; //Sets appendsArray equal to data
		} 
		
	}

		//combines values of data and then values of called object (float array)
		public void append (float[] f) {
		//if called array is null, sets append array equal to data
		if (f == null) {
			double[] appendArray = data;
			data = appendArray;
		} else {
			int length = data.length + f.length; //variable for length of called object and data array
			double[] appendArray = new double[length];
			
			//for loop to get each value for array 
			for (int i = 0; i < length; i++) {
				if (i < data.length) {
					appendArray[i] = data[i];
				} else {
					appendArray[i] = f[i-data.length];
				}
			}
		this.data = appendArray; //Sets appendsArray equal to data
		}
	}
		
		//combines values of data and then values of called object (long array)
		public void append (long[] lo) {
		
		//if called array is null, sets append array equal to data
		if (lo == null) {
			double[] appendArray = this.data;
			data = appendArray;
		} else {
			int length = data.length + lo.length; //variable for length of called object and data array
			double[] appendArray = new double[length];
			
			//for loop to get each value for array 
			for (int i = 0; i < length; i++) {
				if (i < data.length) {
					appendArray[i] = data[i];
				} else {
					appendArray[i] = lo[i-data.length];
				}
			
				
			}
		this.data = appendArray; //Sets appendsArray equal to data
		}
	}
	
	//if data is empty, returns true. if not, returns false
	public boolean isEmpty() {
		if (data.length == 0) { //returns true if data length is 0
			return true;
		} else {
			return false; //if not, returns false
		}
	}
		
	//Changes the values of data from double to String
	public String toString() {
		
		//if data is empty, return NaN
		if ((data.length == 0) || (data == null)) {
			return "[]";
		}
		//loop for getting values from data and changing them to string
		String dataString = "[";
		for (int i = 0; i < data.length; i++) {
			
			dataString += data[i];
			if (i == data.length - 1)
				dataString += "]";
			else 
				dataString += ", ";
		}
		return dataString; //returns string value for data
		
	}

	//returns the minimum value of data array
	public double min() {
		//if data array is empty, returns Double.NaN
		if (data.length == 0) {
			return Double.NaN;
		} else {
			double min = data[0]; //sets min value equal to length of data
			//finds min value for array
			for (int i = 0; i < data.length; i++) {
				if (data[i] < min) {
					min = data[i];
				} 
			}
			return min; //returns min value	
		}
	}

	//returns the maximum value of data array
	public double max() {
		//if data array is empty, returns Double.NaN
		if (data.length == 0) {
			return Double.NaN;
		} else {
			//finds max value for array
			double max = data[0]; //sets max value equal to length of data
			for (int i = 1; i < data.length; i++) {
				if (data[i] > max) {
					max = data[i];
				}
			}
			return max; //returns max value
		}
	}

	//finds the average of the data array
	public double average() {
		if (data.length == 0) {
			return Double.NaN;
		} else {
			//for loop to get sum of all values
			double sum = 0;
			for (int index = 0; index < data.length; index++) {
				sum = sum + data[index];
			}
			double average = sum / data.length;
			return average; //returns average of values of data array
		}
	}

	//finds the mode of the data array
	public double mode() {
		if (data.length == 0) {
			return Double.NaN;
		} else {
			//initializing variables
			double THRESHOLD = 0.000000001;
			double mode = 0;
			double count = 0;
			
			//loop to calculate mode
			for (int i = 0; i < data.length; i++) {
				int indexCount = 0;
				for (int j = i; j < data.length; j++) {
					if (Math.abs(data[i] - data[j]) <= THRESHOLD)
						indexCount++;
				}
				//if one mode, mode equals mode of array
				if (indexCount > count) {
					mode = data[i];
					count = indexCount;
				}
				//if more than one mode, mode equals NaN
				else if (indexCount == count) {
					mode = Double.NaN;
				}
			}
			return mode; //return mode value
		}
	}
	
	public double occursNumberOfTimes(double value) {
		double count = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				count++;
			}
		}
		return count;
	}
	
	//finds the variance of the data array
	public double variance() {
		//if length is 0, returns Double.NaN
		if (data.length == 0) {
			return Double.NaN;
		} else {
			
			double variance = 0; //initialize double variable variance
			//for loop to get get sum
			for (int i = 0; i < data.length; i++) {
				variance += Math.pow(data[i] - average(), 2);
				
			}return variance / data.length;
			
		}
		
	}
	
	public double standardDeviation() {
		//if length of data is 0, return Double.NaN
		if (data.length == 0) {
			return Double.NaN;
		} else {
			return Math.sqrt(variance()); //returns standard deviation
		}
		
	}
}