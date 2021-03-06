package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double rsl = -1;
        double perimeter = (a + b + c) / 2;
        rsl = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
