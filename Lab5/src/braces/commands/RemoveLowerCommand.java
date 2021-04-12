package braces.commands;

import braces.core.Asker;
import braces.core.CollectionManager;

public class RemoveLowerCommand extends AbstractCommand{
    private CollectionManager collectionManager;
    private Asker asker;
    public RemoveLowerCommand(CollectionManager collectionManager, Asker asker)
    {
        this.asker = asker;
        this.collectionManager = collectionManager;
    }
    @Override
    public boolean execute() {
        collectionManager.removeLower(asker.createSpaceMarine());
        return true;
    }
}
