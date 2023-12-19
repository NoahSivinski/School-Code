public class Stat { // Class that has the methods for Stat
	private double data[] = {0.0};     // Only instance variable in Stat declared as private so it can only be changed in Stat    

	public Stat() { // First constructor that creates a new array and assigns it to data with only the value of 0.0
		double[] array = {0.0};
		data = array;
	}

	public Stat(double[] d) { // Second constructor with parameters of double [] and d.
		double[] newArray = new double[d.length]; // Creates a new array with the same length as the array d
		data = newArray; // then is assigned to data
		for (int i = 0; i < data.length; i++) { // For loop to put the values that will 
			newArray[i] = d[i];
		}
	}

	public double[] getData() {  // setting up the getData method 
		double[] getterArray = new double[data.length];// sets up the array for this  method
		int i = 0;  // sets  integer i equal to 0
		while (i < data.length) { //while loop for how to manipulate i in this method
			getterArray[i] = data[i];
			i++;
		}
		return getterArray;
	}

	public void setData(double[] d) { //setting up the setData method  
		double setterArray[] = new double[d.length];// sets up the array for this method
		int i = 0; // sets  integer i equal to 0
		while (i < d.length) { //while loop for how to manipulate i in this method
			setterArray[i] = d[i];
			i++;
		}
		data = setterArray;                                                                       
	}
	

	public boolean equals(Stat s) {// setting up the equals method
		boolean elementsAreEqual = true; //defining the boolean
		if (getData().length != s.getData().length) { // if statement for when the boolean is true
			elementsAreEqual = false;
		}
		else {// what happens if the boolean is false
			int i = 0;
			while (elementsAreEqual && i < s.getData().length) {// while loop for if the boolean is true
				if (getData()[i] != s.getData()[i]) {
					elementsAreEqual = false;
				}
				i++;
			}
		}
		return elementsAreEqual;
	}

	public String toString() { // setting up the toString method
		if (data.length == 0) { // if statement for the value of data.length
			return "NaN";// if data.legth is 0
		}
		else { // what happens if data.legth is any other value
		String dataString = "[";
		for (int i = 0; i < data.length; i++) {
			
			dataString += data[i];
			if (i == data.length - 1) //if statement for if i is equal to data.length minus 1
				dataString += "]";
			else // what  happens if i isnt equal  to data.length minus 1
				dataString += ", ";                
		}
		return dataString;
		
	}
		
}

	public double min() { // setting up the min method
		double min = data.length;
		if (data.length == 0) {  // if statement for how to determine what min is equal to
			min = Double.NaN;
		}else {
		for (int i = data.length - 1; i > -1; i--) {// for loop for  the min method
			if (data[i] < min) {  //if  statement for if  data[i] is  less than min
				min = data[i];
			}
		}
		

	}	return min;
}		
	public double max() { // setting up the max method
		double max = 0;
		if (data.length == 0) { // if statement for how to determine what max is equal to
			max = Double.NaN;
		}else {
			max = data[0];
		for (int i = 1; i < data.length; i++) { //for loop for the max method
			if (data[i] > max) {  //if  statement for if  data[i] is  more than max
				max = data[i];
			}
		}
	
	}		return max;
} 

	public double average() {  // setting up the average method
		double sum = 0;
		for (int index = 0; index < data.length; index++) {// for loop  to  determine how manipulate  sum
			sum = sum + data[index];
		}
		double average = sum / data.length;
		return average;
	}

	public double mode() {//  setting up the mode method
		double THRESHOLD = 0.000000001;// setting the threshold
		double mode = 0; // setting the mode
		double counter = 0;// setting the counter
		if (data.length == 0) {  // if statement to determine how to manipulate data.length
			mode = Double.NaN;
		}
		for (int i = 0; i < data.length; i++) { //for loop to manipulate maxCounter
			int maxCounter = 0;
			for (int j = i; j < data.length; j++) { // for loop that manipulates mode, counter and maxCounter
				if (Math.abs(data[i] - data[j]) <= THRESHOLD)
					maxCounter++;
			}
			if (maxCounter> counter) {
				mode = data[i];
				counter = maxCounter;
			}
			else if (maxCounter == counter) {
				mode = Double.NaN;
			}
		}
		
		
		return mode;
	}

}
