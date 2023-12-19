#!/bin/bash -ex

rm -rf bin/*
javac -Xlint -d bin src/cs1302/genlist/Node.java
javac -Xlint -cp lib/genlistadt.jar -d bin src/cs1302/genlist/Iterate.java
javac -Xlint -cp bin:lib/genlistadt.jar -d bin src/cs1302/genlist/BaseGenList.java
javac -Xlint -cp bin:lib/genlistadt.jar -d bin src/cs1302/genlist/LinkedGenList.java
javac -Xlint -cp bin:lib/genlistadt.jar -d bin src/cs1302/genlist/LinkedGenListTest.java
java -cp bin:lib/genlistadt.jar cs1302.genlist.LinkedGenListTest
