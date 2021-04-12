package braces.commands;
/**
 * Interface for all command class
 */
public interface Command {
    boolean execute(String argument);
    boolean execute();
}
