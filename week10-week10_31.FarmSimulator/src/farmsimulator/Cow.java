package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {
    // Declaring (and initializing array)
    private double udderCapacity;
    private String name;
    private double amountOfMilk;
    private static final String[] NAMES = fillNameArray();

    // Constructors initializing
    public Cow(String name) {

        this.name = name;
        this.udderCapacity = 15 + new Random().nextInt(26);
    }

    public Cow() {

        this.udderCapacity = (15 + new Random().nextInt(26));
        this.name = NAMES[new Random().nextInt(NAMES.length - 1)];
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.udderCapacity;
    }

    public double getAmount() {
        System.out.println("getAmount called");
        return this.amountOfMilk;
    }

    // Overrides
    @Override
    public String toString() {
        return this.name + " " + this.amountOfMilk + "/" + this.udderCapacity;
    }

    @Override
    public double milk() {
        double temp = this.amountOfMilk;
        this.amountOfMilk = 0;
        return temp;
    }

    @Override
    public void liveHour() {
        // double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble()
        Random r = new Random();
        double milkGained = 0 + (2 - 0) * r.nextDouble();

        if (this.udderCapacity >= this.amountOfMilk + milkGained) {
            this.amountOfMilk = this.amountOfMilk + milkGained;
            this.amountOfMilk = Math.ceil(this.amountOfMilk);

        } else {
            this.amountOfMilk = this.udderCapacity;
            System.out.println("milk overflow, set to max: " + this.udderCapacity);
        }
    }

    // Methods

    private static String[] fillNameArray() {

        return new String[]{
                "Anu", "Arpa", "Essi", "Heluna", "Hely",
                "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
                "Jaana", "Jami", "Jatta", "Laku", "Liekki",
                "Mainikki", "Mella", "Mimmi", "Naatti",
                "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
                "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    }


}
