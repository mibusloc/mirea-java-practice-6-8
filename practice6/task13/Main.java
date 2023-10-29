package ru.mirea.lab6.task13;

public class Main {
    public static void main(String[] args) {
        ObservableStringBuilder builder = new ObservableStringBuilder();

        Observer observer1 = new StringObserver("Observer 1");
        Observer observer2 = new StringObserver("Observer 2");

        builder.addObserver(observer1);
        builder.addObserver(observer2);

        builder.append("Hello, ");
        builder.append("World!");
        System.out.println(builder);

        builder.delete(7, 13);
        System.out.println(builder);

        builder.removeObserver(observer2);

        builder.append("this is a new message.");
        System.out.println(builder);
    }
}
