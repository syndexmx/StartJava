package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        reverse();
        multiply();
        deleteElements();
        makeAlphabetStaircase();
        fullInArray();
    }

    private static void reverse() {
        System.out.println("\n1. Реверс значений массива");
        int[] numbersToReverse = {7, 3, 4, 6, 5, 1, 2};
        System.out.print("До реверса: ");
        printArray(numbersToReverse);
        int length = numbersToReverse.length;
        int mid = length / 2;
        int backwardIndex = length - 1;
        for (int i = 0; i < mid; i++) {
            int swap = numbersToReverse[i];
            numbersToReverse[i] = numbersToReverse[backwardIndex];
            numbersToReverse[backwardIndex] = swap;
            backwardIndex--;
        }
        System.out.print("После реверса: ");
        printArray(numbersToReverse);
    }

    private static void multiply() {
        System.out.println("\n2. Произведение элементов массива");
        int maxNumber = 9;
        int[] multipliers = new int[maxNumber + 1];
        for (int i = 0; i < maxNumber; i++) {
            multipliers[i] = i;
        }
        int quasyFactorial = 1;
        for (int i = 1; i < maxNumber; i++) {
            quasyFactorial *= multipliers[i];
            System.out.print(i + (i == maxNumber - 1 ? " = " : " * "));
        }
        System.out.println(quasyFactorial);
    }

    private static void deleteElements() {
        System.out.println("\n3. Удаление элементов массива");
        int length = 15;
        double[] randomNumbers = new double[length];
        for (int i = 0; i < length; i++) {
            randomNumbers[i] = Math.random();
        }
        System.out.println("Массив до обработки:");
        printArray(randomNumbers, 8);
        int midIndex = length / 2;
        double criterionNumber = randomNumbers[midIndex];
        int nulled = 0;
        for (int i = 0; i < length; i++) {
            if (randomNumbers[i] > criterionNumber) {
                randomNumbers[i] = 0;
                nulled++;
            }
        }
        System.out.println("Обнулено ячеек: " + nulled);
        System.out.println("Массив после обработки:");
        printArray(randomNumbers, 7);
    }

    private static void makeAlphabetStaircase() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        int first = (int) 'A';
        int last =  (int) 'Z';
        int size = last - first + 1;
        char[] alphabet = new char[size];
        for (int i = 0; i < size ; i++) {
            alphabet[i] = (char) (i + first);
        }
        for (int i = size - 1; i >= 0; i--) {
            for (int j = size - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

    }

    private static void fullInArray() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int length = 30;
        int[] uniqueNumbers = new int[length];
        int origin = 60;
        int bound = 100;
        for (int i = 0; i < length ; i++) {
            Random random = new Random();
            boolean isUnique;
            int newNumber;
            do {
                newNumber = random.nextInt(origin, bound);
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (newNumber == uniqueNumbers[j]) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
            uniqueNumbers[i] = newNumber;
        }
        sortArray(uniqueNumbers);
        for (int i = 0; i < length; i++) {
            System.out.printf("%3d", uniqueNumbers[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        int last = array.length - 1;
        for (int i = 0; i <= last; i++) {
            System.out.print(array[i]);
            if (i != last) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void printArray(double[] array, int numbersInRow) {
        int last = array.length - 1;
        for (int i = 0; i <= last; i++) {
            System.out.printf("%7.3f", array[i]);
            if ((i + 1) % numbersInRow == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
    }
}
