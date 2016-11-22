package com.codeup.java;
import java.util.Scanner;

/**
 * Created by Moravia on 9/14/16.
 */
public class PigLatin {
    public static void main(String[] args) {
        String word;
        System.out.println("Welcome to PigLatin");
        System.out.println("Please input a word you want to translate");
        Scanner scan = new Scanner(System.in);
        word = scan.nextLine();
        word = word.toLowerCase();
        word = translate(word);

        System.out.println("Your translation is below:");
        System.out.println(word);

    }

    private static int findVowel(String word) {
        for (int i = 0; i < word.length(); i += 1) {
            // get the character of the letter at that index
            char letter = word.toLowerCase().charAt(i);

            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter =='u') {
                return i;
            }
        }
        return -1;
    }

    private static String translate(String word) {
        // Declare local variables
        String translatedWord;

        // get index of first vowel
        int firstVowelIndex = findVowel(word);

        if(firstVowelIndex == 0) {
            translatedWord = word + "way";
        } else if(firstVowelIndex == -1) {
            translatedWord = "{untranslatable} " + word;
        } else {
            String lastPart = word.substring(0, firstVowelIndex);
            String firstPart = word.substring(firstVowelIndex);
            translatedWord = firstPart + lastPart + "ay";
        }

        return translatedWord;
    }
}
