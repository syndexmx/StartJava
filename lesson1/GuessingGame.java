import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(1, 101);
        int guessorNumber = 50;
        while (target != guessorNumber ) {
            if (guessorNumber > target) {
                System.out.println("Число " + guessorNumber  + " больше того, что загадал компьютер.");
                guessorNumber--;
            } else {
                System.out.println("Число " + guessorNumber  + " меньше того, что загадал компьютер.");
                guessorNumber++;
            }
        }
        System.out.println("Вы победили!");
    }
}
