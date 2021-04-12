package braces.fields.comparator;
import java.util.Comparator;
import braces.fields.SpaceMarine;
public class ComparebyHeight implements Comparator<SpaceMarine> {
    @Override
    public int compare(SpaceMarine o1, SpaceMarine o2) {
        return o1.getHeight() > o2.getHeight() ? 1 : -1;
    }
}
