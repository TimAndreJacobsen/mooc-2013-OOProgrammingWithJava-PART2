import java.util.ArrayList;

public class Box implements ToBeStored {

    private double weightLimit;
    private ArrayList<ToBeStored> box;


    public Box(double weightLimit) {
        this.weightLimit = weightLimit;
        this.box = new ArrayList();
    }


    public void add(ToBeStored thing) {
        if (this.weightLimit > thing.weight() + this.weight()) {
            this.box.add(thing);
        }
    }

    public double weight() {
        double weight = 0;

        for (ToBeStored t : this.box) {
            weight += t.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.box.size() + " things, total weight " + this.weight() + " kg";
    }


}
