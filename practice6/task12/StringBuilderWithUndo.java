package ru.mirea.lab6.task12;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderWithUndo {
    private final StringBuilder stringBuilder;
    private final List<Command> commandHistory;

    public StringBuilderWithUndo() {
        stringBuilder = new StringBuilder();
        commandHistory = new ArrayList<>();
    }

    public void append(String text) {
        Command command = new AppendCommand(text);
        command.execute(stringBuilder);
        commandHistory.add(command);
    }

    public void delete(int startIndex, int endIndex) {
        Command command = new DeleteCommand(startIndex, endIndex);
        command.execute(stringBuilder);
        commandHistory.add(command);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            if (lastCommand instanceof DeleteCommand) {
                DeleteCommand deleteCommand = (DeleteCommand) lastCommand;
                stringBuilder.insert(deleteCommand.getStartIndex(), deleteCommand.getDeletedText());
            }
        }
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}