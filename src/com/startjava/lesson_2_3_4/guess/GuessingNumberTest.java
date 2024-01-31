package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessingNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        String answer = "yes";
        do {
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Игра началась! У каждого игрока по 10 попыток.");
                GuessNumber game = new GuessNumber(player1, player2);
                game.play();
            }
            System.out.print("Хотите продолжить игру? [yes / no]: ");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")) return;
        } while (true);
    }
}
