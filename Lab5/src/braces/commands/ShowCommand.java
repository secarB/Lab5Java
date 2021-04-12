package braces.commands;

import braces.core.Asker;
import braces.core.CollectionManager;

public class ShowCommand extends AbstractCommand {
    private CollectionManager collectionManager;
    private Asker asker;
    public ShowCommand(CollectionManager collectionManager)
    {
        this.collectionManager = collectionManager;
    }
    @Override
    public boolean execute() {
        collectionManager.show();
        return true;
    }
}
