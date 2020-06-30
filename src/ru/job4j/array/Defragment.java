package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int i = point; i < array.length; i++) {
                    if (array[i] != null) {
                        swap(array, point, i);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    private static void swap(String[] data, int nullIndex, int notNullIndex) {
              String temp = data[notNullIndex];
              data[nullIndex] = temp;
              data[notNullIndex] = null;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
