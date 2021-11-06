package hw6;

import java.util.Objects;

public class Cat extends Animal {

    public Cat() {
        super( "Вася","корм для кошек","домик" );
    }

    @Override
    public void makeNoise () {
        System.out.println( getName()+ "Говорит Мяу");
    }
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Cat{" + "зовут" + getName() + "питается " +getFood()+ " ,живет в"
                + getLocation();
    }

    @Override
    public  boolean equals(Object o) {
        if (this==o) return true;
        if (o==null||getClass() !=o.getClass()) return false;
        Cat catVasya = (Cat) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getFood(),getLocation());}
    }





