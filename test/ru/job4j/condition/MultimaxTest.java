package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;


@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class MultimaxTest {

    @Test
    public void whenmaxFirst() {
        int result = Multimax.max(5, 2, 4);
        int except = 5;
        Assert.assertThat(result, is(except));
    }

    @Test
    public void whenmaxSecond() {
        int result = Multimax.max(5, 20, 4);
        int except = 20;
        Assert.assertThat(result, is(except));
    }

    @Test
    public void whenmaxThird() {
        int result = Multimax.max(5, 20, 40);
        int except = 40;
        Assert.assertThat(result, is(except));
    }

    @Test
    public void whenNomax() {
        int result = Multimax.max(5, 5, 5);
        int except = 5;
        Assert.assertThat(result, is(except));
    }
}