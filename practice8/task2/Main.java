package ru.mirea.lab8.task2;

import java.util.Scanner;

public class Main {
    //    Вариант в журнале: 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        int n = scanner.nextInt();

        System.out.println("Numbers from 1 to " + n + ":");
        printNumbers(n);

        scanner.close();
    }

    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }
}
