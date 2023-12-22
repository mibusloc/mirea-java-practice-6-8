package ru.mirea.lab6.task12;

public class DeleteCommand implements Command {
    private int startIndex;
    private int endIndex;
    private String deletedText;

    public DeleteCommand(int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void execute(StringBuilder builder) {
        deletedText = builder.substring(startIndex, endIndex);
        builder.delete(startIndex, endIndex);
    }

    public String getDeletedText() {
        return deletedText;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public int getStartIndex() {
        return startIndex;
    }
}