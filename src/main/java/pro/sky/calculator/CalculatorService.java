package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String answerCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String additionCalculator(int num1, int num2) {
        int a = num1 + num2;
        return num1 + " + " + num2 + " =" + a;
    }
    public String subtractionCalculator(int num1, int num2) {
        int a = num1 - num2;
        return num1 + " - " + num2 + " =" + a;
    }
    public String multiplicationCalculator(int num1, int num2) {
        int a = num1 * num2;
        return num1 + " * " + num2 + " =" + a;
    }
    public String divisionCalculator(int num1, int num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя!";
        }
        int a = num1 / num2;
        return num1 + " / " + num2 + " =" + a; //я хз как изобразить отсутсвие одного из параметров, подскажите плз
    }
}
