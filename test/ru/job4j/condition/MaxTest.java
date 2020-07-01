package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;



public class MaxTest {

    @Test
    public void maxWhen2() {
        Max max = new Max();
        int result = max.max(1, 2);
        Assert.assertThat(result, is(2));
    }

    @Test
    public void testMaxWhen3() {
        Max max = new Max();
        int result = max.max(1, 2, 3);
        Assert.assertThat(result, is(3));
    }

    @Test
    public void testMaxWhen4() {
        Max max = new Max();
        int result = max.max(1, 2, 3, 4);
        Assert.assertThat(result, is(4));
    }
}