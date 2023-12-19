/**
 * A runtime exception for when more than one Scanner object is
 * instantiated on System.in.
 *
 * @see ScannerCount
 */
class MultipleScannerException extends RuntimeException {
  /**
   * Constructs a new MultipleScannerException
   * 
   * @param errorMessage the error message
   */
  public MultipleScannerException(String errorMessage) {
    super(errorMessage);
  } // constructor
} // MultipleScannerException
