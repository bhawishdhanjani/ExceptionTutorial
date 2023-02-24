package ExceptionTutorial;


public class ExceptionDemo {
    public static void show() {
        var account = new Account();
        try {
            account.withdraw(1);
        } catch (AccountException e) {
            var  cause = e.getCause();
            System.out.println(cause.getMessage());
        }

    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
