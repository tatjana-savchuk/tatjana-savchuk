package hw8;

import java.util.Scanner;

public class OnlineShop extends Auth {
    private String login;
    private String user;
    private String confirmPassword;

    public OnlineShop(String login, String password) {
        super( login, password );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Введите логин, от 5 символов" );
        String login = scanner.nextLine();
        System.out.print( "Введите пароль, от 5 символов" );
        String password = scanner.nextLine();
        System.out.print( "Повторите пароль" );
        String confirmPassword = scanner.nextLine();
        OnlineShop OnlineShop = new OnlineShop( login, password );
        try {
            OnlineShop.signUp( login, password, confirmPassword );
        } catch (WrongLoginException e |WrongPasswordException e1){
            e1.printStackTrace();
            try {
            } catch (WrongPasswordException e1) {
                System.out.println( "Не верній формат пароля" );
            } catch (WrongConfirmPasswordException e1) {
                e1.printStackTrace();
            }
        }
    }
}
