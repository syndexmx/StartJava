package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    static private final int NUMBER_OF_ROUNDS = 3;
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

    public void playGame() {
        shufflePlayers(players);
        for (Player player : players) {
            player.setWins(0);
        }
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println("Раунд #" + (i + 1) + " начался! У каждого игрока по " +
                    Player.ATTEMPTS_LIMIT + " попыток.");
            GuessNumber round = new GuessNumber(players);
            round.play();
        }
        showGameWinner(players);
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

    private static void shufflePlayers(Player[] players) {
        for (int i = players.length - 1; i > 0; i--) {
            Random random = new Random();
            int index = random.nextInt(i);
            Player swap = players[i];
            players[i] = players[index];
            players[index] = swap;
        }
        System.out.println("Произведена жеребьевка по порядку ходов.");
    }

    private static void showGameWinner(Player[] players) {
        int maxScore = 0;
        for (Player player : players) {
            maxScore = Math.max(maxScore, player.getWins());
        }
        int countWithMaxScore = 0;
        for (Player player : players) {
            if (player.getWins() == maxScore) countWithMaxScore++;
        }
        if (countWithMaxScore > 1) {
            System.out.println("По результатам " + NUMBER_OF_ROUNDS + " раундов вышла ничья.");
            return;
        }
        for (Player player : players) {
            if (player.getWins() == maxScore) {
                System.out.println("По результатам " + NUMBER_OF_ROUNDS + " раундов выиграл " +
                        player.getName());
            }
        }
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
            accepted = player.addNumber(scanner.nextInt());
            if (!accepted) {
                System.out.println("Число не входит в полуинтервал (0, 100]");
            }
            scanner.nextLine();
        }
    }

    private boolean hasWon(Player player) {
        if (player.getLastNumber() == target) {
            System.out.println("Игрок " + player.getName() + " выиграл!");
            player.setWins(player.getWins() + 1);
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
