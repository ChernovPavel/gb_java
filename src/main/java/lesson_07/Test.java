package lesson_07;

public class Test {
    public static void main(String[] args) {
        Cat[] arrCat = new Cat[3];
        Plate plate = new Plate(10);
        arrCat[0] = new Cat("Васька1");
        arrCat[1] = new Cat("Васька2");
        arrCat[2] = new Cat("Васька3");

        plate.printInfo();

        for (Cat cat : arrCat) {
            while (plate.getFoodCount() > 0 && !cat.isFull()) {
                cat.eat(plate);
                plate.printInfo();
            }
        }

        for (Cat cat : arrCat) {
            if (cat.isFull()) {
                System.out.println(cat.getName() + " сыт");
            } else {
                System.out.printf("%s голоден; он успел съесть %d", cat.getName(), cat.getCurrentSatiety());
                System.out.println();
            }
        }
    }
}
