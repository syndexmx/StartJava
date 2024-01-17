package com.startjava.lesson_1.final_;

public class Calculator {

    public static void main(String[] args) {
        int operandOne = 17;
        char operation = '^';
        int operandTwo = 3;
        int result;
        if (operation == '+') {
            result = operandOne + operandTwo;
        } else if (operation == '-') {
            result = operandOne - operandTwo;
        } else if (operation == '*') {
            result = operandOne * operandTwo;
        } else if (operation == '/') {
            result = operandOne / operandTwo;
        } else if (operation == '%') {
            result = operandOne % operandTwo;
        } else {
            result = operandOne;
            for (int i = 1; i < operandTwo; i++) {
                result *= operandOne;
            }
        }
        System.out.println(operandOne + " " + operation + " " + operandTwo + " = " + result);
    }
}
