package ru.mirea.lab6.task6and7and8and9;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Печатается журнал: " + name);
    }
}
