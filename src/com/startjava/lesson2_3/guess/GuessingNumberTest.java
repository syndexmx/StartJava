package com.startjava.lesson2_3.guess;

import java.util.Scanner;

public class GuessingNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        String answer;
        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.play();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}
