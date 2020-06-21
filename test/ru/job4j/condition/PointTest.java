package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whendistanceTwo() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double result = Point.distance(0, 0, 2, 0);
        double excepted = 2;
        Assert.assertEquals(result, excepted, 0.01);
    }

    @Test
    public void whendistanceZero() {
        int x1 = 2;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double result = Point.distance(2, 0, 2, 0);
        double excepted = 0;
        Assert.assertEquals(result, excepted, 0.01);
    }
}