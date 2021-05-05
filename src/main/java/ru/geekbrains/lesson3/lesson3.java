package ru.geekbrains.lesson3;

import java.util.Scanner;

public class lesson3 {

    public static Scanner scanner = new Scanner (System.in);


    public static void main(String[] args) {
        System.out.println("Hello Java");
        String userData = scanner.next();

    }

    public static void printUserData(String inputString){
        System.out.println("Your message is " + inputString);
    }
}
