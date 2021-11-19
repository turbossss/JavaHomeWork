package com.pb.tkachenko.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Регистрация. \nВведите логин:");
        String login = scan.next();
        System.out.println("Введите пароль:");
        String pass = scan.next();
        System.out.println("Повторите пароль:");
        String passConfirm = scan.next();

        Auth auth = new Auth();
        try{
            auth.signUp(login, pass, passConfirm);
            System.out.println("\nАвторизация. \nВведите логин:");
            login = scan.next();
            System.out.println("Введите пароль:");
            pass = scan.next();
            auth.signIn(login, pass);
        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
        }
    }
}
