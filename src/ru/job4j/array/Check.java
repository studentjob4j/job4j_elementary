package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = false;
        int count = 0;
        for (int index = 0; index < data.length; index++) {
            boolean example = data[0];
            if (example == data[index]) {
                count++;
            }

        }
        if (count == data.length) {
            result = true;
        }

        return result;
    }
}
