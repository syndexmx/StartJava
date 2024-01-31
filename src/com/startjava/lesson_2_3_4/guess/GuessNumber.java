package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player[] players;
    private int target;

    public GuessNumber(Player[] players) {
        this.players = players;
        for (Player player : players) {
            player.resetAttempts();
        }
        Random random = new Random();
        target = random.nextInt(1, 101);
    }

    public void play() {
        boolean finished = false;
        while (!finished) {
            for (Player player : players) {
                if (isGuessed(player)) {
                    finished = true;
                    break;
                }
            }
        }
        printAllMoves();
    }

    private boolean isGuessed(Player player) {
        if (!player.hasAttempts()) {
            showLosingMessage(player);
            return true;
        }
        makeGuess(player);
        if (hasWon(player)) {
            return true;
        }
        return false;
    }

    private Scanner scanner = new Scanner(System.in);

    private void makeGuess(Player player) {
        boolean accepted = false;
        while (!accepted) {
            System.out.print("Попытка игрока " + player.getName() + ": ");
            accepted = player.acquireNumber(scanner.nextInt());
            if (!accepted) {
                System.out.println("Число не входит в полуинтервал (0, 100]");
            }
            scanner.nextLine();
        }
    }

    private boolean hasWon(Player player) {
        if (player.getLastNumber() == target) {
            System.out.println("Игрок " + player.getName() + " выиграл!");
            return true;
        }
        System.out.print("Число " + player.getLastNumber() + " ");
        System.out.print(player.getLastNumber() < target ? "меньше" : "больше");
        System.out.println(" того, что загадал компьютер");
        return false;
    }

    private void showLosingMessage(Player player) {
        System.out.println("У " + player.getName() + " закончились попытки");
    }

    private void printAllMoves() {
        for (Player player : players) {
            printAllPlayerMoves(player);
        }
    }

    private void printAllPlayerMoves(Player player) {
        System.out.print("Ходы игрока " + player.getName() + ": ");
        for (int i : player.getAllNumbers()) {
            System.out.printf("%4d", i);
        }
        System.out.println();
    }
}
