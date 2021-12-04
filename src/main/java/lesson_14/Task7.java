package lesson_14;

import java.io.IOException;
import java.util.logging.*;

public class Task7 {

    protected static final Logger logger = Logger.getLogger("TestLogTask7");

    public static void main(String[] args) throws IOException {
        Handler handler = new FileHandler("src/main/resources/logs/myLogTask7.log");

        logger.addHandler(handler);
        logger.getHandlers()[0].setFormatter(new SimpleFormatter());
        logger.getHandlers()[0].setLevel(Level.ALL);
        logger.info("старт программы");

        int[] arr = new int[]{2, 2, 2, 1, 2, 2, 0, 0, 10, 1};

        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 2, 0, 0, 10, 1}));
        System.out.println(sum(new int[]{2, 2, 2, 1, 2, 2, 0, 0, 10, 1}, 0, arr.length));

        logger.info("конец программы");
    }

    static boolean checkBalance(int[] array) {
        System.out.println();
        int leftSum = 0;
        int rightSum = sum(array, 0, array.length);
        if (rightSum % 2 != 0) {
            return false;
        }

        for (int j : array) {

            leftSum += j;
            rightSum -= j;

            if (leftSum == rightSum) {
                logger.info("в методе сравнения частей массива");
                return true;
            }
        }
        return false;
    }

    static int sum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        logger.info("в методе возврата суммы");
        return sum;
    }
}
