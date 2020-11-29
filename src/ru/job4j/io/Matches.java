package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private static int count;

    public static void main(String[] args) {
        boolean result = true;
        count = 11;
        Scanner input = new Scanner(System.in);
        while (result) {
            System.out.println("Первый игрок введите число от 1 до 3");
            Integer one = Integer.valueOf(input.nextLine());
            count -= one;
            System.out.println("Осталось  " + count + " спичек на столе");
                if (count <= 0) {
                System.out.println("Выиграл первый игрок");
                result = false;
                break;
               }
            System.out.println("Второй игрок введите число от 1 до 3");
            Integer two = Integer.valueOf(input.nextLine());
            count -= two;
            System.out.println("Осталось  " + count + " спичек на столе");
              if (count <= 0) {
                System.out.println("Выиграл второй игрок");
                result = false;
                break;
            }
        }
    }
}
