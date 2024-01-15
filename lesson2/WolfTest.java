public class WolfTest {

    public static void main(String[] args) {
        Wolf myPetWolf = new Wolf("мужской", "Альф", 50.1, 4, "светло-серый");
        System.out.println("Характеристики " + myPetWolf + ":");
        System.out.println("пол: " + myPetWolf.sex);
        System.out.println("вес: " + myPetWolf.weight);
        System.out.println("возраст: " + myPetWolf.age);
        System.out.println("окрас: " + myPetWolf.color);
        System.out.println("\nДействия:");
        myPetWolf.walk();
        myPetWolf.sit();
        myPetWolf.run();
        myPetWolf.howl();
        myPetWolf.hunt();
    }
}
