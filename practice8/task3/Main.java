package ru.mirea.lab8.task3;

import java.util.Scanner;

public class Main {
    //    Вариант в журнале: 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        int a = scanner.nextInt();

        System.out.print("B: ");
        int b = scanner.nextInt();

        System.out.println("Numbers from " + a + " to " + b + ":");
        printNumbers(a, b);

        scanner.close();
    }

    public static void printNumbers(int a, int b) {
        if (a == b) {
            System.out.print(a + " ");
        } else if (a < b) {
            System.out.print(a + " ");
            printNumbers(a + 1, b);
        } else {
            System.out.print(a + " ");
            printNumbers(a - 1, b);
        }
    }
}
