package com.pb.tkachenko.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.println("Write first number");
        operand1 = scan.nextInt();

        System.out.println("Write second number");
        operand2 = scan.nextInt();

        System.out.println("Write operation to do");
        sign = scan.next();

        switch(sign){
            case "+":
                System.out.println(operand1+operand2);
                break;
            case "-":
                System.out.println(operand1-operand2);
                break;
            case "*":
                System.out.println(operand1*operand2);
                break;
            case "/":
                if(operand2==0) System.out.println("Can't divide by zero");
                else System.out.println(operand1/operand2);
                break;
            default:
                System.out.println("Wrong operation");
        }
    }
}
