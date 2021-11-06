package hw6;

public class Horse extends Animal{
    public Horse(String name) {
        super( name );
    }
    public Horse() {
        super( "Скакун","сено","стайня" );
    }
    @Override
    public void eat() {
        System.out.println("Овёс");
    }

    @Override
    public String getFood() {
        return super.getFood();
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }
    @Override
    public void makeNoise () {
        System.out.println( getName()+ "Говорит Иго-го");
    }
}
