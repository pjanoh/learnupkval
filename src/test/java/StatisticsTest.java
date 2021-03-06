import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsTest {

    @Test
    public void shouldFindMaxInTheMiddle() {
        int[] salaries = { 35_000, 5_000, 25_000, 17_000 };
        Statistics st = new Statistics(salaries);

        int expected = 35_000;
        int actual = st.max();

        Assertions.assertEquals(expected, actual);
    }
}
