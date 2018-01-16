package moving.domain;

import java.util.ArrayList;

public class Box implements Thing {

    private int maximumCapacity;
    private ArrayList<Thing> box = new ArrayList<Thing>();

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing) {

        if (this.maximumCapacity >= (thing.getVolume() + this.getVolume()) ) {
            this.box.add(thing);
            return true;

        } else
            return false;
    }

    @Override
    public int getVolume() {
        int currentVolume = 0;
        for (Thing thing : this.box) {
            currentVolume += thing.getVolume();
        }
        return currentVolume;
    }

    public String toString() {
        return "Box: " + box + " vol: " + this.getVolume();
    }
}
