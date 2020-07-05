package ru.job4j.poly;

public class Bus  implements Transport {


    @Override
    public void go() {
        System.out.println("Машина едет");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Количество пассажиров" + number);
    }

    @Override
    public int cost(int fuel) {
        return fuel * 45;
    }
}
