package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;

public class X2Test {

    @Test
    public void whenFirstData() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int result = X2.calc(1, 1, 1, 1);
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void whenSecondData() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int result = X2.calc(0, 1, 1, 1);
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void whenThirdData() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int result = X2.calc(1, 1, 0, 1);
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void whenFourthData() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int result = X2.calc(1, 1, 1, 0);
        Assert.assertThat(result, is(expected));
    }

}