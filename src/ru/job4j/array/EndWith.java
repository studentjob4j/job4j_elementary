package ru.job4j.array;

public class EndWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        int count = 0;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - post.length  + i] == post[i]) {
               count++;
            }
        }
        if (count == post.length) {
            result = true;
        }
        return result;
    }
}
