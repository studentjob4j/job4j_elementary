package ru.job4j.calculator;

public class Argmethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        Argmethod.hello(name);

        Argmethod.hello(name);

        Argmethod.hello(name);

        Argmethod.hello(name);
    }
}
