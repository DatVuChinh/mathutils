import com.example.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testAdd() {
        MathUtils m = new MathUtils();
        assertEquals(5, m.add(2, 3));
    }

    @Test
    void testDivide() {
        MathUtils m = new MathUtils();
        assertEquals(2, m.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        MathUtils m = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> m.divide(4, 0));
    }
}