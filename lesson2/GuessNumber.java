import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;
    private int target;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        Random random = new Random();
        target = random.nextInt(1, 101);
    }

    public void play() {
        boolean isFinished = false;
        while (true) {
            firstPlayer.makeGuess();
            if (firstPlayer.getNumber() == target) {
                System.out.println("Игрок " + firstPlayer.getName() + " выиграл!");
                return;
            } else {
                makeHint(firstPlayer.getNumber());
            }
            secondPlayer.makeGuess();
            if (secondPlayer.getNumber() == target) {
                System.out.println("Игрок " + secondPlayer.getName() + " выиграл!");
                return;
            } else {
                makeHint(secondPlayer.getNumber());
            }
        }
    }

    private void makeHint(int proposedNumber) {
        if (proposedNumber < target) {
            System.out.println("Число " + proposedNumber + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + proposedNumber + " больше того, что загадал компьютер");
        }
    }

}
