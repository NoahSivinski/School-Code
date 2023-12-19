/**
 * A grader for lab 11.
 */
public class Lab11Grader extends LabGrader {
  /**
   * Constructs a new Lab11Grader object.
   *
   * @param opts the options with which to initialize this grader
   */
  public Lab11Grader(Parser.Options opts) { 
    super(opts);
    
    if (opts.restore) return;

    write(DIVIDER);
    write("Grading Summary for Lab 11\n");
    write(DIVIDER + '\n');
  } // constructor

  /** @see LabGrader.run(Submission) */
  @Override
  public int run(Submission sub) {
    int lost = 0;
    write("Running...\n");

    // StatGrading output
    write("  Rubric Tester...\t");
    LabGrader.Output output = exec("java StatGrading");
    lost += output.exitValue;
    if (lost > 0)
      write("FAILED (-" + lost + ")\n");
    else
      write("PASSED\n");
    output.content.forEach((s) -> {
        write("    " + s + '\n');
      });
    
    return lost;
  } // run

  // driver
  public static void main(String[] args) {
    Parser parser = new Parser(args);
    LabGrader grader = new Lab11Grader(parser.opts);
    if (parser.opts.restore) grader.restore();
    else grader.grade();
  } // main
} // Lab11Grader
