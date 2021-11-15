package hw7;


public class Atelier extends Clothes {
    public Atelier(String product, String Size, int price, String color) {
        super( product, Size, price, color );
    }
    public Size size;


    public static void main(String[] args) {

        Tshirt tshirt = new Tshirt( "Футболка", "XXS", 50,"Черный" );
        Pants pants = new Pants( "Штаны","M", 80, "Белые" );
        Skirt skirt = new Skirt( "Юбка","S", 70, "Зеленая");
        Tie tie = new Tie( "Галстук","L", 30, "Синий");
        Clothes[] clothes = new Clothes[]{pants.full(), tie.full(), tshirt.full(), skirt.full()};
        pants.dressMan();

        




        System.out.println();

            System.out.println( skirt instanceof ManClothes );


            System.out.println();
            System.out.println( "Женская одежда" );
            System.out.println();


        }
    public static void dressMan(Clothes[] clothes) {
        {
            for (Clothes clothe : clothes
            ) {
                if (clothe instanceof ManClothes) {
                    System.out.println( "Мужская линейка" );

                }
            }
        }

    }



    }


