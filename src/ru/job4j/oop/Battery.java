package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
        System.out.println("Полная зарядка батареи - " + another.load);
    }

    public static void main(String[] args) {
        Battery battery = new Battery(30);
        Battery battery2 = new Battery(50);
        battery2.exchange(battery);
    }
}
