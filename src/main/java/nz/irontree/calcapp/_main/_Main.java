package nz.irontree.calcapp._main;

import nz.irontree.calcapp.service.ResultWriterService;
import nz.irontree.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 3;

        int sum = Calculator.add(num1, num2);
        ResultWriterService.printResult(num1, num2, sum, "+");

        int difference = Calculator.subtract(num1, num2);
        ResultWriterService.printResult(num1, num2, difference, "-");

        int product = Calculator.multiply(num1, num2);
        ResultWriterService.printResult(num1, num2, product, "*");

    }
}