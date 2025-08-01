package Test;

import Main.nl.huiswerk.service.NumberChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberCheckerTest {

    @Test
    void testEvenNumber() {
        assertEquals("Number is even", NumberChecker.checkEvenOrOdd(4));
    }

    @Test
    void testOddNumber() {
        assertEquals("Number is uneven", NumberChecker.checkEvenOrOdd(5));
    }
}
