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
                double result = calculator.calculate(expression);
                if (result != Double.MIN_VALUE) {
                    System.out.print(expression + " = ");
                    if (result - (int) result == 0) {
                        System.out.print((int) result);
                    } else {
                        System.out.printf("%6.3f", result);
                    }
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("\nХотите продолжить вычисления? ['yes' = да]: ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
    }
}
