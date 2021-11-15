package com.pb.tkachenko.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    private String name;

    public Tshirt(String name, Size size, int price, String color) {
        super(size, price, color);
        this.name = name;
    }

    @Override
    public void dressMan(){
        System.out.println("Men's tshirt "+name+" "+color +", size:"+size.getDescription()+", "+size.getEuroSize()+", cost:"+price+"$");
    }

    @Override
    public void dressWomen(){
        System.out.println("Women's tshirt "+name+" "+color +", size:"+size+", cost:"+price+"$");
    }
}
