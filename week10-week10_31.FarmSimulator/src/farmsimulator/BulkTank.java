package farmsimulator;

public class BulkTank {
    // Declaring
    private double capacity;
    private double volume;

    // Constructors - Initializing
    public BulkTank() {
        this.capacity = 2000.0;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    // Getters
    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    // Methods
    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {
        if (amount <= 0) {
            // System.out.println("cant add negative amounts of milk");
            return;
        }
        if (amount + this.volume > this.capacity) {
            // System.out.println("You dont have room for that much milk. i filled her up like you asked, " +
            //        "but the rest is now on the ground");
            this.volume = this.capacity;
            return;
        }
        this.volume += amount;
    }

    public double getFromTank(double amount) {
        if (amount <= 0) { // checks if user inputs 0 or negative value, making it invalid
            System.out.println("Why take 0 or negative milk?");
            return 0;
        }
        if (amount > this.volume) { // checks if user wants more milk than there actually is
            double temp = this.volume; // if so, gives the user all the milk
            this.volume = 0;
            return temp;

        }
        this.volume = this.volume - amount; // subtract amount from total
        return amount; // returns the amount withdrawn
    }

    @Override
    public String toString() {
        return Math.ceil(this.getVolume()) + "/" + Math.ceil(this.getCapacity());
    }



}
