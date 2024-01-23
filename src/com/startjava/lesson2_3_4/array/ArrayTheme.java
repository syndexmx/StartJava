package com.startjava.lesson2_3_4.array;

import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        doTask1();
        doTask2();
        doTask3();
        doTask4();
        doTask5();
    }

    private static void doTask1() {
        System.out.println("\n1. Реверс значений массива");
        int[] numbersToReverse = new int[] {7, 3, 4, 6, 5, 1, 2};
        System.out.print("До реверса: ");
        printOutIntArray(numbersToReverse);
        int length = numbersToReverse.length;
        int mid = length / 2;
        for (int i = 0; i < mid; i++) {
            int swap = numbersToReverse[i];
            numbersToReverse[i] = numbersToReverse[length - 1 - i];
            numbersToReverse[length - 1 - i] = swap;
        }
        System.out.print("После реверса: ");
        printOutIntArray(numbersToReverse);
    }

    private static void doTask2() {
        System.out.println("\n2. Произведение элементов массива");
        int maxNumber = 9;
        int[] numbersToMultiply = new int[maxNumber + 1];
        for (int i = 0; i <= maxNumber - 1; i++) {
            numbersToMultiply[i] = i;
        }
        int r = 1;
        for (int i = 1; i < maxNumber; i++) {
            r *= numbersToMultiply[i];
            System.out.print(i + (i == maxNumber - 1 ? "" : " * "));
        }
        System.out.println(" = " + r);
    }

    private static void doTask3() {
        System.out.println("\n3. Удаление элементов массива");
        int arraySize = 15;
        double[] whatever = new double[arraySize];
        for (int i = 0; i < arraySize; i++) {
            whatever[i] = Math.random();
        }
        System.out.println("Массив до обработки:");
        printOutDoubleArray(whatever, 8);
        int midIndex = arraySize / 2;
        double criterionNumber = whatever[midIndex];
        int nulled = 0;
        for (int i = 0; i < arraySize; i++) {
            if (whatever[i] > criterionNumber) {
                whatever[i] = 0;
                nulled++;
            }
        }
        System.out.println("Обнулено ячеек: " + nulled);
        System.out.println("Массив после обработки:");
        printOutDoubleArray(whatever, 7);
    }

    private static void doTask4() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        int first = (int) 'A';
        int last =  (int) 'Z';
        int size = last - first + 1;
        char[] staircaseLetters = new char[size];
        for (int i = 0; i < size ; i++) {
            staircaseLetters[i] = (char) (i + first);
        }
        for (int i = size - 1; i >= 0; i--) {
            for (int j = size - 1; j >= i; j--) {
                System.out.print(staircaseLetters[j]);
            }
            System.out.println();
        }

    }

    private static void doTask5() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int size = 30;
        int[] randomNumbers = new int[size];
        int origin = 60;
        int bound = 100;
        for (int i = 0; i < size ; i++) {
            Random random = new Random();
            boolean unique;
            do {
                randomNumbers[i] = random.nextInt(origin, bound);
                unique = true;
                for (int j = 0; j < i; j++) {
                    if (randomNumbers[i] == randomNumbers[j]) {
                        unique = false;
                        break;
                    }
                }
            } while (!unique);
        }
        sortArray(randomNumbers);
        for (int i = 0; i < size; i++) {
            System.out.printf("%3d", randomNumbers[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static void printOutIntArray(int[] array) {
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

    private static void printOutDoubleArray(double[] array, int numbersInRow) {
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
