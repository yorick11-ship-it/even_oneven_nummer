import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberCheckerTest {

    private final NumberChecker checker = new NumberChecker();

    @Test
    void testEvenNumber() {
        assertEquals("Number is even", checker.checkEvenOrOdd(4));
    }

    @Test
    void testOddNumber() {
        assertEquals("Number is uneven", checker.checkEvenOrOdd(5));
    }
}
