public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("Ветвление: if-else");

        System.out.println("\n1. Перевод псевдокода на язык Java");

        boolean isMale = true;
        if (!isMale) {
            System.out.println("Вам консультация андролога не положена!");
        } else {
            System.out.println("Ознакомьтесь со списком специалистов");
        }

        int age = 25;
        if (age > 18) {
            System.out.println("Пройдите перерегистрацию в секции для взрослых");
        } else {
            System.out.println("Пройдите перерегистрацию у специалиста");
        }

        float height = 1.78f;
        if (height < 1.8) {
            System.out.println("Пройдите в секцию обычного инвентаря");
        } else {
            System.out.println("Пройдите в секцию инвентаря для высоких");
        }

        char firstLetter = "Андрей".charAt(0);
        if (firstLetter == 'M') {
            System.out.println("Вы выиграли один из специальных Призов");
        } else if (firstLetter == 'I') {
            System.out.println("Вы выиграли Дополнительный Приз");
        } else {
            System.out.println("Для вас утешительный приз");
        }

        System.out.println("\n2. Поиск большего числа");
        int firstNumber = 15;
        int secondNumber = 24;
        if (firstNumber > secondNumber) {
            System.out.println("Первое число " + firstNumber + " больше" +
                    "второго числа " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("Второе число " + secondNumber + " больше" +
                    "первого числа " + firstNumber);
        } else {
            System.out.println("Оба числа равны " + firstNumber);
        }

        System.out.println("\n3. Проверка числа");
        int justAnotherNumber = 67;
        if (justAnotherNumber == 0) {
            System.out.println("Число равно нулю ");
            System.exit(0);
        } else {
            System.out.print(justAnotherNumber + " является ");
            if (justAnotherNumber > 0) {
                System.out.print("положительным");
            } else {
                System.out.print("отрицательным");
            }
            System.out.print(" и ");
            System.out.print(justAnotherNumber + " является ");
            if (justAnotherNumber % 2 == 0) {
                System.out.println("четным");
            } else {
                System.out.println("нечетным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int a = 123;
        int b = 223;
        boolean hasEqualOnes = a % 10 == b % 10;
        boolean hasEqualTens = a / 10 % 10 == b / 10 % 10;
        boolean hasEqualHundreds = a / 100 == b / 100;
        if (!hasEqualOnes && !hasEqualTens && !hasEqualHundreds) {
            System.out.println("Нет совпадающих разрядов");
        } else {
            System.out.println("У числа " + a + " и числа " + b);
            if (hasEqualOnes) {
                System.out.println("cовпал разряд #" + 1 + ": " + a % 10);
            }
            if (hasEqualTens) {
                System.out.println("cовпал разряд #" + 2 + ": " + a / 10 % 10);
            }
            if (hasEqualHundreds) {
                System.out.println("cовпал разряд #" + 3 + ": " + a / 100);
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        System.out.print("Символ '" + symbol + "' является ");
        if ((int) symbol >= (int) '0' && (int) symbol <= (int) '9') {
            System.out.println("цифрой");
        } else if ((int) symbol >= (int) 'A' && (int) symbol <= (int) 'Z') {
            System.out.println("большой буквой");
        } else if ((int) symbol >= (int) 'a' && (int) symbol <= (int) 'z') {
            System.out.println("малой буквой");
        } else {
            System.out.println("не буквой и не цифрой");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int amount = 300_001;
        System.out.println("Сумма вклада : " + amount);
        double interestRate;
        if (amount < 100_000) {
            interestRate = 0.05;
        } else if (amount <= 300_000) {
            interestRate = 0.07;
        } else {
            interestRate = 0.1;
        }
        int interest = (int) (amount * interestRate);
        int finalAmount = amount + interest;
        System.out.println("Начислено в касчестве процентов по вкладу : " + interest);
        System.out.println("Сумма по окончании срока вклада : " + finalAmount);

        System.out.println("\n7. Определение оценки по предметам");
        double historyRate = 59.0;
        double programmingRate = 92.0;
        int historyMark;
        if (historyRate > 91) {
            historyMark = 5;
        } else if (historyRate > 73) {
            historyMark = 4;
        } else if (historyRate > 60) {
            historyMark = 3;
        } else {
            historyMark = 2;
        }
        System.out.println("История : " + historyMark);
        int programmingMark;
        if (programmingRate > 91) {
            programmingMark = 5;
        } else if (programmingRate > 73) {
            programmingMark = 4;
        } else if (programmingRate > 60) {
            programmingMark = 3;
        } else {
            programmingMark = 2;
        }
        double meanMark = (historyMark + programmingMark) / 2.0;
        double meanRate = (historyRate + programmingRate) / 2;
        System.out.println("Программирование : " + programmingMark);
        System.out.println("Средний балл : " + meanMark);
        System.out.println("Средний процент : " + meanRate + "%");

        System.out.println("\n8. Расчет годовой прибыли");
        int monthlyReturn = 113_000;
        int monthlyPremisesRent = 5000;
        int monthlyProductionCost = 9000;
        int monthlyIncome = (monthlyReturn - monthlyProductionCost -
                monthlyPremisesRent);
        int yearlyIncome = monthlyIncome * 12;
        System.out.print("Прибыль за год : ");
        if (yearlyIncome > 0) {
            System.out.println("+" + yearlyIncome);
        } else if (yearlyIncome <= 0) {
            System.out.println(yearlyIncome);
        }
    }
}
