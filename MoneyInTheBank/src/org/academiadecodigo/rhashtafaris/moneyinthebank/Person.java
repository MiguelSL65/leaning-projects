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

    public void makeDeposit(int amount) {
        myBank.deposit(amount);
    }

    public void sneakerShop(int amount) {
        if (myWallet.walletBalance() < amount) {
            System.out.println("You can't afford this sneakers. Go to ca$hier");
            return;
        }

        myWallet.removeMoneyFromWallet(amount);
        System.out.println("You spent " + amount + "$. Current balance is " + myWallet.walletBalance());
    }

    public void stripClub(int amount) {
        if (myWallet.walletBalance() < amount) {
            System.out.println("You can't get any action tonight ^^ ;)");
            return;
        }

        myWallet.removeMoneyFromWallet(amount);
        System.out.println("You spent " + amount + "$ in girls. You have "
                + myWallet.walletBalance() + "$ in your wallet");
    }
}
