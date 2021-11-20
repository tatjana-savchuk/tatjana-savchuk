package hw2;

import java.util.Random;
import java.util.Scanner;

public class Interval {
    public static void main (String[] args)
    {
        //Setting up the variables
        final int MAX = 88;
        final int MIN = 11;
        int answer, guess = 1;
        String another="Y";

        //Intializing scanner and random
        Scanner scan = new Scanner (System.in);
        Random generator = new Random();
        //play again loop
        while (another.equalsIgnoreCase("Y"))
        {
            //Generate a random number between 11 and 88
            answer = generator.nextInt(MAX-MIN)+11;

            System.out.print ("Guess the number I picked between "+MIN+" and "
                    + MAX + "!\n");

            while(guess!=answer)
            {
                System.out.println("Enter your guess: ");
                guess = scan.nextInt();
                System.out.println(answer);

                if (guess<answer && guess != 0)
                    System.out.println("Your guess was too low! (0 to exit) ");
                else if (guess>answer)
                    System.out.println("Your guess was too high!(0 to exit) ");
                else if (guess==0){
                    System.out.println("You excited the current round.");
                    break;}
                else{
                    System.out.println("Your guess was correct!");
                    break;}
            }
        }
        //Asking player to play another game
        System.out.println("Do you want to play another game?(Y|N)");
        another = scan.next();
        if (another.equalsIgnoreCase("N"))
            System.out.println("Goodbye, thank you for playing");
    }
}
//public class Interval {
//    public static void main(String[] args) {
//        int points = 0;
//        Scanner scanner = new Scanner( System.in );
//        System.out.println( "Введіть ціле число" );
//        Scanner input = null;
//        points = scanner.nextInt();
//
//        if (points >= 0 && points <= 14) {
//            System.out.println( "Діапазон чисел 0-14" );
//        } else if (points >= 15 && points <= 35) {
//            System.out.println( "Діапазон чисел 15-35" );
//        } else if (points >= 36 && points <= 50) {
//            System.out.println( "Діапазон чисел 36-50" );
//        } else if (points >= 51 && points <= 100) {
//            System.out.println( "Діапазон чисел 51-100" );
//        } else System.out.println(" Діапазаон не знайдено");
//                    }
//                }

