import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int target;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.player1 = firstPlayer;
        this.player2 = secondPlayer;
        Random random = new Random();
        target = random.nextInt(1, 101);
    }

    public void play() {
        while (true) {
            makeGuess(player1);
            if (hasWon(player1)) break;
            makeGuess(player2);
            if (hasWon(player2)) break;
        }
    }

    private void makeGuess(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Попытка игрока " + player.getName() + ": ");
        player.setNumber(scanner.nextInt());
        scanner.nextLine();
    }

    private boolean hasWon(Player player) {
        if (player.getNumber() == target) {
            System.out.println("Игрок " + player.getName() + " выиграл!");
            return true;
        }
        if (player.getNumber() < target) {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
        }
        return false;
    }
}
