/*
 * Stat.java
 * Author:  Natalia Gonzalez
 * Submission Date:  April 10 2021
 *
 * Purpose: This program will be defining your own classes, implementing class called Stat using a UML class
 * diagram.
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
 */ class Stat 
{
    double[]data;
    
    public Stat()
    {
        data = new double[1];
        data[0] = 0.0;
    }
    
    public Stat(double[] d)
    {
        double[]newArray = new double[d.length];
        for(int i=0; i<d.length; i++)
        {
            newArray[i] = d[i];
        }
        data = newArray;
    }
    
    public double[] getData()
    {
        double[]newArray = new double[data.length];
        for(int i=0; i<data.length; i++)
        {
            newArray[i] = data[i];
        }
        return newArray;
    }
    
    public void setData(double[] d)
    {
        double[]newArray = new double[d.length];
        for(int i=0; i<d.length; i++)
        {
            newArray[i] = d[i];
        }
        data = newArray;
    }
     
    public boolean equals(Stat s)
    {
        if(data.length != s.data.length)
        {
            return false;
        }
        else
        {
            for(int i=0; i<data.length; i++)
            {
                if(data[i] != s.data[i])
                {
                    return false;
                }
            }
            return true;
        }
    }
    
    public String toString()
    {
        String str = "[";
        for(int i=0; i<data.length; i++)
        {
            str += Double.toString(data[i]);
            if((i+1) != data.length)
            {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
    
    public double min()
    {
        double min = data[0];
        for(int i=1; i<data.length; i++)
        {
            if(min > data[i])
            {
                min = data[i];
            }
        }
        return min;
    }
    
    public double max()
    {
        double max = data[0];
        for(int i=1; i<data.length; i++)
        {
            if(max < data[i])
            {
                max = data[i];
            }
        }
        return max;
    }
    
    public double average()
    {
        double sum = 0.0;
        for(int i=0; i<data.length; i++)
        {
            sum += data[i];
        }
        double average = sum/data.length;
        return average;
    }
    
    public double mode()
    {
        Stat temp = new Stat(data);//temporary object so that original array is not changed
        int length = temp.data.length;
        //sort temporary array first
        for (int i=0; i<length; i++) 
        {
            for (int j=i+1; j<length; j++) { 
                if (temp.data[i] > temp.data[j]) 
                {
                    double helper = temp.data[i];
                    temp.data[i] = temp.data[j];
                    temp.data[j] = helper;
                }
            }
        }
        System.out.println(temp.toString());
        double mode = temp.data[0];
        int maxCount = 0, currentCount = 0;
        boolean isMaximumPresent = true;
        for(int i=0; i<length; i++)
        {
            if(temp.data[i] !=  mode)
            {
                if(currentCount > maxCount)
                {
                    mode = temp.data[i-1];
                    maxCount = currentCount;
                    currentCount = 1;  
                    isMaximumPresent = true;
                }
                else if (currentCount == maxCount)
                {
                    isMaximumPresent = false;
                    currentCount = 1;
                    mode = temp.data[i-1];
                }
            }
            else
            {
                currentCount++;
            }
        }
        if (isMaximumPresent)
            return mode;
        else
            return Double.NaN;
     }
     
    public static void main(String[] args) {
        
        //======================================Example 1==============================================
        double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9};
        double[] data2 = {100.34, 50.01, 50.01, -8};
        Stat stat1 = new Stat();
        System.out.println("stat1 data = " + stat1.toString());
        stat1 = new Stat(data);
        System.out.println("stat1 has been altered.");
        System.out.println("stat1 data = " + stat1.toString());
        System.out.println("stat1 min = " + stat1.min());
        System.out.println("stat1 max = " + stat1.max());
        System.out.println("stat1 average = " + stat1.average());
        System.out.println("stat1 mode = " + stat1.mode() + "\n");
        Stat stat2 = new Stat();
        stat2.setData(data2);
        Stat stat3 = new Stat(stat1.getData());
        System.out.println("stat2 data = " + stat2.toString());
        System.out.println("stat3 data = " + stat3.toString());
        System.out.println();
        System.out.println("stat1 is equal to stat2 using \"equals()\"? " +
        stat1.equals(stat2));
        System.out.println("stat1 is equal to stat3 using \"equals()\"? " +
        stat1.equals(stat3));
        System.out.println("stat1 is equal to stat3 using \"==\"? " + (stat1 == stat3));
        //=============================================================================================
        
        //======================================Example 2==============================================
//        double[] data = {10.0, 20.0, 30.0};
//        Stat stat1 = new Stat(data);
//        data[0] = 100.0;
//        data[1] = 200.0;
//        data[2] = 300.0;
//        Stat stat2 = new Stat(data);
//        System.out.println("stat1 data = " + stat1.toString());
//        System.out.println("stat2 data = " + stat2.toString());
//        System.out.println("The two arrays should be different");
        //=============================================================================================
        
        //======================================Example 3==============================================
//        double[] data1 = {10.0, 20.0, 30.0};
//        Stat stat1 = new Stat(data1);
//        double[] data2 = stat1.getData();
//        System.out.println("The arrays are identical: " + (data1 == data2));
        //=============================================================================================
        
        //======================================Example 4==============================================
//        double[] data1 = {10.0, 20.0, 30.0};
//        Stat stat1 = new Stat();
//        stat1.setData(data1);
//        Stat stat2 = new Stat(data1);
//        double[] data2 = stat1.getData();
//        System.out.println("The arrays are identical: " + (data1 == data2));
//        System.out.println("stat2 equals stat1: " +
//        stat2.equals(stat1));
//        System.out.println("stat1 equals stat2: " + stat2.equals(stat1));
        //=============================================================================================
        
        //======================================Example 5==============================================
//        Stat stat1 = new Stat();
//        System.out.println("stat1 data = " + stat1.toString());
//        System.out.println("stat1 min = " + stat1.min());
//        System.out.println("stat1 max = " + stat1.max());
//        System.out.println("stat1 average = " + stat1.average());
//        System.out.println("stat1 mode = " + stat1.mode());
//        System.out.println("stat1 data = " + stat1.toString());
        //=============================================================================================
        
        //======================================Example 6==============================================
//        double[] data = {1,2,2,3,3,4};
//        Stat stat1 = new Stat(data);
//        System.out.println("stat1 data = " + stat1.toString());
//        System.out.println("stat1 min = " + stat1.min());
//        System.out.println("stat1 max = " + stat1.max());
//        System.out.println("stat1 average = " + stat1.average());
//        System.out.println("stat1 mode = " + stat1.mode());
//        System.out.println("stat1 data = " + stat1.toString());
        //=============================================================================================
        
    }
}
