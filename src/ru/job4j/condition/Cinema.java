package ru.job4j.condition;

public class Cinema {

    public static void access(int age) {
        int agepermit = 18;
        System.out.println("The age of the customer is : " + age);
        if (age >= agepermit) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);

    }
}
