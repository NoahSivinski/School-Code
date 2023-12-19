#ifndef ACCOUNT_H
#define ACCOUNT_H

#include <string>

class Account {
public:
  explicit Account(std::string accountName) {
    setName(accountName);
    bal = 0;
  } // Account
  
  double getBalance() {
    return bal;	       
  } // getBalance()

  void setBalance(double balance) {
    if (balance >= 0.0) {
      bal = balance;
    } // if
  } // setBalance()
  
  double deposit(double depositAmount) {
    if (depositAmount > 0.0) {
      bal = bal + depositAmount;
    } // if
    return bal;	     
  } // deposit()

  double withdraw(double withdrawalAmount) {
    if (withdrawalAmount > 0 && withdrawalAmount <= bal) {
      bal = bal - withdrawalAmount;
    } // if 
    return bal;	
  } // withdraw()

  double interest(double percent) {
    if (percent >= -1.0) {
      bal = bal + (bal * percent);
    } // if
    return bal;	
  } // interest()

  std::string getName() const {
    return name;   
  } // getName()

  void setName(std::string newName) {
    if (newName.length() < 5) {
      name = "Dawgs";
    } else if (newName.length() > 20) {
      name = newName.substr(0, 20);
    } else {
      name = newName;
    } // else
  } // setName()

  bool transferTo(double amount, Account& otherAccount) {
    if (amount > 0 && amount <= bal) {
      otherAccount.deposit(amount);
      bal = bal - amount;
      return true;
    } // if
    return false;
  } // transferTo()

private:
  std::string name;
  double bal{0};
}; // Account

#endif
