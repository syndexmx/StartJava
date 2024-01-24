package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Введите математическое выражение в формате '5 * 3' : ");
            String expression = scanner.nextLine();
            try {
               printResult(expression, calculator.calculate(expression));
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("\nХотите продолжить вычисления? ['yes' = да]: ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
    }

    private static void printResult(String expression, double result) {
        System.out.print(expression + " = ");
        if (result == (int) result) {
            System.out.print((int) result);
        } else {
            System.out.printf("%6.3f", result);
        }
    }
}
