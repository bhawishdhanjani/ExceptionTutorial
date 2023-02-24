package ExceptionTutorial;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            ExceptionDemo.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
