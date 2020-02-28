package org.academiadecodigo.rhashtafaris.promptview;

class User {

    private String userName;
    private String password;

    User(String userName, String password) {

        this.userName = userName;
        this.password = password;
    }

    void userLogin(String userNameInput, String passwordInput) {

        if (userName.equals(userNameInput) && password.equals(passwordInput)) {

            System.out.println("\n" + "Login Successful!");
            System.out.println("Welcome home, " + userName + "!");
            return;
        }

        System.out.println("\n" + "Login Unsuccessful... Try again.");
    }
}
