import java.util.Scanner;

public class Player {

    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void makeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Попытка игрока " + name + ": ");
        number = scanner.nextInt();
        scanner.nextLine();
    }
}
