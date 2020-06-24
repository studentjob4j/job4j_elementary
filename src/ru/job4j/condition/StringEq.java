package ru.job4j.condition;

public class StringEq {

    public static boolean check(String login) {
        String root = new String("Evgenii");
        boolean access = root.equals(login);
        return access;
    }

    public static void main(String[] args) {
        String your = "Evgenii";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
        your = "Mike";
        userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
    }
}
