package ru.job4j.oop;

public class Student extends Object {

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song() {
        System.out.println("I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
