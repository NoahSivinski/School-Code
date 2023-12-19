project2: SortedList.o Student.o SortedListDr.o
	g++ -std=c++14 -Wall -pedantic-errors -O0 -g -o project2 SortedList.o Student.o SortedListDr.o

SortedListDr.o: SortedListDr.cpp Student.h SortedList.cpp
	g++ -std=c++14 -Wall -pedantic-errors -O0 -c SortedListDr.cpp

Student.o: Student.h Student.cpp SortedList.cpp
	g++ -std=c++14 -Wall -pedantic-errors -O0 -c Student.cpp

SortedList.o: SortedList.h SortedList.cpp
	g++ -std=c++14 -Wall -pedantic-errors -O0 -c SortedList.cpp

run: project2
	./project2

clean:
	rm  *.o project2
