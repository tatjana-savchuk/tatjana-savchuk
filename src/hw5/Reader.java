package hw5;

public class Reader {

    private String name;
    private String numberTicket;
    private String fac;
    private String dateBirthday;
    private String phone;
    int bookCount =0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(String numberTicket) {
        this.numberTicket = numberTicket;
    }

    public String getFac() {
        return fac;
    }

    public void setFac(String fac) {
        this.fac = fac;
    }

    public String getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public Reader (String name, String fac, String dateBirthday, String  numberTicket, String phone) {
            this.name = name;
            this.fac = fac;
            this.dateBirthday = dateBirthday;
            this.numberTicket = numberTicket;
            this.phone = phone;

        }


    public void takeBook(String... books) {
        System.out.println(this.name + " взял следующие книги:");
        Book[] bookArray = new Book[3];
        bookArray[0] = new Book( "Приключения", "Иванов И.И", "2010" );
        bookArray[1] = new Book( "Словарь", "Петров И.И", "2001" );
        bookArray[2] = new Book( "Энциклопедия", "Сидоров И.И", "2005" );
        for (Book book : bookArray) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.name + " взял следующие книги:");
        for (Book book : books) {
            System.out.println(book.getNameBook() + ", автор - " + book.getAvtor());
        }
        System.out.println();
    }


    public void returnBook(String... books) {
        System.out.println(this.name + " вернул следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

//    public void returnBook(Book... books) {
//        System.out.println(this.name + " вернул следующие книги:");
//        for (Book book : books) {
//            System.out.println( book.getNameBook() + ", автор - " + book.getAvtor() );
//        }
//    }

    @Override
    public String toString() {
        return this.name + " numberTicket -" + this.numberTicket + "fac ,"+ this.fac +" dateBirthday ,"+ this.dateBirthday +" , phone +38"+ this.phone;
    }


    public static void main(String[] args) {
        Reader[] readerArray = new Reader[3];
        readerArray[0] = new Reader("Петров В.В","Marketing","5 мая 1993",
                "001","0509298531");
        readerArray[1] = new Reader("Старшов В.В","economic","1 января 1995","002","099707080");
        readerArray[2] = new Reader("Гусев В.В","it","3 марта 1990","003","09812345678");

        for (int i = 0; i < readerArray.length; i++) {
            System.out.println( readerArray[i] );
        }



    }

    private class ToStringBuilder {
        public ToStringBuilder(Reader reader) {
        }

        public ToStringBuilder append(String name, String nanumberTicketme1  ) {
            return null;
        }





    }

    }
