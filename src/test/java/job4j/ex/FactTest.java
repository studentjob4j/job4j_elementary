package job4j.ex;

import org.junit.Test;
import ru.job4j.ex.Fact;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenStartBiggerThenFinish() {
       Fact fact = new Fact();
       int rsl = fact.calc(-2);
    }

    @Test
    public void whenStartLessThenFinish() {
        Fact fact = new Fact();
        int rsl = fact.calc(3);
        assertThat(rsl, is(6));
    }

}