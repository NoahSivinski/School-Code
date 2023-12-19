#ifndef MATRIX_H
#define MATRIX_H

#include <iostream>
#include <string>
typedef unsigned int uint;


class Matrix {

  friend std::ostream& operator<<(std::ostream & output, const Matrix & m);
  
  friend Matrix operator+(double s, const Matrix & m);

  friend Matrix operator-(double s, const Matrix & m);

  friend Matrix operator*(double s, const Matrix & m);

  friend Matrix operator/(double s, const Matrix & m);

  
  double** array;
  int rowNum;
  int colNum;
  
public:

        Matrix(uint rows, uint cols);                   // constructor (all elements initialized to 0)
        Matrix(double** values, int w, int h);          // constructor (must make a copy of the passed in array)
        Matrix(const Matrix & m);                       // copy constructor
        ~Matrix();                                      // destructor

        Matrix add(double s) const;                     // add scalar to this matrix
        Matrix add(const Matrix & m) const;             // add this matrix and another matrix

        Matrix subtract(double s) const;                // subtract scalar from this matrix
        Matrix subtract(const Matrix & m) const;        // subtract another matrix from this matrix

        Matrix multiply(double s) const;                // multiply this matrix by a scalar
        Matrix multiply(const Matrix & m) const;        // multiply this matrix by another matrix

        Matrix divide(double s) const;                  // divide this matrix by a scalar
        Matrix t() const;                               // transpose of this matrix

        const uint numRows() const;                     // returns the number of rows
        const uint numCols() const;                     // returns the number of cols

        double & at(uint row, uint col);                // get/set element at row,col
        const double & at(uint row, uint col) const;    // get element at row,col (when using a const object)

  double** tempArray() const;

  void destructArray(double** array) const;

  Matrix operator+(double s) const;

  Matrix operator+(const Matrix & m) const;

  Matrix operator-(double s) const;
  
  Matrix operator-(const Matrix & m) const;

  Matrix operator*(double s) const;

  Matrix operator*(const Matrix & m) const;

  Matrix operator/(double s) const;

  double& operator()(uint row, uint col);

  void operator=(const Matrix & m);
  
private:
  //double** array;
};

#endif
