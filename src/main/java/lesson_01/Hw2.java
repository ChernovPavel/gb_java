package lesson_01;

public class Hw2 {
    public static void main(String[] args) {
        sumFrom10to20(10, -5);
        isPositiveOrNegative(-11);
        isNegative(-12);
        printWordNTimes("hello", 4);
        isLeapYear(1800);

    }

    private static boolean sumFrom10to20(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    private static void isPositiveOrNegative(int a) {
        System.out.println(a >= 0 ? "Положительное" : "Отрицательное");
    }

    private static boolean isNegative(int a) {
        return a < 0;
    }

    private static void printWordNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 4 == 0 && year % 400 == 0);
    }

}
