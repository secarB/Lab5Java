package braces.commands;

import braces.core.Asker;
import braces.core.CollectionManager;

public class RemoveGreaterCommand extends AbstractCommand{
    private CollectionManager collectionManager;
    private Asker asker;
    public RemoveGreaterCommand(CollectionManager collectionManager, Asker asker)
    {
        this.asker = asker;
        this.collectionManager = collectionManager;
    }
    @Override
    public boolean execute() {
        collectionManager.removeGreater(asker.createSpaceMarine());
        return true;
    }
}
