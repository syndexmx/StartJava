package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Введите математическое выражение в формате '5 * 3' : ");
            String expression = scanner.nextLine();
            try {
               printResult(expression, Calculator.calculate(expression));
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("\nХотите продолжить вычисления? ['yes' = да]: ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
    }

    private static void printResult(String expression, double result) {
        System.out.print(expression + " = ");
        System.out.print(result == (int) result ? ((int) result) : result);
    }
}
