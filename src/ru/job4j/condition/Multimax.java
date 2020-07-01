package ru.job4j.condition;

public class Multimax {

    public  int max(int first, int second, int third) {
        Max max = new Max();
        int temp = max.max(first, second);
        return third > temp ? third : temp;
    }
}
