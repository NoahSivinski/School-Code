/*
 * Stat.java
 * Author:  James Breathnach 
 * Submission Date:  11/5/2021
 *
 * Purpose: It contains a list of methods which can be called upon in order find values for statistical stuff such as mode, average, max and min.
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */
public class Stat {
	private double data[];
	//Stat constructor
	public Stat() {
		//blank is the name for a stat with no values.
		double blank[] = {0.0};
		setData(blank);
	}
	// Creates values for a stat object.
	public Stat(double[] d){
		double output[] = d;
		setData(output);
	}
	//gets the data in a stat construct.
	public double[] getData(){
		int dataNumber =this.data.length;
		double [] dataGet= new double [dataNumber];
		for (int i=0; i < dataNumber; i++) {
			dataGet[i] = this.data[i];
		}
		return dataGet;

	}
	//sets the data
	public void setData(double[] d){
		this.data= d;
		double[] dataCopy = getData();
		this.data=dataCopy;

	}

	//equals method
	public boolean equals(Stat s){
		boolean output = false;
		double [] input1 = getData();
		double [] input2 = s.getData();
		//sees if the lengths match
		if(input1.length == input2.length ) {
			output=true;
			//checks to make sure the order is correct
			for(int i=0; i< input1.length; i++) {
				if(input1[i] != input2[i]) {
					output=false;
				}
			}
		}
		return output;
	}
	//to string
	public String toString(){
		double [] input = getData();
		//Starts the toString with a [
		String toString= "[";
		//adds the next numbers and commas
		for (int i=0; i< input.length -1; i++) {
			toString = toString + input[i] + ", ";

		}
		toString+= input[(input.length - 1)] + "]";
		return toString;

	}
	//Min code
	public double min(){
		double [] input = getData();
		double min = input[0];
		//sees if the next number is less than min.
		for (int i=1; i< input.length; i++) {
			if(input[i] < min) {
				min = input[i];
			}
		}
		return min;		
	}
	//Max code
	public double max(){
		double [] input = getData();
		double max = input[0];
		for (int i=1; i< input.length; i++) {
			if(input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}
	//Average code
	public double average(){
		double [] input = getData();
		double average = 0;
		//adds up all the numbers in the array.
		for (int i=0; i< input.length; i++) {
			average += input[i];
		}
		//divides them by the amount in the array
		average = average / (input.length);
		return average;
	}
	//Code for mode
	public double mode(){
		double [] input = getData();
		int countHighest=1;
		int numberOfModes = 0;
		int modeChange = 0;
		double mode= Double.NaN;
		for( int i = 0; i<input.length; i++) {
			int count= -1;
			//looks through all the numbers.
			for (int j=0; j<input.length; j++) {
				if (input[i]==input[j]) {
					count++;
				}
				//if count is greater than the highest count then it makes that the new mode
				if(count>countHighest){
					mode= input[i];
					modeChange++;
				}
				//if there is only one number it becomes the mode
				if(input.length ==1) {
					mode = input [0];
					
				}
			}
			//if there are multiple modes than the answer becomes NaN.
			if(count==countHighest) {
				numberOfModes++;
			}
		}
		if(numberOfModes>modeChange) {
			mode=Double.NaN;
		}
		return mode;
	}



}

