package hw2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Calculator1 {
        public static void main(String[]args) {
            Scanner input = new Scanner(System.in);
            String anotherOption = "y", operatorOpt= "a";
            int operand1=0, operand2=0;
            double sign= 0;
            System.out.println ("Вас вітає Онлайн калькулятор! Починаємо");
            while (anotherOption.equalsIgnoreCase ("y")) {
                System.out.println ("Введіть перше число: ");
                operand1 = input.nextInt();
                System.out.println ("Введіть знак арифметичної операції:\n+\n- \n*\n/");
                operatorOpt = input.next ();
                System.out.println ("Введіть друге число: ");
                operand2 = input.nextInt();

                switch(operatorOpt) {
                    case "+":
                        sign=operand1+operand2;
                        break;
                    case "-":
                        sign=operand1-operand2;
                        break;
                    case "*":
                        sign=operand1*operand2;
                        break;
                    case "/":
                        if (operand2 ==0)
                        {
                            System.out.println("Ділити на 0 заборонено");
                        }
                        else
                        {
                            sign =operand1/operand2;
                        }
                        break;
                    default:
                        sign = 0 ;
                        break;
                }
                System.out.println("Відповідь: "+ sign);
                System.out.println("Бажаєте продовжити? y/n ");
                anotherOption=input.next();
            }

        }
    }
