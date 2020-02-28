package org.academiadecodigo.rhashtafaris.promptview;

public class Main {

    public static void main(String[] args) {

        User user = new User("Miguel", "fuck");
        PromptView display = new PromptView(user);

        display.login();

    }
}
