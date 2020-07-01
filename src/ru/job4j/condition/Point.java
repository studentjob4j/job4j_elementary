package ru.job4j.condition;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public  double distance(Point that) {
        double result;
        result = Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2));
        return result;
    }

    public double distance3d(Point that) {
        double result = Math.sqrt(Math.pow((this.x - that.x), 2) + (Math.pow((this.y - that.y), 2) + (Math.pow((this.z - that.z), 2))));
        return result;
    }

    public static void main(String[] args) {
        Point point = new Point(0, 0);
        Point point2 = new Point(0, 2);
        double distance = point.distance(point2);
        System.out.println(distance);
    }
}
