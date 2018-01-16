import java.util.ArrayList;

public class Suitcase {

    private int weightLimit;
    private ArrayList<Thing> contents;

    public Suitcase(int weightLimitAtStart) {
        this.weightLimit = weightLimitAtStart;
        this.contents = new ArrayList();
    }

    public void addThing(Thing thing) {
        if (check(thing)){
            this.contents.add(thing);
        }
    }

    public boolean check(Thing thing) {
        if ((thing.getWeight() + currentWeight()) <= this.weightLimit){
            return true;
        }
        return false;
    }

    public int currentWeight() {
        int currentWeight = 0;

        for (Thing thing : contents) {
            currentWeight += thing.getWeight();
        }
        return currentWeight;
    }

    @Override
    public String toString() {
        int totalWeight = 0;
        int thingsHeld = 0;

        for (Thing thing : contents) {
            totalWeight += thing.getWeight();
            thingsHeld++;
        }
        if (thingsHeld > 1){
            return thingsHeld + " things (" + totalWeight + " kg)";
        } else if (contents.size() == 1){return thingsHeld + " thing (" + totalWeight + " kg)";}
        return "empty (" + totalWeight + " kg)";

    }

    public void printThings() {
        for (Thing t : contents) {
            System.out.println(t);
        }
    }

    public int totalWeight() {
        return currentWeight();
    }

    public Thing heaviestThing() {

        if (this.contents.size() == 0){
            return null;
        }

        Thing heaviest = this.contents.get(0);
        for (Thing t:contents) {
            if (heaviest.getWeight() < t.getWeight()){
                heaviest = t;
            }
        }
        return heaviest;
    }

}
