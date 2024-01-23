package com.startjava.lesson2_3_4.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;
    private String mainWeapon;

    public Jaeger() {
    }

    public Jaeger(
            String modelName,
            String mark,
            String origin,
            float height,
            float weight,
            int strength,
            int armor,
            String mainWeapon) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
        this.mainWeapon = mainWeapon;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getMainWeapon() {
        return mainWeapon;
    }

    public void setMainWeapon(String mainWeapon) {
        this.mainWeapon = mainWeapon;
    }

    public void move() {
        System.out.println("moving");
    }

    public String scanKaiju() {
        return "scanning";
    }

    public void useMainWeapon() {
        System.out.println(mainWeapon + " activated");
    }
}
