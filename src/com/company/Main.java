package com.company;

public class Main {


    public static void main(String[] args) {
        System.out.println(calculate(2, 2, 2, 2));
        System.out.println(task10and20(5, 3));
        isPositiveOrNegative(-30);
        System.out.println(isNegative(3));
        name ("Denis");

    }

    int i = 123512;
    byte bb = 120;
    short s = 12421;
    long l = 125135136523L;
    float f = 44.53f;
    double dd = 2231.2131;
    char ccc = 's';
    boolean t = true;


    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean task10and20(int a, int b) {
        int sum = a + b;
        return 10 <= sum && sum <= 20;
    }


    public static void isPositiveOrNegative(int a) {

        if (a >= 0) {
            System.out.println("Число положительное");

        } else {
            System.out.println("Число отрицательно");
        }


    }
    public static boolean isNegative (int a){
        if (a<0){
            return true;
        }else{
            return false;
        }

    }

    public static void name (String n){
        System.out.println("Привет " + n);
    }

}