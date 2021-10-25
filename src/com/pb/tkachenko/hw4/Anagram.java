package com.pb.tkachenko.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    // remove punctuation marks from sentences
    static String removePunctuation(String[] punctuationMarks, String text){
        for(String mark: punctuationMarks){
            text = text.replace(mark, "");
        }
        return text;
    }

    // compare two strings
    static boolean sortCompare(String text, String compareToText){
        char[] charsText = text.toLowerCase().toCharArray();
        char[] charsCompareToText = compareToText.toLowerCase().toCharArray();
        Arrays.sort(charsText);
        Arrays.sort(charsCompareToText);
        text = String.valueOf(charsText);
        compareToText = String.valueOf(charsCompareToText);

        if(text.compareTo(compareToText)==0) return true;
        else return false;

    }

    public static void main(String[] args){
        String[] punctuationMarks = { ".", ",", "-", ":", "!", "?", " " };
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your sentence:");
        String text = scan.nextLine();
        System.out.println("Enter your next sentence:");
        String compareToText = scan.nextLine();

        text = removePunctuation(punctuationMarks, text);
        compareToText = removePunctuation(punctuationMarks, compareToText);

        if(sortCompare(text, compareToText)){
            System.out.println("Your sentences are anagrams");
        } else {
            System.out.println("Your sentences are not anagrams");
        }
    }

}
