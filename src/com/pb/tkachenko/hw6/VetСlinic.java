package com.pb.tkachenko.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception{

        Dog dog = new Dog("Малыш", "корм", "будка", "дворняжка");
        Cat cat = new Cat(3,"Васька", "мясо", "дом бабушки");
        Horse horse = new Horse("Эльбрус","сено","стойня",120);

        Animal[] amimalArray = new Animal[] {dog, cat, horse};

        for(Animal animal: amimalArray) {
            Class veterinarianClazz = Class.forName("com.pb.tkachenko.hw6.Veterinarian");
            Constructor constr = veterinarianClazz.getConstructor(new Class[]{});
            Object obj = constr.newInstance();
            ((Veterinarian) obj).treatAnimal(animal);
        }
    }
}
