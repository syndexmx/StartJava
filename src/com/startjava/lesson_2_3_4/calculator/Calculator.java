package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    static final String NON_POSITIVE_NUMBER = "Отрицательный или нулевой аргумент: ";
    static final String NON_INTEGER = "Некорректный дробный аргумент: ";

    static final String NON_NUMBER = "Аргумент не является корректным числом: ";

    public double calculate(String expression) throws RuntimeException {
        double result;
        String[] subExpressions = expression.split(" ");
        int a = parseArgument(subExpressions[0]);
        char operation = subExpressions[1].charAt(0);
        int b = parseArgument(subExpressions[2]);
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
                throw new RuntimeException("Ошибка: знак " + operation + " не поддерживается");
            }
        }
        return result;
    }

    private static int parseArgument(String argumetnString) {
        if (argumetnString.matches("d+")) {
            throw new RuntimeException(NON_NUMBER + argumetnString);
        };
        if (argumetnString.contains(".") || argumetnString.contains(",")) {
            throw new RuntimeException(NON_INTEGER + argumetnString);
        }
        int argument = Integer.parseInt(argumetnString);
        if (argument <= 0) {
            throw new RuntimeException(NON_POSITIVE_NUMBER + argument);
        };
        return argument;
    }
}