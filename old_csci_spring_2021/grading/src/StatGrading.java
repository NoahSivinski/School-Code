import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author MitchWilson
 * 
 *         Designed for use by the Computer Science department at the University
 *         of Georgia, Athens, GA, USA for grading of CSCI 1301 lab submissions.
 *         Any publishing or posting of source code from this file is strictly
 *         prohibited unless you have written consent from the Department of
 *         Computer Science at the University of Georgia.
 * 
 * @version 3.2 - Jan 2018
 * 
 **v3.2 - separated graders for lab 12 and lab 13 to allow students to
 *			run the tester for lab 12 without having access to the test cases
 *         	for lab 13
 * 
 **v3.1 - added ability for students to show the stack trace of errors
 *          to aid in debugging; source code cleaned to remove repetitive
 *          try-catch
 * 
 **v3.0 - modified Lab 13 tests to provide specific feedback about
 *          individual tests, allowing the output to be copied directly into eLC
 *          (already a feature in Lab 12 tests); changed Lab 13 tests to double
 *          instead of boolean return; the entire program will now run with
 *          feedback about every sub-test instead of an error causing a test to
 *          terminate; also added comments to translate the reflection method
 *          calls into "normal" java that is easier to read when debugging
 * 
 **v2.2 - improved use of reflection to handle more incorrect possible
 *          classes; this version released alongside StatMethodCheck which
 *          serves to prevent incorrect methods in the Stat class pro-actively
 *          before the Stat class is executed with StatTester
 * 
 **v2.0 - added reflection and exception handling to decrease
 *			likelihood of crash when grading as well as allowing StatTester to
 *          execute with an incomplete Stat class. This version prevented
 *          compilation errors within StatTester due to incorrect method
 *          signatures or missing methods in the Stat class which allowed the
 *          grading to proceed more efficiently
 *
 **v1 - combined testers for lab 12 and lab 13
 *
 *  	NOTE: when viewing output, the cause of the error will be displayed,
 *          but in order to keep the output compact this program defaults to not
 *          show the stack trace of any errors to the TA's; by changing the
 *          boolean variable, students can have the stack trace shown. 
 *          
 *          Change the variable <code>printStackTrace</code> to <code>false</code>
 *          if you are wanting the program to "crash" and allow you to step through
 *          the errors
 * 
 * 
 */
public class StatGrading {

	// TA's should leave this as false in order to streamline grading output
	// students are encouraged to change this to true in order to help debug
	private static boolean printStackTrace = false;

	/**
	 * Test for Lab 12 test 1 NOTE that lab 12 tests are all-or-nothing, so
	 * method returns a boolean
	 * 
	 * @return <code>true</code> if the test is passed, <code>false</code>
	 *         otherwise
	 */
	private static boolean test1() {
		boolean passed = true;

    System.out.println("Test 1: Default constructor and toString()");

		// objects to be used in Test 1
		Method toStringMethod = null;
		Constructor<Stat> defaultConstructor = null;
		Stat stat1 = null;
		String reference = null, result = null;

		try {
			defaultConstructor = Stat.class.getConstructor();
		} catch (Exception e) { /* default constructor will remain null */ }

		try {
			toStringMethod = Stat.class.getMethod("toString", (Class<?>[]) null);
		} catch (NoSuchMethodException e) { /* to String will remain null */ }

		try {
			stat1 = (Stat) defaultConstructor.newInstance();
		} catch (Exception e) { /* stat1 will remain null */ }

		// Test 1
		try {
			// this is equivalent to: result = stat1.toString();
			result = (String) toStringMethod.invoke(stat1);
			
			reference = "[0.0]";
			passed = (result.equals(reference));
      if (!passed)
        System.out.println("  Test Passed: " + passed + "\t -> expected: " + reference + " \t found: " + result);

		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  Test Passed: " + false + "\t -> expected: [0.0] \t found: " + e.getCause());
			passed = false;
		}
		return passed;
	}

