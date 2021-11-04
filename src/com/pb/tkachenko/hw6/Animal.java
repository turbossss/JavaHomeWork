package com.pb.tkachenko.hw6;

public class Animal {
    private String name;
    private String food;
    private String location;

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void sleep(){
        System.out.println("Животное спит");
    }

    public void makeNoise(){
        System.out.println("Животное говорит");
    }

    public void eat(){
        System.out.println("Животное ест");
    }
}
