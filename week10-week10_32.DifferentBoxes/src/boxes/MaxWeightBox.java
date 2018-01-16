package boxes;

import java.util.ArrayList;
import java.util.Collection;

public class MaxWeightBox extends Box {

    private Collection<Thing> things;
    private int maxWeight;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }


    @Override
    public void add(Thing thing) {
        System.out.println("Adding...");
        int check = 0;

        for (Thing t : things) {
            check += t.getWeight();
        }

        if (check + thing.getWeight() > maxWeight) {
            System.out.println("Box is full");
        } else {
            this.things.add(thing);
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
