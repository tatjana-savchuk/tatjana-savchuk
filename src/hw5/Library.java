package hw5;

import java.util.ArrayList;
import java.util.Arrays;

//Выводит на консоль сообщение
//        "Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.),
//        Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
//
//        Аналогичным образом перегрузить метод returnBook().
//        Должно быть 3 метода returnBook() которые выводит на консоль сообщения:
//        - "Петров В. В. вернул 3 книги"
//        - "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
//        - "Петров В. В. вернул книги: Приключения (Иванов И. И. 2000 г.),
//        Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
class Library {
    public static void main(String[] args) {

        Book[] bookArray = new Book[3];
        bookArray[0] = new Book( "Приключения", "Иванов И.И", "2010" );
        bookArray[1] = new Book( "Словарь", "Петров И.И", "2001" );
        bookArray[2] = new Book( "Энциклопедия", "Сидоров И.И", "2005" );

        for (int i = 0; i < bookArray.length; i++) {
            System.out.println( bookArray[i] );
        }

        Reader[] readerArray = new Reader[3];
        readerArray[0] = new Reader( "Петров В.В", "Marketing", "5 мая 1993",
                "001", "0509298531" );
        readerArray[1] = new Reader( "Старшов В.В", "economic", "1 января 1995", "002", "099707080" );
        readerArray[2] = new Reader( "Гусев В.В", "it", "3 марта 1990", "003", "09812345678" );

        for (int i = 0; i < readerArray.length; i++) {
            System.out.println( readerArray[i] );
        }

//        private static void printBooks (bookArray) {
//            System.out.println("Список книг:");
//            for (Book book : bookArray) {
//                System.out.println(book);
//            }
            readerArray [0].takeBook( "Приключения", "Словарь" );
        readerArray[1].takeBook( "Энциклопедия", "Сидоров" );
        readerArray[2].returnBook("Приключения");









    }
}