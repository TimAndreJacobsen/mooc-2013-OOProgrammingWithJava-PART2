package dictionary;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Test your dictionary here

        MultipleEntryDictionary dict = new PersonalMultipleEntryDictionary();
        dict.add("kuusi", "six");
        dict.add("kuusi", "spruce");

        dict.add("pii", "silicon");
        dict.add("pii", "pi");

        Set<String> def = dict.translate("kuusi");
        System.out.println(def);

        /*
        System.out.println(dict.translate("kuusi"));
        dict.remove("pii");
        System.out.println(dict.translate("pii"));
*/
    }
}
