
public class Stat {
	// private class
	private double data[];
		// default constructor
		public Stat() {
			
			double[] tempData = new double[1];
			tempData[0] = 0.0;
			data = tempData;
		}
		// additional constructor; uses values held by "d"
		public Stat(double[] d) {
			
			double[] inputArray = new double[d.length]; // create a new array
			
			for (int i=0; i<d.length; i++) { // for loop through the array
				inputArray[i] = d[i];
			}
			this.data = inputArray; // assign data to inputArray
		}
		
		public double[] getData() { // getter method
			
			double[] inputArray1 = new double[data.length]; // create a new array with size matching data length
			
			for (int i=0; i<data.length; i++) { // for loop through array
				inputArray1[i] = data[i]; 
			}
			return inputArray1; // return array
		}
		
		public void setData(double[] d) { // setter method
			
			double[] inputArray2 = new double[d.length]; //create a new array with size matching data length
			
			for (int i=0; i<d.length; i++) { // for loop through the array
				inputArray2[i] = (double) d[i]; // assign array to the data at the index i; also make d[i] by double
			}
			this.data = inputArray2; // return array
		}
		
		public boolean equals(Stat s) { // boolean method
			
			if (s.data.length == data.length) { // if condition to insure the s.data equals data are equal in length
				for (int i=0; i<s.data.length; i++) { // for loop through the array
					if (s.data[i] != data[i]) { // if condition that returns false if the s.data does not equal data at index i
						return false;
					}
				}
			}
			else {
				return false;
			}
			return true; // default return true if everything is correct
		}
		
		public String toString() { // toString method
			
			String bracket = "["; // String with a bracket method
			
			if (data.length < 1) { // for loop that if the size is smaller than 1; this produces an empty bracket
				String emptyBracket = "[]";
				return emptyBracket;
			}
			
			for (int i=0; i<data.length; i++) { // for loop through array
				if (i != data.length-1) { // if condition to determine whether data[] is the last index
					bracket = bracket + data[i] + ", "; // if not then data[i] is added with ", "
				}
				else {
					bracket = bracket + data[i] + "]"; // if data[] is the last index then data[i] with last bracket "]"
					bracket = bracket.trim(); // get rid of leading and trailing space
				}
			}
			return bracket; // return bracket
		}
		
		public double min() {
			
			double minimumNumber = this.data[0]; // create double value that equals data[] at first index
			
			for (int i=0; i<data.length; i++) { // for loop through array
				if (minimumNumber > data[i]) { // if condition that tests whether the first double value is greater than next data[] value
					minimumNumber = data[i]; // if true, then data[] at that index becomes the the new minimumNumber
				}
			}
			return minimumNumber; // return minimumNumber
		}
		
		public double max() {
			
			double maximumNumber = this.data[0]; // create double value that equals data[] at first index
			
			for (int i=0; i<data.length; i++) {	// for loop through array
				if (maximumNumber < data[i]) { // if condition that tests whether the first double value is less than next data[] value
					maximumNumber = data[i]; // if true, then data[] at that index becomes the the new maximumNumber
				}
			}
			return maximumNumber; // return maximumNumber
		}
		
		public double average() { // average method
			
			double averageNumber = this.data[0]; // create double value that equals the first data[] value
			
			for (int i=1; i<data.length; i++) { // for loop through data array starting at index 1
				averageNumber = averageNumber + data[i]; // average number equals to average number plus the next data[i]
			}
			averageNumber = (averageNumber / data.length); // averageNumber is averageNumber divided by data size
			return averageNumber; // return averageNumber
		}
		
		public double mode() { // mode method
			
			int[] maxFrequency = new int [data.length]; // the maximum number of times a certain value within the data[]
			
			for (int i=0; i<data.length; i++) { // for loop through the data array
				for (int j=0; j<data.length; j++) { // second for loop through the data array to correspond to first loop
					if(data[i]==data[j]) { // if condition to to compare first and second array
						maxFrequency[i]++; // if true, increase count of a certain number within the data array
					}
				}
			}
			
			int maxCounter = 0; // set counter to count max value
			double modeValue = data[0]; // set double value to first value in data[]
			
			for (int i=0; i<maxFrequency.length; i++) { // for loop through based on maxFrequency value size
				if (maxFrequency[i] > maxCounter) { // if condition for maxFrequency greater than maxCounter
					maxCounter = maxFrequency[i]; // assigns maxCounter equal to maxFrequency at index
					modeValue = data[i]; // assign modeVale to the data[] at the index
				}
			}
			
			for (int i=0; i<maxFrequency.length; i++) { // for loop through based on maxFrequenct value size
				if(maxFrequency[i] == maxCounter) { // if condition that compares the maxFrequency and maxCounter
					if(modeValue != data[i]) { // if condition when modeValue does not equal to data[]
						return Double.NaN; // if true, return double value of ".NaN"
					}
				}
			}
			
			if (data.length < 1) { // if condition when data size is smaller than 1
				return Double.NaN; // if true, return double value of ".NaN"
			}
			
			for (int i=0; i<maxFrequency.length; i++) { // for loop through array based on maxFrequency length
				if(maxFrequency[i] == maxCounter) { // if condition to compare maxFrequency  and maxCounter at the index
					if(modeValue != data[i]) { // if condition that compares and determine whether or not modeValue does not equal data[] at index
						return Double.NaN; // return double value of ".NaN"
					}
				}
			}
			return modeValue; // return modeValue
		}
}
