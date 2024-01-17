import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Введите первое число: ");
            calculator.setA(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Введите символ операции ( + - * / % ^ ): ");
            calculator.setOperation(scanner.nextLine().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setB(scanner.nextInt());
            scanner.nextLine();
            calculator.calculate();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                choice = scanner.nextLine();
            } while (!choice.equals("yes") && !choice.equals("no"));
        } while (choice.equals("yes"));
    }
}
