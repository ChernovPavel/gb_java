package lesson_07;

import java.util.Random;

public class Cat {

    private String name;
    private boolean isFull;
    private int fullSatiety = 20;
    private int currentSatiety = 0;
    Random random = new Random();

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFull() {
        return isFull;
    }

    public int getCurrentSatiety() {
        return currentSatiety;
    }

    public void eat(Plate plate) {
        if (isFull) {
            System.out.println("Кот сыт");
        } else {
            int catWillEat = random.nextInt(4) + 3;
            int catAte = plate.decreaseFood(catWillEat);
            currentSatiety += catAte;
            if (currentSatiety >= fullSatiety) {
                System.out.printf("Кот %s сыт. Он съел %d", name, currentSatiety);
                System.out.println();
                isFull = true;
            }
        }
    }
}
