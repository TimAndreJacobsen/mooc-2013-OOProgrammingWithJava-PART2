package movable;

import java.util.ArrayList;

public class Group implements Movable {
    // Initialization and Declaration
    private ArrayList<Movable> group = new ArrayList<Movable>();

    // Methods
    public void addToGroup(Movable movable) {
        group.add(movable);
    }

    // Inherited Methods Override from Interface Object
    public String toString() {

        String result = "";

        for (Movable o : group) {
            result += o.toString();
            result += "\n";
        }
        return result;
    }

    // Inherited Methods Override from Interface Movable
    @Override
    public void move(int dx, int dy) {

        for (Movable movable : group) {
            movable.move(dx,dy);
        }
    }
}
