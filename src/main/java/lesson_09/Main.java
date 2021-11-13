package lesson_09;

public class Main {
    public static void main(String[] args) throws MyArrayDataException {
        String[][] arr = {
                {"1", "2", "3", "2"},
                {"10", "20", "30", "40"},
                {"11", "21", "31", "41"},
                {"12", "22", "32", "33s"}
        };

        try {
            sumArr(arr);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    private static void sumArr(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        int iIndex = 0;
        int jIndex = 0;
        if (!(array.length == 4)) throw new MyArraySizeException("Размер массива не 4Х4");

        for (String[] strings : array) {
            if (!(strings.length == 4)) throw new MyArraySizeException("Размер массива не 4Х4");
        }

        try {
            for (int i = 0; i < array.length; i++) {
                iIndex = i;
                for (int j = 0; j < array[i].length; j++) {
                    jIndex = j;
                    sum += Integer.parseInt(array[i][j]);

                }
            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(iIndex, jIndex);
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}