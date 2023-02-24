package ExceptionTutorial;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void show(){
        var account = new Account();
        account.deposit(1);
    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
