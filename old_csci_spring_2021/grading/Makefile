LAB = Lab09Grader
OUTPUT = output.txt
CFLAGS = -d bin -cp bin

vpath %.class bin
vpath %.java src

ALL_CLASSES = MultipleScannerException.class ScannerCount.class Parser.class \
Submission.class LabGrader.class Lab01Grader.class Lab02Grader.class Lab03Grader.class \
Lab04Grader.class Lab05Grader.class Lab06Grader.class Lab07Grader.class Lab08Grader.class \
Lab09Grader.class Lab10Grader.class Lab11Grader.class Lab12Grader.class Lab13Grader.class \
ComputerOpponent.class RubricCircleTester.class StatGrading.class StatTester.class \
FindTheSumsGrader.class

CLASSES = MultipleScannerException.class ScannerCount.class Parser.class \
Submission.class $(PREREQS) LabGrader.class $(LAB).class

compile: $(CLASSES)

$(ALL_CLASSES): %.class: %.java
	javac $(CFLAGS) $<

run: $(CLASSES)
	java -cp bin $(LAB) $(SUBDIR) $(DUE) $(FILENAMES) -o $(OUTPUT) -p $(PREREQS) 

restore: $(CLASSES)
	java -cp bin $(LAB) $(SUBDIR) $(DUE) $(FILENAMES) -o $(OUTPUT) -r -p $(PREREQS)

help: $(CLASSES)
	java -cp bin $(LAB) --help

clean:
	rm bin/*.class

# Specific run targets

run1: $(CLASSES) Lab01Grader.class
	java -cp bin Lab01Grader "lab01/submissions/" "2021-01-29T17:00:00" "HelloWorld.java" -o $(OUTPUT)

run2: $(CLASSES) Lab02Grader.class
	java -cp bin Lab02Grader "lab02/submissions/" "2021-02-05T17:00:00" "NetPay.java" -o $(OUTPUT)

run3: $(CLASSES) Lab03Grader.class
	java -cp bin Lab03Grader "lab03/submissions/" "2021-02-12T17:00:00" "ParseTheTweet.java" -o $(OUTPUT)

run4: $(CLASSES) Lab04Grader.class
	java -cp bin Lab04Grader "lab04/submissions/" "2021-02-19T17:00:00" "ClassifyMessage.java" -o $(OUTPUT)

run5: $(CLASSES) Lab05Grader.class
	java -cp bin Lab05Grader "lab05/submissions/" "2021-02-26T17:00:00" "TemperatureConverter.java" -o $(OUTPUT)

run6: $(CLASSES) ComputerOpponent.class Lab06Grader.class
	java -cp bin Lab06Grader "lab06/submissions/" "2021-03-05T17:00:00" "RockPaperScissors.java" -o $(OUTPUT) -p "ComputerOpponent.class"

run7: $(CLASSES) Lab07Grader.class
	java -cp bin Lab07Grader "lab07/submissions/" "2021-03-19T17:00:00" "StringFun.java" -o $(OUTPUT)

run8: $(CLASSES) Lab08Grader.class
	java -cp bin Lab08Grader "lab08/submissions/" "2021-03-26T17:00:00" "StarGraph.java" -o $(OUTPUT) 

run9: $(CLASSES) RubricCircleTester.class Lab09Grader.class
	java -cp bin Lab09Grader "lab09/submissions/" "2021-04-02T17:00:00" "Circle.java" "CircleTester.java" -o $(OUTPUT) -p "RubricCircleTester.class"

run11: $(CLASSES) StatGrading.class Lab11Grader.class
	java -cp bin Lab11Grader "lab11/submissions/" "2021-04-10T17:00:00" "Stat.java" -o $(OUTPUT) -p "StatGrading.class"

run12: $(CLASSES) StatTester.class Lab12Grader.class
	java -cp bin Lab12Grader "lab12/submissions/" "2021-04-16T17:00:00" "Stat.java" -o $(OUTPUT) -p "StatTester.class"

run13: $(CLASSES) FindTheSumsGrader.class Lab13Grader.class
	java -cp bin Lab13Grader "lab13/submissions/" "2021-04-23T17:00:00" "FindTheSums.java" -o $(OUTPUT) -p "FindTheSumsGrader.class"	
