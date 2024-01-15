public class JaegerTest {

    public static void main(String[] args) {
        Jaeger myJaeger = new Jaeger();
        myJaeger.setModelName("Titan Redeemer");
        myJaeger.setMark("Mark-6");
        myJaeger.setOrigin("USA");
        myJaeger.setHeight(60.7f);
        myJaeger.setWeight(4.5f);
        myJaeger.setStrength(11);
        myJaeger.setArmor(8);
        myJaeger.setMainWeapon("M-19 Morning star");

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

        myJaeger.useMainWeapon();
        myJaeger.setMainWeapon("Y-11 Revolution Cannons");
        myJaeger.useMainWeapon();
        enemyJaeger.setStrength(enemyJaeger.getStrength() + 1);
        System.out.println("Current " + enemyJaeger.getModelName() + " strength is "
                + enemyJaeger.getStrength());
        myJaeger.setWeight(4.45f);
        System.out.println("Current " + myJaeger.getModelName() + " weight is "
                + myJaeger.getWeight());
        enemyJaeger.setStrength(14);
        System.out.println("Current " + enemyJaeger.getModelName() + " strength is "
                + enemyJaeger.getStrength());
    }
}
