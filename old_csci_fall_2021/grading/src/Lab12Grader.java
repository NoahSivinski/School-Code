/**
 * A grader for lab 12.
 */
public class Lab12Grader extends LabGrader {
  /**
   * Constructs a new Lab12Grader object.
   *
   * @param opts the options with which to initialize this grader
   */
  public Lab12Grader(Parser.Options opts) { 
    super(opts);
    
    if (opts.restore) return;

    write(DIVIDER);
    write("Grading Summary for Lab 12\n");
    write(DIVIDER + '\n');
  } // constructor

  /** @see LabGrader.run(Submission) */
  @Override
  public int run(Submission sub) {
    int lost = 0;
    write("Running...\n");

    // Lab12StatTester output
    write("  Rubric Tester...\t");
    LabGrader.Output output = exec("java StatTester");
    lost += output.exitValue;
    if (lost > 0) {
      write("FAILED (-" + lost + ")\n");
      output.content.forEach((s) -> {
        write("    " + s + '\n');
      });
    } else {
      write("PASSED\n");
    }
    
    return lost;
  } // run

  // driver
  public static void main(String[] args) {
    Parser parser = new Parser(args);
    LabGrader grader = new Lab12Grader(parser.opts);
    if (parser.opts.restore) grader.restore();
    else grader.grade();
  } // main
} // Lab12Grader
