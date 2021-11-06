package hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class VetClinic extends Animal {


    public VetClinic(String name, String food, String location) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        super( name, food, location );
    }
    Animal cat = new Cat();
    Animal horse = new Horse();
    Animal dog = new Dog();
    Animal [] animals = {cat,horse,dog};
    Class c = Class.forName("hw6.Veterinarian" );
    Constructor<Object> constr = c.getConstructor( new Class[]{String.class} );
    Object obj = constr.newInstance( "Ветеринар" );
    if (obj instanceof Veterinarian) {
        for (Animal animal : animals) {
            System.out.println(Veterinarian.treatAnimal());
        }
    }
     System.out.println(cat.equals(dog));
}
