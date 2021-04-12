package braces.commands;

public interface Command {
    boolean execute(String argument);
    boolean execute();
}
