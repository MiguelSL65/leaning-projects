package org.academiadecodigo.rhashtafaris.persistence;

public class Main {

    public static void main(String[] args) {

        User miguel = new User();
        UserManager userManager = new UserManager();

        miguel.setId(1);
        miguel.setName("Miguel");
        miguel.setEmail("mail@mail.com");
        miguel.setPassword("ola");

        userManager.insertUser(miguel);
        System.out.println(userManager.findById(1).getName());

        userManager.saveOrUpdate(miguel);
        System.out.println(userManager.saveOrUpdate(miguel).getName());

        userManager.remove(1);
        userManager.closeEmf();
    }
}
