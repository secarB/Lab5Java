package braces.commands;

import braces.core.Asker;
import braces.core.CollectionManager;

public class HelpCommand extends AbstractCommand{
    private CollectionManager   collectionManager;
    public HelpCommand(CollectionManager collectionManager)
    {
        this.collectionManager = collectionManager;
    }
    @Override
    public boolean execute() {
        collectionManager.help();
        return true;
    }
}
