package ru.mirea.lab6.task13;

public class StringObserver implements Observer {
    private String name;

    public StringObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received an update: " + message);
    }
}