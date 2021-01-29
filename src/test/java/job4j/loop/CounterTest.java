package job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sum() {
      int result = Counter.sum(0, 10);
      int except = 55;
        Assert.assertThat(result, is(except));
    }

    @Test
    public void sumByEvenFrom0To10() {
        int result = Counter.sumByEven(0, 10);
        int except = 30;
        Assert.assertThat(result, is(except));
    }


    @Test
    public void sumByEvenFrom0To5() {
        int result = Counter.sumByEven(0, 5);
        int except = 6;
        Assert.assertThat(result, is(except));
    }
}