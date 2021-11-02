package hw5;

public class Book {
    public Book(String nameBook, String avtor, String yearOfPublishing) {

    }

    public static String main(String[] args) {
        String nameBook;
        String avtor;
        String yearOfPublishing;
        Book[] bookArray = new Book[3];
      //  Reader[] readerArray = new Reader[3];
        bookArray[0] = new Book( "Приключения", "Иванов И.И", "2010" );
        bookArray[1] = new Book( "Словарь", "Петров И.И", "2001" );
        bookArray[2] = new Book( "Энциклопедия", "Сидоров И.И", "2005" );

        String getInfo () {
            for (Book book : bookArray) {
                System.out.println( book );
            }

        }




//        String book1 = "Приключения";
//        String book2 = "Словарь";
//        String book3 = "Энциклопедия";
//        String array[] = new String[3];
//        String[] books = {book1, book2, book3};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println( books[i] );
//        }
//        String getInfo(array;) {
//            return"[Книги: "+books + ",Автор"+ ","+yearOfPublishing+"]";
//
//        }


//    public String getNameBook() {
//
//        return nameBook;
//    }
//
//
//    public void setNameBook(String nameBook) {
//        this.nameBook = nameBook;
//    }
//
//    public String getAvtor() {
//        return avtor;
//    }
//
//    public void setAvtor(String avtor) {
//        this.avtor = avtor;
//    }
//
//    public String getYearOfPublishing() {
//
//        return yearOfPublishing;
//    }
//
//    public void setYearOfPublishing(String yearOfPublishing) {
//        this.yearOfPublishing = yearOfPublishing;
//    }
//
//
//    public static void main(String[] args) {
//        Book book1 = new Book();
//        Book book2 = new Book();
//        Book book3 = new Book();
//        book1.nameBook = "Приключения";
//        book2.nameBook = "Словарь";
//        book3.nameBook = "Энциклопедия";
//        Book avtor1 = new Book();
//        Book avtor2 = new Book();
//        Book avtor3 = new Book();
//        avtor1.avtor = "Иванов И.И";
//        avtor2.avtor = "Петров И.И";
//        avtor3.avtor = "Сидоров И.И";
//        Book yearOfPublishing1 = new Book();
//        Book yearOfPublishing2 = new Book();
//        Book yearOfPublishing3 = new Book();
//        yearOfPublishing1.yearOfPublishing = "2010";
//        yearOfPublishing2.yearOfPublishing = "2001";
//        yearOfPublishing3.yearOfPublishing = "2005";
//
//
//        System.out.println( book1.getNameBook() + " " + avtor1.getAvtor() + " " + yearOfPublishing1.getYearOfPublishing() );
//        System.out.println( book2.getNameBook() + " " + avtor2.getAvtor() + " " + yearOfPublishing2.getYearOfPublishing() );
//        System.out.println( book3.getNameBook() + " " + avtor3.getAvtor() + " " + yearOfPublishing3.getYearOfPublishing() );
//
//
//    }
//
//    public void takeBook (String reader, String book , String avtor1, String yearOfPublishing1)
//                         // String book2,String avtor2,String yearOfPublishing2,String book3,String avtor3,String yearOfPublishing3)
//    {
//        System.out.println(reader+ "взял книги"+book+ avtor1 +yearOfPublishing1+"г");
//    }


    }
}
