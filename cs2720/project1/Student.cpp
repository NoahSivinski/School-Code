#include "Student.h"
#include <string>
#include <iostream>

using namespace std;

Student::Student() {
  studentID = 0;
  studentName = "";
} // Student

Student::Student(int id, string name) {
  studentID = id;
  studentName = name;
} // Student

void Student::setStudentID(int id) {
  studentID = id;
} // setStudentID

void Student::setStudentName(string name) {
  studentName = name;
} //setStudentName

int Student::getStudentID() const{
  return studentID;
} // getStudentID

string Student::getStudentName() const {
  return studentName;
} // getStudentName

bool Student::operator==(const Student & student) {
  if (getStudentID() == student.getStudentID()) {
    return true;
  } else {
    return false;
  } // if-else
} // operator==

std::ostream& operator<<(std::ostream & output, const Student & s) {
  output << s.getStudentID() << " " << s.getStudentName();
  return output;
} // operator<<
 