	/**
	 * Test for Lab 12 test 2 NOTE that lab 12 tests are all-or-nothing, so
	 * method returns a boolean
	 * 
	 * @return <code>true</code> if the test is passed, <code>false</code>
	 *         otherwise
	 */
	private static boolean test2() {
		boolean passed = true;

    System.out.println("Test 2: Stat(double[] d) constructor and toString()");

		Constructor<Stat> dArrayConstructor = null;
		Method toStringMethod = null;
		double[] data1 = { 1, 2, 3, 4, 5 };
		Stat stat1 = null;
		String result = null, reference = "[1.0, 2.0, 3.0, 4.0, 5.0]";

		try {
			dArrayConstructor = Stat.class.getConstructor(double[].class);
		} catch (Exception e) { /* double array constructor will remain null */ }

		try {
			toStringMethod = Stat.class.getMethod("toString", (Class<?>[]) null);
		} catch (NoSuchMethodException e) { /* to string method will remain null */ }

		try {
			stat1 = dArrayConstructor.newInstance(new Object[] { data1 });
		} catch (Exception e) { /* stat1 will remain null */ }

		// Test 2
		try {
			// this line is equivalent to: result = stat1.toString();
			result = (String) toStringMethod.invoke(stat1);

			passed = result.equals(reference);
      if (!passed)
        System.out.println("  Test Passed: " + passed + "\t -> expected: " + reference + " found: " + result);

		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  Test Passed: " + false + "\t -> expected: " + reference + " found: " + e.getCause());
			passed = false;
		}
		return passed;
	}

	/**
	 * Test for Lab 12 test 3 NOTE that lab 12 tests are all-or-nothing, so
	 * method returns a boolean
	 * 
	 * @return <code>true</code> if the test is passed, <code>false</code>
	 *         otherwise
	 */
	private static boolean test3() {
		boolean passed = true;

    System.out.println("Test 3: Min test");

		Constructor<Stat> dArrayConstructor = null;
		Method minMethod = null;
		Stat stat1 = null, stat2 = null, stat3 = null;

		try {
			dArrayConstructor = Stat.class.getConstructor(double[].class);
		} catch (Exception e) { /* double constructor will remain null */ }

		try {
			minMethod = Stat.class.getMethod("min", (Class<?>[]) null);
		} catch (NoSuchMethodException e) { /* min will remain null */ }

		double min = -20;
		double[] data1 = { min, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		double[] data2 = { 1, 2, 3, 4, 5, min, 6, 7, 8, 9, 0 };
		double[] data3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, min };

		try {
			// this line is equivalent to: stat1 = new Stat(data1)
			stat1 = dArrayConstructor.newInstance(new Object[] { data1 });
		} catch (Exception e) { /* stat1 will remain null */ }

		try {
			// this line is equivalent to: stat2 = new Stat(data2)
			stat2 = dArrayConstructor.newInstance(new Object[] { data2 });
		} catch (Exception e) { /* stat2 will remain null */ }

		try {
			// this line is equivalent to: stat3 = new Stat(data3)
			stat3 = dArrayConstructor.newInstance(new Object[] { data3 });
		} catch (Exception e) { /* stat3 will remain null */ }

		// Test 3.1
		try {
			// this line is equivalent to: min1 = stat1.min();
			double min1 = (double) minMethod.invoke(stat1);
			
			passed = (min == min1);
      if (!passed)
        System.out.println("  Test Passed: " + (min == min1) + "\t -> expected: " + min + " \tfound: " + min1);

		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  Test Passed: " + false + "\t -> expected: " + min + " \tfound: " + e.getCause());
			passed = false;
		}

		// Test 3.2
		try {
			// this line is equivalent to: min2 = stat2.min();
			double min2 = (double) minMethod.invoke(stat2);
			
			passed = passed && (min == min2);
      if (!passed)
        System.out.println("  Test Passed: " + (min == min2) + "\t -> expected: " + min + " \tfound: " + min2);

		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  Test Passed: " + false + "\t -> expected: " + min + " \tfound: " + e.getCause());
			passed = false;
		}

		// Test 3.3
		try {
			// this line is equivalent to: min3 = stat3.min();
			double min3 = (double) minMethod.invoke(stat3);
			
			passed = passed && (min == min3);
      if (!passed)
        System.out.println("  Test Passed: " + (min == min3) + "\t -> expected: " + min + " \tfound: " + min3);

		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  Test Passed: " + false + "\t -> expected: " + min + " \tfound: " + e.getCause());
			passed = false;
		}

		return passed;
	}

