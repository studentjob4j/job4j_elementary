package ru.job4j.inheritance;

public class JSonReport  extends  TextReport {

    @Override
    public String generate(String name, String body) {
        String ln = System.lineSeparator();
        String result = "{" + ln + name  + " : name ," + ln + body + " : body" + ln + "}";
        return result;
    }

}

