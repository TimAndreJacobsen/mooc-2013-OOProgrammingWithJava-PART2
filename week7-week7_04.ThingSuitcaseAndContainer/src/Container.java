import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Container(int maxWeightAtStart) {
        this.suitcases = new ArrayList();
        this.maxWeight = maxWeightAtStart;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (check(suitcase)){
            this.suitcases.add(suitcase);
        }
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + currentWeight() + " kg)";
    }

    public int currentWeight() {
        int currentWeight = 0;

        for (Suitcase sc : suitcases) {
            currentWeight += sc.currentWeight();
        }
        return currentWeight;
    }

    public void printThings() {
        for (Suitcase sc : suitcases) {
            sc.printThings();
        }
    }
    public boolean check(Suitcase sc) {
        if ((sc.currentWeight() + this.currentWeight()) <= this.maxWeight){
            return true;
        }
        return false;
    }



}
