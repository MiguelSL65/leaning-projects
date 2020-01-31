package org.academiadecodigo.rhashtafaris.moneyinthebank;

public class Person {

    private String name;
    private Wallet myWallet;
    private Bank myBank;

    public Person (String name, Wallet myWallet, Bank myBank) {
        this.name = name;
        this.myWallet = myWallet;
        this.myBank = myBank;
    }

    public void withdrawMoneyFromBank(int amount) {
        myBank.withdrawal(amount);
        myWallet.addMoneyToWallet(amount);
    }


}
