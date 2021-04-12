package braces.commands;

import braces.core.Asker;
import braces.core.CollectionManager;

public class InsertCommand extends AbstractCommand{
    private CollectionManager collectionManager;
    private Asker asker;
    public InsertCommand(CollectionManager collectionManager, Asker asker)
    {
        this.asker = asker;
        this.collectionManager = collectionManager;
    }
    @Override
    public boolean execute(String argument)
    {
        if (collectionManager.add(argument,asker.createSpaceMarine())) return true;
        System.out.println("Key already exists");
        return false;
    }
}
