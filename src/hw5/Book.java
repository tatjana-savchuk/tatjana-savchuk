package hw5;

public class Book {
    public Book(String nameBook, String avtor, String yearOfPublishing) {
        this.nameBook = nameBook;
        this.avtor = avtor;
        this.yearOfPublishing = yearOfPublishing;

    }
   private String nameBook;
    private String avtor;
    private String yearOfPublishing;

//    public void Book (String nameBook, String avtor, String yearOfPublishing) {
//        this.nameBook = nameBook;
//        this.avtor = avtor;
//        this.yearOfPublishing = yearOfPublishing;
//    }

    public String getNameBook() {
        return nameBook;
    }

    @Override
    public String toString() {
        return " "+ this.nameBook + " , " + this.avtor + " "+ this.yearOfPublishing;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(String yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public static void main(String[] args) {

        Book[] bookArray = new Book[3];
        //  Reader[] readerArray = new Reader[3];
        bookArray[0] = new Book( "Приключения", "Иванов И.И", "2010" );
        bookArray[1] = new Book( "Словарь", "Петров И.И", "2001" );
        bookArray[2] = new Book( "Энциклопедия", "Сидоров И.И", "2005" );


        //  String getInfo () {
        for (Book book : bookArray) {
            System.out.println( book );
        }

    }

    private class ToStringBuilder {
        public ToStringBuilder(Book book) {
        }

        public ToStringBuilder append(String nameBook, String nameBook1) {
            return null;
        }
    }
}


