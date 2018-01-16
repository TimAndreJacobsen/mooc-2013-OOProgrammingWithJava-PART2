package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // test your code here

        File file = new File("src/wordList.txt");
        // all words are in file src/wordList.txt
        WordInspection wordInsp = new WordInspection(file);

        System.out.println("WordCount");
        System.out.println(wordInsp.wordCount());

        System.out.println("ZZZZZZZZzzzzzz");
        System.out.println(wordInsp.wordsContainingZ());

        System.out.println("palindrome");
        System.out.println(wordInsp.palindromes());

        System.out.println("Vowel Time");
        System.out.println(wordInsp.wordsWhichContainAllVowels());

        System.out.println("L's");
        System.out.println(wordInsp.wordsEndingInL());

    }
}
