package braces.commands;

import braces.core.Asker;
import braces.core.CollectionManager;

public class InfoCommand extends AbstractCommand{
    private CollectionManager collectionManager;
    public InfoCommand(CollectionManager collectionManager)
    {
        this.collectionManager = collectionManager;
    }

    @Override
    public boolean execute() {
        collectionManager.info();
        return true;
    }
}
