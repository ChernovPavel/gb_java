package lesson_10;

public class Main {
    public static void main(String[] args) {
        Apple[] apples = new Apple[10];
        apples[0] = new Apple();

        Box<Apple> boxApple = new Box<>(apples);
        float a = boxApple.getWeight();
        System.out.println(a);

    }
}
