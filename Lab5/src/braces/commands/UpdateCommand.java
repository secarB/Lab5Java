package braces.commands;

import braces.core.Asker;
import braces.core.CollectionManager;
/**
 * Class for update command
 */
public class UpdateCommand extends AbstractCommand{
    private CollectionManager collectionManager;
    private Asker asker;
    public  UpdateCommand(CollectionManager collectionManager, Asker asker)
    {
        this.asker = asker;
        this.collectionManager = collectionManager;
    }
    @Override
    public boolean execute(String argument) {
        long id = Long.parseLong(argument);
        if (collectionManager.update(id, asker.createSpaceMarine())) return true;
        System.out.println("Can't find id:");
        return false;
    }
}
