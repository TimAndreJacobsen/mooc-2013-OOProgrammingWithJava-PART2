public class Plane {

    private String planeID;
    private int planeCapacity;

    public Plane(String planeID, int planeCapacity) {
        this.planeID = planeID;
        this.planeCapacity = planeCapacity;
    }

    public String getPlaneID() {
        return planeID;
    }

    public int getPlaneCapacity() {
        return planeCapacity;
    }

    public String toString() {
        return this.planeID + " (" + this.planeCapacity + " ppl)";
    }
}