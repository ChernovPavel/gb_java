package lesson_10.task_2;

public class Main {
    public static void main(String[] args) {

        Apple[] apples = {new Apple(), new Apple(), new Apple()};
        Orange[] oranges = {new Orange(), new Orange(), new Orange()};

        Box<Apple> boxApple = new Box<>(apples);
        Box<Orange> boxOrange = new Box<>(oranges);
        Box<Orange> boxEmptyOrange = new Box<>();

        boxOrange.addOneFruit(new Orange());
        boxOrange.addFruit(boxEmptyOrange);
        boxApple.addFruit(boxApple);
        boxApple.compare(boxOrange);
        boxApple.getWeight();


    }
}
