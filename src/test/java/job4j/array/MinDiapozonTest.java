package job4j.array;

import org.junit.Test;
import ru.job4j.array.MinDiapozon;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapozonTest {

    @Test
    public void whenFirstMin() {
        assertThat(MinDiapozon.findMin(new int[] {-1, 0, 5, 10}, 1, 3), is(0));
    }

    @Test
    public void whenLastMin() {
        assertThat(MinDiapozon.findMin(new int[] {10, 5, 3, 1}, 1, 3), is(1));
    }

    @Test
    public void whenMiddleMin() {
        assertThat(MinDiapozon.findMin(new int[] {10, 2, 5, 1}, 0, 2), is(2));
    }

}