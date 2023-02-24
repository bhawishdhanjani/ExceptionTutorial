package ExceptionTutorial;

public class InsufficientFundException extends Exception{
    public InsufficientFundException(){
        super("Insufficient Fund is in your account");
    }
    public InsufficientFundException(String message){
        super(message);
    }

}
