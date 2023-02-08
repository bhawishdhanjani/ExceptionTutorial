package ExceptionTutorial;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
    public static void show(){
        try {
            var fileReader = new FileReader("file1.txt");
            System.out.println("File is opened");
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }

    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
