package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            if (number % 2 == 0 || (number % 3 == 0 && number != 3)) {
                prime = false;
                break;
            }

        }
        return prime;
    }
}
