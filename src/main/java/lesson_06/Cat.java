package lesson_06;

public class Cat extends Animal {

    public Cat(int maxRunDistance) {
        super(maxRunDistance, 0);
    }

    @Override
    public boolean run(int distance) {
        return maxRunDistance >= distance;
    }

    @Override
    public boolean swim(int distance) {
        return maxSwimDistance >= distance;
    }
}
