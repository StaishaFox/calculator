import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class maintest {

    @Test
    void addition() {
        assertEquals(10, main.add(1, 9));
    }

    @Test
    void subtraction() {
        assertEquals(8, main.sub(11, 3));
    }

    @Test
    void multiplication() {
        assertEquals(25, main.multi(5,5));
    }

    @Test
    void division() {
        assertEquals(2, main.div(10, 5));
    }
}
