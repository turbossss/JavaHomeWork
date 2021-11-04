package com.pb.tkachenko.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println("Еда животного: "+animal.getFood()+", местонахождение: "+animal.getLocation());
    }
}
