package dictionary;
import java.util.*;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> dictionary = new HashMap<String, Set<String>>();


    @Override
    public void add(String word, String entry) {

        if (dictionary.get(word) == null){
            dictionary.put(word, new HashSet<String>());

            dictionary.get(word).add(entry);

        }
        dictionary.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        Set<String> definitions = dictionary.get(word);
        return definitions;
    }

    @Override
    public void remove(String word) {
        dictionary.remove(word);
    }
}
