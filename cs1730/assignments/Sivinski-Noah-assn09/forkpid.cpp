#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

int main() {

  printf("Process PID: %d\nParent of Process PID: %d\n", getpid(), getppid());
  
  int pid = fork();

  if (pid == 0) {
    printf("Child PID: %d\nParent PID: %d\n", getpid(), getppid());
  } // if
  
} // main
