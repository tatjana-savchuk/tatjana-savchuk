package hw7;

public class Tshirt extends Clothes implements ManClothes,WomenClothes {


    public Tshirt(String product, String Size, int price, String color) {
        super( product, Size, price, color );
    }

//    @Override
//    public void dressMan() {
//        System.out.println("");
//
//    }



    @Override
    public void dressWomen() {

    }

    @Override
    public void dressMan() {

    }
}
