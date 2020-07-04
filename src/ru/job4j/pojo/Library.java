package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {


        Book book = new Book("Clean code", 10);
        Book book2 = new Book("Test", 12);
        Book book3 = new Book("Azbuka", 34);
        Book book4 = new Book("Morning", 14);
        Book[] data = new Book[4];
        data[0] = book;
        data[1] = book2;
        data[2] = book3;
        data[3] = book4;
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].getName());
        }
        System.out.println();
        Book temp = data[0];
        data[0] = data[3];
        data[3] = temp;
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].getName());
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            if (data[i].getName().equals("Clean code")) {
                System.out.println(data[i].getName());
                break;
            }
        }
    }
}
