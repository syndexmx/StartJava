package com.startjava.lesson_2_3_4.guess;


import java.util.Random;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int target;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.player1 = firstPlayer;
        this.player1.resetAttempts();
        this.player2 = secondPlayer;
        this.player2.resetAttempts();
        Random random = new Random();
        target = random.nextInt(1, 101);
    }

    public void play() {
        while (true) {
            if (hasWonOrLost(player1)) break;
            if (hasWonOrLost(player2)) break;
        }
    }

    private boolean hasWonOrLost(Player player) {
        if (!player.hasAttempts()) {
            hasLost(player);
            printAllMoves();
            return true;
        }
        makeGuess(player);
        if (hasWon(player)) {
            printAllMoves();
            return true;
        }
        return false;
    }

    private void makeGuess(Player player) {
        System.out.print("Попытка игрока " + player.getName() + ": ");
        player.makeGuess();
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

    private void hasLost(Player player) {
        System.out.println("У " + player1.getName() + " закончились попытки");
    }

    private void printAllMoves() {
        printAllPlayerMoves(player1);
        printAllPlayerMoves(player2);
    }

    private void printAllPlayerMoves(Player player) {
        System.out.print("Ходы игрока " + player.getName() + ": ");
        for (int i : player.getAllMoves()) {
            System.out.printf("%3d", i);
        }
        System.out.println();
    }
}
