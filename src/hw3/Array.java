package hw3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SplittableRandom;


public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.println( "Заполните размер массива" );
        int arr[] = new int[10];//создаем  массив размером 10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();// заполняем массив с клавиатуры
        }
        System.out.println( "Заполненый массив" );
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = temp;
            }
    }
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " " );// Выводим заполненый массив на экран
        }
        System.out.println();

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {  // находим нечетные элементы
                num++;
            }
        }
        System.out.println( "Количество элементов больше нуля  =  " + num );
        int minNumber = arr[0];

        int maxNumber = arr[1];

        for (int i = 0; i < arr.length; i++) maxNumber = Math.max( maxNumber, arr[i] );

        for (int i = 0; i < arr.length; i++) minNumber = Math.min( minNumber, arr[i] );


        {

            double average = 0;

            if (arr.length > 0) {

                double sum = 0;

                for (int j = 0; j < arr.length; j++) {

                    sum += arr[j];

                }

                average = sum / arr.length;

            }

            System.out.println( ("\nМаксимальное число = " + maxNumber + "\nМинимальное число = " + minNumber + "\nСреднееарифметическое = " + average) );

        }

    }
}
