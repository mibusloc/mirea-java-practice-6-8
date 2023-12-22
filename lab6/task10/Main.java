package ru.mirea.lab6.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите информацию о трёх компьютерах:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Марка компьютера (ASUS, HP, DELL, LENOVO): ");
            Brand brand = Brand.valueOf(scanner.next().toUpperCase());

            System.out.print("Модель процессора: ");
            String processorModel = scanner.next();

            System.out.print("Размер ОЗУ (в ГБ): ");
            int memorySize = scanner.nextInt();

            System.out.print("Модель монитора: ");
            String monitorModel = scanner.next();

            Processor processor = new Processor(processorModel);
            Memory memory = new Memory(memorySize);
            Monitor monitor = new Monitor(monitorModel);

            Computer computer = new Computer(brand, processor, memory, monitor);
            shop.addComputer(computer);
        }

        System.out.print("Введите марку компьютера для поиска: ");
        Brand searchBrand = Brand.valueOf(scanner.next().toUpperCase());
        Computer foundComputer = shop.findComputerByBrand(searchBrand);

        if (foundComputer != null) {
            System.out.println("Найден компьютер марки " + searchBrand);
            System.out.println("Модель процессора: " + foundComputer.getProcessor().getModel());
            System.out.println("Размер ОЗУ: " + foundComputer.getMemory().getSize() + " ГБ");
            System.out.println("Модель монитора: " + foundComputer.getMonitor().getModel());
        } else {
            System.out.println("Компьютер марки " + searchBrand + " не найден в магазине.");
        }

        scanner.close();
    }
}
