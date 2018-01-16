import java.io.File;
import java.util.Scanner;

public class Printer {

    private String textFile;


    public Printer(String fileName) throws Exception {

        this.textFile = fileName;

    }

    public void printLinesWhichContain(String word) throws Exception {
        File fileName = new File(this.textFile);
        Scanner scan = new Scanner(fileName);

        while (scan.hasNextLine()) {
            String readBuffer = scan.nextLine();

            if (readBuffer.contains(word)) {
                System.out.println(readBuffer);
            }
        }

    }
}
