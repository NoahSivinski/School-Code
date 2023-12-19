project4: TreeType.o TreeDr.o
	g++ -std=c++14 -Wall -pedantic-errors -O0 -g -o project4 TreeType.o TreeDr.o

TreeDr.o: TreeDr.cpp TreeType.cpp
	g++ -std=c++14 -Wall -pedantic-errors -O0 -c TreeDr.cpp

SortedList.o: TreeType.h TreeType.cpp
	g++ -std=c++14 -Wall -pedantic-errors -O0 -c TreeType.cpp

run: project4
	./project4

clean:
	rm  *.o project4
