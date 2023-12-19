public class Stat {
	
	//This private array holds the data values.
	private double[] data;
	
	//For double comparison
	public static final double THRESHOLD = 0.000000001;
	
	/**
	 * This is the default constructor for Stat, it creates a double
	 * array that contains one element of 0.0.
	 */
	public Stat() {
		double[] temp = {0.0};
		data = temp;
	}
	
	/**
	 * This is the constructor for Stat when the values are given
	 * as a parameter of the method.
	 */
	public Stat(double[] d) {
		double[] temp = new double [d.length];
		for (int i = 0; i<d.length; i++) temp[i] = d[i];
		data = temp;
	}
	
	/**
	 * This is the getter method for data which returns a copied array
	 * that contains the same values as the current Stat data.
	 */
	public double[] getData() {
		double[] temp = new double [data.length];
		for (int i = 0; i<data.length; i++) temp[i] = data[i];
		return temp;
	}
	
	/**
	 * This is the setter method for data which changes the current 
	 * array for data to the array given as a parameter.
	 */
	public void setData(double[] d) {
		double[] temp = new double [d.length];
		for (int i = 0; i<d.length; i++) temp[i] = d[i];
		data = temp;
	}
	
	/**
	 * This is the equals method which checks to see if two Stat
	 * objects have the same data, which means same values in the
	 * same spots. It returns a value of true if they do, false if not.
	 */
	public boolean equals(Stat s) {
		boolean run = true;
		/* This returns false if the lengths of the 
		 * data sets in both arrays are not equal.
		 */
		if(data.length != s.getData().length) return false;
		/* If the data values are the same length, the values
		 * are then fed through a loop that checks the values
		 * in each data set at the same spots. If they are 
		 * ever different, the value of run is set to false to
		 * break the loop.
		 */
		while(run) {
			for(int i = 0; i < data.length; i++) {
				double one = data[i];
				double two = s.getData()[i];
				if(Math.abs((one-two)) < THRESHOLD) run = true;
				else run = false;
			}
			/* If the loop ends (which means all values are the same
			 * the method returns the true value of run.
			 */
			return run;
		}
		//Otherwise the false value of run is returned.
		return run;
	}
	
	/**
	 * The toString method replaces the generic object toString
	 * and prints out the data array.
	 */
	public String toString() {
		String temp = "[";
		for(int i = 0; i < data.length; i++) {
			double one = data[i];
			if((i+1) == data.length) temp = temp + one + "]";
			else temp = temp + one + ", ";
		}
		return temp;
	}
	
	/**
	 * This is the implementation of the minimum method
	 * which returns the smallest value in a data set.
	 */
	public double min() {
		double minimum = data[0];
		for(int i = 0; i < data.length; i++) {
			if(data[i] < minimum) minimum = data[i];
		}
		return minimum;
	}
	
	/**
	 * This is the implementation of the maximum method
	 * which returns the largest value in a data set.
	 */
	public double max() {
		double maximum = data[0];
		for(int i = 0; i < data.length; i++) {
			if(data[i] > maximum) maximum = data[i];
		}
		return maximum;
	}
	
	/**
	 * This is the average method which computes the 
	 * average of a dataset. This is done by adding 
	 * all the numbers together and dividing by the 
	 * array's length.
	 */
	public double average() {
		double sum = 0;
		double average;
		for(int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		average = sum/(double)data.length;
		return average;
	}
	
	/**
	 * This method returns the most occurring number
	 * in the dataset. If the dataset only consists
	 * of one number that number is returned. Otherwise
	 * the program establish some double and int values
	 * to help with finding the mode of a larger set. 
	 * If the set has multiple numbers that occur the
	 * same amount of time, the NaN value is returned.
	 */
	public double mode() {
		double mode;
		if(data.length == 1) mode = data[0];
		else {
			double currentMode = 0.0;
			double currentCheck;
			int otherOccurencesValue = 0;
			int currentMaxOccurences = 0;
			for(int i = 0 ; i < data.length; i++) {
				currentCheck = data[i];
				int numberOfOccurences = 0;
				for(int j =0; j < data.length; j++) {
				if(Math.abs(data[j] - currentCheck) < THRESHOLD) numberOfOccurences++;
				}
				if(numberOfOccurences > otherOccurencesValue) {
					currentMode = data[i];
					otherOccurencesValue = numberOfOccurences;
					currentMaxOccurences = numberOfOccurences;
				}
				if(currentCheck != currentMode && (currentMaxOccurences == numberOfOccurences)) {
					currentMode = Double.NaN;
				}
			}
			mode = currentMode;
		}
		return mode;
	}
}
