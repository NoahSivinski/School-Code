#ifndef STUDENT_H
#define STUDENT_H

#include <iostream>
#include <string>


using namespace std;

class Student {

  friend std::ostream& operator<<(std::ostream & output, const Student & s);

  
public:

  Student();
  
  Student(int, string);

  void setStudentID(int);
  
  void setStudentName(string);

  int getStudentID() const;

  string getStudentName() const;

  bool operator==(const Student & student);

private:
  int studentID;
  string studentName;
  
}; // Student

#endif
