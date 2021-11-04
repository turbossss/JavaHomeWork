package com.pb.tkachenko.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private int maneLength;

    public Horse(String name, String food, String location, int maneLength) {
        super(name, food, location);
        this.maneLength = maneLength;
    }

    @Override
    public void makeNoise(){
        System.out.println(this.getName() + " ржет");
    }

    @Override
    public void eat(){
        System.out.println(this.getName() + " ест");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return maneLength == horse.maneLength && Objects.equals(super.getName(), horse.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(maneLength, getName());
    }

    @Override
    public String toString() {
        return "Horse{" +
                "maneLength=" + maneLength +
                ", name='" + getName() + '\'' +
                '}';
    }
}
