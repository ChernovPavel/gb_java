package lesson_06;

import org.w3c.dom.ls.LSOutput;

public abstract class Animal {
    private static int countOfAnimal;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(int maxRunDistance, int maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        countOfAnimal++;
    }

    public abstract boolean run(int distance);

    public abstract boolean swim(int distance);

    public static void getCountOfAnimals() {
        System.out.println("Количество созданных животных: " + countOfAnimal);
    }

}
