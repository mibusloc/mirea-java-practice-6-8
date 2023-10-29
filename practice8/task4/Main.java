package ru.mirea.lab8.task4;

import java.util.Scanner;

public class Main {
    //    Вариант в журнале: 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("K: ");
        int k = scanner.nextInt();

        System.out.print("S: ");
        int s = scanner.nextInt();

        int result = countNumbers(k, s);
        System.out.println("Result: " + result);
    }

    public static int countNumbers(int k, int s) {
        if (k == 0) {
            return s == 0 ? 1 : 0;
        }

        int count = 0;
        for (int i = (k == 1 ? 1 : 0); i <= 9; i++) {
            if (s - i >= 0) {
                count += countNumbers(k - 1, s - i);
            }
        }
        return count;
    }
}