	/**
	 * Test for Lab 12 test 4 NOTE that lab 12 tests are all-or-nothing, so
	 * method returns a boolean
	 * 
	 * @return <code>true</code> if the test is passed, <code>false</code>
	 *         otherwise
	 */
	private static boolean test4() {
		System.out.println("Test 4: Max test");
		boolean passed = true;

		Constructor<Stat> dArrayConstructor = null;
		Method maxMethod = null;
		Stat stat1 = null, stat2 = null, stat3 = null;

		try {
			dArrayConstructor = Stat.class.getConstructor(double[].class);
		} catch (Exception e) { /* double constructor will remain null */ }

		try {
			maxMethod = Stat.class.getMethod("max", (Class<?>[]) null);
		} catch (NoSuchMethodException e) { /* max will remain null */ }

		double max = 2000;
		double[] data1 = { max, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		double[] data2 = { 1, 2, 3, 4, 5, max, 6, 7, 8, 9, 0 };
		double[] data3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, max };

		try {
			// this line is equivalent to: stat1 = new Stat(data1);
			stat1 = dArrayConstructor.newInstance(new Object[] { data1 });
		} catch (Exception e) { /* stat1 will remain null */ }

		try {
			// this line is equivalent to: stat2 = new Stat(data2);
			stat2 = dArrayConstructor.newInstance(new Object[] { data2 });
		} catch (Exception e) { /* stat2 will remain null */ }

		try {
			// this line is equivalent to: stat3 = new Stat(data3);
			stat3 = dArrayConstructor.newInstance(new Object[] { data3 });
		} catch (Exception e) { /* stat3 will remain null */ }

		// Test 4.1
		try {
			// this line is equivalent to: max1 = stat1.max();
			double max1 = (double) maxMethod.invoke(stat1);
			
			passed = (max == max1);
      if (!passed)
        System.out.println("  Test Passed: " + (max == max1) + "\t -> expected: " + max + " \t found: " + max1);

		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  Test Passed: " + false + "\t -> expected: " + max + " \t found: " + e.getCause());
			passed = false;
		}

		// Test 4.2
		try {
			// this line is equivalent to: max2 = stat2.max();
			double max2 = (double) maxMethod.invoke(stat2);
			
			passed = passed && (max == max2);
      if (!passed)
        System.out.println("  Test Passed: " + (max == max2) + "\t -> expected: " + max + " \t found: " + max2);

		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  Test Passed: " + false + "\t -> expected: " + max + " \t found: " + e.getCause());
			passed = false;
		}

		// Test 4.3
		try {
			// this line is equivalent to: max3 = stat3.max();
			double max3 = (double) maxMethod.invoke(stat3);
			
			passed = passed && (max == max3);
      if (!passed)
        System.out.println("  Test Passed: " + (max == max3) + "\t -> expected: " + max + " \t found: " + max3);

		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  Test Passed: " + false + "\t -> expected: " + max + " \t found: " + e.getCause());
			passed = false;
		}

		return passed;

	}

