package ru.mirea.lab6.task11;

public class Main {
    public static void main(String[] args) {
        double celsius = 25.0;

        Convertable kelvinConverter = new CelsiusToKelvinConverter();
        Convertable fahrenheitConverter = new CelsiusToFahrenheitConverter();

        double kelvin = kelvinConverter.convert(celsius);
        double fahrenheit = fahrenheitConverter.convert(celsius);

        System.out.println(celsius + " градусов Цельсия равно " + kelvin + " Кельвинам.");
        System.out.println(celsius + " градусов Цельсия равно " + fahrenheit + " Фаренгейтам.");
    }
}
