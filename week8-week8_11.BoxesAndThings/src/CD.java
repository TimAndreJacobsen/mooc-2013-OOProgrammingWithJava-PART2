public class CD implements ToBeStored {

    private String artist;
    private String name;
    private int publishingYear;
    private double weight;

    public CD(String artist, String name, int publishingYear) {
        this.artist = artist;
        this.name = name;
        this.publishingYear = publishingYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.publishingYear + ")";
    }
}
