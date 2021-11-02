package hw5;

public class Reader {
    String name;
    int numberTicket;
    String fac;
    String dateBirthday;
    String phone;

    public static void main(String[] args) {

        String reader1 = "Петров В.В";
        String reader2 = "Старшов В.В";
        String reader3 = "Гусев В.В";

        String array[] = new String[3];
        String[] readers = {reader1, reader2, reader3};
        for (int i = 0; i < array.length; i++) {
            System.out.println( readers[i] );
        }


//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getNumberTicket() {
//        return numberTicket;
//    }
//
//    public void setNumberTicket(int numberTicket) {
//        this.numberTicket = numberTicket;
//    }
//
//    public String getFac() {
//        return fac;
//    }
//
//    public void setFac(String fac) {
//        this.fac = fac;
//    }
//
//    public String getDateBirthday() {
//        return dateBirthday;
//    }
//
//    public void setDateBirthday(String dateBirthday) {
//        this.dateBirthday = dateBirthday;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public static void main(String[] args) {
//        Reader reader1 = new Reader();
//        Reader reader2 = new Reader();
//        Reader reader3 = new Reader();
//        reader1.name = "Петров В.В";
//        reader2.name = "Старшов В.В";
//        reader3.name = "Гусев В.В";
//        reader1.fac = "merketing";
//        reader2.fac = "economic";
//        reader1.dateBirthday = "5 мая 1993";
//        reader2.dateBirthday = "1 января 1995";
//        reader1.numberTicket = 58965;
//        reader2.numberTicket = 74156;
//        reader1.phone = "+380509298531";
//        reader2.phone = "+380997080500";
//        System.out.println( reader1.getName());
//        reader1.takeBook();
//
//
//
//    }
//    public void takeBook ()
//    {
//        System.out.println( "взял 3 книги");
//    }

    }
}