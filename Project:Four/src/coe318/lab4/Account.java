package coe318.lab4; 
//Saad Wasim 501052735
// Accounts class is the Class where oject of "Account" is intialized for each person
//Account instance variables should be private since we dont want the information of the account class being accessed directly
// Note we are tasked to make a Getters for the the required parameters of the constructor so that we can return the values of Name,number, balance
// the methods Deposit(Set up and if statement these are boolean returns of "true" and "false" deposit will fail if amount is negative or "0")
// The method withdraw as same as deposit, but we need to keep in mind that alongside negative and "0" the account owner can not withdraw above his balance
// BTW to self if the instant variables are not listed as static they cannot be reference to self in getters as well as the main(String[]args) inside this class for test
public class Account {
 private String name;
 private int num; 
 private double bal; 

 public  Account(String Pname, int Anumber, double inBalance){
    name=Pname; 
    num=Anumber; 
    bal=inBalance; 
 }   

 public String getName(){ // Returns the name of of an Account
    return name; 
 } 
 public double getBalance(){ // Returns the "balance" of of an Account
    return bal; 
} 
public int getNumber(){ // Returns the "number" of of an Account
    return num; 

} 
public boolean deposit(double amount) { 
    if (amount<=0) { 
        return false; 

}
    else {
       bal += amount; 
       return true; 
}


}
public boolean withdraw(double amount) { 
  boolean draw = false; 
    if((this.bal - amount) >= 0 && amount > 0){
            this.bal -= amount;
              draw = true;
        }else{
            return draw;
        }
     return draw;
}         

 @Override
 public String toString() {//DO NOT MODIFY
 return "(" + getName() + ", " + getNumber() + ", " +
 String.format("$%.2f", getBalance()) + ")";

}
// Test Run: 
public static void main(String[]args){
Account Saad = new Account("Saad",5,30);
Saad.deposit(0); 
System.out.println(Saad); 
Saad.withdraw(10);
System.out.println(Saad);
}
}

