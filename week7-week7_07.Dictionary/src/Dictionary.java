import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary() {

        this.dictionary = new HashMap();
    }

    // Access HashMap pointer and return associated value
    public String translate(String word) {
        return this.dictionary.get(word);
    }


    // Add a new pointer + value to the HashMap
    public void add(String word, String translation) {
        dictionary.put(word, translation);
    }

    public int amountOfWords() {
        return dictionary.size();
    }
    // HashMap.keySet == a set {key, key, ...} of the keys/pointers
    public ArrayList<String> translationList() {
        ArrayList<String> keyAndValue = new ArrayList();

        for (String key : dictionary.keySet()) {
            keyAndValue.add(key + " = " + translate(key));
        }
        return keyAndValue;
    }
}
