package hw2;
import java.util.Scanner;

public class Calculator {
        private static Scanner op;
        private static Scanner input;
        private static Scanner cont;

        public static void main(String[] args) {

            double operand1;
            double operand2;
            double ans = 0;
            double l1;
            double l2;
            String sign;
            while (true) {
                input = new Scanner(System.in);
                System.out.println("Введите первое число:");
                operand1 = input.nextDouble();

                System.out.println("Введите второе число:");
                operand2 = input.nextDouble();

                op = new Scanner(System.in);
                System.out.println("Выберите знак операци:");
                sign = op.next();

                if (sign.equals("+")) {
                    System.out.println("Ваш результат :" + (operand1 + operand2));
                }
                if (sign.equals("-")) {
                    System.out.println("Ваш результат:" + (operand1 - operand2));
                }
                if (sign.equals("/")) {
                    if (operand2 == 0) {
                        System.out.println("Не верные данные");
                    } else {
                        System.out.println("Ваш результат :" + (operand1 / operand2));
                    }
                    ;
                }
                if (sign.equals("*")) {
                    System.out.println("Ваш результат:" + (operand1 * operand2));
                }
                if (sign.equals("log")) {
                    l1 = Math.log(operand1);
                    l2 = Math.log(operand2);
                    System.out.println("Ваш результат:" + l1 / l2);
                }
                System.out.println("Выполнить другую операцию?");

                cont = new Scanner(System.in);

                sign = cont.next();


                if (sign.equals("Да")) {

                } else {
                    System.out.println("Спасибо");
                    System.exit(0);
                }
            }
        }
    }

