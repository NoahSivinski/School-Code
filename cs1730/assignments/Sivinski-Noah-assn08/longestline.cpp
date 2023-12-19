#include <cstdlib>
#include <iostream>
#include <fcntl.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

using namespace std;

#define BUFFSIZE 4096

int main() {
  int n;
  int len;
  int max;
  char buf [BUFFSIZE];
  while ((n = read(STDIN_FILENO, buf, 1)) > 0) {
    if (buf[0] != '\n') {
      len++;
    } else if (len > max) {
      max = len;
      len = 0;
    } else {
      len = 0;
    } // if-else
  } // while
  if (len > max) {
    max = len;
  } // if
  cout << max << endl;
  exit(0);
} // main
