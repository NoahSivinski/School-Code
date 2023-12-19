/*
 * Stat.java
 * Author:  Alice Szymkiewicz
 * Submission Date:  04/15/2021
 *
 * Purpose: 
 * 
 * This program is an expansion of the Stat class. This new 
 * version of the class overloads the setData method and class
 * constructors. Methods that use arrays of int, long, float 
 * values as parameters and handle null parameters are created 
 * such as append. These methods are invoked with a null parameter 
 * The double array is still used to store values and the Main 
 * driver class uses the return values from Stat to print. The 
 * program also is modified to allow a data array of 0 elements 
 * by modifying min & max methods to return Double.Nan. The new
 * methods variance and standardDeviation also allow the program 
 * to compute the variance and standard deviation of the stored 
 * data values in the double array by using if-else statements and 
 * for loops. The occursNumberOfTimes uses a for loop to return the 
 * number of times the value occurs in the array. 
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

  private double[] data;
  public static final double THRESHOLD = 0.000000001;

  public Stat() {
    double[] start = new double[0];
    data = start;
  }

  public Stat(double[] d) {
    if (d != null) {
      double[] doubleCopy = new double[d.length];
      for (int i=0; i<d.length; i++) {
        doubleCopy[i] = d[i];
      }
      data = doubleCopy;
    }
    else {
      double[] doubleCopy = new double[0];
      data = doubleCopy;
    }
  }

  public Stat(float[] f) {
    if (f != null) {
      double[] floatCopy = new double[f.length];
      for (int i=0; i<f.length; i++) {
        floatCopy[i] = f[i];
      }
      data = floatCopy;
    }
    else {
      double[] doubleCopy = new double[0];
      data = doubleCopy;
    }
  }

  public Stat(int[] i) {
    if (i != null) {
      double[] intCopy = new double[i.length];
      for (int q=0; q<i.length; q++) {
        intCopy[q] = i[q];
      }
      data = intCopy;
    }
    else {
      double[] doubleCopy = new double[0];
      data = doubleCopy;
    }
  }

  public Stat(long[] lo) {
    if (lo != null) {
      double[] longCopy = new double[lo.length];
      for (int q=0; q<lo.length; q++) {
        longCopy[q] = lo[q];
      }
      data = longCopy;
    }
    else {
      double[] doubleCopy = new double[0];
      data = doubleCopy;
    }
  }

  public double[] getData() {
    double[] getCopy = new double[data.length];
    for (int f=0; f<data.length; f++) {
      getCopy[f] = data[f];
    }
    return getCopy;
  }

  public void setData(float[] f) {
    if (f != null) {
      double[] setFloatCopy = new double[f.length];
      for (int k=0; k<f.length; k++) {
        setFloatCopy[k] = f[k];
      }
      data = setFloatCopy;
    }
    else {
      double[] doubleCopy = new double[0];
      data = doubleCopy;
    }
  }

  public void setData(double[] d) {
    if (d != null) {
      double[] setDoubleCopy = new double[d.length];
      for (int k=0; k<d.length; k++) {
        setDoubleCopy[k] = d[k];
      }
      data = setDoubleCopy;
    }
    else {
      double[] doubleCopy = new double[0];
      data = doubleCopy;
    }
  }

  public void setData(int[] i) {
    if (i != null) {
      double[] setIntCopy = new double[i.length];
      for (int k=0; k<i.length; k++) {
        setIntCopy[k] = i[k];
      }
      data = setIntCopy;
    }
    else {
      double[] doubleCopy = new double[0];
      data = doubleCopy;
    }
  }

  public void setData(long[] lo) {
    if (lo != null) {
      double[] setLongCopy = new double[lo.length];
      for (int k=0; k<lo.length; k++) {
        setLongCopy[k] = lo[k];
      }
      data = setLongCopy;
    }
    else {
      double[] doubleCopy = new double[0];
      data = doubleCopy;
    }
  }

  public boolean equals(Stat s) {
    if (s != null) {
      if ((s.getData().length)==data.length) {
        for (int j=0; j<data.length; j++) {
            if(!(Math.abs((s.getData()[j])-data[j]) < THRESHOLD)) {
              return false;
            }
          }
          return true;
        }
      else {
        return false;
      }
    }
    else {
      return false;
    }
  }

  public void reset() {
    double[] resetArray = new double[0];
    data = resetArray;
  }

  public void append(int[] i) {
    if (i != null) {
      double[] appendIntCopy = new double[data.length+i.length];
      for (int k=0; k<data.length; k++) {
        appendIntCopy[k] = data[k];
      }
      for (int s=data.length; s<(data.length+i.length); s++) {
        appendIntCopy[s] = i[s-data.length];
      }
      data = appendIntCopy;
      }
  }

  public void append(float[] f) {
    if (f != null) {
      double[] appendFloatCopy = new double[data.length+f.length];
      for (int k=0; k<data.length; k++) {
        appendFloatCopy[k] = data[k];
      }
      for (int s=data.length; s<(data.length+f.length); s++) {
        appendFloatCopy[s] = f[s-data.length];
      }
      data = appendFloatCopy;
      }
  }

  public void append(long[] lo) {
    if (lo != null) {
      double[] appendLongCopy = new double[data.length+lo.length];
      for (int k=0; k<data.length; k++) {
        appendLongCopy[k] = data[k];
      }
      for (int s=data.length; s<(data.length+lo.length); s++) {
        appendLongCopy[s] = lo[s-data.length];
      }
      data = appendLongCopy;
      }
  }

  public void append(double[] d) {
    if (d != null) {
      double[] appendDoubleCopy = new double[data.length+d.length];
      for (int k=0; k<data.length; k++) {
        appendDoubleCopy[k] = data[k];
      }
      for (int s=data.length; s<(data.length+d.length); s++) {
        appendDoubleCopy[s] = d[s-data.length];
      }
      data = appendDoubleCopy;
      }
  }
  
  public boolean isEmpty() {
    if(data.length == 0)
    {
      return true;
    }
    else{
      return false;
    }
  }
  
  public String toString() {
    String printStatement = "[";
    for (int a=0; a<data.length; a++) {
      printStatement+=data[a];
      if (!(a==(data.length-1))) {
      printStatement+=", ";
      }
    }
    printStatement+="]";
    return printStatement;
  }

  public double min() {
    if (data.length > 0) {
      double min = data[0]; 
      for(int b=1; b<data.length; b++){ 
        if(data[b] < min){ 
          min = data[b]; 
        } 
      }
      return min; 
    }
    else {
      return Double.NaN;
    }
  }

  public double max() {
    if (data.length > 0) {
      double max = data[0]; 
      for(int c=1; c<data.length; c++){ 
        if(data[c] > max){ 
          max = data[c]; 
        }
      }
      return max; 
    }
    else {
      return Double.NaN;
    }
  }
  
  public double average() {
    if (data.length > 0) {
      double sum = 0;
      for (int h=0; h<data.length; h++) {
        sum+=data[h];
      }
      return (sum/data.length);
    }
    else {
      return Double.NaN;
    }
  }

  public double mode() {
    double maxNum = 0;
    int maxCount = 0;
    for (int x=0; x<data.length; x++) {
        int count = 0;
        count = this.occursNumberOfTimes(data[x]);

         if (count > maxCount) {
            maxCount = count;
            maxNum = data[x];
         }
      }
      if (maxCount>1) {
        return maxNum;
      }
      else {
        return Double.NaN;
      }
  }
  
  private int occursNumberOfTimes(double value){
    int count = 0;
    for (int y=0; y<data.length; y++) {
      if(value==data[y]) {
        count++;
      }
    }
    return count;
  }
  
  public double variance(){
    if (data.length > 0) {
      double sum = 0;
      for (int m=0; m<data.length; m++) {
        sum+=Math.pow((Math.abs(this.average()-data[m])), 2);
      }
      return sum/data.length;
    }
    else {
      return Double.NaN;
    }
  }

  public double standardDeviation(){
    if(data.length > 0) {
      return Math.sqrt(this.variance());
    }
    else {
      return Double.NaN;
    }
  }
}