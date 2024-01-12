import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(1,101);
        int guessor = 50;
        while (target != guessor) {
            if (guessor > target) {
                System.out.println("Число " + guessor + " больше того, что загадал компьютер.");
                guessor--;
            } else {
                System.out.println("Число " + guessor + " меньше того, что загадал компьютер.");
                guessor++;
            }
        }
        System.out.println("Вы победили!");
    }
}
