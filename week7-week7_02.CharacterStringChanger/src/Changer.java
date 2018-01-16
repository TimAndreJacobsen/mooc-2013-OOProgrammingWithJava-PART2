import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> changeArrayList;

    public Changer() {
        this.changeArrayList = new ArrayList();
    }

    public void addChange(Change change) {
        this.changeArrayList.add(change);
    }

    public String change(String characterString) {
        for (Change Change : changeArrayList) {
            characterString = Change.change(characterString);
        }
        return characterString;
    }

}
