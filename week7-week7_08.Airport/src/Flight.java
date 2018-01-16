public class Flight{

    private String planeID;
    private String departure;
    private String arrival;
    private int capacity;

    public Flight(String planeID, int planeCapacity, String departure, String arrival) {
        this.planeID = planeID;
        this.departure = departure;
        this.arrival = arrival;
        this.capacity = planeCapacity;
    }

    public String toString() {
        return this.planeID + " (" + this.capacity + " ppl) (" + this.departure + "-" + this.arrival+")";
    }
}