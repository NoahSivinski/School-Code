#!/bin/bash -ex

rm -rf bin/*
javac -d bin -cp bin:listadt.jar src/cs1302/list/Iterate.java
javac -d bin -cp bin:listadt.jar src/cs1302/list/AbstractStringList.java
javac -d bin -cp bin:listadt.jar src/cs1302/list/ArrayStringList.java
javac -d bin -cp bin:listadt.jar src/cs1302/list/LinkedStringList.java
checkstyle -c cs1302_checks.xml src/
