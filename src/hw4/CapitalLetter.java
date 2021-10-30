package hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("ВВедіть речення:");
        String line = scan.nextLine();
        System.out.println();
        System.out.println("Верхній регістр:");
        printCapitalized( line );

        scan.close();
    }

    static void printCapitalized( String line ) {
        char ch;
        char prevCh;
        int i;
        prevCh = '.';

        for ( i = 0;  i < line.length();  i++ ) {
            ch = line.charAt(i);
            if ( Character.isLetter(ch)  &&  ! Character.isLetter(prevCh) )
                System.out.print( Character.toUpperCase(ch) );
            else
                System.out.print( ch );
            prevCh = ch;

        }
        System.out.println();
    }

}
