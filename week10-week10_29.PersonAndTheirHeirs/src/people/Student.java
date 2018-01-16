package people;

public class Student extends Person {

    private int credits;

    public Student(String name, String address) {

        super(name, address);
        this.credits = credits;
    }


    public void study() {
        this.credits++;
    }

    public int credits() {
        return this.credits;
    }

    public String toString() {
        return super.toString() + "\n  credits " + this.credits;
    }


}
