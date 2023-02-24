package ExceptionTutorial;

import java.io.IOException;

public class ExceptionDemo {
    public static void show() {
        var account = new Account();
        account.withdraw(1);

    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
