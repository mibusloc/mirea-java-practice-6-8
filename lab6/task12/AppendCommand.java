package ru.mirea.lab6.task12;

public class AppendCommand implements Command {
    private String text;

    public AppendCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute(StringBuilder builder) {
        builder.append(text);
    }
}