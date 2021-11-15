package hw7;

public  abstract class Clothes {
    private String product;
    private String Size;
    private int price;
    private String color;


    public Clothes(String product, int price, String color) {

    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Clothes (String product, String Size, int price, String color) {
        this.product=product;
        this.Size= Size;
        this.price = price;
        this.color = color;
    }
    public Clothes full(){
        System.out.println( "Товар: " + product +" Размер: " + Size + " Цена:"+ price + "$"+ " Цвет:"+ color);
        return null;
    }

    public String getSize() {
        return this.Size;
    }

    public void setSize(String size) {
        this.Size = size;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
