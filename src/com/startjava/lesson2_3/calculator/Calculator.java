package com.startjava.lesson2_3.calculator;

public class Calculator {

    private int a;
    private int b;
    private char operation;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate() {
        int result;
        switch (operation) {
            case '+' :
                result = a + b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*' :
                result = a * b;
                break;
            case '/' :
                result = a / b;
                break;
            case '%' :
                result = a % b;
                break;
            case '^' :
                result = a;
                for (int i = 1; i < b; i++) {
                    result *= a;
                }
                break;
            default:
                System.out.println("Некорректная операция");
                return;
        }
        System.out.println(a + " " + operation + " " + b + " = " + result);
    }
}