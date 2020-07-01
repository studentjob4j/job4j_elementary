package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

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

    @Test
    public void distance3d() {
        Point one = new Point(0, 0, 2);
        Point two = new Point(0, 0, 3);
        double result = one.distance3d(two);
        Assert.assertThat(result, is(1.0));
    }
}