package com.pb.tkachenko.hw7;

public class Tie extends  Clothes implements ManClothes{
    private String name;

    public Tie(String name, Size size, int price, String color) {
        super(size, price, color);
        this.name = name;
    }

    @Override
    public void dressMan(){
        System.out.println("Tie "+name+" "+color +", size:"+size+", cost:"+price+"$");
    }
}
