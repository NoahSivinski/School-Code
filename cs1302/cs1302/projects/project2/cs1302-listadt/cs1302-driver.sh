#!/bin/bash -ex

rm -rf bin/*
javac -cp listadt.jar:bin -d bin src/cs1302/driv/Driver2.java
javac -d bin -cp bin:listadt.jar src/cs1302/driv/Driver3.java
javac -d bin -cp bin:listadt.jar src/cs1302/driv/FinalDriver.java
javac -d bin -cp bin:listadt.jar src/cs1302/list/ListDriver.java
javac -d bin -cp bin:listadt.jar src/cs1302/driv/Driver.java
