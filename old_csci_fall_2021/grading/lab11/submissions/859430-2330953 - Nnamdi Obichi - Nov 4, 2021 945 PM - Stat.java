/*
 * Stat.java
 * Author: Nnamdi Obichi
 * Submission Date: November 4th, 2021
 *
 * Purpose: 
 * 
 * This class creates methods which can be
 * used to define the minimum, maximum, average,
 * and mode of an object holding a 1D array of doubles.
 * These objects with 1D arrays can be compared with other
 * instances of the Stat class to check if their data is
 * equal. Also, the user can get an object's toString
 * which is a String representation of the 1D array held
 * inside of an instance of Stat. Instances of Stat (objects)
 * can have their values set and retrieved with get and set
 * methods respectively. These objects can also have an array
 * set upon instantiation with constructors.    
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
	 * an array with the length of 1 with 0.0 as a default value 
	 */
	public Stat() {
		data = new double[1];
		data[0] = 0.0; 
	}
	
	/*
	 * This constructor takes a double array as its one
	 * argument (d). From that a new instance of Stat is 
	 * created which makes a deep copy of the argument d 
	 * and assigns its reference to data 
	 */
	public Stat(double[] d) {
		double[] newData = new double[d.length];
		
		for (int i = 0; i < d.length; ++i) {
			newData[i] = d[i];
		}
		
		data = newData;
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
	 * as its one argument. It then creates a new array
	 * that holds the same data as the argument (d). The
	 * data instance variable is then set equal to the
	 * new array's data. This method returns void    
	 */
	public void setData(double[] d) {
		double[] newArray = new double[d.length];
		
		for (int i = 0; i < d.length; ++i) {
			newArray[i] = d[i];
		}
		
		data = newArray;
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
	 * false. 
	 */
	public boolean equals(Stat s) {
		
		// Set to true by default before for loop occurs
		boolean veracity = true;
		
		// Checks if all data is equal. Stops if NOT and returns false
		for(int i = 0; (i < data.length) && veracity; ++i) {
			veracity = Math.abs(data[i] - s.data[i]) < 0.000000001;
		}
		
		return veracity;
	}
	
	/*
	 * Return a toString with the data of the calling object
	 * being returned as a String representing the array
	 * of values in the instance of data.
	 */
	public String toString() {
		String dataString = "[";
		
		for(int i = 0; i < data.length-1; ++i) {
			dataString += data[i] + ", ";
		}
		
		dataString += data[data.length-1] + "]";
		
		return dataString;
	}
	
	/*
	 * Returns the minimum value in the calling object's instance
	 * of data. Returns a double.
	 */
	public double min(){
		
		// Sets least to the first value of the data instance variable by default
		double least = data[0];
		
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
		
		return least;
	}
	
	/*
	 * Returns the maximum value in the calling object's instance
	 * of data. Returns a double.
	 */
	public double max(){
		
		// Sets most to the first value of the data instance variable by default
		double most = data[0];
		
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
		
		return most;
	}
	
	/*
	 * Averages all values within the data instance variable.
	 * Average equals the total sum of all of the array's values
	 * divided by the array's length. Returns a double for the
	 * average.
	 */
	public double average() {
		
		double result = 0;
		
		for (int i = 0; i < data.length; ++i) {
			result += data[i];
		}
		
		result = result / data.length;
		return result;	
	}
	
	/*
	 * Returns the double of the mode. The mode is the value that occurs
	 * most often within a data set. If more than one values is repeated the
	 * same maximum number of times, then NaN (not a real number) is returned
	 * at the end of this method. 
	 */
	public double mode() {
		
		// Mode is set to zero by default
		double result = 0;
		
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
				if(Math.abs(data[i] - data[j]) < 0.001) {
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
		
		return result;
	}
}
