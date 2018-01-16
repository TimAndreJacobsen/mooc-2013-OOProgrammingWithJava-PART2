package people;

public class Teacher extends Person {
    // Declaring variables
    private int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euros/month";
    }


}
