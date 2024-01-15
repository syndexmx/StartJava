public class Wolf {

    public Wolf(String sex, String name, double weight, int age, String color) {
        this.sex = sex;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    String sex;
    String name;
    double weight;
    int age;
    String color;

    public void walk() {
        System.out.println(name + " идет");
    }

    public void sit() {
        System.out.println(name + " сидит");
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    public void howl() {
        System.out.println(name + " воет");
    }

    public void hunt() {
        System.out.println(name + " охотится");
    }
}
