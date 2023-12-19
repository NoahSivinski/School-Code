/*
 * Stat.java
 * Author: Nnamdi Obichi
 * Submission Date: November 9th, 2021
 *
 * Purpose: 
 * 
 * Allows the user to create manipulate 1D array objects.
 * The user can set their data with set methods or 
 * constructors. The user can reset and append the
 * objects' data. The user can also check if two different
 * objects have equal data or if an array object is empty.
 * A data set's minimum, maximum, average, mode, variance,
 * and standard deviation can also be found using the methods
 * below. This program has been expanded from previous versions
 * to allow for empty arrays as well as arrays of different 
 * numerical data types (int, long, float, and double). 
 *    
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
	
	// Create an uninitialized double array instance variable
	private double[] data;
	
	/* 
	 * This default constructor initializes a new instance of Stat to be
	 * an empty array with the length of 0 
	 */
	public Stat() {
		double[] empty = {};
		data = empty;
	}
	
	/*
	 * This constructor takes a double array as its one
	 * argument (d). From that a new instance of Stat is 
	 * created which makes a deep copy of the argument d 
	 * and assigns its reference to data as a double array.
	 * If d is null, data is assigned to an empty array.
	 */
	public Stat(double[] d) {
		if (d == null) {
			double[] empty = {};
			data = empty;
		}
		else {
			double[] newData = new double[d.length];
			
			for (int i = 0; i < d.length; ++i) {
				newData[i] = d[i];
			}
			
			data = newData;
		}
	}
	
	/*
	 * This constructor takes a float array as its one
	 * argument (f). From that a new instance of Stat is 
	 * created which makes a deep copy of the argument f 
	 * and assigns its reference to data as a double array.
	 * If f is null, data is assigned to an empty array.
	 */
	public Stat(float[] f) {
		
		if (f == null) {
			double[] empty = {};
			data = empty;
		}
		else {
			double[] newData = new double[f.length];
			
			for (int i = 0; i < f.length; ++i) {
				newData[i] = f[i];
			}
			
			data = newData;
		}
	}
	
	/*
	 * This constructor takes a int array as its one
	 * argument (i). From that a new instance of Stat is 
	 * created which makes a deep copy of the argument i 
	 * and assigns its reference to data as a double array.
	 * If i is null, data is assigned to an empty array. 
	 */
	public Stat(int[] i) {
		
		if (i == null) {
			double[] empty = {};
			data = empty;
		}
		else {
			double[] newData = new double[i.length];
			
			for (int k = 0; k < i.length; ++k) {
				newData[k] = i[k];
			}
			
			data = newData;
		}
	}
	
	/*
	 * This constructor takes a long array as its one
	 * argument (lo). From that a new instance of Stat is 
	 * created which makes a deep copy of the argument lo 
	 * and assigns its reference to data as a double array.
	 * If lo is null, data is assigned to an empty array. 
	 */
	public Stat(long[] lo) {
		if (lo == null) {
			double[] empty = {};
			data = empty;
		}
		else {
			double[] newData = new double[lo.length];
			
			for (int i = 0; i < lo.length; ++i) {
				newData[i] = lo[i];
			}
			
			data = newData;
		}
	}
	
	/*
	 * This get (accessor) method retrieves the data
	 * in the data instance variable and returns a
	 * double array with the same data as the data
	 * instance variable.  
	 */
	public double[] getData() {	
		double[] newData = new double[data.length];
		
		for (int i = 0; i < data.length; ++i) {
			newData[i] = data[i];
		}
		
		return newData;
	}
	
	/*
	 * This set (mutator) method takes a double array
	 * as its one argument. It then creates a new double array
	 * that holds the same data as the argument (d). The
	 * data instance variable is then set equal to the
	 * new array's data. This method returns void. 
	 * If d is null, data is assigned to an empty array.    
	 */
	public void setData(double[] d) {
		if (d == null) {
			double[] empty = {};
			data = empty;
		}
		else {
			double[] newData = new double[d.length];
			
			for (int i = 0; i < d.length; ++i) {
				newData[i] = d[i];
			}
			
			data = newData;
		}
	}
	
	/*
	 * This set (mutator) method takes a float array
	 * as its one argument. It then creates a new double array
	 * that holds the same data as the argument (f) but as 
	 * doubles. The data instance variable is then set equal 
	 * to the new array's data. This method returns void.
	 * If f is null, data is assigned to an empty array.    
	 */
	public void setData(float[] f) {

		if (f == null) {
			double[] empty = {};
			data = empty;
		}
		else {
			double[] newData = new double[f.length];
			
			for (int i = 0; i < f.length; ++i) {
				newData[i] = f[i];
			}
			
			data = newData;
		}
	}
	
	/*
	 * This set (mutator) method takes a int array
	 * as its one argument. It then creates a new double array
	 * that holds the same data as the argument (i) but as
	 * doubles. The data instance variable is then set equal
	 * to the new array's data. This method returns void.
	 * If i is null, data is assigned to an empty array.    
	 */
	public void setData(int[] i) {
		
		if (i == null) {
			double[] empty = {};
			data = empty;
		}
		else {
			double[] newData = new double[i.length];
			
			for (int k = 0; k < i.length; ++k) {
				newData[k] = i[k];
			}
			
			data = newData;
		}
	}
	
	/*
	 * This set (mutator) method takes a long array
	 * as its one argument. It then creates a new double array
	 * that holds the same data as the argument (lo) but as a 
	 * double. The data instance variable is then set equal 
	 * to the new array's data. This method returns void.
	 * If lo is null, data is assigned to an empty array.    
	 */
	public void setData(long[] lo) {
		
		if (lo == null) {
			double[] empty = {};
			data = empty;
		}
		else {
			double[] newData = new double[lo.length];
			
			for (int i = 0; i < lo.length; ++i) {
				newData[i] = lo[i];
			}
			
			data = newData;
		}
	}
	
	/*
	 * This function returns a boolean value and has
	 * one argument that is an instance of the Stat class
	 * (s). The function then checks if all of the data in 
	 * the Stat object calling this method and the 
	 * argument s Stat object are the same in
	 * value, order, and length within their respective 
	 * instances of data (the instance variable). If the
	 * object's data are equal return true else return
	 * false. If the argument s is null, the method 
	 * returns false. 
	 */
	public boolean equals(Stat s) {
		
		// Set to true by default before for loop occurs
		boolean veracity = true;
		
		// Will return false if s is null
		if (s == null) {
			veracity = false;
		}
		else {
			
			// If both Stat objects' data are the same length
			if (data.length == s.data.length) {
				// Checks if all data is equal. Stops if NOT and returns false
				for(int i = 0; (i < data.length) && veracity; ++i) {
					veracity = Math.abs(data[i] - s.data[i]) < 0.000000001;
				}
			}
			// If not the same length
			else {
				veracity = false;
			}
		}

		return veracity;
	}
	
	/* Resets data in the data instance variable
	 * so that it is an empty array with a 
	 * length of 0 
	 */
	public void reset() {
		double[] empty = {};
		
		data = empty;
	}
	
	/*
	 * Combines the data array of the calling object with
	 * the argument i (an integer array) into a new array.
	 * The integer array is then converted into a double array
	 * with the same elements. This converted double array
	 * is used as an argument in the version of this method
	 * that takes a double array as its argument. This method
	 * returns void. If i equals null, this method does nothing. 
	 */
	public void append(int[] i) {
		
		if (i != null) {
			double[] doubleI = new double[i.length];
			
			for(int k = 0; k < i.length; ++k) {
				doubleI[k] = i[k];
			}
			
			append(doubleI);
		}
	}
	
	/*
	 * Combines the data array of the calling object with
	 * the argument f (a float array) into a new array.
	 * The float array is then converted into a double array
	 * with the same elements. This converted double array
	 * is used as an argument in the version of this method
	 * that takes a double array as its argument. This method
	 * returns void. If f equals null, this method does nothing. 
	 */
	public void append(float[] f) {
		
		if (f != null) {
			double[] doubleF = new double[f.length];
			
			for(int i = 0; i < f.length; ++i) {
				doubleF[i] = f[i];
			}
			
			append(doubleF);
		}
	}
	
	/*
	 * Combines the data array of the calling object with
	 * the argument lo (a long array) into a new array.
	 * The long array is then converted into a double array
	 * with the same elements. This converted double array
	 * is used as an argument in the version of this method
	 * that takes a double array as its argument. This method
	 * returns void. If lo equals null, this method does nothing. 
	 */
	public void append(long[] lo) {
		
		if (lo != null) {
			double[] doubleLo = new double[lo.length];
			
			for(int i = 0; i < lo.length; ++i) {
				doubleLo[i] = lo[i];
			}
			
			append(doubleLo);
		}
	}
	
	/*
	 * Combines the data array of the calling object with
	 * the argument d (a double array) into a new array.
	 * This new array is the length of two arrays combined.
	 * The data instance variable is set equal to this 
	 * new array when this method ends. This method returns void.
	 * If d equals null, this method does nothing. 
	 */
	public void append(double[] d) {
		
		if (d != null) {
			double[] newData = new double[data.length + d.length];
			
			for(int i = 0; i < data.length + d.length; ++i) {
				
				if (i >= 0 && i < data.length) {
					newData[i] = data[i];
				}
				else if (i >= data.length && i < data.length + d.length) {
					newData[i] = d[i-data.length];
				}
			}
			
			data = newData;
		}
	}
	
	/*
	 * Returns true if the data object is empty (meaning
	 * that it has a length of 0). Otherwise this method
	 * returns false.
	 */
	public boolean isEmpty() {
		
		boolean status = false;
				
		if (data.length == 0) {
			status = true;
		}
		
		return status;
	}
	
	/*
	 * Return a toString with the data of the calling object
	 * being returned as a String representing the array
	 * of values in the instance of data.
	 */
	public String toString() {
		
		String dataString = "[";
		
		if (data.length > 0) {
			for(int i = 0; i < data.length-1; ++i) {
				dataString += data[i] + ", ";
			}
			
			dataString += data[data.length-1] + "]";
		}
		else {
			dataString += "]";
		}
		
		return dataString;
	}
	
	/*
	 * Returns the minimum value in the calling object's instance
	 * of data. Returns a double. If the array is empty, the method
	 * returns NaN (Not a Number)
	 */
	public double min(){
		
		double least;
		
		if (data.length == 0) {
			least = 0.0 / 0;
		}
		else {
			
			// Sets least to the first value of the data instance variable by default
			least = data[0];
			
			// Counts how many other elements an element in data is less than or equal to
			int truthCount = 0;
			
			/*
			 * truthCount should be less than or equal to the length of data before
			 * it is reset in every iteration of the for loop.
			 * If an element in data is less than or equal to all other elements
			 * (data[i] <= data[j]) such that (truthCount == data.length), the
			 * method returns that element's value as least (the minimum value). 
			 */
			for (int i = 0; i < data.length && truthCount != data.length; ++i) {
				truthCount = 0;
				for (int j = 0; j < data.length; ++j) {
					if(data[i] <= data[j]) {
						++truthCount;
					}
				}
				if (truthCount == data.length) {
					least = data[i];
				}
			}
		}
		return least;
	}
	
	/*
	 * Returns the maximum value in the calling object's instance
	 * of data. Returns a double. If the array is empty, the method
	 * returns NaN (Not a Number)
	 */
	public double max(){
		
		double most;
		
		if (data.length == 0) {
			most = 0.0/0;
		}
		else {
			
			// Sets most to the first value of the data instance variable by default
			most = data[0];
			
			// Counts how many other elements an element in data is more than or equal to
			int truthCount = 0;
			
			/*
			 * truthCount should be less than or equal to the length of data before
			 * it is reset in every iteration of the for loop.
			 * If an element in data is more than or equal to all other elements
			 * (data[i] >= data[j]) such that (truthCount == data.length), the
			 * method returns that element's value as most (the maximum value). 
			 */
			for (int i = 0; i < data.length && truthCount != data.length; ++i) {
				
				truthCount = 0;
				
				for (int j = 0; j < data.length; ++j) {
					if(data[i] >= data[j]) {
						++truthCount;
					}
				}
				
				if (truthCount == data.length) {
					most = data[i];
				}
			}	
		}
		return most;
	}
	
	/*
	 * Averages all values within the data instance variable.
	 * Average equals the total sum of all of the array's values
	 * divided by the array's length. Returns a double for the
	 * average. If the array is empty, the method
	 * returns NaN (Not a Number)
	 */
	public double average() {
		
		double result;
		
		if (data.length == 0) {
			result = 0.0/0;
		}
		else {
			result = 0;
			
			for (int i = 0; i < data.length; ++i) {
				result += data[i];
			}
			
			result = result / data.length;
		}
		
		return result;
	}
	
	/*
	 * Returns the double of the mode. The mode is the value that occurs
	 * most often within a data set. If more than one values is repeated the
	 * same maximum number of times, then NaN (not a real number) is returned
	 * at the end of this method. If the array is empty to begin with, the method
	 * returns NaN (Not a Number) 
	 */
	public double mode() {
		
		double result;
		
		if (data.length == 0) {
			result = 0.0 / 0;
		}
		else {
			// Mode is set to zero by default
			result = 0;
			
			// Creates newArray which is the same length as the instance of data (double array)
			double[] newArray = new double[data.length];
			
			// Counts the number of times a number in the array (data) appears 
			int truthCount = 0;
			
			
			/*
			 * This for loop initializes all of the values in newArray. newArray
			 * compliments the values in an instance of data as an index of a
			 * value in data will instead be the number of times that value appears
			 * in data when in newArray. 
			 * 
			 * For Example:
			 * 
			 * Instance of data = [9.0, 9.0, 4.5, 5.0, 6.0, 9.0]
			 * newArray = [3.0, 3.0, 1.0, 1.0, 1.0, 3.0]
			 * 
			 * Essentially newArray displays how many times a number at a given
			 * index appears in the data instance.
			 */
			for (int i = 0; i < data.length && truthCount != data.length; ++i) {
				
				truthCount = 0;
				
				for (int j = 0; j < data.length; ++j) {
					if(Math.abs(data[i] - data[j]) < 0.000000001) {
						++truthCount;
					}
				}
				
				newArray[i] = truthCount;
			}
			
			// Initializes a new Stat object which holds the values in newArray 
			Stat modeObj = new Stat(newArray);
			
			/* The appearances variable holds the maximum number of times a value
			 * appears in an instance of data.
			 */
			double appearances = modeObj.max();
			
			// truthCount is repurposed here and set zero again by default
			truthCount = 0;
			
			/* 
			 * Counts number of times the value stored in the appearances
			 * variable appears in newArray. If the count exceeds the value
			 * stored in appearances, then result is set to NaN. Otherwise, if
			 * truthCount is less than or equal to appearances, result is equal
			 * to data's current index of i in the loop   
			 */
			for (int i = 0; i < data.length && truthCount <= appearances; ++i) {
				
				if (Math.abs(newArray[i] - appearances)< 0.000000001) {
					result = data[i];
					++truthCount;
				}
				
				if (truthCount > appearances) {
					result = 0.0/0.0; 
				}
			}
		}
		return result;
	}
	
	/*
	 * Returns the (int) number of times a value appears in an
	 * instance of the data object. This is a private
	 * helper method to understand the mode method.
	 */
	private int occursNumberOfTimes(double value) {
		
		int occurrences = 0;
	
		for (int i = 0; i < data.length; ++i) {
			if(Math.abs(value - data[i]) < 0.000000001) {
				++occurrences;
			}
		}
		
		return occurrences;
	}
	
	/*
	 * Returns the variance of values in an instance of
	 * data as a double. If the array is empty 
	 * then the method returns NaN (Not a Number). The
	 * variance is the difference of all of the elements 
	 * in data and the average of all of those elements.
	 * Those differences are then squared and summed 
	 * together. This sum is divided by the length of
	 * data to get the final result for the variance.  
	 */
	public double variance() {
		
		double result;
		
		if (data.length == 0) {
			result = 0.0 / 0;
		}
		else {
			result = 0;
			
			Stat dataStuff = new Stat(data);
			double mean = dataStuff.average();
			
			for (int i = 0; i < data.length; ++i) {
				result += Math.pow(data[i]-mean, 2);
			}
			
			result /= data.length;
		}
		
		return result;
	}
	
	/*
	 * Returns a double of the standard deviation
	 * which is the square root of the variance. If the 
	 * array is empty then the method returns NaN (Not a Number).  
	 */
	public double standardDeviation() {
		
		double result;
		
		if (data.length == 0) {
			result = 0.0 / 0;
		}
		else {
			Stat dataStuff = new Stat(this.data);
			result = Math.sqrt(dataStuff.variance());
		}
		
		return result;
	}
}
