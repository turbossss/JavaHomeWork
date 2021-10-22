package com.pb.tkachenko.hw3;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int arraySum=0;
        int positiveCount=0;
        int temp;
        String sortedArray="";

        // get array
        for(int i=0;i<array.length;i++){
            System.out.println("Set "+(i+1)+" element of array");
            array[i]=scan.nextInt();
        }

        // get positive numbers and array sum
        for(int i=0;i<array.length;i++) {
            if(array[i]>0) {
                positiveCount++;
            }
            arraySum+=array[i];
        }

        // bubble sorting
        for(int i=0;i<array.length-1;i++){
            for(int y=0;y<array.length-i-1;y++){
                if(array[y+1]<array[y]){
                    temp = array[y+1];
                    array[y+1] = array[y];
                    array[y] = temp;
                }
            }
        }

        for(int i=0;i<array.length;i++){
            sortedArray+=array[i]+" ";
        }

        System.out.println(sortedArray);
        System.out.println("Positive numbers " + positiveCount);
        System.out.println("Array sum " + arraySum);
    }
}
