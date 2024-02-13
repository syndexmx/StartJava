package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    static private final int NUMBER_OF_PLAYERS = 3;
    static private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Player[] players = new Player[NUMBER_OF_PLAYERS];
        createPlayers(players);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                GuessNumber game = new GuessNumber(players);
                game.play();
            }
            System.out.print("Хотите продолжить игру? [yes / no]: ");
            answer = scanner.nextLine().toLowerCase();
        } while (!answer.equals("no"));
    }

    private static void createPlayers(Player[] players) {
        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            System.out.print("Введите имя игрока #" + (i + 1) + ": ");
            players[i] = new Player(scanner.nextLine());
        }
    }
}
