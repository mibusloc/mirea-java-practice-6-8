package ru.mirea.lab6.task11;

public class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}