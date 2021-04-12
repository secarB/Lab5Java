package braces.commands;

import braces.core.Asker;
import braces.core.CollectionManager;
/**
 * Class for replace if greater command
 */
public class ReplaceIfGreaterCommand extends AbstractCommand{
    private CollectionManager collectionManager;
    private Asker asker;
    public ReplaceIfGreaterCommand(CollectionManager collectionManager, Asker asker)
    {
        this.asker = asker;
        this.collectionManager = collectionManager;
    }
    @Override
    public boolean execute(String argument) {
        if (collectionManager.replaceGreater(argument,asker.createSpaceMarine())) return true;
        System.out.println("Key does not exist");
        return false;
    }
}
