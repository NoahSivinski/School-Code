
public class Stat {

	//variable
	private double[] data;

	// default constructor
	public Stat() {
		data = new double[] { 0.0 };

	}

	// constructor
	public Stat(double[] d) {
		double data[] = new double[d.length];
		for (int i = 0; i < d.length; i++)
			data[i] = d[i];

	}

	// accessor method
	public double[] getData() {
		double Data[] = new double[data.length];
		for (int i = 0; i < data.length; i++)
			Data[i] = data[i];
		return Data;

	}

	// mutator method
	public void setData(double[] d) {
		double newData[] = new double[d.length];
		for (int i = 0; i < d.length; i++)
			newData[i] = d[i];
		for (int i = 0; i < newData.length; i++)
			data[i] = newData[i];

	}

	// equals method
	public boolean equals(Stat s) {
		boolean elementsMatch = true;
		if (s.getData().length != data.length) {
			elementsMatch = false;
		} else {
			int i = 0;
			while (elementsMatch && (i < s.getData().length)) {
				if (s.getData()[i] != data[i]) {
					elementsMatch = false;
				}
				i++;
			}
		}
		return elementsMatch;

	}

	// toString method
	public String toString() {
		String arrayData = "";
		for (int i = 0; i < data.length; i++) {
			if (i == data.length - 1)
				arrayData += data[i];
			else
				arrayData += data[i] + ",";
		}
		return "[" + arrayData + "]";
	}

	// min method
	public double min() {
		double min;
		min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] < min)
				min = data[i];
		}
		return min;
	}

	// max method
	public double max() {
		double max;
		max = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max)
				max = data[i];
		}
		return max;
	}

	// average method
	public double average() {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = sum + data[i];
		}
		double average = sum / data.length;

		return average;
	}

	// mode method
	public double mode() {
		double mode = 0;
		double iteration = 1;
		for (int i = 0; i < data.length; i++) {
			int value = 0;
			for (int j = i; j < data.length; j++) {
				if (Math.abs(data[i] - data[j]) <= 0.001)
					value++;
			}
			if (value > iteration) {
				mode = data[i];
				iteration = value;
			} else if (value == iteration) {
				mode = Double.NaN;
			}
			return mode;
		}
		return Double.NaN;

	}

}
