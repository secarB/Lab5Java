package braces.fields;
/**
 * Class chapter
 */
public class Chapter {
    private String name; //Can't be null, String can't be empty
    private String parentLegion;
    private int marinesCount; //Field value must be greater than 0, Maximum field value: 1000
    private String world; //Can't be null
    public String getName() {
        return name;
    }
    public boolean setName(String name) {
        if (name == null || name.equals("")) return false;
        this.name = name;
        return true;
    }
    public String getParentLegion() {
        return parentLegion;
    }
    public void setParentLegion(String parentLegion) {
        this.parentLegion = parentLegion;
    }
    public int getMarinesCount() {
        return marinesCount;
    }
    public boolean setMarinesCount(int marinesCount) {
        if (marinesCount <= 0 || marinesCount > 1000) return false;
        this.marinesCount = marinesCount;
        return true;
    }
    public String getWorld() {
        return world;
    }
    public boolean setWorld(String world) {
        if (world == null ) return false;
        this.world = world;
        return true;
    }
}
