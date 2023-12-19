import java.util.*;

/*
 * Stat.java
 * Author:  Joshua Wyatt
 * Submission Date:  4/16/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This is a program done last week and modified as we added stat float,
 * stat int, stat long, setData float, setData int, setData long, reset,
 * append int, append float, append long, append double, isEmpty, 
 * occursNumberOFTimes double value int, variance double, standardDeviation double.
 * After these all were implemented in the program the program was re run with 
 * the new implementation for this program.
 * In this program we implement a class called Stat that takes the
 * min, max, mode, and average of values implemented by a main method
 * Get and set methods are also used in this program in order to get
 * or set the values that is implemented and held by data. This program 
 * also sets parameters and the different various types of possible 
 * returns for methods with the specific fields. There are also public
 * and private methods implemented. A main method is implemented by the
 * user and computed.
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
    public static void main(String[] args){
//	Insert the main method here depending on what user wants to be
//  outputed. Insert main method below

    }
    
	private double data[];
	
	public Stat() {
		data = new double[] {};
	}
	
	public Stat(double [] d){
		data = new double[d.length];
		for(int i=0;i<d.length;i++){
			data[i] = d[i];
		}
		
	}
	public Stat(float [] d){
		data = new double[d.length];
		for(int i=0;i<d.length;i++){
			data[i] = (double)d[i];
		}
		
	}
	public Stat(int [] d){
		data = new double[d.length];
		for(int i=0;i<d.length;i++){
			data[i] = (double)d[i];
		}
		
	}
	public Stat(long [] d){
		data = new double[d.length];
		for(int i=0;i<d.length;i++){
			data[i] = (double)d[i];
		}
		
	}
//	get data code shown
	public double[] getData(){
		double temp[] = new double[data.length];
		for(int i=0;i<data.length;i++){
			temp[i] = data[i];
		}
		return temp;
	}
//	set data code shown
	public void setData(double [] d){
		if (d==null) {
			data=new double[] {};
			return;
		}
		data = new double[d.length];
		for(int i=0;i<d.length;i++){
			data[i] = d[i];
		}
	}
//	setData float code shown
	public void setData(float [] d){
		if (d==null) {
			data=new double[] {};
			return;
		}
		data = new double[d.length];
		for(int i=0;i<d.length;i++){
			data[i] = (double)d[i];
		}
	}
//	setData int code shown

	public void setData(int [] d){
		if (d==null) {
			data=new double[] {};
			return;
		}
		data = new double[d.length];
		for(int i=0;i<d.length;i++){
			data[i] = (double)d[i];
		}
	}
//	setData long code shown

	public void setData(long [] d){
		if (d==null) {
			data=new double[] {};
			return;
		}
		data = new double[d.length];
		for(int i=0;i<d.length;i++){
			data[i] = (double)d[i];
		}
	}
//	equals code shown as a boolean
	public boolean equals(Stat s){
		if (s==null && data != null) {
			return false;
		}
		if(data.length != s.getData().length){
			return false;
		}
		
		for(int i=0;i<data.length;i++){
			if(data[i] != s.getData()[i]){
				return false;
			}
		}
		return true;
	}
//	reset code shown below
	public void reset() {
		data = new double[0];
	}
//	append double code shown below
	public void append(double[] d) {
		if(d==null) {
			return;
		}
		double [] temp = new double[d.length+data.length];
		for (int i=0;i<data.length;i++) {
			temp [i]=data [i];
		}
		for (int i=data.length;i<data.length+d.length;i++) {
			temp [i]=d [i-data.length];
		}
		data = temp;
	}
//	append int code shown below

	public void append(int[] i) {
		if(i==null) {
			return;
		}
		double [] temp = new double[i.length+data.length];
		for (int j=0;j<data.length;j++) {
			temp [j]=data [j];
		}
		for (int j=data.length;j<data.length+i.length;j++) {
			temp [j]=i [j-data.length];
		}
		data = temp;
	}
//	append float code shown below

	public void append(float[] f) {
		if(f==null) {
			return;
		}
		double [] temp = new double[f.length+data.length];
		for (int i=0;i<data.length;i++) {
			temp [i]=data [i];
		}
		for (int i=data.length;i<data.length+f.length;i++) {
			temp [i]=f [i-data.length];
		}
		data = temp;
	}
//	append long code shown below

	public void append(long[] lo) {
		if(lo==null) {
			return;
		}
		double [] temp = new double[lo.length+data.length];
		for (int i=0;i<data.length;i++) {
			temp [i]=data [i];
		}
		for (int i=data.length;i<data.length+lo.length;i++) {
			temp [i]=(double )lo [i-data.length];
		}
		data = temp;
	}
//	isEmpty command is shown below
	public boolean isEmpty() {
		if (data.length==0)
			return true;
		return false;
	}
//	occursNumbersOfTimes code listed below
	public int occursNumberOfTimes(double value) {
		int count = 0;
		for (int i=0;i<data.length;i++) {
			if (data[i]-value<0.001) {
				count++;
			}
			
		}
		return count;		
	}
//	Variance code calculated and listed below
	public double variance() {
		if (data.length==0)
			return Double.NaN;
		 double sum =0;
		 for(int i=0;i<data.length;i++){
		 	sum+=data[i];
		 }
		 double mean =sum/data.length;
		 double diff = 0;

		  for(int i=0;i<data.length;i++){
		 	diff+=(data[i]-mean)*(data[i]-mean);
		 }
		  double variation = diff/data.length;
		  return variation;
		   
	}
//	standardDeviation calculated and shown below
	public double standardDeviation() {
		if (data.length==0)
			return Double.NaN;
		return Math.sqrt(variance());
		
	}
//	toString listed code
	public String toString(){
		String output = "[";
		for(int i=0;i<data.length-1;i++){
			output+=" "+String.valueOf(data[i])+",";
		}
		if(data.length>0){
			output+=" "+String.valueOf(data[data.length-1]);
		}

		return output+"]";
	}
//	min code listed below
	public double min(){
		if (data.length==0)
			return Double.NaN;
		double min = data[0];
		for(int i=1;i<data.length;i++){
			if(data[i]<min){
				min = data[i];
			}
		}
		return min;
	}
//	max code listed
	public double max(){
		if (data.length==0)
			return Double.NaN;
		double max = data[0];
		for(int i=1;i<data.length;i++){
			if(data[i]>max){
				max = data[i];
			}
		}
		return max;
	}
//	code to get average listed
	public double average(){
		if (data.length==0)
			return Double.NaN;
		double sum = data[0];
		for(int i=1;i<data.length;i++){
		sum+=data[i];
		}
		return sum/data.length;
	}
//	code to get mode listed below
	public double mode(){
	    if(data.length==1){
	return data[0];
	    }
	        HashMap<String, Integer> map = new HashMap<String, Integer>();

	   for(int i=0;i<data.length;i++){
	   		Object value = map.get(String.valueOf(data[i]));
			if (value == null) {
			    map.put(String.valueOf(data[i]), 1);
			} else{
				map.put(String.valueOf(data[i]), map.get(String.valueOf(data[i]))+ 1);
			}

	   }
	           Map<String, Integer> hm1 = sortByValue(map);
	    double result=0.0;
	    boolean temp = true;
	    double result1=0.0;
	    int resultCount =0;
	    int result1Count =0;
	   for (Map.Entry<String, Integer> en : hm1.entrySet()) {
	   	if(temp){
	   		temp = false;
            result = Double.parseDouble(en.getKey());
            resultCount = en.getValue();
  
	   	}else {
	   	temp = true;
	   		result1 = Double.parseDouble(en.getKey());
	   		result1Count = en.getValue();
	   	}
        }
//	   System.out.println(result);
//	   System.out.println(result1);
	if(resultCount==result1Count){
		return Double.NaN;
	}
	if(temp){
		return result1;
	}


	return result;
	}
 // function to sort hashmap by values
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
  
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1, 
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
          
        // put data from sorted list to hashmap 
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

	
}
