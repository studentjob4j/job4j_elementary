package ru.job4j.oop;

public class Ball {
    private String name;

    public Ball(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void ask() {
       System.out.println("Ты хочешь меня сьесть ?");
   }
}