	/**
	 * Test for Lab 12 test 5 NOTE that lab 12 tests are all-or-nothing, so
	 * method returns a boolean
	 * 
	 * @return <code>true</code> if the test is passed, <code>false</code>
	 *         otherwise
	 */
	private static boolean test5() {
		System.out.println("Test 5: Average test");
		boolean passed = true;

		Constructor<Stat> dArrayConstructor = null, defaultConstructor = null;
		Stat stat1 = null, stat2 = null, stat3 = null;
		Method averageMethod = null;

		try {
			defaultConstructor = Stat.class.getConstructor();
		} catch (Exception e) { /* default constructor will remain null */ }

		try {
			dArrayConstructor = Stat.class.getConstructor(double[].class);
		} catch (Exception e) { /* double constructor will remain null */ }

		try {
			averageMethod = Stat.class.getMethod("average", (Class<?>[]) null);
		} catch (NoSuchMethodException e) { /* average will remain null */ }

		double[] data2 = { 10, 10, 10, 10, 10, 10, 20, 20 };
		double[] data3 = { 1, 2, 2, 3, 3, 4 };

		try {
			// this line is equivalent to: stat1 = new Stat();
			stat1 = defaultConstructor.newInstance();
		} catch (Exception e) { /* stat1 will remain null */ }

		try {
			// this line is equivalent to: stat2 = new Stat(data2);
			stat2 = dArrayConstructor.newInstance(new Object[] { data2 });
		} catch (Exception e) { /* stat2 will remain null */ }

		try {
			// this line is equivalent to: stat3 = new Stat(data3);
			stat3 = dArrayConstructor.newInstance(new Object[] { data3 });
		} catch (Exception e) { /* stat3 will remain null */ }

		double refAvg1 = 0;
		double refAvg2 = 12.5;
		double refAvg3 = 2.5;

		// Test 5.1
		try {
			// this line is equivalent to: average1 = stat1.average();
			double average1 = (double) averageMethod.invoke(stat1);
			passed = (refAvg1 == average1);
      if (!passed)
        System.out.println(
					"  Test Passed: " + (refAvg1 == average1) + "\t -> expected: " + refAvg1 + " \t found: " + average1);

		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  Test Passed: " + false + "\t -> expected: " + refAvg1 + " \t found: " + e.getCause());
			passed = false;
		}

		// Test 5.2
		try {
			// this line is equivalent to: average2 = stat2.average();
			double average2 = (double) averageMethod.invoke(stat2);
			
			passed = passed && (refAvg2 == average2);
      if (!passed)
        System.out.println(
					"  Test Passed: " + (refAvg2 == average2) + "\t -> expected: " + refAvg2 + " \t found: " + average2);

		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  Test Passed: " + false + "\t -> expected: " + refAvg2 + " \t found: " + e.getCause());
			passed = false;
		}

		// Test 5.3
		try {
			// this line is equivalent to: average3 = stat3.average();
			double average3 = (double) averageMethod.invoke(stat3);
			
			passed = passed && (refAvg3 == average3);
      if (!passed)
        System.out.println(
					"  Test Passed: " + (refAvg3 == average3) + "\t -> expected: " + refAvg3 + " \t found: " + average3);

		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  Test Passed: " + false + "\t -> expected: " + refAvg3 + " \t found: " + e.getCause());
			passed = false;
		}

		return passed;

	}

	/**
	 * Test for Lab 12 test 6 NOTE that lab 12 tests are all-or-nothing, so
	 * method returns a boolean
	 * 
	 * @return <code>true</code> if the test is passed, <code>false</code>
	 *         otherwise
	 */
	private static boolean test6() {
		boolean passed = true;
		System.out.println("Test 6: Mode test");
		Constructor<Stat> dArrayConstructor = null, defaultConstructor = null;
		Stat stat1 = null, stat2 = null, stat3 = null;

		Method modeMethod = null;

		try {
			defaultConstructor = Stat.class.getConstructor();
		} catch (Exception e) { /* default constructor will remain null */ }

		try {
			dArrayConstructor = Stat.class.getConstructor(double[].class);
		} catch (Exception e) { /* double param constructor will remain null */ }

		try {
			modeMethod = Stat.class.getMethod("mode", (Class<?>[]) null);
		} catch (NoSuchMethodException e) { /* mode method will remain null */ }

		double[] data2 = { 10, 10, 10, 10, 10, 10, 20, 20 };
		double[] data3 = { 1, 2, 2, 3, 3, 4 };

		try {
			// this line is equivalent to: stat1 = new Stat();
			stat1 = defaultConstructor.newInstance();
		} catch (Exception e) { /* stat1 will remain null */ }

		try {
			// this line is equivalent to: stat2 = new Stat(data2);
			stat2 = dArrayConstructor.newInstance(new Object[] { data2 });
		} catch (Exception e) { /* stat2 will remain null */ }

		try {
			// this line is equivalent to: stat3 = new Stat(data3);
			stat3 = dArrayConstructor.newInstance(new Object[] { data3 });
		} catch (Exception e) { /* stat3 will remain null */ }

		double refMode1 = 0.0;
		double refMode2 = 10;

		// Test 6.1
		try {
			// this line is equivalent to: mode1 = stat1.mode();
			double mode1 = (double) modeMethod.invoke(stat1);
			
			passed = (refMode1 == mode1);
      if (!passed)
        System.out.println("  Test Passed: " + (refMode1 == mode1) + "\t -> expected: " + refMode1 + " \t found: " + mode1);

		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  Test Passed: " + false + "\t -> expected: " + refMode1 + " \t found: " + e.getCause());
			passed = false;
		}

		// Test 6.2
		try {
			// this line is equivalent to: mode2 = stat2.mode();
			double mode2 = (double) modeMethod.invoke(stat2);
			
			passed = passed && (refMode2 == mode2);
      if (!passed)
        System.out.println("  Test Passed: " + (refMode2 == mode2) + "\t -> expected: " + refMode2 + " \t found: " + mode2);

		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  Test Passed: " + false + "\t -> expected: " + refMode2 + " \t found: " + e.getCause());
			passed = false;
		}

		// Test 6.3
		try {
			// this line is equivalent to: mode3 = stat3.mode();
			double mode3 = (double) modeMethod.invoke(stat3);
			
			passed = passed && (Double.isNaN(mode3));
      if (!passed)
        System.out.println("  Test Passed: " + (Double.isNaN(mode3)) + "\t -> expected: " + Double.NaN + " \t found: " + mode3);

		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  Test Passed: " + false + "\t -> expected: " + Double.NaN + " \t found: " + e.getCause());
			passed = false;
		}

		return passed;

	}

