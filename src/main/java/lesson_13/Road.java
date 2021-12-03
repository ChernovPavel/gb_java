package lesson_13;

import java.util.concurrent.CountDownLatch;

public class Road extends Stage {

    volatile CountDownLatch latch;

    public Road(int length) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
    }

    public Road(int length, CountDownLatch cdl) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
        this.latch = cdl;
    }


    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
            System.out.println(c.getName() + " закончил этап: " + description);
            if (!(latch == null)) {
                latch.countDown();
                if (latch.getCount() == MainClass.CARS_COUNT - 1) {
                    System.out.println(c.getName() + " WIN");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
