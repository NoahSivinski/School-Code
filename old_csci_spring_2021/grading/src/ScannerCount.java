/**
 * A helper class to maintain a count of the number of Scanner objects
 * instantiated on System.in.
 *
 * @see MultipleScannerException
 */
public class ScannerCount {
  /** The number of Scanner objects. */
  public static int count = 0;

  /**
   * Increases count when a Scanner object is instantiated.
   *
   * @throws MultipleScannerException if count is greater than 1
   */
  public static void increment() {
    count++;
    if (count > 1) {
      throw new MultipleScannerException("Multiple scanners detected.");
    }
  } // increment
} // ScannerCount
