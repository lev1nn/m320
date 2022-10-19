package W08.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(3, calculator.add(2, 1));
    }

    @Test
    void subtract() {
        assertEquals(1, calculator.subtract(2, 1));
    }
}