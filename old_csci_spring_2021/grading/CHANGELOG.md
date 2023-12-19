## v1.0.0-alpha
Initial commit

## v1.0.0
- Added optional output filename option (-o)
- Implemented interactive mode

Program still functions as it did in alpha but
added interactive functionality has been added.

Upon being run, program will grade all submissions
found in the specified submission directory and then
begin interactive mode.

A welcome and help screen will be printed.

Interactive mode allows for you to step through
submissions (both forwards and backwards) and view
the current submissions graded summary, source code,
as well as run the current submission interactively
for manual grading purposes.

You may also select a specific submission by index
or student's name with the "get [keyword]" command.
[keyword] may be an index or name.

## v1.0.1
- Implemented multiple Scanner check
- Bug fixes

Fixed date parsing issue in Submission.java

## v1.0.2
- Implemented restore option

A grading session may now be restored from an output
file with the restore option (-r, --restore). When
running the program with a restore flag, only the
submission directory parameter is required. You may
also specify the output file to restore with the
output option (-o, --output) (default: "output.txt").

See the usage message for futher information.

## v1.0.3
- Fixed Makefile
- Added aliases to interactive mode commands
- Added more customizable static constants to LabGrader
- Fixed exec(String, String...) function

Makefile will now only compile the files that have
been changed.

Aliases to interactive mode commands can be found in
the help menu.

Added DEBUG_INDEX to LabGrader which specifies the
index of the submission to grade when DEBUG is true.

Additionally added CMD_INPUT_DELAY to LabGrader which
specifies how long the exec(String, String...)
function waits before inserting input. This delay
prevents input from being inserted to early (before
it was actually requested by the Java program). See
source code for more information.

## v1.1.0
- Implemented multi-file submission support
- Added Parser.Options class
- Refactored Makefile
- Added "PREREQS" command-line argument

LabGrader now functions with both single-file and
multi-file submissions. When a lab necessitates
multi-file submissions, the grader will be prompted for
which user-submitted file should be run (aka which
file contains the main method) before grading
commences. If no user-submitted files should be run
(if, perhaps, only a grader file will be run), the
answer to this prompt will have no effect.

Submissions are no longer compiled directly into the
submissions/ directory. A subdirectory "current/" is
created to house the working directory of each
submission during grading. During the grading of a
specific submission, the directory structure will look
as follows:

lab0x/  
lab0x/submissions/  
lab0x/submissions/[eLC submission files]  
lab0x/submissions/current/  
lab0x/submissions/current/[user-submitted files].class  
lab0x/submissions/current/[prereq files].class  
lab0x/submissions/current/ScannerCount.class  
lab0x/submissions/current/MultipleScannerException.class  
lab0x/submissions/[more eLC submission files]  

NOTE: "lab0x/submissions/" would be replaced with whatever
directory is supplied as SUBDIR command-line argument.

While grading multi-file submissions, LabGrader will
check that all user-submitted filenames match those
that were provided as a command-line argument.
LabGrader will also verify that the number of user-
submitted files matches the number of filenames
provided at the command-line. LabGrader will also check
for Statement of Academic Honesty in all user-submitted
files.

Interactive mode now behaves slightly differently
for multi-file and single-file submissions. For
multi-file submissions, the "source/src" command
will prompt for which user-submitted file should
be printed before printing a file's contents.
The "run/r" command will run the user-submitted file
that the grader selected in the prompt before grading
commenced.

A new class "Parser.Options" has been created to house
all the options which will be used to initialize
LabGrader and its implementations. Now, the LabGrader
constructor and the constructor of its implementations
only take one argument: a Parser.Options object.
In this way, if more input from the grader at the
command-line is necessary for future labs, only this
Parser.Options class needs to be edited instead of
adding another parameter to the constructor of LabGrader
and to the constructors of all of its implementations.

The Makefile has been refactored in such a way that
makes it much more concise and generally useful. If a
new file is created for use within the LabGrader
program, you need only to add its .class name to the
variable CLASSES. Additionally, a "help" target has
been added which simply prints usage statement for the
LabGrader program. Invoke with "make help".

A "PREREQS" command-line argument has been added to
aid in situations where a lab-specific file is
required for grading (e.g. ComputerOpponent.class for
Lab 6). Instead of placing this lab-specific file in
both the bin/ and submissions/ directories, you need
only to place the source code in the src/ directory and
specify the lab-specific file in the PREREQS command-
line argument. PREREQS should be a space-separated
list of necessary lab-specific files with the
.class suffix. For example: PREREQS="ComputerOpponent.class
OtherClass.class". If a PREREQS argument is specified,
the specified files will be compiled into the bin/
directory so that they may be referenced by the
LabGrader implementation and will also be copied into
the working directory of each submission during
grading so that they may also be referenced by a
user-submitted file (like in the case of
ComputerOpponent for Lab 6).

## v1.1.1
- Added specific targets to run each lab in Makefile

Now each lab may be run with the target "run[x]" where
x is the number of the lab. For example, to run lab 6
simple executing "make run6" will take care of compiling
all necessary files and executing the correct "java ..."
command.

NOTE: These targets only work with a submissions
directory at "lab[x]/submissions/".

## v1.1.2
- Added functionality to prematurely end grading

The grading process may now be prematurely terminated
by typing "s" or "stop" (irregardless of case) followed
by "enter" while grading is taking place. This will
cause LabGrader to stop grading submissions after the
current submission being graded has finished and to
then immediately begin interactive mode.

## v1.1.3
- Fixed BufferOverflowException on first interactive command
- Added Lab 11 and Lab 12 files and make targets

The BufferOverflowException occurring on the first
inputted command during interactive mode has been
successfully resolved. Lab-specific make targets now
exist for all labs except lab 10 and lab 13.

## v1.1.4
- Refactored a lot of Lab06Grader logic for cleaner grader output
- Refactored Lab03Grader logic to reflect new expected user output
- Relaxed Statement of Academic Honesty detection conditions
- Created a Lab13Grader class and respective make target
- Moved the disallowed keywords check to LabGrader abstract class
- Updated make target due dates for summer term

Mostly bug fixes and minor updates, nothing major to elaborate on.
