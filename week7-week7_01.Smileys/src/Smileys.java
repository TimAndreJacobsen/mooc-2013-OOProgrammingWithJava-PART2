
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");

        printWithSmileys("method");
    }

    private static void printWithSmileys(String characterString) {
        //Check if str.length is odd, if so add a space and make it even
        if (characterString.length() % 2 != 0){  // can factor this out as a helper method
            characterString = characterString + " ";
        }
        printRow(characterString.length()); // print top row
        System.out.println(":) " + characterString + " :)"); // prints the input string with ":)" on both sides
        printRow(characterString.length()); // print bottom row
    }

    /*
    Prints a row of ":)" that is of correct length
     */
    public static void printRow(int length) {
        // sets min length(equal to the beginning and end of the middle row.
        int rowMinLength = 6;
        // add str.length and divides by 2, since we are printing 2 chars per smiley.
        length = (length + rowMinLength)/2;

        // for i loop to generate the smileys
        for (int i = 0; i < length ; i++) {
            System.out.print(":)");
        }
        System.out.println(); //linebreak after printing is complete
    }

}
