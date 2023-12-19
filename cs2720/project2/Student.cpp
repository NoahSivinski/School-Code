#include "Student.h"
#include <string>
#include <iostream>

using namespace std;

Student::Student() {
  id = 0;
  name = "";
} // Student

Student::Student(int id, string name) {
  this->id = id;
  this->name = name;
} // Student

void Student::setID(int id) {
  this->id = id;
} // setStudentID

void Student::setName(string name) {
  this->name = name;
} //setStudentName

int Student::getID() const {
  return id;
} // getStudentID

string Student::getName() const {
  return name;
} // getStudentName

bool Student::operator==(const Student & s) const {
  if (getID() == s.getID()) {
    return true;
  } else {
    return false;
  } // if-else
} // operator==

bool Student::operator<(const Student& s) const {
  if (getID() < s.getID()) {
    return true;
  } else {
    return false;
  } // if-else
} // operator<

bool Student::operator>(const Student& s) const {
  if (getID() > s.getID()) {
    return true;
  } else {
    return false;
  } // if-else
} // operator>

bool Student::operator!=(const Student& s) const {
if (getID() != s.getID()) {
    return true;
  } else {
    return false;
  } // if-else  
} // operator!=
  
