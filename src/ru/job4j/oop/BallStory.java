package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball ball = new Ball("колобок");
        Hall hall = new Hall("заяц");
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        ball.ask();
        hall.tryEat(ball);
        wolf.tryEat(ball, hall);
        fox.tryEat(ball, hall);
    }
}
