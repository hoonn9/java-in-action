package javainaction.chap02;

public class Ex2 {

    public static void main(String[] args) {



        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        });

        Thread t2 = new Thread(() -> System.out.println("Hello World!"));
    }
}
