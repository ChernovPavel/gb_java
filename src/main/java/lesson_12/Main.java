package lesson_12;

import java.util.Arrays;

public class Main {
    static final int SIZE = 60000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        fun1();
        fun2();
    }

    public static void fun1() {
        float[] arr = new float[SIZE];

        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.currentTimeMillis();
        System.out.println("Выполнение в main потоке: " + (System.currentTimeMillis() - a));
    }

    public static void fun2() {
        float[] newArr = new float[SIZE];
        float[] newArr1 = new float[HALF];
        float[] newArr2 = new float[HALF];

        Arrays.fill(newArr, 1);

        long a = System.currentTimeMillis();

        System.arraycopy(newArr, 0, newArr1, 0, HALF);
        System.arraycopy(newArr, HALF, newArr2, 0, HALF);

        System.out.println("Разделение на два массива: " + (System.currentTimeMillis() - a));

        Thread t1 = new Thread(() -> {
            long b = System.currentTimeMillis();
            for (int i = 0; i < HALF; i++) {
                newArr1[i] = (float) (newArr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.out.println("Подсчет в 1-ом потоке: " + (System.currentTimeMillis() - b));
        });

        Thread t2 = new Thread(() -> {
            long c = System.currentTimeMillis();
            for (int i = 0; i < HALF; i++) {
                newArr2[i] = (float) (newArr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.out.println("Подсчет в 2-ом потоке: " + (System.currentTimeMillis() - c));
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long d = System.currentTimeMillis();

        System.arraycopy(newArr1, 0, newArr, 0, HALF);
        System.arraycopy(newArr2, 0, newArr, HALF, HALF);

        System.out.println("Склейка двух массивов: " + (System.currentTimeMillis() - d));
    }
}
