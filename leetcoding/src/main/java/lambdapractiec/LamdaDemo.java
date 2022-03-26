package lambdapractiec;

public class LamdaDemo {

    public static void main(String[] args) {
        //Without Lamda
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

               System.out.println("Thread Without Lamda ");
            }
        });
        //With Lamda
        Thread t1 = new Thread(() -> System.out.println("My First Thread")

        );

        t.run();
        t1.run();
    }
}
