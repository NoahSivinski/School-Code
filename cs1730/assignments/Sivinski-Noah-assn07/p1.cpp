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
  
  cout << "assignment operator test" << endl;
  Matrix m10(5, 5);
  m10 = m1;
  cout << m1 << endl;
  cout << m10 << endl;

  Matrix test(2, 2);
  
  cout << "tester: operator() test" << endl;
  Matrix m11(2, 2);
  m11(0, 0) = 5;
  m11(1, 1) = 8;
  cout << m11 << endl;
 
  cout << "\ntoString operator test\n" << m1 << endl;

  Matrix m12(2, 2);
  m12 = m12 + 2;
  cout << "\nadd(matrix, double) test\n" << m12 << endl;

  m12 = m12 + m11;
  cout << "\nadd(matrix, matrix) test\n" << m12 << endl;

  m12 = test;
  m12 = 2 + m12;
  cout << "\nadd(double, matrix) test\n" << m12 << endl;

  m12 = m12 - 1;
  cout << "\nsubtract(matrix, double) test\n" << m12 << endl;

  m12 = 1 - m12;
  cout << "\nsubtract(double, matrix) test\n" << m12 << endl;

  m12 = m12 + 2;
  m12 = m12 - m11;
  cout << "\nsubtract(matrix, matrix) test\n" << m12 << endl;

  m12 = test;
  m12 = m12 + 2;
  m12 = m12 * 10;
  cout << "\nmultiply\n" << m12 << endl;
  
    
  cout << "operator() test" << endl;
  Matrix m13(2, 2);
  m13(0, 0) = 10;
  m13(1, 1) = 3;
  m13(1, 0) = 4;
  cout << m13 << endl;

  cout << "multiply(matrix, matrix) test" << endl;
  Matrix m14 = m13 * m11 ;
  cout << m14 << endl;

  Matrix m15 = 2 -  m1;
  cout << m15 << endl;

  Matrix m16(1, 1);
}
