/**
 *
 * @author Your name
 */
package coe318.lab4;

public class Bank {
    private String name;
    /**
     * An array of Accounts managed by
     * this bank.
     */
    private Account [] accounts;//Int his array your user hads 12354, 271145, 82649
    private int numAccounts;//number of active accounts - 3

    public Bank(String name, int maxNumberAccounts) {
        this.name = name;
        accounts = new Account[maxNumberAccounts];
        numAccounts = 0;
    }

    //Account[] accounts = new Account[3];
    //accounts[0] = new Account(......);
    //accounts[1] = '' '';
    //accounts[2] = '' '';

    /**
     * @return the name
     */
    public String getName() {
        return this.name;  //Fix this
    }

    /**
     * @return the numAccounts
     */
    public int getNumAccounts() {
         return numAccounts; //Fix this
    }


    public Account[] getAccounts() {
        return accounts; //Fix this
    }

    /**
     * Return true if the Bank already has an account
     * with this number; otherwise false.
     * @param accountNumber
     * @return
     */
    public boolean hasAccountNumber(int accountNumber) {
        boolean exists = false;
        if(this.accounts[0]!=null){
            for(int i=0; i<numAccounts; i++){
                if(accountNumber==this.accounts[i].getNumber()){
                    exists = true;
                    break;
                }
            }
        }
        return exists;
    }

    //Already exist wihtin accounts aray = [122,123,234]
    //Parameter you passed is 122
    //exists = false
    //122 - exist = true
    //123 - exists = true
    //234 - exists = true
    //New paramter you passe din is 567
    //exists = false
    //122 - exists = false
    //123 - exists = false
    //234 - exists = false


    /**
     * Adds the specified account to the Bank if possible. If the account number
     * already exists or the Bank has reached its maximum
     * number of accounts, return false and do not add it; otherwise,
     * add it and return true.
     * @param account
     * @return true if successful
     */
    public boolean add(Account account) {
        boolean canAdd = false;
        if(!(this.hasAccountNumber(account.getNumber()))&&!(numAccounts==accounts.length)){
            this.accounts[numAccounts] = account; //add the account to the array
            numAccounts++;//youre going to increment the number of accoutns by 1
            canAdd = true;//return true
        }
        return canAdd;
    }

//() OR ()
//NOT(() OR ()) = NOT() AND NOT()
//() AND ()
//NOT(() AND ()) = NOT() OR NOT()

//2 accounts already = numAccounts -> [122,123,0]
//                                      0   1  2         -> numAccounts = 2


    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        String s = getName() + ": " + getNumAccounts() +
                " of " + getAccounts().length +
                " accounts open";
        for(Account account : getAccounts()) {
            if (account == null) break;
            s += "\n  " + account;
        }
        return s;
    }

    //Account[] accounts = new Account[3];
    //accounts[0] = a1;
    //accounts[1] = null;
    //accounts[2] = null;

    public static void main(String[] args) {
        Account a1 = new Account("Chequing",1212,12);
        Account a2 = new Account("Personal Savings",1243,12);
        Account a3 = new Account("Joint Savings",2422,12);
        Account a4 = new Account("Parents' Savings",2422,1200);
        System.out.println("a1 is " + a1);
        System.out.println("a2 is " + a2);
        System.out.println("a3 is " + a3);
        System.out.println("a4 is " + a4);
        Bank b = new Bank("BMO",3);
        System.out.println("Can we add a1? " + b.add(a1));
        System.out.println("Can we add a2? " + b.add(a2));
        System.out.println("Can we add a3? " + b.add(a3));
        System.out.println("Can we add a4? " + b.add(a4));
        System.out.println("Does account 1213 exist? " + b.hasAccountNumber(1213)); //F
        System.out.println("Does account 1212 exist? " + b.hasAccountNumber(1212)); //T
        System.out.println("Does account 1243 exist? " + b.hasAccountNumber(1243)); //T
        System.out.println("Does account 2422 exist? " + b.hasAccountNumber(2422)); //T
        System.out.println("Does account 2423 exist? " + b.hasAccountNumber(2423)); //F

    }

}
