package hw3;
    /*
GuessANumber.java
*/
import java.util.Scanner;
import java.lang.Math;


public class Bingo {

    public static void main(String[] args) {
        int UnknownNumber, UserNumber, TrysCount = 0;
        String anotherOption;
        Scanner input = new Scanner( System.in );
        System.out.println( "ЗАДАЧА: Угадать число (от 0 до 100)." );
        UnknownNumber = (int) Math.floor( Math.random() * 100 );
        do {
            TrysCount++;
            System.out.print( "Введите ваше число: \nили число больше 100 для выхода" );
            UserNumber = input.nextInt();
            if (UserNumber > 100) {
                System.out.println( "Игра окончена" );
                break;
            }
                if (UserNumber > UnknownNumber)
                    System.out.println( "Моё число меньше." );
                else if (UserNumber < UnknownNumber) System.out.println( "Моё число больше." );
                else System.out.println( "Вы угадали!" );
        }while (UserNumber != UnknownNumber) ;
                System.out.println( "Количество попыток: " + TrysCount );

        }
    }
