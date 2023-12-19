#include "Matrix.h"
#include <iostream>

using namespace std;

int main() {

  // 1st constructor test
  Matrix m1(5, 5);
  cout << "1st constructor test:" << endl;
  for (uint i = 0; i < m1.numRows(); i++) {
    for (uint j = 0; j < m1.numCols(); j++) {
      cout << m1.at(i, j) << " ";
    } // for
    cout << "\n";
  } // for

  // at method get and set test
  for (uint i = 0; i < m1.numRows(); i++) {
    for (uint j = 0; j < m1.numCols(); j++) {
      m1.at(i, j) = j + 1;
    } // for
  } // for
  cout << "at(int i, int j) get and set test:" << endl;
  for (uint i = 0; i < m1.numRows(); i++) {
    for (uint j = 0; j < m1.numCols(); j++) {
      cout << m1.at(i, j) << " ";
    } // for
    cout << "\n";
  } // for

  cout << "add(double s) method test" << endl;
  Matrix m2 = m1.add(10);
  for (uint i = 0; i < m1.numRows(); i++) {
    for (uint j = 0; j < m1.numCols(); j++) {
      cout << m2.at(i, j) << " ";
    } // for
    cout << "\n";
  } // for

  cout << "add(const Matrix & m) method test" << endl;
  Matrix m3 = m1.add(m2);
  for (uint i = 0; i < m1.numRows(); i++) {
    for (uint j = 0; j < m1.numCols(); j++) {
      cout << m3.at(i, j) << " ";
    } // for
    cout << "\n";
  } // for

  cout << "subtract(double s) method test" << endl;
  Matrix m4 = m1.subtract(1);
  for (uint i = 0; i < m1.numRows(); i++) {
    for (uint j = 0; j < m1.numCols(); j++) {
      cout << m4.at(i, j) << " ";
    } // for
    cout << "\n";
  } // for

  cout << "subtract(const Matrix & m) method test" << endl;
  Matrix m5 = m2.subtract(m1);
  for (uint i = 0; i < m1.numRows(); i++) {
    for (uint j = 0; j < m1.numCols(); j++) {
      cout << m5.at(i, j) << " ";
    } // for
    cout << "\n";
  } // for

  cout << "multiply(double s) method test" << endl;
  Matrix m6 = m5.multiply(2);
  for (uint i = 0; i < m1.numRows(); i++) {
    for (uint j = 0; j < m1.numCols(); j++) {
      cout << m6.at(i, j) << " ";
    } // for
    cout << "\n";
  } // for

  cout << "multiply(const Matrix & m) method test" << endl;
  Matrix m7 = m5.multiply(m6);
  for (uint i = 0; i < m1.numRows(); i++) {
    for (uint j = 0; j < m1.numCols(); j++) {
      cout << m7.at(i, j) << " ";
    } // for
    cout << "\n";
  } // for

  cout << "divide(double s) method test" << endl;
  Matrix m8 = m5.divide(5);
  for (uint i = 0; i < m1.numRows(); i++) {
    for (uint j = 0; j < m1.numCols(); j++) {
      cout << m8.at(i, j) << " ";
    } // for
    cout << "\n";
  } // for

  cout << "t() method test" << endl;
  Matrix m9 = m1.t();
  for (uint i = 0; i < m9.numRows(); i++) {
    for (uint j = 0; j < m9.numCols(); j++) {
      cout << m9.at(i, j) << " ";
    } // for
    cout << "\n";
  } // for

  cout << "numRows() method test:" << m1.numRows() << endl;

  cout << "numCols() method test:" << m1.numCols() << endl;
  
  double& x = m1.at(1,1);

  cout << x << endl;
  
  cout << "3rd constructor test" << endl;
  Matrix m10(m1);
  for (uint i = 0; i < m10.numRows(); i++) {
    for (uint j = 0; j < m10.numCols(); j++) {
      cout << m10.at(i, j) << " ";
    } // for
    cout << "\n";
  } // for
  
}
