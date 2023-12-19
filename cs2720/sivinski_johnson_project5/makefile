main: Sort.o SortDr.o
	g++ -std=c++14 -Wall -pedantic-errors -O0 -g -o main Sort.o SortDr.o

SortDr.o: SortDr.cpp Sort.cpp
	g++ -std=c++14 -Wall -pedantic-errors -O0 -c SortDr.cpp

Sort.o: Sort.h Sort.cpp
	g++ -std=c++14 -Wall -pedantic-errors -O0 -c Sort.cpp

run: main
	./main

clean:
	rm  *.o main
