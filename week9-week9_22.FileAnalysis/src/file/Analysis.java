package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {

    private File fileName;
    private Scanner scan = null;

    public Analysis(File file) throws Exception {
        this.fileName = file;

    }


    public int lines() throws FileNotFoundException {

        File f = this.fileName;
        Scanner scan = new Scanner(f);
        int count = 0;

        while (scan.hasNextLine()) {
            count++;
            scan.nextLine();
        }
        scan.close();
        return count;
    }

    public int characters() throws FileNotFoundException {
        File f = this.fileName;
        Scanner sc = new Scanner(f);
        int charCount = 0;
        String line = "";

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            charCount += line.length();
            charCount ++; // To count the linebreak
            System.out.println(charCount);
        }

        return charCount;
    }



}
