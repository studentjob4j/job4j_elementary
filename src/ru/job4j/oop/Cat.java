package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.food + " " + this.name);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food and nick.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Murzik");
        gav.show();
        System.out.println("There are black's food and nick.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Kukuruznick");
        black.show();
    }
}
