import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    void testAddition() {
        int result = Addition.add(5, 3);
        assertEquals(8, result);
    }
}
