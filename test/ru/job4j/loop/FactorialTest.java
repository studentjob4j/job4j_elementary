package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {


    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
       int result = Factorial.calc(5);
       int except = 120;
        Assert.assertThat(result, is(except));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = Factorial.calc(0);
        int except = 1;
        Assert.assertThat(result, is(except));
    }
}

