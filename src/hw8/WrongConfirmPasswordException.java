package hw8;

public class WrongConfirmPasswordException extends  Exception{
    private String confirmPassword;

    public WrongConfirmPasswordException(String повторный_пароль_введен_неверно) {
        this.confirmPassword = confirmPassword;
    }
    public String getConfirmPassword (){
        return confirmPassword;
    }

}
