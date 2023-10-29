package ru.mirea.lab6.task11;

public class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double temperature) {
        return (temperature * 9 / 5) + 32;
    }
}