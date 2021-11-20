package hw8;

public class WrongPasswordException extends Exception{
    private String password;
    public WrongPasswordException(String не_корректный_пароль) {
        this.password = password;
    }
    public String getPassword (){
        return password;
    }

}
