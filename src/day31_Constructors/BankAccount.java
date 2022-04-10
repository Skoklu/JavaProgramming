package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: $"+ balance);
    }

    public void deposit(double amount){
        if (amount<=0){
            System.out.println("Depositin amount can not be zero or negative");
            return;//exits the method if the amount is invalid
        }
        balance+=amount;
    }

    public void withdraw(double amount){
        if (amount>balance){   //if withdrawing amount is greater than available balance
            System.out.println("Insufficient Balance");
            return;
        }
        if (amount<=0){  //if withdrawing amount is negative or zero
            System.out.println("Withdrawing amount can not be negative or zero");
            return;
        }
        balance -= amount;  //we put here (-=)sign that it is effecting our balance when we withDraw and deposit money.
    }
}
/*
BankAccount Task:(+)
	        Attributes:
	                1. accountHolder, 2. accountNumber, 3. balance

	        Actions:
	        	1. setInfo(): sets the accountHolder and accountNumber attributes
	        	2. toString()
	            3. checkBalance():displays the available balance
	            2. deposit(): increases the balance by the given amount
				3. withdraw(): decreases the balance by the given amount


 */