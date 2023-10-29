package ru.mirea.lab6.task13;

import java.util.ArrayList;
import java.util.List;

public class ObservableStringBuilder implements Observable {
    private final StringBuilder stringBuilder;
    private final List<Observer> observers;

    public ObservableStringBuilder() {
        stringBuilder = new StringBuilder();
        observers = new ArrayList<>();
    }

    public void append(String text) {
        stringBuilder.append(text);
        notifyObservers("Append: " + text);
    }

    public void delete(int startIndex, int endIndex) {
        stringBuilder.delete(startIndex, endIndex);
        notifyObservers("Delete: from " + startIndex + " to " + endIndex);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}