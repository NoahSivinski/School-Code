/*
 * Stat.java
 * Author: Mamadou Ly
 * Submission Date: 4/15/2021
 *
 * Purpose: This is the same as last weeks lab except it will add various new methods.
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
	
	private double data[];
	
	public Stat() {
		data = new double[0];
	}
	
	public Stat(double[] d) {
		double[] newArray = new double[d.length];
	    for (int i = 0; i < d.length; i++) {
	    	newArray[i] = d[i];
	    }
	    data = newArray;
	}
	
	public Stat(float[] f) {
		double[] newArray = new double[f.length];
	    for (int i = 0; i < f.length; i++) {
	    	newArray[i] = (double)(f[i]);
	    }
	    data = newArray;
	}
	
	public Stat(int[] i) {
		double[] newArray = new double[i.length];
	    for (int j = 0; j < i.length; j++) {
	    	newArray[j] = (double)(i[j]);
	    }
	    data = newArray;
	}
	
	public Stat(long[] lo) {
		double[] newArray = new double[lo.length];
	    for (int i = 0; i < lo.length; i++) {
	    	newArray[i] = (double)(lo[i]);
	    }
	    data = newArray;
	}
	
	public void setData(float[] f) {
		if (f != null) {
			double[] newArray = new double[f.length];
			for (int i=0;i<f.length;i++) {
				newArray[i] = f[i];
			}
			data = newArray;
		}
		else 
			data = new double[0];
	}
			
	public void setData(double[] d) {
		if (d != null) {
			double[] newArray = new double[d.length];
			for (int i=0;i<d.length;i++) {
				newArray[i] = d[i];
			}
			data = newArray;
		}
		else 
			data = new double[0];
	}
	
	public void setData(int[] i) {
		if (i != null) {
			double[] newArray = new double[i.length];
			for (int j=0;j<i.length;j++) {
				 newArray[j] = i[j];
			 }
			 data = newArray;
		}
		else
			data = new double[0];

	}
	
	public void setData(long[] lo) {
		if (lo != null) {
			double[] newArray = new double[lo.length];
			for (int i=0;i<lo.length;i++) {
				 newArray[i] = lo[i];
			 }
			 data = newArray;
		}
		else 
			data = new double [0];
	}
	
	public double[] getData() {
		double[] newArray = new double[data.length];
	    for (int i = 0; i < data.length; i++) {
	    	newArray[i] = data[i];
	    }
	    return newArray;
	}
	 
	public boolean equals(Stat s) {
		if (s!= null) {
			double sdata[] = s.getData();
			if (data.length != sdata.length) {
				return false;
			}
			for (int i=0;i<data.length;i++) {
				if (data[i]!= sdata[i])
					return false; 
			}
		}
		else {
			return false;
		}	
		return true;
	}
	
	public void reset() {
		double[] newArray = new double[0];
		data = newArray;
	}
	
	public void append(int[] i) {
        if (i != null) {
           int newArrayLength = data.length;
           double[] newArray = new double[data.length];
           for (int j = 0; j < data.length; j++) {
        	   newArray[j] = data[j];
            }
            data = new double[data.length + i.length];
            for (int j=0; j<data.length;j++) {
                if(j < newArrayLength) {
                   data[j] = newArray[j];
            }
            else {
               data[j] = (double) i[j-newArrayLength];
             }
            }
        }
	}
	
	public void append(float[] f) {
        if (f != null) {
           int newArrayLength = data.length;
           double[] newArray = new double[data.length];
           for (int i = 0; i < data.length; i++) {
        	   newArray[i] = data[i];
            }
            data = new double[data.length + f.length];
            for (int i=0; i<data.length;i++) {
                if(i < newArrayLength) {
                   data[i] = newArray[i];
            }
            else {
               data[i] = (double) f[i-newArrayLength];
             }
            }
        }
	}
	
	public void append(long[] lo) {
        if (lo != null) {
           int newArrayLength = data.length;
           double[] newArray = new double[data.length];
           for (int i = 0; i < data.length; i++) {
        	   newArray[i] = data[i];
            }
            data = new double[data.length + lo.length];
            for (int i=0; i<data.length;i++) {
                if(i < newArrayLength) {
                   data[i] = newArray[i];
            }
            else {
               data[i] = (double) lo[i-newArrayLength];
             }
            }
        }
	}
	
	public void append(double[] d) {
        if (d != null) {
           int newArrayLength = data.length;
           double[] newArray = new double[data.length];
           for (int i = 0; i < data.length; i++) {
        	   newArray[i] = data[i];
            }
            data = new double[data.length + d.length];
            for (int i=0; i<data.length;i++) {
                if(i < newArrayLength) {
                   data[i] = newArray[i];
            }
            else {
               data[i] = (double) d[i-newArrayLength];
             }
            }
        }
	}
	
	public boolean isEmpty() {
		if (data.length==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String arrayData = "";
		for (int i=0;i<data.length;i++) {
			if (i == data.length - 1) {
				arrayData += data[i]; 
			}
			else {
				arrayData += data[i] + ", ";
			}
		}
		return "[" + arrayData + "]";
	 }
	 
	 public double min() {
		 if (data.length > 0) {
			 double min = data[0];
			 for (int i=1;i<data.length;i++) {
				 if (data[i] < min) {
					 min = data[i];
				 }
			 }
			 return min;
		 }
		 else 
			 return Double.NaN;
	 }
	 
	 public double max() {
		 if (data.length>0) {
			 double max = data[0];
			 for (int i=1;i<data.length;i++) {
				 if (data[i] > max) {
					 max = data[i];
				 }
			 }
			 return max;
		 }
		 else 
			 return Double.NaN;
	 }
	 
	 public double average() {
		 double sum = 0.0;
		 for (int i=0;i<data.length;i++) {
			 sum += data[i];
		 }
		  if (data != null)
			  return sum/data.length;
		  else
			  return Double.NaN;
	 }
	 
	 public double mode() {
		 double maxNumber = 0.0;
		 int maxNumberCount = 0;
		 for (int i=0;i<data.length;i++) {
			 int count = 0;
			 for (int j=0;j<data.length;j++) {
				 if (data[i] == data[j]) {
					 count++;
				 }
			 }
			 if (count > maxNumberCount) {
				 maxNumberCount = count;
				 maxNumber = data[i];
			 }
			 else if (count== maxNumberCount && Math.abs(maxNumber - data[i]) > 0.000000001){
				 maxNumber = Double.NaN;
			 }
		 }
		 return maxNumber;
	 }
	 
	 public double variance() {
		 double average = 0;
		 for (int i=0;i<data.length;i++) {
			 average = average + data[i];
		 }
		 average = average/data.length;
		 double vari = 0;
		 for (int i=0;i<data.length;i++) {
			 vari = vari + Math.pow(data[i]-average, 2);
		 }
		 return vari/data.length;
	 }
	 
	 public double standardDeviation() {
		 if (data!=null) {
			 double variance = variance();
			 return Math.sqrt(variance);
		 }
		 else
			 return Double.NaN;
	 }
	 
	public static void main(String[] args) {
		
	 }
	
	 
}