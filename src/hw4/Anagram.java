package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println( "ВВедіть речення1:" );
        String s1 = scan.nextLine();
        System.out.println( "ВВедіть речення2:" );
        String s2 = scan.nextLine();
        char[] chArr1 = s1.toUpperCase().toCharArray();
        char[] chArr2 = s2.toUpperCase().toCharArray();
        //сортировка

        for (int i = chArr1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (chArr1[j] > chArr1[j + 1]) {
                    char tmp = chArr1[j];
                    chArr1[j] = chArr1[j + 1];
                    chArr1[j + 1] = tmp;
                }
            }
        }
        for (int i = chArr2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (chArr2[j] > chArr2[j + 1]) {
                    char tmp = chArr2[j];
                    chArr2[j] = chArr2[j + 1];
                    chArr2[j + 1] = tmp;
                }
            }
        }
        //возвращаем отсортированный массив в строку
        String lettersOnly = String.valueOf( chArr1 );
        String lettersOnly2 = String.valueOf( chArr2 );

       lettersOnly = lettersOnly.replaceAll( "[^a-zA-Z ]", "" );
        lettersOnly2 = lettersOnly2.replaceAll( "[^a-zA-Z ]", "" );
        System.out.println( lettersOnly );
        System.out.println( lettersOnly2 );
        //сравниваем строки и выводим на печать: true/false
        System.out.println( lettersOnly.equalsIgnoreCase( lettersOnly2 ) );
    }
}
//"[^a-zA-Z ]"
//[^a-zA-Z0-9:;.?! ]
//        isAnagram( s1, s2 );
//        System.out.println( isAnagram( s1, s2 ) );
//
//    }
//
//    public static boolean isAnagram(String s1, String s2) {
//        char[] L1 = s1.replaceAll( "[^\\da-zA-Za-яёА-ЯЁ]", "" ).toCharArray();
//        char[] L2 = s2.replaceAll( "[^\\da-zA-Za-яёА-ЯЁ]", "" ).toCharArray();
//        Arrays.sort( L1 );
//        Arrays.sort( L2 );
//        return Arrays.equals( L1, L2 );
//    }
//}
//новое
//[^\da-zA-Za-яёА-ЯЁ
//    public static boolean isAnagr(String s1, String s2) {
//        if (s1.length() != s2.length()) {
//            return false;
//        }
//
//        for (int i = 0; i < s2.length(); i++) {
//
//            if (!s1.contains( "" + s2.charAt( i ) )) {
//                System.out.println( "На жаль, у Вас не анаграма" );
//                return false;
//            }
//
//            s1 = s1.replaceFirst( "" + s1.charAt( i ), "" );
//            s2 = s2.replaceFirst( "" + s2.charAt( i ), "" );
//        }
//        System.out.println( "Юхху Ви написали анаграму" );
//        return true;
//
//    }
//}


