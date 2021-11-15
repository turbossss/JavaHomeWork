package com.pb.tkachenko.hw7;

public class Atelier {
    public static void main(String[] args) {
        Tshirt tShirt = new Tshirt("Polo",Size.L,33,"Blue");
        Pants pants = new Pants("Armani",Size.XS, 20, "Orange");
        Tie tie = new Tie("Regular", Size.M, 40, "Pink");
        Skirt skirt = new Skirt("New Balance", Size.XS, 100, "Red");
        Clothes skirt1 = new Skirt("Puma", Size.M, 110, "Black");

        Clothes[] clothes = new Clothes[] {tShirt, pants, tie, skirt, skirt1};
        dressMan(clothes);
        System.out.println("\n");
        dressWomen(clothes);
    }

   public static void dressMan(Clothes[] clothes){
        for(Clothes cloth: clothes) {
            if(cloth instanceof Tie){
                Tie tie = (Tie) cloth;
                tie.dressMan();
            } else if(cloth instanceof Tshirt){
                Tshirt tshirt = (Tshirt) cloth;
                tshirt.dressMan();
            } else if(cloth instanceof Pants){
                Pants pants = (Pants) cloth;
                pants.dressMan();
            }
        }
    }

    public static void dressWomen(Clothes[] clothes){
        for(Clothes cloth: clothes) {
            if(cloth instanceof Skirt){
                Skirt skirt = (Skirt) cloth;
                skirt.dressWomen();
            } else if(cloth instanceof Tshirt){
                Tshirt tshirt = (Tshirt) cloth;
                tshirt.dressWomen();
            } else if(cloth instanceof Pants){
                Pants pants = (Pants) cloth;
                pants.dressWomen();
            }
        }
    }
}
