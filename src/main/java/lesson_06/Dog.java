package lesson_06;

public class Dog extends Animal {

    public Dog(int maxRunDistance, int maxSwimDistance) {
        super(maxRunDistance, maxSwimDistance);
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
