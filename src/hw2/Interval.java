package hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int points = 0;
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Введіть ціле число" );
        Scanner input = null;
        points = scanner.nextInt();

        if (points >= 0 && points <= 14) {
            System.out.println( "Діапазон чисел 0-14" );
        } else if (points >= 15 && points <= 35) {
            System.out.println( "Діапазон чисел 15-35" );
        } else if (points >= 36 && points <= 50) {
            System.out.println( "Діапазон чисел 36-50" );
        } else if (points >= 51 && points <= 100) {
            System.out.println( "Діапазон чисел 51-100" );
        } else System.out.println(" Діапазаон не знайдено");
                    }
                }

