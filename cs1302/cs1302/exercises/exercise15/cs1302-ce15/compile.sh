#!/bin/bash -ex

javac -d bin -cp bin src/cs1302/Utility.java
javac -d bin -cp bin src/cs1302/ce15/Shape.java
javac -d bin -cp bin src/cs1302/ce15/Ellipse.java
javac -d bin -cp bin src/cs1302/ce15/Rectangle.java
javac -d bin -cp bin src/cs1302/ce15/Circle.java
javac -d bin -cp bin src/cs1302/ce15/Square.java
javac -d bin -cp lib/cs1302-ce15.jar:bin src/cs1302/ce15/Driver.java
