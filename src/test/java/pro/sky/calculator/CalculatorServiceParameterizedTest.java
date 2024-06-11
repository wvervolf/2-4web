package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParameterizedTest {
    CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideParamsForSum")
    void sum(int a, int b, int expected) {
        int actual = calculatorService.additionCalculator(a, b);
        Assertions.assertEquals(expected, actual);

    }

    static Stream<Arguments> provideParamsForSum() {
        return Stream.of(Arguments.of(1, 1, 2),
                Arguments.of(1, 0, 1),
                Arguments.of(-1, 0, -1));
    }
    @ParameterizedTest
    @MethodSource("provideParamsForSubstract")
    void substract(int a, int b, int expected) {
        int actual = calculatorService.subtractionCalculator(a, b);
        Assertions.assertEquals(expected, actual);

    }

    static Stream<Arguments> provideParamsForSubstract() {
        return Stream.of(Arguments.of(1, 1, 0),
                Arguments.of(1, 0, 1),
                Arguments.of(-1, 0, -1));
    }
    @ParameterizedTest
    @MethodSource("provideParamsForMultiplication")
    void multiplication(int a, int b, int expected) {
        int actual = calculatorService.multiplicationCalculator(a, b);
        Assertions.assertEquals(expected, actual);

    }

    static Stream<Arguments> provideParamsForMultiplication() {
        return Stream.of(Arguments.of(1, 1, 1),
                Arguments.of(2, 1, 2),
                Arguments.of(-1, 0, 0));
    }
    @ParameterizedTest
    @MethodSource("provideParamsForDivision")
    void division(int a, int b, int expected) {
        int actual = calculatorService.divisionCalculator(a, b);
        Assertions.assertEquals(expected, actual);

    }

    static Stream<Arguments> provideParamsForDivision() {
        return Stream.of(Arguments.of(1, 1, 1),
                Arguments.of(2, 1, 2),
                Arguments.of(-1, -1, 1));
    }
    @ParameterizedTest
    @MethodSource("provideParamsForDivisionNegative")
    void divisionNegative(int a, int b) {
        Assertions.assertThrows(DevideByZeroExeption.class, ()-> calculatorService.divisionCalculator(a, b));

    }

    static Stream<Arguments> provideParamsForDivisionNegative() {
        return Stream.of(Arguments.of(1, 0),
                Arguments.of(-1, 0));
    }
}
