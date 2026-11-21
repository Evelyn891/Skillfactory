public class Cat {

    double weight;
    String name;
    int age;
    String color;

    public Cat (double weight, String name, int age, String color)
    {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }
    void meow() {
        System.out.println("Meow");
    }
    void pee() {
        weight-= 20;
    }

    void eat() {
        weight += 50;
    }

    public static void main(String[] args) {
        Cat barsik = new Cat(3000, "Barsik", 10, "orange");
        barsik.meow();
    }
}
