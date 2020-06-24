package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;


 @SuppressWarnings("checkstyle:EmptyLineSeparator")
 public class TriangleTest {

    @Test
    public void whenexist() {
        boolean result = Triangle.exist(2.0, 2, 2);
        Assert.assertThat(result, is(true));
    }

    @Test
    public void whenNoexist() {
        boolean result = Triangle.exist(2.0, 2, 20);
        Assert.assertThat(result, is(false));
    }
}