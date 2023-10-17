import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberUtilsTest {

    @Test
    public void testCalculateAverage() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double expectedAverage = 3.0;
        double actualAverage = NumberUtils.calculateAverage(numbers);
        assertEquals(expectedAverage, actualAverage, 0.001);
    }

    @Test
    public void testCompareAverages() {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(4, 5, 6);
        String expectedMessage1 = "Второй список имеет большее среднее значение";
        List<Integer> numbers3 = Arrays.asList(1, 2, 3);
        List<Integer> numbers4 = Arrays.asList(3, 2, 1);
        String expectedMessage2 = "Средние значения равны";
        assertEquals(expectedMessage1, NumberUtils.compareAverages(numbers1, numbers2));
        assertEquals(expectedMessage2, NumberUtils.compareAverages(numbers3, numbers4));
    }
}
