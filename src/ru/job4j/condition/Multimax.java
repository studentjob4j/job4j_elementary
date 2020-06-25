package ru.job4j.condition;

public class Multimax {

    public static int max(int first, int second, int third) {
        int temp = Max.max(first, second);
        return third > temp ? third : temp;
    }
}
