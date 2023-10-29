package ru.mirea.lab6.task6and7and8and9;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Печатается книга: " + title);
    }
}