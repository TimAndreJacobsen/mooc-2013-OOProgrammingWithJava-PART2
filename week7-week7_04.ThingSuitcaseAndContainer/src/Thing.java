public class Thing {

    private int weight;
    private String name;

    public Thing(String nameAtStart, int weightAtStart) {
        this.name = nameAtStart;
        this.weight = weightAtStart;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.getName() + " (" + getWeight() + " kg)";
    }
}
