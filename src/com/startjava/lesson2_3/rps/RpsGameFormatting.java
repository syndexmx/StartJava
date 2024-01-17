package com.startjava.lesson2_3.rps;

import java.util.Random;

public class RpsGameFormatting {
    // Игра Камень-Ножницы-Бумага
    public static void main(String[] args) throws InterruptedException {
        String rock ="✊";
        String scissors= "✌\uFE0F";
        String paper = "✋" ;

        // Ход первого игрока
        String name1  = "HEL";
        System.out.println("Ход " + name1 + ": ");
        Random r = new Random();
        int position1 = r.nextInt( 1, 100 );
        String sign1 = rock;

        if (position1 > 66) {
            sign1 = paper;
        }
        else if (position1 > 33) {
            sign1 = scissors;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(rock + "\r") ;
            Thread.sleep(100);
            System.out.print(scissors + "\r");
            Thread.sleep(100);
            System.out.print(paper + "\r");
            Thread.sleep(100);
        }
        System.out.println(sign1);

        // Ход второго игрока
        String name2 = "WALLE";
        System.out.println("Ход " + name2 + ": ");
        int position2 = r.nextInt(1,100);
        String sign2 = rock;

        if (position2 > 66) {
            sign2 = paper;
        } else if (position2 > 33) {
            sign2 = scissors;
        }

        for (int i = 0 ; i < 5 ; i++) {
            System.out.print(rock + "\r");
            Thread.sleep(100);
            System.out.print( scissors + "\r" );
            Thread.sleep(100);
            System.out.print ( paper + "\r");
            Thread.sleep(100);
        }
        System.out.println (sign2);

        if (sign1.equals(sign2)) {
            System.out.println("Победила дружба!") ;
            return;
        }

        String winner = name2;
        if (sign1.equals(rock)) {
            if (sign2.equals(scissors)) {
                winner = name1;
            }
        } else if (sign1.equals(scissors)) {
            if (sign2.equals(paper)) {
                winner = name1;
            }
        } else {
            if (sign2.equals(rock)) {
                winner = name1;
            }
        }

        System.out.println("\nПобедил - " + winner);
    }
}
