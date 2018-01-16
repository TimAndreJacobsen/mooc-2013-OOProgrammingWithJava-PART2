package tools;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private int duplicatesRemoved = 0;
    private Set<String> strings = new HashSet<String>();


    @Override
    public void add(String characterString) {
        if (strings.contains(characterString)) {
            duplicatesRemoved++;
        } else {
            strings.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicatesRemoved;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return strings;
    }

    @Override
    public void empty() {
        strings.clear();
        duplicatesRemoved = 0;
    }
}
