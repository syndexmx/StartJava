package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempt;
    private int[] numbers;
    public static final int ATTEMPTS_LIMIT = 10;

    public Player(String name) {
        this.name = name;
        this.numbers = new int[ATTEMPTS_LIMIT];
    }

    public String getName() {
        return name;
    }

    public void resetAttempts() {
        attempt = 0;
    }

    public boolean acquireNumber(int number) {
        if (0 < number && number <= 100) {
            numbers[attempt++] = number;
            return true;
        }
        return false;
    }

    public int getLastNumber() {
        return numbers[attempt - 1];
    }

    public boolean hasAttempts() {
        return attempt < ATTEMPTS_LIMIT;
    }

    public int[] getAllNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }
}
