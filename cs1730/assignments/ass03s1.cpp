#include <iostream>

using namespace std;

int foo(int x) {
  x += 10;
 return x + 5;
}

int bar(int& x) {
  x = 2720;
  return x - 100;
}

int main() {
  int valueOne = 1730;
  int valueTwo = 42;
  cout << foo(valueOne) << endl;
  cout << valueOne << endl;
  cout << foo(valueTwo) << endl;
  cout << valueTwo << endl;

  cout << bar(valueOne) << endl;
  cout << valueOne << endl;
  cout << bar(valueTwo) << endl;
  cout << valueTwo << endl;
}
