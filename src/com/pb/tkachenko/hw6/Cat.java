package com.pb.tkachenko.hw6;

import java.util.Objects;

public class Cat extends Animal{
    private int livesNumber;


    public Cat(int livesNumber, String name, String food, String location) {
        super(name,food,location);
        this.livesNumber = livesNumber;
    }

    @Override
    public void makeNoise(){
        System.out.println(this.getName() + " мяучит");
    }

    @Override
    public void eat(){
        System.out.println(this.getName() + " ест");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(super.getName(), cat.getName()) && livesNumber==cat.livesNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getName(), livesNumber);
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + super.getName() + '\'' +
                ", livesNumber='" + livesNumber + '\'' +
                '}';
    }
}
