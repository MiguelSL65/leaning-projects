package org.academiadecodigo.rhashtafaris.promptview;

public class Main {

    public static void main(String[] args) {

        User user = new User("Miguel SL", "safestPassword");
        PromptView display = new PromptView(user);

        display.login();

    }
}
