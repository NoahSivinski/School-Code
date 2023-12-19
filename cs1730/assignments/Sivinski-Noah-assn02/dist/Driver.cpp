#include <cstdlib>
#include <iostream>
#include "Account.h"

using namespace std;

int main(){

  Account account1("account1");
  Account account2("account2");
  account1.setBalance(50.0);
  cout << account1.getName() << endl;
  cout << account2.getName() << endl;

  account1.setBalance(-10);
  account1.deposit(100);
  account1.withdraw(50);
  account1.interest(-0.8);
  account1.transferTo(10.5, account2);
  cout << account1.getBalance() << endl;
  cout << account2.getBalance() << endl;

  account1.setName("noah");
  cout << account1.getName() << endl;
  cout << account2.getName() << endl;
  
  return EXIT_SUCCESS;
}
