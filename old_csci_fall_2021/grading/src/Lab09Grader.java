/**
 * A grader for lab 08.
 */
public class Lab09Grader extends LabGrader {
  
  /**
   * Constructs a new Lab09Grader object.
   *
   * @param opts the options with which to initialize this grader
   */
  public Lab09Grader(Parser.Options opts) {
    super(opts);
    
    if (opts.restore) return;

    write(DIVIDER);
    write("Grading Summary for Lab 09\n");
    write(DIVIDER + '\n');
  } // constructor

  /** @see LabGrader.run(Submission) */
  @Override
  public int run(Submission sub) {
    int lost = 0;    
    
    write("Running...\n");

    // RubricCircleTest output
    write("  Rubric Tester...\t");
    LabGrader.Output rubricOutput = exec("java RubricCircleTester");
    if (rubricOutput.exitValue != 0) {
      lost += rubricOutput.exitValue;
      write("FAILED (-" + lost + ")\n");
      write("    -------------------OUTPUT-------------------\n");
      rubricOutput.content.forEach((s) -> write("      " + s + '\n'));
      write("    --------------------------------------------\n");
    } else {
      write("PASSED\n");
    }

    // CircleTest output (user-provided file)
    write("  User Tester...\t");
    LabGrader.Output userOutput = exec("java " + sub.getClassName());
    if (userOutput.exitValue != 0) {
      lost += 45;
      write("FAILED (-45)\n");
      write("    ERROR: program terminated with error code " + userOutput.exitValue + '\n');
      write("    -------------------OUTPUT-------------------\n");
      userOutput.content.forEach((s) -> write("      " + s + '\n'));
      write("    --------------------------------------------\n");
    } else {
      write("PASSED\n");
    }
    
    return lost;
  } // run

  // driver
  public static void main(String[] args) {
    Parser parser = new Parser(args);
    LabGrader grader = new Lab09Grader(parser.opts);
    if (parser.opts.restore) grader.restore();
    else grader.grade();
  } // main
} // Lab09Grader
