package ru.job4j.loop;

public class Factorial {

    public static int calc(int n) {
        int result = 1;
        if (n == 0) {
            return 1;
        }
        for (int index = 1; index <= n; index++) {
           result *= index;
        }
        return result;
    }
}
