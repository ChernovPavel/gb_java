package lesson_04;

import java.util.Random;
import java.util.Scanner;

public class TicTakToe {

    private static final int SIZE = 5;
    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final String SPACE_MAP = " ";
    private static final String HEADER_FIRST_MAP = "♥";

    private static final char[][] MAP = new char[SIZE][SIZE];
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    private static int turnsCount;

    private static int rowNumber;
    private static int columnNumber;


    public static void turnGame() {
        do {
            System.out.println("\n\nИгра начинается!");
            init();
            printMap();
            playGame();
        } while (isContinueGame());
        endGame();
    }

    private static void init() {
        initMap();
        turnsCount = 0;
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printHeaderMap();
        printBodyMap();
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_MAP + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }

    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            turnHuman();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            turnAI();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }

    }

    private static void turnHuman() {
        System.out.println("ХОД ЧЕЛОВЕКА");

        while (true) {
            rowNumber = getValidNumberFromUser() - 1;
            columnNumber = getValidNumberFromUser() - 1;
            if (isCellFree(rowNumber, columnNumber)) {
                break;
            } else {
                System.out.println("\nВы выбрали занятую ячейку!");
            }
        }

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static void turnAI() {

        System.out.println("ХОД КОМПА");
        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }

    private static int getValidNumberFromUser() {
        while (true) {
            System.out.print("Введите координату(1-" + SIZE + "): ");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n)) {
                    return n;
                } else {
                    System.out.println("\nПроверьте значение координаты. Значение от 1 до " + SIZE);
                }
            } else {
                in.next();
                System.out.println("\nВвод допускает только целые числа!");
            }
        }
    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= SIZE;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("\nВы победили!");
            } else {
                System.out.println("\nКомп победил");
            }
            return true;
        }

        if (checkDraw()) {
            System.out.println("\nНичья!");
            return true;
        }

        return false;
    }

    private static boolean checkWin(char symbol) {

        // проверка строки
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            if (MAP[rowNumber][i] == symbol) {
                count++;
                if (count == lengthForWin(SIZE)) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        // проверка столбца
        count = 0;
        for (int i = 0; i < SIZE; i++) {
            if (MAP[i][columnNumber] == symbol) {
                count++;
                if (count == lengthForWin(SIZE)) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        // проверка основной диагонали
        count = 0;
        int sub = columnNumber - rowNumber;
        if (sub >= 0) {
            for (int i = 0; i < SIZE - sub; i++) {
                if (MAP[i][i + sub] == symbol) {
                    count++;
                    if (count == lengthForWin(SIZE)) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        } else {
            for (int i = 0; i < SIZE + sub; i++) {
                if (MAP[i - sub][i] == symbol) {
                    count++;
                    if (count == lengthForWin(SIZE)) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        //проверка побочной диагонали
        count = 0;
        int sum = columnNumber + rowNumber;
        if (sum < SIZE) {
            for (int i = 0; i < sum + 1; i++) {
                if (MAP[i][sum - i] == symbol) {
                    count++;
                    if (count == lengthForWin(SIZE)) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        } else {
            for (int i = 0; i < (SIZE * 2) - 1 - sum; i++) {
                if (MAP[i + (sum - (SIZE - 1))][(SIZE - 1) - i] == symbol) {
                    count++;
                    if (count == lengthForWin(SIZE)) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        return false;
    }

    private static boolean checkDraw() {
        return turnsCount >= SIZE * SIZE;
    }

    private static int lengthForWin(int x) {
        if (x <= 5) return 3;
        if (x >= 6 && x <= 10) {
            return 4;
        } else return 6;
    }

    private static boolean isContinueGame() {
        System.out.println("Хотите продолжить? y\\n");
        return switch (in.next()) {
            case "y" -> true;
            default -> false;
        };
    }

    private static void endGame() {
        System.out.println("Конец игры");
    }
}
