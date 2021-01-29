package job4j.array;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.array.SortSelected;

import static org.hamcrest.core.Is.is;


public class SortSelectedTest {

      @Test
      public void when3Numbers() {
          int[] data = new int[]{5, 1, 4};
          int[] result = SortSelected.sort(data);
          int[] except = new int[] {1, 4, 5};
          Assert.assertThat(result, is(except));
      }

    @Test
    public void when5Numbers() {
        int[] data = new int[]{5, 1, 4, 0, 9};
        int[] result = SortSelected.sort(data);
        int[] except = new int[] {0, 1, 4, 5, 9};
        Assert.assertThat(result, is(except));
    }
}