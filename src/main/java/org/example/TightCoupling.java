package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TightCoupling {
    public static void main(String[] args) {
        UserManager userManager = new UserManager(new UserDatabase());
        System.out.println(userManager.getUserDetails());
    }
}