package com.pb.tkachenko.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class CapitalLetter {
    static String makeUpper(String text){
        String[] textWords = text.split(" ");
        String result="";
        for(int i=0;i<textWords.length;i++){
            //
            result+=textWords[i].substring(0,1).toUpperCase() + textWords[i].substring(1)+" ";
        }
        result=result.trim();
        return result;
    }

    static void print(String text){
        System.out.println(text);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        print(makeUpper(text));
    }
}
