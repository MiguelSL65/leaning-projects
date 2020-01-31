package org.academiadecodigo.rhashtafaris.moneyinthebank;

import java.sql.SQLOutput;

public class Bank {

    private int balance;

    public Bank (int balance) {
        this.balance = balance;
    }

    public void deposit (int depositAmount) {
        balance += depositAmount;
        System.out.println("You made a deposit of " + depositAmount + " $. in your bank account." +
                " Your current balance is " + balance + " $.");
    }

     public void withdrawal (int withdrawalAmount) {
        balance -= withdrawalAmount;
        System.out.println("You made a withdrawal of " + withdrawalAmount + " $." + "Your current balance is " + balance);
        if (balance <= 75) {
            System.out.println("Watch out kid... you are spending a lot. Keep an eye on your balance.");
        }
    }

}
