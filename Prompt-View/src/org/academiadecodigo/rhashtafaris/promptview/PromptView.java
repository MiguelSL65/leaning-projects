package org.academiadecodigo.rhashtafaris.promptview;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

class PromptView {

    private String welcomeMessage;
    private String askForCredentials;
    private User user;
    private Prompt prompt;

    PromptView(User user) {

        this.prompt = new Prompt(System.in, System.out);
        this.welcomeMessage = "\n" + "Welcome to your first Prompt-View Experience!";
        this.askForCredentials = "Insert your credentials below:";
        this.user = user;
    }

    void login() {

        programMessages();

        user.userLogin(userNameInput(), passwordInput());
    }

    private String userNameInput() {

        StringInputScanner userNameInput = new StringInputScanner();
        userNameInput.setMessage("Username: ");
        return prompt.getUserInput(userNameInput);
    }

    private String passwordInput() {

        PasswordInputScanner passwordInput = new PasswordInputScanner();
        passwordInput.setMessage("Password: ");
        return prompt.getUserInput(passwordInput);
    }

    private void programMessages() {

        System.out.println(welcomeMessage + "\n");
        System.out.println(askForCredentials);
    }

}
