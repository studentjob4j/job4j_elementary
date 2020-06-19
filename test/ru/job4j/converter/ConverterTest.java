package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;


public class ConverterTest {

    @Test
    public void whenConvert140rubleToEuroThen2() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180rubleToDollarThen3() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}