	/**
	 * Test for Lab 12 test 7 NOTE that lab 12 tests are all-or-nothing, so
	 * method returns a boolean
	 * 
	 * @return <code>true</code> if the test is passed, <code>false</code>
	 *         otherwise
	 */
	private static boolean test7() {
		boolean passed = true;
		System.out.println("Test 7: Equals Test");
		Constructor<Stat> dArrayConstructor = null;
		Stat stat1 = null, stat2 = null, stat3 = null;

		Method equalsMethod = null;

		try {
			dArrayConstructor = Stat.class.getConstructor(double[].class);
		} catch (Exception e) { /* double constructor will remain null */ }

		try {
			equalsMethod = Stat.class.getMethod("equals", new Class[] { Stat.class });
		} catch (NoSuchMethodException e) { /* equals method will remain null */}

		double[] data1 = { 1, 2, 2, 3, 3, 4 };
		double[] data2 = { 1, 2, 2, 3, 3, 4 };
		double[] data3 = { 2, 2, 3, 3 };

		try {
			// this line is equivalent to: stat1 = new Stat(data1);
			stat1 = dArrayConstructor.newInstance(new Object[] { data1 });
		} catch (Exception e) { /* stat1 will remain null */ }

		try {
			// this line is equivalent to: stat2 = new Stat(data2);
			stat2 = dArrayConstructor.newInstance(new Object[] { data2 });
		} catch (Exception e) { /* stat2 will remain null */ }

		try {
			// this line is equivalent to: stat3 = new Stat(data3);
			stat3 = dArrayConstructor.newInstance(new Object[] { data3 });
		} catch (Exception e) { /* stat3 will remain null */ }

		try {
			// this line is equivalent to: res1 = (stat1.equals(stat1));
			boolean res1 = (boolean) equalsMethod.invoke(stat1, new Object[] { stat1 });

      passed = res1;
      if (!passed)
        System.out.println("  stat1.equals(stat1)\t -> expected: " + true + "\t found: " + res1);
      
		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  stat1.equals(stat1)\t -> expected: " + true + "\t found: " + e.getCause());
			passed = false;
		}

		try {
			// this line is equivalent to: res2 = (stat2.equals(stat1));
			boolean res2 = (boolean) equalsMethod.invoke(stat2, new Object[] { stat1 });

      passed = passed && res2;
      if (!passed)
        System.out.println("  stat2.equals(stat1)\t -> expected: " + true + "\t found: " + res2);
      
		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  stat2.equals(stat1)\t -> expected: " + true + "\t found: " + e.getCause());
			passed = false;
		}

		try {
			// this line is equivalent to: res3 = !(stat3.equals(stat2));
			boolean res3 = !(boolean) equalsMethod.invoke(stat3, new Object[] { stat2 });

      passed = passed && res3;
      if (!passed)
        System.out.println("  !stat3.equals(stat2)\t -> expected: " + true + "\t found: " + res3);
      
		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  !stat3.equals(stat2)\t -> expected: " + true + "\t found: " + e.getCause());
			passed = false;
		}

		return passed;
	}

