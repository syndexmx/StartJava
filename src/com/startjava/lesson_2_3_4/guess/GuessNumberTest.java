package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {

    static private final int NUMBER_OF_PLAYERS = 3;
    static private Player[] players = new Player[NUMBER_OF_PLAYERS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            System.out.print("Введите имя игрока #" + (i + 1) + ": ");
            Player player = new Player(scanner.nextLine());
            players[i] = player;
        }
        shufflePlayers(players);
        String answer = "yes";
        do {
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Игра началась! У каждого игрока по " + Player.ATTEMPTS_LIMIT
                        + " попыток.");
                GuessNumber game = new GuessNumber(players);
                game.play();
            }
            System.out.print("Хотите продолжить игру? [yes / no]: ");
            answer = scanner.nextLine();
        } while (!answer.equalsIgnoreCase("no"));
    }

    private static void shufflePlayers(Player[] players) {
        for (int i = players.length - 1; i > 0; i--) {
            Random random = new Random();
            int index = random.nextInt(i);
            Player swap = players[i];
            players[i] = players[index];
            players[index] = swap;
        }
        System.out.println("Произведена жеребьевка по порядку хододов.");
    }
}
