package braces.commands;

import braces.core.CollectionManager;

public class SaveCommand extends AbstractCommand{
    private CollectionManager collectionManager;
    public SaveCommand(CollectionManager collectionManager)
    {
        this.collectionManager = collectionManager;
    }
    @Override
    public boolean execute(String filename) {
        collectionManager.save(filename);
        return true;
    }
}
