package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenManWeight() {
        short one = 187;
        double result = Fit.manWeight(one);
        double expected = 100.05;
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void whenWomanWeight() {
        short one = 167;
        double result = Fit.womanWeight(one);
        double expected = 65.55;
        Assert.assertEquals(result, expected, 0.01);
    }
}