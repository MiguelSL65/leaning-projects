package org.academiadecodigo.rhashtafaris.moneyinthebank;

public class Wallet {

    private int myMoney;

    public Wallet (int myMoney) {
        this.myMoney = myMoney;
    }

    public int getMyMoney() {
        return myMoney;
    }

    public void addMoneyToWallet (int moneyWithdrawed){
        myMoney += moneyWithdrawed;
    }

    public void removeMoneyFromWallet (int moneySpent) {
        myMoney -= moneySpent;
    }
}
