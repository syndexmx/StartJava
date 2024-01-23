package com.startjava.lesson2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf myPetWolf = new Wolf();
        myPetWolf.setName("Альф");
        myPetWolf.setSex("мужский");
        myPetWolf.setWeight(49.7);
        myPetWolf.setAge(4);
        myPetWolf.setColor("светло серый");
        System.out.println("Характеристики " + myPetWolf.getName() + ":");
        System.out.println("пол: " + myPetWolf.getSex());
        System.out.println("вес: " + myPetWolf.getWeight());
        System.out.println("возраст: " + myPetWolf.getAge());
        System.out.println("окрас: " + myPetWolf.getColor());
        System.out.println("\nДействия:");
        myPetWolf.walk();
        myPetWolf.sit();
        myPetWolf.run();
        myPetWolf.howl();
        myPetWolf.hunt();
    }
}
