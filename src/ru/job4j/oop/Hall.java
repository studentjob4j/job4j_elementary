package ru.job4j.oop;


public class Hall {

    private String name;

    public Hall(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void tryEat(Ball ball) {
        System.out.println("Я  сьем тебя " + ball.getName());
    }


}
