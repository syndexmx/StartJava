public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("Циклы: for, while, do-while");

        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int rangeFrom = -10;
        int rangeTo = 21;
        int counter = rangeFrom;
        int sumOdd = 0;
        int sumEven = 0;
        do {
            if (counter % 2 == 0) {
                //считаем ноль тоже четным
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= rangeTo);
        System.out.println("На отрезке [" + rangeFrom  + ", " + rangeTo  + "] сумма " +
                "четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int alexCredit = 10;
        int bobCredit = 5;
        int kateCredit = -1;
        int min;
        if (alexCredit < bobCredit && alexCredit < kateCredit) {
            min = alexCredit;
        } else if (bobCredit < kateCredit) {
            min = bobCredit;
        } else {
            min = kateCredit;
        }
        int max;
        if (alexCredit > bobCredit && alexCredit > kateCredit) {
            max = alexCredit;
        } else if (bobCredit > kateCredit) {
            max = bobCredit;
        } else {
            max = kateCredit;
        }
        System.out.println("Минимальное число : " + min);
        System.out.println("Максимальное число : " + max);
        System.out.println("Все числа интервала от max до min от большего к меньшему:");
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n3.Вывод реверсивного числа и суммы его цифр");
        int reversedNumber = 1234;
        int sumOfDigits = 0;
        while (reversedNumber > 0) {
            int currentDigit = reversedNumber % 10;
            System.out.print(currentDigit);
            sumOfDigits += currentDigit;
            reversedNumber /= 10;
        }
        System.out.println("\nСумма цифр : " + sumOfDigits);

        System.out.println("\n4. Вывод чисел в несколько строк");
        rangeFrom = 1;
        rangeTo = 24;
        int formatCounter = 0;
        for (int i = rangeFrom; i < rangeTo; i += 2) {
            System.out.printf("  %2d", i);
            formatCounter = (formatCounter + 1) % 5;
            if (formatCounter == 0) {
                System.out.println();
            }
        }
        while (formatCounter > 0) {
            System.out.printf("  %2d", 0);
            formatCounter = (formatCounter + 1) % 5;
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int parsedNumber = 3242592;
        int rest = parsedNumber;
        int numberOfTwos = 0;
        while (rest > 0) {
            if (rest % 10 == 2) {
                numberOfTwos++;
            }
            rest /= 10;
        }
        boolean isEven = numberOfTwos % 2 == 0;
        System.out.print("В числе " + parsedNumber + " ");
        if (isEven) {
            System.out.print("четное");
        } else {
            System.out.print("нечетное");
        }
        System.out.println(" число двоек - " + numberOfTwos);

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int linesLeft = 5;
        while (linesLeft > 0) {
            int symbolsLeft = linesLeft;
            while (symbolsLeft > 0) {
                System.out.print("#");
                symbolsLeft--;
            }
            System.out.println();
            linesLeft--;
        }
        System.out.println();
        boolean goingUp = true;
        int currentLength = 1;
        do {
            int lineLength = 0;
            do {
                System.out.print("$");
                lineLength++;
            } while (lineLength < currentLength);
            System.out.println();
            if (goingUp) {
                currentLength++;
                if (currentLength == 3) {
                    goingUp = false;
                }
            } else {
                currentLength--;
            }
        } while (currentLength > 0);
        System.out.println();

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("DECIMAL   CHARACTER   DESCRIPTION");
        for (int code = 15; code < (int) '0'; code = code + 2) {
            System.out.printf("%4d", code);
            char symbol = (char) code;
            System.out.printf("%11c", symbol);
            for (int j = 0; j < 12; j++) {
                System.out.print(" ");
            }
            System.out.println(Character.getName(symbol));
        }
        int startLittleLetters = (int) 'a';
        int endLittleLetters = (int) 'z';
        int code = startLittleLetters;
        while (code <= endLittleLetters) {
            if (code % 2 == 0){
                System.out.printf("%4d", code);
                char symbol = (char) code;
                System.out.printf("%11c", symbol);
                for (int j = 0; j < 12; j++) {
                    System.out.print(" ");
                }
                System.out.println(Character.getName(symbol));
            }
            code++;
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int suspectedPalindrome = 1234321;
        int maxSize = 10;
        int[] digits = new int [maxSize];
        int index = 0;
        int yetToProcess = suspectedPalindrome;
        while (yetToProcess > 0) {
            int currentDigit = yetToProcess % 10;
            digits[index] = currentDigit;
            yetToProcess /= 10;
            index++;
        }
        int size = index;
        System.out.print("Число " + suspectedPalindrome);
        boolean isPalindrome = true;
        for (int i = 0; i < size / 2; i++) {
            if (digits[i] != digits[size - i - 1]) {
                isPalindrome = false;
                break;
            }
        }
        if (!isPalindrome) {
            System.out.print(" не");
        }
        System.out.println(" является палиндромом.");

        System.out.println("\n9. Проверка, является ли число счастливым");
        int suspectedHappyNumber = 678696;
        int firstHalf = suspectedHappyNumber % 1000;
        int secondHalf = suspectedHappyNumber / 1000;
        int firstSum = 0;
        int firstLeft = firstHalf;
        for (int i = 0; i < 3; i++) {
            firstSum += firstLeft % 10;
            firstLeft /= 10;
        }
        int secondSum = 0;
        int secondLeft = secondHalf;
        for (int i = 0; i < 3; i++) {
            secondSum += secondLeft % 10;
            secondLeft /= 10;
        }
        System.out.print("Число " + suspectedHappyNumber + " ");
        boolean isHappy = (firstSum == secondSum);
        if (isHappy) {
            System.out.print("является ");
        } else {
            System.out.print("не является ");
        }
        System.out.println("счастливым");
        System.out.print("Сумма цифр " + firstHalf + " равна " + firstSum + ", ");
        if (isHappy) {
            System.out.print("и ");
        } else {
            System.out.print("а ");
        }
        System.out.println("сумма цифр " + secondHalf + " равна " + secondSum);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        for (int y = 1; y < 10; y++) {
            int x = 1;
            while (x < 10) {
                if (x == 1 && y == 1) {
                    System.out.print("   ");
                } else {
                    System.out.printf("%3d", x * y);
                }
                if (x == 1) {
                    System.out.print("|");
                }
                x++;
            }
            if (y == 1) {
                System.out.println();
                x = 1;
                while (x < 10) {
                    System.out.print("---");
                    if (x == 1) {
                        System.out.print("+");
                    }
                    x++;
                }
            }
            System.out.println();
        }
    }
}
