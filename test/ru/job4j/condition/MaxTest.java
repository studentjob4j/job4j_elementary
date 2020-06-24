package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;


@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class MaxTest {

    @Test
    public void whenm5and10maxthen10() {
        int except = 10;
        int result = Max.max(5, 10);
        Assert.assertThat(result, is(except));
    }

    @Test
    public void whenm5and2maxthen5() {
        int except = 5;
        int result = Max.max(5, 2);
        Assert.assertThat(result, is(except));
    }

    @Test
    public void whenm5and5maxthen5() {
        int except = 5;
        int result = Max.max(5, 5);
        Assert.assertThat(result, is(except));
    }
}