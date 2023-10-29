package ru.mirea.lab6.task4;

public class Main {
    public static void main(String[] args) {
        Priceable phone = new Product("Samsung Galaxy 2983", 100000);
        Priceable car = new Car("Жигули", 80000);

        System.out.println("Samsung Galaxy 2983 стоит " + phone.getPrice());
        System.out.println("Жигуль стоит " + car.getPrice());
    }
}
