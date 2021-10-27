package lesson_01;

import java.util.Arrays;

public class Hw3 {
    public static void main(String[] args) {

        // Первое задание
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        // Второе задание
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }

        // Третье задание
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }

        // Четвертое задание
        int[][] arr4 = new int[7][7];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i == j || i + j == arr4.length - 1) {
                    arr4[i][j] = 1;
                }
                System.out.printf("%4d", arr4[i][j]);
            }
            System.out.println();
        }

        // Пятое задание
        int[] arr5 = createArrWith(9, 28);
        System.out.println(Arrays.toString(arr5));

        // Шестое задание
        int[] arr6 = {4, 626, 63, 346, 8768, 976, -12, 13, -999, 0, 1};
        Arrays.sort(arr6);
        System.out.printf("Min element: %d;  Max element: %d", arr6[0], arr6[arr6.length - 1]);

    }

    private static int[] createArrWith(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}
