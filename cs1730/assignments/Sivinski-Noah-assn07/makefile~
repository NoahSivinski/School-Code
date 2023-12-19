assn06: Matrix.o Matrix.h p1.cpp
	g++ -std=c++14 -Wall -pedantic-errors -o assn06 Matrix.o p1.cpp

Matrix.o: Matrix.h Matrix.cpp
	g++ -std=c++14 -Wall -pedantic-errors -g -O0 -c Matrix.cpp

clean:
	/bin/rm -f *.o assn06
