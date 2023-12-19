import java.util.*;

/*
 * Stat.java
 * Author:  Joshua Wyatt
 * Submission Date:  4/10/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
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
		data = new double[]{0.0};
	}
	public Stat(double [] d){
		data = new double[d.length];
		for(int i=0;i<d.length;i++){
			data[i] = d[i];
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
		data = new double[d.length];
		for(int i=0;i<d.length;i++){
			data[i] = d[i];
		}
	}
//	equals code shown as a boolean
	public boolean equals(Stat s){
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
	   for (Map.Entry<String, Integer> en : hm1.entrySet()) {
	   	if(temp){
	   		temp = false;
            result = Double.parseDouble(en.getKey());
	   	}else {
	   	temp = true;
	   		result1 = Double.parseDouble(en.getKey());
	   	}
        }

	if(result-result1<0.01){
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
