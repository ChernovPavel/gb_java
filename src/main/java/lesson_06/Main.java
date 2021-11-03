package lesson_06;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(600);
        cat.run(700);
        cat.swim(10);

        Dog dog = new Dog(300, 20);
        dog.run(100);
        dog.swim(20);

        Animal.getCountOfAnimals();
    }
}
