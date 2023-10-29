package ru.mirea.lab6.task12;

public class Main {
    public static void main(String[] args) {
        StringBuilderWithUndo builder = new StringBuilderWithUndo();

        builder.append("Hello, ");
        builder.append("World!");
        System.out.println(builder);

        builder.delete(7, 13);
        System.out.println(builder);

        builder.undo();
        System.out.println(builder);
    }
}
