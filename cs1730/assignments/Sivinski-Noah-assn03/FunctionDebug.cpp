#include <iostream>

using namespace std;

void foo(int arg) {
  arg = 42;
}

void bar(int& arg) {
  arg = 2720;
}

int main() {
  int x{1730};

  cout << "value before foo(): " << x << endl;
  foo(x);
  cout << "value after foo(): " << x << endl;

  cout << "value before bar(): " << x << endl;
  bar(x);
  cout << "value after bar(): " << x << endl;
  
  return 0;
}
