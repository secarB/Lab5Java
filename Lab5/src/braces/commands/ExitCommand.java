package braces.commands;

import braces.core.CollectionManager;

public class ExitCommand extends AbstractCommand{
    @Override
    public boolean execute() {
        System.exit(0);
        return true;
    }
}
