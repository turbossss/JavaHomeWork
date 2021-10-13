package com.pb.tkachenko.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x;

        System.out.println("Write your number");
        x = scan.nextInt();

        if(x>=0 && x<=14) {
            System.out.println("Your number is in interval [0 14]");
        } else if(x>=15 && x<=35){
            System.out.println("Your number is in interval [15 35]");
        } else if(x>=36 && x<=50){
            System.out.println("Your number is in interval [36 50]");
        } else if(x>=51 && x<=100){
            System.out.println("Your number is in interval [51 100]");
        } else {
            System.out.println("Your number is out of interval list");
        }

    }
}
