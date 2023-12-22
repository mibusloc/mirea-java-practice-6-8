package ru.mirea.lab6.task3;

public class Main {
    public static void main(String[] args) {
        Nameable earth = new Planet("Марс");
        Nameable car = new Car("2008 Toyota Corolla");
        Nameable dog = new Animal("Собака");

        System.out.println("Планета: " + earth.getName());
        System.out.println("Авто: " + car.getName());
        System.out.println("Животное: " + dog.getName());
    }
}
