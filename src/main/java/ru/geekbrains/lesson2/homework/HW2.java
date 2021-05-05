package ru.geekbrains.lesson2.homework;

import org.w3c.dom.ls.LSOutput;

public class HW2 {

    public static void main(String[] args) {

        System.out.println(sumOfNumbers (5, 6));

        System.out.println(positiveOrNegative(-5));

        System.out.println(negativeOrNot(-4));

        repeatString("Строка", 5);

        System.out.println(leapYear(-4));

    }

    public static boolean sumOfNumbers (int a, int b) {

        int c = a + b;

        if (c >= 10 && c <= 20) {
            return true;
        } else { return false;}

    }

    public static String positiveOrNegative (int number) {
        if (number >= 0) {
            return "Положительное";
        } else {
            return "Отрицательное";
        }
    }

    public static boolean negativeOrNot (int number) {
        if (number < 0) {
            return true;
        } else {return false;}

    }

    public static void repeatString(String s, int n) {

        for (int i = n; i > 0; i--) {
            System.out.println(s);
        }
    }

    public static boolean leapYear (int y) {
        if ( y % 400 == 0) {
            return true;
        } if (y % 100 == 0) {
            return false;
        } if (y % 4 == 0) {
            return true;
        } else return false;
    }

}
