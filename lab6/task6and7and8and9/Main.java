package ru.mirea.lab6.task6and7and8and9;

public class Main {
    public static void main(String[] args) {
        Printable[] printableItems = new Printable[4];
        printableItems[0] = new Book("Первая книга");
        printableItems[1] = new Magazine("Первый журнал");
        printableItems[2] = new Book("Вторая книга");
        printableItems[3] = new Magazine("Второй журнал");

        for (Printable item : printableItems) {
            item.print();
        }
    }
}