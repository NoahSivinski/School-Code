//typedef unsigned int uint;
#include "Matrix.h"

//variable initialization
double** array;
int rowNum = 0;
int colNum = 0;

//constructor - all elements initialized to 0
Matrix::Matrix(uint rows, uint cols) {
  array = new double*[rows];
  for (uint i = 0; i < rows; i++) {
    array[i] = new double[cols];
  }; // for
  for (uint i = 0; i < rows; i++) {
    for (uint j = 0; j < cols; j++) {
      array[i][j] = 0;
    } // for
  } // for
  rowNum = rows;
  colNum = cols;
} // Matrix

//constructor - makes a copy of the passed in array
Matrix::Matrix(double** values, int w, int h) {
  array = new double*[w];
  for (int i = 0; i < w; i++) {
    array[i] = new double[h];
  }; // for
  for (int i = 0; i < w; i++) {
    for (int j = 0; j < h; j++) {
      array[i][j] = values[i][j];
    } // for
  } // for
  rowNum = w;
  colNum = h;
} // Matrix

//constructor - copy constructor
Matrix::Matrix(const Matrix & m) {
  array = new double*[m.numRows()];
  rowNum = m.numRows();
  colNum = m.numCols();
  for (uint i = 0; i < numRows(); i++) {
    array[i] = new double[m.numCols()];
  }; // for
  for (int i = 0; i < rowNum; i++) {
    for (int j = 0; j < colNum; j++) {
      array[i][j] = m.at(i, j);
    } // for
  } // for
} // Matrix

//destructor
Matrix::~Matrix() {
  for (uint i = 0; i < numRows(); i++) {
    delete[] array[i];
  } // for
  delete[] array;
} // ~Matrix

// adds a scalar to this matrix
Matrix Matrix::add(double s) const {
  
  //creates a temporary array - used in most methods
  double** temp = tempArray(); 
  
  for (uint i = 0; i < numRows(); i++) {
    for (uint j = 0; j < numCols(); j++) {
      temp[i][j] += s;
    } // for
  } // for
  Matrix tempMatrix(temp, rowNum, colNum);
  destructArray(temp);
  return tempMatrix;
} // add(double s)

//adds this matrix and the parameter matrix
Matrix Matrix::add(const Matrix & m) const {
  double** temp = tempArray();
  for (uint i = 0; i < numRows(); i++) {
    for (uint j = 0; j < numCols(); j++) {
      temp[i][j] += m.at(i, j);
    } // for
  } // for
  Matrix tempMatrix(temp, rowNum, colNum);
  destructArray(temp);
  return tempMatrix;
} // add(const Matrix & m)

//subtracts a scalar from this matrix
Matrix Matrix::subtract(double s) const {
  double** temp = tempArray();
  for (uint i = 0; i < numRows(); i++) {
    for (uint j = 0; j < numCols(); j++) {
      temp[i][j] -= s;
    } // for
  } // for
  Matrix tempMatrix(temp, rowNum, colNum);
  destructArray(temp);
  return tempMatrix;
} // subtract(double s)

// subtracts another matrix from this matrix
Matrix Matrix::subtract(const Matrix & m) const {
  double** temp = tempArray();
  for (uint i = 0; i < numRows(); i++) {
    for (uint j = 0; j < numCols(); j++) {
      temp[i][j] -= m.at(i, j);
    } // for
  } // for
  Matrix tempMatrix(temp, rowNum, colNum);
  destructArray(temp);
  return tempMatrix;
} // subtract(const Matrix & m)

// multiplies this matrix by a scalar
Matrix Matrix::multiply(double s) const {
  double** temp = tempArray();
  for (uint i = 0; i < numRows(); i++) {
    for (uint j = 0; j < numCols(); j++) {
      temp[i][j] *= s;
    } // for
  } // for
  Matrix tempMatrix(temp, rowNum, colNum);
  destructArray(temp);
  return tempMatrix;
} // multiply(double s)

// multiplies this matrix by another matrix
Matrix Matrix::multiply(const Matrix & m) const {
  double** temp = tempArray();
  
  //initialzes each element of temp to 0
  for (int i = 0; i < rowNum; i++) {
     for (uint j = 0; j < numCols(); j++) {
       temp[i][j] = 0;
     } // for
   }; // for

  //initializes each element of temp to its respective value
  for(uint i = 0; i < numRows(); i++) {
    for(uint j = 0; j < m.numCols(); j++) {
      for (uint k = 0; k < m.numRows(); k++) {
	temp[i][j] += array[i][k] * m.at(k, j);
      } // for
    } // for
  } // for
  Matrix tempMatrix(temp, rowNum, colNum);
  destructArray(temp);
  return tempMatrix;
} // multiply(const Matrix & m)

