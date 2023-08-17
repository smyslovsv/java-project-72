import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    public void test() {

        String expected = "first";
        String actual = "second";
        assertEquals(expected, actual);
    }
}
