#include <iostream>
using namespace std;
int main() {
int x = 1000;
int& y{x};
x += 100;
cout << x << endl;
cout << y << endl;
x = 2020;
cout << x << endl;
cout << y << endl;
y += 10;
cout << x << endl;
cout << y << endl;
}

