package lesson_10;

public class Box<E extends Fruit> {

    private E[] fruits;

    public Box(E[] fruits) {
        this.fruits = fruits;
    }

    public float getWeight() {
        float count = 0;
        for (E fruit : fruits) {
            if (fruit != null) count++;
        }
        return count * E.weight; // вот тут жду что будет вызываться поле weight класса определенного фрукта а не класса Fruit
    }
}