	/**
	 * Test for Lab 12 test 8 NOTE that lab 12 tests are all-or-nothing, so
	 * method returns a boolean
	 * 
	 * @return <code>true</code> if the test is passed, <code>false</code>
	 *         otherwise
	 */
	private static boolean test8() {
		boolean passed = true;
		System.out.println("Test 8: Getter/Setter test");
		Constructor<Stat> defaultConstructor = null;
		Method getDataMethod = null, setDataMethod = null;
		Stat stat1 = null;

		double[] data1 = { 1, 2, 3, 4 };
		double[] data2 = { 1, 2, 3, 4 };
		double[] data3 = null;

		try {
			defaultConstructor = Stat.class.getConstructor();
		} catch (Exception e) { /* default constructor will remain null */ }

		try {
			getDataMethod = Stat.class.getMethod("getData", (Class<?>[]) null);
		} catch (NoSuchMethodException e) { /* getData will remain null */ }

		try {
			setDataMethod = Stat.class.getMethod("setData", new Class[] { double[].class });
		} catch (Exception e) { /* setData will remain null */ }

		try {
			// this line is equivalent to: stat1 = new Stat();
			stat1 = defaultConstructor.newInstance();
		} catch (Exception e) { /* stat1 will remain null */ }

		try {
			// this line is equivalent to: stat1.setData(data1);
			setDataMethod.invoke(stat1, new Object[] { data1 });
		} catch (Exception e) { /* stat1 will be unchanged */ }

		data1[0] = 0;

		try {
			// this line is equivalent to: data3 = stat1.getData();
			data3 = (double[]) getDataMethod.invoke(stat1);
			
			boolean result = Arrays.equals(data2, data3);
			passed = result;
      if (!passed)
        System.out.println("  data2 equals data3\t -> expected: true\t found: " + result);

		} catch (Exception e) {
			// if student debug mode is on, print stack trace and exit
			if (printStackTrace) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("  data2 equals data3\t -> expected: " + true + "\t found: " + e.getCause());
			passed = false;
		}

		return passed;
	}

	public static void main(String[] args) {
		int grade = 100;

		boolean v1t1, v1t2, v1t3, v1t4, v1t5, v1t6, v1t7, v1t8;
		v1t1 = v1t2 = v1t3 = v1t4 = v1t5 = v1t6 = v1t7 = v1t8 = false;

		v1t1 = test1();
		v1t2 = test2();
		v1t3 = test3();
		v1t4 = test4();
		v1t5 = test5();
		v1t6 = test6();
		v1t7 = test7();
		v1t8 = test8();

    System.out.println("----------");

		if (!v1t1) {
			System.out.println("[-15] test 1 (default contructor & toString)");
			grade -= 15;
		}
		if (!v1t2) {
			System.out.println("[-15] test 2 (1 param constructor & toString)");
			grade -= 15;
		}
		if (!v1t3) {
			System.out.println("[-15] test 3 (min)");
			grade -= 15;
		}
		if (!v1t4) {
			System.out.println("[-15] test 4 (max)");
			grade -= 15;
		}
		if (!v1t5) {
			System.out.println("[-10] test 5 (average)");
			grade -= 10;
		}
		if (!v1t6) {
			System.out.println("[-10] test 6 (mode)");
			grade -= 10;
		}
		if (!v1t7) {
			System.out.println("[-10] test 7 (equals)");
			grade -= 10;
		}
		if (!v1t8) {
			System.out.println("[-10] test 8 (getter/setter)");
			grade -= 10;
		}

		// System.out.println("\nGrade for Stat class " + grade + "/100");
		// System.out.println("ALL TESTS PASSED: " + (v1t1 && v1t2 && v1t3 && v1t4 && v1t5 && v1t6 && v1t7 && v1t8));
    System.exit(100 - grade);
	}
}
