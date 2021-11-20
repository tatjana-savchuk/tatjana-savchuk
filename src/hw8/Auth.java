package hw8;

import java.util.regex.Pattern;

public class Auth {
    private String login;
    private String password;
    private String confirmPassword;
    private String user;

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static void signUp(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException, WrongConfirmPasswordException {
        if (!Pattern.matches( "[a-zA-Z_0-9] {5,20}", login )) {
            throw new WrongLoginException();
        } else if (!Pattern.matches( "[a-zA-Z_0-9] {5,}", password )) {
            throw new WrongPasswordException( "Не корректный пароль" );
        } else if (!password.equals( confirmPassword )) {
            throw new WrongConfirmPasswordException( "Повторный пароль введен неверно" );
        } else {
            System.out.println( "Регистрация успешная" );


        }
    }

    public void signLn (String login,String password) throws WrongLoginException {
        if (this.login == login && this.password== password) {
            System.out.println( "Всё верно" );
        }
        throw  new WrongLoginException ();
    }
}