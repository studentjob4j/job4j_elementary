package ru.job4j.oop;

public class Dantist extends Doctor {
    private int depozit;

    public int getDepozit() {
        return depozit;
    }

    public void healTooth(String heal) {
        System.out.println("You have diagnoz its  " + heal);
    }
}
