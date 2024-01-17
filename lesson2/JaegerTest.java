public class JaegerTest {

    public static void main(String[] args) {
        Jaeger playerJaeger = new Jaeger();
        playerJaeger.setModelName("Titan Redeemer");
        playerJaeger.setMark("Mark-6");
        playerJaeger.setOrigin("USA");
        playerJaeger.setHeight(60.7f);
        playerJaeger.setWeight(4.5f);
        playerJaeger.setStrength(11);
        playerJaeger.setArmor(8);
        playerJaeger.setMainWeapon("M-19 Morning star");

        Jaeger enemyJaeger = new Jaeger(
                "Bracer Phoenix",
                "Mark-5",
                "USA",
                70.7f,
                2.1f,
                8,
                9,
                "Vortex Cannon"
        );

        playerJaeger.useMainWeapon();
        playerJaeger.setMainWeapon("Y-11 Revolution Cannons");
        playerJaeger.useMainWeapon();
        enemyJaeger.setStrength(enemyJaeger.getStrength() + 1);
        System.out.println("Current " + enemyJaeger.getModelName() +
                " strength is " + enemyJaeger.getStrength());
        playerJaeger.setWeight(4.45f);
        System.out.println("Current " + playerJaeger.getModelName() +
                " weight is " + playerJaeger.getWeight());
        enemyJaeger.setStrength(14);
        System.out.println("Current " + enemyJaeger.getModelName() +
                " strength is " + enemyJaeger.getStrength());
    }
}
