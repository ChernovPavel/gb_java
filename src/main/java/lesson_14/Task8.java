package lesson_14;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Task8 {

    protected static final Logger logger = Logger.getLogger("TestLogTask8");

    public static void main(String[] args) throws IOException {

        Handler handler = new FileHandler("src/main/resources/logs/myLogTask8.log");

        logger.addHandler(handler);
        logger.getHandlers()[0].setFormatter(new SimpleFormatter());
        logger.getHandlers()[0].setLevel(Level.WARNING);
        logger.info("старт программы");

        shiftArray(new int[]{1, 2, 3, 4, 5}, 0);
        shiftArray(new int[]{1, 2, 3, 4, 5}, 1);
        shiftArray(new int[]{1, 2, 3, 4, 5}, 2);
        shiftArray(new int[]{1, 2, 3, 4, 5}, 5);
        shiftArray(new int[]{1, 2, 3, 4, 5}, 2000000000);
        shiftArray(new int[]{1, 2, 3, 4, 5}, -1);
        shiftArray(new int[]{1, 2, 3, 4, 5}, -2);
        shiftArray(new int[]{1, 2, 3, 4, 5}, -5);
        shiftArray(new int[]{1, 2, 3, 4, 5}, -6);
        shiftArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, 3);
    }


    static int[] shiftArray(int[] array, int n) {
        logger.info("метод смещения массива");
        int shiftNumber = n % array.length;
        if (shiftNumber < 0) {
            shiftLeft(array, shiftNumber);
        } else {
            shiftRight(array, shiftNumber);
        }
        System.out.println(Arrays.toString(array) + "; shiftNumber = " + n);
        return array;
    }

    private static void shiftRight(int[] array, int n) {
        logger.warning("в методе смещения массива вправо " + n);
        for (int i = 0; i < n; i++) {
            int lastValue = array[array.length - 1];
            System.arraycopy(array, 0, array, 1, array.length - 1);
            array[0] = lastValue;
        }
    }

    private static void shiftLeft(int[] array, int n) {
        logger.warning("в методе смещения массива влево " + n);
        for (int i = 0; i < Math.abs(n); i++) {
            int firstValue = array[0];
            System.arraycopy(array, 1, array, 0, array.length - 1);
            array[array.length - 1] = firstValue;
        }
    }
}
