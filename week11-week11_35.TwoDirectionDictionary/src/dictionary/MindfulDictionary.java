package dictionary;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {

    private Map<String, String> finToEng;
    private Map<String, String> engToFin;
    private File file;
    private Scanner scan;
    private FileWriter writer;

    public MindfulDictionary() {
        this.finToEng = new HashMap<String, String>();
        this.engToFin = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) {
        this.finToEng = new HashMap<String, String>();
        this.engToFin = new HashMap<String, String>();
        this.file = new File(file);

        try {
            this.scan = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public boolean load() {

        boolean load = false;

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] parts = line.split(":");   // the line is split at :

            finToEng.put(parts[0], parts[1]);
            engToFin.put(parts[1], parts[0]);

            load = true;
        }
        return true;
    }

    public boolean save() {

        try {
            this.writer = new FileWriter(this.file);

            for (String key : finToEng.keySet()) {
                String readBuffer = key + ":" + finToEng.get(key) + "\n";
                writer.write(readBuffer);
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void add(String word, String translation) {
        if (finToEng.get(word) != null) {
            return;
        } else if (engToFin.get(word) != null) {
            return;
        }
        finToEng.put(word, translation);
        engToFin.put(translation, word);
    }

    public String translate(String word) {
        if (finToEng.get(word) == null) {
            return engToFin.get(word);
        } else {
            return finToEng.get(word);
        }
    }

    public void remove(String word) {
        String trans = finToEng.get(word);
        finToEng.remove(word);
        engToFin.remove(trans);

        trans = engToFin.get(word);
        engToFin.remove(word);
        finToEng.remove(trans);
    }
}
