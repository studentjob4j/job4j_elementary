package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

   @Test
    public void whenP6K2() {
     int p = 6;
     int k = 2;
     double result = SqArea.square(p, k);
     double excepted = 2;
     Assert.assertEquals(result, excepted, 0.01);
   }

    @Test
    public void whenP9K3() {
        int p = 9;
        int k = 3;
        double result = SqArea.square(p, k);
        double excepted = 3;
        Assert.assertEquals(result, excepted, 0.01);
    }
}