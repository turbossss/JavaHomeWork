package com.pb.tkachenko.hw10;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();

        NumBox<Integer> integer = new NumBox<>(3);
        try {
            integer.add(random.nextInt());
            integer.add(random.nextInt());
            integer.add(random.nextInt());
            // FullArrayException
            //integer.add(3);
        } catch(FullArrayException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Сумма значений элементов Integer: "+integer.sum());
        System.out.println("Максимальное значение элементов Integer: "+integer.max());
        System.out.println("Кол-во элементов Integer: "+integer.length());
        System.out.println("Среднее значение элементов Integer: "+integer.average());

        NumBox<Float> floats = new NumBox<>(5);
        try {
            floats.add(random.nextFloat());
            floats.add(random.nextFloat());
            floats.add(random.nextFloat());
            floats.add(random.nextFloat());
        } catch (FullArrayException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Сумма значений элементов Float: "+floats.sum());
        System.out.println("Максимальное значение элементов Float: "+floats.max());
        System.out.println("Кол-во элементов Float: "+floats.length());
        System.out.println("Среднее значение элементов Float: "+floats.average());
    }
}
