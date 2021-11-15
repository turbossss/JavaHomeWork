package com.pb.tkachenko.hw7;

public class Skirt extends Clothes implements WomenClothes{
    private String name;

    public Skirt(String name, Size size, int price, String color) {
        super(size, price, color);
        this.name = name;
    }

    @Override
    public void dressWomen(){
        System.out.println("Skirt "+name+" "+color +", size:"+size+", cost:"+price+"$");
    }
}
