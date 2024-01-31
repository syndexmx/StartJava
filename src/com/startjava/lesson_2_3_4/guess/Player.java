package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempt;
    private int[] numbers;

    public Player(String name) {
        this.name = name;
        this.numbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public void resetAttempts() {
        attempt = 0;
    }

    public void acquireNumber(int number) {
        numbers[attempt++] = number;
    }

    public int getLastNumber() {
        return numbers[attempt - 1];
    }

    public boolean hasAttempts() {
        return attempt < 10;
    }

    public int[] getAllNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }
}
