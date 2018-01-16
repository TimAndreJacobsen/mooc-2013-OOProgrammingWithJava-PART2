import java.util.Scanner;


public class Reader {

    private Scanner reader;


    public Reader() {
        this.reader = new Scanner(System.in);
    }

    public String readString() {
        return this.reader.nextLine();
    }

    public int readInteger() {
        int x = 0;
        do {
            try {
                x = Integer.parseInt(this.reader.nextLine());
            } catch (Exception e) {
                System.out.println("not an int.");
            }
            break;
        } while (true);
        return x;
    }

    public void command() {

    }

}
