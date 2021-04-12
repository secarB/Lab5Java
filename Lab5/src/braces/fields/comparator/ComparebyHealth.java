package braces.fields.comparator;
import java.util.Comparator;
import braces.fields.SpaceMarine;
public class ComparebyHealth implements Comparator<SpaceMarine> {
    @Override
    public int compare(SpaceMarine o1, SpaceMarine o2) {
        return o1.getHealth() > o2.getHealth() ? 1 : -1;
    }
}
