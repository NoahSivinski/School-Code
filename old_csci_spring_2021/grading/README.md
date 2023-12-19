# LabGrader

## About

The following files are included in the src/ directory:
- **src/LabGrader.java**  
  An abstract LabGrader class that takes care of universal validations
  like checking filenames, late submissions, inclusion of the Statement
  of Academic Honesty, etc.
- **src/LabXXGrader.java**  
  An implementation of LabGrader for lab xx.
- **src/Submission.java**  
  An class representing a student lab submission.
- **src/Parser.java**  
  A command-line parser for an implementation of LabGrader.
- **src/ScannerCount.java**  
  A class defining a count for Scanner objects initialized on
  System.in. Throws MultipleScannerException when more than one Scanner
  object is detected.
- **src/MultipleScannerException.java**  
  A custom exception class to be thrown when a submission contains
  multiple Scanner objects initialized on System.in.
- **src/\[Prerequisite source files\]**  
  Lab-specific prerequisite files such as ComputerOpponent.java for
  Lab 6.

## Instructions

Your environment should have the following structure:

```
./Makefile  
./src  
./src/*.java  
./bin  
./bin/*.class  
./labxx  
./labxx/submissions  
./labxx/submissions/[all submissions to grade]
```
Where `xx` is the number of a lab (use preceding zeros for single-digit numbers).

The directory containing submission files to grade can have
any name and be at any sublevel. You will input this directory
path to the LabGrader program. The above structure, however, is
recommended.

### To compile the program

  `make compile`

### To run the program

  `make run SUBDIR=[path to submission folder] DUE=[due date and time in ISO_LOCAL_DATE_TIME format] FILENAMES=[space-separated list of expected filenames] OUTPUT=[output filename] PREREQS=[space-separted list of lab-specific prerequisite class files]`

  or

  `java -cp bin LabXXGrader [path to submission folder] [due date and time] [space-separated filenames] -o [output filename] -p [space-separated prerequisite class files]`

  For example, to grade lab 6 the following commands are appropriate:

  `make run SUBDIR="lab06/submissions/" DUE="2020-02-21T21:00:00" FILENAMES="RockPaperScissors.java" OUTPUT="summary" PREREQS="ComputerOpponent.class"`
  
  or simply
  
  `make run6`

  All labs now have a lab-specific target in the Makefile for easier
  compiling and running. Simple run the command `make runx` where x is
  number of the lab to begin the grading for that lab.
  **NOTE:** These lab-specific targets only work with a submissions
  directory at `labxx/submissions/`.
  
  The `OUTPUT` and `PREREQS` arguments are optional.  
  Run `make help` to get help/usage statement.
  
### To restore the program

  `make restore SUBDIR=[path to submissions folder] OUTPUT=[output file to restore]`
  
  Restoring a program allows you to bypass grading every submission and go straight into 
  interactive mode so long as you have an output file which has already been generated.
  
  Behavior is undefined for restoring an output file which does not have data for the same
  students as the specified submission folder.

### To clean class files

  `make clean`

## Notes

The program will write an output summary to a file called "output.txt" (by
default) in the current working directory. For an example of output.txt see the
included output.txt file.

The grader by no means works perfectly yet. Any deductions made by the
grader should be double checked with a manual glance over the source code.

You can create an implementation of LabGrader that will grade any given lab
by extending from LabGrader and overriding the run() method. See source code
for more detail. See Lab01Grader.java and Lab02Grader.java for examples
of LabGrader implementations.

## Known Issues

**Unnecessary Universal Checks**

- Statement of Academic Honesty check occurs for lab 01 grading even though students
are not required to include a Statement of Academic Honesty for this lab.

- Disallowed keywords checking now occurs for every lab. The disallowed keywords include
`break` and `continue` statements even though these are permitted for certain labs.

**Proposed solution:**

Add command-line flags to disable certain universal checks like the Statement of
Academic Honesty check and disallowed keywords check. These could look like `--disable-sah`
and `--disable-disallowed`. Refactoring will be necessary in the Parser.java and
LabGrader.java files.

**Uncompileable Prerequisite Files**

- Some prerequisite files cannot be compiled correctly by the Make program. This includes
`RubricCircleTester.java`, `StatGrading.java`, `StatTester.java`, and `FindTheSumsGrader.java`.

**Current workaround:**

Manually compile these prerequisite files in a directory alongside a student-submitted
source file like `Circle.java`, `Stat.java`, or `FindTheSums.java` and then copy 
into the `bin` directory. Care must be taken to copy the `.class` file into the bin 
directory **after** pulling the source file into the `src` directory, so that Make
does not attempt to recompile the source file.
