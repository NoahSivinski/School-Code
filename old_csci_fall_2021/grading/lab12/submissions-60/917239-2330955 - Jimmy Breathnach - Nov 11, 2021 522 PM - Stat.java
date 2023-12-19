/*
 * Stat.java
 * Author:  James Breathnach 
 * Submission Date:  11/11/2021
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
	//data is an array which will be placed into stat
	private double data[];
	//Stat constructor
	public Stat() {
		//blank is the name for a stat with no values.
		double blank[] = null;
		setData(blank);
	}
	// Creates values for a stat object. Overloading so non double values can be placed into a stat.
	public Stat(double[] d){
		double output[] = d;
		setData(output);
	}

	public Stat(float[] f){
		float output[] = f;
		setData(output);

	}
	public Stat(int[] i){
		int output[] = i;
		setData(output);
	}
	public Stat(long[] lo){
		long output[] = lo;
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

	//Sets the data. Overloading starts here as since the data is a double value, the arrays which aren't doubles are turned into doubles and then placed into a stat.
	public void setData(float[] f){
		int dataNumber = f.length;
		double []d = new double [dataNumber];
		for(int i = 0; i<dataNumber; i++ ) {
			d[i] = (double) f [i];
		}
		this.data= d;
		double[] dataCopy = getData();
		this.data=dataCopy;
	}


	public void setData(double[] d){
		if(d==null) {
			reset();
		}else {
			this.data= d;
		}
		double[] dataCopy = getData();
		this.data=dataCopy;

	}
	public void setData(int[] i){
		if(i==null) {
			reset();
		}else {
			int dataNumber = i.length;
			double []d = new double [dataNumber];
			for(int j = 0; j<dataNumber; j++ ) {
				d[j] = (double) i [j];

			}
			this.data= d;
			double[] dataCopy = getData();
			this.data=dataCopy;
		}
	}
	public void setData(long[] lo){
		if(lo==null) {
			reset();
		}else {
			int dataNumber = lo.length;
			double []d = new double [dataNumber];
			for(int i = 0; i<dataNumber; i++ ) {
				d[i] = (double) lo [i];
			}
			this.data= d;
			double [] dataCopy = getData();
			this.data=dataCopy;
		}
	}

	//equals method
	public boolean equals(Stat s){
		boolean output = false;
		double [] input1 = getData();
		double [] input2 = null; 
		//prevents a null error from occurring
		if (s!=null) {
			input2= s.getData();
		}else {
			double[] blank = {};
			input2=blank;
		}
		//sees if the lengths match
		if(input1.length == input2.length && input1.length!=0) {
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

	//reset makes an empty array
	public void reset() {
		double [] dataBlank= new double[0];
		setData(dataBlank);
	}
	//Append adds more to an array. This also overloads and works similarly to the non double set methods.
	public void append (int[] i) {
		int dataNumber = i.length;
		double []d = new double [dataNumber];
		for(int j = 0; j<dataNumber; j++ ) {
			d[j] = (double) i [j];
		}
		append(d);
	}
	public void append (float[] f) {
		int dataNumber = f.length;
		double []d = new double [dataNumber];
		for(int i = 0; i<dataNumber; i++ ) {
			d[i] = (double) f [i];
		}
		append(d);
	}


	public void append (long[] lo) {
		int dataNumber = lo.length;
		double []d = new double [dataNumber];
		for(int i = 0; i<dataNumber; i++ ) {
			d[i] = (double) lo [i];
		}
		append(d);
	}

	public void append (double[] d) {
		if (d==null) {
			double [] blank = new double [0];
			d = blank;
		}
		double[] currentData= getData();
		double newData[] = new double [d.length + currentData.length];
		if(currentData.length!=0) {
			for(int i = 0; i<currentData.length; i++) {
				newData[i] = currentData[i];
			}
		}
		if(d.length!=0) {
			for(int i = currentData.length, j=0;  j<d.length; i++, j++) {
				newData[i] = d[j];
			}
		}
		setData(newData);
	}

	//is empty
	public boolean isEmpty() {
		boolean output = false;
		double [] dataSet= getData();
		if(dataSet.length == 0) {
			output= true;
		}
		return output;
	}

	//to string
	public String toString(){

		double [] input = getData();
		//Starts the toString with a [
		String toString= "[";
		if(input.length !=0) {
			//adds the next numbers and commas
			for (int i=0; i< input.length -1; i++) {
				toString = toString + input[i] + ", ";

			}
			toString+= input[(input.length - 1)] + "]";
		}else {
			toString+= "]";
		}
		return toString;

	}
	//Min code
	public double min(){
		double [] input = getData();
		double min = 0;
		//if it is empty NaN is displayed
		if(isEmpty() == true) {
			min =Double.NaN;
		}else {
			//sees if the next number is less than min.
			min = input[0];
			for (int i=1; i< input.length; i++) {
				if(input[i] < min) {
					min = input[i];
				}
			}
		}
		return min;		
	}
	//Max code
	public double max(){
		double [] input = getData();
		double max;
		//if it is empty NaN is displayed
		if(isEmpty() == true) {
			max =Double.NaN;
		}else {
			max = input[0];
			for (int i=1; i< input.length; i++) {
				if(input[i] > max) {
					max = input[i];
				}
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
		double []input = getData();
		double []counts = new double[input.length];
		double mode= Double.NaN;
		int count;
		//uses occursNumberOfTimes in order to count the amount of times it occurs.
		for( int i = 0; i<input.length; i++) {
			count =0;
			count=occursNumberOfTimes(input[i]);
			//places the number of counts into an array.
			counts[i] =count;

		}
		if(input.length!=0) {
			//makes the smallest highestCount lower that it is.
			double highestCounts = (counts[0] -10);
			double numberHighestCounts=0;
			for (int i=1; i< counts.length; i++) {
				//if a count is higher than the highestCount it is changed and a new mode is set
				if(counts[i] > highestCounts) {
					highestCounts= counts[i];
					mode= input[i];
				}
			}
			//checks to make sure there is only one mode
			for (int i=0; i< input.length; i++) {
				if(counts[i] == mode) {
					numberHighestCounts--;
				}

				if (numberHighestCounts<1) {
					mode=Double.NaN;
				}
			}

			//if there is no length it makes the mode NaN
		}else {
			mode=Double.NaN;
		}
		//if there is only one number it makes that the mode instead of -9.
		if(input.length==1) {
			mode = input[0];
		}
		return mode;
	}

	//occurs number of times
	private int occursNumberOfTimes(double value) {
		double [] input = getData();
		int count= 0;
		for( int i = 0; i<input.length; i++) {
			if (input[i]== value) {
				count++;
			}
		}

		return count;
	}

	//Variance code
	public double variance() {
		double average = average();
		double difference=0;
		double [] values = getData();
		double output = 0;
		//adds up all of the values.
		for (int i = 0; i<values.length; i++) {
			difference= values[i] - average;
			output = output + Math.pow(difference, 2);
		}
		//divides by the amount of values plugged in
		output = output/values.length;
		return output;
	}
	//Standard deviation justs squares the variance.
	public double standardDeviation() {
		double output= variance();
		output=Math.sqrt(output);
		return output;
	}
}

