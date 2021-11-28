package hw10;

public class Main extends NumBox {
    public Main(int size) {
        super( size );
    }

    public Main(Number[] array) {
        super( array );
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        NumBox<Integer> num = new NumBox<>(intArray);
        Integer num2 = (Integer) num.get( 2 ) ;
        System.out.println("Среднее значения  " + num.average());
        System.out.println("MAX: " + num.max());
        System.out.println("Сумма элементов:" + num.sum());
        num.set( 0, 2 );
        num.set( 3,5 );

        //вариант 2
        NumBox<Integer> numBox1=  new NumBox<>(5  );
        numBox1.add( 0,2 );
        numBox1.add( 1,1 );
        numBox1.add( 2,3 );
        numBox1.add( 3,5 );
        numBox1.add( 4,7 );

        Integer numBox2 = numBox1.get( 0 );
        Integer numBox3 = numBox1.get( 1 );





    }
}
