package boxes;

import java.util.Objects;

public class Thing {
    // Declaring
    private String name;
    private int weight;

    // Constructors
    public Thing(String name, int weight) {

        if (weight < 0) {
            throw new IllegalArgumentException();

        } else {
            this.name = name;
            this.weight = weight;
        }

    }

    public Thing(String name) {
        this(name, 0);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    // Equals + Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Objects.equals(name, thing.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}