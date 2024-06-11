package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int additionCalculator(int num1, int num2) {
        return num1 + num2;
    }
    public int subtractionCalculator(int num1, int num2) {
        return num1 - num2;
    }
    public int multiplicationCalculator(int num1, int num2) {
        return num1 * num2;
    }
    public int divisionCalculator(int num1, int num2) {
        if (num2 == 0) {
            throw new DevideByZeroExeption();
        }
        return num1 / num2;
    }
}
