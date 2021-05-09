package braces.commands;

import java.util.Scanner;

/**
 * This abstract class is created to avoid implementing all the unnecessary methods of interface
 */
public abstract class AbstractCommand implements Command{
    @Override
    public boolean execute(String argument) {
        return false;
    }
    @Override
    public boolean execute() {
        return false;
    }
    @Override
    public boolean execute(String argument, Scanner scanner) {
    	return false;
    }
    @Override
    public boolean execute(Scanner scanner) {
    	return false;
    }
}