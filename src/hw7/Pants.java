package hw7;

public class Pants extends Clothes implements WomenClothes, ManClothes {


    public Pants(String product, String Size, int price, String color) {
        super( product, Size, price, color );
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWomen() {

    }
}
