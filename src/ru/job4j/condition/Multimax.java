package ru.job4j.condition;

public class Multimax {

    public static int max(int first, int second, int third) {
        return (first > (Max.max(second, third)) ? first : Max.max(second, third));
    }
}
