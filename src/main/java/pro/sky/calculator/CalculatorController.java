package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String welcomeCalculator() {
        return calculatorService.answerCalculator();
    }
    @GetMapping(path = "/calculator/plus")
    public String addition(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.additionCalculator(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String subtraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.subtractionCalculator(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.multiplicationCalculator(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String division(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.divisionCalculator(num1, num2);
    }
}
