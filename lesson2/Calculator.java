public class Calculator {

    private int operandOne;
    private int operandTwo;
    private char operation;

    public Calculator() {
    }

    public int getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(int operandOne) {
        this.operandOne = operandOne;
    }

    public int getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(int operandTwo) {
        this.operandTwo = operandTwo;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate() {
        int result;
        switch (operation){
            case '+' :
                result = operandOne + operandTwo;
                break;
            case '-' :
                result = operandOne - operandTwo;
                break;
            case '*' :
                result = operandOne * operandTwo;
                break;
            case '/' :
                result = operandOne / operandTwo;
                break;
            case '%' :
                result = operandOne % operandTwo;
                break;
            case '^' :
                result = operandOne;
                for (int i = 2; i < operandTwo; i++) {
                    result *= operandOne;
                }
                break;
            default:
                System.out.println("Некорректная операция");
                return;
        }
        System.out.println(operandOne + " " + operation + " " + operandTwo + " = " + result);
    }
}