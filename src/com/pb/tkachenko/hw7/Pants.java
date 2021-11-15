package com.pb.tkachenko.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes{

    private String name;

    public Pants(String name, Size size, int price, String color) {
        super(size, price, color);
        this.name = name;
    }

    @Override
    public void dressMan(){
        System.out.println("Men's pants "+name+" "+color +", size:"+size+", cost:"+price+"$");
    }

    @Override
    public void dressWomen(){
        System.out.println("Women's pants "+name+" "+color +", size:"+size+", cost:"+price+"$");
    }
}
