package com.pb.tkachenko.hw6;

import java.util.Objects;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, String food, String location, String breed) {
        super(name, food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise(){
        System.out.println(this.getName() + " гавкает");
    }

    @Override
    public void eat(){
        System.out.println(this.getName() + " ест");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(super.getName(), dog.getName()) && Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName(), breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
