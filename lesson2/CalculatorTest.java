import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.print("Введите первое число: ");
            myCalculator.setOperandOne(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Введите символ операции ( + - * / % ^ ): ");
            myCalculator.setOperation(scanner.nextLine().charAt(0));
            System.out.print("Введите второе число: ");
            myCalculator.setOperandTwo(scanner.nextInt());
            scanner.nextLine();
            myCalculator.calculate();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                command = scanner.nextLine();
            } while (!command.equals("yes") && !command.equals("no"));
        } while (command.equals("yes"));
    }
}
