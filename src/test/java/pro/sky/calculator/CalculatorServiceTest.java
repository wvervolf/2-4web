package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void additionCalculatorTest() {
        int a = 1;
        int b = 1;
        int expected = 2;
        int actual = calculatorService.additionCalculator(a, b);
        Assertions.assertEquals(expected, actual);

        a = -1;
        b = -1;
        expected = -2;
        actual = calculatorService.additionCalculator(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void subtractionCalculatorTest() {
        int a = 1;
        int b = 1;
        int expected = 0;
        int actual = calculatorService.subtractionCalculator(a, b);
        Assertions.assertEquals(expected, actual);

        a = -1;
        b = -1;
        expected = 0;
        actual = calculatorService.subtractionCalculator(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void multiplicationCalculatorTest() {
        int a = 1;
        int b = 1;
        int expected = 1;
        int actual = calculatorService.multiplicationCalculator(a, b);
        Assertions.assertEquals(expected, actual);

        a = -1;
        b = -1;
        expected = 1;
        actual = calculatorService.multiplicationCalculator(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void divisionCalculatorTest() {
        int a = 1;
        int b = 1;
        int expected = 1;
        int actual = calculatorService.divisionCalculator(a, b);
        Assertions.assertEquals(expected, actual);

        a = -1;
        b = -1;
        expected = 1;
        actual = calculatorService.divisionCalculator(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void divisionCalculatorNegativeTest() {
        Assertions.assertThrows(DevideByZeroExeption.class, () -> calculatorService.divisionCalculator(1, 0));
    }


}
