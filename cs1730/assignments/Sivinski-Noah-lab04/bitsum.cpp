#include <iostream>
#include "bitsum.h"

int numberOfOnes(unsigned long int value) {
  const unsigned SHIFT {8 * sizeof(unsigned long long int) - 1};
  const unsigned long long int MASK {static_cast<const unsigned long long int>(1UL << SHIFT)};
  int counter = 0;
  
  for (unsigned i{0}; i <= SHIFT; i++) {

    if(value & MASK) {
      counter++;
    } // if
    value <<= 1;
    
  } // for
  
  return counter;
} // numberOfOnes
