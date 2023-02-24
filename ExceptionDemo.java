package ExceptionTutorial;

import java.io.IOException;

public class ExceptionDemo {
    public static void show() throws IOException{
        var account = new Account();
        try {
            account.deposit(-1);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
