package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    public static final int ATTEMPTS_LIMIT = 10;
    private static final int UPPER_BOUND = 100;
    private String name;
    private int attempt;
    private int[] numbers;
    private int wins;

    public Player(String name) {
        this.name = name;
        numbers = new int[ATTEMPTS_LIMIT];
    }

    public String getName() {
        return name;
    }

    public void resetAttempts() {
        attempt = 0;
    }

    public boolean addNumber(int number) {
        if (0 < number && number <= UPPER_BOUND) {
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

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
