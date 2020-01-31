package org.academiadecodigo.rhashtafaris.moneyinthebank;

public class Main {

    public static void main(String[] args) {

        Wallet myNewWallet = new Wallet(50);
        Bank myNewBank = new Bank(500);
        Person miguel = new Person("miguel", myNewWallet, myNewBank);

        miguel.withdrawMoneyFromBank(50);
        System.out.println(myNewWallet.getMyMoney());

    }

}
