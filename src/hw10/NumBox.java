package hw10;

public class NumBox <T extends Number>{
    private T [] array;
    private T size;

    public NumBox (int size) {
        this.array= (T[]) new Number[size];
    }

    public T getSize() {
        return size;
    }
    public void set (int index, T array) {
        this.array[index]= array;
    }

    public void setSize(T size) {
        this.size = size;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T get (int index) {
        return array [index];
    }
    public NumBox (T[] array) {
        this.array = array;
    }

    public double sum () {
        int sum = 0;
        for (T i: array) {
            if ( i== null) {
                sum += 0;
            }
            else sum+=i.doubleValue();
            }
           return sum;
        }

    public double average() {
        double sum = 0.0;

        for (T value : array) {
        sum += value.doubleValue();
        }

        return sum / array.length;
        }

    public T max(){
        T maX = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i].doubleValue() > maX.doubleValue()) {
                maX = array[i];
            }
        }
        return maX;
    }

    int add(int index, T num) {
        int[] nums = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int add = Integer.parseInt( String.valueOf( array[i] ) );
            nums[i] = add;
        }


        T[] array = this.array;
    //    public int length () {
            int i = 0;
            for (T c : this.array) {
                if (c == null) {
                    break;
                    }
                    i++;
                if (this.array.length == i) {
                    System.out.println( "Массив заполнен");
                    break;
                }
            }
            return i;
        }


    }




