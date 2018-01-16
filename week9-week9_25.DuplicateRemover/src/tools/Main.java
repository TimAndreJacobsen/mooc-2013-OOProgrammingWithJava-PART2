package tools;

public class Main {
    public static void main(String[] args) {
        // Test your class here

        PersonalDuplicateRemover PDR = new PersonalDuplicateRemover();

        PDR.add("yo");
        System.out.println(PDR.getNumberOfDetectedDuplicates());

        PDR.add("yo");
        System.out.println(PDR.getNumberOfDetectedDuplicates());
        System.out.println(PDR.getUniqueCharacterStrings());

        PDR.add("ASDF");
        System.out.println(PDR.getNumberOfDetectedDuplicates());
        System.out.println(PDR.getUniqueCharacterStrings());
    }
}
