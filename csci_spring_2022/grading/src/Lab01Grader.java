import java.time.LocalDateTime;

import java.util.List;

/**
 * A grader for lab 01.
 */
public class Lab01Grader extends LabGrader {

  /**
   * Constructs a new Lab01Grader object.
   *
   * @param opts the options with which to initialize this grader
   */
  public Lab01Grader(Parser.Options opts) {
    super(opts);

    if (opts.restore) return;

    write(DIVIDER);
    write("Grading Summary for Lab 01\n");
    write((DIVIDER + '\n'));
  } // constructor

  /** @see LabGrader.run(Submission) */
  @Override
  public int run(Submission sub) {
    int lost = 0;
    write("Running...\n");
    write("  Test 01...\t");
    String cmd = "java " + sub.getClassName();
    LabGrader.Output output = exec(cmd);
    if (output.exitValue != 0) {
      write("FAILED (-100)\n");
      write("    ERROR: program terminated with error code " + output.exitValue + '\n');
      write("    -------------------OUTPUT-------------------\n");
      output.content.forEach((s) -> write("      " + s + '\n'));
      write("    --------------------------------------------\n");
      lost += 100;
    } else {
      String soutput = output.content.stream()
        .reduce("", (s1, s2) -> s1.trim() + '\n' + s2.trim()).trim();
      if (soutput.equalsIgnoreCase("Hello World!")) {
        write("PASSED\n");
      } else {
        write("FAILED (-100)\n");
        write("    Expected: \"Hello World!\"\n");
        write("    Received: \"" + soutput + "\"\n");
        lost += 100;
      }
    }
    return lost;
  } // run

  // driver
  public static void main(String[] args) {
    Parser parser = new Parser(args);
    LabGrader grader = new Lab01Grader(parser.opts);
    if (parser.opts.restore) grader.restore();
    else grader.grade();
  } // main
} // Lab01Grader
