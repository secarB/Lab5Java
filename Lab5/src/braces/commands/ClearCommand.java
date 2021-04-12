package braces.commands;

import braces.core.Asker;
import braces.core.CollectionManager;

public class ClearCommand extends AbstractCommand {
    private CollectionManager collectionManager;
    public ClearCommand(CollectionManager collectionManager)
    {
        this.collectionManager = collectionManager;
    }
    @Override
    public boolean execute() {
        collectionManager.clear();
        return true;
    }
}
