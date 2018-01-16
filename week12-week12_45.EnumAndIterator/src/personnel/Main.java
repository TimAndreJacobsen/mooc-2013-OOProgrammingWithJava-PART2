package personnel;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Employees employees = new Employees();
        Person h = new Person("Arto", Education.D);
        employees.add(h);
        employees.print(Education.D);
    }
}
