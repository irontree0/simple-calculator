package nz.irontree.calcapp._main;

import nz.irontree.calcapp.service.ResultWriterService;
import nz.irontree.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 3;
        int result = Calculator.calcSum(num1, num2);
        ResultWriterService.printResult(num1, num2, result, "+");
        result = Calculator.subtract(num1, num2);
        ResultWriterService.printResult(num1, num2, result, "-");
        result = Calculator.multiply(num1, num2);
        ResultWriterService.printResult(num1, num2, result, "*");
    }
}