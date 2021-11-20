package hw8;

public class WrongLoginException extends Throwable {
    private String login;

    public WrongLoginException() {

        this.login=login;
    }
    public String getLogin (){
        return login;
    }
}
