package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whendistanceTwo() {
        Point one = new Point(0, 0);
        Point two = new Point(2, 0);
        double result = one.distance(two);
        double excepted = 2;
        Assert.assertEquals(result, excepted, 0.01);
    }

    @Test
    public void whendistanceZero() {
        Point one = new Point(2, 0);
        Point two = new Point(2, 0);
        double result = one.distance(two);
        double excepted = 0;
        Assert.assertEquals(result, excepted, 0.01);
    }
}