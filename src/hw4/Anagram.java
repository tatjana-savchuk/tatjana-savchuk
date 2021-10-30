package hw4;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println( "ВВедіть речення1:" );
        String s1 = scan.nextLine();
        System.out.println( "ВВедіть речення2:" );
        String s2 = scan.nextLine();
        isAnagram( s1,s2);
    };

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s2.length(); i++) {

            if (!s1.contains( "" + s2.charAt( i ) )) {
                System.out.println( "На жаль, у Вас не анаграма" );
                return false;
            }

            s1 = s1.replaceFirst( "" + s1.charAt( i ), "" );
            s2 = s2.replaceFirst( "" + s2.charAt( i ), "" );
        }
        System.out.println( "Юхху Ви написали анаграму" );
        return true;
    }
}


