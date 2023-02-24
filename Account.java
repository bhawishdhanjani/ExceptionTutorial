package ExceptionTutorial;

import java.io.IOException;

public class Account {
    private float balance;
    public void deposit(float value) {
        if(value<=0)
            throw new IllegalArgumentException();
    }
    public void withdraw(float value) throws AccountException{
        if(value>balance){
            var insufficientFundException = new InsufficientFundException();
            var accountException = new AccountException();
            accountException.initCause(insufficientFundException);
            throw  accountException;
        }

    }
}
