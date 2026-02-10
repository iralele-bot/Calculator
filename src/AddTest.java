import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTest {

    @Test
    void testAddition() {
        assertEquals(8, Add.add(5, 3));
    }
}
