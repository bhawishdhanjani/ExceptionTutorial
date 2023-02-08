package ExceptionTutorial;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void show(){
        try {
            var fileReader = new FileReader("file1.txt");
            var value = fileReader.read();
            new SimpleDateFormat().parse("");
            System.out.println("File is opened");
        }
        catch (IOException | ParseException ex){
            System.out.println(ex.getMessage());
        }

    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
