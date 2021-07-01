package lesson_3;

import java.util.Random;
import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();


    public static void main(String[] args) {
        randomNumGame();
    }

    public static void randomNumGame() {
        int num = rand.nextInt(10);


        int attempt = 0;


        while (attempt < 3) {
            System.out.println("Введите число от 0 до 9 : ");
            int num1 = sc.nextInt();

            if (num1 < num) {
                System.out.println("Введеное число меньше. ");
            }
            if (num1 > num) {
                System.out.println("Введеное число больше. ");

            }
            if (num1 == num) {
                System.out.println("Поздравляю с правильным ответом ");

            }
            attempt++;

        }
        System.out.println("Попытки исчерпаны");

        while (true) {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»");
            int number = sc.nextInt();
            if (number == 1) {
                randomNumGame();
            } else {
                break;
            }

        }
    }
}

