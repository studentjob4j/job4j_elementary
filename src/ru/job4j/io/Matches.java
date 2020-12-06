package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private static int count = 11;
    private static int in;
    private static boolean result = true;
    private static   String win = "";

    public static void main(String[] args) {
        while (result) {
                if (!input()) {
                   break;
                }
                if (!subtraction()) {
                    break;
                } else {
                    win = "Второй игрок";
                }
                if (!input()) {
                    break;
                }
                if (!subtraction()) {
                    break;
                }
                win = "Первый игрок";
        }
        System.out.println(win + " Победил ");
    }


     private static boolean input() {
         System.out.println(win + " введите число от 1 до 3");
         Scanner input = new Scanner(System.in);
         in = Integer.valueOf(input.nextLine());
         if (in <= 0 || in > 3) {
             System.out.println("Введите правильные данные!");
             win = "Никто не ";
             result = false;
         }
         return result;
     }

     private static boolean subtraction() {
         count -= in;
         System.out.println("Осталось  " + count + " спичек на столе");
         if (count <= 0) {
             result = false;
         }
         return result;
     }
}