// divides this matrix by a scalar
Matrix Matrix::divide(double s) const {
  double** temp = tempArray();
  for (uint i = 0; i < numRows(); i++) {
    for (uint j = 0; j < numCols(); j++) {
      temp[i][j] /= s;
    } // for
  } // for
  Matrix tempMatrix(temp, rowNum, colNum);
  destructArray(temp);
  return tempMatrix;
} // divide(double s)

// calculates the transpose of this matrix
Matrix Matrix::t() const {
  double** temp = tempArray();
  for (uint i = 0; i < numRows(); ++i) {
    for (uint j = 0; j < numCols(); ++j) {
      temp[j][i] = array[i][j];
    } // for
  } // for
  Matrix tempMatrix(temp, rowNum, colNum);
  destructArray(temp);
  return tempMatrix;
} // t()

// returns the number of rows
const uint Matrix::numRows() const {
  return rowNum;
} // numRows()

// returns the number of columns
const uint Matrix::numCols() const {
  return colNum;
} // numCols()

// gets/sets the element at row, col
double & Matrix::at(uint row, uint col) {
  return array[row][col];
} // at(uint row, uint col)

// gets/sets the element at row, col
 const double & Matrix::at(uint row, uint col) const {
   return array[row][col];
} // at(uint row, uint col)

// creates a temporary copy of this matrix 
double** Matrix::tempArray() const {
  double** temp = new double*[rowNum];
   for (int i = 0; i < rowNum; i++) {
     temp[i] = new double[colNum];
   }; // for
   for (int i = 0; i < rowNum; i++) {
     for (int j = 0; j < colNum; j++) {
       temp[i][j] = array[i][j];
     } // for
   } // for
   return temp;
} // tempArray()

// destructs the double array passed to it
void Matrix::destructArray(double** arr) const {
  for (uint i = 0; i < numRows(); i++) {
    delete[] arr[i];
  } // for
  delete[] arr;
} // destructArray(double** arr)

// returns this + s
Matrix Matrix::operator+(double s) const {
  Matrix temp(add(s));
  return temp;
} // operator+

// returns this + m
Matrix Matrix::operator+(const Matrix & m) const {
  Matrix temp(add(m));
  return temp;
} // operator+

// returns this - s
Matrix Matrix::operator-(double s) const {
  Matrix temp(subtract(s));
  return temp;
} // operator-

// returns this - m
Matrix Matrix::operator-(const Matrix & m) const {
  Matrix temp(subtract(m));
  return temp;
} // operator-

// returns array * s
Matrix Matrix::operator*(double s) const {
  Matrix temp(multiply(s));
  return temp;
} // operator*

// returns array * m
Matrix Matrix::operator*(const Matrix & m) const {
  Matrix temp(multiply(m));
  return temp;
} // operator*

// returns array / s
Matrix Matrix::operator/(double s) const {
  Matrix temp(divide(s));
  return temp;
} // operator/

// returns array toString
std::ostream& operator<<(std::ostream& output, const Matrix & m) {
  for (uint i = 0; i < m.numRows(); i++) {
    output << "[ ";
    for (uint j = 0; j < m.numCols() - 1; j++) {
      output << m.at(i, j) << ", ";
    } // for
    output << m.at(i, m.numCols() - 1) << " ]" << std::endl;
  } // for
  return output;
} // operator<<
  
// returns s + m
Matrix operator+(double s, const Matrix & m) {
  Matrix temp(m.add(s));
  return temp;
} // operator+

// returns s - m
Matrix operator-(double s, const Matrix & m) {
  double** temp = m.tempArray();
  for (uint i = 0; i < m.numRows(); i++) {
    for (uint j = 0; j < m.numCols(); j++) {
      temp[i][j] = s - temp[i][j];
    } // for
  } // for
  Matrix tempMatrix(temp, m.numRows(), m.numCols());
  m.destructArray(temp);
  return tempMatrix;
} // operator-

// returns s * m
Matrix operator*(double s, const Matrix & m) {
  Matrix temp(m.multiply(s));
  return temp;
} // operator*

// returns s / m
Matrix operator/(double s, const Matrix & m) {
  double** temp = m.tempArray();
  for (uint i = 0; i < m.numRows(); i++) {
    for (uint j = 0; j < m.numCols(); j++) {
      temp[i][j] = s / temp[i][j];
    } // for
  } // for
  Matrix tempMatrix(temp, m.numRows(), m.numCols());
  m.destructArray(temp);
  return tempMatrix;
} // operator/

// returns element at [row][col]
double& Matrix::operator()(uint row, uint col) {
  return at(row, col);
} // operator()

// overloaded assignment operator
void Matrix::operator=(const Matrix & m) {
  for (uint i = 0; i < m.numRows(); i++) {
    for (uint j = 0; j < m.numCols(); j++) {
      array[i][j] = m.at(i, j);
    } // for
  } // for
  rowNum = m.numRows();
  colNum = m.numCols();
} // operator=
  
