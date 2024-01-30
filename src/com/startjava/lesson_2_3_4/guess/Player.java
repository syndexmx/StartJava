package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class Player {

    private String name;

    private int cursor;

    private int[] numbers;

    public Player(String name) {
        this.name = name;
        this.numbers = new int[10];
        cursor = -1;
    }

    public String getName() {
        return name;
    }

    public void resetAttempts() {
        cursor = -1;
    }

    public void makeGuess() {
        Scanner scanner = new Scanner(System.in);
        this.numbers[++cursor] = scanner.nextInt();
        scanner.nextLine();
    }

    public int getLastNumber() {
        return numbers[cursor];
    }

    public boolean hasAttempts() {
        return cursor < 9;
    }

    public int[] getAllMoves() {
        return Arrays.copyOf(numbers, cursor + 1);
    }
}
