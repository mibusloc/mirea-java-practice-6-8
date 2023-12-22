package ru.mirea.lab6.task3;

public class Car implements Nameable {
    private String modelName;

    public Car(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String getName() {
        return modelName;
    }
}