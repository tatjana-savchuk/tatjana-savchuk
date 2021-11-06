package hw6;

public class Dog extends Animal{
    public Dog(String name) {
        super( name );
    }

    public Dog() {
        super( "Джек","корм для собак","будка" );
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав-гав");
    }

    @Override
    public String getFood() {
        return super.getFood();
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }
}

