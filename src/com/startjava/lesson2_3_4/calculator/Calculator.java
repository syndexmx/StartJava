package com.startjava.lesson2_3_4.calculator;

public class Calculator {

    public double calculate(String expression) {
        double result;
        String[] subExpressions = expression.split(" ");
        int a = Integer.parseInt(subExpressions[0]);
        char operation = subExpressions[1].charAt(0);
        int b = Integer.parseInt(subExpressions[2]);
        switch (operation) {
            case '+' -> {
                    result = a + b;
            }
            case '-' -> {
                result = a - b;
            }
            case '*' -> {
                result = a * b;
            }
            case '/' -> {
                result = a * 1.0 / b;
            }
            case '%' -> {
                result = a % b;
            }
            case '^' -> {
                result = Math.pow(a, b);
            }
            default -> {
                result = Double.MIN_VALUE;
                System.out.println("Ошибка: знак " + operation + " не поддерживается");
            }
        }
        return result;
    }
}