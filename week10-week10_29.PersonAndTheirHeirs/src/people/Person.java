package people;

public class Person {
    // Declaring variables for Person
    private String name;
    private String address;

    // Constructor initializes variables for Person
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }


    public String toString() {
        return this.name + "\n" + "  " + this.address;
    }

}
