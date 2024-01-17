public class Calculator1 {

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
            for (int i = 2; i < operandTwo; i++) {
                result *= operandOne;
            }
        }
        System.out.println(operandOne + " " + operation + " " + operandTwo + " = " + result);
    }
}
