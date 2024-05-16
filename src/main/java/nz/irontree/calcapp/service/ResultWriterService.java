package nz.irontree.calcapp.service;

public class ResultWriterService {
    public static void printResult(int num1, int num2, int result, String operation) {
        System.out.println(String.format("%d %s %d = %d", num1, operation, num2, result));
    }
}
