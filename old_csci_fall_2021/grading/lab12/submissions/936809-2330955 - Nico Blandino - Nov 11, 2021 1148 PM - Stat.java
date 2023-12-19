/*
 * Stat.java
 * Author:  Nicolas Blandino 
 * Submission Date:  11/11/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * Basically this has all of the methods that were required
 * and you can punch in the test main methods in place of the one I had there.
 * This is pretty much just a modified version of last weeks assignment
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

        
        public Stat() {
                super();
                data = new double[0];
        }

        
        public Stat(double[] d) {
                super();
                this.data = new double[d.length];
                for (int i = 0; i < d.length; i++) {
                        this.data[i] = d[i];
                }
        }

        
        public Stat(float[] f) {
                super();
                this.data = new double[f.length];
                for (int i = 0; i < f.length; i++) {
                        this.data[i] = f[i];
                }
        }

        
        public Stat(int[] i) {
                super();
                this.data = new double[i.length];
                for (int j = 0; j < i.length; j++) {
                        this.data[j] = i[j];
                }
        }

        
        public Stat(long[] lo) {
                super();
                this.data = new double[lo.length];
                for (int i = 0; i < lo.length; i++) {
                        this.data[i] = lo[i];
                }
        }

        /**
         * @param data
         */
        public void setData(double[] d) {
                this.data = new double[d.length];
                for (int i = 0; i < d.length; i++) {
                        this.data[i] = d[i];
                }
        }

        
        public void setData(float[] f) {
                this.data = new double[f.length];
                for (int i = 0; i < f.length; i++) {
                        this.data[i] = f[i];
                }
        }

       
        public void setData(int[] i) {
                this.data = new double[i.length];
                for (int j = 0; j < i.length; j++) {
                        this.data[j] = i[j];
                }
        }

       
        public void setData(long[] lo) {
                this.data = new double[lo.length];
                for (int i = 0; i < lo.length; i++) {
                        this.data[i] = lo[i];
                }
        }

       
        public void append(double[] d) {
                if (d != null) {
                        int newLength = d.length + data.length, i = 0;
                        double[] newData = new double[newLength];
                        for (i = 0; i < data.length; i++) {
                                newData[i] = data[i];
                        }
                        for (int j = 0; j < d.length; j++) {
                                newData[i++] = d[j];
                        }
                        data = newData;
                }
        }

        
        public void append(float[] f) {
                if (f != null) {
                        int newLength = f.length + data.length, i = 0;
                        double[] newData = new double[newLength];
                        for (i = 0; i < data.length; i++) {
                                newData[i] = data[i];
                        }
                        for (int j = 0; j < f.length; j++) {
                                newData[i++] = f[j];
                        }
                        data = newData;
                }
        }

      
        public void append(int[] i) {
                if (i != null) {
                        int newLength = i.length + data.length, j = 0;
                        double[] newData = new double[newLength];
                        for (j = 0; j < data.length; j++) {
                                newData[j] = data[j];
                        }
                        for (int k = 0; k < i.length; k++) {
                                newData[j++] = i[k];
                        }
                        data = newData;
                }
        }

        
        public void append(long[] lo) {

                if (lo != null) {
                        int newLength = lo.length + data.length, i = 0;
                        double[] newData = new double[newLength];
                        for (i = 0; i < data.length; i++) {
                                newData[i] = data[i];
                        }
                        for (int j = 0; j < lo.length; j++) {
                                newData[i++] = lo[j];
                        }
                        data = newData;
                }
        }

        public double[] getData() {

                double[] returnData = data;

                return returnData;
        }

        public boolean equals(Stat obj) {

                if (obj == null) {
                        return false;
                }
                if (data.length != obj.data.length)
                        return false;
                for (int i = 0; i < data.length; i++) {
                        if (data[i] != obj.data[i]) {
                                return false;
                        }
                }
                return true;
        }

        public void reset() {

                data = new double[0];
        }

        public boolean isEmpty() {

                if (data.length == 0)
                        return true;
                return false;

        }

        
        public String toString() {

                StringBuilder str = new StringBuilder();
                str.append("[");
                for (int i = 0; i < data.length; i++) {
                        str.append(data[i]);
                        if (i != data.length - 1) {
                                str.append(", ");
                        }
                }
                str.append("]");
                return str.toString();
        }

        public double min() {

                if (data.length == 0)
                        return Double.NaN;
                double minNum = data[0];
                for (int i = 0; i < data.length; i++) {
                        if (minNum > data[i]) {
                                minNum = data[i];
                        }
                }
                return minNum;
        }

        public double max() {

                if (data.length == 0)
                        return Double.NaN;
                double maxNum = data[0];
                for (int i = 0; i < data.length; i++) {
                        if (maxNum < data[i]) {
                                maxNum = data[i];
                        }
                }
                return maxNum;
        }

        public double average() {

                if (data.length == 0)
                        return Double.NaN;
                double sum = 0;
                for (int i = 0; i < data.length; i++) {
                        sum += data[i];
                }
                return sum / data.length;
        }

        public double mode() {

                int maxCount = 0, i;
                double maxValue = 0;
                boolean isNaN = true;

                for (i = 0; i < data.length; ++i) {

                        int count = occursNumberOfTimes(data[i]);
                        if (count > maxCount) {
                                maxCount = count;
                                maxValue = data[i];
                                isNaN = false;
                        } else if (count == maxCount && data[i] != maxValue) {
                                isNaN = true;
                        }
                }
                if (isNaN) {
                        return Double.NaN;
                }
                return maxValue;
        }

        private int occursNumberOfTimes(double value) {

                int count = 0;
                for (int i = 0; i < data.length; i++) {
                        if (data[i] == value)
                                count++;
                }
                return count;

        }

        public double variance() {

                if (data.length == 0)
                        return Double.NaN;

                double variance = 0, mean;
                mean = average();
                double sumOfDiffSquare = 0;

                for (int i = 0; i < data.length; i++) {
                        sumOfDiffSquare += (mean - data[i]) * (mean - data[i]);
                }

                variance = sumOfDiffSquare / data.length;
                return variance;
        }

        public double standardDeviation() {

                if (data.length == 0)
                        return Double.NaN;

                double stDev = 0;

                stDev = Math.sqrt(variance());
                return stDev;

        }



   public static void main(String[] args) {
	   
	   double[] data1 = {};
	   double[] data2 = { 25 };
	   float[] data3 = {};
	   float[] data4 = { 25 };
	   int[] data5 = {};
	   int[] data6 = { 50 };
	   long[] data7 = {};
	   long[] data8 = { 12 };
	   Stat stat1 = new Stat();
	   stat1.append(data1);
	   stat1.append(data2);
	   stat1.append(data3);
	   stat1.append(data4);
	   stat1.append(data5);
	   stat1.append(data6);
	   stat1.append(data7);
	   stat1.append(data8);
	   data1 = null;
	   stat1.append(data1);
	   System.out.println("stat1 data = " + stat1.toString());
	   System.out.println("stat1 min = " + stat1.min());
	   System.out.println("stat1 max = " + stat1.max());
	   System.out.println("stat1 average = " + stat1.average());
	   System.out.println("stat1 mode = " + stat1.mode());
	   System.out.println("stat1 variance = " + stat1.variance());
	   System.out.println("stat1 standard deviation = " + stat1.standardDeviation() + "\n");
   }

}