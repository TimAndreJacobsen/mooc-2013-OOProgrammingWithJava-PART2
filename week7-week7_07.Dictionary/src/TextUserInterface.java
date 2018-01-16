import java.util.Scanner;

public class TextUserInterface {

    private Dictionary dictionary;
    private Scanner scan;

    public TextUserInterface(Scanner reader, Dictionary dictionaryPassed) {
        this.scan = reader;
        this.dictionary = dictionaryPassed;
    }

    public void start() {
        System.out.print("Statements:\n" +
                "quit - quit the text user interface");
        System.out.print("\n\nStatement:");

        while (true) {
            String command = scan.nextLine();
            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (command.equals("add")) {
                System.out.print("In Finnish: ");
                String key = scan.nextLine();
                System.out.println();
                System.out.print("Translation: ");
                String value = scan.nextLine();
                System.out.println();
                dictionary.add(key, value);

            } else if (command.equals("translate")) {
                System.out.print("give a word:");
                String key = scan.nextLine();
                System.out.println(dictionary.translate(key));

            } else {
                System.out.println("Unknown Statement");
            }
        }
    }




}

