import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class StatTester {

	static ArrayList<String> deductions = new ArrayList<String>();

	/* 
		Method to test the default Stat constructor and its toString()
		@return the points awarded for this test case
	*/
	public static int testConstructor() {
    int points = 5;
		boolean passed = true;
    List<String> out = new ArrayList<>();

		try {
			Stat test = new Stat();
			if (!test.toString().equals("[]")) {
				passed = false;
        out.add("    data expected = []");
        out.add("    data actual = " + test);
			}
		} catch (Exception e) {
			passed = false;
      out.add("    data expected = []");
      out.add("    data actual = " + e);
		}

		// Awarding points for the test case
	  System.out.print("  Constructor test (default):\t");
		if (!passed) {
			points -= 5;
      System.out.println("FAILED (-5)");
			deductions.add("[-5] : default constructor");
      for (String s : out) {
        System.out.println(s);
      }
		} else {
      System.out.println("PASSED");
    }
    
		return points;
	}

	/*
		Tests a primitive array constructor for the Stat class and its toString() method
		@param test the test Stat object
		@param testArray the array to initialize the Stat object to
		@return the amount of points awarded for this test case
	*/
	public static int testConstructor(double[] primitiveArray) {
	  int points = 5;
		boolean passed = true;
    boolean nullPassed = true;
		double[] testArray = arrayToDouble(primitiveArray);
    String reference = Arrays.toString(testArray);
		String arrayType = "" + primitiveArray.getClass().getComponentType();
    
    List<String> out = new ArrayList<>();
    
		// Testing initialization to primitive array type
    Stat test = null;
		try {
			test = new Stat(primitiveArray);
			// Strings are not equal
			if (!test.toString().replaceAll("\\s", "").equals(reference.replaceAll("\\s", ""))) {
        passed = false;
        out.add("    data1 expected = " + reference);
        out.add("    data1 actual = " + test);
			}
		} catch (Exception e) {
			passed = false;
      out.add("    data1 expected = " + reference);
      out.add("    data1 actual = " + e);
		}
    
		// Awarding points for the test case
		System.out.print("  Constructor test (" + arrayType + "[]):\t");
    if (!passed) {
      points -= 3;     
      System.out.println("FAILED (-3)");
			deductions.add("[-3] : " + arrayType + " constructor");
      for (String s : out) {
        System.out.println(s);
      }
      out.clear();
    } else {
      System.out.println("PASSED");
    }

		// Testing initilization to null
    primitiveArray = null;
		try {
			test = new Stat(primitiveArray);
			if (!test.toString().equals("[]")) {
				nullPassed = false;
        out.add("    data2 expected = []");
        out.add("    data2 actual = " + test);
			}
		} catch (Exception e) {
			nullPassed = false;
      out.add("    data2 expected = []");
      out.add("    data2 actual = " + e);
		}
    
		// Awarding points for the test case
		System.out.print("  Constructor null test (" + arrayType + "[]):\t");
    if (!nullPassed) {
      points -= 2;
      System.out.println("FAILED (-2)");
      deductions.add("[-2] : " + arrayType + " constructor: null array");
      for (String s : out) {
        System.out.println(s);
      }
    } else {
      System.out.println("PASSED");
    }
    
		return points;
	}

	/*
		Tests a primitive array constructor for the Stat class and its toString() method
		@param test the test Stat object
		@param testArray the array to initialize the Stat object to
		@return the amount of points awarded for this test case
	*/
	public static int testConstructor(float[] primitiveArray) {
	  int points = 5;
		boolean passed = true;
    boolean nullPassed = true;
		double[] testArray = arrayToDouble(primitiveArray);
    String reference = Arrays.toString(testArray);
		String arrayType = "" + primitiveArray.getClass().getComponentType();
    
    List<String> out = new ArrayList<>();
    
		// Testing initialization to primitive array type
    Stat test = null;
		try {
			test = new Stat(primitiveArray);
			// Strings are not equal
			if (!test.toString().replaceAll("\\s", "").equals(reference.replaceAll("\\s", ""))) {
        passed = false;
        out.add("    data1 expected = " + reference);
        out.add("    data1 actual = " + test);
			}
		} catch (Exception e) {
			passed = false;
      out.add("    data1 expected = " + reference);
      out.add("    data1 actual = " + e);
		}
    
		// Awarding points for the test case
		System.out.print("  Constructor test (" + arrayType + "[]):\t");
    if (!passed) {
      points -= 3;     
      System.out.println("FAILED (-3)");
			deductions.add("[-3] : " + arrayType + " constructor");
      for (String s : out) {
        System.out.println(s);
      }
      out.clear();
    } else {
      System.out.println("PASSED");
    }

		// Testing initilization to null
    primitiveArray = null;
		try {
			test = new Stat(primitiveArray);
			if (!test.toString().equals("[]")) {
				nullPassed = false;
        out.add("    data2 expected = []");
        out.add("    data2 actual = " + test);
			}
		} catch (Exception e) {
			nullPassed = false;
      out.add("    data2 expected = []");
      out.add("    data2 actual = " + e);
		}
    
		// Awarding points for the test case
		System.out.print("  Constructor null test (" + arrayType + "[]):\t");
    if (!nullPassed) {
      points -= 2;
      System.out.println("FAILED (-2)");
      deductions.add("[-2] : " + arrayType + " constructor: null array");
      for (String s : out) {
        System.out.println(s);
      }
    } else {
      System.out.println("PASSED");
    }
    
		return points;
	}

	/*
		Tests a primitive array constructor for the Stat class and its toString() method
		@param test the test Stat object
		@param testArray the array to initialize the Stat object to
		@return the amount of points awarded for this test case
	*/
	public static int testConstructor(int[] primitiveArray) {
		int points = 5;
		boolean passed = true;
    boolean nullPassed = true;
		double[] testArray = arrayToDouble(primitiveArray);
    String reference = Arrays.toString(testArray);
		String arrayType = "" + primitiveArray.getClass().getComponentType();
    
    List<String> out = new ArrayList<>();
    
		// Testing initialization to primitive array type
    Stat test = null;
		try {
			test = new Stat(primitiveArray);
			// Strings are not equal
			if (!test.toString().replaceAll("\\s", "").equals(reference.replaceAll("\\s", ""))) {
        passed = false;
        out.add("    data1 expected = " + reference);
        out.add("    data1 actual = " + test);
			}
		} catch (Exception e) {
			passed = false;
      out.add("    data1 expected = " + reference);
      out.add("    data1 actual = " + e);
		}
    
		// Awarding points for the test case
		System.out.print("  Constructor test (" + arrayType + "[]):\t\t");
    if (!passed) {
      points -= 3;     
      System.out.println("FAILED (-3)");
			deductions.add("[-3] : " + arrayType + " constructor");
      for (String s : out) {
        System.out.println(s);
      }
      out.clear();
    } else {
      System.out.println("PASSED");
    }

		// Testing initilization to null
    primitiveArray = null;
		try {
			test = new Stat(primitiveArray);
			if (!test.toString().equals("[]")) {
				nullPassed = false;
        out.add("    data2 expected = []");
        out.add("    data2 actual = " + test);
			}
		} catch (Exception e) {
			nullPassed = false;
      out.add("    data2 expected = []");
      out.add("    data2 actual = " + e);
		}
    
		// Awarding points for the test case
		System.out.print("  Constructor null test (" + arrayType + "[]):\t");
    if (!nullPassed) {
      points -= 2;
      System.out.println("FAILED (-2)");
      deductions.add("[-2] : " + arrayType + " constructor: null array");
      for (String s : out) {
        System.out.println(s);
      }
    } else {
      System.out.println("PASSED");
    }
    
		return points;
	}

	/*
		Tests a primitive array constructor for the Stat class and its toString() method
		@param test the test Stat object
		@param testArray the array to initialize the Stat object to
		@return the amount of points awarded for this test case
	*/
	public static int testConstructor(long[] primitiveArray) {
		int points = 5;
		boolean passed = true;
    boolean nullPassed = true;
		double[] testArray = arrayToDouble(primitiveArray);
    String reference = Arrays.toString(testArray);
		String arrayType = "" + primitiveArray.getClass().getComponentType();
    
    List<String> out = new ArrayList<>();
    
		// Testing initialization to primitive array type
    Stat test = null;
		try {
			test = new Stat(primitiveArray);
			// Strings are not equal
			if (!test.toString().replaceAll("\\s", "").equals(reference.replaceAll("\\s", ""))) {
        passed = false;
        out.add("    data1 expected = " + reference);
        out.add("    data1 actual = " + test);
			}
		} catch (Exception e) {
			passed = false;
      out.add("    data1 expected = " + reference);
      out.add("    data1 actual = " + e);
		}
    
		// Awarding points for the test case
		System.out.print("  Constructor test (" + arrayType + "[]):\t");
    if (!passed) {
      points -= 3;     
      System.out.println("FAILED (-3)");
			deductions.add("[-3] : " + arrayType + " constructor");
      for (String s : out) {
        System.out.println(s);
      }
      out.clear();
    } else {
      System.out.println("PASSED");
    }

		// Testing initilization to null
    primitiveArray = null;
		try {
			test = new Stat(primitiveArray);
			if (!test.toString().equals("[]")) {
				nullPassed = false;
        out.add("    data2 expected = []");
        out.add("    data2 actual = " + test);
			}
		} catch (Exception e) {
			nullPassed = false;
      out.add("    data2 expected = []");
      out.add("    data2 actual = " + e);
		}
    
		// Awarding points for the test case
		System.out.print("  Constructor null test (" + arrayType + "[]):\t");
    if (!nullPassed) {
      points -= 2;
      System.out.println("FAILED (-2)");
      deductions.add("[-2] : " + arrayType + " constructor: null array");
      for (String s : out) {
        System.out.println(s);
      }
    } else {
      System.out.println("PASSED");
    }
    
		return points;
	}

	/*
		Helper method to convert a number array of primitive type into a double[] array
	*/
	private static double[] arrayToDouble(double[] array) {
		double[] newArray = new double[array.length];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = (double) array[i];
		}

		return newArray;
	}

	/*
		Helper method to convert a number array of primitive type into a double[] array
	*/
	private static double[] arrayToDouble(float[] array) {
		double[] newArray = new double[array.length];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = (double) array[i];
		}

		return newArray;
	}

	/*
		Helper method to convert a number array of primitive type into a double[] array
	*/
	private static double[] arrayToDouble(int[] array) {
		double[] newArray = new double[array.length];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = (double) array[i];
		}

		return newArray;
	}

	/*
		Helper method to convert a number array of primitive type into a double[] array
	*/
	private static double[] arrayToDouble(long[] array) {
		double[] newArray = new double[array.length];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = (double) array[i];
		}

		return newArray;
	}

	public static int test1() {
		int points = 0;
    
    System.out.println("Test 1 (Constructors):");
        
		double[] testArrayOne = { 5.0, 3.0, 6.0, 10.5, 0 };
		float[] testArrayTwo = { 5.0f, 3.0f, 6.0f, 10.5f, 0 };
		int[] testArrayThree = { 1, 2, 3, 4, 5, 100 };
		long[] testArrayFour = { 1, 2, 3, 4, 5, 100 };

		points += testConstructor();
		System.out.println();
		
		points += testConstructor(testArrayOne);
		System.out.println();

		points += testConstructor(testArrayTwo);
		System.out.println();

		points += testConstructor(testArrayThree);
		System.out.println();

		points += testConstructor(testArrayFour);
		System.out.println();

		return points;
	}

	/*
		Tests the setData method of the Stat class for different primitive type arrays
		@param test the Stat object to be tested
		@param testArray an array of primitive number type to set Stat data
		@return the points awarded for this test case
	*/
	public static int testSetData(double[] primitiveArray) {
		int points = 6;
		boolean part1 = false;
		boolean part2 = false;
		boolean part3 = false;

		String arrayType = "" + primitiveArray.getClass().getComponentType();
    
		double[] testArray = arrayToDouble(primitiveArray);

    Stat test = null;
		try {
			test = new Stat();
		} catch (Exception e) {
      System.out.println("  setData(" + arrayType + "[]) test:\t\tFAILED (-6)");
			System.out.println("    Can't construct Stat object");
			deductions.add("[-6] : setData(" + arrayType + "[]) (no construct)");
			return 0;
		}

    List<String> out = new ArrayList<>();
    
		try {
      test.setData(primitiveArray);
			String testArrayString = Arrays.toString(testArray);
			String before = Arrays.toString(test.getData());
      primitiveArray[0] = 0;
			String after = Arrays.toString(test.getData());
      
			part1 = before.equals(testArrayString);
			part2 = before.equals(after);
      if (!(part1 && part2)) {
        out.add("    data1 expected = " + testArrayString);
        out.add("    data1 actual = " + before);
        out.add("    data2 expected = " + testArrayString);
        out.add("    data2 actual = " + after);
      }
		} catch (Exception e) {
      out.add("    exception = " + e);
    }
    
		// Awarding points for the test case
		System.out.print("  setData(" + arrayType + "[]) test:\t\t");
    if (!(part1 && part2)) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
      out.clear();
    } else {
      System.out.println("PASSED");
    }
    
    primitiveArray = null;
		try {
			test.setData(primitiveArray);
      String after = Arrays.toString(test.getData());
			part3 = after.equals("[]");
      out.add("    data3 expected = []");
      out.add("    data3 actual = " + after);
		} catch (Exception e) {
      out.add("    data3 expected = []");
      out.add("    data3 actual = " + e);
    }

		// Awarding points for the test case
    System.out.print("  setData(" + arrayType + "[]) null test:\t");
    if (!part3) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
    } else {
      System.out.println("PASSED");
    }

		// Adding to deductions for feedback
		if (points != 6) {
			deductions.add("[-" + (6 - points) + "] : setData(" + arrayType + "[])");
		}

		return points;
	}

	/*
		Tests the setData method of the Stat class for different primitive type arrays
		@param test the Stat object to be tested
		@param testArray an array of primitive number type to set Stat data
		@return the points awarded for this test case
	*/
	public static int testSetData(float[] primitiveArray) {
		int points = 6;
		boolean part1 = false;
		boolean part2 = false;
		boolean part3 = false;

		String arrayType = "" + primitiveArray.getClass().getComponentType();
    
		double[] testArray = arrayToDouble(primitiveArray);

    Stat test = null;
		try {
			test = new Stat();
		} catch (Exception e) {
      System.out.println("  setData(" + arrayType + "[]) test:\t\tFAILED (-6)");
			System.out.println("    Can't construct Stat object");
			deductions.add("[-6] : setData(" + arrayType + "[]) (no construct)");
			return 0;
		}

    List<String> out = new ArrayList<>();
    
		try {
      test.setData(primitiveArray);
			String testArrayString = Arrays.toString(testArray);
			String before = Arrays.toString(test.getData());
      primitiveArray[0] = 0;
			String after = Arrays.toString(test.getData());
      
			part1 = before.equals(testArrayString);
			part2 = before.equals(after);
      if (!(part1 && part2)) {
        out.add("    data1 expected = " + testArrayString);
        out.add("    data1 actual = " + before);
        out.add("    data2 expected = " + testArrayString);
        out.add("    data2 actual = " + after);
      }
		} catch (Exception e) {
      out.add("    exception = " + e);
    }
    
		// Awarding points for the test case
		System.out.print("  setData(" + arrayType + "[]) test:\t\t");
    if (!(part1 && part2)) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
      out.clear();
    } else {
      System.out.println("PASSED");
    }
    
    primitiveArray = null;
		try {
			test.setData(primitiveArray);
      String after = Arrays.toString(test.getData());
			part3 = after.equals("[]");
      out.add("    data3 expected = []");
      out.add("    data3 actual = " + after);
		} catch (Exception e) {
      out.add("    data3 expected = []");
      out.add("    data3 actual = " + e);
    }

		// Awarding points for the test case
    System.out.print("  setData(" + arrayType + "[]) null test:\t");
    if (!part3) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
    } else {
      System.out.println("PASSED");
    }

		// Adding to deductions for feedback
		if (points != 6) {
			deductions.add("[-" + (6 - points) + "] : setData(" + arrayType + "[])");
		}

		return points;
	}

	/*
		Tests the setData method of the Stat class for different primitive type arrays
		@param test the Stat object to be tested
		@param testArray an array of primitive number type to set Stat data
		@return the points awarded for this test case
	*/
	public static int testSetData(int[] primitiveArray) {
		int points = 6;
		boolean part1 = false;
		boolean part2 = false;
		boolean part3 = false;

		String arrayType = "" + primitiveArray.getClass().getComponentType();
    
		double[] testArray = arrayToDouble(primitiveArray);

    Stat test = null;
		try {
			test = new Stat();
		} catch (Exception e) {
      System.out.println("  setData(" + arrayType + "[]) test:\t\tFAILED (-6)");
			System.out.println("    Can't construct Stat object");
			deductions.add("[-6] : setData(" + arrayType + "[]) (no construct)");
			return 0;
		}

    List<String> out = new ArrayList<>();
    
		try {
      test.setData(primitiveArray);
			String testArrayString = Arrays.toString(testArray);
			String before = Arrays.toString(test.getData());
      primitiveArray[0] = 0;
			String after = Arrays.toString(test.getData());
      
			part1 = before.equals(testArrayString);
			part2 = before.equals(after);
      if (!(part1 && part2)) {
        out.add("    data1 expected = " + testArrayString);
        out.add("    data1 actual = " + before);
        out.add("    data2 expected = " + testArrayString);
        out.add("    data2 actual = " + after);
      }
		} catch (Exception e) {
      out.add("    exception = " + e);
    }
    
		// Awarding points for the test case
		System.out.print("  setData(" + arrayType + "[]) test:\t\t");
    if (!(part1 && part2)) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
      out.clear();
    } else {
      System.out.println("PASSED");
    }
    
    primitiveArray = null;
		try {
			test.setData(primitiveArray);
      String after = Arrays.toString(test.getData());
			part3 = after.equals("[]");
      out.add("    data3 expected = []");
      out.add("    data3 actual = " + after);
		} catch (Exception e) {
      out.add("    data3 expected = []");
      out.add("    data3 actual = " + e);
    }

		// Awarding points for the test case
    System.out.print("  setData(" + arrayType + "[]) null test:\t\t");
    if (!part3) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
    } else {
      System.out.println("PASSED");
    }

		// Adding to deductions for feedback
		if (points != 6) {
			deductions.add("[-" + (6 - points) + "] : setData(" + arrayType + "[])");
		}

		return points;
	}

	/*
		Tests the setData method of the Stat class for different primitive type arrays
		@param test the Stat object to be tested
		@param testArray an array of primitive number type to set Stat data
		@return the points awarded for this test case
	*/
	public static int testSetData(long[] primitiveArray) {
		int points = 6;
		boolean part1 = false;
		boolean part2 = false;
		boolean part3 = false;

		String arrayType = "" + primitiveArray.getClass().getComponentType();
    
		double[] testArray = arrayToDouble(primitiveArray);

    Stat test = null;
		try {
			test = new Stat();
		} catch (Exception e) {
      System.out.println("  setData(" + arrayType + "[]) test:\t\tFAILED (-6)");
			System.out.println("    Can't construct Stat object");
			deductions.add("[-6] : setData(" + arrayType + "[]) (no construct)");
			return 0;
		}

    List<String> out = new ArrayList<>();
    
		try {
      test.setData(primitiveArray);
			String testArrayString = Arrays.toString(testArray);
			String before = Arrays.toString(test.getData());
      primitiveArray[0] = 0;
			String after = Arrays.toString(test.getData());
      
			part1 = before.equals(testArrayString);
			part2 = before.equals(after);
      if (!(part1 && part2)) {
        out.add("    data1 expected = " + testArrayString);
        out.add("    data1 actual = " + before);
        out.add("    data2 expected = " + testArrayString);
        out.add("    data2 actual = " + after);
      }
		} catch (Exception e) {
      out.add("    exception = " + e);
    }
    
		// Awarding points for the test case
		System.out.print("  setData(" + arrayType + "[]) test:\t\t");
    if (!(part1 && part2)) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
      out.clear();
    } else {
      System.out.println("PASSED");
    }
    
    primitiveArray = null;
		try {
			test.setData(primitiveArray);
      String after = Arrays.toString(test.getData());
			part3 = after.equals("[]");
      out.add("    data3 expected = []");
      out.add("    data3 actual = " + after);
		} catch (Exception e) {
      out.add("    data3 expected = []");
      out.add("    data3 actual = " + e);
    }

		// Awarding points for the test case
    System.out.print("  setData(" + arrayType + "[]) null test:\t");
    if (!part3) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
    } else {
      System.out.println("PASSED");
    }

		// Adding to deductions for feedback
		if (points != 6) {
			deductions.add("[-" + (6 - points) + "] : setData(" + arrayType + "[])");
		}

		return points;
	}

	public static int test2() {
		int points = 0;
        
    System.out.println("Test 2 (setData):");
        
		double[] testArrayOne = { 5.0, 3.0, 6.0, 10.5, 0 };
		float[] testArrayTwo = { 5.0f, 3.0f, 6.0f, 10.5f, 0 };
		int[] testArrayThree = { 1, 2, 3, 4, 5, 100 };
		long[] testArrayFour = { 1, 2, 3, 4, 5, 100 };

		points += testSetData(testArrayOne);
		System.out.println();
		
		points += testSetData(testArrayTwo);
		System.out.println();
		
		points += testSetData(testArrayThree);
		System.out.println();
		
		points += testSetData(testArrayFour);
		System.out.println();
    
		return points;
	}

	private static double[] append(double[] initial, double[] added) {
		int size = initial.length + added.length;
		double[] newArray = new double[size];

		for (int i = 0; i < initial.length; i++) {
			newArray[i] = initial[i];
		}

		for (int i = 0; i < added.length; i++) {
			newArray[i + initial.length] = added[i];
		}

		return newArray;
	}

	/*
		Tests the append function for the Stat class for different primitive number array types
		@param test the Stat object being manipulated
		@param primitiveArray the array to be appended
		@return int the points awarded for this test case
	*/
	public static int testAppendData(double[] primitiveArray) {
		int points = 6;
		boolean passed = true;
		boolean nullPassed = true;
		double[] initialArray = { 1, 2, 3, 4 };

		String arrayType = "" + primitiveArray.getClass().getComponentType();

		double[] testArray = arrayToDouble(primitiveArray);
		double[] combinedArray = append(initialArray, testArray);
    String reference = Arrays.toString(combinedArray);

    List<String> out = new ArrayList<>();
    
		// Appending an array
    Stat test = null;
		try {
			test = new Stat(initialArray);
			test.append(primitiveArray);
      
			if (!test.toString().replaceAll("\\s", "").equals(reference.replaceAll("\\s", ""))) {
				passed = false;
        out.add("    data1 expected = " + reference);
        out.add("    data1 actual = " + test);
			}
		} catch (Exception e) {
			passed = false;
      out.add("    data1 expected = " + reference);
      out.add("    data1 actual = " + e);
		}

		// Awarding points for the test case
    System.out.print("  append(" + arrayType + "[]) test:\t\t");
    if (!passed) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
      out.clear();
    } else {
      System.out.println("PASSED");
    }

		// Testing appending a null array
    primitiveArray = null;
		try {
			test.append(primitiveArray);
			if (!test.toString().replaceAll("\\s", "").equals(reference.replaceAll("\\s", ""))) {
				nullPassed = false;
        out.add("    data2 expected = " + reference);
        out.add("    data2 actual = " + test);
			}
		} catch (Exception e) {
			nullPassed = false;
      out.add("    data2 expected = " + reference);
      out.add("    data2 actual = " + e);
		}
    
		// Awarding points for the test case
    System.out.print("  append(" + arrayType + "[]) null test:\t");
    if (!nullPassed) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
    } else {
      System.out.println("PASSED");
    }

		// Adding to deductions for feedback
		if (points != 6) {
			deductions.add("[-" + (6 - points) + "] : append(" + arrayType + "[])");
		}

		return points;
	}

	/*
		Tests the append function for the Stat class for different primitive number array types
		@param test the Stat object being manipulated
		@param primitiveArray the array to be appended
		@return int the points awarded for this test case
	*/
	public static int testAppendData(float[] primitiveArray) {
		int points = 6;
		boolean passed = true;
		boolean nullPassed = true;
		double[] initialArray = { 1, 2, 3, 4 };

		String arrayType = "" + primitiveArray.getClass().getComponentType();

		double[] testArray = arrayToDouble(primitiveArray);
		double[] combinedArray = append(initialArray, testArray);
    String reference = Arrays.toString(combinedArray);

    List<String> out = new ArrayList<>();
    
		// Appending an array
    Stat test = null;
		try {
			test = new Stat(initialArray);
			test.append(primitiveArray);
      
			if (!test.toString().replaceAll("\\s", "").equals(reference.replaceAll("\\s", ""))) {
				passed = false;
        out.add("    data1 expected = " + reference);
        out.add("    data1 actual = " + test);
			}
		} catch (Exception e) {
			passed = false;
      out.add("    data1 expected = " + reference);
      out.add("    data1 actual = " + e);
		}

		// Awarding points for the test case
    System.out.print("  append(" + arrayType + "[]) test:\t\t");
    if (!passed) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
      out.clear();
    } else {
      System.out.println("PASSED");
    }

		// Testing appending a null array
    primitiveArray = null;
		try {
			test.append(primitiveArray);
			if (!test.toString().replaceAll("\\s", "").equals(reference.replaceAll("\\s", ""))) {
				nullPassed = false;
        out.add("    data2 expected = " + reference);
        out.add("    data2 actual = " + test);
			}
		} catch (Exception e) {
			nullPassed = false;
      out.add("    data2 expected = " + reference);
      out.add("    data2 actual = " + e);
		}
    
		// Awarding points for the test case
    System.out.print("  append(" + arrayType + "[]) null test:\t");
    if (!nullPassed) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
    } else {
      System.out.println("PASSED");
    }

		// Adding to deductions for feedback
		if (points != 6) {
			deductions.add("[-" + (6 - points) + "] : append(" + arrayType + "[])");
		}

		return points;
	}

	/*
		Tests the append function for the Stat class for different primitive number array types
		@param test the Stat object being manipulated
		@param primitiveArray the array to be appended
		@return int the points awarded for this test case
	*/
	public static int testAppendData(int[] primitiveArray) {
		int points = 6;
		boolean passed = true;
		boolean nullPassed = true;
		double[] initialArray = { 1, 2, 3, 4 };

		String arrayType = "" + primitiveArray.getClass().getComponentType();

		double[] testArray = arrayToDouble(primitiveArray);
		double[] combinedArray = append(initialArray, testArray);
    String reference = Arrays.toString(combinedArray);

    List<String> out = new ArrayList<>();
    
		// Appending an array
    Stat test = null;
		try {
			test = new Stat(initialArray);
			test.append(primitiveArray);
      
			if (!test.toString().replaceAll("\\s", "").equals(reference.replaceAll("\\s", ""))) {
				passed = false;
        out.add("    data1 expected = " + reference);
        out.add("    data1 actual = " + test);
			}
		} catch (Exception e) {
			passed = false;
      out.add("    data1 expected = " + reference);
      out.add("    data1 actual = " + e);
		}

		// Awarding points for the test case
    System.out.print("  append(" + arrayType + "[]) test:\t\t");
    if (!passed) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
      out.clear();
    } else {
      System.out.println("PASSED");
    }

		// Testing appending a null array
    primitiveArray = null;
		try {
			test.append(primitiveArray);
			if (!test.toString().replaceAll("\\s", "").equals(reference.replaceAll("\\s", ""))) {
				nullPassed = false;
        out.add("    data2 expected = " + reference);
        out.add("    data2 actual = " + test);
			}
		} catch (Exception e) {
			nullPassed = false;
      out.add("    data2 expected = " + reference);
      out.add("    data2 actual = " + e);
		}
    
		// Awarding points for the test case
    System.out.print("  append(" + arrayType + "[]) null test:\t\t");
    if (!nullPassed) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
    } else {
      System.out.println("PASSED");
    }

		// Adding to deductions for feedback
		if (points != 6) {
			deductions.add("[-" + (6 - points) + "] : append(" + arrayType + "[])");
		}

		return points;
	}

	/*
		Tests the append function for the Stat class for different primitive number array types
		@param test the Stat object being manipulated
		@param primitiveArray the array to be appended
		@return int the points awarded for this test case
	*/
	public static int testAppendData(long[] primitiveArray) {
		int points = 6;
		boolean passed = true;
		boolean nullPassed = true;
		double[] initialArray = { 1, 2, 3, 4 };

		String arrayType = "" + primitiveArray.getClass().getComponentType();

		double[] testArray = arrayToDouble(primitiveArray);
		double[] combinedArray = append(initialArray, testArray);
    String reference = Arrays.toString(combinedArray);

    List<String> out = new ArrayList<>();
    
		// Appending an array
    Stat test = null;
		try {
			test = new Stat(initialArray);
			test.append(primitiveArray);
      
			if (!test.toString().replaceAll("\\s", "").equals(reference.replaceAll("\\s", ""))) {
				passed = false;
        out.add("    data1 expected = " + reference);
        out.add("    data1 actual = " + test);
			}
		} catch (Exception e) {
			passed = false;
      out.add("    data1 expected = " + reference);
      out.add("    data1 actual = " + e);
		}

		// Awarding points for the test case
    System.out.print("  append(" + arrayType + "[]) test:\t\t");
    if (!passed) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
      out.clear();
    } else {
      System.out.println("PASSED");
    }

		// Testing appending a null array
    primitiveArray = null;
		try {
			test.append(primitiveArray);
			if (!test.toString().replaceAll("\\s", "").equals(reference.replaceAll("\\s", ""))) {
				nullPassed = false;
        out.add("    data2 expected = " + reference);
        out.add("    data2 actual = " + test);
			}
		} catch (Exception e) {
			nullPassed = false;
      out.add("    data2 expected = " + reference);
      out.add("    data2 actual = " + e);
		}
    
		// Awarding points for the test case
    System.out.print("  append(" + arrayType + "[]) null test:\t\t");
    if (!nullPassed) {
      points -= 3;
      System.out.println("FAILED (-3)");
      for (String s : out) {
        System.out.println(s);
      }
    } else {
      System.out.println("PASSED");
    }

		// Adding to deductions for feedback
		if (points != 6) {
			deductions.add("[-" + (6 - points) + "] : append(" + arrayType + "[])");
		}

		return points;
	}

	public static int test3() {
		int points = 0;
    
    System.out.println("Test 3 (append):");
    
		double[] testArrayOne = { 5, 6, 7, 8, 9 };
		float[] testArrayTwo = { 50, 6, 7, 8, 9 };
		int[] testArrayThree = { 500, 6, 7, 8, 9 };
		long[] testArrayFour = { 5000, 6, 7, 8, 9 };

		points += testAppendData(testArrayOne);
		System.out.println();
		
		points += testAppendData(testArrayTwo);
		System.out.println();
		
		points += testAppendData(testArrayThree);
		System.out.println();
		
		points += testAppendData(testArrayFour);
		System.out.println();
    
		return points;
	}

	private static int test4() {
		int points = 3;
		boolean dataPassed = true;
		boolean emptyPassed = true;

    System.out.println("Test 4 (reset and isEmpty):");
    
		double[] testArrayOne = { 1, 2, 3, 4 };
    String reference = Arrays.toString(testArrayOne);

    List<String> out = new ArrayList<>();
    
		Stat test = null;
		try {
			test = new Stat(testArrayOne);
			if (!test.toString().replaceAll("\\s", "").equals(reference.replaceAll("\\s", ""))) {
				dataPassed = false;
        out.add("    data1 expected = " + reference);
        out.add("    data1 actual = " + test);
			}
		} catch (Exception e) {
			dataPassed = false;
      out.add("    data1 expected = " + reference);
      out.add("    data1 actual = " + test);
		}
    
		// Awarding points for the test case
    System.out.print("  Data initialization test:\t\t");
    if (!dataPassed) {
      points -= 2;
      System.out.println("FAILED (-2)");
      for (String s : out) {
        System.out.println(s);
      }
      out.clear();
    } else {
      System.out.println("PASSED");
    }

    try {
			test.reset();
			if (!test.isEmpty()) {
				emptyPassed = false;
        out.add("    is empty expected: true");
        out.add("    is empty actual: " + test.isEmpty());
			}
    } catch (Exception e) {
      emptyPassed = false;
        out.add("    is empty expected: true");
        out.add("    is empty actual: " + e);
    }
    
		// Awarding points for the test case
    System.out.print("  isEmpty() test:\t\t\t");
    if (!emptyPassed) {
      points -= 1;
      System.out.println("FAILED (-1)");
      for (String s : out) {
        System.out.println(s);
      }
    } else {
      System.out.println("PASSED");
    }

		// Adding to deductions for feedback
		if (points != 3) {
			deductions.add("[-" + (3 - points) + "] : reset() and isEmpty()");
		}

		return points;
	}

	private static int test5() {
		int points = 12;
    
    System.out.print("Test 5 (null stats test):\t\t");

    Stat test = null;
    try {
      double[] data = null;
      test = new Stat(data);
    } catch (Exception e) {
			System.out.println("FAILED (-12)\n  Can't construct Stat object");
			deductions.add("[-12] : stats with null data (no construct)");
      return 0;
    }

    List<String> out = new ArrayList<>();
    
		try {
			if (!Double.isNaN(test.min())) {
				points -= 2;
        out.add("  min expected:\tNaN");
        out.add("  min actual:\t" + test.min());
				deductions.add("[-2] : min() with null stats");
			}
    } catch (Exception e) {
      points -= 2;
      out.add("  min expected:\tNaN");
      out.add("  min actual:\t" + e);
      deductions.add("[-2] : min() with null stats");
    }

    try {
			if (!Double.isNaN(test.max())) {
				points -= 2;
        out.add("  max expected:\tNaN");
        out.add("  max actual:\t" + test.max());
				deductions.add("[-2] : max() with null stats");
			}
    } catch (Exception e) {
      points -= 2;
      out.add("  max expected:\tNaN");
      out.add("  max actual:\t" + e);
      deductions.add("[-2] : max() with null stats");
    }

    try {
			if (!Double.isNaN(test.average())) {
				points -= 2;
        out.add("  avg expected:\tNaN");
        out.add("  avg actual:\t" + test.average());
				deductions.add("[-2] : average() with null stats");
			}
    } catch (Exception e) {
      points -= 2;
      out.add("  avg expected:\tNaN");
      out.add("  avg actual:\t" + e);
      deductions.add("[-2] : average() with null stats");
    }

    try {
			if (!Double.isNaN(test.mode())) {
				points -= 2;
        out.add("  mode expected:\tNaN");
        out.add("  mode actual:\t" + test.mode());
				deductions.add("[-2] : mode() with null stats");
			}
    } catch (Exception e) {
      points -= 2;
      out.add("  mode expected:\tNaN");
      out.add("  mode actual:\t" + e);
      deductions.add("[-2] : mode() with null stats");
    }

    try {
			if (!Double.isNaN(test.variance())) {
				points -= 2;
        out.add("  var expected:\tNaN");
        out.add("  var actual:\t" + test.variance());
				deductions.add("[-2] : variance() with null stats");
			}
    } catch (Exception e) {
      points -= 2;
      out.add("  var expected:\tNaN");
      out.add("  var actual:\t" + e);
      deductions.add("[-2] : variance() with null stats");
    }

    try {
			if (!Double.isNaN(test.standardDeviation())) {
				points -= 2;
        out.add("  stdev expected:\tNaN");
        out.add("  stdev actual:\t" + test.standardDeviation());
				deductions.add("[-2] : standardDeviation() with null stats");
			}
		} catch (Exception e) {
      points -= 2;
      out.add("  stdev expected:\tNaN");
      out.add("  stdev actual:\t" + e);
      deductions.add("[-2] : standardDeviation() with null stats");
		}

    if (!out.isEmpty()) {
      System.out.println("FAILED (-" + (12 - points) + ")");
      for (String s : out) {
        System.out.println(s);
      }
    } else {
      System.out.println("PASSED");
    }

		return points;
	}

	private static int test6() {
		int points = 12;
    
    System.out.print("Test 6 (stats test):\t\t");
    
    Stat test = null;
    try {
			double[] data = { -5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5,
                        -90, 88.9, 100.34, 50.01, 50.01, -8 };
			test = new Stat(data);
    } catch (Exception e) {
			System.out.println("FAILED (-12)\n  Can't construct Stat object");
			deductions.add("[-12] : stats with real data (no construct)");
      return 0;
    }

    List<String> out = new ArrayList<>();
    
		try {
      double min = test.min();
      if (Math.abs(min + 90) > 1e-5) {
        points -= 2;
        out.add("  min expected:\t-90");
        out.add("  min actual:\t" + min);
				deductions.add("[-2] : min()");
      }
    } catch (Exception e) {
      points -= 2;
      out.add("  min expected:\t-90");
      out.add("  min actual:\t" + e);
      deductions.add("[-2] : min()");
    }
    
    try {
      double max = test.max();
			if (Math.abs(max - 109.5) > 1e-5) {
				points -= 2;
        out.add("  max expected:\t109.5");
        out.add("  max actual:\t" + max);
				deductions.add("[-2] : max()");
			}
    } catch (Exception e) {
      points -= 2;
      out.add("  max expected:\t109.5");
      out.add("  max actual:\t" + e);
      deductions.add("[-2] : max()");
    }

    try {
      double avg = test.average();
			if (Math.abs(avg - 34.684) > 1e-5) {
				points -= 2;
        out.add("  avg expected:\t34.684");
        out.add("  avg actual:\t" + avg);
				deductions.add("[-2] : average()");
			}
    } catch (Exception e) {
      points -= 2;
      out.add("  avg expected:\t34.684");
      out.add("  avg actual:\t" + e);
      deductions.add("[-2] : average()");
    }

    try {
      double mode = test.mode();
			if (Math.abs(mode - 88.9) > 1e-5) {
				points -= 2;
        out.add("  mode expected:\t88.9");
        out.add("  mode actual:\t" + mode);
				deductions.add("[-2] : mode()");
			}
    } catch (Exception e) {
      points -= 2;
      out.add("  mode expected:\t88.9");
      out.add("  mode actual:\t" + e);
      deductions.add("[-2] : mode()");
    }

    try {
      double var = test.variance();
			if (Math.abs(var - 2798.6591973333334) > 1e-5) {
				points -= 2;
        out.add("  var expected:\t2798.6591973333334");
        out.add("  var actual:\t" + var);
				deductions.add("[-2] : variance()");
			}
    } catch (Exception e) {
      points -= 2;
      out.add("  var expected:\t2798.6591973333334");
      out.add("  var actual:\t" + e);
      deductions.add("[-2] : variance()");
    }
    
    try {
      double stdev = test.standardDeviation();
			if (Math.abs(stdev - 52.90235530988515) > 1e-5) {
				points -= 2;
        out.add("  stdev expected:\t52.90235530988515");
        out.add("  stdev actual:\t" + stdev);
				deductions.add("[-2] : standardDeviation()");
			}
		} catch (Exception e) {
      points -= 2;
      out.add("  stdev expected:\t52.90235530988515");
      out.add("  stdev actual:\t" + e);
      deductions.add("[-2] : standardDeviation()");
    }

    if (!out.isEmpty()) {
      System.out.println("FAILED (-" + (12 - points) + ")");
      for (String s : out) {
        System.out.println(s);
      }
    } else {
      System.out.println("PASSED");
    }

		return points;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int total = 0;

		total += test1();
		System.out.println();

		total += test2();
		System.out.println();

		total += test3();
		System.out.println();

		total += test4();
		System.out.println();

		total += test5();
		System.out.println();

		total += test6();
		System.out.println();

    System.out.println("-----------\n");
    
		for (String deduction : deductions) {
			System.out.println(deduction);
		}
    System.exit(100 - total);
	}
}
