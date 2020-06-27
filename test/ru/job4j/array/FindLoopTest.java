package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


 public class FindLoopTest {


    @Test
    public void whenArrayHas0Then2() {
        int[] input = new int[] {1, 3, 0};
        int value = 0;
        int result = FindLoop.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas5Then() {
        int[] input = new int[] {1, 3, 0};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }


}