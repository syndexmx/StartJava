package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int target;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player1.resetAttempts();
        this.player2 = player2;
        this.player2.resetAttempts();
        Random random = new Random();
        target = random.nextInt(1, 101);
    }

    public void play() {
        while (true) {
            if (isGuessed(player1)) break;
            if (isGuessed(player2)) break;
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
        System.out.print("Попытка игрока " + player.getName() + ": ");
        player.acquireNumber(scanner.nextInt());
        scanner.nextLine();
    }

    private boolean hasWon(Player player) {
        if (player.getLastNumber() == target) {
            System.out.println("Игрок " + player.getName() + " выиграл!");
            return true;
        }
        if (player.getLastNumber() < target) {
            System.out.println("Число " + player.getLastNumber() + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getLastNumber() + " больше того, что загадал компьютер");
        }
        return false;
    }

    private void showLosingMessage(Player player) {
        System.out.println("У " + player.getName() + " закончились попытки");
    }

    private void printAllMoves() {
        printAllPlayerMoves(player1);
        printAllPlayerMoves(player2);
    }

    private void printAllPlayerMoves(Player player) {
        System.out.print("Ходы игрока " + player.getName() + ": ");
        for (int i : player.getAllNumbers()) {
            System.out.printf("%4d", i);
        }
        System.out.println();
    }
}
