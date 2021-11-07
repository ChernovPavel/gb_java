package lesson_07;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println("В миске осталось: " + foodCount);
    }

    public int decreaseFood(int catEatFoodCount) {

        if (foodCount < catEatFoodCount) {
            System.out.printf("Кот хотел съесть %s, а в миске осталось только %s еды", catEatFoodCount, foodCount);
            System.out.println();
            int x = foodCount;
            foodCount = 0;
            return x;
        } else {
            foodCount -= catEatFoodCount;
            return catEatFoodCount;
        }
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount += foodCount;
    }
}
