package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class MultimaxTest {

    @Test
    public void whenmaxFirst() {
        Max max = new Max();
        int result = max.max(5, 2, 4);
        int except = 5;
        Assert.assertThat(result, is(except));
    }

    @Test
    public void whenmaxSecond() {
        Max max = new Max();
        int result = max.max(5, 20, 4);
        int except = 20;
        Assert.assertThat(result, is(except));
    }

    @Test
    public void whenmaxThird() {
        Max max = new Max();
        int result = max.max(5, 20, 40);
        int except = 40;
        Assert.assertThat(result, is(except));
    }

    @Test
    public void whenNomax() {
        Max max = new Max();
        int result = max.max(5, 5, 5);
        int except = 5;
        Assert.assertThat(result, is(except));
    }
}