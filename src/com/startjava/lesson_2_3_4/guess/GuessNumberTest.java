package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {

    static private final int NUMBER_OF_PLAYERS = 3;
    static private Player[] players = new Player[NUMBER_OF_PLAYERS];
    static private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            players[i] = getNewPlayer(i);
        }
        String answer = "yes";
        do {
            if (answer.equalsIgnoreCase("yes")) {
                GuessNumber game = new GuessNumber(players);
                game.playGame();
            }
            System.out.print("Хотите продолжить игру? [yes / no]: ");
            answer = scanner.nextLine();
        } while (!answer.equalsIgnoreCase("no"));
    }

    private static Player getNewPlayer(int playerIndex) {
        System.out.print("Введите имя игрока #" + (playerIndex + 1) + ": ");
        return new Player(scanner.nextLine());
    }
}
