package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static final String NON_POSITIVE_NUMBER = "Отрицательный или нулевой аргумент: ";
    private static final String NON_INTEGER = "Некорректный дробный аргумент: ";
    private static final String NON_NUMBER = "Аргумент не является корректным числом: ";

    public static double calculate(String expression) {
        String[] elements = expression.split(" ");
        int a = parseArgument(elements[0]);
        char operation = elements[1].charAt(0);
        int b = parseArgument(elements[2]);
        //double result;
        return switch (operation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a * 1.0 / b;
            case '%' -> a % b;
            case '^' -> Math.pow(a, b);
            default -> {
                throw new RuntimeException("Ошибка: знак " + operation + " не поддерживается");
            }
        };
    }

    private static int parseArgument(String operand) {
        if (operand.matches("d+")) {
            throw new RuntimeException(NON_NUMBER + operand);
        }
        if (operand.contains(".") || operand.contains(",")) {
            throw new RuntimeException(NON_INTEGER + operand);
        }
        int argument = Integer.parseInt(operand);
        if (argument <= 0) {
            throw new RuntimeException(NON_POSITIVE_NUMBER + argument);
        }
        return argument;
    }
}