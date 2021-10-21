package com.pb.tkachenko.hw3;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int number = random.nextInt(101);
        int counter=0;
        int x;
        String lineX;

        while(true) {
            System.out.println("Make a guess");
            if (scan.hasNextInt()) {
                x = scan.nextInt();
                counter++;
                if (x < number) {
                    System.out.println("Guessed number is bigger. Make a guess one more time");
                } else if (x > number) {
                    System.out.println("Guessed number is smaller. Make a guess one more time");
                } else {
                    System.out.println("Well done. Your attempts count is " + counter);
                    break;
                }

            } else {
                if(scan.hasNextLine()){
                    lineX = scan.next();
                    if(lineX.equals("exit")){
                        System.out.println("Thanks for a game!");
                        break;
                    } else {
                        System.out.println("I don't know this command");
                    }
                } else {
                    System.out.println("I don't know this command");
                }
            }
        }
    }
}
