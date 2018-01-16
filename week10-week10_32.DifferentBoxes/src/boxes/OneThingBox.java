package boxes;

import java.util.ArrayList;
import java.util.Collection;

public class OneThingBox extends Box {

    private Collection<Thing> things;

    public OneThingBox() {
        this.things = new ArrayList<Thing>();
    }


    @Override
    public void add(Thing thing) {
        if (this.things.isEmpty()) {
            this.things.add(thing);
        } else {
            System.out.println("Box already has a thing");
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {

        for (Thing t : things) {
            if (t.equals(thing)) {
                return true;
            }
        }
        return false;
    }

}
