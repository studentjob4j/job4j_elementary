package ru.job4j.loop;

public class Mortgage {

    public static int year(int amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        while (amount > 0) {
            int sum = (int) (amount * percent) + amount;
            int temp = sum - salary;
            amount = (int) ((temp * percent) + temp);
            year++;
        }
        return year;
    }
}
