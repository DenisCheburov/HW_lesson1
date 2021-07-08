package lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static final int SIZE = 3;

    static final char DOT_TO_WIN = 3;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static final Scanner sc = new Scanner(System.in);
    static final Random random = new Random();

    public static void main(String[] args) {
        initmap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (chekWin(DOT_X)) {
                System.out.println("Вы выиграли");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (chekWin(DOT_O)) {
                System.out.println("Компьютер победил");
                break;
            }
        }

    }

    public static void humanTurn() {
        int y;
        int x;

        do {
            System.out.println("Input X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));


        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int y;
        int x;

        do {
            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!isCellValid(y, x));


        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int y, int x) {
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;

    }

    public static void initmap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;

            }

        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {

            System.out.printf("%d ", i + 1);
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d ", i + 1);
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", map[i][j]);


            }
            System.out.println();
        }
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }

            }

        }
        return true;
    }

    public static boolean chekWin(char c) {
        int toWinDiag1 = 0;
        int toWinDiag = 0;

        for (int i = 0; i < SIZE; i++) {
            int toWinHor = 0;
            int toWinVert = 0;

            for (int j = 0; j < SIZE; j++) {

                if (map[i][j] == c) toWinHor++;
                if (map[j][i] == c) toWinVert++;
            }
            if (toWinHor == DOT_TO_WIN || toWinVert == DOT_TO_WIN) return true;
            if (map[i][i] == c) toWinDiag1++;
            if (map[i][map[i].length - i - 1] == c) toWinDiag++;
        }
        if (toWinDiag1 == DOT_TO_WIN || toWinDiag == DOT_TO_WIN) return true;
        return false;


    }

}






