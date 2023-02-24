package ExceptionTutorial;


public class ExceptionDemo {
    public static void show() {
        var account = new Account();
        try {
            account.withdraw(1);
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
