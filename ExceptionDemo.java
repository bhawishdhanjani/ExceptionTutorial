package ExceptionTutorial;


public class ExceptionDemo {
    public static void show() {
        var account = new Account();
        try {
            account.withdraw(1);
        } catch (AccountException e) {
            e.printStackTrace();
        }

    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
