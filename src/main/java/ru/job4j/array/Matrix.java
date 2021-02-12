package ru.job4j.array;

import java.io.FileOutputStream;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] result = new int[size][size];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (i + 1) * (j + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try {
           FileOutputStream out = new FileOutputStream("result.txt");
            int[][] temp = multiple(2);
            byte[] result = new byte[4];
            int count = 0;
            for (int[] row : temp) {
                for (int cell : row) {
                    result[count++] = (byte) cell;
                }
            }
            out.write(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
