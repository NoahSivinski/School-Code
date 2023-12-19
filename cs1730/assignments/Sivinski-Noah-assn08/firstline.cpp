#include <cstdlib>
#include <fcntl.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define BUFFSIZE 4096

int main() {
  int n;
  char buf [1];
  while ((n = read(STDIN_FILENO, buf, 1)) > 0 && buf[0] != '\n') {
    write(STDOUT_FILENO, buf, n);
  } // while
  exit(0);
} // main
