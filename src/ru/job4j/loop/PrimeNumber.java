package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int index = 0; index <= finish; index++) {
            if (CheckPrimeNumber.check(index)) {
              count++;
            }
        }
        return count;
    }
}
