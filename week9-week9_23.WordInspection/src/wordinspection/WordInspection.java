package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private File file; // File being passed in
    private List<String> fileString; // String that stores the entire file as a string

    // Constructor
    public WordInspection(File fileAtStart) throws FileNotFoundException {
        this.file = fileAtStart;
        this.fileString = readFile(); // calls a method that builds a string from the file

    }

    private List<String> readFile() {
        List<String> a = new ArrayList();
        try {
            Scanner reader = new Scanner(this.file, "UTF-8");
            while (reader.hasNextLine()) {
                a.add(reader.nextLine());
            }
            return a;
        } catch (FileNotFoundException e) {
            return a;
        }
    }


    public int wordCount() throws FileNotFoundException {
        Scanner scan = new Scanner(this.file, "UTF-8");
        List<String> str = this.fileString;

        //String[] wordArray = str.trim().split("\\s+");
        //int wordCount = wordArray.length;
        //return wordCount;

        return str.size();

    }

    public List<String> wordsContainingZ() throws FileNotFoundException {
        List<String> str = this.fileString;
        List<String> wordsWithZ = new ArrayList<String>();

        for (String s : str) {
            if (s.contains("Z") || s.contains("z")){
                wordsWithZ.add(s);
            }
        }
        return wordsWithZ;
    }

    private boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1) // if length is 0 or 1, its a palindrome. It's also the base case.
            return true;

        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1, s.length()-1)); // Check if first and last char are equal.
                                                               // Then sends itself a substring without the equal chars
        return false;
    }

    public List<String> palindromes() throws FileNotFoundException {
        List<String> str = this.fileString;
        List<String> palindromeList = new ArrayList<String>();

        for (String s : str) {
            if (isPalindrome(s)){
                palindromeList.add(s);
            }
        }
        return palindromeList;
    }

    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        List<String> wordsWithVowels = new ArrayList<String>();
        List<String> str = this.fileString;

        for (String s : str) {
            if (s.contains("a") && s.contains("e") && s.contains("i") && s.contains("o")
                    && s.contains("u") && s.contains("y") && s.contains("ä") && s.contains("ö")) {
                wordsWithVowels.add(s);
            }
        }
        return wordsWithVowels;
    }

    public List<String> wordsEndingInL() throws FileNotFoundException {
        List<String> str = this.fileString;
        List<String> wordsEndL = new ArrayList<String>();

        for (String s : str) {
            if (s.length() > 0) {
                String lastChar = "" + s.charAt(s.length()-1);

                if ( lastChar.equals("l") ){
                wordsEndL.add(s);
                }
            }
        }
        return wordsEndL;
    }


}