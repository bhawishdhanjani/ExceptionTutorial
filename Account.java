package ExceptionTutorial;

import java.io.IOException;

public class Account {
    private float balance;
    public void deposit(float value) {
        if(value<=0)
            throw new IllegalArgumentException();
    }
    public void withdraw(float value){
        if(value>balance)
            try {
                throw new InsufficientFundException();
            } catch (InsufficientFundException e) {
                System.out.println(e.getMessage());
            }
    }
}
