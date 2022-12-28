package notation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReversePolishNotationCalculatorTest {
    protected ReversePolishNotationCalculator notation;
    @BeforeEach
    public void beforeEach() {
        notation = new ReversePolishNotationCalculator();
    }

    @Test
    @DisplayName("Тест на сложение")
    public void additionTest() {
        String data = "1 3 +";
        int result = notation.calculatePolishNotation(data);
        assertEquals(4, result);
    }

    @Test
    @DisplayName("Тест на вычитание")
    public void subtractionTest() {
        String data = "5 7 -";
        int result = notation.calculatePolishNotation(data);
        assertEquals(-2, result);
    }

    @Test
    @DisplayName("Тест на умножение")
    public void multiplicationTest() {
        String data = "3 7 *";
        int result = notation.calculatePolishNotation(data);
        assertEquals(21, result);
    }

    @Test
    @DisplayName("Тест на отрицательные числа")
    public void negativeNumberTest() {
        String data = "-3 2 -1 * -";
        int result = notation.calculatePolishNotation(data);
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("Тест на пробелы")
    public void spacesTest() {
        String data = "-4  -5     7 - +";
        int result = notation.calculatePolishNotation(data);
        assertEquals(-16, result);
    }
}