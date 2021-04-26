package ru.geekbrains.lesson1.homework;

public class Lesson1_homework {
    public static void main(String[] args) {
        printTreeWorlds();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printTreeWorlds() {
        System.out.println("Orange\n" +
                "Banana\n" +
                "Apple");

    }

    public static void checkSumSign() {
        int a = 10;
        int b = -6;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        if (a + b < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 77;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value >100) {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = -10, b =27;
        if (a >= b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }
    }
}
