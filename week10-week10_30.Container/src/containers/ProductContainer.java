package containers;

public class ProductContainer extends Container {
    // Declaring
    private String name;
    // Initializing
    public ProductContainer(String name, double capacity) {
        super(capacity);
        this.name = name;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + ": " + super.toString();
    }


}
